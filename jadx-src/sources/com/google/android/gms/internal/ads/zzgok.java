package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzgok extends zzbct implements zzgol {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
        zzbcu.zzh(parcel);
        zzb(bundle);
        return true;
    }

    public zzgok() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }
}
