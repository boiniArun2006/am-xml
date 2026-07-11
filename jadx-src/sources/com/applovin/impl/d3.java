package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.sdk.C1802k;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class d3 extends h3 implements t1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final AtomicBoolean f48312A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicBoolean f48313z;

    public d3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, C1802k c1802k) {
        super(a3Var, jSONObject, jSONObject2, null, c1802k);
        this.f48313z = new AtomicBoolean();
        this.f48312A = new AtomicBoolean();
    }

    @Override // com.applovin.impl.y2
    public y2 a(com.applovin.impl.mediation.h hVar) {
        return new d3(this, hVar);
    }

    private long r0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f48807a.a(r3.S7)).longValue()) : jA;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f50873n.a(maxNativeAdView);
    }

    public MaxNativeAdView s0() {
        return this.f50873n.f();
    }

    public ViewGroup t0() {
        return this.f50873n.h();
    }

    public AtomicBoolean u0() {
        return this.f48313z;
    }

    public AtomicBoolean v0() {
        return this.f48312A;
    }

    public boolean w0() {
        return a("inacc", (Boolean) this.f48807a.a(r3.m8)).booleanValue();
    }

    public boolean x0() {
        return this.f50873n == null;
    }

    public void a(ViewGroup viewGroup) {
        this.f50873n.a(viewGroup);
    }

    @Override // com.applovin.impl.t1
    public long getTimeToLiveMillis() {
        return r0() - (SystemClock.elapsedRealtime() - I());
    }

    @Override // com.applovin.impl.t1
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    private d3(d3 d3Var, com.applovin.impl.mediation.h hVar) {
        super(d3Var.N(), d3Var.a(), d3Var.g(), hVar, d3Var.f48807a);
        this.f48313z = new AtomicBoolean();
        this.f48312A = new AtomicBoolean();
    }
}
