package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcay;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbh;
import com.google.android.gms.internal.ads.zzcbn;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzfq extends zzcay {
    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zze(zzcbc zzcbcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzf(zzdq zzdqVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzh(zzcbn zzcbnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final boolean zzi() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzj() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    @Nullable
    public final zzcaw zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final zzea zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    @Nullable
    public final String zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzo(zzdt zzdtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzp(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final long zzq() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzr(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzs(zzcbh zzcbhVar) throws RemoteException {
    }

    private static void zzu(final zzcbg zzcbgVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbg zzcbgVar2 = zzcbgVar;
                if (zzcbgVar2 != null) {
                    try {
                        zzcbgVar2.zzf(1);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final Bundle zzg() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzc(zzm zzmVar, zzcbg zzcbgVar) throws RemoteException {
        zzu(zzcbgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzd(zzm zzmVar, zzcbg zzcbgVar) throws RemoteException {
        zzu(zzcbgVar);
    }
}
