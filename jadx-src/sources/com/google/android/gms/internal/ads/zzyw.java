package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class zzyw implements zzaac {
    protected final zzbg zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzv[] zzd;
    private int zze;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyw zzywVar = (zzyw) obj;
            if (this.zza.equals(zzywVar.zza) && Arrays.equals(this.zzc, zzywVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zzg(int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            if (this.zzc[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 != 0) {
            return i2;
        }
        int iIdentityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzv zzb(int i2) {
        return this.zzd[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final zzv zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zzf(int i2) {
        return this.zzc[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final int zzh() {
        return this.zzc[0];
    }

    public zzyw(zzbg zzbgVar, int[] iArr, int i2) {
        boolean z2;
        int length = iArr.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zzi(z2);
        zzbgVar.getClass();
        this.zza = zzbgVar;
        this.zzb = length;
        this.zzd = new zzv[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.zzd[i3] = zzbgVar.zza(iArr[i3]);
        }
        Arrays.sort(this.zzd, zzyv.zza);
        this.zzc = new int[this.zzb];
        for (int i5 = 0; i5 < this.zzb; i5++) {
            this.zzc[i5] = zzbgVar.zzb(this.zzd[i5]);
        }
    }
}
