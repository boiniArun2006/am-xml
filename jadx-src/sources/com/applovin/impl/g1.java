package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f48571a;

    protected Integer a() {
        return JsonUtils.getInteger(this.f48571a, "dark_mode_toolbar_color", null);
    }

    protected String b() {
        return JsonUtils.getString(this.f48571a, "digital_asset_link_url", null);
    }

    protected Boolean c() {
        return JsonUtils.getBoolean(this.f48571a, "instant_apps_enabled", null);
    }

    protected String d() {
        return JsonUtils.getString(this.f48571a, "referrer", null);
    }

    protected Integer e() {
        return JsonUtils.getInteger(this.f48571a, "session_url_relation", null);
    }

    protected Integer f() {
        return JsonUtils.getInteger(this.f48571a, "share_state", null);
    }

    protected Boolean g() {
        return JsonUtils.getBoolean(this.f48571a, "should_show_title", null);
    }

    protected Integer h() {
        return JsonUtils.getInteger(this.f48571a, "toolbar_color", null);
    }

    protected Boolean i() {
        return JsonUtils.getBoolean(this.f48571a, "url_bar_hiding_enabled", null);
    }

    public g1(JSONObject jSONObject) {
        this.f48571a = jSONObject;
    }
}
