package com.facebook.imagepipeline.producers;

import android.net.Uri;
import bA.C1653C;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import dX.C1954n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import ln.InterfaceC2269w6;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C1864m implements l4Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final l4Z f52577O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Hh.qz f52578n;
    private final A72.j nr;
    private final FSZ.aC rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final A72.fuX f52579t;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m$j */
    class j implements ePk.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC1866p f52581n;
        final /* synthetic */ lN.Ml nr;
        final /* synthetic */ mz rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Pl f52582t;

        j(InterfaceC1866p interfaceC1866p, mz mzVar, Pl pl, lN.Ml ml) {
            this.f52581n = interfaceC1866p;
            this.rl = mzVar;
            this.f52582t = pl;
            this.nr = ml;
        }

        @Override // ePk.Ml
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Void n(ePk.I28 i28) {
            if (C1864m.Uo(i28)) {
                this.f52581n.t(this.rl, "PartialDiskCacheProducer", null);
                this.f52582t.n();
            } else if (i28.ty()) {
                this.f52581n.gh(this.rl, "PartialDiskCacheProducer", i28.xMQ(), null);
                C1864m.this.xMQ(this.f52582t, this.rl, this.nr, null);
            } else {
                C1653C c1653c = (C1653C) i28.mUb();
                if (c1653c != null) {
                    InterfaceC1866p interfaceC1866p = this.f52581n;
                    mz mzVar = this.rl;
                    interfaceC1866p.mUb(mzVar, "PartialDiskCacheProducer", C1864m.J2(interfaceC1866p, mzVar, true, c1653c.getSize()));
                    C1954n c1954nO = C1954n.O(c1653c.getSize() - 1);
                    c1653c.T3L(c1954nO);
                    int size = c1653c.getSize();
                    com.facebook.imagepipeline.request.j jVarM = this.rl.M();
                    if (c1954nO.rl(jVarM.t())) {
                        this.rl.Z("disk", "partial");
                        this.f52581n.rl(this.rl, "PartialDiskCacheProducer", true);
                        this.f52582t.rl(c1653c, 9);
                    } else {
                        this.f52582t.rl(c1653c, 8);
                        C1864m.this.xMQ(this.f52582t, new KH(ImageRequestBuilder.rl(jVarM).ViF(C1954n.t(size - 1)).n(), this.rl), this.nr, c1653c);
                    }
                } else {
                    InterfaceC1866p interfaceC1866p2 = this.f52581n;
                    mz mzVar2 = this.rl;
                    interfaceC1866p2.mUb(mzVar2, "PartialDiskCacheProducer", C1864m.J2(interfaceC1866p2, mzVar2, false, 0));
                    C1864m.this.xMQ(this.f52582t, this.rl, this.nr, c1653c);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m$n */
    class n extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f52583n;

        n(AtomicBoolean atomicBoolean) {
            this.f52583n = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.OU
        public void rl() {
            this.f52583n.set(true);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m$w6 */
    private static class w6 extends AbstractC1863c {
        private final A72.j J2;
        private final boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final A72.fuX f52584O;
        private final C1653C Uo;
        private final lN.Ml nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Hh.qz f52585t;

        private w6(Pl pl, Hh.qz qzVar, lN.Ml ml, A72.fuX fux, A72.j jVar, C1653C c1653c, boolean z2) {
            super(pl);
            this.f52585t = qzVar;
            this.nr = ml;
            this.f52584O = fux;
            this.J2 = jVar;
            this.Uo = c1653c;
            this.KN = z2;
        }

        private void ck(InputStream inputStream, OutputStream outputStream, int i2) throws IOException {
            byte[] bArr = (byte[]) this.J2.get(16384);
            int i3 = i2;
            while (i3 > 0) {
                try {
                    int i5 = inputStream.read(bArr, 0, Math.min(16384, i3));
                    if (i5 < 0) {
                        break;
                    } else if (i5 > 0) {
                        outputStream.write(bArr, 0, i5);
                        i3 -= i5;
                    }
                } finally {
                    this.J2.n(bArr);
                }
            }
            if (i3 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i2), Integer.valueOf(i3)));
            }
        }

        private A72.aC Ik(C1653C c1653c, C1653C c1653c2) throws IOException {
            int i2 = ((C1954n) Hh.C.Uo(c1653c2.jB())).f63522n;
            A72.aC aCVarO = this.f52584O.O(c1653c2.getSize() + i2);
            ck(c1653c.M(), aCVarO, i2);
            ck(c1653c2.M(), aCVarO, c1653c2.getSize());
            return aCVarO;
        }

        private void o(A72.aC aCVar) throws Throwable {
            C1653C c1653c;
            Throwable th;
            Pj0.j jVarA = Pj0.j.a(aCVar.n());
            try {
                c1653c = new C1653C(jVarA);
                try {
                    c1653c.Org();
                    HI().rl(c1653c, 1);
                    C1653C.Uo(c1653c);
                    Pj0.j.M7(jVarA);
                } catch (Throwable th2) {
                    th = th2;
                    C1653C.Uo(c1653c);
                    Pj0.j.M7(jVarA);
                    throw th;
                }
            } catch (Throwable th3) {
                c1653c = null;
                th = th3;
            }
        }

        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void KN(C1653C c1653c, int i2) {
            if (!com.facebook.imagepipeline.producers.w6.O(i2)) {
                if (this.Uo != null && c1653c != null && c1653c.jB() != null) {
                    try {
                        try {
                            o(Ik(this.Uo, c1653c));
                        } catch (IOException e2) {
                            Dzy.j.xMQ("PartialDiskCacheProducer", "Error while merging image data", e2);
                            HI().onFailure(e2);
                        }
                        ((InterfaceC2269w6) this.f52585t.get()).rl().az(this.nr);
                        return;
                    } finally {
                        c1653c.close();
                        this.Uo.close();
                    }
                }
                if (this.KN && com.facebook.imagepipeline.producers.w6.az(i2, 8) && com.facebook.imagepipeline.producers.w6.nr(i2) && c1653c != null && c1653c.p5() != com.facebook.imageformat.w6.nr) {
                    ((InterfaceC2269w6) this.f52585t.get()).rl().mUb(this.nr, c1653c);
                    HI().rl(c1653c, i2);
                } else {
                    HI().rl(c1653c, i2);
                }
            }
        }
    }

    static Map J2(InterfaceC1866p interfaceC1866p, mz mzVar, boolean z2, int i2) {
        if (interfaceC1866p.J2(mzVar, "PartialDiskCacheProducer")) {
            return z2 ? Hh.CN3.of("cached_value_found", String.valueOf(z2), "encodedImageSize", String.valueOf(i2)) : Hh.CN3.of("cached_value_found", String.valueOf(z2));
        }
        return null;
    }

    private void mUb(AtomicBoolean atomicBoolean, mz mzVar) {
        mzVar.rl(new n(atomicBoolean));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xMQ(Pl pl, mz mzVar, lN.Ml ml, C1653C c1653c) {
        this.f52577O.n(new w6(pl, this.f52578n, ml, this.f52579t, this.nr, c1653c, mzVar.M().nY(32)), mzVar);
    }

    public C1864m(Hh.qz qzVar, FSZ.aC aCVar, A72.fuX fux, A72.j jVar, l4Z l4z) {
        this.f52578n = qzVar;
        this.rl = aCVar;
        this.f52579t = fux;
        this.nr = jVar;
        this.f52577O = l4z;
    }

    private ePk.Ml KN(Pl pl, mz mzVar, lN.Ml ml) {
        return new j(mzVar.M7(), mzVar, pl, ml);
    }

    private static Uri O(com.facebook.imagepipeline.request.j jVar) {
        return jVar.WPU().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Uo(ePk.I28 i28) {
        if (!i28.qie()) {
            if (!i28.ty() || !(i28.xMQ() instanceof CancellationException)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        com.facebook.imagepipeline.request.j jVarM = mzVar.M();
        boolean zNY = mzVar.M().nY(16);
        boolean zNY2 = mzVar.M().nY(32);
        if (!zNY && !zNY2) {
            this.f52577O.n(pl, mzVar);
            return;
        }
        InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
        interfaceC1866pM7.nr(mzVar, "PartialDiskCacheProducer");
        lN.Ml mlRl = this.rl.rl(jVarM, O(jVarM), mzVar.n());
        if (!zNY) {
            interfaceC1866pM7.mUb(mzVar, "PartialDiskCacheProducer", J2(interfaceC1866pM7, mzVar, false, 0));
            xMQ(pl, mzVar, mlRl, null);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ((InterfaceC2269w6) this.f52578n.get()).rl().Uo(mlRl, atomicBoolean).O(KN(pl, mzVar, mlRl));
            mUb(atomicBoolean, mzVar);
        }
    }
}
