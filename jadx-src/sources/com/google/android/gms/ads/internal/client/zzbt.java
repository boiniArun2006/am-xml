package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbrb;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface zzbt extends IInterface {
    zzbq zze() throws RemoteException;

    void zzf(zzbk zzbkVar) throws RemoteException;

    void zzg(zzblq zzblqVar) throws RemoteException;

    void zzh(zzblt zzbltVar) throws RemoteException;

    void zzi(String str, zzblz zzblzVar, @Nullable zzblw zzblwVar) throws RemoteException;

    void zzj(zzbkh zzbkhVar) throws RemoteException;

    void zzk(zzbmd zzbmdVar, zzr zzrVar) throws RemoteException;

    void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzm(zzbmg zzbmgVar) throws RemoteException;

    void zzn(zzbqs zzbqsVar) throws RemoteException;

    void zzo(zzbrb zzbrbVar) throws RemoteException;

    void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzq(zzcs zzcsVar) throws RemoteException;
}
