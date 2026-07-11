package com.applovin.impl;

import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class q6 extends AbstractRunnableC1782i5 {

    class a extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ q0.e f49801m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k, q0.e eVar) {
            super(aVar, c1802k);
            this.f49801m = eVar;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            this.f49801m.a(str, jSONObject, i2);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            this.f49801m.a(str, i2, str2, jSONObject);
        }
    }

    protected abstract void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, q0.e eVar) {
        Map mapC = r0.c(this.f48733a);
        if (((Boolean) this.f48733a.a(x4.G5)).booleanValue() || ((Boolean) this.f48733a.a(x4.z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f48733a).b(r0.b(f(), this.f48733a)).a(r0.a(f(), this.f48733a)).b(mapC).a(jSONObject).c("POST").b(((Boolean) this.f48733a.a(x4.P5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(AbstractC1810u4.a.a(((Integer) this.f48733a.a(x4.x5)).intValue())).a(), this.f48733a, eVar);
        aVar.c(x4.n0);
        aVar.b(x4.o0);
        this.f48733a.q0().a(aVar);
    }

    protected abstract String f();

    protected abstract int g();

    protected JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String strE = this.f48733a.w0().e();
        if (((Boolean) this.f48733a.a(x4.f50753B3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f48733a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f48733a.u());
        }
        if (((Boolean) this.f48733a.a(x4.f50760F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f48733a.h0());
        }
        a(jSONObject);
        return jSONObject;
    }

    protected q6(String str, C1802k c1802k) {
        super(str, c1802k);
    }

    protected void a(int i2) {
        r0.a(i2, this.f48733a);
    }
}
