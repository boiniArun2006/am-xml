package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.util.TraceUtil;
import java.nio.ByteBuffer;
import t1.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f57945O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediaCodec f57946n;
    private final boolean nr;
    private final Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f57947t;

    public static final class Factory implements MediaCodecAdapter.Factory {
        private final UGc callbackThreadSupplier;
        private final UGc queueingThreadSupplier;
        private final boolean synchronizeCodecInteractionsWithQueueing;

        public Factory(final int i2, boolean z2) {
            this(new UGc() { // from class: com.google.android.exoplayer2.mediacodec.n
                @Override // t1.UGc
                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.n(i2);
                }
            }, new UGc() { // from class: com.google.android.exoplayer2.mediacodec.w6
                @Override // t1.UGc
                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.rl(i2);
                }
            }, z2);
        }

        @VisibleForTesting
        Factory(UGc uGc, UGc uGc2, boolean z2) {
            this.callbackThreadSupplier = uGc;
            this.queueingThreadSupplier = uGc2;
            this.synchronizeCodecInteractionsWithQueueing = z2;
        }

        public static /* synthetic */ HandlerThread n(int i2) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.O(i2));
        }

        public static /* synthetic */ HandlerThread rl(int i2) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.J2(i2));
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        public AsynchronousMediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter;
            String str = configuration.codecInfo.name;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = null;
            try {
                TraceUtil.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    asynchronousMediaCodecAdapter = new AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, (HandlerThread) this.callbackThreadSupplier.get(), (HandlerThread) this.queueingThreadSupplier.get(), this.synchronizeCodecInteractionsWithQueueing);
                } catch (Exception e2) {
                    exc = e2;
                }
            } catch (Exception e3) {
                exc = e3;
                mediaCodecCreateByCodecName = null;
            }
            try {
                TraceUtil.endSection();
                asynchronousMediaCodecAdapter.KN(configuration.mediaFormat, configuration.surface, configuration.crypto, configuration.flags);
                return asynchronousMediaCodecAdapter;
            } catch (Exception e4) {
                exc = e4;
                asynchronousMediaCodecAdapter2 = asynchronousMediaCodecAdapter;
                if (asynchronousMediaCodecAdapter2 != null) {
                    asynchronousMediaCodecAdapter2.release();
                    throw exc;
                }
                if (mediaCodecCreateByCodecName == null) {
                    throw exc;
                }
                mediaCodecCreateByCodecName.release();
                throw exc;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void release() {
        try {
            if (this.J2 == 1) {
                this.f57947t.ck();
                this.rl.HI();
            }
            this.J2 = 2;
            if (this.f57945O) {
                return;
            }
            this.f57946n.release();
            this.f57945O = true;
        } catch (Throwable th) {
            if (!this.f57945O) {
                this.f57946n.release();
                this.f57945O = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i2, boolean z2) {
        this.f57946n.releaseOutputBuffer(i2, z2);
    }

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z2) {
        this.f57946n = mediaCodec;
        this.rl = new Wre(handlerThread);
        this.f57947t = new Ml(mediaCodec, handlerThread2);
        this.nr = z2;
        this.J2 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String J2(int i2) {
        return Uo(i2, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KN(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2) {
        this.rl.KN(this.f57946n);
        TraceUtil.beginSection("configureCodec");
        this.f57946n.configure(mediaFormat, surface, mediaCrypto, i2);
        TraceUtil.endSection();
        this.f57947t.Ik();
        TraceUtil.beginSection("startCodec");
        this.f57946n.start();
        TraceUtil.endSection();
        this.J2 = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String O(int i2) {
        return Uo(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    private static String Uo(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }

    private void xMQ() {
        if (this.nr) {
            try {
                this.f57947t.r();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.rl.t();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        return this.rl.nr(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void flush() {
        this.f57947t.xMQ();
        this.f57946n.flush();
        this.rl.O();
        this.f57946n.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public ByteBuffer getInputBuffer(int i2) {
        return this.f57946n.getInputBuffer(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public ByteBuffer getOutputBuffer(int i2) {
        return this.f57946n.getOutputBuffer(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.rl.Uo();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i2, int i3, int i5, long j2, int i7) {
        this.f57947t.az(i2, i3, i5, j2, i7);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i2, int i3, CryptoInfo cryptoInfo, long j2, int i5) {
        this.f57947t.ty(i2, i3, cryptoInfo, j2, i5);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i2, long j2) {
        this.f57946n.releaseOutputBuffer(i2, j2);
    }

    public static /* synthetic */ void n(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j2, long j3) {
        asynchronousMediaCodecAdapter.getClass();
        onFrameRenderedListener.onFrameRendered(asynchronousMediaCodecAdapter, j2, j3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public PersistableBundle getMetrics() {
        xMQ();
        return this.f57946n.getMetrics();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        xMQ();
        this.f57946n.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.j
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
                AsynchronousMediaCodecAdapter.n(this.f57973n, onFrameRenderedListener, mediaCodec, j2, j3);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOutputSurface(Surface surface) {
        xMQ();
        this.f57946n.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        xMQ();
        this.f57946n.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i2) {
        xMQ();
        this.f57946n.setVideoScalingMode(i2);
    }
}
