package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.PersistableBase;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class RedirectData extends PersistableBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f61718a = "is_redirect";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f61719b = "is_expand";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f61720c = "is_auto_expand";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f61721d = "redirect_url";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f61722e = "redirect_request_url";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f61723f = "redirect_type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f61724g = "is_website_opened";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f61725h = "is_auto_website_opened";
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f61726i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f61727j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f61728k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f61729l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f61730m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f61731n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f61732o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f61733p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f61734q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f61735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f61736s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public BrandSafetyEvent.AdFormatType f61737t;

    public RedirectData() {
    }

    public RedirectData(String sdkPackageName, BrandSafetyEvent.AdFormatType adFormatType) {
        this.f61735r = sdkPackageName;
        this.f61737t = adFormatType;
    }

    public void a(String str, String str2, String str3) {
        this.f61726i = true;
        this.f61730m = str2;
        this.f61731n = str;
        this.f61732o = str3;
        this.f61736s = System.currentTimeMillis();
    }

    public void b(String str, String str2, String str3) {
        this.f61727j = true;
        this.f61731n = str;
        if (str2 != null) {
            str = str2;
        }
        this.f61730m = str;
        this.f61733p = str3;
        this.f61736s = System.currentTimeMillis();
    }

    public void a(String str, String str2) {
        this.f61728k = true;
        this.f61731n = str;
        if (str2 != null) {
            str = str2;
        }
        this.f61730m = str;
        this.f61736s = System.currentTimeMillis();
    }

    public synchronized void a(String str) {
        if (str != null) {
            if (this.f61734q == null) {
                this.f61734q = str;
            } else if (!this.f61734q.contains(str)) {
                this.f61734q += l.ac + str;
            }
        }
    }

    public synchronized Bundle a() {
        Bundle bundle;
        bundle = new Bundle();
        if (this.f61726i && this.f61729l) {
            bundle.putBoolean(f61718a, true);
        }
        if (this.f61727j) {
            bundle.putBoolean(this.f61729l ? f61720c : f61719b, true);
        }
        if (this.f61728k) {
            bundle.putBoolean(this.f61729l ? f61725h : f61724g, true);
        }
        if (!TextUtils.isEmpty(this.f61730m)) {
            bundle.putString("redirect_url", this.f61730m);
        }
        if (!TextUtils.isEmpty(this.f61731n)) {
            bundle.putString(f61722e, this.f61731n);
        }
        if (!TextUtils.isEmpty(this.f61732o)) {
            bundle.putString("redirect_type", this.f61732o);
        }
        return bundle;
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isRedirect", this.f61726i);
        jSONObject.put("isExpand", this.f61727j);
        jSONObject.put("isWebsiteOpened", this.f61728k);
        jSONObject.put("isAuto", this.f61729l);
        jSONObject.put("redirectUrl", this.f61730m);
        jSONObject.put("redirectRequestUrl", this.f61731n);
        jSONObject.put("redirectType", this.f61732o);
        jSONObject.put("expandedWebviewAddress", this.f61733p);
        jSONObject.put("debugInfo", this.f61734q);
        jSONObject.put("sdkPackageName", this.f61735r);
        jSONObject.put("redirectTimestamp", this.f61736s);
        BrandSafetyEvent.AdFormatType adFormatType = this.f61737t;
        if (adFormatType != null) {
            jSONObject.put("adFormatType", adFormatType.name());
        }
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f61726i = jSONObject.optBoolean("isRedirect", false);
            this.f61727j = jSONObject.optBoolean("isExpand", false);
            this.f61728k = jSONObject.optBoolean("isWebsiteOpened", false);
            this.f61729l = jSONObject.optBoolean("isAuto", false);
            this.f61730m = jSONObject.optString("redirectUrl", "");
            this.f61731n = jSONObject.optString("redirectRequestUrl", "");
            this.f61732o = jSONObject.optString("redirectType", "");
            this.f61733p = jSONObject.optString("expandedWebviewAddress", "");
            this.f61734q = jSONObject.optString("debugInfo", "");
            this.f61735r = jSONObject.optString("sdkPackageName", "");
            this.f61736s = jSONObject.optLong("redirectTimestamp", 0L);
            String strOptString = jSONObject.optString("adFormatType", "");
            this.f61737t = strOptString.isEmpty() ? null : BrandSafetyEvent.AdFormatType.valueOf(strOptString);
        }
    }
}
