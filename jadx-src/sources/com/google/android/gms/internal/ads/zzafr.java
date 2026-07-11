package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzafr {
    public int zza;

    @Nullable
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzafr() {
    }

    public zzafr(zzafr zzafrVar) {
        this.zza = zzafrVar.zza;
        this.zzb = zzafrVar.zzb;
        this.zzc = zzafrVar.zzc;
        this.zzd = zzafrVar.zzd;
        this.zze = zzafrVar.zze;
        this.zzf = zzafrVar.zzf;
        this.zzg = zzafrVar.zzg;
    }

    public final boolean zza(int i2) {
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        if (zzafs.zzl(i2) && (i3 = (i2 >>> 19) & 3) != 1 && (i5 = (i2 >>> 17) & 3) != 0 && (i7 = (i2 >>> 12) & 15) != 0 && i7 != 15 && (i8 = (i2 >>> 10) & 3) != 3) {
            int i11 = i7 - 1;
            this.zza = i3;
            this.zzb = zzafs.zza[3 - i5];
            int i12 = zzafs.zzb[i8];
            this.zzd = i12;
            int i13 = 2;
            if (i3 == 2) {
                i12 /= 2;
                this.zzd = i12;
            } else if (i3 == 0) {
                i12 /= 4;
                this.zzd = i12;
            }
            int i14 = (i2 >>> 9) & 1;
            this.zzg = zzafs.zzm(i3, i5);
            if (i5 == 3) {
                if (i3 == 3) {
                    i10 = zzafs.zzc[i11];
                } else {
                    i10 = zzafs.zzd[i11];
                }
                this.zzf = i10;
                this.zzc = (((i10 * 12) / i12) + i14) * 4;
            } else {
                int i15 = 144;
                if (i3 == 3) {
                    if (i5 == 2) {
                        i9 = zzafs.zze[i11];
                    } else {
                        i9 = zzafs.zzf[i11];
                    }
                    this.zzf = i9;
                    this.zzc = ((i9 * 144) / i12) + i14;
                } else {
                    int i16 = zzafs.zzg[i11];
                    this.zzf = i16;
                    if (i5 == 1) {
                        i15 = 72;
                    }
                    this.zzc = ((i15 * i16) / i12) + i14;
                }
            }
            if (((i2 >> 6) & 3) == 3) {
                i13 = 1;
            }
            this.zze = i13;
            return true;
        }
        return false;
    }
}
