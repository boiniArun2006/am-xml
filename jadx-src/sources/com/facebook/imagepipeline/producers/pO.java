package com.facebook.imagepipeline.producers;

import aB.AbstractC1501Ml;
import bA.InterfaceC1656I28;
import bA.InterfaceC1658Wre;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class pO implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l4Z f52591n;
    private final AbstractC1501Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f52592t;

    private class j extends AbstractC1863c {
        private boolean J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Ic.n f52593O;
        private Pj0.j Uo;
        private boolean mUb;
        private final mz nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final InterfaceC1866p f52594t;
        private boolean xMQ;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.pO$j$j, reason: collision with other inner class name */
        class C0752j extends Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ pO f52595n;

            C0752j(pO pOVar) {
                this.f52595n = pOVar;
            }

            @Override // com.facebook.imagepipeline.producers.OU
            public void rl() {
                j.this.te();
            }
        }

        class n implements Runnable {
            n() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Pj0.j jVar;
                int i2;
                synchronized (j.this) {
                    jVar = j.this.Uo;
                    i2 = j.this.KN;
                    j.this.Uo = null;
                    j.this.xMQ = false;
                }
                if (Pj0.j.FX(jVar)) {
                    try {
                        j.this.ViF(jVar, i2);
                    } finally {
                        Pj0.j.M7(jVar);
                    }
                }
                j.this.WPU();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void WPU() {
            boolean zX;
            synchronized (this) {
                this.mUb = false;
                zX = X();
            }
            if (zX) {
                N();
            }
        }

        private synchronized boolean X() {
            if (this.J2 || !this.xMQ || this.mUb || !Pj0.j.FX(this.Uo)) {
                return false;
            }
            this.mUb = true;
            return true;
        }

        private boolean aYN() {
            synchronized (this) {
                try {
                    if (this.J2) {
                        return false;
                    }
                    Pj0.j jVar = this.Uo;
                    this.Uo = null;
                    this.J2 = true;
                    Pj0.j.M7(jVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private Pj0.j e(InterfaceC1656I28 interfaceC1656I28) {
            InterfaceC1658Wre interfaceC1658Wre = (InterfaceC1658Wre) interfaceC1656I28;
            Pj0.j jVarRl = this.f52593O.rl(interfaceC1658Wre.hRu(), pO.this.rl);
            try {
                InterfaceC1658Wre interfaceC1658WreDR0 = InterfaceC1658Wre.dR0(jVarRl, interfaceC1656I28.mYa(), interfaceC1658Wre.m(), interfaceC1658Wre.Nxk());
                interfaceC1658WreDR0.FX(interfaceC1658Wre.getExtras());
                return Pj0.j.a(interfaceC1658WreDR0);
            } finally {
                Pj0.j.M7(jVarRl);
            }
        }

        private synchronized boolean g() {
            return this.J2;
        }

        private void nHg(Pj0.j jVar, int i2) {
            synchronized (this) {
                try {
                    if (this.J2) {
                        return;
                    }
                    Pj0.j jVar2 = this.Uo;
                    this.Uo = Pj0.j.T(jVar);
                    this.KN = i2;
                    this.xMQ = true;
                    boolean zX = X();
                    Pj0.j.M7(jVar2);
                    if (zX) {
                        N();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public j(Pl pl, InterfaceC1866p interfaceC1866p, Ic.n nVar, mz mzVar) {
            super(pl);
            this.Uo = null;
            this.KN = 0;
            this.xMQ = false;
            this.mUb = false;
            this.f52594t = interfaceC1866p;
            this.f52593O = nVar;
            this.nr = mzVar;
            mzVar.rl(new C0752j(pO.this));
        }

        private void N() {
            pO.this.f52592t.execute(new n());
        }

        private boolean T(InterfaceC1656I28 interfaceC1656I28) {
            return interfaceC1656I28 instanceof InterfaceC1658Wre;
        }

        private Map nY(InterfaceC1866p interfaceC1866p, mz mzVar, Ic.n nVar) {
            if (interfaceC1866p.J2(mzVar, "PostprocessorProducer")) {
                return Hh.CN3.of("Postprocessor", nVar.getName());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ViF(Pj0.j jVar, int i2) {
            Hh.C.rl(Boolean.valueOf(Pj0.j.FX(jVar)));
            if (!T((InterfaceC1656I28) jVar.eF())) {
                fD(jVar, i2);
                return;
            }
            this.f52594t.nr(this.nr, "PostprocessorProducer");
            try {
                try {
                    Pj0.j jVarE = e((InterfaceC1656I28) jVar.eF());
                    InterfaceC1866p interfaceC1866p = this.f52594t;
                    mz mzVar = this.nr;
                    interfaceC1866p.mUb(mzVar, "PostprocessorProducer", nY(interfaceC1866p, mzVar, this.f52593O));
                    fD(jVarE, i2);
                    Pj0.j.M7(jVarE);
                } catch (Exception e2) {
                    InterfaceC1866p interfaceC1866p2 = this.f52594t;
                    mz mzVar2 = this.nr;
                    interfaceC1866p2.gh(mzVar2, "PostprocessorProducer", e2, nY(interfaceC1866p2, mzVar2, this.f52593O));
                    iF(e2);
                    Pj0.j.M7(null);
                }
            } catch (Throwable th) {
                Pj0.j.M7(null);
                throw th;
            }
        }

        private void fD(Pj0.j jVar, int i2) {
            boolean zNr = w6.nr(i2);
            if ((!zNr && !g()) || (zNr && aYN())) {
                HI().rl(jVar, i2);
            }
        }

        private void iF(Throwable th) {
            if (aYN()) {
                HI().onFailure(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void te() {
            if (aYN()) {
                HI().n();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: E2, reason: merged with bridge method [inline-methods] */
        public void KN(Pj0.j jVar, int i2) {
            if (!Pj0.j.FX(jVar)) {
                if (w6.nr(i2)) {
                    fD(null, i2);
                    return;
                }
                return;
            }
            nHg(jVar, i2);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1863c, com.facebook.imagepipeline.producers.w6
        protected void J2() {
            te();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1863c, com.facebook.imagepipeline.producers.w6
        protected void Uo(Throwable th) {
            iF(th);
        }
    }

    class n extends AbstractC1863c {
        private n(j jVar) {
            super(jVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(Pj0.j jVar, int i2) {
            if (w6.O(i2)) {
                return;
            }
            HI().rl(jVar, i2);
        }
    }

    public pO(l4Z l4z, AbstractC1501Ml abstractC1501Ml, Executor executor) {
        this.f52591n = (l4Z) Hh.C.Uo(l4z);
        this.rl = abstractC1501Ml;
        this.f52592t = (Executor) Hh.C.Uo(executor);
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
        Ic.n nVarAz = mzVar.M().az();
        Hh.C.Uo(nVarAz);
        this.f52591n.n(new n(new j(pl, interfaceC1866pM7, nVarAz, mzVar)), mzVar);
    }
}
