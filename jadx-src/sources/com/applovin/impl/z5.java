package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class z5 extends r5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f51026i;

    @Override // com.applovin.impl.r5
    protected AbstractRunnableC1782i5 a(JSONObject jSONObject) {
        return new g6(jSONObject, this.f51026i, this.f48733a);
    }

    @Override // com.applovin.impl.r5
    protected void a(int i2, String str) {
        super.a(i2, str);
        this.f51026i.onNativeAdLoadFailed(new AppLovinError(i2, str));
    }

    @Override // com.applovin.impl.r5
    protected String e() {
        return r0.d(this.f48733a);
    }

    @Override // com.applovin.impl.r5
    protected String f() {
        return r0.e(this.f48733a);
    }

    public z5(C1809u c1809u, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1802k c1802k) {
        super(c1809u, str, c1802k);
        this.f51026i = appLovinNativeAdLoadListener;
    }
}
