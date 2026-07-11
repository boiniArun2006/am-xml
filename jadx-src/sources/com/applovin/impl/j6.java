package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class j6 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f48779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f48780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f48781i;

    public j6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        super("TaskRenderAppLovinAd", c1802k);
        this.f48779g = jSONObject;
        this.f48780h = jSONObject2;
        this.f48781i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f48779g, this.f48780h, this.f48733a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f48779g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f48779g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        C1787m5 c1787m5 = new C1787m5(aVar, this.f48733a, this.f48781i);
        c1787m5.c(zBooleanValue2);
        c1787m5.b(zBooleanValue);
        this.f48733a.q0().a((AbstractRunnableC1782i5) c1787m5, d6.b.CACHING);
    }
}
