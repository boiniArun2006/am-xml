package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzdm {
    private final zzdx zza;
    private final zzdx zzb;
    private final zzdl zzc;
    private Object zzd;
    private Object zze;
    private int zzf;

    private final void zzg(Runnable runnable) {
        zzdx zzdxVar = this.zzb;
        if (zzdxVar.zza().getThread().isAlive()) {
            zzdxVar.zzn(runnable);
        }
    }

    private final void zzh(Object obj) {
        Object obj2 = this.zzd;
        this.zzd = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.zzc.zza(obj2, obj);
    }

    public final void zza(zzgqt zzgqtVar, final zzgqt zzgqtVar2) {
        zzgrc.zzi(Looper.myLooper() == this.zzb.zza());
        this.zzf++;
        zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzgqtVar2);
            }
        });
        zzh(zzgqtVar.apply(this.zzd));
    }

    public final void zzb(final Object obj) {
        this.zze = obj;
        zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(obj);
            }
        });
    }

    public final void zzc(Runnable runnable) {
        zzdx zzdxVar = this.zza;
        if (zzdxVar.zza().getThread().isAlive()) {
            zzdxVar.zzn(runnable);
        }
    }

    final /* synthetic */ void zzd(zzgqt zzgqtVar) {
        final Object objApply = zzgqtVar.apply(this.zze);
        this.zze = objApply;
        zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(objApply);
            }
        });
    }

    final /* synthetic */ void zze(Object obj) {
        if (this.zzf == 0) {
            zzh(obj);
        }
    }

    final /* synthetic */ void zzf(Object obj) {
        int i2 = this.zzf - 1;
        this.zzf = i2;
        if (i2 == 0) {
            zzh(obj);
        }
    }

    public zzdm(Object obj, Looper looper, Looper looper2, zzdn zzdnVar, zzdl zzdlVar) {
        this.zza = zzdnVar.zzd(looper, null);
        this.zzb = zzdnVar.zzd(looper2, null);
        this.zzd = obj;
        this.zze = obj;
        this.zzc = zzdlVar;
    }
}
