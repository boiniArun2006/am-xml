package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: com.applovin.impl.sdk.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class C1806q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f50460a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f50461b = new Object();

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f50461b) {
            try {
                if (b() <= 25) {
                    this.f50460a.offer(appLovinAdImpl);
                } else {
                    C1804o.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    int b() {
        int size;
        synchronized (this.f50461b) {
            size = this.f50460a.size();
        }
        return size;
    }

    boolean c() {
        boolean z2;
        synchronized (this.f50461b) {
            z2 = b() == 0;
        }
        return z2;
    }

    AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f50461b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f50460a.peek();
        }
        return appLovinAdImpl;
    }

    C1806q() {
    }

    void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f50461b) {
            this.f50460a.remove(appLovinAdImpl);
        }
    }

    AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f50461b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f50460a.poll() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinAdImpl;
    }
}
