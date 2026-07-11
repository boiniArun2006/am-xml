package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzblv extends zzbct implements zzblw {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzblm zzblkVar;
        if (i2 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzblkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzblkVar = iInterfaceQueryLocalInterface instanceof zzblm ? (zzblm) iInterfaceQueryLocalInterface : new zzblk(strongBinder);
        }
        String string = parcel.readString();
        zzbcu.zzh(parcel);
        zze(zzblkVar, string);
        parcel2.writeNoException();
        return true;
    }

    public zzblv() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzblw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof zzblw ? (zzblw) iInterfaceQueryLocalInterface : new zzblu(iBinder);
    }
}
