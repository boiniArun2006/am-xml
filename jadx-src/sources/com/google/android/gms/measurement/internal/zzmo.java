package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmo implements Runnable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zzc;
    final /* synthetic */ zznk zzd;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcu zzcuVar;
        zzpo zzpoVarZzk;
        zznk zznkVar;
        zzga zzgaVarZzZ;
        byte[] bArrZzk = null;
        try {
            try {
                zznkVar = this.zzd;
                zzgaVarZzZ = zznkVar.zzZ();
            } catch (RemoteException e2) {
                this.zzd.zzu.zzaV().zzb().zzb("Failed to send event to the service to bundle", e2);
            }
            if (zzgaVarZzZ == null) {
                zzib zzibVar = zznkVar.zzu;
                zzibVar.zzaV().zzb().zza("Discarding data. Failed to send event to service to bundle");
                zzpoVarZzk = zzibVar.zzk();
                zzcuVar = this.zzc;
                zzpoVarZzk.zzao(zzcuVar, bArrZzk);
            }
            bArrZzk = zzgaVarZzZ.zzk(this.zza, this.zzb);
            zznkVar.zzV();
            zznk zznkVar2 = this.zzd;
            zzcuVar = this.zzc;
            zzpoVarZzk = zznkVar2.zzu.zzk();
            zzpoVarZzk.zzao(zzcuVar, bArrZzk);
        } catch (Throwable th) {
            zznk zznkVar3 = this.zzd;
            zznkVar3.zzu.zzk().zzao(this.zzc, null);
            throw th;
        }
    }

    zzmo(zznk zznkVar, zzbg zzbgVar, String str, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = zzbgVar;
        this.zzb = str;
        this.zzc = zzcuVar;
        Objects.requireNonNull(zznkVar);
        this.zzd = zznkVar;
    }
}
