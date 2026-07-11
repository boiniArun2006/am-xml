package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@AdNetworkIdentifier(packageName = h.f63161a)
public class AppLovinCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f62415E = "is_js_tag_ad";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62416a = "AppLovinCreativeInfo";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f62417Y;

    public AppLovinCreativeInfo() {
        this.f62417Y = false;
    }

    public AppLovinCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormatType, String placementId, String sdkVersion, String downstreamStruct, String dspName, String eventId, String appPackageName, boolean isVideoAd, boolean isPlayable, boolean isJsTagAd) {
        super(adType, h.f63161a, id, creativeId, clickUrl, videoUrl, downstreamStruct, sdkVersion);
        this.f62417Y = false;
        this.f62469K = placementId;
        a(adFormatType);
        this.ar = dspName;
        this.f62475T = isVideoAd;
        this.f62478W = isPlayable;
        if (p() == null && appPackageName != null) {
            q(appPackageName);
        }
        h(eventId);
        this.f62417Y = isJsTagAd;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean a() {
        return TextUtils.isEmpty(P()) || TextUtils.isEmpty(O());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle bundleB = super.b();
        if (this.f62417Y) {
            bundleB.putBoolean(f62415E, true);
            Logger.d(f62416a, f62415E, " field is ", Boolean.valueOf(this.f62417Y));
        }
        return bundleB;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        jSONObjectI.put("isJsTagAd", this.f62417Y);
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.f62417Y = jSONObject.optBoolean("isJsTagAd", false);
        }
    }
}
