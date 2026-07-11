package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzgyl extends zzgyn {
    @Override // com.google.android.gms.internal.ads.zzgyn
    final /* synthetic */ void zze(Object obj) {
        zzk((com.google.common.util.concurrent.Xo) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        com.google.common.util.concurrent.Xo xoZza = zzgywVar.zza(obj2);
        zzgrc.zzl(xoZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return xoZza;
    }

    zzgyl(com.google.common.util.concurrent.Xo xo, zzgyw zzgywVar) {
        super(xo, zzgywVar);
    }
}
