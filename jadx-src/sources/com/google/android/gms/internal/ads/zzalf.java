package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzalf {
    public final zzalc zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final int[] zzh;
    public final long zzi;
    public final boolean zzj;

    public final int zza(long j2) {
        int i2 = 0;
        if (this.zzj) {
            return zzfj.zzm(this.zzf, j2, true, false);
        }
        int[] iArr = this.zzh;
        int length = iArr.length - 1;
        int i3 = -1;
        while (i2 <= length) {
            int i5 = ((length - i2) / 2) + i2;
            if (this.zzf[iArr[i5]] <= j2) {
                i2 = i5 + 1;
                i3 = i5;
            } else {
                length = i5 - 1;
            }
        }
        if (i3 == -1) {
            return -1;
        }
        long[] jArr = this.zzf;
        long j3 = jArr[iArr[i3]];
        if (j3 == j2) {
            while (i3 > 0) {
                int i7 = i3 - 1;
                if (jArr[iArr[i7]] != j3) {
                    break;
                }
                i3 = i7;
            }
        }
        return iArr[i3];
    }

    public final int zzb(long j2) {
        int i2 = 0;
        if (this.zzj) {
            return zzfj.zzo(this.zzf, j2, true, false);
        }
        int[] iArr = this.zzh;
        int length = iArr.length - 1;
        int i3 = -1;
        while (i2 <= length) {
            int i5 = ((length - i2) / 2) + i2;
            if (this.zzf[iArr[i5]] >= j2) {
                length = i5 - 1;
                i3 = i5;
            } else {
                i2 = i5 + 1;
            }
        }
        if (i3 == -1) {
            return -1;
        }
        long[] jArr = this.zzf;
        long j3 = jArr[iArr[i3]];
        if (j3 == j2) {
            while (i3 < iArr.length - 1) {
                int i7 = i3 + 1;
                if (jArr[iArr[i7]] != j3) {
                    break;
                }
                i3 = i7;
            }
        }
        return iArr[i3];
    }

    public zzalf(zzalc zzalcVar, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, int[] iArr3, boolean z2, long j2, int i3) {
        boolean z3;
        boolean z4;
        int length = iArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzgrc.zza(z3);
        if (jArr.length == length2) {
            z4 = true;
        } else {
            z4 = false;
        }
        zzgrc.zza(z4);
        int length3 = iArr2.length;
        zzgrc.zza(length3 == length2);
        this.zza = zzalcVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i2;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = iArr3;
        this.zzj = z2;
        this.zzi = j2;
        this.zzb = i3;
        if (length3 > 0) {
            int i5 = length3 - 1;
            iArr2[i5] = iArr2[i5] | 536870912;
        }
    }
}
