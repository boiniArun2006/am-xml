package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzgyk extends AbstractExecutorService implements zzgzy {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzhan.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (com.google.common.util.concurrent.Xo) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new zzhan(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (com.google.common.util.concurrent.Xo) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Callable callable) {
        return (com.google.common.util.concurrent.Xo) super.submit(callable);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zza */
    public final com.google.common.util.concurrent.Xo submit(Runnable runnable) {
        return (com.google.common.util.concurrent.Xo) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zzb */
    public final com.google.common.util.concurrent.Xo submit(Runnable runnable, Object obj) {
        return (com.google.common.util.concurrent.Xo) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zzc */
    public final com.google.common.util.concurrent.Xo submit(Callable callable) {
        return (com.google.common.util.concurrent.Xo) super.submit(callable);
    }
}
