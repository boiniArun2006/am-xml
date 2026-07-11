package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UnknownNull;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    private final HashMap<T, n> childSources = new HashMap<>();

    @Nullable
    private Handler eventHandler;

    @Nullable
    private TransferListener mediaTransferListener;

    private final class j implements MediaSourceEventListener, DrmSessionEventListener {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private DrmSessionEventListener.EventDispatcher f58071O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f58072n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private MediaSourceEventListener.EventDispatcher f58073t;

        public j(Object obj) {
            this.f58073t = CompositeMediaSource.this.createEventDispatcher(null);
            this.f58071O = CompositeMediaSource.this.createDrmEventDispatcher(null);
            this.f58072n = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private boolean n(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId;
            if (mediaPeriodId != null) {
                mediaPeriodIdForChildMediaPeriodId = CompositeMediaSource.this.getMediaPeriodIdForChildMediaPeriodId(this.f58072n, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return false;
                }
            } else {
                mediaPeriodIdForChildMediaPeriodId = null;
            }
            int windowIndexForChildWindowIndex = CompositeMediaSource.this.getWindowIndexForChildWindowIndex(this.f58072n, i2);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.f58073t;
            if (eventDispatcher.windowIndex != windowIndexForChildWindowIndex || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                this.f58073t = CompositeMediaSource.this.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId, 0L);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.f58071O;
            if (eventDispatcher2.windowIndex == windowIndexForChildWindowIndex && Util.areEqual(eventDispatcher2.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                return true;
            }
            this.f58071O = CompositeMediaSource.this.createDrmEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private MediaLoadData rl(MediaLoadData mediaLoadData) {
            long mediaTimeForChildMediaTime = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f58072n, mediaLoadData.mediaStartTimeMs);
            long mediaTimeForChildMediaTime2 = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f58072n, mediaLoadData.mediaEndTimeMs);
            return (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) ? mediaLoadData : new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (n(i2, mediaPeriodId)) {
                this.f58073t.downstreamFormatChanged(rl(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (n(i2, mediaPeriodId)) {
                this.f58071O.drmKeysLoaded();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (n(i2, mediaPeriodId)) {
                this.f58071O.drmKeysRemoved();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (n(i2, mediaPeriodId)) {
                this.f58071O.drmKeysRestored();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
            if (n(i2, mediaPeriodId)) {
                this.f58071O.drmSessionAcquired(i3);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            if (n(i2, mediaPeriodId)) {
                this.f58071O.drmSessionManagerError(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (n(i2, mediaPeriodId)) {
                this.f58071O.drmSessionReleased();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (n(i2, mediaPeriodId)) {
                this.f58073t.loadCanceled(loadEventInfo, rl(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (n(i2, mediaPeriodId)) {
                this.f58073t.loadCompleted(loadEventInfo, rl(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
            if (n(i2, mediaPeriodId)) {
                this.f58073t.loadError(loadEventInfo, rl(mediaLoadData), iOException, z2);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (n(i2, mediaPeriodId)) {
                this.f58073t.loadStarted(loadEventInfo, rl(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (n(i2, mediaPeriodId)) {
                this.f58073t.upstreamDiscarded(rl(mediaLoadData));
            }
        }
    }

    @Nullable
    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(@UnknownNull T t3, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    protected long getMediaTimeForChildMediaTime(@UnknownNull T t3, long j2) {
        return j2;
    }

    protected int getWindowIndexForChildWindowIndex(@UnknownNull T t3, int i2) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onChildSourceInfoRefreshed(@UnknownNull T t3, MediaSource mediaSource, Timeline timeline);

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final MediaSource f58074n;
        public final MediaSource.MediaSourceCaller rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final j f58075t;

        public n(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, j jVar) {
            this.f58074n = mediaSource;
            this.rl = mediaSourceCaller;
            this.f58075t = jVar;
        }
    }

    protected final void disableChildSource(@UnknownNull T t3) {
        n nVar = (n) Assertions.checkNotNull(this.childSources.get(t3));
        nVar.f58074n.disable(nVar.rl);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    protected void disableInternal() {
        for (n nVar : this.childSources.values()) {
            nVar.f58074n.disable(nVar.rl);
        }
    }

    protected final void enableChildSource(@UnknownNull T t3) {
        n nVar = (n) Assertions.checkNotNull(this.childSources.get(t3));
        nVar.f58074n.enable(nVar.rl);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    protected void enableInternal() {
        for (n nVar : this.childSources.values()) {
            nVar.f58074n.enable(nVar.rl);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<n> it = this.childSources.values().iterator();
        while (it.hasNext()) {
            it.next().f58074n.maybeThrowSourceInfoRefreshError();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void prepareChildSource(@UnknownNull final T t3, MediaSource mediaSource) {
        Assertions.checkArgument(!this.childSources.containsKey(t3));
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: com.google.android.exoplayer2.source.j
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource2, Timeline timeline) {
                this.f58227n.onChildSourceInfoRefreshed(t3, mediaSource2, timeline);
            }
        };
        j jVar = new j(t3);
        this.childSources.put(t3, new n(mediaSource, mediaSourceCaller, jVar));
        mediaSource.addEventListener((Handler) Assertions.checkNotNull(this.eventHandler), jVar);
        mediaSource.addDrmEventListener((Handler) Assertions.checkNotNull(this.eventHandler), jVar);
        mediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener, getPlayerId());
        if (isEnabled()) {
            return;
        }
        mediaSource.disable(mediaSourceCaller);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.eventHandler = Util.createHandlerForCurrentLooper();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void releaseChildSource(@UnknownNull T t3) {
        n nVar = (n) Assertions.checkNotNull(this.childSources.remove(t3));
        nVar.f58074n.releaseSource(nVar.rl);
        nVar.f58074n.removeEventListener(nVar.f58075t);
        nVar.f58074n.removeDrmEventListener(nVar.f58075t);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    protected void releaseSourceInternal() {
        for (n nVar : this.childSources.values()) {
            nVar.f58074n.releaseSource(nVar.rl);
            nVar.f58074n.removeEventListener(nVar.f58075t);
            nVar.f58074n.removeDrmEventListener(nVar.f58075t);
        }
        this.childSources.clear();
    }

    protected CompositeMediaSource() {
    }
}
