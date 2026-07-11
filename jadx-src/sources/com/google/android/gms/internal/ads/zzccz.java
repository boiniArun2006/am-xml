package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzccz extends zzbct implements zzcda {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            parcel.readString();
            parcel.readString();
            zzbcu.zzh(parcel);
        } else if (i2 == 2) {
            String string = parcel.readString();
            zzbcu.zzh(parcel);
            zzb(string);
        } else {
            if (i2 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
            zzbcu.zzh(parcel);
            zzc(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzccz() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }
}
