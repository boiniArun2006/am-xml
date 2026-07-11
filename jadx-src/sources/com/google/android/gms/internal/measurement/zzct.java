package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzct extends zzbm implements zzcu {
    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
        zzbn.zzf(parcel);
        zzb(bundle);
        parcel2.writeNoException();
        return true;
    }

    public zzct() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
}
