package com.google.android.gms.common;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzz {
    static int zza(int i2) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i3 = 0; i3 < 6; i3++) {
            int i5 = iArr[i3];
            int i7 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i7 == i2) {
                return i5;
            }
        }
        return 1;
    }
}
