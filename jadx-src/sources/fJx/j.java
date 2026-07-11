package fJx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class j {
    public static int t(double d2, double d4) {
        if (d2 < d4) {
            return -1;
        }
        if (d2 > d4) {
            return 1;
        }
        if (d2 == d4) {
            return 0;
        }
        if (Double.isNaN(d4)) {
            return !Double.isNaN(d2) ? 1 : 0;
        }
        return -1;
    }

    public static int n(long j2, long j3) {
        return Long.compare(j2, j3);
    }

    public static int rl(double d2, long j2) {
        if (Double.isNaN(d2) || d2 < -9.223372036854776E18d) {
            return -1;
        }
        if (d2 >= 9.223372036854776E18d) {
            return 1;
        }
        int iN = n((long) d2, j2);
        if (iN != 0) {
            return iN;
        }
        return t(d2, j2);
    }
}
