package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmj implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznk zzb;

    zzmj(zznk zznkVar, zzr zzrVar, boolean z2) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznkVar);
        this.zzb = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznk zznkVar = this.zzb;
        zzga zzgaVarZzZ = zznkVar.zzZ();
        if (zzgaVarZzZ == null) {
            zznkVar.zzu.zzaV().zzb().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            zzib zzibVar = zznkVar.zzu;
            zzal zzalVarZzc = zzibVar.zzc();
            zzfw zzfwVar = zzfx.zzbc;
            if (zzalVarZzc.zzp(null, zzfwVar)) {
                zznkVar.zzm(zzgaVarZzZ, null, zzrVar);
            }
            zzgaVarZzZ.zzg(zzrVar);
            zznkVar.zzu.zzm().zzo();
            zzibVar.zzc().zzp(null, zzfwVar);
            zznkVar.zzm(zzgaVarZzZ, null, zzrVar);
            zznkVar.zzV();
        } catch (RemoteException e2) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to send app launch to the service", e2);
        }
    }
}
