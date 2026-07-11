package com.facebook.imagepipeline.producers;

import com.caoccao.javet.values.primitive.V8ValueBoolean;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class yg implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FSZ.Q f52622n;
    private final FSZ.aC rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final l4Z f52623t;

    public static class j extends AbstractC1863c {
        private final boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final FSZ.Q f52624O;
        private final boolean nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final lN.Ml f52625t;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(Pj0.j jVar, int i2) {
            if (jVar == null) {
                if (w6.nr(i2)) {
                    HI().rl(null, i2);
                }
            } else if (!w6.O(i2) || this.nr) {
                Pj0.j jVarO = this.J2 ? this.f52624O.O(this.f52625t, jVar) : null;
                try {
                    HI().t(1.0f);
                    Pl plHI = HI();
                    if (jVarO != null) {
                        jVar = jVarO;
                    }
                    plHI.rl(jVar, i2);
                } finally {
                    Pj0.j.M7(jVarO);
                }
            }
        }

        public j(Pl pl, lN.Ml ml, boolean z2, FSZ.Q q2, boolean z3) {
            super(pl);
            this.f52625t = ml;
            this.nr = z2;
            this.f52624O = q2;
            this.J2 = z3;
        }
    }

    protected String t() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }

    public yg(FSZ.Q q2, FSZ.aC aCVar, l4Z l4z) {
        this.f52622n = q2;
        this.rl = aCVar;
        this.f52623t = l4z;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        Pj0.j jVar;
        InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
        com.facebook.imagepipeline.request.j jVarM = mzVar.M();
        Object objN = mzVar.n();
        Ic.n nVarAz = jVarM.az();
        if (nVarAz != null && nVarAz.n() != null) {
            interfaceC1866pM7.nr(mzVar, t());
            lN.Ml mlT = this.rl.t(jVarM, objN);
            Map mapOf = null;
            if (mzVar.M().nY(1)) {
                jVar = this.f52622n.get(mlT);
            } else {
                jVar = null;
            }
            if (jVar != null) {
                String strT = t();
                if (interfaceC1866pM7.J2(mzVar, t())) {
                    mapOf = Hh.CN3.of("cached_value_found", "true");
                }
                interfaceC1866pM7.mUb(mzVar, strT, mapOf);
                interfaceC1866pM7.rl(mzVar, "PostprocessedBitmapMemoryCacheProducer", true);
                mzVar.Z("memory_bitmap", "postprocessed");
                pl.t(1.0f);
                pl.rl(jVar, 1);
                jVar.close();
                return;
            }
            j jVar2 = new j(pl, mlT, false, this.f52622n, mzVar.M().nY(2));
            String strT2 = t();
            if (interfaceC1866pM7.J2(mzVar, t())) {
                mapOf = Hh.CN3.of("cached_value_found", V8ValueBoolean.FALSE);
            }
            interfaceC1866pM7.mUb(mzVar, strT2, mapOf);
            this.f52623t.n(jVar2, mzVar);
            return;
        }
        this.f52623t.n(pl, mzVar);
    }
}
