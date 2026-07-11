package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmx implements Runnable {
    final /* synthetic */ zzga zza;
    final /* synthetic */ zzne zzb;

    zzmx(zzne zzneVar, zzga zzgaVar) {
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
                    zznkVar.zzu.zzaV().zzk().zza("Connected to service");
                    zznkVar.zzL(this.zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
