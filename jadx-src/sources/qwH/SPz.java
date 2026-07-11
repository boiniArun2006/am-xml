package qwH;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qwH.n;
import qwH.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class SPz extends qwH.j {
    public static final n rl = new n(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final co4.Wre f72539n;

    public static final class j implements qwH.n, w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final co4.Ml f72540n;

        public j(co4.Ml actualBuilder) {
            Intrinsics.checkNotNullParameter(actualBuilder, "actualBuilder");
            this.f72540n = actualBuilder;
        }

        @Override // qwH.n
        /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
        public j ty() {
            return new j(new co4.Ml());
        }

        @Override // qwH.w6
        public void WPU(co4.Xo structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            n().n(structure);
        }

        @Override // qwH.n
        public co4.Ml n() {
            return this.f72540n;
        }

        @Override // qwH.Xo.j
        public void Ik(qf qfVar) {
            w6.j.rl(this, qfVar);
        }

        @Override // qwH.Xo.j
        public void KN(qf qfVar) {
            w6.j.J2(this, qfVar);
        }

        @Override // qwH.Xo.j
        public void XQ(qf qfVar) {
            w6.j.O(this, qfVar);
        }

        public co4.Wre aYN() {
            return n.j.t(this);
        }

        @Override // qwH.Xo
        public void ck(String str) {
            n.j.nr(this, str);
        }

        @Override // qwH.n
        public void mUb(Function1[] function1Arr, Function1 function1) {
            n.j.n(this, function1Arr, function1);
        }

        @Override // qwH.n
        public void rl(String str, Function1 function1) {
            n.j.rl(this, str, function1);
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }

        public final Pl n(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            j jVar = new j(new co4.Ml());
            block.invoke(jVar);
            return new SPz(jVar.aYN());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SPz(co4.Wre actualFormat) {
        super(null);
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.f72539n = actualFormat;
    }

    @Override // qwH.j
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public Ba.I28 nr(UGc intermediate) {
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return intermediate.rl();
    }

    @Override // qwH.j
    public co4.Wre rl() {
        return this.f72539n;
    }

    @Override // qwH.j
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public UGc t() {
        return ci.f72572t;
    }
}
