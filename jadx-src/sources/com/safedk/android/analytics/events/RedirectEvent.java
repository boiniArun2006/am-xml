package com.safedk.android.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.database.Kr.FlTC;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.p;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.n;
import org.json.JSONException;
import org.json.JSONObject;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class RedirectEvent extends StatsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f62793a = 120000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62794b = "redirect";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62795c = "redirect_url";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62796d = "redirect_type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62797e = "foreground_activity";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62798f = "max_events";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62799g = "touch_ts";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62800h = "external";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62801i = "internal";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62802j = "customtab";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f62803k = "suspected_store_kit";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f62804l = "RedirectEvent";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f62805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f62806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f62807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f62808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MaxEvents f62809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f62810r;

    public RedirectEvent() {
        this.f62809q = null;
    }

    public RedirectEvent(String sdk, String redirectUrl, String redirectType, String foregroundActivity, long timestamp, long touchTs) {
        super(sdk, StatsCollector.EventType.redirect);
        this.f62809q = null;
        Logger.d(f62804l, "RedirectEvent ctor started, sdk=", sdk, ", redirectUrl=", redirectUrl, ", redirectType=", redirectType, ", foregroundActivity=", foregroundActivity, " ,timestamp=", Long.valueOf(timestamp), ", touchTs=", Long.valueOf(touchTs));
        Logger.d(f62804l, "RedirectEvent ctor SdksMapping.getSdkNameByPackage()=", SdksMapping.getSdkNameByPackage(sdk));
        Logger.d(f62804l, "RedirectEvent ctor SdksMapping.getSdkPackageByClass()=", SdksMapping.getSdkPackageByClass(sdk));
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(sdk);
        if (sdkUUIDByPackage == null || SdksMapping.getAllSdkVersionsMap() == null || SdksMapping.getAllSdkVersionsMap().get(sdkUUIDByPackage) == null) {
            Logger.d(f62804l, "RedirectEvent ctor cannot find version for sdk ", sdk, " , SdkVersionsMap=", SdksMapping.getAllSdkVersionsMap());
        } else {
            String str = SdksMapping.getAllSdkVersionsMap().get(sdkUUIDByPackage);
            this.f62805m = str;
            Logger.d(f62804l, "RedirectEvent ctor sdkVersion=", str);
        }
        this.f62806n = redirectUrl;
        this.f62807o = redirectType;
        this.f62808p = foregroundActivity;
        this.f62810r = n.b(touchTs);
        this.f62837I = false;
    }

    public void a(MaxEvents maxEvents) {
        synchronized (p.a()) {
            MaxEvents maxEvents2 = (MaxEvents) maxEvents.clone();
            this.f62809q = maxEvents2;
            Logger.d(f62804l, "setMaxEvents , added ", Integer.valueOf(maxEvents2.size()), " items. content : ", this.f62809q);
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType a() {
        return StatsCollector.EventType.redirect;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String b() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StatsCollector.EventType.redirect);
        String str = "_";
        sb2.append("_");
        sb.append(sb2.toString());
        if (this.f62806n != null) {
            str = this.f62806n + "_";
        }
        sb.append(str);
        sb.append(this.f62835G);
        Logger.d(f62804l, "Getting key from object : ", sb.toString());
        return sb.toString();
    }

    public static String b(Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(StatsCollector.EventType.redirect + "_");
        if (bundle.getString("redirect_url") == null) {
            sb.append("_");
        } else {
            sb.append(bundle.getString("redirect_url") + "_");
        }
        sb.append(bundle.getLong(StatsEvent.f62824A));
        Logger.d(f62804l, "Getting key from bundle : ", sb.toString());
        return sb.toString();
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
        RedirectEvent redirectEvent = (RedirectEvent) statsEvent;
        if (redirectEvent.f62837I) {
            this.f62837I = true;
        }
        if (redirectEvent.f() != null && f() == null) {
            a(redirectEvent.f());
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Bundle d() {
        Bundle bundleD = super.d();
        bundleD.putString("sdk_version", this.f62805m);
        bundleD.putString(Apsps.phQC, this.f62806n);
        bundleD.putString("redirect_type", this.f62807o);
        bundleD.putString("foreground_activity", this.f62808p);
        bundleD.putLong(f62799g, this.f62810r);
        MaxEvents maxEvents = this.f62809q;
        if (maxEvents != null && maxEvents.size() > 0) {
            synchronized (p.a()) {
                bundleD.putParcelableArrayList(f62798f, this.f62809q.a());
            }
        }
        Logger.d(f62804l, "Redirect Event toBundle : ", bundleD.toString());
        return bundleD;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public boolean a_() {
        return System.currentTimeMillis() - this.f62835G > 120000 || this.f62806n != null || this.f62837I;
    }

    public String f() {
        return this.f62806n;
    }

    public void a(String str) {
        this.f62806n = str;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FlTC.aFBeLHiuzfvx, this.f62810r);
        if (!TextUtils.isEmpty(this.f62805m)) {
            jSONObject.put("sdkVersion", this.f62805m);
        }
        if (!TextUtils.isEmpty(this.f62806n)) {
            jSONObject.put(YmsTEL.xqPpdglBG, this.f62806n);
        }
        if (!TextUtils.isEmpty(this.f62807o)) {
            jSONObject.put("redirectType", this.f62807o);
        }
        if (!TextUtils.isEmpty(this.f62808p)) {
            jSONObject.put("foregroundActivity", this.f62808p);
        }
        MaxEvents maxEvents = this.f62809q;
        if (maxEvents != null) {
            jSONObject.put("maxEvents", maxEvents.i());
        }
        return jSONObject;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f62810r = jSONObject.optLong("touchTs", 0L);
            this.f62805m = jSONObject.optString("sdkVersion", "");
            this.f62806n = jSONObject.optString("redirectUrl", "");
            this.f62807o = jSONObject.optString("redirectType", "");
            this.f62808p = jSONObject.optString("foregroundActivity", "");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("maxEvents");
            if (jSONObjectOptJSONObject != null) {
                MaxEvents maxEvents = new MaxEvents();
                this.f62809q = maxEvents;
                maxEvents.a(jSONObjectOptJSONObject);
            }
        }
    }
}
