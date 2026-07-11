package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class u6 extends v6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f50581g;

    @Override // com.applovin.impl.q6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, this.f50581g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f50581g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f50581g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f50581g.getFormat().getLabel());
        String strS0 = this.f50581g.s0();
        if (!StringUtils.isValidString(strS0)) {
            strS0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strS0);
        String strB = this.f50581g.B();
        if (!StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strB);
    }

    public u6(c3 c3Var, C1802k c1802k) {
        super("TaskValidateMaxReward", c1802k);
        this.f50581g = c3Var;
    }

    @Override // com.applovin.impl.q6
    protected String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.v6
    protected boolean h() {
        return this.f50581g.w0();
    }

    @Override // com.applovin.impl.v6
    protected void a(o4 o4Var) {
        this.f50581g.a(o4Var);
    }

    @Override // com.applovin.impl.q6
    protected void a(int i2) {
        String str;
        super.a(i2);
        if (i2 >= 400 && i2 < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.f50581g.a(o4.a(str));
        this.f48733a.P().a(d2.v0, this.f50581g, CollectionUtils.hashMap("error_message", str));
    }
}
