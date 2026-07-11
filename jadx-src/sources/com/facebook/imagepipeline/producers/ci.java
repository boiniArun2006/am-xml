package com.facebook.imagepipeline.producers;

import bA.C1653C;
import com.facebook.imagepipeline.request.j;
import ln.InterfaceC2269w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class ci implements l4Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final FSZ.Ml f52541O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Hh.qz f52542n;
    private final FSZ.Ml nr;
    private final FSZ.aC rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final l4Z f52543t;

    private static class j extends AbstractC1863c {
        private final FSZ.Ml J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final FSZ.aC f52544O;
        private final FSZ.Ml Uo;
        private final Hh.qz nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final mz f52545t;

        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(C1653C c1653c, int i2) {
            try {
                if (T5.n.nr()) {
                    T5.n.n("EncodedProbeProducer#onNewResultImpl");
                }
                if (!w6.O(i2) && c1653c != null && !w6.qie(i2, 10) && c1653c.p5() != com.facebook.imageformat.w6.nr) {
                    com.facebook.imagepipeline.request.j jVarM = this.f52545t.M();
                    lN.Ml mlNr = this.f52544O.nr(jVarM, this.f52545t.n());
                    this.J2.n(mlNr);
                    if ("memory_encoded".equals(this.f52545t.z("origin"))) {
                        if (!this.Uo.rl(mlNr)) {
                            boolean z2 = jVarM.nr() == j.n.SMALL;
                            InterfaceC2269w6 interfaceC2269w6 = (InterfaceC2269w6) this.nr.get();
                            (z2 ? interfaceC2269w6.n() : interfaceC2269w6.rl()).O(mlNr);
                            this.Uo.n(mlNr);
                        }
                    } else if ("disk".equals(this.f52545t.z("origin"))) {
                        this.Uo.n(mlNr);
                    }
                    HI().rl(c1653c, i2);
                    if (T5.n.nr()) {
                        T5.n.rl();
                        return;
                    }
                    return;
                }
                HI().rl(c1653c, i2);
                if (T5.n.nr()) {
                    T5.n.rl();
                }
            } catch (Throwable th) {
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                throw th;
            }
        }

        public j(Pl pl, mz mzVar, Hh.qz qzVar, FSZ.aC aCVar, FSZ.Ml ml, FSZ.Ml ml2) {
            super(pl);
            this.f52545t = mzVar;
            this.nr = qzVar;
            this.f52544O = aCVar;
            this.J2 = ml;
            this.Uo = ml2;
        }
    }

    protected String t() {
        return "EncodedProbeProducer";
    }

    public ci(Hh.qz qzVar, FSZ.aC aCVar, FSZ.Ml ml, FSZ.Ml ml2, l4Z l4z) {
        this.f52542n = qzVar;
        this.rl = aCVar;
        this.nr = ml;
        this.f52541O = ml2;
        this.f52543t = l4z;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        try {
            if (T5.n.nr()) {
                T5.n.n("EncodedProbeProducer#produceResults");
            }
            InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
            interfaceC1866pM7.nr(mzVar, t());
            j jVar = new j(pl, mzVar, this.f52542n, this.rl, this.nr, this.f52541O);
            interfaceC1866pM7.mUb(mzVar, "EncodedProbeProducer", null);
            if (T5.n.nr()) {
                T5.n.n("mInputProducer.produceResult");
            }
            this.f52543t.n(jVar, mzVar);
            if (T5.n.nr()) {
                T5.n.rl();
            }
            if (T5.n.nr()) {
                T5.n.rl();
            }
        } finally {
        }
    }
}
