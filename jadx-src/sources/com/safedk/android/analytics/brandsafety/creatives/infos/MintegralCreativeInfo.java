package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.h;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class MintegralCreativeInfo extends CreativeInfo {
    private static final String aa = "MintegralCreativeInfo";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private String f62494Z;

    public MintegralCreativeInfo() {
        this.f62494Z = null;
    }

    public MintegralCreativeInfo(String id, BrandSafetyUtils.AdType adType, String creativeId, String clickUrl, String videoUrl, String imageUrl, BrandSafetyEvent.AdFormatType adFormat, String placementId, String sdkVersion, String downstreamStruct, boolean playableAd, String packageName) {
        super(adType, h.f63175o, id, creativeId, clickUrl, videoUrl, downstreamStruct, sdkVersion);
        this.f62494Z = null;
        a(adFormat);
        this.f62469K = placementId;
        this.f62470M = packageName;
        this.f62478W = playableAd;
        y(imageUrl);
    }

    public String ar() {
        return this.f62494Z;
    }

    public void a(String str) {
        this.f62494Z = str;
        u("k=" + str);
    }

    public void b(String str, Set<String> set) {
        a(str, set);
        d();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.f62494Z)) {
            jSONObjectI.put("k", this.f62494Z);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.f62494Z = jSONObject.optString("k", "");
        }
    }
}
