package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Random;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfra {
    private final long zza;
    private final long zzb;
    private final Clock zzf;
    private long zzg;
    private long zzd = 5;
    private long zze = 0;
    private final Random zzh = new Random();
    private long zzc = 0;

    public final void zza() {
        this.zzg = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final synchronized void zzf(int i2) {
        Preconditions.checkArgument(i2 > 0);
        this.zzd = i2;
    }

    public final long zzb() {
        double d2 = this.zzg;
        double d4 = 0.2d * d2;
        long j2 = (long) (d2 + d4);
        return ((long) (d2 - d4)) + ((long) (this.zzh.nextDouble() * ((j2 - r0) + 1)));
    }

    public final void zzc() {
        this.zze = this.zzf.currentTimeMillis() + zzb();
        double d2 = this.zzg;
        this.zzg = Math.min((long) (d2 + d2), this.zzb);
        this.zzc++;
    }

    public final boolean zzd() {
        return this.zzf.currentTimeMillis() < this.zze;
    }

    public final boolean zze() {
        zzbgv zzbgvVar = zzbhe.zzJ;
        return ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue() >= 0 && this.zzc > Math.max(this.zzd, (long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue()) && this.zzg >= this.zzb;
    }

    public zzfra(long j2, double d2, long j3, double d4, Clock clock) {
        this.zza = j2;
        this.zzb = j3;
        this.zzf = clock;
        zza();
    }
}
