package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcsa implements zzgzl {
    final /* synthetic */ zzcsh zza;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcsh zzcshVar = this.zza;
        zzcshVar.zzu().zzb(zzcshVar.zzt().zzb(zzcshVar.zzr(), zzcshVar.zzs(), false, "", (String) obj, zzcshVar.zzs().zzc, null, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcshVar.zzq()) ? 2 : 1);
    }

    zzcsa(zzcsh zzcshVar) {
        Objects.requireNonNull(zzcshVar);
        this.zza = zzcshVar;
    }
}
