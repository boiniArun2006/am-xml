package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzaae implements zzaac {
    private final zzaac zza;

    public zzaae(zzaac zzaacVar) {
        this.zza = zzaacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public zzbg zza() {
        return this.zza.zza();
    }

    public final zzaac zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zze() {
        return this.zza.zze();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaae) {
            return this.zza.equals(((zzaae) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public zzv zzb(int i2) {
        return this.zza.zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public zzv zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zzf(int i2) {
        return this.zza.zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zzg(int i2) {
        return this.zza.zzg(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final int zzh() {
        return this.zza.zzh();
    }
}
