package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfol implements zzgzl {
    final /* synthetic */ zzfoo zza;
    final /* synthetic */ zzfoe zzb;

    zzfol(zzfoo zzfooVar, zzfoe zzfoeVar) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoe zzfoeVar = this.zzb;
        zzfoeVar.zzj(th);
        zzfoeVar.zzd(false);
        this.zza.zza(zzfoeVar);
    }
}
