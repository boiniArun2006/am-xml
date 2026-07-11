package com.facebook.imagepipeline.producers;

import bA.InterfaceC1656I28;
import bA.InterfaceC1663o;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.facebook.imagepipeline.request.j;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Dsr implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FSZ.Q f52464n;
    private final FSZ.aC rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final l4Z f52465t;

    class j extends AbstractC1863c {
        final /* synthetic */ boolean nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ lN.Ml f52467t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Pl pl, lN.Ml ml, boolean z2) {
            super(pl);
            this.f52467t = ml;
            this.nr = z2;
        }

        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(Pj0.j jVar, int i2) {
            Pj0.j jVar2;
            try {
                if (T5.n.nr()) {
                    T5.n.n("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zNr = w6.nr(i2);
                Pj0.j jVarO = null;
                if (jVar == null) {
                    if (zNr) {
                        HI().rl(null, i2);
                    }
                    if (T5.n.nr()) {
                        T5.n.rl();
                        return;
                    }
                    return;
                }
                if (!((InterfaceC1656I28) jVar.eF()).F() && !w6.az(i2, 8)) {
                    if (!zNr && (jVar2 = Dsr.this.f52464n.get(this.f52467t)) != null) {
                        try {
                            bA.eO eOVarMYa = ((InterfaceC1656I28) jVar.eF()).mYa();
                            bA.eO eOVarMYa2 = ((InterfaceC1656I28) jVar2.eF()).mYa();
                            if (eOVarMYa2.n() || eOVarMYa2.t() >= eOVarMYa.t()) {
                                HI().rl(jVar2, i2);
                                if (T5.n.nr()) {
                                    T5.n.rl();
                                    return;
                                }
                                return;
                            }
                        } finally {
                            Pj0.j.M7(jVar2);
                        }
                    }
                    if (this.nr) {
                        jVarO = Dsr.this.f52464n.O(this.f52467t, jVar);
                    }
                    if (zNr) {
                        try {
                            HI().t(1.0f);
                        } catch (Throwable th) {
                            Pj0.j.M7(jVarO);
                            throw th;
                        }
                    }
                    Pl plHI = HI();
                    if (jVarO != null) {
                        jVar = jVarO;
                    }
                    plHI.rl(jVar, i2);
                    Pj0.j.M7(jVarO);
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
            } catch (Throwable th2) {
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                throw th2;
            }
        }
    }

    protected String O() {
        return "BitmapMemoryCacheProducer";
    }

    protected Pl Uo(Pl pl, lN.Ml ml, boolean z2) {
        return new j(pl, ml, z2);
    }

    protected String nr() {
        return "pipe_bg";
    }

    public Dsr(FSZ.Q q2, FSZ.aC aCVar, l4Z l4z) {
        this.f52464n = q2;
        this.rl = aCVar;
        this.f52465t = l4z;
    }

    private static void J2(InterfaceC1663o interfaceC1663o, mz mzVar) {
        mzVar.FX(interfaceC1663o.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        Pj0.j jVar;
        Map mapOf;
        Map mapOf2;
        try {
            if (T5.n.nr()) {
                T5.n.n("BitmapMemoryCacheProducer#produceResults");
            }
            InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
            interfaceC1866pM7.nr(mzVar, O());
            lN.Ml mlN = this.rl.n(mzVar.M(), mzVar.n());
            Map mapOf3 = null;
            if (mzVar.M().nY(1)) {
                jVar = this.f52464n.get(mlN);
            } else {
                jVar = null;
            }
            if (jVar != null) {
                J2((InterfaceC1663o) jVar.eF(), mzVar);
                boolean zN = ((InterfaceC1656I28) jVar.eF()).mYa().n();
                if (zN) {
                    String strO = O();
                    if (interfaceC1866pM7.J2(mzVar, O())) {
                        mapOf2 = Hh.CN3.of("cached_value_found", "true");
                    } else {
                        mapOf2 = null;
                    }
                    interfaceC1866pM7.mUb(mzVar, strO, mapOf2);
                    interfaceC1866pM7.rl(mzVar, O(), true);
                    mzVar.Z("memory_bitmap", nr());
                    pl.t(1.0f);
                }
                pl.rl(jVar, w6.gh(zN));
                jVar.close();
                if (zN) {
                    if (T5.n.nr()) {
                        T5.n.rl();
                        return;
                    }
                    return;
                }
            }
            if (mzVar.Mx().rl() >= j.w6.BITMAP_MEMORY_CACHE.rl()) {
                String strO2 = O();
                if (interfaceC1866pM7.J2(mzVar, O())) {
                    mapOf = Hh.CN3.of("cached_value_found", V8ValueBoolean.FALSE);
                } else {
                    mapOf = null;
                }
                interfaceC1866pM7.mUb(mzVar, strO2, mapOf);
                interfaceC1866pM7.rl(mzVar, O(), false);
                mzVar.Z("memory_bitmap", nr());
                pl.rl(null, 1);
                if (T5.n.nr()) {
                    T5.n.rl();
                    return;
                }
                return;
            }
            Pl plUo = Uo(pl, mlN, mzVar.M().nY(2));
            String strO3 = O();
            if (interfaceC1866pM7.J2(mzVar, O())) {
                mapOf3 = Hh.CN3.of("cached_value_found", V8ValueBoolean.FALSE);
            }
            interfaceC1866pM7.mUb(mzVar, strO3, mapOf3);
            if (T5.n.nr()) {
                T5.n.n("mInputProducer.produceResult");
            }
            this.f52465t.n(plUo, mzVar);
            if (T5.n.nr()) {
                T5.n.rl();
            }
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
