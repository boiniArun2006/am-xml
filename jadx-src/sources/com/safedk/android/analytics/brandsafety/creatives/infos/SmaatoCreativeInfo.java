package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@AdNetworkIdentifier(packageName = h.f63182v)
public class SmaatoCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f62501E = "iurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62502a = "SmaatoCreativeInfo";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f62503Y;

    public SmaatoCreativeInfo() {
    }

    public SmaatoCreativeInfo(String id, String creativeId, BrandSafetyUtils.AdType adType, BrandSafetyEvent.AdFormatType adFormat, String placementId, String adDomain, String iurl, String downstreamStruct, String sdkVersion, String clickUrl) {
        super(adType, h.f63182v, id, creativeId, clickUrl, null, downstreamStruct, sdkVersion);
        a(adFormat);
        this.f62469K = placementId;
        this.aZ = adDomain;
        this.f62503Y = iurl;
    }

    public String ar() {
        return this.f62503Y;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle bundleB = super.b();
        if (!TextUtils.isEmpty(this.f62503Y)) {
            bundleB.putString(f62501E, this.f62503Y);
        }
        return bundleB;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.f62503Y)) {
            jSONObjectI.put(f62501E, this.f62503Y);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.f62503Y = jSONObject.optString(f62501E, "");
        }
    }
}
