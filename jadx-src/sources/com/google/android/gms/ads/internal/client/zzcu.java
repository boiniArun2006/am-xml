package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class zzcu extends zzbct implements zzcv {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze zzeVar = (zze) zzbcu.zzb(parcel, zze.CREATOR);
            zzbcu.zzh(parcel);
            zzb(zzeVar);
        } else if (i2 == 2) {
            zzc();
        } else if (i2 == 3) {
            zzd();
        } else if (i2 == 4) {
            zze();
        } else {
            if (i2 != 5) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }

    public zzcu() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }
}
