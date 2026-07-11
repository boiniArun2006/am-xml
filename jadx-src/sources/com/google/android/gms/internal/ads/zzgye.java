package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzgye extends zzgyg {
    @Override // com.google.android.gms.internal.ads.zzgyg
    final /* synthetic */ void zze(Object obj) {
        zzk((com.google.common.util.concurrent.Xo) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        com.google.common.util.concurrent.Xo xoZza = zzgywVar.zza(th);
        zzgrc.zzl(xoZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return xoZza;
    }

    zzgye(com.google.common.util.concurrent.Xo xo, Class cls, zzgyw zzgywVar) {
        super(xo, cls, zzgywVar);
    }
}
