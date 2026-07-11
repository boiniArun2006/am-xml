package fJf;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pl f66868n = new Pl();
    private static final SparseIntArray rl = new SparseIntArray(0);

    public static final nKK n() {
        return new nKK(0, f66868n.rl(), rl);
    }

    private Pl() {
    }

    private final int rl() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin > 16777216) {
            return (iMin / 4) * 3;
        }
        return iMin / 2;
    }
}
