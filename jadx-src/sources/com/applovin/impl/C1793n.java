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

/* JADX INFO: renamed from: com.applovin.impl.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C1793n implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f49448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1794o f49449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f49450e;

    public MaxAdFormat a() {
        return this.f49448c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1793n c1793n) {
        return this.f49447b.compareToIgnoreCase(c1793n.f49447b);
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f49448c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f49446a;
    }

    public String d() {
        return this.f49447b;
    }

    public String e() {
        return "\n---------- " + this.f49447b + " ----------\nIdentifier - " + this.f49446a + "\nFormat     - " + b();
    }

    public C1794o f() {
        return this.f49449d;
    }

    public List g() {
        return this.f49450e;
    }

    public C1793n(JSONObject jSONObject, Map map, C1802k c1802k) {
        this.f49446a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.f49447b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f49448c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f49450e = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f49450e.add(new C1794o(jSONObject2, map, this.f49448c, c1802k));
            }
        }
        this.f49449d = this.f49450e.isEmpty() ? null : (C1794o) this.f49450e.get(0);
    }
}
