package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class Xo implements ThreadFactory {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ThreadFactory f47592n = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicInteger f47593t = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f47593t;
        Thread threadNewThread = this.f47592n.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }

    Xo(n nVar) {
    }
}
