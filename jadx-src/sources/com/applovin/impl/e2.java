package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.d2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bendingspoons.legal.privacy.Tracker;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.events.CrashEvent;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile ExecutorService f48415g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1802k f48417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C1804o f48418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d2.b f48419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f48420d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f48421e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f48414f = (int) TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f48416h = new Object();

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: com.applovin.impl.e2$a$a, reason: collision with other inner class name */
        class C0699a implements Thread.UncaughtExceptionHandler {
            C0699a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                e2.this.f48417a.O();
                if (C1804o.a()) {
                    e2.this.f48417a.O().a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) e2.this.f48417a.a(x4.f50790S)).intValue());
            thread.setUncaughtExceptionHandler(new C0699a());
            return thread;
        }
    }

    private void a() {
        if (f48415g != null) {
            return;
        }
        synchronized (f48416h) {
            try {
                if (f48415g != null) {
                    return;
                }
                f48415g = Executors.newFixedThreadPool(1, new a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c(d2 d2Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (d2Var.a() == d2.b.AD || d2Var.a() == d2.b.MEDIATED_AD || d2Var.a() == d2.b.USER_SESSION || !n7.a(((Integer) this.f48417a.a(x4.f50752B)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(a(d2Var, map).openConnection()));
            } catch (Throwable th2) {
                httpURLConnection = null;
                th = th2;
            }
            try {
                int i2 = f48414f;
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("AppLovin-Event-Type", d2Var.b());
                int iHttpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                if (C1804o.a()) {
                    this.f48418b.a("HealthEventsReporter", d2Var.b() + " reported with code " + iHttpUrlConnectionGetResponseCode + " and extra parameters " + map);
                }
                this.f48420d.put(d2Var, Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (C1804o.a()) {
                        this.f48418b.d("HealthEventsReporter", "Failed to report " + d2Var.b() + " with extra parameters " + map, th);
                    }
                    n7.a(httpURLConnection, this.f48417a);
                } finally {
                    n7.a(httpURLConnection, this.f48417a);
                }
            }
        }
    }

    public void d(d2 d2Var, Map map) {
        a(d2Var, map, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, d2 d2Var, JSONObject jSONObject) {
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            byte[] bytes = jSONObject.toString().getBytes(com.google.android.exoplayer2.C.UTF8_NAME);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            try {
                int i2 = f48414f;
                httpURLConnection2.setConnectTimeout(i2);
                httpURLConnection2.setReadTimeout(i2);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("AppLovin-Event-Type", d2Var.b());
                OutputStream outputStreamUrlConnectionGetOutputStream = AppLovinNetworkBridge.urlConnectionGetOutputStream(httpURLConnection2);
                outputStreamUrlConnectionGetOutputStream.write(bytes);
                outputStreamUrlConnectionGetOutputStream.close();
                int iHttpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection2);
                if (C1804o.a()) {
                    this.f48418b.a("HealthEventsReporter", d2Var.b() + " reported with code " + iHttpUrlConnectionGetResponseCode);
                }
                this.f48420d.put(d2Var, Long.valueOf(System.currentTimeMillis()));
                n7.a(httpURLConnection2, this.f48417a);
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (C1804o.a()) {
                        this.f48418b.d("HealthEventsReporter", "Failed to report " + d2Var.b(), th);
                    }
                } finally {
                    n7.a(httpURLConnection, this.f48417a);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void d(final d2 d2Var, List list) {
        final String str = (String) this.f48417a.a(x4.f50754C);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double dA = d2Var.a(this.f48417a);
        if (n7.a(dA)) {
            if (((Boolean) this.f48417a.a(x4.f50766I)).booleanValue()) {
                a(str, d2Var, a(d2Var, dA, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final JSONObject jSONObjectA = a(d2Var, dA, Collections.singletonList((Map) it.next()));
                f48415g.execute(new Runnable() { // from class: com.applovin.impl.Zs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47878n.a(str, d2Var, jSONObjectA);
                    }
                });
            }
        }
    }

    public e2(C1802k c1802k, d2.b bVar) {
        this.f48417a = c1802k;
        this.f48418b = c1802k.O();
        this.f48419c = bVar;
        a();
    }

    public void a(d2 d2Var, String str) {
        a(d2Var, str, new HashMap());
    }

    public void a(d2 d2Var, String str, Map map) {
        map.put("source", str);
        d(d2Var, map);
    }

    public void a(d2 d2Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f48421e.add(str2)) {
            map.put("source", str);
            a(d2Var, str, map);
        }
    }

    public void a(d2 d2Var, Map map, long j2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(d2Var, arrayList, j2);
    }

    public void a(final d2 d2Var, final List list, long j2) {
        if (a(d2Var, j2)) {
            return;
        }
        try {
            if (n7.i()) {
                f48415g.execute(new Runnable() { // from class: com.applovin.impl.Md
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47779n.b(d2Var, list);
                    }
                });
            } else {
                b(d2Var, list);
            }
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48418b.d("HealthEventsReporter", "Failed to report " + d2Var.b() + " with extra parameters collection " + list, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(d2 d2Var, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (C1804o.a()) {
            this.f48418b.a("HealthEventsReporter", "Reporting " + d2Var.b() + " with extra parameters collection " + list);
        }
        if (this.f48419c != d2Var.a()) {
            l1.a("Health event " + d2Var.b() + " category: " + d2Var.a() + " does not match the reporter category: " + this.f48419c, new Object[0]);
        }
        c(d2Var, list);
        d(d2Var, list);
    }

    private Map c(d2 d2Var, Map map) {
        HashMap map2 = new HashMap(map);
        if (d2Var == d2.P0) {
            map2.remove("details");
        }
        return map2;
    }

    private Map b(d2 d2Var, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", d2Var.b());
        if (d2Var == d2.L0 || d2Var == d2.f48258K0 || d2Var == d2.b1 || d2Var == d2.Z0) {
            if (((Boolean) this.f48417a.a(x4.n4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(n8.d()), map2);
                CollectionUtils.putStringIfValid("wvv", n8.c(), map2);
                CollectionUtils.putStringIfValid("wvpn", n8.b(), map2);
            }
            CollectionUtils.putStringIfValid("oglv", this.f48417a.A().K(), map2);
        }
        Map mapN = this.f48417a.A().N();
        map2.put(AppLovinBridge.f61288f, String.valueOf(mapN.get(AppLovinBridge.f61288f)));
        map2.put("country_code", String.valueOf(mapN.get("country_code")));
        map2.put("cc", this.f48417a.v().getCountryCode());
        map2.put("applovin_random_token", this.f48417a.h0());
        map2.put("compass_random_token", this.f48417a.u());
        map2.put("model", Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put("os", Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C1784j.b(), map2);
        map2.put("md", (String) this.f48417a.a(x4.f50843t));
        b(map2);
        a(map2);
        if (map != null) {
            map2.putAll(c(d2Var, map));
        }
        return map2;
    }

    private URL a(d2 d2Var, Map map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error");
        sb.append("?");
        Iterator it = b(d2Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), com.google.android.exoplayer2.C.UTF8_NAME);
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), com.google.android.exoplayer2.C.UTF8_NAME);
            sb.append(strEncode);
            sb.append(com.safedk.android.analytics.brandsafety.l.ae);
            sb.append(strEncode2);
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return new URL(sb.toString());
    }

    private JSONObject a(d2 d2Var, double d2, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (d2Var == d2.L0 || d2Var == d2.f48258K0 || d2Var == d2.b1 || d2Var == d2.Z0) {
            if (((Boolean) this.f48417a.a(x4.n4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(n8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", n8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", n8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f48417a.A().K());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map mapN = this.f48417a.A().N();
        JsonUtils.putObject(jSONObject2, AppLovinBridge.f61288f, mapN.get(AppLovinBridge.f61288f));
        JsonUtils.putObject(jSONObject2, "os", mapN.get("os"));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(mapN.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", mapN.get("brand"));
        JsonUtils.putObject(jSONObject2, "model", mapN.get("model"));
        JsonUtils.putObject(jSONObject2, "brand_name", mapN.get("brand_name"));
        JsonUtils.putObject(jSONObject2, "hardware", mapN.get("hardware"));
        JsonUtils.putObject(jSONObject2, "revision", mapN.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", mapN.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f48417a.v().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f48417a.h0());
        JsonUtils.putObject(jSONObject2, "compass_random_token", this.f48417a.u());
        JsonUtils.putObject(jSONObject2, "art", StringUtils.emptyIfNull(this.f48417a.r()));
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(C1784j.b()));
        Map mapG = this.f48417a.A().G();
        JsonUtils.putObject(jSONObject2, "sdk_version", mapG.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f48417a.a(x4.f50772L3));
        JsonUtils.putObject(jSONObject2, "app_version", mapG.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", mapG.get("package_name"));
        JsonUtils.putObject(jSONObject2, "app_version_code", String.valueOf(mapG.get("app_version_code")));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) mapG.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, "md", this.f48417a.a(x4.f50843t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f48417a.V());
        SessionTracker sessionTrackerM0 = this.f48417a.m0();
        JsonUtils.putObject(jSONObject2, "app_state", sessionTrackerM0.getCurrentApplicationState().b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(sessionTrackerM0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, "session_id", sessionTrackerM0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - C1802k.n()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", d2Var.b());
            JsonUtils.putDouble(jSONObject3, "weight", d2);
            JsonUtils.putString(jSONObject3, AppLovinEventTypes.USER_COMPLETED_LEVEL, "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, CrashEvent.f62787f, jSONArray);
        return jSONObject;
    }

    private void b(Map map) {
        PackageInfo packageInfoA = n7.a(C1802k.o(), 0);
        map.put("package_name", C1802k.o().getPackageName());
        map.put("app_version", packageInfoA != null ? packageInfoA.versionName : "");
        map.put("app_version_code", String.valueOf(packageInfoA != null ? packageInfoA.versionCode : 0));
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object objA = this.f48417a.H().a();
        Long lC = this.f48417a.H().c();
        if (objA instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", Tracker.AppLovin.NAME);
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) objA).getAdIdNumber()));
            map.put("fs_ad_memory_usage", lC != null ? lC.toString() : "Error");
        } else {
            if (objA instanceof y2) {
                y2 y2Var = (y2) objA;
                map.put("fs_ad_network", y2Var.getNetworkName());
                map.put("fs_ad_creative_id", y2Var.getCreativeId());
                map.put("fs_ad_memory_usage", lC != null ? lC.toString() : "Error");
                return;
            }
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
            map.put("fs_ad_memory_usage", "None");
        }
    }

    private boolean a(d2 d2Var, long j2) {
        Long l2 = (Long) this.f48420d.get(d2Var);
        return System.currentTimeMillis() - (l2 != null ? l2.longValue() : -1L) < j2;
    }
}
