package com.applovin.impl;

import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.AppLovinBridge;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class j5 extends AbstractRunnableC1782i5 {

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k) {
            super(aVar, c1802k);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            j5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            r0.a(i2, this.f48733a);
        }
    }

    j5(C1802k c1802k) {
        super("TaskApiSubmitData", c1802k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f48733a.o0().a(x4.f50816f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f48733a.o0().a(x4.f50825j, JsonUtils.getString(jSONObject2, "device_token", ""));
        r0.a(jSONObject2, this.f48733a);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.l lVarA = this.f48733a.A();
        Map mapP = lVarA.p();
        n7.a(AppLovinBridge.f61288f, "type", mapP);
        n7.a("api_level", "sdk_version", mapP);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapP));
        Map mapG = lVarA.G();
        n7.a("sdk_version", "applovin_sdk_version", mapG);
        n7.a("ia", "installed_at", mapG);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapG));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1804o.a()) {
            this.f48735c.d(this.f48734b, "Submitting user data...");
        }
        Map mapC = r0.c(this.f48733a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f48733a.a(x4.f50761F5)).booleanValue() || ((Boolean) this.f48733a.a(x4.z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f48733a).b(r0.b("2.0/device", this.f48733a)).a(r0.a("2.0/device", this.f48733a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f48733a.a(x4.M5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f48733a.a(x4.Z2)).intValue()).a(AbstractC1810u4.a.a(((Integer) this.f48733a.a(x4.w5)).intValue())).a(), this.f48733a);
        aVar.c(x4.n0);
        aVar.b(x4.o0);
        this.f48733a.q0().a(aVar);
    }
}
