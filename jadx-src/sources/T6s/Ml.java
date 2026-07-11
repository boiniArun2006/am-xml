package T6s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f10170n = n();

    private static int O(String str) {
        try {
            String[] strArrSplit = str.split("[._]");
            int i2 = Integer.parseInt(strArrSplit[0]);
            return (i2 != 1 || strArrSplit.length <= 1) ? i2 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int n() {
        return t(System.getProperty("java.version"));
    }

    public static boolean nr() {
        return f10170n >= 9;
    }

    private static int rl(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static int t(String str) {
        int iO = O(str);
        if (iO == -1) {
            iO = rl(str);
        }
        if (iO == -1) {
            return 6;
        }
        return iO;
    }
}
