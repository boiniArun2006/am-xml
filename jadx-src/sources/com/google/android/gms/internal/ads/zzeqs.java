package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzeqs extends com.google.android.gms.ads.internal.client.zzbp {
    private final zzesa zza;

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zzf() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized boolean zzg() throws RemoteException {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zzh() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar, int i2) throws RemoteException {
        this.zza.zzb(zzmVar, i2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.zza.zzb(zzmVar, 1);
    }

    public zzeqs(Context context, zzcma zzcmaVar, zzfjj zzfjjVar, zzdor zzdorVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        zzesc zzescVar = new zzesc(zzdorVar, zzcmaVar.zzD());
        zzescVar.zza(zzbkVar);
        this.zza = new zzesa(new zzesm(zzcmaVar, context, zzescVar, zzfjjVar), zzfjjVar.zzh());
    }
}
