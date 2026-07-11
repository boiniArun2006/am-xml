package Ys;

import Aqv.CN3;
import Aqv.Ml;
import Aqv.Wre;
import Aqv.fuX;
import Li.I28;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Aqv.j f12225n;

        private n() {
        }

        public Ys.n n() {
            D23.w6.n(this.f12225n, Aqv.j.class);
            return new w6(this.f12225n);
        }

        public n rl(Aqv.j jVar) {
            this.f12225n = (Aqv.j) D23.w6.rl(jVar);
            return this;
        }
    }

    private static final class w6 implements Ys.n {
        private InterfaceC2342j J2;
        private InterfaceC2342j KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private InterfaceC2342j f12226O;
        private InterfaceC2342j Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f12227n;
        private InterfaceC2342j nr;
        private InterfaceC2342j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private InterfaceC2342j f12228t;
        private InterfaceC2342j xMQ;

        private w6(Aqv.j jVar) {
            this.f12227n = this;
            rl(jVar);
        }

        @Override // Ys.n
        public I28 n() {
            return (I28) this.xMQ.get();
        }

        private void rl(Aqv.j jVar) {
            this.rl = Aqv.w6.n(jVar);
            this.f12228t = Aqv.I28.n(jVar);
            this.nr = Ml.n(jVar);
            this.f12226O = fuX.n(jVar);
            this.J2 = Wre.n(jVar);
            this.Uo = Aqv.n.n(jVar);
            CN3 cn3N = CN3.n(jVar);
            this.KN = cn3N;
            this.xMQ = D23.j.nr(Li.CN3.n(this.rl, this.f12228t, this.nr, this.f12226O, this.J2, this.Uo, cn3N));
        }
    }

    public static n n() {
        return new n();
    }
}
