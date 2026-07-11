package com.google.android.gms.location;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzay extends com.google.android.gms.internal.location.zza implements zzba {
    @Override // com.google.android.gms.location.zzba
    public final void zzd(LocationResult locationResult) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.zzba
    public final void zze(LocationAvailability locationAvailability) throws RemoteException {
        throw null;
    }

    zzay(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }
}
