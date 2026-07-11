package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbtt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzcw extends zzbcs implements zzcy {
    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzbtt getAdapterCreator() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbtt zzbttVarZzf = zzbts.zzf(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbttVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzfc getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        zzfc zzfcVar = (zzfc) zzbcu.zzb(parcelZzcZ, zzfc.CREATOR);
        parcelZzcZ.recycle();
        return zzfcVar;
    }

    zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }
}
