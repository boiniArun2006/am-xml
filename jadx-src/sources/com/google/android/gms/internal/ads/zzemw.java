package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzemw extends zzbvl {
    final /* synthetic */ zzemx zza;
    private final zzekj zzb;

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(zzbui zzbuiVar) throws RemoteException {
        this.zza.zzc(zzbuiVar);
        ((zzelv) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzf(String str) throws RemoteException {
        ((zzelv) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzelv) this.zzb.zzc).zzx(zzeVar);
    }

    /* synthetic */ zzemw(zzemx zzemxVar, zzekj zzekjVar, byte[] bArr) {
        Objects.requireNonNull(zzemxVar);
        this.zza = zzemxVar;
        this.zzb = zzekjVar;
    }
}
