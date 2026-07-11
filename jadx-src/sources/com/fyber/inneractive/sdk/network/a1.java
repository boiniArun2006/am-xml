package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.exoplayer2.C;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a1 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f54226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicInteger f54227q;

    public a1(com.fyber.inneractive.sdk.ignite.b bVar, byte[] bArr, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(bVar, g0.f54259c.a(), rVar);
        this.f54227q = new AtomicInteger();
        this.f54226p = bArr;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i2) throws n0 {
        try {
            o0 o0Var = new o0();
            InputStream inputStream = lVar.f54272c;
            if (inputStream == null) {
                return o0Var;
            }
            String str = new String(com.fyber.inneractive.sdk.util.v.a(inputStream), C.UTF8_NAME);
            IgniteResponseOuterClass$IgniteResponse from = IgniteResponseOuterClass$IgniteResponse.parseFrom(str.getBytes());
            o0Var.f54295b = str;
            o0Var.f54294a = from;
            return o0Var;
        } catch (Exception e2) {
            IAlog.a("failed parse ignite network request", e2, new Object[0]);
            throw new n0(e2);
        } catch (Throwable th) {
            IAlog.a("failed parse ignite network request", th, new Object[0]);
            throw new n0("failed to parse ignite network request");
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        return this.f54226p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.f54227q.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String n() {
        return "application/x-protobuf; messageType=IgniteRequest";
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return "https://init-mp.fyber.com/init";
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.f54227q.getAndIncrement() < 4;
    }
}
