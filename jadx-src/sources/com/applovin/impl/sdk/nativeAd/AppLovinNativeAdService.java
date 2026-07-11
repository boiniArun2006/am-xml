package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1785k;
import com.applovin.impl.d6;
import com.applovin.impl.g6;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t2;
import com.applovin.impl.x5;
import com.safedk.android.analytics.brandsafety.l;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final C1804o logger;
    private final C1802k sdk;

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            C1804o.h(TAG, "Empty ad token");
            t2.b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        C1785k c1785k = new C1785k(strTrim, this.sdk);
        if (c1785k.c() == C1785k.a.REGULAR) {
            if (C1804o.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + c1785k);
            }
            this.sdk.q0().a((AbstractRunnableC1782i5) new x5(c1785k, appLovinNativeAdLoadListener, this.sdk), d6.b.CORE);
            return;
        }
        if (c1785k.c() != C1785k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            C1804o.h(TAG, "Invalid token type");
            t2.b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        JSONObject jSONObjectA = c1785k.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + c1785k.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            C1804o.h(TAG, str2);
            t2.b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        r0.c(jSONObjectA, this.sdk);
        r0.b(jSONObjectA, this.sdk);
        r0.a(jSONObjectA, this.sdk);
        if (JsonUtils.getJSONArray(jSONObjectA, l.f62638S, new JSONArray()).length() > 0) {
            if (C1804o.a()) {
                this.logger.a(TAG, "Rendering ad for token: " + c1785k);
            }
            this.sdk.q0().a((AbstractRunnableC1782i5) new g6(jSONObjectA, appLovinNativeAdLoadListener, this.sdk), d6.b.CORE);
            return;
        }
        if (C1804o.a()) {
            this.logger.b(TAG, "No ad returned from the server for token: " + c1785k);
        }
        t2.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
    }

    public AppLovinNativeAdService(C1802k c1802k) {
        this.sdk = c1802k;
        this.logger = c1802k.O();
    }
}
