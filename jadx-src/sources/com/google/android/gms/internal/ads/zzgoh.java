package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgoh extends zzbcs implements zzgoj {
    zzgoh(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgoj
    public final void zze(String str, Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbcu.zzc(parcelZza, bundle);
        zzbcu.zze(parcelZza, zzgolVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgoj
    public final void zzf(Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, bundle);
        zzbcu.zze(parcelZza, zzgolVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgoj
    public final void zzg(Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, bundle);
        zzbcu.zze(parcelZza, zzgolVar);
        zzdb(3, parcelZza);
    }
}
