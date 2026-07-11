package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class RendererHolder {
    static final int RENDERER_PREWARMING_STATE_NOT_PREWARMING_USING_PRIMARY = 0;
    static final int RENDERER_PREWARMING_STATE_NOT_PREWARMING_USING_SECONDARY = 1;
    static final int RENDERER_PREWARMING_STATE_PREWARMING_PRIMARY = 2;
    static final int RENDERER_PREWARMING_STATE_TRANSITIONING_TO_PRIMARY = 4;
    static final int RENDERER_PREWARMING_STATE_TRANSITIONING_TO_SECONDARY = 3;
    static final int REPLACE_STREAMS_DISABLE_RENDERERS_COMPLETED = 1;
    static final int REPLACE_STREAMS_DISABLE_RENDERERS_DISABLE_OFFLOAD_SCHEDULING = 2;
    private final int index;
    private final Renderer primaryRenderer;

    @Nullable
    private final Renderer secondaryRenderer;
    private int prewarmingState = 0;
    private boolean primaryRequiresReset = false;
    private boolean secondaryRequiresReset = false;

    private static Format[] getFormats(@Nullable ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i2 = 0; i2 < length; i2++) {
            formatArr[i2] = ((ExoTrackSelection) Assertions.checkNotNull(exoTrackSelection)).getFormat(i2);
        }
        return formatArr;
    }

    @Nullable
    private Renderer getRendererReadingFromPeriod(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder != null && mediaPeriodHolder.sampleStreams[this.index] != null) {
            if (this.primaryRenderer.getStream() == mediaPeriodHolder.sampleStreams[this.index]) {
                return this.primaryRenderer;
            }
            Renderer renderer = this.secondaryRenderer;
            if (renderer != null && renderer.getStream() == mediaPeriodHolder.sampleStreams[this.index]) {
                return this.secondaryRenderer;
            }
        }
        return null;
    }

    private boolean hasFinishedReadingFromPeriodInternal(MediaPeriodHolder mediaPeriodHolder, @Nullable Renderer renderer) {
        if (renderer == null) {
            return true;
        }
        SampleStream sampleStream = mediaPeriodHolder.sampleStreams[this.index];
        if (renderer.getStream() == null || (renderer.getStream() == sampleStream && (sampleStream == null || renderer.hasReadStreamToEnd() || hasReachedServerSideInsertedAdsTransition(renderer, mediaPeriodHolder)))) {
            return true;
        }
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        return next != null && next.sampleStreams[this.index] == renderer.getStream();
    }

    private void maybeResetRenderer(boolean z2) {
        if (z2) {
            if (this.primaryRequiresReset) {
                this.primaryRenderer.reset();
                this.primaryRequiresReset = false;
                return;
            }
            return;
        }
        if (this.secondaryRequiresReset) {
            ((Renderer) Assertions.checkNotNull(this.secondaryRenderer)).reset();
            this.secondaryRequiresReset = false;
        }
    }

    private int replaceStreamsOrDisableRendererForTransitionInternal(@Nullable Renderer renderer, MediaPeriodHolder mediaPeriodHolder, TrackSelectorResult trackSelectorResult, DefaultMediaClock defaultMediaClock) throws ExoPlaybackException {
        if (renderer == null || !isRendererEnabled(renderer) || ((renderer == this.primaryRenderer && isPrimaryRendererPrewarming()) || (renderer == this.secondaryRenderer && isSecondaryRendererPrewarming()))) {
            return 1;
        }
        SampleStream stream = renderer.getStream();
        SampleStream[] sampleStreamArr = mediaPeriodHolder.sampleStreams;
        int i2 = this.index;
        boolean z2 = stream != sampleStreamArr[i2];
        boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i2);
        if (zIsRendererEnabled && !z2) {
            return 1;
        }
        if (!renderer.isCurrentStreamFinal()) {
            renderer.replaceStream(getFormats(trackSelectorResult.selections[this.index]), (SampleStream) Assertions.checkNotNull(mediaPeriodHolder.sampleStreams[this.index]), mediaPeriodHolder.getStartPositionRendererTime(), mediaPeriodHolder.getRendererOffset(), mediaPeriodHolder.info.id);
            return 3;
        }
        if (!renderer.isEnded()) {
            return 0;
        }
        disableRenderer(renderer, defaultMediaClock);
        if (!zIsRendererEnabled || isPrewarming()) {
            maybeResetRenderer(renderer == this.primaryRenderer);
        }
        return 1;
    }

    public boolean isRendererEnabled() {
        int i2 = this.prewarmingState;
        return (i2 == 0 || i2 == 2 || i2 == 4) ? isRendererEnabled(this.primaryRenderer) : isRendererEnabled((Renderer) Assertions.checkNotNull(this.secondaryRenderer));
    }

    private void disableRenderer(Renderer renderer, DefaultMediaClock defaultMediaClock) {
        Assertions.checkState(this.primaryRenderer == renderer || this.secondaryRenderer == renderer);
        if (isRendererEnabled(renderer)) {
            defaultMediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
        }
    }

    private boolean isPrimaryRendererPrewarming() {
        int i2 = this.prewarmingState;
        return i2 == 2 || i2 == 4;
    }

    private boolean isSecondaryRendererPrewarming() {
        return this.prewarmingState == 3;
    }

    private void transferResources(boolean z2) throws ExoPlaybackException {
        if (z2) {
            ((Renderer) Assertions.checkNotNull(this.secondaryRenderer)).handleMessage(17, this.primaryRenderer);
        } else {
            this.primaryRenderer.handleMessage(17, Assertions.checkNotNull(this.secondaryRenderer));
        }
    }

    public void disable(DefaultMediaClock defaultMediaClock) throws ExoPlaybackException {
        disableRenderer(this.primaryRenderer, defaultMediaClock);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            boolean z2 = isRendererEnabled(renderer) && this.prewarmingState != 3;
            disableRenderer(this.secondaryRenderer, defaultMediaClock);
            maybeResetRenderer(false);
            if (z2) {
                transferResources(true);
            }
        }
        this.prewarmingState = 0;
    }

    public void enable(RendererConfiguration rendererConfiguration, ExoTrackSelection exoTrackSelection, SampleStream sampleStream, long j2, boolean z2, boolean z3, long j3, long j4, MediaSource.MediaPeriodId mediaPeriodId, DefaultMediaClock defaultMediaClock) throws ExoPlaybackException {
        Format[] formats = getFormats(exoTrackSelection);
        int i2 = this.prewarmingState;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            this.primaryRequiresReset = true;
            this.primaryRenderer.enable(rendererConfiguration, formats, sampleStream, j2, z2, z3, j3, j4, mediaPeriodId);
            defaultMediaClock.onRendererEnabled(this.primaryRenderer);
        } else {
            this.secondaryRequiresReset = true;
            ((Renderer) Assertions.checkNotNull(this.secondaryRenderer)).enable(rendererConfiguration, formats, sampleStream, j2, z2, z3, j3, j4, mediaPeriodId);
            defaultMediaClock.onRendererEnabled(this.secondaryRenderer);
        }
    }

    public void enableMayRenderStartOfStream() {
        if (isRendererEnabled(this.primaryRenderer)) {
            this.primaryRenderer.enableMayRenderStartOfStream();
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        this.secondaryRenderer.enableMayRenderStartOfStream();
    }

    public int getEnabledRendererCount() {
        boolean zIsRendererEnabled = isRendererEnabled(this.primaryRenderer);
        Renderer renderer = this.secondaryRenderer;
        return (zIsRendererEnabled ? 1 : 0) + ((renderer == null || !isRendererEnabled(renderer)) ? 0 : 1);
    }

    public long getMinDurationToProgressUs(long j2, long j3) {
        long durationToProgressUs = isRendererEnabled(this.primaryRenderer) ? this.primaryRenderer.getDurationToProgressUs(j2, j3) : Long.MAX_VALUE;
        Renderer renderer = this.secondaryRenderer;
        return (renderer == null || !isRendererEnabled(renderer)) ? durationToProgressUs : Math.min(durationToProgressUs, this.secondaryRenderer.getDurationToProgressUs(j2, j3));
    }

    public int getTrackType() {
        return this.primaryRenderer.getTrackType();
    }

    public boolean hasFinishedReadingFromPeriod(MediaPeriodHolder mediaPeriodHolder) {
        return hasFinishedReadingFromPeriodInternal(mediaPeriodHolder, this.primaryRenderer) && hasFinishedReadingFromPeriodInternal(mediaPeriodHolder, this.secondaryRenderer);
    }

    public boolean hasSecondary() {
        return this.secondaryRenderer != null;
    }

    public boolean isEnded() {
        boolean zIsEnded = isRendererEnabled(this.primaryRenderer) ? this.primaryRenderer.isEnded() : true;
        Renderer renderer = this.secondaryRenderer;
        return (renderer == null || !isRendererEnabled(renderer)) ? zIsEnded : zIsEnded & this.secondaryRenderer.isEnded();
    }

    public void maybeDisableOrResetPosition(SampleStream sampleStream, DefaultMediaClock defaultMediaClock, long j2, boolean z2) throws ExoPlaybackException {
        maybeDisableOrResetPositionInternal(this.primaryRenderer, sampleStream, defaultMediaClock, j2, z2);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            maybeDisableOrResetPositionInternal(renderer, sampleStream, defaultMediaClock, j2, z2);
        }
    }

    public void maybeHandlePrewarmingTransition() throws ExoPlaybackException {
        int i2 = this.prewarmingState;
        if (i2 == 3 || i2 == 4) {
            transferResources(i2 == 4);
            this.prewarmingState = this.prewarmingState != 4 ? 1 : 0;
        } else if (i2 == 2) {
            this.prewarmingState = 0;
        }
    }

    public void maybeSetOldStreamToFinal(TrackSelectorResult trackSelectorResult, TrackSelectorResult trackSelectorResult2, long j2) {
        int i2;
        boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(this.index);
        boolean zIsRendererEnabled2 = trackSelectorResult2.isRendererEnabled(this.index);
        Renderer renderer = (this.secondaryRenderer == null || (i2 = this.prewarmingState) == 3 || (i2 == 0 && isRendererEnabled(this.primaryRenderer))) ? this.primaryRenderer : (Renderer) Assertions.checkNotNull(this.secondaryRenderer);
        if (!zIsRendererEnabled || renderer.isCurrentStreamFinal()) {
            return;
        }
        boolean z2 = getTrackType() == -2;
        RendererConfiguration[] rendererConfigurationArr = trackSelectorResult.rendererConfigurations;
        int i3 = this.index;
        RendererConfiguration rendererConfiguration = rendererConfigurationArr[i3];
        RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i3];
        if (!zIsRendererEnabled2 || !Objects.equals(rendererConfiguration2, rendererConfiguration) || z2 || isPrewarming()) {
            setCurrentStreamFinalInternal(renderer, j2);
        }
    }

    public void release() {
        this.primaryRenderer.release();
        this.primaryRequiresReset = false;
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.release();
            this.secondaryRequiresReset = false;
        }
    }

    public void render(long j2, long j3) throws ExoPlaybackException {
        if (isRendererEnabled(this.primaryRenderer)) {
            this.primaryRenderer.render(j2, j3);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        this.secondaryRenderer.render(j2, j3);
    }

    public int replaceStreamsOrDisableRendererForTransition(MediaPeriodHolder mediaPeriodHolder, TrackSelectorResult trackSelectorResult, DefaultMediaClock defaultMediaClock) throws ExoPlaybackException {
        int iReplaceStreamsOrDisableRendererForTransitionInternal = replaceStreamsOrDisableRendererForTransitionInternal(this.primaryRenderer, mediaPeriodHolder, trackSelectorResult, defaultMediaClock);
        return iReplaceStreamsOrDisableRendererForTransitionInternal == 1 ? replaceStreamsOrDisableRendererForTransitionInternal(this.secondaryRenderer, mediaPeriodHolder, trackSelectorResult, defaultMediaClock) : iReplaceStreamsOrDisableRendererForTransitionInternal;
    }

    public void reset() {
        if (!isRendererEnabled(this.primaryRenderer)) {
            maybeResetRenderer(true);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || isRendererEnabled(renderer)) {
            return;
        }
        maybeResetRenderer(false);
    }

    public void setAllNonPrewarmingRendererStreamsFinal(long j2) {
        int i2;
        if (isRendererEnabled(this.primaryRenderer) && (i2 = this.prewarmingState) != 4 && i2 != 2) {
            setCurrentStreamFinalInternal(this.primaryRenderer, j2);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer) || this.prewarmingState == 3) {
            return;
        }
        setCurrentStreamFinalInternal(this.secondaryRenderer, j2);
    }

    public void setPlaybackSpeed(float f3, float f4) throws ExoPlaybackException {
        this.primaryRenderer.setPlaybackSpeed(f3, f4);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.setPlaybackSpeed(f3, f4);
        }
    }

    public void setTimeline(Timeline timeline) {
        this.primaryRenderer.setTimeline(timeline);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.setTimeline(timeline);
        }
    }

    public void start() throws ExoPlaybackException {
        if (this.primaryRenderer.getState() == 1 && this.prewarmingState != 4) {
            this.primaryRenderer.start();
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || renderer.getState() != 1 || this.prewarmingState == 3) {
            return;
        }
        this.secondaryRenderer.start();
    }

    public void stop() {
        if (isRendererEnabled(this.primaryRenderer)) {
            ensureStopped(this.primaryRenderer);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        ensureStopped(this.secondaryRenderer);
    }

    public RendererHolder(Renderer renderer, @Nullable Renderer renderer2, int i2) {
        this.primaryRenderer = renderer;
        this.index = i2;
        this.secondaryRenderer = renderer2;
    }

    private void ensureStopped(Renderer renderer) {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private boolean hasReachedServerSideInsertedAdsTransition(Renderer renderer, MediaPeriodHolder mediaPeriodHolder) {
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        if (mediaPeriodHolder.info.isFollowedByTransitionToSameStream && next != null && next.prepared) {
            if ((renderer instanceof TextRenderer) || (renderer instanceof MetadataRenderer) || renderer.getReadingPositionUs() >= next.getStartPositionRendererTime()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private void maybeDisableOrResetPositionInternal(Renderer renderer, SampleStream sampleStream, DefaultMediaClock defaultMediaClock, long j2, boolean z2) throws ExoPlaybackException {
        if (isRendererEnabled(renderer)) {
            if (sampleStream != renderer.getStream()) {
                disableRenderer(renderer, defaultMediaClock);
            } else if (z2) {
                renderer.resetPosition(j2);
            }
        }
    }

    private void setCurrentStreamFinalInternal(Renderer renderer, long j2) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j2);
        }
    }

    public boolean allowsPlayback(MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        if (rendererReadingFromPeriod != null && !rendererReadingFromPeriod.hasReadStreamToEnd() && !rendererReadingFromPeriod.isReady() && !rendererReadingFromPeriod.isEnded()) {
            return false;
        }
        return true;
    }

    public void disablePrewarming(DefaultMediaClock defaultMediaClock) {
        boolean z2;
        Renderer renderer;
        if (!isPrewarming()) {
            return;
        }
        int i2 = this.prewarmingState;
        int i3 = 1;
        if (i2 != 4 && i2 != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i2 != 4) {
            i3 = 0;
        }
        if (z2) {
            renderer = this.primaryRenderer;
        } else {
            renderer = (Renderer) Assertions.checkNotNull(this.secondaryRenderer);
        }
        disableRenderer(renderer, defaultMediaClock);
        maybeResetRenderer(z2);
        this.prewarmingState = i3;
    }

    public long getReadingPositionUs(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        Objects.requireNonNull(rendererReadingFromPeriod);
        return rendererReadingFromPeriod.getReadingPositionUs();
    }

    public void handleMessage(int i2, @Nullable Object obj, MediaPeriodHolder mediaPeriodHolder) throws ExoPlaybackException {
        ((Renderer) Assertions.checkNotNull(getRendererReadingFromPeriod(mediaPeriodHolder))).handleMessage(i2, obj);
    }

    public boolean hasReadPeriodToEnd(MediaPeriodHolder mediaPeriodHolder) {
        return ((Renderer) Assertions.checkNotNull(getRendererReadingFromPeriod(mediaPeriodHolder))).hasReadStreamToEnd();
    }

    public boolean isPrewarming() {
        if (!isPrimaryRendererPrewarming() && !isSecondaryRendererPrewarming()) {
            return false;
        }
        return true;
    }

    public boolean isReadingFromPeriod(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        if (getRendererReadingFromPeriod(mediaPeriodHolder) != null) {
            return true;
        }
        return false;
    }

    public boolean isRendererPrewarming(int i2) {
        boolean z2;
        boolean z3;
        if (isPrimaryRendererPrewarming() && i2 == this.index) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (isSecondaryRendererPrewarming() && i2 != this.index) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 && !z3) {
            return false;
        }
        return true;
    }

    public void maybeThrowStreamError(MediaPeriodHolder mediaPeriodHolder) throws IOException {
        ((Renderer) Assertions.checkNotNull(getRendererReadingFromPeriod(mediaPeriodHolder))).maybeThrowStreamError();
    }

    public void resetPosition(MediaPeriodHolder mediaPeriodHolder, long j2) throws ExoPlaybackException {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        if (rendererReadingFromPeriod != null) {
            rendererReadingFromPeriod.resetPosition(j2);
        }
    }

    public void setCurrentStreamFinal(MediaPeriodHolder mediaPeriodHolder, long j2) {
        setCurrentStreamFinalInternal((Renderer) Assertions.checkNotNull(getRendererReadingFromPeriod(mediaPeriodHolder)), j2);
    }

    public void setVideoOutput(@Nullable Object obj) throws ExoPlaybackException {
        if (getTrackType() != 2) {
            return;
        }
        int i2 = this.prewarmingState;
        if (i2 != 4 && i2 != 1) {
            this.primaryRenderer.handleMessage(1, obj);
        } else {
            ((Renderer) Assertions.checkNotNull(this.secondaryRenderer)).handleMessage(1, obj);
        }
    }

    public void setVolume(float f3) throws ExoPlaybackException {
        if (getTrackType() == 1) {
            this.primaryRenderer.handleMessage(2, Float.valueOf(f3));
            Renderer renderer = this.secondaryRenderer;
            if (renderer != null) {
                renderer.handleMessage(2, Float.valueOf(f3));
            }
        }
    }

    public void startPrewarming() {
        int i2;
        Assertions.checkState(!isPrewarming());
        if (isRendererEnabled(this.primaryRenderer)) {
            i2 = 3;
        } else {
            Renderer renderer = this.secondaryRenderer;
            if (renderer != null && isRendererEnabled(renderer)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
        }
        this.prewarmingState = i2;
    }

    private static boolean isRendererEnabled(Renderer renderer) {
        return renderer.getState() != 0;
    }
}
