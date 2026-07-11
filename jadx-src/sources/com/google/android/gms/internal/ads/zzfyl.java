package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzfyl implements zzfyk {
    private zzfyl() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final ExecutorService zzc(ThreadFactory threadFactory, int i2) {
        return zza(1, threadFactory, 1);
    }

    /* synthetic */ zzfyl(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final ExecutorService zza(int i2, ThreadFactory threadFactory, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final ExecutorService zzb(int i2) {
        return zza(1, Executors.defaultThreadFactory(), 2);
    }
}
