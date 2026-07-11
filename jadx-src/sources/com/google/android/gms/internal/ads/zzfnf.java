package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfnf {
    public static final zzfnl zza(com.google.common.util.concurrent.Xo xo, Object obj, zzfnm zzfnmVar) {
        return new zzfnl(zzfnmVar, obj, null, zzfnm.zza, Collections.EMPTY_LIST, xo, null);
    }

    public static final zzfnl zzc(Callable callable, zzgzy zzgzyVar, Object obj, zzfnm zzfnmVar) {
        return new zzfnl(zzfnmVar, obj, null, zzfnm.zza, Collections.EMPTY_LIST, zzgzyVar.submit(callable), null);
    }

    public static final zzfnl zzd(final zzfna zzfnaVar, zzgzy zzgzyVar, Object obj, zzfnm zzfnmVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfne
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                zzfnaVar.zza();
                return null;
            }
        }, zzgzyVar, obj, zzfnmVar);
    }

    public static final zzfnl zzb(Callable callable, Object obj, zzfnm zzfnmVar) {
        return zzc(callable, zzfnmVar.zze(), obj, zzfnmVar);
    }
}
