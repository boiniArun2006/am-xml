package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmm implements Runnable {
    final /* synthetic */ zzlt zza;
    final /* synthetic */ zznk zzb;

    zzmm(zznk zznkVar, zzlt zzltVar) {
        this.zza = zzltVar;
        Objects.requireNonNull(zznkVar);
        this.zzb = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznk zznkVar = this.zzb;
        zzga zzgaVarZzZ = zznkVar.zzZ();
        if (zzgaVarZzZ == null) {
            zznkVar.zzu.zzaV().zzb().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzlt zzltVar = this.zza;
            if (zzltVar == null) {
                zzgaVarZzZ.zzl(0L, null, null, zznkVar.zzu.zzaY().getPackageName());
            } else {
                zzgaVarZzZ.zzl(zzltVar.zzc, zzltVar.zza, zzltVar.zzb, zznkVar.zzu.zzaY().getPackageName());
            }
            zznkVar.zzV();
        } catch (RemoteException e2) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to send current screen to the service", e2);
        }
    }
}
