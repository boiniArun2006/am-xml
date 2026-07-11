package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.vungle.ads.internal.Constants;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdzm {
    private final zzbph zza;

    zzdzm(zzbph zzbphVar) {
        this.zza = zzbphVar;
    }

    public final void zza() throws RemoteException {
        zzs(new zzdzl("initialize", null));
    }

    public final void zzb(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("creation", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("nativeObjectCreated");
        zzs(zzdzlVar);
    }

    public final void zzc(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("creation", null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("nativeObjectNotCreated");
        zzs(zzdzlVar);
    }

    public final void zzd(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdzlVar);
    }

    public final void zze(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdLoaded");
        zzs(zzdzlVar);
    }

    public final void zzf(long j2, int i2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdFailedToLoad");
        zzdzlVar.zzd(Integer.valueOf(i2));
        zzs(zzdzlVar);
    }

    public final void zzg(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdOpened");
        zzs(zzdzlVar);
    }

    public final void zzh(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdClicked");
        this.zza.zzb(zzdzlVar.zza());
    }

    public final void zzi(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdClosed");
        zzs(zzdzlVar);
    }

    public final void zzj(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdzlVar);
    }

    public final void zzk(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onRewardedAdLoaded");
        zzs(zzdzlVar);
    }

    public final void zzl(long j2, int i2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onRewardedAdFailedToLoad");
        zzdzlVar.zzd(Integer.valueOf(i2));
        zzs(zzdzlVar);
    }

    public final void zzm(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onRewardedAdOpened");
        zzs(zzdzlVar);
    }

    public final void zzn(long j2, int i2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onRewardedAdFailedToShow");
        zzdzlVar.zzd(Integer.valueOf(i2));
        zzs(zzdzlVar);
    }

    public final void zzo(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onRewardedAdClosed");
        zzs(zzdzlVar);
    }

    public final void zzp(long j2, zzcaw zzcawVar) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onUserEarnedReward");
        zzdzlVar.zze(zzcawVar.zze());
        zzdzlVar.zzf(Integer.valueOf(zzcawVar.zzf()));
        zzs(zzdzlVar);
    }

    public final void zzq(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdImpression");
        zzs(zzdzlVar);
    }

    public final void zzr(long j2) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzdzlVar.zzb(Long.valueOf(j2));
        zzdzlVar.zzc("onAdClicked");
        zzs(zzdzlVar);
    }

    private final void zzs(zzdzl zzdzlVar) throws RemoteException {
        String strZza = zzdzlVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zzb(strZza);
    }
}
