package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u2 f48756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a4 f48757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f48758c;

    public a4 a() {
        return this.f48757b;
    }

    public u2 b() {
        return this.f48756a;
    }

    public List c() {
        return this.f48758c;
    }

    public boolean d() {
        return this.f48757b != null;
    }

    public i8(JSONObject jSONObject, MaxAdFormat maxAdFormat, e3 e3Var, C1802k c1802k) {
        boolean z2;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f48757b = new a4(jSONObject2, c1802k);
        } else {
            this.f48757b = null;
        }
        String string = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        String string2 = JsonUtils.getString(jSONObject, "display_name", "");
        if (jSONObject2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f48756a = new u2(string, string2, z2, e3Var);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f48758c = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f48758c.add(new a4(jSONObject3, c1802k));
            }
        }
    }
}
