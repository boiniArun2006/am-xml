package dzu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class o {
    public static final void n(int i2) {
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i2).toString());
    }

    public static final GJW.lej rl(GJW.lej lejVar, String str) {
        return str != null ? new Q(lejVar, str) : lejVar;
    }
}
