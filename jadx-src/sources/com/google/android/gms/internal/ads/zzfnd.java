package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfnd {
    final /* synthetic */ zzfnm zza;
    private final Object zzb;
    private final List zzc;

    public final zzfnl zza(Callable callable) {
        List list = this.zzc;
        zzgzn zzgznVarZzp = zzgzo.zzp(list);
        com.google.common.util.concurrent.Xo xoZza = zzgznVarZzp.zza(zzfnc.zza, zzcei.zzg);
        zzfnm zzfnmVar = this.zza;
        return new zzfnl(zzfnmVar, this.zzb, null, xoZza, list, zzgznVarZzp.zza(callable, zzfnmVar.zze()), null);
    }

    /* synthetic */ zzfnd(zzfnm zzfnmVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfnmVar);
        this.zza = zzfnmVar;
        this.zzb = obj;
        this.zzc = list;
    }
}
