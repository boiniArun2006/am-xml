package NDY;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j extends qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final char[] f6991n = "0123456789-$:/.+ABCD".toCharArray();
    static final int[] rl = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final char[] f6992t = {'A', 'B', 'C', 'D'};

    static boolean n(char[] cArr, char c2) {
        if (cArr != null) {
            for (char c4 : cArr) {
                if (c4 == c2) {
                    return true;
                }
            }
        }
        return false;
    }
}
