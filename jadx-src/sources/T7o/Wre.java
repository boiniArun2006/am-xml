package T7o;

import T7o.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Wre {

    public static abstract class j {
        public abstract Wre n();

        public abstract j nr(long j2);

        public abstract j rl(n nVar);

        public abstract j t(String str);
    }

    public enum n {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public abstract long nr();

    public abstract n rl();

    public abstract String t();

    public static j n() {
        return new n.C0358n().nr(0L);
    }
}
