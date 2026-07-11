package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@AdNetworkIdentifier(packageName = h.f63166f)
public class IronSourceCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String f62491Y = "playableAd";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final String f62492Z = "creativeURL&quot;:&quot;";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62493a = "cpvi";
    private static final long serialVersionUID = 0;
    private String aa;
    private String ab;
    private String ac;

    public IronSourceCreativeInfo() {
    }

    public IronSourceCreativeInfo(String id, String creativeId, String clickUrl, String videoUrl, String sdkAdType, String playableAd, BrandSafetyEvent.AdFormatType adFormat, String placementId, String endCardUrl, String sdkVersion, String buyerID) {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, h.f63166f, id, creativeId, clickUrl, videoUrl, sdkAdType, sdkVersion);
        this.aa = playableAd;
        y(playableAd);
        a(adFormat);
        this.f62469K = placementId;
        this.ab = sdkAdType;
        this.ar = buyerID;
        this.f62475T = false;
        this.f62478W = !TextUtils.isEmpty(playableAd);
        this.at = endCardUrl;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a() {
        byte b2 = 0;
        boolean z2 = TextUtils.isEmpty(P()) || TextUtils.isEmpty(O());
        if (!z2) {
            String str = this.ab;
            int iHashCode = str.hashCode();
            if (iHashCode != 3060704) {
                b2 = (iHashCode == 1967260497 && str.equals(f62491Y)) ? (byte) 1 : (byte) -1;
            } else if (!str.equals(f62493a)) {
            }
            if (b2 == 0) {
                return TextUtils.isEmpty(this.f62468J);
            }
            if (b2 == 1) {
                return TextUtils.isEmpty(this.aa);
            }
            return z2;
        }
        return z2;
    }

    public String ar() {
        return this.ac;
    }

    public String as() {
        return this.ab;
    }

    public String at() {
        return this.aa;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void F(String str) {
        super.F(str);
        if (str != null && str.indexOf(f62492Z) > -1) {
            this.ac = str.split(f62492Z)[1].split("&quot;,&quot;")[0];
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.aa)) {
            jSONObjectI.put("playableUrl", this.aa);
        }
        if (!TextUtils.isEmpty(this.ab)) {
            jSONObjectI.put("sdkAdType", this.ab);
        }
        if (!TextUtils.isEmpty(this.ac)) {
            jSONObjectI.put("creativeUrl", this.ac);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.aa = jSONObject.optString("playableUrl", "");
            this.ab = jSONObject.optString("sdkAdType", "");
            this.ac = jSONObject.optString("creativeUrl", "");
        }
    }
}
