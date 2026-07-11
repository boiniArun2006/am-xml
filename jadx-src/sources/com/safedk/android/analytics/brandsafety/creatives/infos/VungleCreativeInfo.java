package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import java.sql.Timestamp;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@AdNetworkIdentifier(packageName = h.f63164d)
public class VungleCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62512a = "vungle_mraid";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f62513Y;

    public VungleCreativeInfo() {
        this.f62513Y = false;
    }

    public VungleCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormat, String placement_id, String sdkVersion, long expiry, String struct) {
        super(adType, h.f63164d, id, creativeId, clickUrl, videoUrl, struct, sdkVersion);
        this.f62513Y = false;
        a(adFormat);
        this.f62469K = placement_id;
        this.f62474R = new Timestamp(expiry);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean a() {
        return TextUtils.isEmpty(P()) || TextUtils.isEmpty(O());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void b(boolean z2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean v(String str) {
        return super.v(str);
    }

    public boolean ar() {
        return this.f62513Y;
    }

    public void k(boolean z2) {
        this.f62513Y = z2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        jSONObjectI.put("isLoopingVideo", this.f62513Y);
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.f62513Y = jSONObject.optBoolean("isLoopingVideo", false);
        }
    }
}
