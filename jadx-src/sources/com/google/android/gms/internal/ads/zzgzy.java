package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface zzgzy extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    com.google.common.util.concurrent.Xo submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    com.google.common.util.concurrent.Xo submit(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    com.google.common.util.concurrent.Xo submit(Callable callable);
}
