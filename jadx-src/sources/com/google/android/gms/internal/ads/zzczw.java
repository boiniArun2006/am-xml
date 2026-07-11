package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzczw implements zzdbf, zzdir, zzdgh, zzdbv, zzbde {
    private final zzdbx zza;
    private final zzddy zzb;
    private final zzfir zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private ScheduledFuture zzg;

    @Nullable
    private final String zzi;
    private final zzhah zzf = zzhah.zze();
    private final AtomicBoolean zzh = new AtomicBoolean();

    private final boolean zzl() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(zzcag zzcagVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final synchronized void zzdG() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzhah zzhahVar = this.zzf;
        if (zzhahVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhahVar.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzh() {
    }

    final /* synthetic */ void zzi() {
        synchronized (this) {
            try {
                zzhah zzhahVar = this.zzf;
                if (zzhahVar.isDone()) {
                    return;
                }
                zzhahVar.zza(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            zzhah zzhahVar = this.zzf;
            if (zzhahVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzhahVar.zzb(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ zzdbx zzk() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmU)).booleanValue() && zzl() && zzbddVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
        zzfir zzfirVar = this.zzc;
        if (zzfirVar.zze == 3) {
            return;
        }
        int i2 = zzfirVar.zzY;
        if (i2 == 0 || i2 == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmU)).booleanValue() && zzl()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzg() {
        zzfir zzfirVar = this.zzc;
        int i2 = zzfirVar.zze;
        if (i2 == 3) {
            return;
        }
        if (i2 == 4) {
            this.zzb.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcc)).booleanValue() && zzfirVar.zzY == 2) {
            int i3 = zzfirVar.zzq;
            if (i3 == 0) {
                this.zza.zza();
            } else {
                zzgzo.zzr(this.zzf, new zzczu(this), this.zze);
                this.zzg = this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi();
                    }
                }, i3, TimeUnit.MILLISECONDS);
            }
        }
    }

    zzczw(zzdbx zzdbxVar, zzfir zzfirVar, ScheduledExecutorService scheduledExecutorService, Executor executor, @Nullable String str, zzddy zzddyVar) {
        this.zza = zzdbxVar;
        this.zzc = zzfirVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzddyVar;
    }
}
