package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfrn {
    public static int zza(int i2) {
        int[] iArr = {1, 2, 3};
        for (int i3 = 0; i3 < 3; i3++) {
            int i5 = iArr[i3];
            int i7 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i7 == i2) {
                return i5;
            }
        }
        return 2;
    }
}
