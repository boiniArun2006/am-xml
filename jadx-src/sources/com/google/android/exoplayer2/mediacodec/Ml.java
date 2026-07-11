package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class Ml {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ConditionVariable f57959O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediaCodec f57960n;
    private final AtomicReference nr;
    private final HandlerThread rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Handler f57961t;
    private static final ArrayDeque Uo = new ArrayDeque();
    private static final Object KN = new Object();

    class j extends Handler {
        j(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Ml.this.J2(message);
        }
    }

    private static class n {
        public int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public long f57963O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f57964n;
        public final MediaCodec.CryptoInfo nr = new MediaCodec.CryptoInfo();
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f57965t;

        public void n(int i2, int i3, int i5, long j2, int i7) {
            this.f57964n = i2;
            this.rl = i3;
            this.f57965t = i5;
            this.f57963O = j2;
            this.J2 = i7;
        }

        n() {
        }
    }

    public Ml(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new ConditionVariable());
    }

    Ml(MediaCodec mediaCodec, HandlerThread handlerThread, ConditionVariable conditionVariable) {
        this.f57960n = mediaCodec;
        this.rl = handlerThread;
        this.f57959O = conditionVariable;
        this.nr = new AtomicReference();
    }

    private static void HI(n nVar) {
        ArrayDeque arrayDeque = Uo;
        synchronized (arrayDeque) {
            arrayDeque.add(nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void J2(Message message) {
        n nVar;
        n nVar2;
        int i2 = message.what;
        if (i2 == 0) {
            nVar = (n) message.obj;
            Uo(nVar.f57964n, nVar.rl, nVar.f57965t, nVar.f57963O, nVar.J2);
        } else {
            if (i2 != 1) {
                nVar2 = null;
                if (i2 != 2) {
                    androidx.compose.animation.core.fuX.n(this.nr, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    this.f57959O.open();
                }
                if (nVar2 == null) {
                    HI(nVar2);
                    return;
                }
                return;
            }
            nVar = (n) message.obj;
            KN(nVar.f57964n, nVar.rl, nVar.nr, nVar.f57963O, nVar.J2);
        }
        nVar2 = nVar;
        if (nVar2 == null) {
        }
    }

    private void KN(int i2, int i3, MediaCodec.CryptoInfo cryptoInfo, long j2, int i5) {
        try {
            synchronized (KN) {
                this.f57960n.queueSecureInputBuffer(i2, i3, cryptoInfo, j2, i5);
            }
        } catch (RuntimeException e2) {
            androidx.compose.animation.core.fuX.n(this.nr, null, e2);
        }
    }

    private static int[] O(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private void Uo(int i2, int i3, int i5, long j2, int i7) {
        try {
            this.f57960n.queueInputBuffer(i2, i3, i5, j2, i7);
        } catch (RuntimeException e2) {
            androidx.compose.animation.core.fuX.n(this.nr, null, e2);
        }
    }

    private static n gh() {
        ArrayDeque arrayDeque = Uo;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new n();
                }
                return (n) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void mUb() throws InterruptedException {
        ((Handler) Assertions.checkNotNull(this.f57961t)).removeCallbacksAndMessages(null);
        rl();
    }

    private static byte[] nr(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void qie() {
        RuntimeException runtimeException = (RuntimeException) this.nr.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    private void rl() throws InterruptedException {
        this.f57959O.close();
        ((Handler) Assertions.checkNotNull(this.f57961t)).obtainMessage(2).sendToTarget();
        this.f57959O.block();
    }

    private static void t(CryptoInfo cryptoInfo, MediaCodec.CryptoInfo cryptoInfo2) {
        cryptoInfo2.numSubSamples = cryptoInfo.numSubSamples;
        cryptoInfo2.numBytesOfClearData = O(cryptoInfo.numBytesOfClearData, cryptoInfo2.numBytesOfClearData);
        cryptoInfo2.numBytesOfEncryptedData = O(cryptoInfo.numBytesOfEncryptedData, cryptoInfo2.numBytesOfEncryptedData);
        cryptoInfo2.key = (byte[]) Assertions.checkNotNull(nr(cryptoInfo.key, cryptoInfo2.key));
        cryptoInfo2.iv = (byte[]) Assertions.checkNotNull(nr(cryptoInfo.iv, cryptoInfo2.iv));
        cryptoInfo2.mode = cryptoInfo.mode;
        if (Util.SDK_INT >= 24) {
            cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
        }
    }

    public void Ik() {
        if (this.J2) {
            return;
        }
        this.rl.start();
        this.f57961t = new j(this.rl.getLooper());
        this.J2 = true;
    }

    public void ck() {
        if (this.J2) {
            xMQ();
            this.rl.quit();
        }
        this.J2 = false;
    }

    public void xMQ() {
        if (this.J2) {
            try {
                mUb();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    public void az(int i2, int i3, int i5, long j2, int i7) {
        qie();
        n nVarGh = gh();
        nVarGh.n(i2, i3, i5, j2, i7);
        ((Handler) Util.castNonNull(this.f57961t)).obtainMessage(0, nVarGh).sendToTarget();
    }

    public void r() throws InterruptedException {
        rl();
    }

    public void ty(int i2, int i3, CryptoInfo cryptoInfo, long j2, int i5) {
        qie();
        n nVarGh = gh();
        nVarGh.n(i2, i3, 0, j2, i5);
        t(cryptoInfo, nVarGh.nr);
        ((Handler) Util.castNonNull(this.f57961t)).obtainMessage(1, nVarGh).sendToTarget();
    }
}
