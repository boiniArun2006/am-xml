package fJf;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final eO f66886n = new eO();
    private static final int rl = Runtime.getRuntime().availableProcessors();

    public static final SparseIntArray n(int i2, int i3, int i5) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i2 <= i3) {
            sparseIntArray.put(i2, i5);
            i2 *= 2;
        }
        return sparseIntArray;
    }

    public static final nKK rl() {
        int i2 = rl;
        return new nKK(4194304, i2 * 4194304, n(131072, 4194304, i2), 131072, 4194304, i2);
    }

    private eO() {
    }
}
