package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f50734a;

    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    public static x0 a(JSONObject jSONObject, C1802k c1802k) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), "key", null);
        if ("TOS".equalsIgnoreCase(string) && c1802k.x().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && c1802k.x().f() == null) {
            return null;
        }
        return new x0(jSONObject);
    }

    public String b() {
        return JsonUtils.getString(this.f50734a, com.safedk.android.analytics.events.a.f62811a, null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f50734a, "style", null);
        return "default".equalsIgnoreCase(string) ? a.POSITIVE : ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f50734a, "title", (JSONObject) null);
        return C1802k.a(JsonUtils.getString(jSONObject, "key", ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + ", destinationStateId=" + a() + ", event=" + b() + "}";
    }

    private x0(JSONObject jSONObject) {
        this.f50734a = jSONObject;
    }

    public int a() {
        return JsonUtils.getInt(this.f50734a, "destination_state_id", -1);
    }
}
