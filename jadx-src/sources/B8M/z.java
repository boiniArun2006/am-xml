package B8M;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class z {
    public static boolean rl() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static int n() {
        Integer numN = gX.l3D.n();
        if (numN != null) {
            return numN.intValue();
        }
        return -1;
    }
}
