package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class C1815y5 extends r5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f50891i;

    public C1815y5(C1809u c1809u, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        this(c1809u, appLovinAdLoadListener, "TaskFetchNextAd", c1802k);
    }

    @Override // com.applovin.impl.r5
    protected AbstractRunnableC1782i5 a(JSONObject jSONObject) {
        return new e6(jSONObject, this.f49880g, this.f50891i, this.f48733a);
    }

    public C1815y5(C1809u c1809u, AppLovinAdLoadListener appLovinAdLoadListener, String str, C1802k c1802k) {
        super(c1809u, str, c1802k);
        this.f50891i = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.r5
    protected void a(int i2, String str) {
        super.a(i2, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f50891i;
        if (!(appLovinAdLoadListener instanceof m2)) {
            appLovinAdLoadListener.failedToReceiveAd(i2);
        } else {
            ((m2) this.f50891i).failedToReceiveAdV2(new AppLovinError(i2, str));
        }
    }

    @Override // com.applovin.impl.r5
    protected String e() {
        return r0.a(this.f48733a);
    }

    @Override // com.applovin.impl.r5
    protected String f() {
        return r0.b(this.f48733a);
    }
}
