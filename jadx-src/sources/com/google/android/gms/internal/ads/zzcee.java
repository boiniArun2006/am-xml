package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcee extends ScheduledThreadPoolExecutor {
    zzcee(int i2, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
