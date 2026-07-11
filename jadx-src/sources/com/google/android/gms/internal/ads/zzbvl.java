package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzbvl extends zzbct implements zzbvm {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzbui zzbuiVarZzb = zzbuh.zzb(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zze(zzbuiVarZzb);
        } else if (i2 == 2) {
            String string = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(string);
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

    public zzbvl() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }
}
