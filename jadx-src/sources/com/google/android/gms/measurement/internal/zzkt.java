package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzkt implements Runnable {
    final /* synthetic */ zzjk zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzli zzd;

    zzkt(zzli zzliVar, zzjk zzjkVar, long j2, boolean z2) {
        this.zza = zzjkVar;
        this.zzb = j2;
        this.zzc = z2;
        Objects.requireNonNull(zzliVar);
        this.zzd = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar = this.zzd;
        zzjk zzjkVar = this.zza;
        zzliVar.zzA(zzjkVar);
        zzliVar.zzaj(zzjkVar, this.zzb, true, this.zzc);
    }
}
