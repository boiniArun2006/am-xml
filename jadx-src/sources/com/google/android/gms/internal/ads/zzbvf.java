package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzbvf extends zzbct implements zzbvg {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zze(iObjectWrapperAsInterface);
        } else if (i2 == 2) {
            String string = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(string);
        } else if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcu.zzh(parcel);
            zzg(zzeVar);
        } else {
            if (i2 != 4) {
                return false;
            }
            zzbuc zzbucVarZzb = zzbub.zzb(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzh(zzbucVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbvf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }
}
