package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class n6 extends o6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f49482g;

    @Override // com.applovin.impl.q6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, this.f49482g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f49482g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f49482g.e());
        String strS0 = this.f49482g.s0();
        if (!StringUtils.isValidString(strS0)) {
            strS0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strS0);
        String strB = this.f49482g.B();
        if (!StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strB);
    }

    public n6(c3 c3Var, C1802k c1802k) {
        super("TaskReportMaxReward", c1802k);
        this.f49482g = c3Var;
    }

    @Override // com.applovin.impl.q6
    protected String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.o6
    protected o4 h() {
        return this.f49482g.o0();
    }

    @Override // com.applovin.impl.o6
    protected void b(JSONObject jSONObject) {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Reported reward successfully for mediated ad: " + this.f49482g);
        }
    }

    @Override // com.applovin.impl.o6
    protected void i() {
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "No reward result was found for mediated ad: " + this.f49482g);
        }
    }

    @Override // com.applovin.impl.q6
    protected void a(int i2) {
        super.a(i2);
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Failed to report reward for mediated ad: " + this.f49482g + " - error code: " + i2);
        }
        this.f48733a.P().a(d2.u0, this.f49482g);
    }
}
