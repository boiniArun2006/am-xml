package tq6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class u {

    public static abstract class j {
        public abstract String J2();

        public abstract String O();

        public abstract String Uo();

        public abstract String n();

        public abstract h1M.Wre nr();

        public abstract int t();

        public static j rl(String str, String str2, String str3, String str4, int i2, h1M.Wre wre) {
            return new Z(str, str2, str3, str4, i2, wre);
        }
    }

    public static abstract class n {
        public abstract String J2();

        public abstract String KN();

        public abstract boolean O();

        public abstract String Uo();

        public abstract long mUb();

        public abstract int n();

        public abstract long nr();

        public abstract int rl();

        public abstract int xMQ();

        public static n t(int i2, String str, int i3, long j2, long j3, boolean z2, int i5, String str2, String str3) {
            return new Ew(i2, str, i3, j2, j3, z2, i5, str2, str3);
        }
    }

    public static abstract class w6 {
        public abstract String nr();

        public abstract boolean rl();

        public abstract String t();

        public static w6 n(String str, String str2, boolean z2) {
            return new nKK(str, str2, z2);
        }
    }

    public abstract j n();

    public abstract w6 nr();

    public abstract n t();

    public static u rl(j jVar, w6 w6Var, n nVar) {
        return new afx(jVar, w6Var, nVar);
    }
}
