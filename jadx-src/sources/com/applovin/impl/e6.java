package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class e6 extends AbstractRunnableC1782i5 implements m2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f48482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1809u f48483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f48484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f48485j;

    public e6(JSONObject jSONObject, C1809u c1809u, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        this(jSONObject, c1809u, false, appLovinAdLoadListener, c1802k);
    }

    public e6(JSONObject jSONObject, C1809u c1809u, boolean z2, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        super("TaskProcessAdResponse", c1802k);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c1809u == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f48482g = jSONObject;
        this.f48483h = c1809u;
        this.f48484i = appLovinAdLoadListener;
        this.f48485j = z2;
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", "undefined");
        if ("applovin".equalsIgnoreCase(string)) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Starting task for AppLovin ad...");
            }
            this.f48733a.q0().a(new j6(jSONObject, this.f48482g, this, this.f48733a));
            return;
        }
        if (CreativeInfo.f62454r.equalsIgnoreCase(string)) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Starting task for VAST ad...");
            }
            this.f48733a.q0().a(h6.a(jSONObject, this.f48482g, this, this.f48733a));
            return;
        }
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f48484i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f48485j || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f48733a.g().a(d2.f48246A, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        failedToReceiveAdV2(new AppLovinError(i2, ""));
    }

    @Override // com.applovin.impl.m2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f48484i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof m2) {
            ((m2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f48485j) {
            return;
        }
        this.f48733a.g().a(d2.f48247B, this.f48483h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f48482g, com.safedk.android.analytics.brandsafety.l.f62638S, new JSONArray());
        if (jSONArray.length() > 0) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (C1804o.a()) {
                this.f48735c.k(this.f48734b, "No ads were returned from the server");
            }
            n7.a(this.f48483h.e(), this.f48483h.d(), this.f48482g, this.f48733a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }
}
