package T7o;

import T7o.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {

    public static abstract class j {
        public abstract j J2(String str);

        public abstract j O(n nVar);

        public abstract Ml n();

        public abstract j nr(String str);

        public abstract j rl(Wre wre);

        public abstract j t(String str);
    }

    public enum n {
        OK,
        BAD_CONFIG
    }

    public abstract String J2();

    public abstract n O();

    public abstract String nr();

    public abstract Wre rl();

    public abstract String t();

    public static j n() {
        return new j.n();
    }
}
