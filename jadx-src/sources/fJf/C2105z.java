package fJf;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: fJf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C2105z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2105z f66899n = new C2105z();

    public static final nKK n() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        C2105z c2105z = f66899n;
        return new nKK(c2105z.t(), c2105z.rl(), sparseIntArray);
    }

    private C2105z() {
    }

    private final int rl() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return iMin / 2;
        }
        return (iMin / 4) * 3;
    }

    private final int t() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 3145728;
        }
        if (iMin < 33554432) {
            return 6291456;
        }
        return 12582912;
    }
}
