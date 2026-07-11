package com.fyber.inneractive.sdk.network;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class v0 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f54353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.a f54354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d0 f54355r;

    @Override // com.fyber.inneractive.sdk.network.t0
    public o0 a(l lVar, Map map, int i2) throws Exception {
        o0 o0Var = new o0();
        try {
            String string = com.fyber.inneractive.sdk.util.v.b(lVar.f54272c).toString();
            o0Var.f54294a = this.f54354q.a(string);
            o0Var.f54295b = string;
            return o0Var;
        } catch (Exception e2) {
            IAlog.a("failed parse cacheable network request", e2, new Object[0]);
            if (e2 instanceof InvalidAppIdException) {
                throw e2;
            }
            throw new n0(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    public v0(f0 f0Var, Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        super(f0Var, g0.f54259c.a(), null);
        this.f54353p = context;
        this.f54354q = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String h() {
        return this.f54354q.c();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public a i() throws Throwable {
        d0 d0Var = new d0(this.f54353p, this.f54354q);
        this.f54355r = d0Var;
        com.fyber.inneractive.sdk.cache.m mVarA = d0Var.a();
        String str = mVarA.f53193b;
        Object obj = mVarA.f53192a;
        this.f54354q.c();
        return new a(obj, str);
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
        return this.f54354q.a();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public void a(o0 o0Var, String str, String str2) {
        d0 d0Var = this.f54355r;
        if (d0Var != null) {
            d0Var.b(str2);
            if (o0Var == null || o0Var.f54295b.isEmpty() || str.isEmpty()) {
                return;
            }
            if (!this.f54355r.a(str, o0Var.f54295b)) {
                IAlog.b("Failed to cache file", new Object[0]);
            } else {
                this.f54354q.a(o0Var.f54294a);
            }
        }
    }
}
