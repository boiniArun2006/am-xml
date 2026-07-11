package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C1794o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k8 f49507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f49508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f49509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49510f = false;

    public List a() {
        return this.f49508d;
    }

    private k8 a(JSONObject jSONObject) {
        return new k8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    public String b() {
        return this.f49506b;
    }

    public String c() {
        return this.f49505a;
    }

    public k8 d() {
        return this.f49507c;
    }

    public List e() {
        return this.f49509e;
    }

    public boolean f() {
        return this.f49510f;
    }

    C1794o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, C1802k c1802k) {
        this.f49505a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.f49506b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f49507c = a(jSONObject);
        this.f49508d = a("bidders", jSONObject, map, maxAdFormat, c1802k);
        this.f49509e = a("waterfall", jSONObject, map, maxAdFormat, c1802k);
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, C1802k c1802k) {
        e3 e3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null && (e3Var = (e3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (e3Var.C()) {
                    this.f49510f = true;
                }
                arrayList.add(new i8(jSONObject2, maxAdFormat, e3Var, c1802k));
            }
        }
        return arrayList;
    }
}
