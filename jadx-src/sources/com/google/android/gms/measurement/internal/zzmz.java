package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmz implements Runnable {
    final /* synthetic */ zzga zza;
    final /* synthetic */ zzne zzb;

    zzmz(zzne zzneVar, zzga zzgaVar) {
        this.zza = zzgaVar;
        Objects.requireNonNull(zzneVar);
        this.zzb = zzneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzne zzneVar = this.zzb;
        synchronized (zzneVar) {
            try {
                zzneVar.zzd(false);
                zznk zznkVar = zzneVar.zza;
                if (!zznkVar.zzh()) {
                    zznkVar.zzu.zzaV().zzj().zza("Connected to remote service");
                    zznkVar.zzL(this.zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zznk zznkVar2 = this.zzb.zza;
        if (zznkVar2.zzab() != null) {
            zznkVar2.zzab().shutdownNow();
            zznkVar2.zzac(null);
        }
    }
}
