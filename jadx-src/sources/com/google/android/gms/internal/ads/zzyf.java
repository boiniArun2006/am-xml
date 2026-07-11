package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzyf {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzyf(int i2) {
        this(0, new Random());
    }

    public final int zza() {
        return this.zzb.length;
    }

    private zzyf(int i2, Random random) {
        this(new int[0], random);
    }

    public final int zzb(int i2) {
        int i3 = this.zzc[i2] + 1;
        int[] iArr = this.zzb;
        if (i3 < iArr.length) {
            return iArr[i3];
        }
        return -1;
    }

    public final int zzc(int i2) {
        int i3 = this.zzc[i2] - 1;
        if (i3 >= 0) {
            return this.zzb[i3];
        }
        return -1;
    }

    public final int zzd() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zze() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final zzyf zzf(int i2, int i3) {
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        int i5 = 0;
        while (i5 < i3) {
            Random random = this.zza;
            iArr[i5] = random.nextInt(this.zzb.length + 1);
            int i7 = i5 + 1;
            int iNextInt = random.nextInt(i7);
            iArr2[i5] = iArr2[iNextInt];
            iArr2[iNextInt] = i5;
            i5 = i7;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.zzb;
        int[] iArr4 = new int[iArr3.length + i3];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < iArr3.length + i3; i10++) {
            if (i8 >= i3 || i9 != iArr[i8]) {
                int i11 = i9 + 1;
                int i12 = iArr3[i9];
                iArr4[i10] = i12;
                if (i12 >= 0) {
                    iArr4[i10] = i12 + i3;
                }
                i9 = i11;
            } else {
                iArr4[i10] = iArr2[i8];
                i8++;
            }
        }
        return new zzyf(iArr4, new Random(this.zza.nextLong()));
    }

    public final zzyf zzg() {
        return new zzyf(0, new Random(this.zza.nextLong()));
    }

    private zzyf(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzc[iArr[i2]] = i2;
        }
    }
}
