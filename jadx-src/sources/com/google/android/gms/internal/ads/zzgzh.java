package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgzh extends zzgzg {
    private final com.google.common.util.concurrent.Xo zza;

    @Override // com.google.android.gms.internal.ads.zzgyh, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, com.google.android.gms.internal.ads.zzgyi, com.google.common.util.concurrent.Xo
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return this.zza.cancel(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j2, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String toString() {
        return this.zza.toString();
    }

    zzgzh(com.google.common.util.concurrent.Xo xo) {
        xo.getClass();
        this.zza = xo;
    }
}
