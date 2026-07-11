package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class b implements g8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d3 f49185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g8 f49186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f8 f49187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0704a f49188e;

    public void a() {
        this.f49186c.b();
    }

    private void a(long j2) {
        if (this.f49185b.v0().compareAndSet(false, true)) {
            this.f49184a.O();
            if (C1804o.a()) {
                this.f49184a.O().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f49184a.X().processViewabilityAdImpressionPostback(this.f49185b, j2, this.f49188e);
        }
    }

    public d3 b() {
        return this.f49185b;
    }

    public void c() {
        this.f49184a.O();
        if (C1804o.a()) {
            this.f49184a.O().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f49185b.u0().compareAndSet(false, true)) {
            this.f49184a.O();
            if (C1804o.a()) {
                this.f49184a.O().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f49185b.getNativeAd().isExpired()) {
                C1804o.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f49184a.f().a(this.f49185b);
            }
            this.f49184a.X().processRawAdImpression(this.f49185b, this.f49188e);
        }
    }

    @Override // com.applovin.impl.g8.a
    public void onLogVisibilityImpression() {
        a(this.f49187d.a(this.f49185b));
    }

    public b(d3 d3Var, ViewGroup viewGroup, a.InterfaceC0704a interfaceC0704a, C1802k c1802k) {
        this.f49184a = c1802k;
        this.f49185b = d3Var;
        this.f49188e = interfaceC0704a;
        this.f49187d = new f8(viewGroup, c1802k);
        g8 g8Var = new g8(viewGroup, c1802k, this);
        this.f49186c = g8Var;
        g8Var.a(d3Var);
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }
}
