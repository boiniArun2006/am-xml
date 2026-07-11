package com.facebook.imagepipeline.producers;

import bA.C1653C;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.facebook.imagepipeline.request.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class SPz implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FSZ.Q f52514n;
    private final FSZ.aC rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final l4Z f52515t;

    private static class j extends AbstractC1863c {
        private final boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f52516O;
        private final lN.Ml nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final FSZ.Q f52517t;

        public j(Pl pl, FSZ.Q q2, lN.Ml ml, boolean z2, boolean z3) {
            super(pl);
            this.f52517t = q2;
            this.nr = ml;
            this.f52516O = z2;
            this.J2 = z3;
        }

        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(C1653C c1653c, int i2) {
            Pj0.j jVarO;
            try {
                if (T5.n.nr()) {
                    T5.n.n("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!w6.O(i2) && c1653c != null && !w6.qie(i2, 10) && c1653c.p5() != com.facebook.imageformat.w6.nr) {
                    Pj0.j jVarT = c1653c.T();
                    if (jVarT != null) {
                        try {
                            if (this.J2 && this.f52516O) {
                                jVarO = this.f52517t.O(this.nr, jVarT);
                            } else {
                                jVarO = null;
                            }
                            if (jVarO != null) {
                                try {
                                    C1653C c1653c2 = new C1653C(jVarO);
                                    c1653c2.Z(c1653c);
                                    try {
                                        HI().t(1.0f);
                                        HI().rl(c1653c2, i2);
                                        if (T5.n.nr()) {
                                            T5.n.rl();
                                            return;
                                        }
                                        return;
                                    } finally {
                                        C1653C.Uo(c1653c2);
                                    }
                                } finally {
                                    Pj0.j.M7(jVarO);
                                }
                            }
                        } finally {
                            Pj0.j.M7(jVarT);
                        }
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
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        try {
            if (T5.n.nr()) {
                T5.n.n("EncodedMemoryCacheProducer#produceResults");
            }
            InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
            interfaceC1866pM7.nr(mzVar, "EncodedMemoryCacheProducer");
            lN.Ml mlNr = this.rl.nr(mzVar.M(), mzVar.n());
            Pj0.j jVar = mzVar.M().nY(4) ? this.f52514n.get(mlNr) : null;
            try {
                if (jVar != null) {
                    C1653C c1653c = new C1653C(jVar);
                    try {
                        interfaceC1866pM7.mUb(mzVar, "EncodedMemoryCacheProducer", interfaceC1866pM7.J2(mzVar, "EncodedMemoryCacheProducer") ? Hh.CN3.of("cached_value_found", "true") : null);
                        interfaceC1866pM7.rl(mzVar, "EncodedMemoryCacheProducer", true);
                        mzVar.U("memory_encoded");
                        pl.t(1.0f);
                        pl.rl(c1653c, 1);
                        C1653C.Uo(c1653c);
                        Pj0.j.M7(jVar);
                        if (T5.n.nr()) {
                            T5.n.rl();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C1653C.Uo(c1653c);
                        throw th;
                    }
                }
                if (mzVar.Mx().rl() < j.w6.ENCODED_MEMORY_CACHE.rl()) {
                    j jVar2 = new j(pl, this.f52514n, mlNr, mzVar.M().nY(8), mzVar.Uo().getExperiments().iF());
                    interfaceC1866pM7.mUb(mzVar, "EncodedMemoryCacheProducer", interfaceC1866pM7.J2(mzVar, "EncodedMemoryCacheProducer") ? Hh.CN3.of("cached_value_found", V8ValueBoolean.FALSE) : null);
                    this.f52515t.n(jVar2, mzVar);
                    Pj0.j.M7(jVar);
                    if (T5.n.nr()) {
                        T5.n.rl();
                        return;
                    }
                    return;
                }
                interfaceC1866pM7.mUb(mzVar, "EncodedMemoryCacheProducer", interfaceC1866pM7.J2(mzVar, "EncodedMemoryCacheProducer") ? Hh.CN3.of("cached_value_found", V8ValueBoolean.FALSE) : null);
                interfaceC1866pM7.rl(mzVar, "EncodedMemoryCacheProducer", false);
                mzVar.Z("memory_encoded", "nil-result");
                pl.rl(null, 1);
                Pj0.j.M7(jVar);
                if (T5.n.nr()) {
                    T5.n.rl();
                }
            } catch (Throwable th2) {
                Pj0.j.M7(jVar);
                throw th2;
            }
        } finally {
        }
    }

    public SPz(FSZ.Q q2, FSZ.aC aCVar, l4Z l4z) {
        this.f52514n = q2;
        this.rl = aCVar;
        this.f52515t = l4z;
    }
}
