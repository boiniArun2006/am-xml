package Di;

import Di.CN3;
import Hr.Dsr;
import WJ.phkN.HFAkacKHsU;
import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.libsamplerate_kotlin.SRC_ERR_BAD_DATA_PTR;
import com.libsamplerate_kotlin.SRC_ERR_BAD_MODE;
import com.libsamplerate_kotlin.SRC_ERR_BAD_PROC_PTR;
import com.libsamplerate_kotlin.SRC_ERR_BAD_SRC_RATIO;
import com.libsamplerate_kotlin.SRC_ERR_BAD_STATE;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class vd extends CN3.AbstractC0060CN3 {
    private Mgn.s4 E2;
    private boolean HI;
    private final ArrayBlockingQueue Ik;
    private final double J2;
    private final boolean KN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private volatile boolean f1556N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final double f1557O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final List f1558S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private volatile Throwable f1559T;
    private final boolean Uo;
    private volatile double ViF;
    private double WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Dsr.n.j f1560X;
    private final MediaCodec.BufferInfo XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private j f1561Z;
    private double aYN;
    private boolean az;
    private final ArrayBlockingQueue ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f1562e;
    private long fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1563g;
    private final int gh;
    private long iF;
    private final double mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Hr.Dsr f1564n;
    private final CountDownLatch nHg;
    private j nY;
    private final double nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Dsr.j f1565o;
    private final int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MediaCodec f1566r;
    private final CN3 rl;
    private Hr.qz s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double f1567t;
    private boolean te;
    private boolean ty;
    private CountDownLatch wTp;
    private final LinkedBlockingQueue xMQ;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    private static final class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f1568O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f1569n;
        private int nr;
        private final float[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private double f1570t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f1569n == ((j) obj).f1569n;
        }

        public final boolean J2() {
            return this.nr >= this.f1569n;
        }

        public final void KN(double d2) {
            this.f1570t = d2;
        }

        public final int O() {
            return this.nr;
        }

        public final void Uo(long j2) {
            this.f1568O = j2;
        }

        public int hashCode() {
            return Integer.hashCode(this.f1569n);
        }

        public final float[] n() {
            return this.rl;
        }

        public final double nr() {
            return this.f1570t;
        }

        public final int rl() {
            return this.f1569n - this.nr;
        }

        public final long t() {
            return this.f1568O;
        }

        public String toString() {
            return "AudioBuffer(size=" + this.f1569n + ")";
        }

        public final void xMQ(int i2) {
            this.nr = i2;
        }

        public j(int i2) {
            this.f1569n = i2;
            this.rl = new float[i2];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f1571n;
        private final ByteBuffer nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final MediaCodec.BufferInfo f1572t;

        public n(MediaCodec.BufferInfo info, ByteBuffer buffer, int i2, int i3) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            this.f1571n = i2;
            this.rl = i3;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(info.offset, info.size, info.presentationTimeUs, info.flags);
            this.f1572t = bufferInfo;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(info.size);
            byteBufferAllocate.put(buffer);
            byteBufferAllocate.order(buffer.order());
            byteBufferAllocate.rewind();
            this.nr = byteBufferAllocate;
        }

        public final ByteBuffer n() {
            return this.nr;
        }

        public final int nr() {
            return this.rl;
        }

        public final int rl() {
            return this.f1571n;
        }

        public final MediaCodec.BufferInfo t() {
            return this.f1572t;
        }
    }

    public /* synthetic */ vd(Hr.Dsr dsr, CN3 cn3, double d2, double d4, double d5, double d6, boolean z2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dsr, cn3, (i2 & 4) != 0 ? 0.0d : d2, (i2 & 8) != 0 ? Double.MAX_VALUE : d4, (i2 & 16) != 0 ? 0.0d : d5, (i2 & 32) != 0 ? Double.MAX_VALUE : d6, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? "" : str);
    }

    private final j M7() {
        j jVar = null;
        for (int i2 = 0; jVar == null && this.az && this.f1556N && i2 < 300; i2++) {
            jVar = (j) this.ck.poll(33L, TimeUnit.MILLISECONDS);
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fcU(vd vdVar) {
        vdVar.az = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String B() {
        return "onStart() - Success";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String C(Ref.ObjectRef objectRef, CN3 cn3, double d2) {
        return "Discard decoded buffer after seek: buffer_end=" + (((j) objectRef.element).nr() + (((double) cn3.O()) * cn3.nr())) + "<mts(" + d2 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String D() {
        return "MediaCodecInputNode AUDIO EOS : OUTPUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E(vd vdVar) {
        return "onStart() - In; got the following tracks:\n" + CollectionsKt.joinToString$default(vdVar.f1564n.nHg(), null, null, null, 0, null, new Function1() { // from class: Di.nKK
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vd.M((Dsr.n) obj);
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FX(vd vdVar) {
        Dsr.n.j jVar = vdVar.f1560X;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
            jVar = null;
        }
        return "onStart() - Audio track: " + jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GR() {
        return "Output silence (past EOS)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String I() {
        return "Output silence (past track end)";
    }

    private final void J(ByteBuffer byteBuffer, int i2, Hr.qz qzVar, int i3, MediaCodec.BufferInfo bufferInfo, Function0 function0) throws SRC_ERR_BAD_SRC_RATIO, InterruptedException, SRC_ERR_BAD_PROC_PTR, SRC_ERR_BAD_STATE, SRC_ERR_BAD_MODE, SRC_ERR_BAD_DATA_PTR {
        int iRemaining = byteBuffer.remaining() / (qzVar.rl() * i2);
        tF.j jVar = tF.j.f73449n;
        jVar.nr();
        jVar.O();
        this.E2.Uo(byteBuffer, qzVar, iRemaining, i2, false, i3, this.rl.J2());
        int iJ2 = this.E2.J2();
        float[] fArrO = this.E2.O();
        int iT = this.rl.t() * iJ2;
        function0.invoke();
        jVar.n();
        jVar.O();
        int i5 = 0;
        if (this.te) {
            this.iF = bufferInfo.presentationTimeUs;
            this.fD = 0L;
            this.te = false;
        } else {
            this.fD += (long) iJ2;
        }
        double dJ2 = (this.iF + ((this.fD * ((long) 1000000)) / ((long) this.rl.J2()))) / 1000000.0d;
        if (this.ty && (bufferInfo.flags & 4) != 0) {
            XoT.C.Uo(this, new Function0() { // from class: Di.DAz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vd.D();
                }
            });
            this.HI = true;
            this.WPU = dJ2;
        }
        while (i5 < iT && this.xMQ.isEmpty()) {
            j jVarP5 = P5((((double) (i5 / this.rl.t())) * this.rl.nr()) + dJ2);
            if (jVarP5 != null) {
                int iMin = Math.min(jVarP5.rl(), iT - i5);
                System.arraycopy(fArrO, i5, jVarP5.n(), jVarP5.O(), iMin);
                jVarP5.xMQ(jVarP5.O() + iMin);
                i5 += iMin;
                if (jVarP5.J2()) {
                    tF.j jVar2 = tF.j.f73449n;
                    jVar2.rl();
                    jVar2.O();
                    this.ck.put(jVarP5);
                    jVarP5 = null;
                }
                this.f1561Z = jVarP5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence M(Dsr.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "  " + it + "\n";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Mx(double d2, vd vdVar) {
        double d4 = vdVar.f1567t;
        return "Output silence (before track start) timestamp=" + d2 + " startTime=" + d4 + " diff=" + (d2 - d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Nxk() {
        return "Output silence (error)";
    }

    private final j P5(double d2) {
        j jVar;
        j jVar2 = this.f1561Z;
        if (jVar2 != null) {
            return jVar2;
        }
        do {
            jVar = (j) this.Ik.poll(1L, TimeUnit.MILLISECONDS);
            if (jVar != null) {
                break;
            }
        } while (this.xMQ.peek() == null);
        if (jVar != null) {
            jVar.xMQ(0);
            jVar.KN(d2);
            jVar.Uo(this.f1563g);
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String U() {
        return "MediaCodecInputNode AUDIO EOS : INPUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xw() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Y() {
        return "Output silence (not started)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a() {
        return "Start latch timeout";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String bzg(Hr.qz qzVar) {
        return "Inferred format: " + qzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dR0(double d2) {
        return "Output silence (diff=" + d2 + ")";
    }

    private final boolean eF() {
        Throwable th;
        Object next;
        MediaCodec mediaCodecCreateByCodecName;
        XoT.C.qie(this, new Function0() { // from class: Di.g9s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.E(this.f1541n);
            }
        });
        List listNHg = this.f1564n.nHg();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listNHg) {
            if (obj instanceof Dsr.n.j) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            th = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Dsr.n.j) next).nr() != null) {
                break;
            }
        }
        Dsr.n.j jVar = (Dsr.n.j) next;
        if (jVar == null) {
            return false;
        }
        this.f1560X = jVar;
        XoT.C.qie(this, new Function0() { // from class: Di.afx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.FX(this.f1535n);
            }
        });
        try {
            Dsr.n.j jVar2 = this.f1560X;
            if (jVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
                jVar2 = null;
            }
            String strNr = jVar2.nr();
            Intrinsics.checkNotNull(strNr);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(strNr);
        } catch (IOException e2) {
            MediaCodecList mediaCodecListQie = Hr.aC.qie();
            Dsr.n.j jVar3 = this.f1560X;
            if (jVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
                jVar3 = null;
            }
            List listNr = Hr.CN3.nr(mediaCodecListQie, jVar3.J2());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listNr) {
                String str = (String) obj2;
                Dsr.n.j jVar4 = this.f1560X;
                if (jVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
                    jVar4 = null;
                }
                if (!Intrinsics.areEqual(str, jVar4.nr())) {
                    arrayList2.add(obj2);
                }
            }
            MediaCodec mediaCodecCreateByCodecName2 = null;
            for (Object obj3 : arrayList2) {
                Intrinsics.checkNotNullExpressionValue(obj3, "next(...)");
                try {
                    mediaCodecCreateByCodecName2 = MediaCodec.createByCodecName((String) obj3);
                } catch (IOException unused) {
                }
                if (mediaCodecCreateByCodecName2 != null) {
                    break;
                }
            }
            if (mediaCodecCreateByCodecName2 == null) {
                this.f1559T = e2;
                return false;
            }
            mediaCodecCreateByCodecName = mediaCodecCreateByCodecName2;
        }
        this.f1566r = mediaCodecCreateByCodecName;
        Hr.Dsr dsr = this.f1564n;
        Dsr.n.j jVar5 = this.f1560X;
        if (jVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
            jVar5 = null;
        }
        this.f1565o = dsr.Ik(jVar5, 8192);
        Dsr.n.j jVar6 = this.f1560X;
        if (jVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
            jVar6 = null;
        }
        Hr.aC.Ik(jVar6.J2(), 2);
        Dsr.n.j jVar7 = this.f1560X;
        if (jVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
            jVar7 = null;
        }
        String strNr2 = jVar7.nr();
        Dsr.n.j jVar8 = this.f1560X;
        if (jVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
            jVar8 = null;
        }
        int iT = jVar8.t();
        Dsr.n.j jVar9 = this.f1560X;
        if (jVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
            jVar9 = null;
        }
        int iKN = jVar9.KN();
        Dsr.n.j jVar10 = this.f1560X;
        if (jVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
            jVar10 = null;
        }
        String strRl = jVar10.rl();
        Dsr.n.j jVar11 = this.f1560X;
        if (jVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
            jVar11 = null;
        }
        Integer numRl = Hr.aC.rl(jVar11.J2());
        Dsr.n.j jVar12 = this.f1560X;
        if (jVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
            jVar12 = null;
        }
        Integer numN = Hr.aC.n(jVar12.J2());
        Dsr.n.j jVar13 = this.f1560X;
        if (jVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
            jVar13 = null;
        }
        XoT.C.nr("mediaCodecInputNode:Start: dec='" + strNr2 + "' channels=" + iT + " sampleRate=" + iKN + " mime=" + strRl + " bitRate=" + numRl + " aac_profile=" + numN + " max=" + jVar13.O());
        try {
            MediaCodec mediaCodec = this.f1566r;
            if (mediaCodec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                mediaCodec = null;
            }
            Dsr.n.j jVar14 = this.f1560X;
            if (jVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
                jVar14 = null;
            }
            mediaCodec.configure(jVar14.J2(), (Surface) null, (MediaCrypto) null, 0);
        } catch (MediaCodec.CryptoException e3) {
            e = e3;
            th = e;
        } catch (IllegalArgumentException e4) {
            e = e4;
            th = e;
        } catch (IllegalStateException e5) {
            e = e5;
            th = e;
        }
        if (this.KN) {
            throw new IllegalStateException("Simulate Error");
        }
        MediaCodec mediaCodec2 = this.f1566r;
        if (mediaCodec2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
            mediaCodec2 = null;
        }
        mediaCodec2.start();
        this.f1559T = th;
        if (this.f1559T != null) {
            return false;
        }
        XoT.C.nr("mediaCodecInputNode:Started");
        while (this.Ik.remainingCapacity() > 0) {
            this.Ik.offer(new j(this.rl.O() * this.rl.t()));
        }
        XoT.C.qie(this, new Function0() { // from class: Di.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.B();
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String eTf(double d2, Ref.ObjectRef objectRef, CN3 cn3, double d4) {
        return "Discard decoded buffer (diff=" + d2 + ") buffer_end=" + (((j) objectRef.element).nr() + (((double) cn3.O()) * cn3.nr())) + "<mts(" + d4 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ijL(double d2) {
        return "EXECUTE SEEK (B) : " + d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jB(Ref.BooleanRef booleanRef, vd vdVar, int i2) {
        if (!booleanRef.element) {
            MediaCodec mediaCodec = vdVar.f1566r;
            if (mediaCodec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                mediaCodec = null;
            }
            Lu.rl(mediaCodec, i2, false);
            booleanRef.element = true;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k() {
        return "Output silence (no available buffer)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String m(Ref.ObjectRef objectRef, CN3 cn3, double d2) {
        return "Discard decoded buffer after seek: buffer_end=" + (((j) objectRef.element).nr() + (((double) cn3.O()) * cn3.nr())) + "<mts(" + d2 + ")";
    }

    private final double nHg(double d2) {
        double d4 = this.J2 - this.f1557O;
        return (this.Uo ? (Math.min(d2, this.nr) - this.f1567t) % d4 : Math.min(Math.min(d2, this.nr) - this.f1567t, d4)) + this.f1557O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ofS(double d2) {
        return "EXECUTE SEEK (A) : " + d2;
    }

    private final void p5() {
        MediaCodec mediaCodec = this.f1566r;
        if (mediaCodec != null) {
            if (mediaCodec == null) {
                try {
                    Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                    mediaCodec = null;
                } catch (IllegalStateException unused) {
                }
            }
            mediaCodec.stop();
            try {
                MediaCodec mediaCodec2 = this.f1566r;
                if (mediaCodec2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                    mediaCodec2 = null;
                }
                mediaCodec2.release();
            } catch (IllegalStateException unused2) {
            }
        }
        this.f1564n.release();
        tF.j.f73449n.nr();
        tF.n.n(this, null);
        this.wTp.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pJg(vd vdVar, long j2, final double d2) {
        XoT.C.qie(vdVar, new Function0() { // from class: Di.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.ofS(d2);
            }
        });
        vdVar.f1563g = j2;
        vdVar.f1564n.te((long) (Math.max(d2 - vdVar.mUb, 0.0d) * 1000000.0d));
        MediaCodec mediaCodec = vdVar.f1566r;
        if (mediaCodec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
            mediaCodec = null;
        }
        mediaCodec.flush();
        vdVar.ty = false;
        vdVar.HI = false;
        vdVar.te = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit piY(vd vdVar, long j2, final double d2) throws SRC_ERR_BAD_STATE {
        XoT.C.qie(vdVar, new Function0() { // from class: Di.QJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.ijL(d2);
            }
        });
        vdVar.f1563g = j2;
        vdVar.f1564n.te((long) (Math.max(d2 - vdVar.mUb, 0.0d) * 1000000.0d));
        MediaCodec mediaCodec = vdVar.f1566r;
        if (mediaCodec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
            mediaCodec = null;
        }
        mediaCodec.flush();
        vdVar.ty = false;
        vdVar.HI = false;
        vdVar.te = true;
        vdVar.E2.HI();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void s7N() throws SRC_ERR_BAD_SRC_RATIO, InterruptedException, SRC_ERR_BAD_PROC_PTR, SRC_ERR_BAD_STATE, SRC_ERR_BAD_MODE, SRC_ERR_BAD_DATA_PTR {
        ByteBuffer outputBuffer;
        final Hr.qz qzVar;
        Hr.qz qzVar2;
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        Hr.qz qzVar3;
        final Ref.BooleanRef booleanRef;
        MediaCodec mediaCodec3;
        MediaCodec mediaCodec4;
        MediaCodec mediaCodec5;
        if (this.HI) {
            this.WPU += ((double) this.rl.O()) * this.rl.nr();
            j jVar = (j) this.Ik.poll();
            if (jVar != null) {
                ArraysKt.fill$default(jVar.n(), 0.0f, 0, 0, 6, (Object) null);
                jVar.KN(this.WPU);
                jVar.Uo(this.f1563g);
                this.ck.put(jVar);
                return;
            }
            return;
        }
        if (!this.ty) {
            MediaCodec mediaCodec6 = this.f1566r;
            if (mediaCodec6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                mediaCodec6 = null;
            }
            int iDequeueInputBuffer = mediaCodec6.dequeueInputBuffer(0L);
            if (iDequeueInputBuffer >= 0) {
                MediaCodec mediaCodec7 = this.f1566r;
                if (mediaCodec7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                    mediaCodec7 = null;
                }
                ByteBuffer inputBuffer = mediaCodec7.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer != null) {
                    Dsr.j jVar2 = this.f1565o;
                    if (jVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("reader");
                        jVar2 = null;
                    }
                    Hr.o oVar = jVar2.read(inputBuffer);
                    if (oVar instanceof Hr.C) {
                        Hr.C c2 = (Hr.C) oVar;
                        this.aYN = c2.n() / 1000000.0d;
                        MediaCodec mediaCodec8 = this.f1566r;
                        if (mediaCodec8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                            mediaCodec5 = null;
                        } else {
                            mediaCodec5 = mediaCodec8;
                        }
                        mediaCodec5.queueInputBuffer(iDequeueInputBuffer, 0, inputBuffer.limit(), c2.n(), 0);
                    } else {
                        if (!(oVar instanceof Hr.fuX)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        XoT.C.Uo(this, new Function0() { // from class: Di.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return vd.U();
                            }
                        });
                        if (this.ViF < 0.0d) {
                            this.ViF = this.aYN;
                            XoT.C.Uo(this, new Function0() { // from class: Di.s4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return vd.wTp(this.f1554n);
                                }
                            });
                        }
                        MediaCodec mediaCodec9 = this.f1566r;
                        if (mediaCodec9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                            mediaCodec4 = null;
                        } else {
                            mediaCodec4 = mediaCodec9;
                        }
                        mediaCodec4.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        this.ty = true;
                    }
                }
            }
        }
        MediaCodec mediaCodec10 = this.f1566r;
        if (mediaCodec10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
            mediaCodec10 = null;
        }
        final int iDequeueOutputBuffer = mediaCodec10.dequeueOutputBuffer(this.XQ, 0L);
        if (iDequeueOutputBuffer >= 0) {
            MediaCodec mediaCodec11 = this.f1566r;
            if (mediaCodec11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                mediaCodec11 = null;
            }
            outputBuffer = mediaCodec11.getOutputBuffer(iDequeueOutputBuffer);
        } else {
            outputBuffer = null;
        }
        if (outputBuffer == null) {
            return;
        }
        MediaCodec mediaCodec12 = this.f1566r;
        if (mediaCodec12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
            mediaCodec12 = null;
        }
        MediaFormat outputFormat = mediaCodec12.getOutputFormat(iDequeueOutputBuffer);
        Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
        int iT = Hr.aC.t(outputFormat);
        Integer numMUb = Hr.aC.mUb(outputFormat);
        int iTy = Hr.aC.ty(outputFormat);
        if (numMUb != null && numMUb.intValue() == 2) {
            qzVar3 = Hr.qz.f3978t;
        } else if (numMUb != null && numMUb.intValue() == 3) {
            qzVar3 = Hr.qz.J2;
        } else {
            if (numMUb == null || numMUb.intValue() != 4) {
                if (numMUb != null) {
                    throw new UnsupportedOperationException();
                }
                Hr.qz qzVar4 = this.s7N;
                if (qzVar4 != null) {
                    qzVar = qzVar4;
                } else {
                    if (this.f1558S.size() < this.gh) {
                        if (outputBuffer.hasRemaining()) {
                            this.f1558S.add(new n(this.XQ, outputBuffer, iT, iTy));
                        }
                        MediaCodec mediaCodec13 = this.f1566r;
                        if (mediaCodec13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                            mediaCodec2 = null;
                        } else {
                            mediaCodec2 = mediaCodec13;
                        }
                        Lu.rl(mediaCodec2, iDequeueOutputBuffer, false);
                        return;
                    }
                    final n nVar = (n) CollectionsKt.last(this.f1558S);
                    final int i2 = nVar.t().size;
                    final long j2 = this.XQ.presentationTimeUs - nVar.t().presentationTimeUs;
                    final double dRl = ((double) i2) / ((((long) (nVar.rl() * nVar.nr())) * j2) / 1000000.0d);
                    final int iRoundToInt = MathKt.roundToInt(dRl);
                    if (Math.abs(dRl % ((double) 1.0f)) > 0.001d && this.f1558S.size() < 8) {
                        XoT.C.qie(this, new Function0() { // from class: Di.UGc
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return vd.v(this.f1527n, i2, j2, iRoundToInt, nVar, dRl);
                            }
                        });
                        this.f1558S.add(new n(this.XQ, outputBuffer, iT, iTy));
                        MediaCodec mediaCodec14 = this.f1566r;
                        if (mediaCodec14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                            mediaCodec = null;
                        } else {
                            mediaCodec = mediaCodec14;
                        }
                        Lu.rl(mediaCodec, iDequeueOutputBuffer, false);
                        return;
                    }
                    XoT.C.qie(this, new Function0() { // from class: Di.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return vd.rV9(i2, j2, iRoundToInt, nVar, dRl);
                        }
                    });
                    if (iRoundToInt == 1) {
                        qzVar2 = Hr.qz.J2;
                    } else if (iRoundToInt == 2) {
                        qzVar2 = Hr.qz.f3978t;
                    } else {
                        if (iRoundToInt != 3) {
                            if (this.f1558S.size() <= this.qie) {
                                this.f1558S.add(new n(this.XQ, outputBuffer, iT, iTy));
                                return;
                            }
                            Dsr.n.j jVar3 = this.f1560X;
                            if (jVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
                                jVar3 = null;
                            }
                            int iUo = jVar3.Uo();
                            Dsr.n.j jVar4 = this.f1560X;
                            if (jVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("audioTrackInfo");
                                jVar4 = null;
                            }
                            throw new UnsupportedOperationException("encoding=" + iUo + " decoder=" + jVar4.nr() + " deferredBytes=" + i2 + " deferredTime=" + j2 + " bytesPerSample=" + iRoundToInt + " deferredChannelCount=" + nVar.rl() + " deferredSampleRate=" + nVar.nr() + " rawBytesPerSample=" + dRl + " (tried " + this.f1558S.size() + " bufferes)");
                        }
                        qzVar2 = Hr.qz.f3977r;
                    }
                    qzVar = qzVar2;
                    XoT.C.qie(this, new Function0() { // from class: Di.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return vd.bzg(qzVar);
                        }
                    });
                    for (n nVar2 : this.f1558S) {
                        ByteBuffer byteBufferN = nVar2.n();
                        Intrinsics.checkNotNullExpressionValue(byteBufferN, "<get-buffer>(...)");
                        J(byteBufferN, nVar2.rl(), qzVar, nVar2.nr(), nVar2.t(), new Function0() { // from class: Di.SPz
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return vd.Xw();
                            }
                        });
                    }
                    this.f1558S.clear();
                    this.s7N = qzVar;
                }
                booleanRef = new Ref.BooleanRef();
                J(outputBuffer, iT, qzVar, iTy, this.XQ, new Function0() { // from class: Di.ci
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return vd.jB(booleanRef, this, iDequeueOutputBuffer);
                    }
                });
                if (booleanRef.element) {
                    MediaCodec mediaCodec15 = this.f1566r;
                    if (mediaCodec15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("audioCodec");
                        mediaCodec3 = null;
                    } else {
                        mediaCodec3 = mediaCodec15;
                    }
                    Lu.rl(mediaCodec3, iDequeueOutputBuffer, false);
                    booleanRef.element = true;
                    return;
                }
                return;
            }
            qzVar3 = Hr.qz.f3974O;
        }
        qzVar = qzVar3;
        booleanRef = new Ref.BooleanRef();
        J(outputBuffer, iT, qzVar, iTy, this.XQ, new Function0() { // from class: Di.ci
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.jB(booleanRef, this, iDequeueOutputBuffer);
            }
        });
        if (booleanRef.element) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v(vd vdVar, int i2, long j2, int i3, n nVar, double d2) {
        return "Deferring #" + vdVar.f1558S.size() + " - Would have inferred: deferredBytes=" + i2 + " deferredTime=" + j2 + " bytesPerSample=" + i3 + " deferredChannelCount=" + nVar.rl() + " deferredSampleRate=" + nVar.nr() + " rawBytesPerSample=" + d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wTp(vd vdVar) {
        return "MediaCodecInputNode AUDIO EOS : Found actual EOS at " + vdVar.ViF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xg(double d2) {
        return "Request seek; ahead (diff=" + d2 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String z(double d2) {
        return "Request seek; behind (diff=" + d2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0299  */
    /* JADX WARN: Type inference failed for: r0v26, types: [Di.vd$j, T] */
    /* JADX WARN: Type inference failed for: r0v28, types: [Di.vd$j, T] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Di.vd$j, T] */
    /* JADX WARN: Type inference failed for: r0v65, types: [Di.vd$j, T] */
    /* JADX WARN: Type inference failed for: r0v67, types: [Di.vd$j, T] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r10v7, types: [Di.vd$j, T] */
    @Override // Di.CN3.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(float[] dst, final double d2, final CN3 graph) throws InterruptedException {
        j jVar;
        int i2;
        int i3;
        final vd vdVar;
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(graph, "graph");
        long jNanoTime = System.nanoTime();
        double d4 = this.f1567t;
        final double dNHg = d2 < d4 ? nHg(d4) : nHg(d2);
        j jVar2 = this.nY;
        ?? M7 = jVar2;
        if (jVar2 == null) {
            M7 = M7();
        }
        if (!this.f1556N && !this.nHg.await(500L, TimeUnit.MILLISECONDS)) {
            XoT.C.qie(this, new Function0() { // from class: Di.l3D
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vd.a();
                }
            });
        }
        if (d2 > this.nr) {
            XoT.C.qie(this, new Function0() { // from class: Di.M
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vd.I();
                }
            });
            this.nY = M7;
            ArraysKt.fill$default(dst, 0.0f, 0, 0, 6, (Object) null);
            return;
        }
        double d5 = this.ViF;
        if (0.0d <= d5 && d5 <= d2) {
            XoT.C.qie(this, new Function0() { // from class: Di.rv6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vd.GR();
                }
            });
            this.nY = M7;
            ArraysKt.fill$default(dst, 0.0f, 0, 0, 6, (Object) null);
            return;
        }
        if (this.f1559T != null) {
            XoT.C.qie(this, new Function0() { // from class: Di.Dsr
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vd.Nxk();
                }
            });
            this.nY = M7;
            ArraysKt.fill$default(dst, 0.0f, 0, 0, 6, (Object) null);
            return;
        }
        if (!this.f1556N) {
            XoT.C.qie(this, new Function0() { // from class: Di.aC
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vd.Y();
                }
            });
            this.nY = M7;
            ArraysKt.fill$default(dst, 0.0f, 0, 0, 6, (Object) null);
            return;
        }
        if (M7 == 0) {
            XoT.C.qie(this, new Function0() { // from class: Di.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vd.k();
                }
            });
            this.nY = null;
            ArraysKt.fill$default(dst, 0.0f, 0, 0, 6, (Object) null);
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = M7;
        int i5 = 2;
        final double dNr = dNHg - M7.nr();
        double d6 = 2;
        int i7 = 0;
        if (dNr >= (-(graph.nr() * ((double) graph.O()) * d6))) {
            if (dNr <= ((double) graph.O()) * graph.nr() * d6) {
                break;
            }
            if (dNr < 1.0d) {
                while (((j) objectRef.element).nr() + (((double) graph.O()) * graph.nr()) < dNHg) {
                    int i8 = i7;
                    int i9 = i5;
                    final double d7 = dNr;
                    final double d8 = dNHg;
                    dNHg = d8;
                    XoT.C.qie(this, new Function0() { // from class: Di.Ew
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return vd.eTf(d7, objectRef, graph, d8);
                        }
                    });
                    this.Ik.put(objectRef.element);
                    ?? M72 = M7();
                    if (M72 == 0) {
                        jVar = null;
                        vdVar = this;
                        i2 = i9;
                        i3 = i8;
                        break;
                    }
                    objectRef.element = M72;
                    i5 = i9;
                    i7 = i8;
                    dNr = d7;
                }
            } else {
                XoT.C.qie(this, new Function0() { // from class: Di.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return vd.xg(dNr);
                    }
                });
                final long jT2 = ((j) objectRef.element).t() + 1;
                jVar = null;
                i2 = 2;
                i3 = 0;
                vdVar = this;
                this.xMQ.put(new Function0() { // from class: Di.qf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return vd.pJg(this.f1550n, jT2, dNHg);
                    }
                });
                float[] fArrN = ((j) objectRef.element).n();
                float[] fArr = vdVar.f1562e;
                System.arraycopy(fArrN, 0, fArr, 0, fArr.length);
                while (((j) objectRef.element).t() < jT2) {
                    vdVar.Ik.put(objectRef.element);
                    ?? M73 = vdVar.M7();
                    if (M73 == 0) {
                        break;
                    } else {
                        objectRef.element = M73;
                    }
                }
                while (((j) objectRef.element).nr() + (((double) graph.O()) * graph.nr()) < dNHg) {
                    XoT.C.qie(vdVar, new Function0() { // from class: Di.Ln
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return vd.C(objectRef, graph, dNHg);
                        }
                    });
                    vdVar.Ik.put(objectRef.element);
                    ?? M74 = vdVar.M7();
                    if (M74 == 0) {
                        break;
                    } else {
                        objectRef.element = M74;
                    }
                }
            }
            if (d2 >= vdVar.f1567t - (((double) graph.O()) * graph.nr())) {
                XoT.C.qie(vdVar, new Function0() { // from class: Di.lej
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return vd.Mx(d2, vdVar);
                    }
                });
                vdVar.nY = (j) objectRef.element;
                ArraysKt.fill$default(dst, 0.0f, 0, 0, 6, (Object) null);
                return;
            }
            vdVar.nY = jVar;
            tF.j jVar3 = tF.j.f73449n;
            jVar3.t();
            jVar3.O();
            System.arraycopy(((j) objectRef.element).n(), i3, dst, i3, dst.length);
            vdVar.Ik.put(objectRef.element);
            final long jNanoTime2 = System.nanoTime() - jNanoTime;
            if (jNanoTime2 > ((long) ((((double) graph.O()) * graph.nr()) * 1.0E9d)) / ((long) i2)) {
                XoT.C.qie(vdVar, new Function0() { // from class: Di.iwV
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return vd.G7(jNanoTime2);
                    }
                });
                return;
            }
            return;
        }
        if (dNr > -1.0d) {
            XoT.C.qie(this, new Function0() { // from class: Di.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vd.dR0(dNr);
                }
            });
            this.nY = (j) objectRef.element;
            ArraysKt.fill$default(dst, 0.0f, 0, 0, 6, (Object) null);
            return;
        }
        XoT.C.qie(this, new Function0() { // from class: Di.qz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.z(dNr);
            }
        });
        final long jT3 = 1 + ((j) objectRef.element).t();
        this.xMQ.put(new Function0() { // from class: Di.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.piY(this.f1519n, jT3, dNHg);
            }
        });
        float[] fArrN2 = ((j) objectRef.element).n();
        float[] fArr2 = this.f1562e;
        System.arraycopy(fArrN2, 0, fArr2, 0, fArr2.length);
        while (((j) objectRef.element).t() < jT3) {
            this.Ik.put(objectRef.element);
            ?? M75 = M7();
            if (M75 == 0) {
                break;
            } else {
                objectRef.element = M75;
            }
        }
        while (((j) objectRef.element).nr() + (((double) graph.O()) * graph.nr()) < dNHg) {
            XoT.C.qie(this, new Function0() { // from class: Di.Xo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vd.m(objectRef, graph, dNHg);
                }
            });
            this.Ik.put(objectRef.element);
            ?? M76 = M7();
            if (M76 == 0) {
                break;
            } else {
                objectRef.element = M76;
            }
        }
        i3 = i7;
        i2 = i5;
        jVar = null;
        vdVar = this;
        if (d2 >= vdVar.f1567t - (((double) graph.O()) * graph.nr())) {
        }
    }

    @Override // Di.CN3.AbstractC0060CN3
    public void rl() throws InterruptedException {
        tF.j.f73449n.t();
        tF.n.n(this, null);
        this.xMQ.put(new Function0() { // from class: Di.eO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.fcU(this.f1539n);
            }
        });
        this.wTp.await();
        super.rl();
    }

    public vd(Hr.Dsr extractor, CN3 graph, double d2, double d4, double d5, double d6, boolean z2, String debugTag) {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        this.f1564n = extractor;
        this.rl = graph;
        this.f1567t = d2;
        this.nr = d4;
        this.f1557O = d5;
        this.J2 = d6;
        this.Uo = z2;
        this.xMQ = new LinkedBlockingQueue();
        this.mUb = 0.15d;
        this.gh = 3;
        this.qie = 20;
        this.az = true;
        this.ck = new ArrayBlockingQueue(3);
        this.Ik = new ArrayBlockingQueue(3);
        this.XQ = new MediaCodec.BufferInfo();
        this.f1558S = new ArrayList();
        this.ViF = -1.0d;
        this.te = true;
        this.E2 = new Mgn.s4(graph.t(), com.alightcreative.app.motion.persist.j.INSTANCE.getAudioResamplerType());
        this.f1562e = new float[graph.O() * graph.t()];
        this.nHg = new CountDownLatch(1);
        ThreadsKt.thread$default(false, false, null, "MediaCodecInputNode:" + debugTag, 0, new Function0() { // from class: Di.fuX
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.N(this.f1540n);
            }
        }, 23, null);
        this.wTp = new CountDownLatch(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String G7(long j2) {
        long j3 = 1000000;
        return "Stalled for " + (j2 / j3) + "." + StringsKt.padStart(String.valueOf((j2 % j3) / ((long) 1000)), 3, '0') + "ms";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(vd vdVar) throws SRC_ERR_BAD_SRC_RATIO, InterruptedException, SRC_ERR_BAD_PROC_PTR, SRC_ERR_BAD_STATE, SRC_ERR_BAD_MODE, SRC_ERR_BAD_DATA_PTR {
        if (!vdVar.eF()) {
            vdVar.p5();
            return Unit.INSTANCE;
        }
        while (vdVar.az) {
            boolean z2 = vdVar.f1556N;
            vdVar.f1556N = true;
            if (!z2) {
                vdVar.nHg.countDown();
            }
            Function0 function0 = (Function0) vdVar.xMQ.poll();
            if (function0 != null) {
                function0.invoke();
            }
            if (vdVar.az) {
                vdVar.s7N();
            }
        }
        vdVar.f1556N = false;
        vdVar.p5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rV9(int i2, long j2, int i3, n nVar, double d2) {
        return "Inferring from buffer: deferredBytes=" + i2 + " deferredTime=" + j2 + " bytesPerSample=" + i3 + HFAkacKHsU.BNVjqzBmSa + nVar.rl() + " deferredSampleRate=" + nVar.nr() + " rawBytesPerSample=" + d2;
    }
}
