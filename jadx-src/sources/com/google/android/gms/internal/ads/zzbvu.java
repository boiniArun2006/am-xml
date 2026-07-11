package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzbvu extends zzbct implements zzbvv {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String string = parcel.readString();
            zzbcu.zzh(parcel);
            zze(string);
        } else if (i2 == 2) {
            String string2 = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(string2);
        } else {
            if (i2 != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcu.zzh(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbvu() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }
}
