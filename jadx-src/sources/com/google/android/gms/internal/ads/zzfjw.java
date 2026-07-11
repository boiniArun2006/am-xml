package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfjw implements zzgzl {
    final /* synthetic */ zzfjx zza;
    final /* synthetic */ int zzb;

    zzfjw(zzfjx zzfjxVar, int i2) {
        this.zzb = i2;
        Objects.requireNonNull(zzfjxVar);
        this.zza = zzfjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
