package com.applovin.impl;

import YgZ.uQga.IYJfqUyym;
import android.content.Context;
import com.applovin.impl.c5;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class p5 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static JSONObject f49676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f49677k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map f49678l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a3 f49679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f49680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f49681i;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface b {
        void a(JSONArray jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static class c implements c5.a, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f49682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f49683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f49685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Collection f49686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C1802k f49687f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C1804o f49688g;

        @Override // com.applovin.impl.c5.a
        public void a(c5 c5Var) {
            boolean z2;
            synchronized (this.f49683b) {
                this.f49686e.add(c5Var);
                int i2 = this.f49684c - 1;
                this.f49684c = i2;
                z2 = i2 < 1;
            }
            if (z2 && this.f49685d.compareAndSet(false, true)) {
                if (n7.i() && ((Boolean) this.f49687f.a(x4.f50780P)).booleanValue()) {
                    this.f49687f.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f49687f, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.nr
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49504n.a();
                        }
                    }), d6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        private c(int i2, b bVar, C1802k c1802k) {
            this.f49684c = i2;
            this.f49682a = bVar;
            this.f49687f = c1802k;
            this.f49688g = c1802k.O();
            this.f49683b = new Object();
            this.f49686e = new ArrayList(i2);
            this.f49685d = new AtomicBoolean();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f49685d.compareAndSet(false, true)) {
                a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList<c5> arrayList;
            synchronized (this.f49683b) {
                arrayList = new ArrayList(this.f49686e);
            }
            JSONArray jSONArray = new JSONArray();
            for (c5 c5Var : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    d5 d5VarF = c5Var.f();
                    jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, d5VarF.c());
                    jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, d5VarF.b());
                    jSONObject.put("adapter_version", c5Var.a());
                    jSONObject.put("sdk_version", c5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = c5Var.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", c5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", c5Var.b());
                    jSONObject2.put("is_cached", c5Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (C1804o.a()) {
                        this.f49688g.a("TaskCollectSignals", "Collected signal from " + d5VarF);
                    }
                } catch (JSONException e2) {
                    if (C1804o.a()) {
                        this.f49688g.a("TaskCollectSignals", "Failed to create signal data", e2);
                    }
                    this.f49687f.D().a("TaskCollectSignals", "createSignalsData", e2);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f49682a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f49681i, this.f48733a);
        this.f48733a.q0().a(new C1797r6(this.f48733a, "timeoutCollectSignal", cVar), d6.b.TIMEOUT, ((Long) this.f48733a.a(r3.w7)).longValue());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            a(new d5(this.f49679g, jSONArray.getJSONObject(i2), jSONObject, this.f48733a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f49678l.get(this.f49679g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.f49679g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            if (set.contains(JsonUtils.getString(jSONObject2, AppMeasurementSdk.ConditionalUserProperty.NAME, null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    public p5(a3 a3Var, Context context, C1802k c1802k, b bVar) {
        super("TaskCollectSignals", c1802k);
        this.f49679g = a3Var;
        this.f49680h = context;
        this.f49681i = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f49677k) {
                jSONArray = JsonUtils.getJSONArray(f49676j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f49678l.size() > 0) {
                    b(jSONArray, f49676j);
                    return;
                } else {
                    a(jSONArray, f49676j);
                    return;
                }
            }
            if (C1804o.a()) {
                this.f48735c.k(this.f48734b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f48733a.a(z4.f50985F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f49678l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e2) {
            a("Failed to wait for signals", e2);
            this.f48733a.D().a("TaskCollectSignals", "waitForSignals", e2);
        } catch (JSONException e3) {
            a("Failed to parse signals JSON", e3);
            this.f48733a.D().a(IYJfqUyym.zUYaMKELcTrNeh, "parseSignalsJSON", e3);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.f48733a.D().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(final d5 d5Var, final c5.a aVar) {
        if (d5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.Kk1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47762n.b(d5Var, aVar);
                }
            });
        } else {
            this.f48733a.X().collectSignal(d5Var, this.f49680h, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d5 d5Var, c5.a aVar) {
        this.f48733a.X().collectSignal(d5Var, this.f49680h, aVar);
    }

    private void a(String str, Throwable th) {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "No signals collected: " + str, th);
        }
        b bVar = this.f49681i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f49677k) {
            f49676j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, C1802k c1802k) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f49678l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e2) {
            C1804o.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e2);
            c1802k.D().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e2);
        }
    }
}
