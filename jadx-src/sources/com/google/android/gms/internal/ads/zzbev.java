package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbev extends zzbcs implements zzbex {
    @Override // com.google.android.gms.internal.ads.zzbex
    public final com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    zzbev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final long zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        long j2 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzf(IObjectWrapper iObjectWrapper, zzbfe zzbfeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, zzbfeVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzh(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i2 = zzbcu.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzdtVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzl(long j2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j2);
        zzda(10, parcelZza);
    }
}
