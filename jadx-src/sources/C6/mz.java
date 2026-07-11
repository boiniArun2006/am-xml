package C6;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.collection.CircularArray;
import cS.Zv.SzFNXybiSxdx;
import com.alightcreative.deviceinfo.codectest.DecoderTestException;
import com.alightcreative.gl.OpenGLException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class mz {
    private volatile boolean HI;
    private CircularArray Ik;
    private MediaCodec J2;
    private Surface KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Context f772O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private volatile boolean f773S;
    private z.mz Uo;
    private boolean WPU;
    private Throwable XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final SynchronousQueue f774Z;
    private final Object az;
    private CircularArray ck;
    private boolean gh;
    private z.ci mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediaFormat f775n;
    private final int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f776o;
    private boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final MediaCodec.BufferInfo f777r;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f778t;
    private boolean ty;
    private SurfaceTexture xMQ;

    private final Object GR(Function0 function0) throws InterruptedException, DecoderTestException {
        Object objNxk = Nxk(false, function0);
        Intrinsics.checkNotNull(objNxk);
        return objNxk;
    }

    private final Object k(Function0 function0) {
        return Nxk(true, function0);
    }

    public mz(MediaFormat mediaFormat, Context context, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f775n = mediaFormat;
        this.rl = i2;
        this.f778t = i3;
        this.nr = i5;
        this.f772O = context.getApplicationContext();
        this.az = new Object();
        this.ck = new CircularArray(0, 1, null);
        this.Ik = new CircularArray(0, 1, null);
        this.f777r = new MediaCodec.BufferInfo();
        this.f774Z = new SynchronousQueue();
        this.WPU = true;
        ThreadsKt.thread$default(false, false, null, null, 0, new Function0() { // from class: C6.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.fD(this.f755n);
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(mz mzVar, j jVar) {
        mzVar.ck.n(jVar);
        mzVar.X();
        return Unit.INSTANCE;
    }

    private final void E2() {
        XoT.C.Uo(this, new Function0() { // from class: C6.psW
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.e(this.f784n);
            }
        });
        if (this.gh) {
            return;
        }
        this.gh = true;
        z.mz mzVar = this.Uo;
        Surface surface = null;
        if (mzVar != null) {
            if (this.xMQ != null) {
                if (mzVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gctx");
                    mzVar = null;
                }
                z.KH khRl = mzVar.rl();
                SurfaceTexture surfaceTexture = this.xMQ;
                if (surfaceTexture == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
                    surfaceTexture = null;
                }
                khRl.O(surfaceTexture);
                SurfaceTexture surfaceTexture2 = this.xMQ;
                if (surfaceTexture2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
                    surfaceTexture2 = null;
                }
                surfaceTexture2.release();
            }
            z.mz mzVar2 = this.Uo;
            if (mzVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gctx");
                mzVar2 = null;
            }
            mzVar2.release();
        }
        MediaCodec mediaCodec = this.J2;
        if (mediaCodec != null) {
            if (mediaCodec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                mediaCodec = null;
            }
            mediaCodec.stop();
            MediaCodec mediaCodec2 = this.J2;
            if (mediaCodec2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                mediaCodec2 = null;
            }
            mediaCodec2.release();
            qcD.CN3 cn3 = qcD.CN3.f72470n;
            MediaCodec mediaCodec3 = this.J2;
            if (mediaCodec3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                mediaCodec3 = null;
            }
            cn3.gh(mediaCodec3);
        }
        Surface surface2 = this.KN;
        if (surface2 != null) {
            if (surface2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("surface");
            } else {
                surface = surface2;
            }
            surface.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(mz mzVar, Function0 function0) {
        if (mzVar.XQ == null) {
            try {
                function0.invoke();
            } catch (Throwable th) {
                mzVar.XQ = th;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String N(mz mzVar) {
        return "CodecTest:decoder(" + mzVar.nr + "): EOS INPUT!!!!!!";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object Nxk(boolean z2, final Function0 function0) throws InterruptedException, DecoderTestException {
        if (!this.WPU) {
            throw new DecoderTestException("Decode Task Not Running", null, 2, null);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        this.f774Z.put(new Function0() { // from class: C6.Md
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.Y(this.f716n, objectRef2, objectRef, function0, countDownLatch);
            }
        });
        int i2 = 0;
        while (!countDownLatch.await(100L, TimeUnit.MILLISECONDS)) {
            int i3 = i2 + 1;
            if (i2 > 100) {
                throw new DecoderTestException("Decoder Action Timeout", null, 2, null);
            }
            if (!this.WPU) {
                throw new DecoderTestException("Decode Task Not Running", null, 2, null);
            }
            i2 = i3;
        }
        T t3 = objectRef.element;
        Throwable th = (Throwable) objectRef2.element;
        if (th != null) {
            throw new DecoderTestException("Decode Action Failure", th);
        }
        if (t3 != 0 || z2) {
            return t3;
        }
        throw new DecoderTestException("Decode Action Missing Result", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String T(mz mzVar, int i2, j jVar) {
        return "CodecTest:decoder(" + mzVar.nr + "): (INPUT) queueInputBuffer=" + i2 + " pts=" + jVar.nr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String U(mz mzVar, int i2) {
        return "CodecTest:decoder(" + mzVar.nr + pTYaLzzmJSGAPQ.DkpouhXmpByju + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ViF(mz mzVar) {
        return "CodecTest:decoder(" + mzVar.nr + "):getOutputFrame sizeBefore=" + mzVar.Ik.J2();
    }

    private final boolean X() {
        final boolean z2;
        XoT.C.Uo(this, new Function0() { // from class: C6.pO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.Xw(this.f782n);
            }
        });
        if (!this.qie) {
            throw new IllegalStateException("Check failed.");
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        XoT.C.Uo(this, new Function0() { // from class: C6.l4Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.jB(this.f769n);
            }
        });
        z.ci ciVar = null;
        if (!this.ty && !this.ck.nr()) {
            MediaCodec mediaCodec = this.J2;
            if (mediaCodec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                mediaCodec = null;
            }
            final int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
            XoT.C.Uo(this, new Function0() { // from class: C6.DAz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mz.U(this.f698n, iDequeueInputBuffer);
                }
            });
            if (iDequeueInputBuffer >= 0) {
                MediaCodec mediaCodec2 = this.J2;
                if (mediaCodec2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                    mediaCodec2 = null;
                }
                ByteBuffer inputBuffer = mediaCodec2.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer != null) {
                    final j jVar = (j) this.ck.O();
                    inputBuffer.rewind();
                    inputBuffer.put(jVar.n());
                    inputBuffer.limit(jVar.n().limit());
                    inputBuffer.rewind();
                    XoT.C.Uo(this, new Function0() { // from class: C6.u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return mz.T(this.f796n, iDequeueInputBuffer, jVar);
                        }
                    });
                    MediaCodec mediaCodec3 = this.J2;
                    if (mediaCodec3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                        mediaCodec3 = null;
                    }
                    mediaCodec3.queueInputBuffer(iDequeueInputBuffer, 0, inputBuffer.limit(), jVar.nr(), jVar.rl() ? 4 : 0);
                    if (jVar.rl()) {
                        XoT.C.Uo(this, new Function0() { // from class: C6.qf
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return mz.N(this.f785n);
                            }
                        });
                        this.ty = true;
                    }
                    booleanRef.element = true;
                }
            }
        }
        if (!this.HI) {
            MediaCodec mediaCodec4 = this.J2;
            if (mediaCodec4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                mediaCodec4 = null;
            }
            final int iDequeueOutputBuffer = mediaCodec4.dequeueOutputBuffer(this.f777r, 10000L);
            XoT.C.Uo(this, new Function0() { // from class: C6.Ln
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mz.nHg(this.f708n, iDequeueOutputBuffer);
                }
            });
            if (iDequeueOutputBuffer >= 0) {
                this.f776o = true;
                if ((4 & this.f777r.flags) != 0) {
                    XoT.C.Uo(this, new Function0() { // from class: C6.lej
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return mz.s7N(this.f770n);
                        }
                    });
                    this.HI = true;
                }
                this.f773S = false;
                MediaCodec mediaCodec5 = this.J2;
                if (mediaCodec5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                    mediaCodec5 = null;
                }
                mediaCodec5.releaseOutputBuffer(iDequeueOutputBuffer, true);
                XoT.C.Uo(this, new Function0() { // from class: C6.iwV
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mz.wTp(this.f760n, iDequeueOutputBuffer);
                    }
                });
                synchronized (this.az) {
                    try {
                        long jNanoTime = System.nanoTime();
                        while (!this.f773S && System.nanoTime() - jNanoTime < 1500000000) {
                            this.az.wait(100L);
                        }
                        z2 = this.f773S;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                XoT.C.Uo(this, new Function0() { // from class: C6.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mz.v(this.f712n, z2);
                    }
                });
                if (z2) {
                    z.ci ciVar2 = this.mUb;
                    if (ciVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("surfaceTextureWrapper");
                        ciVar2 = null;
                    }
                    ciVar2.eF();
                    CircularArray circularArray = this.Ik;
                    z.ci ciVar3 = this.mUb;
                    if (ciVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("surfaceTextureWrapper");
                    } else {
                        ciVar = ciVar3;
                    }
                    circularArray.n(new pq(ciVar.U() / ((long) 1000), this.HI));
                    XoT.C.Uo(this, new Function0() { // from class: C6.rv6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return mz.rV9(this.f791n);
                        }
                    });
                } else if (this.HI) {
                    CircularArray circularArray2 = this.Ik;
                    z.ci ciVar4 = this.mUb;
                    if (ciVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("surfaceTextureWrapper");
                    } else {
                        ciVar = ciVar4;
                    }
                    circularArray2.n(new pq(ciVar.U() / ((long) 1000), true));
                }
                booleanRef.element = true;
            }
        }
        XoT.C.Uo(this, new Function0() { // from class: C6.Sis
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.bzg(this.f737n, booleanRef);
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Xw(mz mzVar) {
        return "CodecTest:decoder(" + mzVar.nr + "):doWork IN - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    public static final Unit Y(mz mzVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Function0 function0, CountDownLatch countDownLatch) {
        ?? r02 = mzVar.XQ;
        if (r02 != 0) {
            objectRef.element = r02;
            mzVar.XQ = null;
        } else {
            try {
                objectRef2.element = function0.invoke();
            } catch (Throwable th) {
                objectRef.element = th;
            }
        }
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    private final void a(final Function0 function0) throws InterruptedException, DecoderTestException {
        if (!this.WPU) {
            throw new DecoderTestException("Decode Task Not Running", null, 2, null);
        }
        this.f774Z.put(new Function0() { // from class: C6.Lu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.I(this.f710n, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String bzg(mz mzVar, Ref.BooleanRef booleanRef) {
        return "CodecTest:decoder(" + mzVar.nr + "):doWork OUT (didWork=" + booleanRef.element + ") - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(mz mzVar) {
        return "CodecTest:decoder(" + mzVar.nr + "):release";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fD(mz mzVar) {
        while (mzVar.WPU) {
            ((Function0) mzVar.f774Z.take()).invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(mz mzVar, boolean z2) {
        return "CodecTest:decoder(" + mzVar.nr + "):getEOS() -> eos=" + z2 + " because outputFrames.isEmpty=" + mzVar.Ik.nr() + " (" + mzVar.Ik.J2() + ") and endOfStreamOutput=" + mzVar.HI + "  [esi=" + mzVar.ty + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iF(mz mzVar, SurfaceTexture surfaceTexture) {
        synchronized (mzVar.az) {
            mzVar.f773S = true;
            mzVar.az.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jB(mz mzVar) {
        return "CodecTest:decoder(" + mzVar.nr + "): eosIn=" + mzVar.ty + SzFNXybiSxdx.pEiasKDXpGvb + mzVar.HI + " pendingInputBuffers=" + mzVar.ck.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nHg(mz mzVar, int i2) {
        return "CodecTest:decoder(" + mzVar.nr + "): dequeueOutputBuffer=" + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nY(mz mzVar) {
        return mzVar.Ik.nr() && mzVar.HI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rV9(mz mzVar) {
        int i2 = mzVar.nr;
        z.ci ciVar = mzVar.mUb;
        if (ciVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceTextureWrapper");
            ciVar = null;
        }
        return "CodecTest:decoder(" + i2 + "): addOutputFrame; pts=" + (ciVar.U() / ((long) 1000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s7N(mz mzVar) {
        return "CodecTest:decoder(" + mzVar.nr + "): EOS OUTPUT!!!!!!";
    }

    private final boolean te() throws OpenGLException, IOException {
        if (this.qie || this.gh) {
            throw new IllegalStateException("Check failed.");
        }
        String strFindDecoderForFormat = Hr.aC.qie().findDecoderForFormat(this.f775n);
        if (strFindDecoderForFormat == null && (strFindDecoderForFormat = Hr.CN3.t(Hr.aC.qie(), this.f775n)) == null) {
            return false;
        }
        try {
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(strFindDecoderForFormat);
            this.J2 = mediaCodecCreateByCodecName;
            qcD.CN3 cn3 = qcD.CN3.f72470n;
            MediaCodec mediaCodec = null;
            if (mediaCodecCreateByCodecName == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                mediaCodecCreateByCodecName = null;
            }
            cn3.Uo(mediaCodecCreateByCodecName, "capa");
            Context appContext = this.f772O;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            z.mz mzVarRl = IB.w6.rl(appContext, "videoThumbs", false, null, 12, null);
            this.Uo = mzVarRl;
            if (mzVarRl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gctx");
                mzVarRl = null;
            }
            mzVarRl.N();
            z.mz mzVar = this.Uo;
            if (mzVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gctx");
                mzVar = null;
            }
            mzVar.ViF(new z.OU(this.rl, this.f778t));
            z.mz mzVar2 = this.Uo;
            if (mzVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gctx");
                mzVar2 = null;
            }
            mzVar2.N();
            int iO = z.Ew.O("extractThumbnailSyncInternal");
            this.xMQ = new SurfaceTexture(iO);
            SurfaceTexture surfaceTexture = this.xMQ;
            if (surfaceTexture == null) {
                Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
                surfaceTexture = null;
            }
            this.KN = new Surface(surfaceTexture);
            z.mz mzVar3 = this.Uo;
            if (mzVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gctx");
                mzVar3 = null;
            }
            z.KH khRl = mzVar3.rl();
            SurfaceTexture surfaceTexture2 = this.xMQ;
            if (surfaceTexture2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
                surfaceTexture2 = null;
            }
            this.mUb = khRl.XQ(surfaceTexture2, this.rl, this.f778t, iO);
            SurfaceTexture surfaceTexture3 = this.xMQ;
            if (surfaceTexture3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("surfaceTexture");
                surfaceTexture3 = null;
            }
            surfaceTexture3.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: C6.K
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture4) {
                    mz.iF(this.f707n, surfaceTexture4);
                }
            });
            try {
                MediaCodec mediaCodec2 = this.J2;
                if (mediaCodec2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                    mediaCodec2 = null;
                }
                MediaFormat mediaFormat = this.f775n;
                Surface surface = this.KN;
                if (surface == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("surface");
                    surface = null;
                }
                mediaCodec2.configure(mediaFormat, surface, (MediaCrypto) null, 0);
                MediaCodec mediaCodec3 = this.J2;
                if (mediaCodec3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoCodec");
                } else {
                    mediaCodec = mediaCodec3;
                }
                mediaCodec.start();
                this.qie = true;
                return true;
            } catch (MediaCodec.CodecException unused) {
                return false;
            }
        } catch (MediaCodec.CodecException e2) {
            XoT.C.ty(this, "CodecTest:decoder(" + this.nr + "): Error creating media codec", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v(mz mzVar, boolean z2) {
        return "CodecTest:decoder(" + mzVar.nr + "): releasedOutputBuffer; st.avail=" + z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wTp(mz mzVar, int i2) {
        return "CodecTest:decoder(" + mzVar.nr + "): releasedOutputBuffer(" + i2 + ")";
    }

    public boolean E() {
        return ((Boolean) GR(new Function0() { // from class: C6.yg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(mz.M(this.f799n));
            }
        })).booleanValue();
    }

    public void FX(final j buffer) throws InterruptedException, DecoderTestException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        a(new Function0() { // from class: C6.nKK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.B(this.f780n, buffer);
            }
        });
    }

    public void J() throws InterruptedException, DecoderTestException {
        GR(new Function0() { // from class: C6.P
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.D(this.f722n);
            }
        });
    }

    public pq M7() {
        return (pq) k(new Function0() { // from class: C6.Zs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.p5(this.f748n);
            }
        });
    }

    public boolean P5() {
        if (!this.HI) {
            return false;
        }
        final boolean zBooleanValue = ((Boolean) GR(new Function0() { // from class: C6.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(mz.nY(this.f771n));
            }
        })).booleanValue();
        XoT.C.Uo(this, new Function0() { // from class: C6.iF
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.g(this.f758n, zBooleanValue);
            }
        });
        return zBooleanValue;
    }

    public boolean eF() {
        return this.f776o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(mz mzVar) {
        mzVar.E2();
        mzVar.WPU = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M(mz mzVar) {
        return mzVar.te();
    }

    private final pq aYN() {
        X();
        XoT.C.Uo(this, new Function0() { // from class: C6.vd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.ViF(this.f798n);
            }
        });
        if (this.Ik.nr()) {
            return null;
        }
        return (pq) this.Ik.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pq p5(mz mzVar) {
        return mzVar.aYN();
    }
}
