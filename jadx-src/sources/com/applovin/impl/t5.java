package com.applovin.impl;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.AbstractC1811v;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.security.ProviderInstaller;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.SdksMapping;
import com.vungle.ads.internal.model.Cookie;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class t5 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicBoolean f50501j = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f50502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f50503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f50504i;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class a extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f50505m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k, boolean z2, long j2) {
            super(aVar, c1802k, z2);
            this.f50505m = j2;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f50505m;
            t5.this.a(jSONObject);
            this.f48733a.v0().d(d2.f48282h, t5.this.a(str, jElapsedRealtime, i2, jSONObject, null));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unable to fetch basic SDK settings: server returned " + i2);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f50505m;
            t5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f48733a.v0().d(d2.f48283i, t5.this.a(str, jElapsedRealtime, i2, jSONObject, str2));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface b {
        void a(JSONObject jSONObject);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class c extends AbstractRunnableC1782i5 {
        public c(C1802k c1802k) {
            super("TaskTimeoutFetchBasicSettings", c1802k, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f50504i != null) {
                if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "Timing out fetch basic settings...");
                }
                t5.this.a(new JSONObject());
            }
        }
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    public t5(int i2, C1802k c1802k, b bVar) {
        super("TaskFetchBasicSettings", c1802k, true);
        this.f50503h = new Object();
        this.f50502g = i2;
        this.f50504i = bVar;
    }

    private String f() {
        return r0.a((String) this.f48733a.a(x4.k0), "5.0/i", b());
    }

    private String g() {
        return r0.a((String) this.f48733a.a(x4.j0), "5.0/i", b());
    }

    protected JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            C1802k c1802k = this.f48733a;
            x4 x4Var = x4.z5;
            if (((Boolean) c1802k.a(x4Var)).booleanValue() || ((Boolean) this.f48733a.a(x4Var)).booleanValue()) {
                jSONObject.put(com.safedk.android.analytics.brandsafety.l.f62669x, UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", C1784j.b());
            jSONObject.put("init_count", this.f50502g);
            jSONObject.put("server_installed_at", this.f48733a.a(x4.f50834o));
            if (this.f48733a.C0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f48733a.z0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", n7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", n7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f48733a.a(x4.f50772L3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f48733a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f48733a.C());
            jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, w3.b(this.f48733a));
            Map mapG = this.f48733a.A().G();
            jSONObject.put("package_name", mapG.get("package_name"));
            jSONObject.put("app_version", mapG.get("app_version"));
            jSONObject.put("debug", mapG.get("debug"));
            jSONObject.put("tg", mapG.get("tg"));
            jSONObject.put("target_sdk", mapG.get("target_sdk"));
            jSONObject.put("session_id", mapG.get("session_id"));
            List list = (List) mapG.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) mapG.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.f48733a.J() != null ? this.f48733a.J().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put(Cookie.IABTCF_TC_STRING, mapG.get(Cookie.IABTCF_TC_STRING));
            jSONObject.put(Cookie.IABTCF_GDPR_APPLIES, mapG.get(Cookie.IABTCF_GDPR_APPLIES));
            Object obj = mapG.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f48733a.x().b());
            Map mapN = this.f48733a.A().N();
            jSONObject.put(AppLovinBridge.f61288f, mapN.get(AppLovinBridge.f61288f));
            jSONObject.put("os", mapN.get("os"));
            jSONObject.put("locale", mapN.get("locale"));
            jSONObject.put("brand", mapN.get("brand"));
            jSONObject.put("brand_name", mapN.get("brand_name"));
            jSONObject.put("hardware", mapN.get("hardware"));
            jSONObject.put("model", mapN.get("model"));
            jSONObject.put("revision", mapN.get("revision"));
            jSONObject.put("is_tablet", mapN.get("is_tablet"));
            jSONObject.put("screen_size_in", mapN.get("screen_size_in"));
            jSONObject.put("supported_abis", mapN.get("supported_abis"));
            Object obj2 = mapN.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.f48733a.a(x4.f50800W3)).booleanValue()) {
                jSONObject.put("mtl", this.f48733a.m0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) C1802k.o().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            AbstractC1811v.a aVarF = this.f48733a.A().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            Boolean boolB = p0.c().b(a());
            if (((Boolean) this.f48733a.a(x4.G3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            l.b bVarH = this.f48733a.A().H();
            if (((Boolean) this.f48733a.a(x4.z3)).booleanValue() && bVarH != null && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarH.f50286a);
                jSONObject.put("idfv_scope", bVarH.f50287b);
            }
            if (((Boolean) this.f48733a.a(x4.C3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f48733a.u());
            }
            if (((Boolean) this.f48733a.a(x4.E3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f48733a.h0());
            }
            if (((Boolean) this.f48733a.a(x4.I3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f48733a.r());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f48733a.E());
            if (this.f48733a.s0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = this.f48733a.s0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f48733a.n0().getExtraParameters()));
            Map mapK0 = this.f48733a.k0();
            if (!CollectionUtils.isEmpty(mapK0)) {
                jSONObject.put("segments", new JSONObject(mapK0));
            }
        } catch (JSONException e2) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Failed to create JSON body", e2);
            }
            this.f48733a.D().a(this.f48734b, "createJSONBody", e2);
        }
        return jSONObject;
    }

    protected Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f48733a.a(x4.A5)).booleanValue() && !((Boolean) this.f48733a.a(x4.z5)).booleanValue()) {
            map.put(com.safedk.android.analytics.brandsafety.l.f62669x, UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f48733a.a(x4.k5)).booleanValue()) {
            map.put("sdk_key", this.f48733a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f48733a.q(), map);
        Boolean boolB = p0.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        Boolean boolB2 = p0.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        Boolean boolB3 = p0.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!o0.i() && f50501j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(C1802k.o());
            } catch (Throwable th) {
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "Cannot update security provider", th);
                }
            }
        }
        this.f48733a.v0().d(d2.f48280g, b(g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map mapH = h();
        a.C0712a c0712aB = com.applovin.impl.sdk.network.a.a(this.f48733a).b(g()).a(f()).b(mapH).a(e()).b(((Boolean) this.f48733a.a(x4.L5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f48733a.a(x4.f50812c3)).intValue()).b(((Integer) this.f48733a.a(x4.f3)).intValue());
        C1802k c1802k = this.f48733a;
        x4 x4Var = x4.f50809b3;
        com.applovin.impl.sdk.network.a aVarA = c0712aB.c(((Integer) c1802k.a(x4Var)).intValue()).e(((Boolean) this.f48733a.a(x4.o3)).booleanValue()).a(AbstractC1810u4.a.a(((Integer) this.f48733a.a(x4.p5)).intValue())).f(true).a();
        this.f48733a.q0().a(new c(this.f48733a), d6.b.TIMEOUT, ((long) ((Integer) this.f48733a.a(x4Var)).intValue()) + 250);
        a aVar = new a(aVarA, this.f48733a, d(), jElapsedRealtime);
        aVar.c(x4.j0);
        aVar.b(x4.k0);
        this.f48733a.q0().a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j2, int i2, JSONObject jSONObject, String str2) {
        Uri uriBuild = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "domain", uriBuild.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap map = new HashMap();
        map.put("attempt_number", Integer.toString(this.f50502g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put(pTYaLzzmJSGAPQ.BhErum, Long.toString(j2));
        map.put("code", Integer.toString(i2));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f50503h) {
            bVar = this.f50504i;
            this.f50504i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
