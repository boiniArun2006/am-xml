package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdsv extends zzbml {

    @Nullable
    private final String zza;
    private final zzdoc zzb;
    private final zzdoh zzc;
    private final zzdxz zzd;

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzo() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzA() throws RemoteException {
        zzdoh zzdohVar = this.zzc;
        return (zzdohVar.zzE().isEmpty() || zzdohVar.zzF() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzB(@Nullable com.google.android.gms.ads.internal.client.zzdj zzdjVar) throws RemoteException {
        this.zzb.zzA(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzC(com.google.android.gms.ads.internal.client.zzdf zzdfVar) throws RemoteException {
        this.zzb.zzB(zzdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzD() {
        this.zzb.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzE() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbkp zzF() throws RemoteException {
        return this.zzb.zzP().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzG() {
        return this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzea zzH() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhG)).booleanValue()) {
            return this.zzb.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzJ(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzow)).booleanValue()) {
            this.zzb.zzR(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final long zzK() {
        zzdoc zzdocVar = this.zzb;
        if (zzdocVar == null || zzdocVar.zzo() == null) {
            return 0L;
        }
        return zzdocVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzL(long j2) {
        zzdoc zzdocVar = this.zzb;
        if (zzdocVar == null || zzdocVar.zzo() == null) {
            return;
        }
        zzdocVar.zzo().zzb(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zze() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final List zzf() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzg() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbks zzh() throws RemoteException {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzi() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzj() throws RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final double zzk() throws RemoteException {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzl() throws RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzm() throws RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final com.google.android.gms.ads.internal.client.zzed zzn() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzp() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbkl zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzt(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final IObjectWrapper zzu() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final IObjectWrapper zzv() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final Bundle zzw() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzx(zzbmj zzbmjVar) throws RemoteException {
        this.zzb.zzy(zzbmjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzy() throws RemoteException {
        this.zzb.zzz();
    }

    public zzdsv(@Nullable String str, zzdoc zzdocVar, zzdoh zzdohVar, zzdxz zzdxzVar) {
        this.zza = str;
        this.zzb = zzdocVar;
        this.zzc = zzdohVar;
        this.zzd = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzI(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        try {
            if (!zzdtVar.zzf()) {
                this.zzd.zzb();
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.zzb.zzQ(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final List zzz() throws RemoteException {
        if (zzA()) {
            return this.zzc.zzE();
        }
        return Collections.EMPTY_LIST;
    }
}
