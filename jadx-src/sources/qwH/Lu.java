package qwH;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qwH.I28;
import qwH.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Lu extends qwH.j {
    public static final n rl = new n(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final co4.Wre f72524n;

    private static final class j implements qwH.n, I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final co4.Ml f72525n;

        public j(co4.Ml actualBuilder) {
            Intrinsics.checkNotNullParameter(actualBuilder, "actualBuilder");
            this.f72525n = actualBuilder;
        }

        @Override // qwH.n
        /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
        public j ty() {
            return new j(new co4.Ml());
        }

        @Override // qwH.n
        public co4.Ml n() {
            return this.f72525n;
        }

        @Override // qwH.I28
        public void o(co4.Xo structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            n().n(structure);
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

        @Override // qwH.Xo.Ml
        public void nr(qf qfVar) {
            I28.j.nr(this, qfVar);
        }

        @Override // qwH.Xo.Ml
        public void r(qf qfVar) {
            I28.j.t(this, qfVar);
        }

        @Override // qwH.n
        public void rl(String str, Function1 function1) {
            n.j.rl(this, str, function1);
        }

        @Override // qwH.Xo.Ml
        public void xMQ(qf qfVar) {
            I28.j.rl(this, qfVar);
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }

        public final Lu n(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            j jVar = new j(new co4.Ml());
            block.invoke(jVar);
            return new Lu(jVar.aYN());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lu(co4.Wre actualFormat) {
        super(null);
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.f72524n = actualFormat;
    }

    @Override // qwH.j
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public Ba.aC nr(r intermediate) {
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return intermediate.t();
    }

    @Override // qwH.j
    public co4.Wre rl() {
        return this.f72524n;
    }

    @Override // qwH.j
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public r t() {
        return h.nr;
    }
}
