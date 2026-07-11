package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class zzef extends zzbct implements zzeg {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze();
        } else if (i2 == 2) {
            zzf();
        } else if (i2 == 3) {
            zzg();
        } else if (i2 == 4) {
            zzh();
        } else {
            if (i2 != 5) {
                return false;
            }
            boolean zZza = zzbcu.zza(parcel);
            zzbcu.zzh(parcel);
            zzi(zZza);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzef() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }
}
