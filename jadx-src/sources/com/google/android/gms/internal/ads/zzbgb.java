package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbgb {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbgb(InputStream inputStream, boolean z2, boolean z3, long j2, boolean z4) {
        this.zza = inputStream;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = j2;
        this.zze = z4;
    }

    public static zzbgb zza(InputStream inputStream, boolean z2, boolean z3, long j2, boolean z4) {
        return new zzbgb(inputStream, z2, z3, j2, z4);
    }

    public final InputStream zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
