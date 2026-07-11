package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzbts extends zzbct implements zzbtt {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String string = parcel.readString();
            zzbcu.zzh(parcel);
            zzbtw zzbtwVarZzb = zzb(string);
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zzbtwVarZzb);
        } else if (i2 == 2) {
            String string2 = parcel.readString();
            zzbcu.zzh(parcel);
            boolean zZzc = zzc(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzc ? 1 : 0);
        } else if (i2 == 3) {
            String string3 = parcel.readString();
            zzbcu.zzh(parcel);
            zzbvs zzbvsVarZze = zze(string3);
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zzbvsVarZze);
        } else {
            if (i2 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzbcu.zzh(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }

    public zzbts() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbtt zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbtt ? (zzbtt) iInterfaceQueryLocalInterface : new zzbtr(iBinder);
    }
}
