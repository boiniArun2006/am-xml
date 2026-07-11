package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcs;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdd extends zzbcs implements zzdf {
    @Override // com.google.android.gms.ads.internal.client.zzdf
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    zzdd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }
}
