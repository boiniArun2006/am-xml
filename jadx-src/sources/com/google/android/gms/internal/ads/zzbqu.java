package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzbqu extends zzbct implements zzbqv {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbqy zzbqwVar;
        if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zzed zzedVarZzb = zzb();
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zzedVarZzb);
            return true;
        }
        if (i2 == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 5) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbqwVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbqwVar = iInterfaceQueryLocalInterface instanceof zzbqy ? (zzbqy) iInterfaceQueryLocalInterface : new zzbqw(strongBinder);
            }
            zzbcu.zzh(parcel);
            zzd(iObjectWrapperAsInterface, zzbqwVar);
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 6) {
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zze(iObjectWrapperAsInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i2 != 7) {
            return false;
        }
        zzbkp zzbkpVarZzf = zzf();
        parcel2.writeNoException();
        zzbcu.zze(parcel2, zzbkpVarZzf);
        return true;
    }

    public zzbqu() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }
}
