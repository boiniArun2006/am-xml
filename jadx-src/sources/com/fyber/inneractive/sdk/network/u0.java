package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class u0 extends v0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f54344s = IAlog.a(u0.class);

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final void a(o0 o0Var, String str, String str2) {
        d0 d0Var = this.f54355r;
        if (d0Var == null) {
            IAlog.f("%s: failed to cache file: no cache helper", f54344s);
            return;
        }
        d0Var.b(str2);
        if (o0Var == null || TextUtils.isEmpty(o0Var.f54295b) || TextUtils.isEmpty(str)) {
            IAlog.f("%s: failed to cache file: empty result", f54344s);
            return;
        }
        boolean zA = this.f54355r.a(str, o0Var.f54295b);
        Uri uri = (Uri) this.f54355r.a().f53192a;
        o0Var.f54294a = uri;
        if (zA) {
            this.f54354q.a(uri);
        } else {
            IAlog.b("%s: Failed to cache file", f54344s);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c() {
        this.f54315a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final a i() {
        e0 e0Var = new e0(this.f54353p, this.f54354q, com.fyber.inneractive.sdk.nativead.b.f54217f.f54219b);
        this.f54355r = e0Var;
        com.fyber.inneractive.sdk.cache.m mVarA = e0Var.a();
        String str = mVarA.f53193b;
        Uri uri = (Uri) mVarA.f53192a;
        this.f54354q.c();
        return new a(uri, str);
    }

    public u0(com.fyber.inneractive.sdk.flow.nativead.t tVar, Context context, com.fyber.inneractive.sdk.cache.d dVar) {
        super(tVar, context, dVar);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i2) throws n0 {
        o0 o0Var = new o0();
        try {
            o0Var.f54295b = new String(Base64.encode(com.fyber.inneractive.sdk.util.v.a(lVar.f54272c), 0));
            return o0Var;
        } catch (Exception e2) {
            IAlog.b("%s : failed parse cacheable network request", f54344s, e2);
            throw new n0(e2);
        }
    }
}
