package qwH;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qwH.I28;
import qwH.Ml;
import qwH.Xo;
import qwH.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class o extends qwH.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final co4.Wre f72600n;

    public static final class j implements n, Ml, I28, Xo.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final co4.Ml f72601n;

        public j(co4.Ml actualBuilder) {
            Intrinsics.checkNotNullParameter(actualBuilder, "actualBuilder");
            this.f72601n = actualBuilder;
        }

        @Override // qwH.Ml
        public void S(co4.Xo structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            n().n(structure);
        }

        @Override // qwH.n
        /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
        public j ty() {
            return new j(new co4.Ml());
        }

        @Override // qwH.n
        public co4.Ml n() {
            return this.f72601n;
        }

        @Override // qwH.I28
        public void o(co4.Xo structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            n().n(structure);
        }

        @Override // qwH.Xo.j
        public void HI(l3D l3d) {
            Ml.j.O(this, l3d);
        }

        @Override // qwH.Xo.j
        public void Ik(qf qfVar) {
            Ml.j.nr(this, qfVar);
        }

        @Override // qwH.Xo.w6
        public void J2(qf qfVar) {
            Ml.j.mUb(this, qfVar);
        }

        @Override // qwH.Xo.j
        public void KN(qf qfVar) {
            Ml.j.qie(this, qfVar);
        }

        @Override // qwH.Xo.w6
        public void O(qf qfVar) {
            Ml.j.J2(this, qfVar);
        }

        @Override // qwH.Xo.Ml
        public void Uo(Pl pl) {
            I28.j.n(this, pl);
        }

        @Override // qwH.w6
        public void WPU(co4.Xo xo) {
            Ml.j.n(this, xo);
        }

        @Override // qwH.Xo.j
        public void XQ(qf qfVar) {
            Ml.j.xMQ(this, qfVar);
        }

        @Override // qwH.Xo.w6
        public void Z(int i2, int i3) {
            Ml.j.gh(this, i2, i3);
        }

        public co4.Wre aYN() {
            return n.j.t(this);
        }

        @Override // qwH.Xo.w6
        public void az(qf qfVar) {
            Ml.j.Uo(this, qfVar);
        }

        @Override // qwH.Xo
        public void ck(String str) {
            n.j.nr(this, str);
        }

        @Override // qwH.Xo.j
        public void gh(Pl pl) {
            Ml.j.t(this, pl);
        }

        @Override // qwH.n
        public void mUb(Function1[] function1Arr, Function1 function1) {
            n.j.n(this, function1Arr, function1);
        }

        @Override // qwH.Xo.Ml
        public void nr(qf qfVar) {
            I28.j.nr(this, qfVar);
        }

        @Override // qwH.Wre
        public void qie(co4.Xo xo) {
            Ml.j.rl(this, xo);
        }

        @Override // qwH.Xo.Ml
        public void r(qf qfVar) {
            I28.j.t(this, qfVar);
        }

        @Override // qwH.n
        public void rl(String str, Function1 function1) {
            n.j.rl(this, str, function1);
        }

        @Override // qwH.Xo.j
        public void t(DAz dAz) {
            Ml.j.KN(this, dAz);
        }

        @Override // qwH.Xo.Ml
        public void xMQ(qf qfVar) {
            I28.j.rl(this, qfVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(co4.Wre actualFormat) {
        super(null);
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.f72600n = actualFormat;
    }

    @Override // qwH.j
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public aC nr(C intermediate) {
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return new aC(intermediate);
    }

    @Override // qwH.j
    public co4.Wre rl() {
        return this.f72600n;
    }

    @Override // qwH.j
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public C t() {
        return qz.rl;
    }
}
