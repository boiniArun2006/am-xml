package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcsb implements zzgzl {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcsh zzb;

    zzcsb(zzcsh zzcshVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzcshVar);
        this.zzb = zzcshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzcsh zzcshVar = this.zzb;
        zzcshVar.zzu().zza(zzcshVar.zzt().zzb(zzcshVar.zzr(), zzcshVar.zzs(), false, this.zza, null, zzcshVar.zzp(), zzcshVar.zzw(), zzcshVar.zzx()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        String str2 = (String) obj;
        zzcsh zzcshVar = this.zzb;
        zzcshVar.zzu().zza(zzcshVar.zzt().zzb(zzcshVar.zzr(), zzcshVar.zzs(), false, str, str2, zzcshVar.zzp(), zzcshVar.zzw(), zzcshVar.zzx()), zzcshVar.zzv());
    }
}
