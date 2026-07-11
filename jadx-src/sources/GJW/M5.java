package GJW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class M5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final dzu.nKK f3425n = new dzu.nKK("REMOVED_TASK");
    private static final dzu.nKK rl = new dzu.nKK("CLOSED_EMPTY");

    public static final long t(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        if (j2 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j2 * 1000000;
    }
}
