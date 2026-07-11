package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@AdNetworkIdentifier(packageName = h.f63176p)
public class FyberCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String f62486Y = "FyberCreativeInfo";
    private static final String aa = "alternative_click_url";
    private static final List<String> ac = Arrays.asList("www.serveroute.com/log_string", "column=", "line=", "ad_exchange=inneractive&mraid_version=");
    private static final long serialVersionUID = 0;
    private String ad;
    private String ag;

    public FyberCreativeInfo() {
    }

    public FyberCreativeInfo(String id, String creativeId, String campaignId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormat, BrandSafetyUtils.AdType adType, String spotId, String sdkVersion, String adNetwork, String adDomain, String alternativeClickUrl, String eventId) {
        super(adType, h.f63176p, id, creativeId, clickUrl, videoUrl, "", sdkVersion);
        this.f62469K = spotId;
        Logger.d(f62486Y, "FyberCreativeInfo ctor started");
        a(adFormat);
        this.ad = campaignId;
        this.ar = adNetwork;
        this.aZ = adDomain;
        this.ag = alternativeClickUrl;
        h(eventId);
    }

    public String ar() {
        return this.ad;
    }

    public String as() {
        return this.ag;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle bundleB = super.b();
        if (!TextUtils.isEmpty(this.ad)) {
            bundleB.putString(CreativeInfo.f62425D, this.ad);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            bundleB.putString(aa, this.ag);
        }
        return bundleB;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void b(List<String> list) {
        boolean z2;
        Logger.d(f62486Y, "classifyPrefetchUrl started, urlList=", list);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strD = D(it.next());
                if (!TextUtils.isEmpty(strD)) {
                    if (b(strD)) {
                        y(strD);
                        z2 = true;
                    } else if (v(strD) && !strD.equals(O())) {
                        x(strD);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        Logger.d(f62486Y, "classifyPrefetchUrl url is unclassified and will be dropped : ", strD);
                    }
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.ad)) {
            jSONObjectI.put("campaignId", this.ad);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            jSONObjectI.put("alternativeClickUrl", this.ag);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.ad = jSONObject.optString("campaignId", "");
            this.ag = jSONObject.optString("alternativeClickUrl", "");
        }
    }
}
