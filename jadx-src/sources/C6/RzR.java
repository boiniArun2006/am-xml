package C6;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.collection.CircularArray;
import com.alightcreative.deviceinfo.codectest.EncoderTestException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class RzR {
    private Surface J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Context f733O;
    private boolean Uo;
    private boolean az;
    private final CircularArray gh;
    private MediaFormat mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ew f734n;
    private final MediaCodec.BufferInfo nr;
    private final CircularArray qie;
    private z.mz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MediaCodec f735t;
    private int xMQ;

    public RzR(Ew exportParams, Context context) {
        Intrinsics.checkNotNullParameter(exportParams, "exportParams");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f734n = exportParams;
        this.nr = new MediaCodec.BufferInfo();
        this.f733O = context.getApplicationContext();
        this.gh = new CircularArray(0, 1, null);
        this.qie = new CircularArray(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E2() {
        return "endFrame";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String P5() {
        return "release";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String S(MediaFormat mediaFormat) {
        return "videoEncoder output format changed: " + mediaFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ViF() {
        return "reached end of stream unexpectedly";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String WPU() {
        return "ignoring BUFFER_FLAG_CODEC_CONFIG";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ() {
        return "no output available, spinning to await EOS";
    }

    static /* synthetic */ void Z(RzR rzR, boolean z2, Function0 function0, int i2, Object obj) throws EncoderTestException {
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        rzR.o(z2, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String aYN(RzR rzR) {
        return "sent " + rzR.nr.size + " bytes to output buffer queue";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String bzg() {
        return "init OUT";
    }

    private final ByteBuffer e(int i2) {
        while (!this.qie.nr()) {
            ByteBuffer byteBuffer = (ByteBuffer) this.qie.O();
            if (byteBuffer.capacity() >= i2) {
                return byteBuffer;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(boolean z2) {
        return "drainEncoder(" + z2 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String iF(int i2) {
        return "dequeueOutputBuffer -> " + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jB() {
        return "processEOS";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nY() {
        return "end of stream reached";
    }

    private final void o(final boolean z2, Function0 function0) throws EncoderTestException {
        String str;
        XoT.C.az(this, new Function0() { // from class: C6.FKk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RzR.g(z2);
            }
        });
        boolean z3 = true;
        String str2 = "videoEncoder";
        if (z2) {
            XoT.C.az(this, new Function0() { // from class: C6.Fl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RzR.te();
                }
            });
            MediaCodec mediaCodec = this.f735t;
            if (mediaCodec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoEncoder");
                mediaCodec = null;
            }
            mediaCodec.signalEndOfInputStream();
            this.az = true;
        }
        long jNanoTime = System.nanoTime();
        long jNanoTime2 = System.nanoTime();
        while (true) {
            long j2 = 1000000;
            if ((System.nanoTime() - jNanoTime) / j2 > 30000) {
                throw new EncoderTestException("Drain Timeout", null, 2, null);
            }
            if ((System.nanoTime() - jNanoTime2) / j2 > 8000) {
                throw new EncoderTestException("Drain Activity Timeout", null, 2, null);
            }
            MediaCodec mediaCodec2 = this.f735t;
            if (mediaCodec2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                mediaCodec2 = null;
            }
            final int iDequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(this.nr, 10000L);
            XoT.C.az(this, new Function0() { // from class: C6.R6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RzR.iF(iDequeueOutputBuffer);
                }
            });
            if (iDequeueOutputBuffer == -1) {
                if (!z2) {
                    return;
                } else {
                    XoT.C.az(this, new Function0() { // from class: C6.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RzR.XQ();
                        }
                    });
                }
            } else if (iDequeueOutputBuffer != -2) {
                if (iDequeueOutputBuffer >= 0) {
                    MediaCodec mediaCodec3 = this.f735t;
                    if (mediaCodec3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str2);
                        mediaCodec3 = null;
                    }
                    ByteBuffer outputBuffer = mediaCodec3.getOutputBuffer(iDequeueOutputBuffer);
                    if ((this.nr.flags & 2) != 0) {
                        XoT.C.az(this, new Function0() { // from class: C6.LEl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RzR.WPU();
                            }
                        });
                        this.nr.size = 0;
                    }
                    if (this.nr.size == 0 || outputBuffer == null) {
                        str = str2;
                    } else {
                        if (!s7N()) {
                            throw new EncoderTestException("output hasn't started", null, 2, null);
                        }
                        if (function0 != null) {
                            function0.invoke();
                        }
                        outputBuffer.position(this.nr.offset);
                        MediaCodec.BufferInfo bufferInfo = this.nr;
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        ByteBuffer byteBufferE = e(this.nr.size);
                        byteBufferE.limit(this.nr.size);
                        byteBufferE.rewind();
                        byteBufferE.put(outputBuffer);
                        byteBufferE.rewind();
                        CircularArray circularArray = this.gh;
                        MediaCodec.BufferInfo bufferInfo2 = this.nr;
                        int i2 = bufferInfo2.flags;
                        str = str2;
                        circularArray.n(new j(byteBufferE, (i2 & 4) != 0 ? z3 : false, (i2 & 1) != 0 ? z3 : false, bufferInfo2.presentationTimeUs));
                        XoT.C.az(this, new Function0() { // from class: C6.gnv
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RzR.aYN(this.f754n);
                            }
                        });
                    }
                    MediaCodec mediaCodec4 = this.f735t;
                    if (mediaCodec4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        mediaCodec4 = null;
                    }
                    mediaCodec4.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((this.nr.flags & 4) != 0) {
                        if (z2) {
                            XoT.C.az(this, new Function0() { // from class: C6.KH
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RzR.nY();
                                }
                            });
                        } else {
                            XoT.C.HI(this, new Function0() { // from class: C6.fg
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RzR.ViF();
                                }
                            });
                        }
                        this.az = true;
                        return;
                    }
                    z3 = true;
                    jNanoTime2 = System.nanoTime();
                }
                str2 = str;
            } else {
                if (s7N()) {
                    throw new EncoderTestException("format changed twice", null, 2, null);
                }
                MediaCodec mediaCodec5 = this.f735t;
                if (mediaCodec5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str2);
                    mediaCodec5 = null;
                }
                final MediaFormat outputFormat = mediaCodec5.getOutputFormat();
                Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                XoT.C.Uo(this, new Function0() { // from class: C6.O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RzR.S(outputFormat);
                    }
                });
                this.mUb = outputFormat;
                jNanoTime2 = System.nanoTime();
            }
            str = str2;
            str2 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(long j2) {
        return "beginFrame(" + j2 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rV9(MediaFormat mediaFormat) {
        return "Format: " + mediaFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String te() {
        return "sending EOS to videoEncoder";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v() {
        return "init IN";
    }

    public void Ik(final long j2) throws EncoderTestException {
        XoT.C.Uo(this, new Function0() { // from class: C6.QaP
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RzR.r(j2);
            }
        });
        try {
            if (this.xMQ > 0) {
                Z(this, false, null, 2, null);
            }
            T().E2(j2);
        } catch (MediaCodec.CodecException e2) {
            throw new EncoderTestException("Encode Error", e2);
        } catch (MediaCodec.CryptoException e3) {
            throw new EncoderTestException("Encode Error", e3);
        } catch (IllegalArgumentException e4) {
            throw new EncoderTestException("Encode Error", e4);
        } catch (IllegalStateException e5) {
            throw new EncoderTestException("Encode Error", e5);
        }
    }

    public j N() {
        if (this.gh.nr()) {
            return null;
        }
        return (j) this.gh.O();
    }

    public z.mz T() {
        z.mz mzVar = this.rl;
        if (mzVar != null) {
            return mzVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gctx");
        return null;
    }

    public void U() {
        XoT.C.Uo(this, new Function0() { // from class: C6.OU
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RzR.P5();
            }
        });
        if (this.Uo) {
            return;
        }
        this.Uo = true;
        MediaCodec mediaCodec = this.f735t;
        Surface surface = null;
        if (mediaCodec != null) {
            if (mediaCodec == null) {
                try {
                    Intrinsics.throwUninitializedPropertyAccessException("videoEncoder");
                    mediaCodec = null;
                } catch (Throwable unused) {
                }
            }
            mediaCodec.stop();
            try {
                MediaCodec mediaCodec2 = this.f735t;
                if (mediaCodec2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoEncoder");
                    mediaCodec2 = null;
                }
                mediaCodec2.release();
            } catch (Throwable unused2) {
            }
        }
        Surface surface2 = this.J2;
        if (surface2 != null) {
            if (surface2 == null) {
                try {
                    Intrinsics.throwUninitializedPropertyAccessException("inputSurface");
                } catch (Throwable unused3) {
                }
            } else {
                surface = surface2;
            }
            surface.release();
        }
        if (this.rl != null) {
            T().release();
        }
    }

    public boolean X() {
        return this.az && this.gh.nr();
    }

    public void Xw(Function0 function0) throws EncoderTestException {
        XoT.C.Uo(this, new Function0() { // from class: C6.o7q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RzR.jB();
            }
        });
        try {
            o(true, function0);
        } catch (MediaCodec.CodecException e2) {
            throw new EncoderTestException("Encode Error", e2);
        } catch (MediaCodec.CryptoException e3) {
            throw new EncoderTestException("Encode Error", e3);
        } catch (IllegalArgumentException e4) {
            throw new EncoderTestException("Encode Error", e4);
        } catch (IllegalStateException e5) {
            throw new EncoderTestException("Encode Error", e5);
        }
    }

    public void fD() throws EncoderTestException {
        XoT.C.Uo(this, new Function0() { // from class: C6.Mf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RzR.E2();
            }
        });
        try {
            T().qie();
            this.xMQ++;
        } catch (MediaCodec.CodecException e2) {
            throw new EncoderTestException("Encode Error", e2);
        } catch (MediaCodec.CryptoException e3) {
            throw new EncoderTestException("Encode Error", e3);
        } catch (IllegalArgumentException e4) {
            throw new EncoderTestException("Encode Error", e4);
        } catch (IllegalStateException e5) {
            throw new EncoderTestException("Encode Error", e5);
        }
    }

    public MediaFormat nHg() {
        MediaFormat mediaFormat = this.mUb;
        if (mediaFormat != null) {
            return mediaFormat;
        }
        throw new IllegalStateException("Attempt to read output format before output started");
    }

    public boolean s7N() {
        return this.mUb != null;
    }

    public boolean wTp() throws IOException {
        XoT.C.Uo(this, new Function0() { // from class: C6.xZD
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RzR.v();
            }
        });
        if (this.KN || this.Uo) {
            throw new IllegalStateException("Check failed.");
        }
        final MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f734n.O(), this.f734n.J2(), this.f734n.rl());
        Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.f734n.nr());
        if (this.f734n.n() % 100 == 0) {
            mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f734n.n() / 100);
        } else {
            mediaFormatCreateVideoFormat.setFloat("frame-rate", this.f734n.n() / 100.0f);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.f734n.t());
        XoT.C.az(this, new Function0() { // from class: C6.M5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RzR.rV9(mediaFormatCreateVideoFormat);
            }
        });
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(this.f734n.O());
        this.f735t = mediaCodecCreateEncoderByType;
        Surface surface = null;
        if (mediaCodecCreateEncoderByType == null) {
            try {
                Intrinsics.throwUninitializedPropertyAccessException("videoEncoder");
                mediaCodecCreateEncoderByType = null;
            } catch (MediaCodec.CodecException e2) {
                XoT.C.ty(this, "Error configuring encoder", e2);
                return false;
            } catch (MediaCodec.CryptoException e3) {
                XoT.C.ty(this, "Error configuring encoder", e3);
                return false;
            } catch (IllegalArgumentException e4) {
                XoT.C.ty(this, "Error configuring encoder", e4);
                return false;
            } catch (IllegalStateException e5) {
                XoT.C.ty(this, "Error configuring encoder", e5);
                return false;
            }
        }
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        MediaCodec mediaCodec = this.f735t;
        if (mediaCodec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEncoder");
            mediaCodec = null;
        }
        this.J2 = mediaCodec.createInputSurface();
        try {
            MediaCodec mediaCodec2 = this.f735t;
            if (mediaCodec2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoEncoder");
                mediaCodec2 = null;
            }
            mediaCodec2.start();
            Context appContext = this.f733O;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            this.rl = IB.w6.rl(appContext, "sceneExporterVideo", true, null, 8, null);
            T().N();
            z.mz mzVarT = T();
            Surface surface2 = this.J2;
            if (surface2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputSurface");
            } else {
                surface = surface2;
            }
            mzVarT.ViF(new z.xZD(surface));
            this.KN = true;
            XoT.C.Uo(this, new Function0() { // from class: C6.YzO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RzR.bzg();
                }
            });
            return true;
        } catch (MediaCodec.CodecException e6) {
            XoT.C.ty(this, "Error starting encoder", e6);
            return false;
        } catch (IllegalStateException e7) {
            XoT.C.ty(this, "Error starting encoder", e7);
            return false;
        }
    }
}
