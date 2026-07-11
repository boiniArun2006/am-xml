package qwH;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qwH.Wre;
import qwH.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class g9s extends qwH.j {
    public static final n rl = new n(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final co4.Wre f72577n;

    private static final class j implements qwH.n, Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final co4.Ml f72578n;

        public j(co4.Ml actualBuilder) {
            Intrinsics.checkNotNullParameter(actualBuilder, "actualBuilder");
            this.f72578n = actualBuilder;
        }

        @Override // qwH.n
        /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
        public j ty() {
            return new j(new co4.Ml());
        }

        @Override // qwH.n
        public co4.Ml n() {
            return this.f72578n;
        }

        @Override // qwH.Wre
        public void qie(co4.Xo structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            n().n(structure);
        }

        @Override // qwH.Xo.w6
        public void J2(qf qfVar) {
            Wre.j.t(this, qfVar);
        }

        @Override // qwH.Xo.w6
        public void O(qf qfVar) {
            Wre.j.n(this, qfVar);
        }

        @Override // qwH.Xo.w6
        public void Z(int i2, int i3) {
            Wre.j.nr(this, i2, i3);
        }

        public co4.Wre aYN() {
            return n.j.t(this);
        }

        @Override // qwH.Xo.w6
        public void az(qf qfVar) {
            Wre.j.rl(this, qfVar);
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

        public final g9s n(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            j jVar = new j(new co4.Ml());
            block.invoke(jVar);
            return new g9s(jVar.aYN());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9s(co4.Wre actualFormat) {
        super(null);
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.f72577n = actualFormat;
    }

    @Override // qwH.j
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public Ba.fuX nr(Q intermediate) {
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return intermediate.O();
    }

    @Override // qwH.j
    public co4.Wre rl() {
        return this.f72577n;
    }

    @Override // qwH.j
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Q t() {
        return afx.rl;
    }
}
