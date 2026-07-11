package com.facebook.imagepipeline.producers;

import Hr.CQ.USEaHtCMH;
import com.facebook.imagepipeline.request.j;
import ln.InterfaceC2269w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class C implements l4Z {
    private final FSZ.Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final FSZ.Ml f52447O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FSZ.Q f52448n;
    private final l4Z nr;
    private final Hh.qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FSZ.aC f52449t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    private static class j extends AbstractC1863c {
        private final FSZ.aC J2;
        private final FSZ.Ml KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Hh.qz f52450O;
        private final FSZ.Ml Uo;
        private final FSZ.Q nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final mz f52451t;

        public j(Pl pl, mz mzVar, FSZ.Q q2, Hh.qz qzVar, FSZ.aC aCVar, FSZ.Ml ml, FSZ.Ml ml2) {
            super(pl);
            this.f52451t = mzVar;
            this.nr = q2;
            this.f52450O = qzVar;
            this.J2 = aCVar;
            this.Uo = ml;
            this.KN = ml2;
        }

        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(Pj0.j jVar, int i2) {
            boolean z2;
            FSZ.Dsr dsrRl;
            try {
                if (T5.n.nr()) {
                    T5.n.n("BitmapProbeProducer#onNewResultImpl");
                }
                if (!w6.O(i2) && jVar != null && !w6.qie(i2, 8)) {
                    com.facebook.imagepipeline.request.j jVarM = this.f52451t.M();
                    lN.Ml mlNr = this.J2.nr(jVarM, this.f52451t.n());
                    String str = (String) this.f52451t.z("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f52451t.Uo().getExperiments().fD() && !this.Uo.rl(mlNr)) {
                            this.nr.rl(mlNr);
                            this.Uo.n(mlNr);
                        }
                        if (this.f52451t.Uo().getExperiments().te() && !this.KN.rl(mlNr)) {
                            if (jVarM.nr() == j.n.SMALL) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            InterfaceC2269w6 interfaceC2269w6 = (InterfaceC2269w6) this.f52450O.get();
                            if (z2) {
                                dsrRl = interfaceC2269w6.n();
                            } else {
                                dsrRl = interfaceC2269w6.rl();
                            }
                            dsrRl.O(mlNr);
                            this.KN.n(mlNr);
                        }
                    }
                    HI().rl(jVar, i2);
                    if (T5.n.nr()) {
                        T5.n.rl();
                        return;
                    }
                    return;
                }
                HI().rl(jVar, i2);
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
    }

    protected String t() {
        return "BitmapProbeProducer";
    }

    public C(FSZ.Q q2, Hh.qz qzVar, FSZ.aC aCVar, FSZ.Ml ml, FSZ.Ml ml2, l4Z l4z) {
        this.f52448n = q2;
        this.rl = qzVar;
        this.f52449t = aCVar;
        this.f52447O = ml;
        this.J2 = ml2;
        this.nr = l4z;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        try {
            if (T5.n.nr()) {
                T5.n.n("BitmapProbeProducer#produceResults");
            }
            InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
            interfaceC1866pM7.nr(mzVar, t());
            j jVar = new j(pl, mzVar, this.f52448n, this.rl, this.f52449t, this.f52447O, this.J2);
            interfaceC1866pM7.mUb(mzVar, "BitmapProbeProducer", null);
            if (T5.n.nr()) {
                T5.n.n(USEaHtCMH.GkACcrdyCR);
            }
            this.nr.n(jVar, mzVar);
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
