package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.exoplayer2.util.CopyOnWriteMultiset;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class DefaultDrmSession implements DrmSession {
    private int HI;
    private HandlerThread Ik;
    private final boolean J2;
    private final HashMap KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f57713O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private byte[] f57714S;
    private final boolean Uo;
    private ExoMediaDrm.KeyRequest WPU;
    private byte[] XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private DrmSession.DrmSessionException f57715Z;
    private ExoMediaDrm.ProvisionRequest aYN;
    final UUID az;
    private int ck;
    private final PlayerId gh;
    private final LoadErrorHandlingPolicy mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f57716n;
    private final ReferenceCountListener nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CryptoConfig f57717o;
    final MediaDrmCallback qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private j f57718r;
    private final ExoMediaDrm rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ProvisioningManager f57719t;
    final w6 ty;
    private final CopyOnWriteMultiset xMQ;

    public interface ProvisioningManager {
        void onProvisionCompleted();

        void onProvisionError(Exception exc, boolean z2);

        void provisionRequired(DefaultDrmSession defaultDrmSession);
    }

    public interface ReferenceCountListener {
        void onReferenceCountDecremented(DefaultDrmSession defaultDrmSession, int i2);

        void onReferenceCountIncremented(DefaultDrmSession defaultDrmSession, int i2);
    }

    private class j extends Handler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f57720n;

        public synchronized void t() {
            removeCallbacksAndMessages(null);
            this.f57720n = true;
        }

        public j(Looper looper) {
            super(looper);
        }

        private boolean n(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            n nVar = (n) message.obj;
            if (!nVar.rl) {
                return false;
            }
            int i2 = nVar.f57721O + 1;
            nVar.f57721O = i2;
            if (i2 > DefaultDrmSession.this.mUb.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            long retryDelayMsFor = DefaultDrmSession.this.mUb.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(new LoadEventInfo(nVar.f57722n, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - nVar.f57723t, mediaDrmCallbackException.bytesLoaded), new MediaLoadData(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), nVar.f57721O));
            if (retryDelayMsFor == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f57720n) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), retryDelayMsFor);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objExecuteProvisionRequest;
            n nVar = (n) message.obj;
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objExecuteProvisionRequest = defaultDrmSession.qie.executeProvisionRequest(defaultDrmSession.az, (ExoMediaDrm.ProvisionRequest) nVar.nr);
                } else {
                    if (i2 != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    objExecuteProvisionRequest = defaultDrmSession2.qie.executeKeyRequest(defaultDrmSession2.az, (ExoMediaDrm.KeyRequest) nVar.nr);
                }
            } catch (MediaDrmCallbackException e2) {
                boolean zN = n(message, e2);
                objExecuteProvisionRequest = e2;
                if (zN) {
                    return;
                }
            } catch (Exception e3) {
                Log.w("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e3);
                objExecuteProvisionRequest = e3;
            }
            DefaultDrmSession.this.mUb.onLoadTaskConcluded(nVar.f57722n);
            synchronized (this) {
                try {
                    if (!this.f57720n) {
                        DefaultDrmSession.this.ty.obtainMessage(message.what, Pair.create(nVar.nr, objExecuteProvisionRequest)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        void rl(int i2, Object obj, boolean z2) {
            obtainMessage(i2, new n(LoadEventInfo.getNewId(), z2, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }
    }

    private class w6 extends Handler {
        public w6(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i2 = message.what;
            if (i2 == 0) {
                DefaultDrmSession.this.r(obj, obj2);
            } else {
                if (i2 != 1) {
                    return;
                }
                DefaultDrmSession.this.qie(obj, obj2);
            }
        }
    }

    private boolean S() {
        try {
            this.rl.restoreKeys(this.XQ, this.f57714S);
            return true;
        } catch (Exception e2) {
            gh(e2, 1);
            return false;
        }
    }

    private void Z(byte[] bArr, int i2, boolean z2) {
        try {
            this.WPU = this.rl.getKeyRequest(bArr, this.f57716n, i2, this.KN);
            ((j) Util.castNonNull(this.f57718r)).rl(1, Assertions.checkNotNull(this.WPU), z2);
        } catch (Exception e2) {
            az(e2, true);
        }
    }

    public void HI(int i2) {
        if (i2 != 2) {
            return;
        }
        ty();
    }

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@Nullable Throwable th) {
            super(th);
        }
    }

    private static final class n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f57721O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f57722n;
        public final Object nr;
        public final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f57723t;

        public n(long j2, boolean z2, long j3, Object obj) {
            this.f57722n = j2;
            this.rl = z2;
            this.f57723t = j3;
            this.nr = obj;
        }
    }

    private void J2(Consumer consumer) {
        Iterator it = this.xMQ.elementSet().iterator();
        while (it.hasNext()) {
            consumer.accept((DrmSessionEventListener.EventDispatcher) it.next());
        }
    }

    private long KN() {
        if (!com.google.android.exoplayer2.C.WIDEVINE_UUID.equals(this.az)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private void Uo(boolean z2) {
        if (this.Uo) {
            return;
        }
        byte[] bArr = (byte[]) Util.castNonNull(this.XQ);
        int i2 = this.f57713O;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                if (this.f57714S == null || S()) {
                    Z(bArr, 2, z2);
                    return;
                }
                return;
            }
            if (i2 != 3) {
                return;
            }
            Assertions.checkNotNull(this.f57714S);
            Assertions.checkNotNull(this.XQ);
            Z(this.f57714S, 3, z2);
            return;
        }
        if (this.f57714S == null) {
            Z(bArr, 1, z2);
            return;
        }
        if (this.HI == 4 || S()) {
            long jKN = KN();
            if (this.f57713O != 0 || jKN > 60) {
                if (jKN <= 0) {
                    gh(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.HI = 4;
                    J2(new Consumer() { // from class: com.google.android.exoplayer2.drm.w6
                        @Override // com.google.android.exoplayer2.util.Consumer
                        public final void accept(Object obj) {
                            ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRestored();
                        }
                    });
                    return;
                }
            }
            Log.d("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jKN);
            Z(bArr, 2, z2);
        }
    }

    private void az(Exception exc, boolean z2) {
        if (exc instanceof NotProvisionedException) {
            this.f57719t.provisionRequired(this);
        } else {
            gh(exc, z2 ? 1 : 2);
        }
    }

    private void gh(final Exception exc, int i2) {
        this.f57715Z = new DrmSession.DrmSessionException(exc, DrmUtil.getErrorCodeForMediaDrmException(exc, i2));
        Log.e("DefaultDrmSession", "DRM session error", exc);
        J2(new Consumer() { // from class: com.google.android.exoplayer2.drm.Ml
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                ((DrmSessionEventListener.EventDispatcher) obj).drmSessionManagerError(exc);
            }
        });
        if (this.HI != 4) {
            this.HI = 1;
        }
    }

    private boolean mUb() {
        int i2 = this.HI;
        return i2 == 3 || i2 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qie(Object obj, Object obj2) {
        if (obj == this.WPU && mUb()) {
            this.WPU = null;
            if (obj2 instanceof Exception) {
                az((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f57713O == 3) {
                    this.rl.provideKeyResponse((byte[]) Util.castNonNull(this.f57714S), bArr);
                    J2(new Consumer() { // from class: com.google.android.exoplayer2.drm.I28
                        @Override // com.google.android.exoplayer2.util.Consumer
                        public final void accept(Object obj3) {
                            ((DrmSessionEventListener.EventDispatcher) obj3).drmKeysRemoved();
                        }
                    });
                    return;
                }
                byte[] bArrProvideKeyResponse = this.rl.provideKeyResponse(this.XQ, bArr);
                int i2 = this.f57713O;
                if ((i2 == 2 || (i2 == 0 && this.f57714S != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.f57714S = bArrProvideKeyResponse;
                }
                this.HI = 4;
                J2(new Consumer() { // from class: com.google.android.exoplayer2.drm.Wre
                    @Override // com.google.android.exoplayer2.util.Consumer
                    public final void accept(Object obj3) {
                        ((DrmSessionEventListener.EventDispatcher) obj3).drmKeysLoaded();
                    }
                });
            } catch (Exception e2) {
                az(e2, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(Object obj, Object obj2) {
        if (obj == this.aYN) {
            if (this.HI == 2 || mUb()) {
                this.aYN = null;
                if (obj2 instanceof Exception) {
                    this.f57719t.onProvisionError((Exception) obj2, false);
                    return;
                }
                try {
                    this.rl.provideProvisionResponse((byte[]) obj2);
                    this.f57719t.onProvisionCompleted();
                } catch (Exception e2) {
                    this.f57719t.onProvisionError(e2, true);
                }
            }
        }
    }

    private void ty() {
        if (this.f57713O == 0 && this.HI == 4) {
            Util.castNonNull(this.XQ);
            Uo(false);
        }
    }

    public void Ik(Exception exc, boolean z2) {
        gh(exc, z2 ? 1 : 3);
    }

    public void XQ() {
        this.aYN = this.rl.getProvisionRequest();
        ((j) Util.castNonNull(this.f57718r)).rl(0, Assertions.checkNotNull(this.aYN), true);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        if (this.ck < 0) {
            Log.e("DefaultDrmSession", "Session reference count less than zero: " + this.ck);
            this.ck = 0;
        }
        if (eventDispatcher != null) {
            this.xMQ.add(eventDispatcher);
        }
        int i2 = this.ck + 1;
        this.ck = i2;
        if (i2 == 1) {
            Assertions.checkState(this.HI == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.Ik = handlerThread;
            handlerThread.start();
            this.f57718r = new j(this.Ik.getLooper());
            if (o()) {
                Uo(true);
            }
        } else if (eventDispatcher != null && mUb() && this.xMQ.count(eventDispatcher) == 1) {
            eventDispatcher.drmSessionAcquired(this.HI);
        }
        this.nr.onReferenceCountIncremented(this, this.ck);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final CryptoConfig getCryptoConfig() {
        return this.f57717o;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        if (this.HI == 1) {
            return this.f57715Z;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public byte[] getOfflineLicenseKeySetId() {
        return this.f57714S;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID getSchemeUuid() {
        return this.az;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.HI;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return this.J2;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map queryKeyStatus() {
        byte[] bArr = this.XQ;
        if (bArr == null) {
            return null;
        }
        return this.rl.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int i2 = this.ck;
        if (i2 <= 0) {
            Log.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.ck = i3;
        if (i3 == 0) {
            this.HI = 0;
            ((w6) Util.castNonNull(this.ty)).removeCallbacksAndMessages(null);
            ((j) Util.castNonNull(this.f57718r)).t();
            this.f57718r = null;
            ((HandlerThread) Util.castNonNull(this.Ik)).quit();
            this.Ik = null;
            this.f57717o = null;
            this.f57715Z = null;
            this.WPU = null;
            this.aYN = null;
            byte[] bArr = this.XQ;
            if (bArr != null) {
                this.rl.closeSession(bArr);
                this.XQ = null;
            }
        }
        if (eventDispatcher != null) {
            this.xMQ.remove(eventDispatcher);
            if (this.xMQ.count(eventDispatcher) == 0) {
                eventDispatcher.drmSessionReleased();
            }
        }
        this.nr.onReferenceCountDecremented(this, this.ck);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean requiresSecureDecoder(String str) {
        return this.rl.requiresSecureDecoder((byte[]) Assertions.checkStateNotNull(this.XQ), str);
    }

    public boolean xMQ(byte[] bArr) {
        return Arrays.equals(this.XQ, bArr);
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, ProvisioningManager provisioningManager, ReferenceCountListener referenceCountListener, List list, int i2, boolean z2, boolean z3, byte[] bArr, HashMap map, MediaDrmCallback mediaDrmCallback, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy, PlayerId playerId) {
        if (i2 == 1 || i2 == 3) {
            Assertions.checkNotNull(bArr);
        }
        this.az = uuid;
        this.f57719t = provisioningManager;
        this.nr = referenceCountListener;
        this.rl = exoMediaDrm;
        this.f57713O = i2;
        this.J2 = z2;
        this.Uo = z3;
        if (bArr != null) {
            this.f57714S = bArr;
            this.f57716n = null;
        } else {
            this.f57716n = Collections.unmodifiableList((List) Assertions.checkNotNull(list));
        }
        this.KN = map;
        this.qie = mediaDrmCallback;
        this.xMQ = new CopyOnWriteMultiset();
        this.mUb = loadErrorHandlingPolicy;
        this.gh = playerId;
        this.HI = 2;
        this.ty = new w6(looper);
    }

    private boolean o() {
        if (mUb()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.rl.openSession();
            this.XQ = bArrOpenSession;
            this.rl.setPlayerIdForSession(bArrOpenSession, this.gh);
            this.f57717o = this.rl.createCryptoConfig(this.XQ);
            final int i2 = 3;
            this.HI = 3;
            J2(new Consumer() { // from class: com.google.android.exoplayer2.drm.n
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    ((DrmSessionEventListener.EventDispatcher) obj).drmSessionAcquired(i2);
                }
            });
            Assertions.checkNotNull(this.XQ);
            return true;
        } catch (NotProvisionedException unused) {
            this.f57719t.provisionRequired(this);
            return false;
        } catch (Exception e2) {
            gh(e2, 1);
            return false;
        }
    }

    public void ck() {
        if (o()) {
            Uo(true);
        }
    }
}
