package FSZ;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class eO implements Hh.qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f2610n = TimeUnit.MINUTES.toMillis(5);

    private int rl() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 1048576;
        }
        if (iMin < 33554432) {
            return 2097152;
        }
        return 4194304;
    }

    @Override // Hh.qz
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public r get() {
        int iRl = rl();
        return new r(iRl, Integer.MAX_VALUE, iRl, Integer.MAX_VALUE, iRl / 8, f2610n);
    }
}
