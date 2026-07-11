package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@AdNetworkIdentifier(packageName = h.f63157C)
public class VerveCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62508a = "VerveCreativeInfo";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f62509E;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f62510Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private String f62511Z;

    public VerveCreativeInfo() {
        this.f62509E = null;
        this.f62510Y = null;
        this.f62511Z = null;
    }

    public VerveCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormatType, String placementId, String sdkVersion, String downstreamStruct, String dspName, String eventId, String appPackageName, boolean isVideoAd, boolean isPlayable) {
        super(adType, h.f63157C, id, creativeId, clickUrl, videoUrl, downstreamStruct, sdkVersion);
        this.f62509E = null;
        this.f62510Y = null;
        this.f62511Z = null;
        this.f62469K = placementId;
        a(adFormatType);
        this.ar = dspName;
        this.f62475T = isVideoAd;
        this.f62478W = isPlayable;
        h(eventId);
    }

    public void a(String str) {
        this.f62509E = str;
    }

    public String ar() {
        return this.f62509E;
    }

    public void I(String str) {
        this.f62510Y = str;
    }

    public String as() {
        return this.f62510Y;
    }

    public void J(String str) {
        this.f62511Z = str;
    }

    public String at() {
        return this.f62511Z;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.f62509E)) {
            jSONObjectI.put("innerDspCreativeId", this.f62509E);
        }
        if (!TextUtils.isEmpty(this.f62510Y)) {
            jSONObjectI.put("innerImpressionUrl", this.f62510Y);
        }
        if (!TextUtils.isEmpty(this.f62511Z)) {
            jSONObjectI.put("impIdCrid", this.f62511Z);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.f62509E = jSONObject.optString("innerDspCreativeId", "");
            this.f62510Y = jSONObject.optString("innerImpressionUrl", "");
            this.f62511Z = jSONObject.optString("impIdCrid", "");
        }
    }
}
