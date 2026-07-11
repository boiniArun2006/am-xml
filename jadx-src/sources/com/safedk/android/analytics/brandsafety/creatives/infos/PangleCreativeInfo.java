package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class PangleCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f62495E = "non-app";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f62496Y = "/playable";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f62497Z = "/dynamic_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62498a = "app";
    public static final String aa = "/dpa_count_";
    public static final String ab = "/dpa";
    public static final String ac = "/dpa_related_products_count_";
    private static final long serialVersionUID = 0;
    private String ad;
    private int ae;
    private boolean af;

    public PangleCreativeInfo() {
    }

    public PangleCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, String endCardUrl, boolean isPlayable, String placementId, String sdkVersion, String packageName, String downstreamStruct) {
        super(adType, h.f63181u, id, creativeId, clickUrl, videoUrl, downstreamStruct, sdkVersion);
        this.f62469K = placementId;
        this.f62478W = isPlayable;
        this.at = endCardUrl;
        this.f62470M = packageName;
        this.ad = null;
        this.ae = 0;
        this.af = false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.ad)) {
            jSONObjectI.put("commonMultiAdUuid", this.ad);
        }
        jSONObjectI.put("dynamicCreativesCount", this.ae);
        jSONObjectI.put("isDpa", this.af);
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.ad = jSONObject.optString("commonMultiAdUuid", "");
            this.ae = jSONObject.optInt("dynamicCreativesCount", 0);
            this.af = jSONObject.optBoolean("isDpa", false);
        }
    }

    public void a(String str) {
        this.ad = str;
    }

    public String ar() {
        return this.ad;
    }

    public int as() {
        return this.ae;
    }

    public void b(int i2) {
        this.ae = i2;
    }

    public void at() {
        this.af = true;
    }

    public boolean au() {
        return this.af;
    }
}
