package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzxv implements zzaam {
    public long zza;
    public long zzb;

    @Nullable
    public zzaal zzc;

    @Nullable
    public zzxv zzd;

    public final zzxv zzc() {
        this.zzc = null;
        zzxv zzxvVar = this.zzd;
        this.zzd = null;
        return zzxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    @Nullable
    public final zzaam zze() {
        zzxv zzxvVar = this.zzd;
        if (zzxvVar == null || zzxvVar.zzc == null) {
            return null;
        }
        return zzxvVar;
    }

    public final void zza(long j2, int i2) {
        zzgrc.zzi(this.zzc == null);
        this.zza = j2;
        this.zzb = j2 + 65536;
    }

    public final int zzb(long j2) {
        long j3 = j2 - this.zza;
        int i2 = this.zzc.zzb;
        return (int) j3;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaal zzd() {
        zzaal zzaalVar = this.zzc;
        zzaalVar.getClass();
        return zzaalVar;
    }

    public zzxv(long j2, int i2) {
        zza(j2, 65536);
    }
}
