package com.facebook.imagepipeline.producers;

import bA.C1653C;
import com.facebook.imagepipeline.producers.DiskCacheDecision;
import com.facebook.imagepipeline.request.j;
import ln.InterfaceC2269w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class UGc implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Hh.qz f52518n;
    private final FSZ.aC rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final l4Z f52519t;

    private static class j extends AbstractC1863c {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final FSZ.aC f52520O;
        private final Hh.qz nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final mz f52521t;

        private j(Pl pl, mz mzVar, Hh.qz qzVar, FSZ.aC aCVar) {
            super(pl);
            this.f52521t = mzVar;
            this.nr = qzVar;
            this.f52520O = aCVar;
        }

        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(C1653C c1653c, int i2) {
            this.f52521t.M7().nr(this.f52521t, "DiskCacheWriteProducer");
            if (w6.O(i2) || c1653c == null || w6.qie(i2, 10) || c1653c.p5() == com.facebook.imageformat.w6.nr) {
                this.f52521t.M7().mUb(this.f52521t, "DiskCacheWriteProducer", null);
                HI().rl(c1653c, i2);
                return;
            }
            com.facebook.imagepipeline.request.j jVarM = this.f52521t.M();
            lN.Ml mlNr = this.f52520O.nr(jVarM, this.f52521t.n());
            InterfaceC2269w6 interfaceC2269w6 = (InterfaceC2269w6) this.nr.get();
            FSZ.Dsr dsrN = DiskCacheDecision.n(jVarM, interfaceC2269w6.n(), interfaceC2269w6.rl(), interfaceC2269w6.t());
            if (dsrN != null) {
                dsrN.mUb(mlNr, c1653c);
                this.f52521t.M7().mUb(this.f52521t, "DiskCacheWriteProducer", null);
                HI().rl(c1653c, i2);
                return;
            }
            this.f52521t.M7().gh(this.f52521t, "DiskCacheWriteProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(jVarM.nr().ordinal()).toString()), null);
            HI().rl(c1653c, i2);
        }
    }

    public UGc(Hh.qz qzVar, FSZ.aC aCVar, l4Z l4z) {
        this.f52518n = qzVar;
        this.rl = aCVar;
        this.f52519t = l4z;
    }

    private void t(Pl pl, mz mzVar) {
        mz mzVar2;
        if (mzVar.Mx().rl() >= j.w6.DISK_CACHE.rl()) {
            mzVar.Z("disk", "nil-result_write");
            pl.rl(null, 1);
            return;
        }
        if (mzVar.M().nY(32)) {
            mzVar2 = mzVar;
            pl = new j(pl, mzVar2, this.f52518n, this.rl);
        } else {
            mzVar2 = mzVar;
        }
        this.f52519t.n(pl, mzVar2);
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        t(pl, mzVar);
    }
}
