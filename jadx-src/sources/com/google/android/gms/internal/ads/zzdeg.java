package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdeg extends zzdhd {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private final zzdxz zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;

    @Nullable
    private ScheduledFuture zzj;

    @Nullable
    private ScheduledFuture zzk;

    private final synchronized void zzf(long j2) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            this.zze = this.zzc.elapsedRealtime() + j2;
            this.zzj = this.zzb.schedule(new zzdee(this, null), j2, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzg(long j2) {
        try {
            ScheduledFuture scheduledFuture = this.zzk;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzk.cancel(false);
            }
            this.zzf = this.zzc.elapsedRealtime() + j2;
            this.zzk = this.zzb.schedule(new zzdef(this, null), j2, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        try {
            if (this.zzi) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                this.zzg = this.zze - this.zzc.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.zzk;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzh = -1L;
            } else {
                this.zzk.cancel(false);
                this.zzh = this.zzf - this.zzc.elapsedRealtime();
            }
            this.zzi = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.zzi) {
                if (this.zzg > 0 && (scheduledFuture2 = this.zzj) != null && scheduledFuture2.isCancelled()) {
                    zzf(this.zzg);
                }
                if (this.zzh > 0 && (scheduledFuture = this.zzk) != null && scheduledFuture.isCancelled()) {
                    zzg(this.zzh);
                }
                this.zzi = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        this.zzi = false;
        zzf(0L);
    }

    public final synchronized void zzd(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (i2 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i2);
            if (this.zzi) {
                long j2 = this.zzg;
                if (j2 <= 0 || millis >= j2) {
                    millis = j2;
                }
                this.zzg = millis;
                return;
            }
            long jElapsedRealtime = this.zzc.elapsedRealtime();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoJ)).booleanValue()) {
                long j3 = this.zze;
                if (jElapsedRealtime >= j3 || j3 - jElapsedRealtime > millis) {
                    zzf(millis);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpg)).booleanValue()) {
                        zzdxy zzdxyVarZza = this.zzd.zza();
                        zzdxyVarZza.zzc(FileUploadManager.f61572j, "rtnc");
                        zzdxyVarZza.zzf();
                    }
                }
            } else {
                long j4 = this.zze;
                if (jElapsedRealtime > j4 || j4 - jElapsedRealtime > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (i2 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i2);
            if (this.zzi) {
                long j2 = this.zzh;
                if (j2 <= 0 || millis >= j2) {
                    millis = j2;
                }
                this.zzh = millis;
                return;
            }
            long jElapsedRealtime = this.zzc.elapsedRealtime();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoJ)).booleanValue()) {
                if (jElapsedRealtime == this.zzf) {
                    com.google.android.gms.ads.internal.util.zze.zza("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j3 = this.zzf;
                if (jElapsedRealtime >= j3 || j3 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            } else {
                long j4 = this.zzf;
                if (jElapsedRealtime > j4 || j4 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            }
        }
    }

    public zzdeg(ScheduledExecutorService scheduledExecutorService, Clock clock, zzdxz zzdxzVar) {
        super(Collections.EMPTY_SET);
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
        this.zzd = zzdxzVar;
    }
}
