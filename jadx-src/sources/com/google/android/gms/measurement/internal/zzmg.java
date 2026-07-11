package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmg implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznk zzb;

    zzmg(zznk zznkVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznkVar);
        this.zzb = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznk zznkVar = this.zzb;
        zzga zzgaVarZzZ = zznkVar.zzZ();
        if (zzgaVarZzZ == null) {
            zznkVar.zzu.zzaV().zzb().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            zzgaVarZzZ.zzt(zzrVar);
        } catch (RemoteException e2) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to reset data on the service: remote exception", e2);
        }
        this.zzb.zzV();
    }
}
