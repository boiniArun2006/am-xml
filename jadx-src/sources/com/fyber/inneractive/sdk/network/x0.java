package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class x0 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f54365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f54366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicInteger f54367r;

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        byte[] bArr = new byte[0];
        try {
            IAlog.a("NetworkRequestEvent: network request body %s", this.f54365p);
            return this.f54365p.getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return bArr;
        }
    }

    public x0(e eVar, String str, String str2) {
        super(eVar, g0.f54259c.a(), null);
        this.f54367r = new AtomicInteger();
        this.f54366q = str;
        this.f54365p = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i2) throws n0 {
        try {
            o0 o0Var = new o0();
            o0Var.f54294a = String.valueOf(i2);
            return o0Var;
        } catch (Exception e2) {
            IAlog.a("failed parse event network request", e2, new Object[0]);
            throw new n0(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.f54367r.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f54366q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.f54367r.getAndIncrement() < 4;
    }
}
