package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class zzbp extends zzbct implements zzbq {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzm zzmVar = (zzm) zzbcu.zzb(parcel, zzm.CREATOR);
            zzbcu.zzh(parcel);
            zze(zzmVar);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else if (i2 == 3) {
            boolean zZzg = zzg();
            parcel2.writeNoException();
            int i5 = zzbcu.zza;
            parcel2.writeInt(zZzg ? 1 : 0);
        } else if (i2 == 4) {
            String strZzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(strZzh);
        } else {
            if (i2 != 5) {
                return false;
            }
            zzm zzmVar2 = (zzm) zzbcu.zzb(parcel, zzm.CREATOR);
            int i7 = parcel.readInt();
            zzbcu.zzh(parcel);
            zzi(zzmVar2, i7);
            parcel2.writeNoException();
        }
        return true;
    }

    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }
}
