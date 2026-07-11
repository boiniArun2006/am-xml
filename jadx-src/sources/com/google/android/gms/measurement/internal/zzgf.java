package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzgf extends com.google.android.gms.internal.measurement.zzbm implements zzgg {
    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 2) {
            return false;
        }
        zzop zzopVar = (zzop) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, zzop.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
        zze(zzopVar);
        return true;
    }

    public zzgf() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }
}
