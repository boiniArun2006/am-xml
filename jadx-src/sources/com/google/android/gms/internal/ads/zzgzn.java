package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgzn {
    private final boolean zza;
    private final zzguf zzb;

    /* synthetic */ zzgzn(boolean z2, zzguf zzgufVar, byte[] bArr) {
        this.zza = z2;
        this.zzb = zzgufVar;
    }

    public final com.google.common.util.concurrent.Xo zza(Callable callable, Executor executor) {
        return new zzgzc(this.zzb, this.zza, executor, callable);
    }
}
