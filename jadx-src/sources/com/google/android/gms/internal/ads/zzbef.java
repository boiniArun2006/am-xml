package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbef {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    @VisibleForTesting
    public zzbef(float f3, float f4, float f5, float f6, int i2) {
        this.zza = f3;
        this.zzb = f4;
        this.zzc = f3 + f5;
        this.zzd = f4 + f6;
        this.zze = i2;
    }

    final float zza() {
        return this.zza;
    }

    final float zzb() {
        return this.zzb;
    }

    final float zzc() {
        return this.zzc;
    }

    final float zzd() {
        return this.zzd;
    }

    final int zze() {
        return this.zze;
    }
}
