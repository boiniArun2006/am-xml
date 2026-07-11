package veW;

import veW.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class Xo {

    public static abstract class j {
        public abstract j J2(String str);

        public abstract j O(eO eOVar);

        public abstract Xo n();

        abstract j nr(bF.CN3 cn3);

        abstract j rl(bF.n nVar);

        abstract j t(bF.w6 w6Var);
    }

    public abstract eO J2();

    abstract bF.CN3 O();

    public abstract String Uo();

    public abstract bF.n rl();

    abstract bF.w6 t();

    public static j n() {
        return new w6.n();
    }

    Xo() {
    }

    public byte[] nr() {
        return (byte[]) O().apply(t().t());
    }
}
