package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzflq implements zzgzl {
    final /* synthetic */ zzflt zza;
    final /* synthetic */ zzflv zzb;

    zzflq(zzflv zzflvVar, zzflt zzfltVar) {
        this.zza = zzfltVar;
        Objects.requireNonNull(zzflvVar);
        this.zzb = zzflvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzflv zzflvVar = this.zzb;
        synchronized (zzflvVar) {
            zzflvVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzflv zzflvVar = this.zzb;
        synchronized (zzflvVar) {
            try {
                zzflvVar.zzf(null);
                zzflvVar.zze().addFirst(this.zza);
                if (zzflvVar.zzg() == 1) {
                    zzflvVar.zzd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
