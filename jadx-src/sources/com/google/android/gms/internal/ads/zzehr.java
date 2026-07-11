package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzehr {
    private long zza = 0;
    private int zzb = 0;
    private long zzc = 0;
    private long zzd = 0;
    private long zze = 0;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private final Object zzh = new Object();
    private final Object zzi = new Object();
    private final Object zzj = new Object();

    public final synchronized void zza(long j2) {
        synchronized (this.zzf) {
            this.zza = j2;
        }
    }

    public final synchronized long zzb() {
        long j2;
        synchronized (this.zzf) {
            j2 = this.zza;
        }
        return j2;
    }

    public final synchronized void zzg(long j2) {
        synchronized (this.zzi) {
            this.zzd = j2;
        }
    }

    public final synchronized long zzh() {
        long j2;
        synchronized (this.zzi) {
            j2 = this.zzd;
        }
        return j2;
    }

    public final synchronized void zzi(long j2) {
        synchronized (this.zzj) {
            this.zze = j2;
        }
    }

    public final synchronized long zzj() {
        long j2;
        synchronized (this.zzj) {
            j2 = this.zze;
        }
        return j2;
    }

    public final void zzc(int i2) {
        synchronized (this.zzg) {
            this.zzb = i2;
        }
    }

    public final int zzd() {
        int i2;
        synchronized (this.zzg) {
            i2 = this.zzb;
        }
        return i2;
    }

    public final void zze(long j2) {
        synchronized (this.zzh) {
            this.zzc = j2;
        }
    }

    public final long zzf() {
        long j2;
        synchronized (this.zzh) {
            j2 = this.zzc;
        }
        return j2;
    }
}
