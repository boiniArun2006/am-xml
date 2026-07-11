package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@AdNetworkIdentifier(packageName = h.f63157C)
public class PubMaticCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f62499E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62500a;

    public PubMaticCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormatType, String placementId, String sdkVersion, String downstreamStruct, String dspName, String eventId, String appPackageName, boolean isVideoAd, boolean isPlayable) {
        super(adType, h.f63160F, id, creativeId, clickUrl, videoUrl, downstreamStruct, sdkVersion);
        this.f62499E = null;
        this.f62469K = placementId;
        a(adFormatType);
        this.ar = dspName;
        this.f62475T = isVideoAd;
        this.f62478W = isPlayable;
        h(eventId);
    }

    public String ar() {
        return this.f62500a;
    }

    public void d(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2));
            if (i2 != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f62500a = sb.toString();
    }

    public String as() {
        return this.f62499E;
    }

    public void a(String str) {
        this.f62499E = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.f62500a)) {
            jSONObjectI.put("allMediaUrls", this.f62500a);
        }
        if (!TextUtils.isEmpty(this.f62499E)) {
            jSONObjectI.put("innerImpressionUrl", this.f62499E);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.f62500a = jSONObject.optString("allMediaUrls", "");
            this.f62499E = jSONObject.optString("innerImpressionUrl", "");
        }
    }
}
