package C6;

import android.content.Context;
import android.media.MediaFormat;
import android.opengl.GLES20;
import com.alightcreative.deviceinfo.codectest.CodecTestException;
import com.alightcreative.deviceinfo.codectest.DecoderTestException;
import com.alightcreative.deviceinfo.codectest.EncoderTestException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class l3D {
    private r J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f766O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s4 f767n;
    private final List nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final RzR f768t;

    public l3D(s4 params, Context context) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f767n = params;
        Context appContext = context.getApplicationContext();
        this.rl = appContext;
        Ew ewN = AbstractC1313c.n(params);
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        this.f768t = new RzR(ewN, appContext);
        this.nr = new ArrayList();
        this.J2 = new r(Z.f744n, CollectionsKt.emptyList(), params, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String N(int i2, l3D l3d, long j2, Ref.ObjectRef objectRef) {
        int size = l3d.nr.size();
        T t3 = objectRef.element;
        Intrinsics.checkNotNull(t3);
        return "CodecTest: reqOutputBufCount=" + i2 + " vs. decoders.size=" + size + " layerStartIntervalUs=" + j2 + " div=" + (((j) t3).nr() / j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String T(Ref.ObjectRef objectRef) {
        T t3 = objectRef.element;
        Intrinsics.checkNotNull(t3);
        long jNr = ((j) t3).nr();
        T t4 = objectRef.element;
        Intrinsics.checkNotNull(t4);
        boolean zT2 = ((j) t4).t();
        T t5 = objectRef.element;
        Intrinsics.checkNotNull(t5);
        boolean zRl = ((j) t5).rl();
        T t6 = objectRef.element;
        Intrinsics.checkNotNull(t6);
        return "CodecTest: GOT encoder output pts=" + jNr + " kf=" + zT2 + " eos=" + zRl + " size=" + ((j) t6).n().limit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ViF(Ref.IntRef intRef, Ref.IntRef intRef2) {
        return "CodecTest Progress [EOS]:  peakExtraProgressFrames=" + intRef.element + " totalExtraFrameCount=" + s7N() + " gotExtraFrames=" + intRef2.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String WPU(l3D l3d) {
        return "CodecTest: process encoder EOS (decoders=" + l3d.nr.size() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ(int i2) {
        return "CodecTest: outputFrame from decoder at " + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Z(Ref.IntRef intRef) {
        return "CodecTest Progress [RUN]:  peakExtraProgressFrames=" + intRef.element + " totalExtraFrameCount=" + s7N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN(final Ref.IntRef intRef, Function2 function2, l3D l3d, final Ref.IntRef intRef2) {
        intRef.element++;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(l3d.f767n.n() + Math.min(intRef.element, s7N())), Integer.valueOf(l3d.f767n.n() + s7N()));
        }
        XoT.C.Uo(l3d, new Function0() { // from class: C6.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l3D.ViF(intRef2, intRef);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(Ref.IntRef intRef, Ref.IntRef intRef2) {
        return "CodecTest Progress [D-OUT]:  peakExtraProgressFrames=" + intRef.element + " totalExtraFrameCount=" + s7N() + " gotExtraFrames=" + intRef2.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fD() {
        return "CodecTest: decoders still not at EOS";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String iF(int i2, long j2) {
        return "CodecTest: encode frame " + i2 + " ptsNanos=" + j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nHg() {
        return "CodecTest: start decoder";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nY(Ref.IntRef intRef, Ref.IntRef intRef2) {
        return "CodecTest Progress [E-OUT]:  peakExtraProgressFrames=" + intRef.element + " totalExtraFrameCount=" + s7N() + " gotExtraFrames=" + intRef2.element;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x04ec, code lost:
    
        r47.f768t.U();
        r0 = r47.nr.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04fb, code lost:
    
        if (r0.hasNext() == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04fd, code lost:
    
        ((C6.mz) r0.next()).J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0507, code lost:
    
        r47.J2 = C6.r.rl(r47.J2, null, null, null, r47.nr.size(), 0, 23, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x051c, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [C6.j, T] */
    /* JADX WARN: Type inference failed for: r0v47, types: [C6.j, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void o(final Function2 function2) throws InterruptedException, EncoderTestException, DecoderTestException {
        int i2;
        Iterator it;
        int i3;
        long j2;
        long j3 = 1;
        final long jJ2 = (((long) this.f767n.J2()) * 1000000) - 1;
        if (!this.f768t.wTp()) {
            this.f768t.U();
            this.J2 = r.rl(this.J2, Z.f747t, null, null, 0, 0, 30, null);
            return;
        }
        long j4 = 1000;
        long jNanoTime = System.nanoTime() / 1000;
        final Ref.IntRef intRef = new Ref.IntRef();
        int iN = this.f767n.n();
        final int i5 = 0;
        int i7 = 0;
        while (true) {
            long j5 = j3;
            long j6 = j4;
            int i8 = 1;
            if (i5 >= iN) {
                int i9 = 2;
                final Ref.IntRef intRef2 = new Ref.IntRef();
                XoT.C.Uo(this, new Function0() { // from class: C6.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l3D.WPU(this.f739n);
                    }
                });
                this.f768t.Xw(new Function0() { // from class: C6.CN3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l3D.aYN(intRef2, function2, this, intRef);
                    }
                });
                hQ hQVar = new hQ(25000L, 5000L);
                while (!this.f768t.X()) {
                    if (hQVar.n()) {
                        throw new EncoderTestException("Timeout process remaining encoder output buffers", null, 2, null);
                    }
                    final j jVarN = this.f768t.N();
                    if (jVarN != null) {
                        hQVar.rl();
                        intRef2.element++;
                        if (function2 != null) {
                            function2.invoke(Integer.valueOf(this.f767n.n() + Math.min(intRef2.element, s7N())), Integer.valueOf(this.f767n.n() + s7N()));
                        }
                        XoT.C.Uo(hQVar, new Function0() { // from class: C6.fuX
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return l3D.nY(intRef, intRef2);
                            }
                        });
                        if (hQVar.n()) {
                            throw new EncoderTestException("Timeout process remaining encoder output buffers", null, 2, null);
                        }
                        XoT.C.Uo(hQVar, new Function0() { // from class: C6.aC
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return l3D.g(jVarN);
                            }
                        });
                        Iterator it2 = this.nr.iterator();
                        while (it2.hasNext()) {
                            ((mz) it2.next()).FX(jVarN);
                        }
                    } else {
                        Thread.sleep(8L);
                        if (intRef2.element < s7N() / 2) {
                            intRef2.element++;
                            if (function2 != null) {
                                function2.invoke(Integer.valueOf(this.f767n.n() + Math.min(intRef2.element, s7N())), Integer.valueOf(this.f767n.n() + s7N()));
                            }
                            XoT.C.Uo(hQVar, new Function0() { // from class: C6.C
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return l3D.te(intRef, intRef2);
                                }
                            });
                        }
                    }
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
                Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
                j jVar = new j(byteBufferAllocate, true, false, (((long) this.f767n.n()) * 100000000000L) / ((long) this.f767n.rl()));
                Iterator it3 = this.nr.iterator();
                while (it3.hasNext()) {
                    ((mz) it3.next()).FX(jVar);
                }
                hQ hQVar2 = new hQ(25000L, 5000L);
                loop10: while (true) {
                    List<mz> list = this.nr;
                    if (list != null && list.isEmpty()) {
                        break;
                    }
                    for (mz mzVar : list) {
                        if (mzVar.eF() && !mzVar.P5()) {
                            if (hQVar2.n()) {
                                throw new DecoderTestException("Timeout process remaining decoder output", null, i9, null);
                            }
                            XoT.C.Uo(hQVar2, new Function0() { // from class: C6.o
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return l3D.fD();
                                }
                            });
                            final int i10 = 0;
                            for (Object obj : this.nr) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                final mz mzVar2 = (mz) obj;
                                XoT.C.Uo(hQVar2, new Function0() { // from class: C6.qz
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return l3D.E2(i10, mzVar2);
                                    }
                                });
                                if (mzVar2.eF()) {
                                    pq pqVarM7 = mzVar2.M7();
                                    while (pqVarM7 != null) {
                                        hQVar2.rl();
                                        intRef2.element++;
                                        if (function2 != null) {
                                            function2.invoke(Integer.valueOf(this.f767n.n() + Math.min(intRef2.element, s7N())), Integer.valueOf(this.f767n.n() + s7N()));
                                        }
                                        XoT.C.Uo(hQVar2, new Function0() { // from class: C6.Pl
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return l3D.e(intRef, intRef2);
                                            }
                                        });
                                        if (hQVar2.n()) {
                                            throw new DecoderTestException("Timeout process remaining decoder output", null, 2, null);
                                        }
                                        XoT.C.Uo(hQVar2, new Function0() { // from class: C6.Xo
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return l3D.X(i10, mzVar2);
                                            }
                                        });
                                        r rVar = this.J2;
                                        int i12 = i10;
                                        this.J2 = r.rl(rVar, null, CollectionsKt.plus((Collection<? extends kO4>) rVar.J2(), new kO4(pqVarM7.n(), (System.nanoTime() / j6) - jNanoTime, i12)), null, 0, 0, 29, null);
                                        pqVarM7 = mzVar2.M7();
                                        i10 = i12;
                                        i9 = 2;
                                    }
                                }
                                i10 = i11;
                            }
                        }
                    }
                    break loop10;
                }
            }
            Thread.sleep(j5);
            if (function2 != null) {
                function2.invoke(Integer.valueOf(i5), Integer.valueOf(this.f767n.n() + s7N()));
            }
            XoT.C.Uo(this, new Function0() { // from class: C6.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l3D.Z(intRef);
                }
            });
            final long jRl = (((long) i5) * 100000000000L) / ((long) this.f767n.rl());
            XoT.C.Uo(this, new Function0() { // from class: C6.eO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l3D.iF(i5, jRl);
                }
            });
            this.f768t.Ik(jRl);
            GLES20.glClearColor(0.7f, 0.2f, 0.5f, 1.0f);
            GLES20.glClear(17408);
            this.f768t.fD();
            i7++;
            intRef.element = Math.max(intRef.element, i7);
            if (this.f768t.s7N()) {
                hQ hQVar3 = new hQ(25000L, 5000L);
                i2 = i5;
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = this.f768t.N();
                i7 = i7;
                while (objectRef.element != 0) {
                    int i13 = i7 - 1;
                    if (hQVar3.n()) {
                        throw new EncoderTestException("Timeout processing encoder output buffers", null, 2, null);
                    }
                    if (this.J2.nr() < i8) {
                        this.J2 = r.rl(this.J2, null, null, null, 0, 1, 15, null);
                    }
                    XoT.C.Uo(hQVar3, new Function0() { // from class: C6.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l3D.T(objectRef);
                        }
                    });
                    if (((j) objectRef.element).t()) {
                        final int iMin = Math.min(this.f767n.O(), (int) (((j) objectRef.element).nr() / jJ2));
                        XoT.C.Uo(hQVar3, new Function0() { // from class: C6.QJ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return l3D.N(iMin, this, jJ2, objectRef);
                            }
                        });
                        while (this.nr.size() < iMin) {
                            XoT.C.Uo(hQVar3, new Function0() { // from class: C6.w6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return l3D.nHg();
                                }
                            });
                            MediaFormat mediaFormatNHg = this.f768t.nHg();
                            Context appContext = this.rl;
                            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                            mz mzVar3 = new mz(mediaFormatNHg, appContext, this.f767n.xMQ(), this.f767n.t(), this.nr.size() + 1);
                            if (!mzVar3.E()) {
                                mzVar3.J();
                                Iterator it4 = this.nr.iterator();
                                while (it4.hasNext()) {
                                    ((mz) it4.next()).J();
                                }
                                this.f768t.U();
                                this.J2 = r.rl(this.J2, Z.f742O, null, null, this.nr.size(), 0, 22, null);
                                return;
                            }
                            this.nr.add(mzVar3);
                            hQVar3.rl();
                        }
                    }
                    Iterator it5 = this.nr.iterator();
                    while (it5.hasNext()) {
                        ((mz) it5.next()).FX((j) objectRef.element);
                    }
                    objectRef.element = this.f768t.N();
                    i7 = i13;
                    i8 = 1;
                }
            } else {
                i2 = i5;
            }
            Iterator it6 = this.nr.iterator();
            final int i14 = 0;
            while (it6.hasNext()) {
                Object next = it6.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final mz mzVar4 = (mz) next;
                XoT.C.Uo(this, new Function0() { // from class: C6.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l3D.S(i14, mzVar4);
                    }
                });
                if (mzVar4.eF()) {
                    it = it6;
                    i3 = i7;
                    j2 = jJ2;
                    hQ hQVar4 = new hQ(25000L, 5000L);
                    pq pqVarM72 = mzVar4.M7();
                    while (pqVarM72 != null) {
                        if (hQVar4.n()) {
                            throw new DecoderTestException("Timeout process decoder output index=" + i14, null, 2, null);
                        }
                        XoT.C.Uo(hQVar4, new Function0() { // from class: C6.I28
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return l3D.XQ(i14);
                            }
                        });
                        r rVar2 = this.J2;
                        int i16 = i14;
                        this.J2 = r.rl(rVar2, null, CollectionsKt.plus((Collection<? extends kO4>) rVar2.J2(), new kO4(pqVarM72.n(), (System.nanoTime() / j6) - jNanoTime, i16)), null, 0, 0, 29, null);
                        pq pqVarM73 = mzVar4.M7();
                        hQVar4.rl();
                        i14 = i16;
                        pqVarM72 = pqVarM73;
                    }
                } else {
                    it = it6;
                    i3 = i7;
                    j2 = jJ2;
                }
                i14 = i15;
                i7 = i3;
                it6 = it;
                jJ2 = j2;
            }
            i5 = i2 + 1;
            j3 = j5;
            j4 = j6;
        }
    }

    private static final int s7N() {
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String te(Ref.IntRef intRef, Ref.IntRef intRef2) {
        return "CodecTest Progress [E-OUT/WAIT]:  peakExtraProgressFrames=" + intRef.element + " totalExtraFrameCount=" + s7N() + " gotExtraFrames=" + intRef2.element;
    }

    public final r r(Function2 function2) {
        Z z2;
        if (this.f766O) {
            throw new IllegalStateException("Check failed.");
        }
        this.f766O = true;
        try {
            try {
                o(function2);
                try {
                    this.f768t.U();
                } catch (Throwable unused) {
                }
                Iterator it = this.nr.iterator();
                while (it.hasNext()) {
                    try {
                        ((mz) it.next()).J();
                    } catch (Throwable unused2) {
                    }
                }
            } catch (CodecTestException e2) {
                XoT.C.ty(this, "Codec Test Exception", e2);
                r rVar = this.J2;
                if (e2 instanceof EncoderTestException) {
                    z2 = Z.J2;
                } else {
                    if (!(e2 instanceof DecoderTestException)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z2 = Z.f746r;
                }
                this.J2 = r.rl(rVar, z2, null, null, this.nr.size() - 1, 0, 22, null);
                try {
                    this.f768t.U();
                } catch (Throwable unused3) {
                }
                Iterator it2 = this.nr.iterator();
                while (it2.hasNext()) {
                    try {
                        ((mz) it2.next()).J();
                    } catch (Throwable unused4) {
                    }
                }
            }
            return this.J2;
        } catch (Throwable th) {
            try {
                this.f768t.U();
            } catch (Throwable unused5) {
            }
            Iterator it3 = this.nr.iterator();
            while (it3.hasNext()) {
                try {
                    ((mz) it3.next()).J();
                } catch (Throwable unused6) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E2(int i2, mz mzVar) {
        return "CodecTest: check decoder at " + i2 + " (" + mzVar.eF() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String S(int i2, mz mzVar) {
        return "CodecTest: check decoder at " + i2 + " (" + mzVar.eF() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String X(int i2, mz mzVar) {
        return "CodecTest: check decoder at " + i2 + " (" + mzVar.eF() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(j jVar) {
        return "CodecTest: GOT encoder output pts=" + jVar.nr() + " kf=" + jVar.t() + " eos=" + jVar.rl() + " size=" + jVar.n().limit();
    }
}
