package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class zzcd extends zzbct implements zzce {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzft zzftVar = (zzft) zzbcu.zzb(parcel, zzft.CREATOR);
            zzbcu.zzh(parcel);
            zze(zzftVar);
        } else {
            if (i2 != 2) {
                return false;
            }
            zzft zzftVar2 = (zzft) zzbcu.zzb(parcel, zzft.CREATOR);
            zzbcu.zzh(parcel);
            zzf(zzftVar2);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }
}
