package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmn implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbe zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zznk zze;

    zzmn(zznk zznkVar, boolean z2, zzr zzrVar, boolean z3, zzbe zzbeVar, Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = z3;
        this.zzc = zzbeVar;
        this.zzd = bundle;
        Objects.requireNonNull(zznkVar);
        this.zze = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznk zznkVar = this.zze;
        zzga zzgaVarZzZ = zznkVar.zzZ();
        if (zzgaVarZzZ == null) {
            zznkVar.zzu.zzaV().zzb().zza("Failed to send default event parameters to service");
            return;
        }
        if (zznkVar.zzu.zzc().zzp(null, zzfx.zzbc)) {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            this.zze.zzm(zzgaVarZzZ, this.zzb ? null : this.zzc, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.zza;
            Preconditions.checkNotNull(zzrVar2);
            zzgaVarZzZ.zzu(this.zzd, zzrVar2);
            zznkVar.zzV();
        } catch (RemoteException e2) {
            this.zze.zzu.zzaV().zzb().zzb("Failed to send default event parameters to service", e2);
        }
    }
}
