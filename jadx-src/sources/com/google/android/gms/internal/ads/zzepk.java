package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class zzepk extends zzbty {
    private final zzdbd zza;
    private final zzdjk zzb;
    private final zzdbx zzc;
    private final zzdcm zzd;
    private final zzdcr zze;
    private final zzdgj zzf;
    private final zzddq zzg;
    private final zzdki zzh;
    private final zzdgf zzi;
    private final zzdbs zzj;

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzg(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzm(zzblm zzblmVar, String str) {
    }

    public void zzp(zzcas zzcasVar) {
    }

    public void zzr(zzcaw zzcawVar) throws RemoteException {
    }

    public void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzw(int i2, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    public void zzz() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzf() {
        this.zzg.zzdT(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzh() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzl(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzq() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    @Deprecated
    public final void zzs(int i2) throws RemoteException {
        zzy(new com.google.android.gms.ads.internal.client.zze(i2, "", "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzu() throws RemoteException {
        this.zzh.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzv(String str) {
        zzy(new com.google.android.gms.ads.internal.client.zze(0, str, "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zzc(zzfkm.zzc(8, zzeVar));
    }

    public zzepk(zzdbd zzdbdVar, zzdjk zzdjkVar, zzdbx zzdbxVar, zzdcm zzdcmVar, zzdcr zzdcrVar, zzdgj zzdgjVar, zzddq zzddqVar, zzdki zzdkiVar, zzdgf zzdgfVar, zzdbs zzdbsVar) {
        this.zza = zzdbdVar;
        this.zzb = zzdjkVar;
        this.zzc = zzdbxVar;
        this.zzd = zzdcmVar;
        this.zze = zzdcrVar;
        this.zzf = zzdgjVar;
        this.zzg = zzddqVar;
        this.zzh = zzdkiVar;
        this.zzi = zzdgfVar;
        this.zzj = zzdbsVar;
    }
}
