package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface zzbzl extends IInterface {
    @Deprecated
    void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException;

    void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbzu zzbzuVar) throws RemoteException;
}
