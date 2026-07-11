package com.google.android.gms.internal.cloudmessaging;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface zzb {
    ExecutorService zza(ThreadFactory threadFactory, int i2);

    ScheduledExecutorService zza(int i2, ThreadFactory threadFactory, int i3);
}
