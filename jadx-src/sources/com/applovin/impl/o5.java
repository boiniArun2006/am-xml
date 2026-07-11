package com.applovin.impl;

import com.applovin.impl.AbstractC1811v;
import com.applovin.impl.sdk.C1802k;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class o5 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f49591g;

    public interface a {
        void a(AbstractC1811v.a aVar);
    }

    public o5(C1802k c1802k, a aVar) {
        super("TaskCollectAdvertisingId", c1802k, true);
        this.f49591g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f49591g.a(this.f48733a.A().f());
    }
}
