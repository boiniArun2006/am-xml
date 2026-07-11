package rH;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Dsr {
    public static final int rl(int i2, boolean z2) {
        return z2 ? -i2 : i2;
    }

    public static final Integer n(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        if (i2 != Integer.MIN_VALUE) {
            return numValueOf;
        }
        return null;
    }
}
