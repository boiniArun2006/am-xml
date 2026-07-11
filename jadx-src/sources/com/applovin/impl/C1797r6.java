package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;

/* JADX INFO: renamed from: com.applovin.impl.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C1797r6 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f49883g;

    public C1797r6(C1802k c1802k, String str, Runnable runnable) {
        this(c1802k, false, str, runnable);
    }

    public C1797r6(C1802k c1802k, boolean z2, String str, Runnable runnable) {
        super("TaskRunnable:" + str, c1802k, z2);
        this.f49883g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f49883g.run();
    }
}
