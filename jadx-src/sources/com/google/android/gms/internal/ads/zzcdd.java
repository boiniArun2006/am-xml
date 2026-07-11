package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface zzcdd extends IInterface {
    void zze(IObjectWrapper iObjectWrapper, zzcdh zzcdhVar, zzcda zzcdaVar) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzg(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException;

    void zzh(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException;

    void zzi(zzbyk zzbykVar) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzk(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException;

    void zzl(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException;

    IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException;
}
