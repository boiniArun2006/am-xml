package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class InMobiCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62487a = "advertised_content";
    private static final String aa = "InMobiCreativeInfo";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f62488E;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f62489Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private String f62490Z;

    public InMobiCreativeInfo() {
    }

    public InMobiCreativeInfo(String id, String creativeId, String placementId, String sdkVersion, BrandSafetyUtils.AdType adType, int multiAds, BrandSafetyEvent.AdFormatType adFormat, String eventId, String advertisedContent) {
        super(adType, h.f63169i, id, creativeId, null, null, null, sdkVersion);
        this.f62469K = placementId;
        this.f62489Y = id;
        this.f62488E = multiAds;
        if (adFormat != null) {
            a(adFormat);
        } else if (adType != null) {
            BrandSafetyEvent.AdFormatType adFormat2 = BrandSafetyUtils.a(adType);
            if (adFormat2 != null) {
                a(adFormat2);
            }
        }
        h(eventId);
        this.f62490Z = advertisedContent;
    }

    public String ar() {
        return this.f62489Y;
    }

    public int as() {
        return this.f62488E;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle bundleB = super.b();
        if (this.bh != null && !this.bh.isEmpty()) {
            synchronized (this.bh) {
                bundleB.putStringArrayList(BrandSafetyEvent.f62750u, new ArrayList<>(this.bh));
            }
        }
        if (!TextUtils.isEmpty(this.f62490Z)) {
            bundleB.putString(f62487a, this.f62490Z);
        }
        return bundleB;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        if (str == null) {
            return false;
        }
        return super.b(str.split("&")[0]);
    }

    public InMobiCreativeInfo at() {
        return new InMobiCreativeInfo(N(), P(), this.f62469K, this.f62473Q, M(), this.f62488E, BrandSafetyEvent.AdFormatType.valueOf(K()), n(), this.f62490Z);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.f62489Y)) {
            jSONObjectI.put("impressionId", this.f62489Y);
        }
        jSONObjectI.put("multiAds", this.f62488E);
        if (!TextUtils.isEmpty(this.f62490Z)) {
            jSONObjectI.put("advertisedContent", this.f62490Z);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.f62489Y = jSONObject.optString("impressionId", "");
            this.f62488E = jSONObject.optInt("multiAds", 0);
            this.f62490Z = jSONObject.optString("advertisedContent", "");
        }
    }
}
