package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbkq extends zzbcs implements zzbks {
    @Override // com.google.android.gms.internal.ads.zzbks
    public final IObjectWrapper zzb() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Uri zzc() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzbcu.zzb(parcelZzcZ, Uri.CREATOR);
        parcelZzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final double zzd() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        double d2 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        int i2 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i2 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Map zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        HashMap mapZzg = zzbcu.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return mapZzg;
    }

    zzbkq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }
}
