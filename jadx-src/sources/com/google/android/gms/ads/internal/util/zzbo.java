package com.google.android.gms.ads.internal.util;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface zzbo extends IInterface {
    boolean zze(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException;
}
