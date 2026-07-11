package veW;

import android.content.Context;
import ePt.iF;
import ePt.vd;
import qp.InterfaceC2342j;
import veW.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class I28 {

    private static final class n implements UGc.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Context f74696n;

        private n() {
        }

        @Override // veW.UGc.j
        public UGc build() {
            lK3.Ml.n(this.f74696n, Context.class);
            return new w6(this.f74696n);
        }

        @Override // veW.UGc.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public n n(Context context) {
            this.f74696n = (Context) lK3.Ml.rl(context);
            return this;
        }
    }

    private static final class w6 extends UGc {
        private InterfaceC2342j E2;
        private InterfaceC2342j J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private InterfaceC2342j f74697N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private InterfaceC2342j f74698O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private InterfaceC2342j f74699S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private InterfaceC2342j f74700T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private InterfaceC2342j f74701X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private InterfaceC2342j f74702Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private InterfaceC2342j f74703e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private InterfaceC2342j f74704g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f74705n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private InterfaceC2342j f74706o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private InterfaceC2342j f74707r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private InterfaceC2342j f74708t;

        private w6(Context context) {
            this.f74705n = this;
            Uo(context);
        }

        @Override // veW.UGc
        ePt.Ml n() {
            return (ePt.Ml) this.f74699S.get();
        }

        @Override // veW.UGc
        s4 rl() {
            return (s4) this.f74697N.get();
        }

        private void Uo(Context context) {
            this.f74708t = lK3.j.n(C.n());
            lK3.n nVarN = lK3.w6.n(context);
            this.f74698O = nVarN;
            hay.aC aCVarN = hay.aC.n(nVarN, MR.w6.n(), MR.Ml.n());
            this.J2 = aCVarN;
            this.f74707r = lK3.j.n(hay.o.n(this.f74698O, aCVarN));
            this.f74706o = iF.n(this.f74698O, ePt.CN3.n(), ePt.Dsr.n());
            this.f74702Z = lK3.j.n(ePt.fuX.n(this.f74698O));
            this.f74699S = lK3.j.n(vd.n(MR.w6.n(), MR.Ml.n(), ePt.aC.n(), this.f74706o, this.f74702Z));
            etI.CN3 cn3Rl = etI.CN3.rl(MR.w6.n());
            this.f74704g = cn3Rl;
            etI.Dsr dsrN = etI.Dsr.n(this.f74698O, this.f74699S, cn3Rl, MR.Ml.n());
            this.E2 = dsrN;
            InterfaceC2342j interfaceC2342j = this.f74708t;
            InterfaceC2342j interfaceC2342j2 = this.f74707r;
            InterfaceC2342j interfaceC2342j3 = this.f74699S;
            this.f74703e = etI.Ml.n(interfaceC2342j, interfaceC2342j2, dsrN, interfaceC2342j3, interfaceC2342j3);
            InterfaceC2342j interfaceC2342j4 = this.f74698O;
            InterfaceC2342j interfaceC2342j5 = this.f74707r;
            InterfaceC2342j interfaceC2342j6 = this.f74699S;
            this.f74701X = Gg.l3D.n(interfaceC2342j4, interfaceC2342j5, interfaceC2342j6, this.E2, this.f74708t, interfaceC2342j6, MR.w6.n(), MR.Ml.n(), this.f74699S);
            InterfaceC2342j interfaceC2342j7 = this.f74708t;
            InterfaceC2342j interfaceC2342j8 = this.f74699S;
            this.f74700T = Gg.Q.n(interfaceC2342j7, interfaceC2342j8, this.E2, interfaceC2342j8);
            this.f74697N = lK3.j.n(Q.n(MR.w6.n(), MR.Ml.n(), this.f74703e, this.f74701X, this.f74700T));
        }
    }

    public static UGc.j n() {
        return new n();
    }
}
