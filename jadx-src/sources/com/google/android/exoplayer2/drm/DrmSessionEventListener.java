package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface DrmSessionEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<j> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private static final class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Handler f57731n;
            public DrmSessionEventListener rl;

            public j(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.f57731n = handler;
                this.rl = drmSessionEventListener;
            }
        }

        private EventDispatcher(CopyOnWriteArrayList<j> copyOnWriteArrayList, int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i2;
            this.mediaPeriodId = mediaPeriodId;
        }

        public static /* synthetic */ void nr(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i2) {
            drmSessionEventListener.onDrmSessionAcquired(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, i2);
        }

        public void drmKeysLoaded() {
            for (j jVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = jVar.rl;
                Util.postOrRun(jVar.f57731n, new Runnable() { // from class: com.google.android.exoplayer2.drm.qz
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f57749n;
                        drmSessionEventListener.onDrmKeysLoaded(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void drmKeysRemoved() {
            for (j jVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = jVar.rl;
                Util.postOrRun(jVar.f57731n, new Runnable() { // from class: com.google.android.exoplayer2.drm.aC
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f57740n;
                        drmSessionEventListener.onDrmKeysRemoved(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void drmKeysRestored() {
            for (j jVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = jVar.rl;
                Util.postOrRun(jVar.f57731n, new Runnable() { // from class: com.google.android.exoplayer2.drm.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f57709n;
                        drmSessionEventListener.onDrmKeysRestored(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void drmSessionAcquired(final int i2) {
            for (j jVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = jVar.rl;
                Util.postOrRun(jVar.f57731n, new Runnable() { // from class: com.google.android.exoplayer2.drm.Xo
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.nr(this.f57738n, drmSessionEventListener, i2);
                    }
                });
            }
        }

        public void drmSessionManagerError(final Exception exc) {
            for (j jVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = jVar.rl;
                Util.postOrRun(jVar.f57731n, new Runnable() { // from class: com.google.android.exoplayer2.drm.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f57747n;
                        drmSessionEventListener.onDrmSessionManagerError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, exc);
                    }
                });
            }
        }

        public void drmSessionReleased() {
            for (j jVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = jVar.rl;
                Util.postOrRun(jVar.f57731n, new Runnable() { // from class: com.google.android.exoplayer2.drm.Pl
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f57735n;
                        drmSessionEventListener.onDrmSessionReleased(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
            for (j jVar : this.listenerAndHandlers) {
                if (jVar.rl == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(jVar);
                }
            }
        }

        @CheckResult
        public EventDispatcher withParameters(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i2, mediaPeriodId);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new j(handler, drmSessionEventListener));
        }
    }

    default void onDrmKeysLoaded(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRemoved(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRestored(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Deprecated
    default void onDrmSessionAcquired(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionManagerError(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }

    default void onDrmSessionReleased(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionAcquired(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i3) {
    }
}
