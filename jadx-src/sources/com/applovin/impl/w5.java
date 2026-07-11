package com.applovin.impl;

import WJ.phkN.HFAkacKHsU;
import android.content.Context;
import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.AbstractC1811v;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.SdksMapping;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class w5 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q0.e f50706g;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k, boolean z2) {
            super(aVar, c1802k, z2);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            w5.this.f50706g.a(str, jSONObject, i2);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            w5.this.f50706g.a(str, i2, str2, jSONObject);
        }
    }

    public w5(q0.e eVar, C1802k c1802k) {
        super("TaskFetchMediationDebuggerInfo", c1802k, true);
        this.f50706g = eVar;
    }

    private JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, w3.b(this.f48733a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        AbstractC1811v.a aVarF = this.f48733a.A().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        Map mapK0 = this.f48733a.k0();
        if (!CollectionUtils.isEmpty(mapK0)) {
            JsonUtils.putJSONObject(jSONObject, HFAkacKHsU.CsOdTY, new JSONObject(mapK0));
        }
        return jSONObject;
    }

    protected Map e() {
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f48733a.a(x4.k5)).booleanValue()) {
            map.put("sdk_key", this.f48733a.i0());
        }
        Map mapG = this.f48733a.A().G();
        map.put("package_name", String.valueOf(mapG.get("package_name")));
        map.put("app_version", String.valueOf(mapG.get("app_version")));
        Map mapN = this.f48733a.A().N();
        map.put(AppLovinBridge.f61288f, String.valueOf(mapN.get(AppLovinBridge.f61288f)));
        map.put("os", String.valueOf(mapN.get("os")));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map mapE = e();
        JSONObject jSONObjectA = a(a());
        if (((Boolean) this.f48733a.a(x4.C5)).booleanValue() || ((Boolean) this.f48733a.a(x4.z5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectA, (Map<String, ?>) mapE);
            mapE = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f48733a).c(KfLR.ELVLGEs).b(l3.i(this.f48733a)).a(l3.h(this.f48733a)).b(mapE).a(jSONObjectA).a((Object) new JSONObject()).c(((Long) this.f48733a.a(r3.t7)).intValue()).a(AbstractC1810u4.a.a(((Integer) this.f48733a.a(x4.f50841r5)).intValue())).a(), this.f48733a, d());
        aVar.c(r3.f49873p7);
        aVar.b(r3.q7);
        this.f48733a.q0().a(aVar);
    }
}
