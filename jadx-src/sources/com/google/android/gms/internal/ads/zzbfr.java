package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbfr extends zzbcs implements IInterface {
    zzbfr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbfm zze(zzbfp zzbfpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzbfpVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzbfm zzbfmVar = (zzbfm) zzbcu.zzb(parcelZzcZ, zzbfm.CREATOR);
        parcelZzcZ.recycle();
        return zzbfmVar;
    }

    public final zzbfm zzf(zzbfp zzbfpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzbfpVar);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        zzbfm zzbfmVar = (zzbfm) zzbcu.zzb(parcelZzcZ, zzbfm.CREATOR);
        parcelZzcZ.recycle();
        return zzbfmVar;
    }

    public final long zzg(zzbfp zzbfpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzbfpVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        long j2 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j2;
    }
}
