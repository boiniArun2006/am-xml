package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1802k f50601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JSONObject f50602b;

    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50608a;

        public int b() {
            return this.f50608a;
        }

        a(int i2) {
            this.f50608a = i2;
        }
    }

    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public static v0 a(JSONObject jSONObject, C1802k c1802k) {
        b bVarC = c(JsonUtils.getString(jSONObject, "type", null));
        return bVarC == b.ALERT ? new w0(jSONObject, c1802k) : bVarC == b.EVENT ? new y0(jSONObject, c1802k) : new v0(jSONObject, c1802k);
    }

    public String b() {
        return JsonUtils.getString(this.f50602b, "decision_type", null);
    }

    public int c() {
        return JsonUtils.getInt(this.f50602b, "id", -1);
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if (com.safedk.android.analytics.events.a.f62811a.equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException("Invalid type provided: " + str);
    }

    protected String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f50602b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = JsonUtils.getObjectAtIndex(jSONArray, i2, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f50601a.A().M().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(C1802k.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return C1802k.a(JsonUtils.getString(jSONObject, "key", null), arrayList);
    }

    public String e() {
        return JsonUtils.getString(this.f50602b, "type", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + "}";
    }

    public v0(JSONObject jSONObject, C1802k c1802k) {
        this.f50601a = c1802k;
        this.f50602b = jSONObject;
    }

    public b d() {
        return c(e());
    }

    public a a() {
        return a(b());
    }

    public int a(Boolean bool) {
        int i2 = JsonUtils.getInt(this.f50602b, "destination_state_id", -1);
        if (i2 > 0) {
            return i2;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f50602b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f50602b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException("Decision needed for state: " + i2);
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        if ("has_terms_of_service_uri".equalsIgnoreCase(str)) {
            return a.HAS_TERMS_OF_SERVICE_URI;
        }
        return a.NONE;
    }
}
