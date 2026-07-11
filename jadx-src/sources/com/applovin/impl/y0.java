package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class y0 extends v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f50869c;

    public Map f() {
        return this.f50869c;
    }

    public String g() {
        return JsonUtils.getString(this.f50602b, AppMeasurementSdk.ConditionalUserProperty.NAME, null);
    }

    @Override // com.applovin.impl.v0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", name=" + g() + "}";
    }

    public y0(JSONObject jSONObject, C1802k c1802k) {
        super(jSONObject, c1802k);
    }
}
