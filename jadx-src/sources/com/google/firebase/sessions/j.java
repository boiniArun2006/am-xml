package com.google.firebase.sessions;

import KfI.Ln;
import KfI.Q;
import KfI.Z;
import KfI.afx;
import KfI.eO;
import KfI.o;
import android.content.Context;
import com.google.firebase.sessions.n;
import kotlin.coroutines.CoroutineContext;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    private static final class n implements n.j {
        private oSp.n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private s9b.I28 f60809O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Context f60810n;
        private com.google.firebase.Wre nr;
        private CoroutineContext rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private CoroutineContext f60811t;

        private n() {
        }

        @Override // com.google.firebase.sessions.n.j
        public com.google.firebase.sessions.n build() {
            ep.Ml.n(this.f60810n, Context.class);
            ep.Ml.n(this.rl, CoroutineContext.class);
            ep.Ml.n(this.f60811t, CoroutineContext.class);
            ep.Ml.n(this.nr, com.google.firebase.Wre.class);
            ep.Ml.n(this.f60809O, s9b.I28.class);
            ep.Ml.n(this.J2, oSp.n.class);
            return new w6(this.f60810n, this.rl, this.f60811t, this.nr, this.f60809O, this.J2);
        }

        @Override // com.google.firebase.sessions.n.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public n rl(CoroutineContext coroutineContext) {
            this.rl = (CoroutineContext) ep.Ml.rl(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.n.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public n J2(Context context) {
            this.f60810n = (Context) ep.Ml.rl(context);
            return this;
        }

        @Override // com.google.firebase.sessions.n.j
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public n nr(s9b.I28 i28) {
            this.f60809O = (s9b.I28) ep.Ml.rl(i28);
            return this;
        }

        @Override // com.google.firebase.sessions.n.j
        /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
        public n t(com.google.firebase.Wre wre) {
            this.nr = (com.google.firebase.Wre) ep.Ml.rl(wre);
            return this;
        }

        @Override // com.google.firebase.sessions.n.j
        /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
        public n n(oSp.n nVar) {
            this.J2 = (oSp.n) ep.Ml.rl(nVar);
            return this;
        }

        @Override // com.google.firebase.sessions.n.j
        /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
        public n O(CoroutineContext coroutineContext) {
            this.f60811t = (CoroutineContext) ep.Ml.rl(coroutineContext);
            return this;
        }
    }

    private static final class w6 implements com.google.firebase.sessions.n {
        private InterfaceC2342j HI;
        private InterfaceC2342j Ik;
        private InterfaceC2342j J2;
        private InterfaceC2342j KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private InterfaceC2342j f60812O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private InterfaceC2342j f60813S;
        private InterfaceC2342j Uo;
        private InterfaceC2342j XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private InterfaceC2342j f60814Z;
        private InterfaceC2342j az;
        private InterfaceC2342j ck;
        private InterfaceC2342j gh;
        private InterfaceC2342j mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f60815n;
        private InterfaceC2342j nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private InterfaceC2342j f60816o;
        private InterfaceC2342j qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private InterfaceC2342j f60817r;
        private InterfaceC2342j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private InterfaceC2342j f60818t;
        private InterfaceC2342j ty;
        private InterfaceC2342j xMQ;

        private w6(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, com.google.firebase.Wre wre, s9b.I28 i28, oSp.n nVar) {
            this.f60815n = this;
            J2(context, coroutineContext, coroutineContext2, wre, i28, nVar);
        }

        @Override // com.google.firebase.sessions.n
        public fuX O() {
            return (fuX) this.ck.get();
        }

        @Override // com.google.firebase.sessions.n
        public aC n() {
            return (aC) this.f60813S.get();
        }

        @Override // com.google.firebase.sessions.n
        public o nr() {
            return (o) this.ty.get();
        }

        @Override // com.google.firebase.sessions.n
        public pu.Dsr rl() {
            return (pu.Dsr) this.qie.get();
        }

        @Override // com.google.firebase.sessions.n
        public Dsr t() {
            return (Dsr) this.f60816o.get();
        }

        private void J2(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, com.google.firebase.Wre wre, s9b.I28 i28, oSp.n nVar) {
            this.rl = ep.w6.n(wre);
            ep.n nVarN = ep.w6.n(context);
            this.f60818t = nVarN;
            this.nr = ep.j.rl(pu.w6.n(nVarN));
            this.f60812O = ep.w6.n(coroutineContext);
            this.J2 = ep.w6.n(i28);
            InterfaceC2342j interfaceC2342jRl = ep.j.rl(com.google.firebase.sessions.w6.rl(this.rl));
            this.Uo = interfaceC2342jRl;
            this.KN = ep.j.rl(pu.Wre.n(interfaceC2342jRl, this.f60812O));
            InterfaceC2342j interfaceC2342jRl2 = ep.j.rl(Ml.n(this.f60818t));
            this.xMQ = interfaceC2342jRl2;
            InterfaceC2342j interfaceC2342jRl3 = ep.j.rl(pu.o.n(interfaceC2342jRl2));
            this.mUb = interfaceC2342jRl3;
            InterfaceC2342j interfaceC2342jRl4 = ep.j.rl(pu.CN3.n(this.f60812O, this.J2, this.Uo, this.KN, interfaceC2342jRl3));
            this.gh = interfaceC2342jRl4;
            this.qie = ep.j.rl(pu.aC.n(this.nr, interfaceC2342jRl4));
            InterfaceC2342j interfaceC2342jRl5 = ep.j.rl(Ln.n(this.f60818t));
            this.az = interfaceC2342jRl5;
            this.ty = ep.j.rl(eO.n(this.rl, this.qie, this.f60812O, interfaceC2342jRl5));
            InterfaceC2342j interfaceC2342jRl6 = ep.j.rl(I28.n(this.f60818t));
            this.HI = interfaceC2342jRl6;
            this.ck = ep.j.rl(Q.n(this.f60812O, interfaceC2342jRl6));
            ep.n nVarN2 = ep.w6.n(nVar);
            this.Ik = nVarN2;
            InterfaceC2342j interfaceC2342jRl7 = ep.j.rl(KfI.Dsr.n(nVarN2));
            this.f60817r = interfaceC2342jRl7;
            this.f60816o = ep.j.rl(afx.n(this.rl, this.J2, this.qie, interfaceC2342jRl7, this.f60812O));
            this.f60814Z = ep.j.rl(Wre.n());
            InterfaceC2342j interfaceC2342jRl8 = ep.j.rl(CN3.n());
            this.XQ = interfaceC2342jRl8;
            this.f60813S = ep.j.rl(Z.n(this.f60814Z, interfaceC2342jRl8));
        }
    }

    public static n.j n() {
        return new n();
    }
}
