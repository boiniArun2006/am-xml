package com.facebook.imagepipeline.producers;

import bA.C1653C;
import com.facebook.imagepipeline.producers.DiskCacheDecision;
import com.facebook.imagepipeline.request.j;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import ln.InterfaceC2269w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class s4 implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Hh.qz f52608n;
    private final FSZ.aC rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final l4Z f52609t;

    class j implements ePk.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC1866p f52610n;
        final /* synthetic */ mz rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Pl f52611t;

        j(InterfaceC1866p interfaceC1866p, mz mzVar, Pl pl) {
            this.f52610n = interfaceC1866p;
            this.rl = mzVar;
            this.f52611t = pl;
        }

        @Override // ePk.Ml
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Void n(ePk.I28 i28) {
            if (s4.J2(i28)) {
                this.f52610n.t(this.rl, "DiskCacheProducer", null);
                this.f52611t.n();
            } else if (i28.ty()) {
                this.f52610n.gh(this.rl, "DiskCacheProducer", i28.xMQ(), null);
                s4.this.f52609t.n(this.f52611t, this.rl);
            } else {
                C1653C c1653c = (C1653C) i28.mUb();
                if (c1653c != null) {
                    InterfaceC1866p interfaceC1866p = this.f52610n;
                    mz mzVar = this.rl;
                    interfaceC1866p.mUb(mzVar, "DiskCacheProducer", s4.O(interfaceC1866p, mzVar, true, c1653c.getSize()));
                    this.f52610n.rl(this.rl, "DiskCacheProducer", true);
                    this.rl.U("disk");
                    this.f52611t.t(1.0f);
                    this.f52611t.rl(c1653c, 1);
                    c1653c.close();
                } else {
                    InterfaceC1866p interfaceC1866p2 = this.f52610n;
                    mz mzVar2 = this.rl;
                    interfaceC1866p2.mUb(mzVar2, "DiskCacheProducer", s4.O(interfaceC1866p2, mzVar2, false, 0));
                    s4.this.f52609t.n(this.f52611t, this.rl);
                }
            }
            return null;
        }
    }

    class n extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f52612n;

        n(AtomicBoolean atomicBoolean) {
            this.f52612n = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.OU
        public void rl() {
            this.f52612n.set(true);
        }
    }

    static Map O(InterfaceC1866p interfaceC1866p, mz mzVar, boolean z2, int i2) {
        if (interfaceC1866p.J2(mzVar, "DiskCacheProducer")) {
            return z2 ? Hh.CN3.of("cached_value_found", String.valueOf(z2), "encodedImageSize", String.valueOf(i2)) : Hh.CN3.of("cached_value_found", String.valueOf(z2));
        }
        return null;
    }

    private void xMQ(AtomicBoolean atomicBoolean, mz mzVar) {
        mzVar.rl(new n(atomicBoolean));
    }

    public s4(Hh.qz qzVar, FSZ.aC aCVar, l4Z l4z) {
        this.f52608n = qzVar;
        this.rl = aCVar;
        this.f52609t = l4z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean J2(ePk.I28 i28) {
        if (!i28.qie()) {
            if (!i28.ty() || !(i28.xMQ() instanceof CancellationException)) {
                return false;
            }
            return true;
        }
        return true;
    }

    private ePk.Ml KN(Pl pl, mz mzVar) {
        return new j(mzVar.M7(), mzVar, pl);
    }

    private void Uo(Pl pl, mz mzVar) {
        if (mzVar.Mx().rl() >= j.w6.DISK_CACHE.rl()) {
            mzVar.Z("disk", "nil-result_read");
            pl.rl(null, 1);
        } else {
            this.f52609t.n(pl, mzVar);
        }
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        com.facebook.imagepipeline.request.j jVarM = mzVar.M();
        if (!mzVar.M().nY(16)) {
            Uo(pl, mzVar);
            return;
        }
        mzVar.M7().nr(mzVar, "DiskCacheProducer");
        lN.Ml mlNr = this.rl.nr(jVarM, mzVar.n());
        InterfaceC2269w6 interfaceC2269w6 = (InterfaceC2269w6) this.f52608n.get();
        FSZ.Dsr dsrN = DiskCacheDecision.n(jVarM, interfaceC2269w6.n(), interfaceC2269w6.rl(), interfaceC2269w6.t());
        if (dsrN == null) {
            mzVar.M7().gh(mzVar, "DiskCacheProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(jVarM.nr().ordinal()).toString()), null);
            Uo(pl, mzVar);
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        dsrN.Uo(mlNr, atomicBoolean).O(KN(pl, mzVar));
        xMQ(atomicBoolean, mzVar);
    }
}
