package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzaa(int i2) {
    }

    public final zzaa zza(Object obj) {
        int i2;
        obj.getClass();
        int length = this.zza.length;
        int i3 = this.zzb;
        int i5 = i3 + 1;
        if (i5 >= 0) {
            if (i5 <= length) {
                i2 = length;
            } else {
                i2 = (length >> 1) + length + 1;
                if (i2 < i5) {
                    int iHighestOneBit = Integer.highestOneBit(i3);
                    i2 = iHighestOneBit + iHighestOneBit;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
            }
            if (i2 > length || this.zzc) {
                this.zza = Arrays.copyOf(this.zza, i2);
                this.zzc = false;
            }
            Object[] objArr = this.zza;
            int i7 = this.zzb;
            this.zzb = i7 + 1;
            objArr[i7] = obj;
            return this;
        }
        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
    }
}
