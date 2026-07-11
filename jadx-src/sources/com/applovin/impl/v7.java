package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class v7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50633b;

    public static v7 a(p8 p8Var, C1802k c1802k) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1802k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new v7((String) p8Var.a().get("apiFramework"), p8Var.d());
        } catch (Throwable th) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("VastJavaScriptResource", "Error occurred while initializing", th);
            }
            c1802k.D().a("VastJavaScriptResource", th);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            v7 v7Var = (v7) obj;
            String str = this.f50632a;
            if (str == null ? v7Var.f50632a != null : !str.equals(v7Var.f50632a)) {
                return false;
            }
            String str2 = this.f50633b;
            String str3 = v7Var.f50633b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public String b() {
        return this.f50632a;
    }

    public String c() {
        return this.f50633b;
    }

    public int hashCode() {
        String str = this.f50632a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f50633b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f50632a + "', javascriptResourceUrl='" + this.f50633b + "'}";
    }

    private v7(String str, String str2) {
        this.f50632a = str;
        this.f50633b = str2;
    }

    public static v7 a(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            return null;
        }
        return new v7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f50632a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f50633b);
        return jSONObject;
    }
}
