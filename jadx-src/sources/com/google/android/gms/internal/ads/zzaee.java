package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaee {
    public static final zzaee zza = new zzaee(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaee(int i2, long j2, long j3) {
        this.zzb = i2;
        this.zzc = j2;
        this.zzd = j3;
    }

    public static zzaee zza(long j2, long j3) {
        return new zzaee(-1, j2, j3);
    }

    public static zzaee zzb(long j2, long j3) {
        return new zzaee(-2, j2, j3);
    }

    public static zzaee zzc(long j2) {
        return new zzaee(0, -9223372036854775807L, j2);
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
