package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzkc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzli zze;

    zzkc(zzli zzliVar, String str, String str2, Object obj, long j2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j2;
        Objects.requireNonNull(zzliVar);
        this.zze = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzN(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
