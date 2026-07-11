package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcts extends zzbew {
    private final zzctr zza;
    private final com.google.android.gms.ads.internal.client.zzbx zzb;
    private final zzfer zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbn)).booleanValue();
    private final zzdxz zze;

    @Override // com.google.android.gms.internal.ads.zzbex
    public final com.google.android.gms.ads.internal.client.zzbx zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzh(boolean z2) {
        this.zzd = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzf(IObjectWrapper iObjectWrapper, zzbfe zzbfeVar) {
        try {
            this.zzc.zzp(zzbfeVar);
            this.zza.zzb((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbfeVar, this.zzd);
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzea zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhG)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdtVar.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e2);
            }
            this.zzc.zzr(zzdtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    @Nullable
    public final String zzj() {
        try {
            return this.zzb.zzu();
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final long zzk() {
        zzctr zzctrVar = this.zza;
        if (zzctrVar == null || zzctrVar.zzo() == null) {
            return 0L;
        }
        return zzctrVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzl(long j2) {
        zzctr zzctrVar = this.zza;
        if (zzctrVar == null || zzctrVar.zzo() == null) {
            return;
        }
        zzctrVar.zzo().zzb(j2);
    }

    public zzcts(zzctr zzctrVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar, zzfer zzferVar, zzdxz zzdxzVar) {
        this.zza = zzctrVar;
        this.zzb = zzbxVar;
        this.zzc = zzferVar;
        this.zze = zzdxzVar;
    }
}
