package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfii extends zzcay {
    private final zzfie zza;
    private final zzfhv zzb;
    private final String zzc;
    private final zzfjd zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzazh zzg;
    private final zzdxz zzh;

    @Nullable
    private zzdtz zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbk)).booleanValue();

    private final synchronized void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar, int i2) throws RemoteException {
        try {
            if (!zzmVar.zzb()) {
                boolean z2 = false;
                if (((Boolean) zzbjc.zzk.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue()) {
                        z2 = true;
                    }
                }
                if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmG)).intValue() || !z2) {
                    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
                }
            }
            zzfhv zzfhvVar = this.zzb;
            zzfhvVar.zzh(zzcbgVar);
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzM(this.zze) && zzmVar.zzs == null) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
                zzfhvVar.zzdI(zzfkm.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzfhx zzfhxVar = new zzfhx(null);
            zzfie zzfieVar = this.zza;
            zzfieVar.zzj(i2);
            zzfieVar.zza(zzmVar, this.zzc, zzfhxVar, new zzfih(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzk(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) throws RemoteException {
        zzx(zzmVar, zzcbgVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) throws RemoteException {
        zzx(zzmVar, zzcbgVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzh(zzcbn zzcbnVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfjd zzfjdVar = this.zzd;
        zzfjdVar.zza = zzcbnVar.zza;
        zzfjdVar.zzb = zzcbnVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    @Nullable
    public final synchronized String zzj() throws RemoteException {
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar == null || zzdtzVar.zzn() == null) {
            return null;
        }
        return zzdtzVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, boolean z2) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzfkm.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z2, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    @Nullable
    public final String zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzp(boolean z2) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized long zzq() {
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar == null || zzdtzVar.zzo() == null) {
            return 0L;
        }
        return zzdtzVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final synchronized void zzr(long j2) {
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar == null || zzdtzVar.zzo() == null) {
            return;
        }
        zzdtzVar.zzo().zzb(j2);
    }

    final /* synthetic */ zzfjd zzu() {
        return this.zzd;
    }

    final /* synthetic */ zzdtz zzv() {
        return this.zzi;
    }

    final /* synthetic */ void zzw(zzdtz zzdtzVar) {
        this.zzi = zzdtzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zze(zzcbc zzcbcVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcbcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (zzdqVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfig(this, zzdqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final Bundle zzg() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdtz zzdtzVar = this.zzi;
        return zzdtzVar != null ? zzdtzVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final boolean zzi() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdtz zzdtzVar = this.zzi;
        return (zzdtzVar == null || zzdtzVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    @Nullable
    public final zzcaw zzl() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar != null) {
            return zzdtzVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzea zzm() {
        zzdtz zzdtzVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhG)).booleanValue() && (zzdtzVar = this.zzi) != null) {
            return zzdtzVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdtVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.zzb.zzl(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzs(zzcbh zzcbhVar) {
        Preconditions.checkMainThread(FijIa.NKGxaFX);
        this.zzb.zzo(zzcbhVar);
    }

    public zzfii(@Nullable String str, zzfie zzfieVar, Context context, zzfhv zzfhvVar, zzfjd zzfjdVar, VersionInfoParcel versionInfoParcel, zzazh zzazhVar, zzdxz zzdxzVar) {
        this.zzc = str;
        this.zza = zzfieVar;
        this.zzb = zzfhvVar;
        this.zzd = zzfjdVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzazhVar;
        this.zzh = zzdxzVar;
    }
}
