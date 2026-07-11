package Z8;

import Z8.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Xo {

    public static abstract class j {
        public abstract Xo n();

        public abstract j rl(Z8.j jVar);

        public abstract j t(n nVar);
    }

    public abstract Z8.j rl();

    public abstract n t();

    public enum n {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f12334n;

        n(int i2) {
            this.f12334n = i2;
        }
    }

    public static j n() {
        return new I28.n();
    }
}
