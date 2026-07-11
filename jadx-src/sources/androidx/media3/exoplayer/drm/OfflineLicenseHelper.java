package androidx.media3.exoplayer.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public final class OfflineLicenseHelper {
    private static final Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = new Format.Builder().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0])).build();
    private final ConditionVariable drmListenerConditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final Handler handler;
    private final HandlerThread handlerThread;

    public static OfflineLicenseHelper newWidevineInstance(String str, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, factory, eventDispatcher);
    }

    public synchronized byte[] downloadLicense(Format format) throws DrmSession.DrmSessionException {
        Assertions.checkArgument(format.drmInitData != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, format);
    }

    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) throws DrmSession.DrmSessionException {
        final com.google.common.util.concurrent.UGc uGcE2;
        Assertions.checkNotNull(bArr);
        try {
            final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            uGcE2 = com.google.common.util.concurrent.UGc.E2();
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.afx
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineLicenseHelper.O(this.f39605n, uGcE2, drmSessionAcquireFirstSessionOnHandlerThread);
                }
            });
            try {
                try {
                } finally {
                    releaseManagerOnHandlerThread();
                }
            } catch (InterruptedException | ExecutionException e2) {
                throw new IllegalStateException(e2);
            }
        } catch (DrmSession.DrmSessionException e3) {
            if (e3.getCause() instanceof KeysExpiredException) {
                return Pair.create(0L, 0L);
            }
            throw e3;
        }
        return (Pair) uGcE2.get();
    }

    public synchronized void releaseLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public synchronized byte[] renewLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    private DrmSession acquireFirstSessionOnHandlerThread(final int i2, @Nullable final byte[] bArr, final Format format) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(format.drmInitData);
        final com.google.common.util.concurrent.UGc uGcE2 = com.google.common.util.concurrent.UGc.E2();
        this.drmListenerConditionVariable.close();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.Z
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.nr(this.f39599n, i2, bArr, uGcE2, format);
            }
        });
        try {
            final DrmSession drmSession = (DrmSession) uGcE2.get();
            this.drmListenerConditionVariable.block();
            final com.google.common.util.concurrent.UGc uGcE22 = com.google.common.util.concurrent.UGc.E2();
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.Ew
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineLicenseHelper.n(this.f39589n, drmSession, uGcE22);
                }
            });
            try {
                if (uGcE22.get() == null) {
                    return drmSession;
                }
                throw ((DrmSession.DrmSessionException) uGcE22.get());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IllegalStateException(e2);
            }
        } catch (InterruptedException | ExecutionException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z2, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z2, factory, null, eventDispatcher);
    }

    public void release() {
        this.handlerThread.quit();
    }

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new DrmSessionEventListener() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper.1
            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }
        });
    }

    public static /* synthetic */ void O(OfflineLicenseHelper offlineLicenseHelper, com.google.common.util.concurrent.UGc uGc, DrmSession drmSession) {
        offlineLicenseHelper.getClass();
        try {
            uGc.g((Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(drmSession)));
        } catch (Throwable th) {
            try {
                uGc.te(th);
            } finally {
                drmSession.release(offlineLicenseHelper.eventDispatcher);
            }
        }
    }

    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i2, @Nullable byte[] bArr, Format format) throws DrmSession.DrmSessionException {
        final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i2, bArr, format);
        final com.google.common.util.concurrent.UGc uGcE2 = com.google.common.util.concurrent.UGc.E2();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.DAz
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.t(this.f39583n, uGcE2, drmSessionAcquireFirstSessionOnHandlerThread);
            }
        });
        try {
            try {
                return (byte[]) Assertions.checkNotNull((byte[]) uGcE2.get());
            } finally {
                releaseManagerOnHandlerThread();
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static /* synthetic */ void n(OfflineLicenseHelper offlineLicenseHelper, DrmSession drmSession, com.google.common.util.concurrent.UGc uGc) {
        offlineLicenseHelper.getClass();
        try {
            DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(offlineLicenseHelper.eventDispatcher);
                offlineLicenseHelper.drmSessionManager.release();
            }
            uGc.g(error);
        } catch (Throwable th) {
            uGc.te(th);
            drmSession.release(offlineLicenseHelper.eventDispatcher);
            offlineLicenseHelper.drmSessionManager.release();
        }
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z2, DataSource.Factory factory, @Nullable Map<String, String> map, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new OfflineLicenseHelper(new DefaultDrmSessionManager.Builder().setKeyRequestParameters(map).build(new HttpMediaDrmCallback(str, z2, factory)), eventDispatcher);
    }

    public static /* synthetic */ void nr(OfflineLicenseHelper offlineLicenseHelper, int i2, byte[] bArr, com.google.common.util.concurrent.UGc uGc, Format format) {
        offlineLicenseHelper.getClass();
        try {
            offlineLicenseHelper.drmSessionManager.setPlayer((Looper) Assertions.checkNotNull(Looper.myLooper()), PlayerId.UNSET);
            offlineLicenseHelper.drmSessionManager.prepare();
            try {
                offlineLicenseHelper.drmSessionManager.setMode(i2, bArr);
                uGc.g((DrmSession) Assertions.checkNotNull(offlineLicenseHelper.drmSessionManager.acquireSession(offlineLicenseHelper.eventDispatcher, format)));
            } finally {
            }
        } catch (Throwable th) {
            uGc.te(th);
        }
    }

    private void releaseManagerOnHandlerThread() {
        final com.google.common.util.concurrent.UGc uGcE2 = com.google.common.util.concurrent.UGc.E2();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.nKK
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.rl(this.f39609n, uGcE2);
            }
        });
        try {
            uGcE2.get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static /* synthetic */ void rl(OfflineLicenseHelper offlineLicenseHelper, com.google.common.util.concurrent.UGc uGc) {
        offlineLicenseHelper.getClass();
        try {
            offlineLicenseHelper.drmSessionManager.release();
            uGc.g(null);
        } catch (Throwable th) {
            uGc.te(th);
        }
    }

    public static /* synthetic */ void t(OfflineLicenseHelper offlineLicenseHelper, com.google.common.util.concurrent.UGc uGc, DrmSession drmSession) {
        offlineLicenseHelper.getClass();
        try {
            uGc.g(drmSession.getOfflineLicenseKeySetId());
        } catch (Throwable th) {
            try {
                uGc.te(th);
            } finally {
                drmSession.release(offlineLicenseHelper.eventDispatcher);
            }
        }
    }
}
