package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class z0 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f54373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicInteger f54374q;

    public z0(f0 f0Var, String str) {
        super(f0Var, g0.f54259c.a(), null);
        this.f54374q = new AtomicInteger();
        this.f54373p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i2) throws n0 {
        try {
            o0 o0Var = new o0();
            o0Var.f54294a = String.valueOf(i2);
            InputStream inputStream = lVar.f54272c;
            if (inputStream == null) {
                return o0Var;
            }
            o0Var.f54295b = com.fyber.inneractive.sdk.util.v.b(inputStream).toString();
            return o0Var;
        } catch (Exception e2) {
            IAlog.a("failed parse hit network request", e2, new Object[0]);
            throw new n0(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.f54374q.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f54373p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.f54374q.getAndIncrement() < 4;
    }

    public static void b(String str) {
        IAConfigManager.f53260M.f53292r.a(new z0(new y0(str, System.currentTimeMillis()), str));
    }
}
