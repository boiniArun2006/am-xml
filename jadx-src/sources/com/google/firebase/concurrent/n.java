package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class n implements ThreadFactory {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ThreadFactory f60267r = Executors.defaultThreadFactory();
    private final StrictMode.ThreadPolicy J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f60268O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicLong f60269n = new AtomicLong();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60270t;

    public static /* synthetic */ void n(n nVar, Runnable runnable) {
        Process.setThreadPriority(nVar.f60268O);
        StrictMode.ThreadPolicy threadPolicy = nVar.J2;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f60267r.newThread(new Runnable() { // from class: com.google.firebase.concurrent.j
            @Override // java.lang.Runnable
            public final void run() {
                n.n(this.f60265n, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f60270t, Long.valueOf(this.f60269n.getAndIncrement())));
        return threadNewThread;
    }

    n(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        this.f60270t = str;
        this.f60268O = i2;
        this.J2 = threadPolicy;
    }
}
