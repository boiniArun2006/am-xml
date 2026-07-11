package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@AdNetworkIdentifier(packageName = h.f63171k)
public class UnityAdsCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f62504E = "UnityAdsCreativeInfo";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final String f62505Z = "playableUrl";
    private static final String[] ah = {h.f63168h, h.f63171k};
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f62506Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62507a;
    private String ac;
    private String ae;
    private String af;
    private String ag;

    public UnityAdsCreativeInfo() {
        this.f62507a = null;
    }

    public UnityAdsCreativeInfo(String id, String creativeId, String clickUrl, String videoUrl, String playableAd, String contentType, String adDomain, BrandSafetyEvent.AdFormatType adFormat, String placementId, String sdkVersion, String bundleId, String buyerId, String endCardUrl) {
        super(BrandSafetyUtils.a(adFormat), h.f63171k, id, creativeId, clickUrl, videoUrl, contentType, sdkVersion);
        this.f62507a = null;
        this.ac = playableAd;
        this.aZ = adDomain;
        a(adFormat);
        this.f62469K = placementId;
        if (TextUtils.isEmpty(this.f62470M)) {
            this.f62470M = bundleId;
        }
        this.ar = buyerId;
        this.at = endCardUrl;
        this.f62478W = !TextUtils.isEmpty(this.ac);
    }

    public String ar() {
        return this.f62507a;
    }

    public String as() {
        return this.ae;
    }

    public String at() {
        return this.af;
    }

    public String au() {
        return this.at;
    }

    public String av() {
        return this.ac;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String o() {
        return this.aZ;
    }

    public void c(String str, String str2) {
        this.ae = str;
        this.af = str2;
        if (!TextUtils.isEmpty(str2)) {
            this.f62475T = true;
        }
    }

    public void a(String str) {
        this.ag = str;
        if (!TextUtils.isEmpty(str)) {
            this.f62475T = true;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle bundleB = super.b();
        if (P() == null || (this.f62467I && !TextUtils.isEmpty(this.ae))) {
            bundleB.putString("creative_id", this.ae);
        }
        if (TextUtils.isEmpty(this.f62468J) || (this.f62467I && !TextUtils.isEmpty(this.af))) {
            bundleB.putString("video_url", this.af);
        }
        return bundleB;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean a() {
        return TextUtils.isEmpty(P()) || TextUtils.isEmpty(O());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean v(String str) {
        if (this.f62464F.contains("admob-video") || this.f62464F.contains("admob-display") || this.f62464F.contains("admob-banner")) {
            return g.a(ah, str);
        }
        return super.v(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        if (this.f62464F.contains("admob-video") || this.f62464F.contains("admob-display") || this.f62464F.contains("admob-banner")) {
            return AdMobCreativeInfo.a(str) || n.a(str, (Map<String, String>) null) || n.i(str);
        }
        return super.b(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String af() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(P());
        if (this.ae != null) {
            str = ", " + this.ae;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public void I(String str) {
        this.f62507a = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void a(CreativeInfo creativeInfo) {
        Logger.d(f62504E, "merge scar-admob CI started");
        n(creativeInfo.S());
        c(new ArrayList(creativeInfo.r()));
        Iterator<String> it = creativeInfo.q().iterator();
        while (it.hasNext()) {
            x(it.next());
        }
        Iterator<String> it2 = creativeInfo.u().iterator();
        while (it2.hasNext()) {
            C(it2.next());
        }
        Logger.d(f62504E, "merge scar-admob CI admob's click url is: ", creativeInfo.O());
        if (creativeInfo.O() != null) {
            a(creativeInfo.O(), creativeInfo.ap());
        }
        if (creativeInfo.v()) {
            f(true);
        }
        Logger.d(f62504E, "merge scar-admob CI admob's video url is: ", creativeInfo.J());
        if (creativeInfo.J() != null) {
            p(creativeInfo.J());
        }
        if (creativeInfo.g()) {
            ae();
            F(creativeInfo.C());
        }
        if (creativeInfo.P() != null) {
            k(creativeInfo.P());
        }
        if (creativeInfo.Y() != null) {
            u(creativeInfo.Y());
        }
    }

    public String aw() {
        return this.f62506Y;
    }

    public void J(String str) {
        this.f62506Y = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.ac)) {
            jSONObjectI.put(f62505Z, this.ac);
        }
        if (!TextUtils.isEmpty(this.f62507a)) {
            jSONObjectI.put("clickString", this.f62507a);
        }
        if (!TextUtils.isEmpty(this.ae)) {
            jSONObjectI.put("portraitCreativeId", this.ae);
        }
        if (!TextUtils.isEmpty(this.af)) {
            jSONObjectI.put("portraitVideoUrl", this.af);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            jSONObjectI.put("streamVideoUrl", this.ag);
        }
        if (!TextUtils.isEmpty(this.f62506Y)) {
            jSONObjectI.put("debugBundleId", this.f62506Y);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.ac = jSONObject.optString(f62505Z, "");
            this.f62507a = jSONObject.optString("clickString", "");
            this.ae = jSONObject.optString("portraitCreativeId", "");
            this.af = jSONObject.optString("portraitVideoUrl", "");
            this.ag = jSONObject.optString("streamVideoUrl", "");
            this.f62506Y = jSONObject.optString("debugBundleId", "");
        }
    }
}
