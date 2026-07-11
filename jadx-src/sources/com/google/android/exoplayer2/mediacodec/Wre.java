package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Wre extends MediaCodec.Callback {
    private MediaFormat KN;
    private IllegalStateException az;
    private long gh;
    private MediaCodec.CodecException mUb;
    private boolean qie;
    private final HandlerThread rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Handler f57969t;
    private MediaFormat xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f57968n = new Object();
    private final Dsr nr = new Dsr();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Dsr f57967O = new Dsr();
    private final ArrayDeque J2 = new ArrayDeque();
    private final ArrayDeque Uo = new ArrayDeque();

    private void J2() {
        if (!this.Uo.isEmpty()) {
            this.xMQ = (MediaFormat) this.Uo.getLast();
        }
        this.nr.rl();
        this.f57967O.rl();
        this.J2.clear();
        this.Uo.clear();
        this.mUb = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az() {
        synchronized (this.f57968n) {
            try {
                if (this.qie) {
                    return;
                }
                long j2 = this.gh - 1;
                this.gh = j2;
                if (j2 > 0) {
                    return;
                }
                if (j2 < 0) {
                    ty(new IllegalStateException());
                } else {
                    J2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void gh() {
        IllegalStateException illegalStateException = this.az;
        if (illegalStateException == null) {
            return;
        }
        this.az = null;
        throw illegalStateException;
    }

    private void qie() {
        MediaCodec.CodecException codecException = this.mUb;
        if (codecException == null) {
            return;
        }
        this.mUb = null;
        throw codecException;
    }

    private void rl(MediaFormat mediaFormat) {
        this.f57967O.n(-2);
        this.Uo.add(mediaFormat);
    }

    private void ty(IllegalStateException illegalStateException) {
        synchronized (this.f57968n) {
            this.az = illegalStateException;
        }
    }

    private boolean xMQ() {
        return this.gh > 0 || this.qie;
    }

    public void HI() {
        synchronized (this.f57968n) {
            this.qie = true;
            this.rl.quit();
            J2();
        }
    }

    public void KN(MediaCodec mediaCodec) {
        Assertions.checkState(this.f57969t == null);
        this.rl.start();
        Handler handler = new Handler(this.rl.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f57969t = handler;
    }

    public void O() {
        synchronized (this.f57968n) {
            this.gh++;
            ((Handler) Util.castNonNull(this.f57969t)).post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.I28
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57955n.az();
                }
            });
        }
    }

    public MediaFormat Uo() {
        MediaFormat mediaFormat;
        synchronized (this.f57968n) {
            try {
                mediaFormat = this.KN;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public int nr(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f57968n) {
            try {
                if (xMQ()) {
                    return -1;
                }
                mUb();
                if (this.f57967O.nr()) {
                    return -1;
                }
                int iO = this.f57967O.O();
                if (iO >= 0) {
                    Assertions.checkStateNotNull(this.KN);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.J2.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iO == -2) {
                    this.KN = (MediaFormat) this.Uo.remove();
                }
                return iO;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f57968n) {
            this.mUb = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.f57968n) {
            this.nr.n(i2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f57968n) {
            try {
                MediaFormat mediaFormat = this.xMQ;
                if (mediaFormat != null) {
                    rl(mediaFormat);
                    this.xMQ = null;
                }
                this.f57967O.n(i2);
                this.J2.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f57968n) {
            rl(mediaFormat);
            this.xMQ = null;
        }
    }

    public int t() {
        synchronized (this.f57968n) {
            try {
                int iO = -1;
                if (xMQ()) {
                    return -1;
                }
                mUb();
                if (!this.nr.nr()) {
                    iO = this.nr.O();
                }
                return iO;
            } finally {
            }
        }
    }

    Wre(HandlerThread handlerThread) {
        this.rl = handlerThread;
    }

    private void mUb() {
        gh();
        qie();
    }
}
