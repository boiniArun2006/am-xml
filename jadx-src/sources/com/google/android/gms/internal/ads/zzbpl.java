package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbpl extends zzbcs implements zzbpn {
    zzbpl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpn
    public final zzbpk zze(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2, zzbph zzbphVar) throws RemoteException {
        zzbpk zzbpiVar;
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbcu.zze(parcelZza, zzbphVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbpiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (iInterfaceQueryLocalInterface instanceof zzbpk) {
                zzbpiVar = (zzbpk) iInterfaceQueryLocalInterface;
            } else {
                zzbpiVar = new zzbpi(strongBinder);
            }
        }
        parcelZzcZ.recycle();
        return zzbpiVar;
    }
}
