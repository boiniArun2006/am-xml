package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzgua {
    zzgua() {
    }

    public abstract zzgua zzd(Object obj);

    static int zze(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i3 <= i2) {
            return i2;
        }
        int i5 = i2 + (i2 >> 1) + 1;
        if (i5 < i3) {
            int iHighestOneBit = Integer.highestOneBit(i3 - 1);
            i5 = iHighestOneBit + iHighestOneBit;
        }
        if (i5 < 0) {
            return Integer.MAX_VALUE;
        }
        return i5;
    }
}
