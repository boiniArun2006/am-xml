package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmf implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzpk zzc;
    final /* synthetic */ zznk zzd;

    zzmf(zznk zznkVar, zzr zzrVar, boolean z2, zzpk zzpkVar) {
        this.zza = zzrVar;
        this.zzb = z2;
        this.zzc = zzpkVar;
        Objects.requireNonNull(zznkVar);
        this.zzd = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznk zznkVar = this.zzd;
        zzga zzgaVarZzZ = zznkVar.zzZ();
        if (zzgaVarZzZ == null) {
            zznkVar.zzu.zzaV().zzb().zza("Discarding data. Failed to set user property");
            return;
        }
        zzr zzrVar = this.zza;
        Preconditions.checkNotNull(zzrVar);
        zznkVar.zzm(zzgaVarZzZ, this.zzb ? null : this.zzc, zzrVar);
        zznkVar.zzV();
    }
}
