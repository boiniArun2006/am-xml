package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class DefaultMediaClock implements MediaClock {
    private MediaClock J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Renderer f57370O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final StandaloneMediaClock f57371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f57372o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f57373r = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final PlaybackParametersListener f57374t;

    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);
    }

    public void J2() {
        this.f57372o = false;
        this.f57371n.stop();
    }

    public void O() {
        this.f57372o = true;
        this.f57371n.start();
    }

    private boolean nr(boolean z2) {
        Renderer renderer = this.f57370O;
        if (renderer == null || renderer.isEnded()) {
            return true;
        }
        if (this.f57370O.isReady()) {
            return false;
        }
        return z2 || this.f57370O.hasReadStreamToEnd();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        MediaClock mediaClock = this.J2;
        return mediaClock != null ? mediaClock.getPlaybackParameters() : this.f57371n.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
        return this.f57373r ? this.f57371n.getPositionUs() : ((MediaClock) Assertions.checkNotNull(this.J2)).getPositionUs();
    }

    public void n(Renderer renderer) {
        if (renderer == this.f57370O) {
            this.J2 = null;
            this.f57370O = null;
            this.f57373r = true;
        }
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.J2;
        if (mediaClock != null) {
            mediaClock.setPlaybackParameters(playbackParameters);
            playbackParameters = this.J2.getPlaybackParameters();
        }
        this.f57371n.setPlaybackParameters(playbackParameters);
    }

    public void t(long j2) {
        this.f57371n.resetPosition(j2);
    }

    public DefaultMediaClock(PlaybackParametersListener playbackParametersListener, Clock clock) {
        this.f57374t = playbackParametersListener;
        this.f57371n = new StandaloneMediaClock(clock);
    }

    private void KN(boolean z2) {
        if (nr(z2)) {
            this.f57373r = true;
            if (this.f57372o) {
                this.f57371n.start();
                return;
            }
            return;
        }
        MediaClock mediaClock = (MediaClock) Assertions.checkNotNull(this.J2);
        long positionUs = mediaClock.getPositionUs();
        if (this.f57373r) {
            if (positionUs < this.f57371n.getPositionUs()) {
                this.f57371n.stop();
                return;
            } else {
                this.f57373r = false;
                if (this.f57372o) {
                    this.f57371n.start();
                }
            }
        }
        this.f57371n.resetPosition(positionUs);
        PlaybackParameters playbackParameters = mediaClock.getPlaybackParameters();
        if (!playbackParameters.equals(this.f57371n.getPlaybackParameters())) {
            this.f57371n.setPlaybackParameters(playbackParameters);
            this.f57374t.onPlaybackParametersChanged(playbackParameters);
        }
    }

    public long Uo(boolean z2) {
        KN(z2);
        return getPositionUs();
    }

    public void rl(Renderer renderer) throws ExoPlaybackException {
        MediaClock mediaClock;
        MediaClock mediaClock2 = renderer.getMediaClock();
        if (mediaClock2 != null && mediaClock2 != (mediaClock = this.J2)) {
            if (mediaClock == null) {
                this.J2 = mediaClock2;
                this.f57370O = renderer;
                mediaClock2.setPlaybackParameters(this.f57371n.getPlaybackParameters());
                return;
            }
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }
}
