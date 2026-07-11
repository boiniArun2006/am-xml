package com.applovin.impl;

import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.AbstractC1811v;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class s6 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p2 f49937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Exception f49938h;

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k) {
            super(aVar, c1802k);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "License Validation successful");
            }
            a5.b(z4.f51006i, Boolean.FALSE, C1802k.o());
            Map map = CollectionUtils.map("code", String.valueOf(i2));
            CollectionUtils.putStringIfValid("url", str, map);
            this.f48733a.v0().d(d2.f48286l, map);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Failed to validate license: ");
            }
            if (!this.f48733a.c(x4.f50751A).contains(String.valueOf(i2))) {
                a5.b(z4.f51006i, Boolean.FALSE, C1802k.o());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i2));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.f48733a.v0().d(d2.f48288m, map);
        }
    }

    public s6(C1802k c1802k, p2 p2Var, Exception exc) {
        super("TaskValidateLicense", c1802k);
        this.f49937g = p2Var;
        this.f49938h = exc;
    }

    private String e() {
        return r0.a((String) this.f48733a.a(x4.v0), (String) this.f48733a.a(x4.w0), this.f48733a);
    }

    private JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        AbstractC1811v.a aVarF = this.f48733a.A().f();
        JsonUtils.putBoolean(jSONObject, "dnt", aVarF.c());
        JsonUtils.putString(jSONObject, "dnt_code", aVarF.b().b());
        if (((Boolean) this.f48733a.a(x4.y3)).booleanValue() && StringUtils.isValidString(aVarF.a())) {
            JsonUtils.putString(jSONObject, "idfa", aVarF.a());
        }
        l.b bVarH = this.f48733a.A().H();
        if (((Boolean) this.f48733a.a(x4.z3)).booleanValue() && bVarH != null) {
            JsonUtils.putString(jSONObject, "idfv", bVarH.f50286a);
            JsonUtils.putInt(jSONObject, "idfv_scope", bVarH.f50287b);
        }
        String strE = this.f48733a.w0().e();
        if (((Boolean) this.f48733a.a(x4.A3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f48733a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f48733a.u());
        }
        if (((Boolean) this.f48733a.a(x4.f50760F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f48733a.h0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.f48733a.A().e());
        JSONObject jSONObject2 = new JSONObject();
        p2 p2Var = this.f49937g;
        if (p2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", p2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.f49937g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.f49937g.c());
            JsonUtils.putInt(jSONObject2, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, this.f49937g.b());
        }
        Exception exc = this.f49938h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return r0.a((String) this.f48733a.a(x4.u0), (String) this.f48733a.a(x4.w0), this.f48733a);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f48733a).b(g()).a(e()).a(f()).c("POST").b(((Boolean) this.f48733a.a(x4.Q5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f48733a.a(x4.t3)).intValue()).a(AbstractC1810u4.a.a(((Integer) this.f48733a.a(x4.y5)).intValue())).a(), this.f48733a);
        aVar.c(x4.u0);
        aVar.b(x4.v0);
        this.f48733a.q0().a(aVar);
    }
}
