package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class g6 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f48591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f48592h;

    public g6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1802k c1802k) {
        super("TaskProcessNativeAdResponse", c1802k);
        this.f48591g = jSONObject;
        this.f48592h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f48591g, com.safedk.android.analytics.brandsafety.l.f62638S, new JSONArray());
        if (jSONArray.length() > 0) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Processing ad...");
            }
            this.f48733a.q0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f48591g, this.f48592h, this.f48733a));
            return;
        }
        if (C1804o.a()) {
            this.f48735c.k(this.f48734b, "No ads were returned from the server");
        }
        n7.a("native_native", MaxAdFormat.NATIVE, this.f48591g, this.f48733a);
        this.f48592h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
