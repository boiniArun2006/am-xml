package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfwo extends zzbcs implements IInterface {
    zzfwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfwm zze(zzfwk zzfwkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzfwkVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzfwm zzfwmVar = (zzfwm) zzbcu.zzb(parcelZzcZ, zzfwm.CREATOR);
        parcelZzcZ.recycle();
        return zzfwmVar;
    }

    public final void zzf(zzfwh zzfwhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzfwhVar);
        zzda(2, parcelZza);
    }

    public final zzfwv zzg(zzfwt zzfwtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzfwtVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzfwv zzfwvVar = (zzfwv) zzbcu.zzb(parcelZzcZ, zzfwv.CREATOR);
        parcelZzcZ.recycle();
        return zzfwvVar;
    }
}
