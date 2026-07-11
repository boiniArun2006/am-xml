package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzdzw extends zzcbb {
    final /* synthetic */ zzdzx zza;

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zze() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzm(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzf() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzo(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzg(zzcaw zzcawVar) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzp(zzdzxVar.zzd(), zzcawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzh(int i2) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzn(zzdzxVar.zzd(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzn(zzdzxVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzj() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzq(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzk() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzr(zzdzxVar.zzd());
    }

    zzdzw(zzdzx zzdzxVar) {
        Objects.requireNonNull(zzdzxVar);
        this.zza = zzdzxVar;
    }
}
