package com.applovin.impl;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.content.Context;
import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.C1805p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.bendingspoons.legal.privacy.Tracker;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class v5 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a3 f50624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONArray f50625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f50626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0704a f50627j;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    class a extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f50628m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f50629n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k, String str, MaxAdFormat maxAdFormat) {
            super(aVar, c1802k);
            this.f50628m = str;
            this.f50629n = maxAdFormat;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            if (i2 != 200) {
                v5.this.a(str, i2, null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f48903l.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f48903l.b());
            HashMap map = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid("code", String.valueOf(i2), map);
            CollectionUtils.putStringIfValid(pTYaLzzmJSGAPQ.LgPiY, this.f50628m, map);
            CollectionUtils.putStringIfValid("ad_format", this.f50629n.getLabel(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f48903l.a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f48903l.b()), map);
            this.f48733a.P().d(d2.i0, map);
            v5.this.b(jSONObject);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            v5.this.a(str, i2, str2);
            this.f48733a.D().a("fetchMediatedAd", str, i2, str2);
        }
    }

    private String e() {
        return l3.a(this.f48733a);
    }

    private String f() {
        return l3.b(this.f48733a);
    }

    private JSONObject g() throws JSONException {
        Map mapA = this.f48733a.A().a((Map) null, false, true);
        mapA.putAll(this.f50624g.c());
        JSONObject jSONObject = new JSONObject(mapA);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private Map h() {
        HashMap map = new HashMap(4);
        map.put("AppLovin-Ad-Unit-Id", this.f50624g.b());
        map.put("AppLovin-Ad-Format", this.f50624g.a().getLabel());
        Map mapD = this.f50624g.d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", mapD.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", mapD.get("retry_delay_sec"), map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            r0.c(jSONObject, this.f48733a);
            r0.b(jSONObject, this.f48733a);
            r0.a(jSONObject, this.f48733a);
            l3.f(jSONObject, this.f48733a);
            l3.d(jSONObject, this.f48733a);
            l3.e(jSONObject, this.f48733a);
            l3.g(jSONObject, this.f48733a);
            this.f48733a.m().a();
            MaxAdFormat maxAdFormatA = this.f50624g.a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (maxAdFormatA == fromString) {
                a(jSONObject);
                return;
            }
            String strB = this.f50624g.b();
            if (fromString == null) {
                if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "Mediated ad response is missing the ad format field for ad unit " + strB);
                }
                if (jSONObject.has(com.safedk.android.analytics.brandsafety.l.f62638S)) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f48733a.D().a(d2.a1, this.f48734b, map);
                }
                this.f50627j.onAdLoadFailed(strB, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = maxAdFormatA.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + strB + ") is assigned to the correct ad format.";
            if (n7.a(maxAdFormatA, fromString)) {
                C1804o.j(this.f48734b, str);
                a(jSONObject);
                return;
            }
            l1.a(str, new Object[0]);
            C1804o.h(this.f48734b, str);
            this.f50627j.onAdLoadFailed(strB, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB);
            CollectionUtils.putStringIfValid(YmsTEL.iOOSYhAkOKy, label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f48733a.D().a(d2.S0, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Unable to process mediated ad response for ad unit " + this.f50624g.b(), th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f48733a.X().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !n7.h(C1802k.o())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.f48733a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f48733a.Y();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            s3 s3Var = s3.f49915f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) u3VarY.a(s3.f49916g, t3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        String strB = this.f50624g.b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB);
        jSONObject2.put("ad_format", this.f50624g.a().getLabel());
        Map map = CollectionUtils.map(this.f50624g.d());
        C1805p c1805pA0 = this.f48733a.a0();
        CollectionUtils.putStringIfValid("previous_request_id", c1805pA0.b(strB), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", c1805pA0.a(strB), map);
        C1805p.a aVarC = c1805pA0.c(strB);
        if (aVarC != null) {
            if (Boolean.parseBoolean(this.f48733a.n0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", Tracker.AppLovin.NAME);
            } else {
                map.put("previous_winning_network", aVarC.a());
                map.put("previous_winning_network_name", aVarC.c());
            }
            if (this.f48733a.R() != null) {
                Queue<y2> queueC = this.f48733a.R().c(strB);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (y2 y2Var : queueC) {
                    arrayList.add(y2Var.c());
                    arrayList2.add(y2Var.getNetworkName());
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", zpl.n(",", arrayList), map);
                CollectionUtils.putStringIfValid("queued_ad_network_names", zpl.n(",", arrayList2), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f48733a.T().a()));
            jSONObject2.put("installed", w3.b(this.f48733a));
            jSONObject2.put("initialized", this.f48733a.S().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f48733a.S().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f48733a.T().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f48733a.T().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e2) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Failed to populate adapter classNames", e2);
            }
            throw new RuntimeException("Failed to populate classNames: " + e2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        v5 v5Var;
        MaxAdFormat maxAdFormatA = this.f50624g.a();
        String strB = this.f50624g.b();
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Fetching next ad for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        k2.a();
        if (((Boolean) this.f48733a.a(x4.T3)).booleanValue() && n7.k() && C1804o.a()) {
            this.f48735c.a(this.f48734b, "User is connected to a VPN");
        }
        this.f48733a.P().a(d2.h0, maxAdFormatA, strB, (MaxError) null);
        if (((Boolean) this.f48733a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f48733a.Y();
            s3 s3Var = s3.f49915f;
            u3VarY.a(s3Var, t3.a(strB));
            u3VarY.a(s3Var, t3.a(maxAdFormatA));
        }
        n7.a(this.f48733a, this.f48734b);
        try {
            JSONObject jSONObjectG = g();
            HashMap map = new HashMap();
            if (!((Boolean) this.f48733a.a(x4.B5)).booleanValue() && !((Boolean) this.f48733a.a(x4.z5)).booleanValue()) {
                map.put(com.safedk.android.analytics.brandsafety.l.f62669x, UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f48733a.a(x4.k5)).booleanValue()) {
                map.put("sdk_key", this.f48733a.i0());
            }
            if (this.f48733a.s0().c()) {
                map.put("test_mode", "1");
            }
            List listB = this.f48733a.s0().b();
            String str = this.f48733a.n0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                String strN = zpl.n(",", listB);
                map.put("filter_ad_network", strN);
                if (!this.f48733a.s0().c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f48733a.s0().d()) {
                    map.put("force_ad_network", strN);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            v5Var = this;
            try {
                a aVar = v5Var.new a(com.applovin.impl.sdk.network.a.a(this.f48733a).c("POST").a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((Boolean) this.f48733a.a(r3.f49875y8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f48733a.a(r3.s7)).intValue()).a(((Integer) this.f48733a.a(x4.W2)).intValue()).b(((Long) this.f48733a.a(r3.r7)).intValue()).a(AbstractC1810u4.a.a(((Integer) this.f48733a.a(x4.q5)).intValue())).f(true).a(), this.f48733a, strB, maxAdFormatA);
                aVar.c(r3.f49873p7);
                aVar.b(r3.q7);
                v5Var.f48733a.q0().a(aVar);
            } catch (Throwable th) {
                th = th;
                if (C1804o.a()) {
                    v5Var.f48735c.a(v5Var.f48734b, "Unable to fetch ad for Ad Unit ID: " + strB, th);
                }
                a("", 0, th.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            v5Var = this;
        }
    }

    public v5(a3 a3Var, JSONArray jSONArray, Context context, C1802k c1802k, a.InterfaceC0704a interfaceC0704a) {
        super("TaskFetchMediatedAd", c1802k, a3Var.b());
        this.f50624g = a3Var;
        this.f50625h = jSONArray;
        this.f50626i = context;
        this.f50627j = interfaceC0704a;
    }

    private void a(JSONObject jSONObject) {
        f6 f6Var = new f6(this.f50624g, jSONObject, this.f50626i, this.f48733a, this.f50627j);
        long j2 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j2 > 0) {
            this.f48733a.q0().a(f6Var, d6.b.MEDIATION, j2, true);
        } else {
            this.f48733a.q0().a(f6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2, String str2) {
        MaxErrorImpl maxErrorImpl;
        String strB = this.f50624g.b();
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "Unable to fetch ad for ad unit " + strB + ": server returned " + i2);
        }
        if (i2 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i2 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid("code", String.valueOf(i2), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB, map);
        CollectionUtils.putStringIfValid("ad_format", this.f50624g.a().getLabel(), map);
        this.f48733a.P().d(d2.j0, map);
        t2.a(this.f50627j, strB, maxErrorImpl);
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f50625h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f48733a.n0().getExtraParameters()));
    }
}
