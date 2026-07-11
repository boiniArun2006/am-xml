package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzph {
    private long zza;
    private com.google.android.gms.internal.measurement.zzib zzb;
    private String zzc;
    private Map zzd;
    private zzlr zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private int zzi;

    zzph() {
    }

    public final zzpi zza() {
        return new zzpi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, null);
    }

    public final zzph zzb(long j2) {
        this.zza = j2;
        return this;
    }

    public final zzph zzc(com.google.android.gms.internal.measurement.zzib zzibVar) {
        this.zzb = zzibVar;
        return this;
    }

    public final zzph zzd(String str) {
        this.zzc = str;
        return this;
    }

    public final zzph zze(Map map) {
        this.zzd = map;
        return this;
    }

    public final zzph zzf(zzlr zzlrVar) {
        this.zze = zzlrVar;
        return this;
    }

    public final zzph zzg(long j2) {
        this.zzf = j2;
        return this;
    }

    public final zzph zzh(long j2) {
        this.zzg = j2;
        return this;
    }

    public final zzph zzi(long j2) {
        this.zzh = j2;
        return this;
    }

    public final zzph zzj(int i2) {
        this.zzi = i2;
        return this;
    }
}
