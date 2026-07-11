package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface zzck extends IInterface {
    void zze(List list, zzce zzceVar) throws RemoteException;

    boolean zzf(String str) throws RemoteException;

    @Nullable
    zzcaz zzg(String str) throws RemoteException;

    boolean zzh(String str) throws RemoteException;

    @Nullable
    zzbex zzi(String str) throws RemoteException;

    boolean zzj(String str) throws RemoteException;

    @Nullable
    zzbx zzk(String str) throws RemoteException;

    void zzl(zzbtt zzbttVar) throws RemoteException;

    boolean zzm(String str, zzft zzftVar, @Nullable zzch zzchVar) throws RemoteException;

    boolean zzn(int i2, String str) throws RemoteException;

    @Nullable
    zzbx zzo(String str) throws RemoteException;

    @Nullable
    zzbex zzp(String str) throws RemoteException;

    @Nullable
    zzcaz zzq(String str) throws RemoteException;

    @Nullable
    zzft zzr(int i2, String str) throws RemoteException;

    Bundle zzs(int i2) throws RemoteException;

    int zzt(int i2, String str) throws RemoteException;

    boolean zzu(int i2, String str) throws RemoteException;

    void zzv(int i2) throws RemoteException;
}
