package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@AdNetworkIdentifier(packageName = h.f63156B)
public class BidMachineCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62418a = "advertised_content";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f62419E;

    public BidMachineCreativeInfo() {
    }

    public BidMachineCreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id, String sdkVersion, String placementId, String eventId) {
        super(adType, sdk, id, null, null, null, null, sdkVersion);
        this.f62469K = placementId;
        h(eventId);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle bundleB = super.b();
        if (!TextUtils.isEmpty(this.f62419E)) {
            bundleB.putString(f62418a, this.f62419E);
        }
        return bundleB;
    }

    public void a(String str) {
        this.f62419E = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.f62419E)) {
            jSONObjectI.put("advertisedContent", this.f62419E);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.f62419E = jSONObject.optString("advertisedContent", "");
        }
    }
}
