package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface zzbks extends IInterface {
    IObjectWrapper zzb() throws RemoteException;

    Uri zzc() throws RemoteException;

    double zzd() throws RemoteException;

    int zze() throws RemoteException;

    int zzf() throws RemoteException;

    @Nullable
    Map zzg() throws RemoteException;
}
