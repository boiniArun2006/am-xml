package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f53977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f53978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f53979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.s0 f53980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f53981e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f53982f = false;

    public com.fyber.inneractive.sdk.web.v0 a() {
        return null;
    }

    public boolean c() {
        return false;
    }

    public abstract boolean d();

    public abstract void destroy();

    public void e() {
    }

    public abstract boolean isVideoAd();

    public void a(String str) {
    }

    public boolean b() {
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f53980d;
        if (s0Var == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config null", IAlog.a(this));
            return false;
        }
        return false;
    }

    public x(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f53980d = s0Var;
        this.f53979c = rVar;
    }

    public boolean a(boolean z2, com.fyber.inneractive.sdk.util.g gVar) {
        return false;
    }
}
