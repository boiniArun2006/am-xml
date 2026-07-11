package com.google.firebase.functions;

import android.content.Context;
import com.google.firebase.functions.w6;
import com.google.firebase.qz;
import java.util.concurrent.Executor;
import mCM.Pl;
import mCM.fuX;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {

    private static final class n implements w6.j {
        private oSp.n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private oSp.n f60492O;
        private oSp.j Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Context f60493n;
        private Executor nr;
        private qz rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Executor f60494t;

        private n() {
        }

        @Override // com.google.firebase.functions.w6.j
        public com.google.firebase.functions.w6 build() {
            jh.Ml.n(this.f60493n, Context.class);
            jh.Ml.n(this.rl, qz.class);
            jh.Ml.n(this.f60494t, Executor.class);
            jh.Ml.n(this.nr, Executor.class);
            jh.Ml.n(this.f60492O, oSp.n.class);
            jh.Ml.n(this.J2, oSp.n.class);
            jh.Ml.n(this.Uo, oSp.j.class);
            return new w6(this.f60493n, this.rl, this.f60494t, this.nr, this.f60492O, this.J2, this.Uo);
        }

        @Override // com.google.firebase.functions.w6.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public n J2(oSp.j jVar) {
            this.Uo = (oSp.j) jh.Ml.rl(jVar);
            return this;
        }

        @Override // com.google.firebase.functions.w6.j
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public n rl(Executor executor) {
            this.f60494t = (Executor) jh.Ml.rl(executor);
            return this;
        }

        @Override // com.google.firebase.functions.w6.j
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public n t(qz qzVar) {
            this.rl = (qz) jh.Ml.rl(qzVar);
            return this;
        }

        @Override // com.google.firebase.functions.w6.j
        /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
        public n Uo(oSp.n nVar) {
            this.f60492O = (oSp.n) jh.Ml.rl(nVar);
            return this;
        }

        @Override // com.google.firebase.functions.w6.j
        /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
        public n O(oSp.n nVar) {
            this.J2 = (oSp.n) jh.Ml.rl(nVar);
            return this;
        }

        @Override // com.google.firebase.functions.w6.j
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public n nr(Executor executor) {
            this.nr = (Executor) jh.Ml.rl(executor);
            return this;
        }

        @Override // com.google.firebase.functions.w6.j
        /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
        public n n(Context context) {
            this.f60493n = (Context) jh.Ml.rl(context);
            return this;
        }
    }

    private static final class w6 implements com.google.firebase.functions.w6 {
        private InterfaceC2342j J2;
        private InterfaceC2342j KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private InterfaceC2342j f60495O;
        private InterfaceC2342j Uo;
        private InterfaceC2342j az;
        private Pl gh;
        private InterfaceC2342j mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f60496n;
        private InterfaceC2342j nr;
        private InterfaceC2342j qie;
        private InterfaceC2342j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private InterfaceC2342j f60497t;
        private InterfaceC2342j xMQ;

        private w6(Context context, qz qzVar, Executor executor, Executor executor2, oSp.n nVar, oSp.n nVar2, oSp.j jVar) {
            this.f60496n = this;
            rl(context, qzVar, executor, executor2, nVar, nVar2, jVar);
        }

        @Override // com.google.firebase.functions.w6
        public I28 n() {
            return (I28) this.az.get();
        }

        private void rl(Context context, qz qzVar, Executor executor, Executor executor2, oSp.n nVar, oSp.n nVar2, oSp.j jVar) {
            this.rl = jh.w6.n(context);
            jh.n nVarN = jh.w6.n(qzVar);
            this.f60497t = nVarN;
            this.nr = Ml.rl(nVarN);
            this.f60495O = jh.w6.n(nVar);
            this.J2 = jh.w6.n(nVar2);
            this.Uo = jh.w6.n(jVar);
            jh.n nVarN2 = jh.w6.n(executor);
            this.KN = nVarN2;
            this.xMQ = jh.j.n(fuX.n(this.f60495O, this.J2, this.Uo, nVarN2));
            jh.n nVarN3 = jh.w6.n(executor2);
            this.mUb = nVarN3;
            Pl plN = Pl.n(this.rl, this.nr, this.xMQ, this.KN, nVarN3);
            this.gh = plN;
            InterfaceC2342j interfaceC2342jN = CN3.n(plN);
            this.qie = interfaceC2342jN;
            this.az = jh.j.n(Wre.n(interfaceC2342jN));
        }
    }

    public static w6.j n() {
        return new n();
    }
}
