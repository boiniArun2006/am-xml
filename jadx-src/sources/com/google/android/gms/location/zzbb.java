package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzbb extends com.google.android.gms.internal.location.zza implements zzbd {
    @Override // com.google.android.gms.location.zzbd
    public final void zzd(Location location) throws RemoteException {
        throw null;
    }

    zzbb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }
}
