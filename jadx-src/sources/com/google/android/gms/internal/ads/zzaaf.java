package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzaaf {
    private final int[] zza;
    private final zzyn[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzyn zze;

    @VisibleForTesting
    zzaaf(String[] strArr, int[] iArr, zzyn[] zzynVarArr, int[] iArr2, int[][][] iArr3, zzyn zzynVar) {
        this.zza = iArr;
        this.zzb = zzynVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzynVar;
    }

    public final zzyn zze() {
        return this.zze;
    }

    public final int zza(int i2) {
        return this.zza[i2];
    }

    public final zzyn zzb(int i2) {
        return this.zzb[i2];
    }

    public final int zzc(int i2, int i3, int i5) {
        return this.zzd[i2][i3][i5];
    }

    public final int zzd(int i2, int i3, boolean z2) {
        zzyn[] zzynVarArr = this.zzb;
        int i5 = zzynVarArr[i2].zza(i3).zza;
        int[] iArr = new int[i5];
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            if ((this.zzd[i2][i3][i9] & 7) == 4) {
                iArr[i8] = i9;
                i8++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
        String str = null;
        int i10 = 0;
        int iMin = 16;
        boolean z3 = false;
        while (i7 < iArrCopyOf.length) {
            String str2 = zzynVarArr[i2].zza(i3).zza(iArrCopyOf[i7]).zzo;
            int i11 = i10 + 1;
            if (i10 == 0) {
                str = str2;
            } else {
                z3 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i2][i3][i7] & 24);
            i7++;
            i10 = i11;
        }
        return z3 ? Math.min(iMin, this.zzc[i2]) : iMin;
    }
}
