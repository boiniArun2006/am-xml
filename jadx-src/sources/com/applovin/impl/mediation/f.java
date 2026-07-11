package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.i6;
import com.applovin.impl.k3;
import com.applovin.impl.k5;
import com.applovin.impl.l1;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapter;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f49330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f49331c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f49332d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f49333e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JSONArray f49334f = new JSONArray();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f49335g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f49336h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f49337i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f49338j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f49339k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f49340l;

    public void a(Activity activity) {
        if (this.f49331c.compareAndSet(false, true)) {
            String str = (String) this.f49329a.a(z4.f50986G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<k3> listA = a(JsonUtils.getJSONArray(jSONObject, this.f49329a.s0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f49340l = listA;
                    for (k3 k3Var : listA) {
                        this.f49337i.put(k3Var.b(), k3Var);
                    }
                    long j2 = StringUtils.parseLong(this.f49329a.n0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    k5 k5Var = new k5(listA, activity, this.f49329a);
                    if (j2 > 0) {
                        this.f49329a.q0().a(k5Var, d6.b.MEDIATION, j2);
                    } else {
                        this.f49329a.q0().a(k5Var);
                    }
                } catch (JSONException e2) {
                    if (C1804o.a()) {
                        this.f49330b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e2);
                    }
                    l1.a((Throwable) e2);
                }
            }
        }
    }

    public JSONArray b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f49336h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f49334f);
        }
        return jSONArrayShallowCopy;
    }

    public boolean c() {
        return this.f49331c.get();
    }

    private void c(k3 k3Var) {
        String strB = k3Var.b();
        synchronized (this.f49333e) {
            try {
                if (this.f49332d.contains(strB)) {
                    return;
                }
                this.f49332d.add(strB);
                this.f49329a.P().d(d2.f48276c0, f2.a(k3Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public f(C1802k c1802k) {
        this.f49329a = c1802k;
        this.f49330b = c1802k.O();
    }

    boolean b(k3 k3Var) {
        boolean zContainsKey;
        synchronized (this.f49336h) {
            zContainsKey = this.f49335g.containsKey(k3Var.b());
        }
        return zContainsKey;
    }

    public com.applovin.impl.s4 a(k3 k3Var, Activity activity) {
        k3 k3VarA = a(k3Var);
        if (k3VarA == null) {
            return com.applovin.impl.s4.a("AdapterInitialization:" + k3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strB = k3Var.b();
        synchronized (this.f49339k) {
            try {
                com.applovin.impl.s4 s4Var = (com.applovin.impl.s4) this.f49338j.get(strB);
                if (s4Var != null) {
                    boolean z2 = false;
                    boolean z3 = k3VarA.q() && s4Var.e();
                    if (((Boolean) this.f49329a.a(x4.U6)).booleanValue() && s4Var.a()) {
                        z2 = true;
                    }
                    if (!z3 && !z2) {
                        return s4Var;
                    }
                }
                final com.applovin.impl.s4 s4Var2 = new com.applovin.impl.s4("AdapterInitialization:" + k3Var.c());
                this.f49338j.put(strB, s4Var2);
                h hVarA = this.f49329a.T().a(k3VarA);
                if (hVarA == null) {
                    s4Var2.a("Adapter implementation not found");
                    return s4Var2;
                }
                if (C1804o.a()) {
                    this.f49330b.d("MediationAdapterInitializationManager", "Initializing adapter " + k3VarA);
                }
                c(k3VarA);
                hVarA.a(MaxAdapterParametersImpl.a(k3VarA), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.Pl
                    @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                    public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                        f.a(s4Var2, initializationStatus, str);
                    }
                });
                i6.a(k3VarA.m(), s4Var2, "The adapter (" + k3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f49329a);
                return s4Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.s4 s4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                s4Var.a(str);
                return;
            } else {
                s4Var.b(initializationStatus);
                return;
            }
        }
        l1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        s4Var.a("Adapter reported INITIALIZING");
    }

    private k3 a(k3 k3Var) {
        List<k3> list;
        if (((Boolean) this.f49329a.a(r3.f49874v8)).booleanValue()) {
            k3 k3Var2 = (k3) this.f49337i.get(k3Var.b());
            return k3Var2 != null ? k3Var2 : k3Var;
        }
        if (!this.f49329a.s0().c() || (list = this.f49340l) == null) {
            return k3Var;
        }
        for (k3 k3Var3 : list) {
            if (k3Var3.b().equals(k3Var.b())) {
                return k3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f49336h) {
            num = (Integer) this.f49335g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f49336h) {
            hashSet = new HashSet(this.f49335g.keySet());
        }
        return hashSet;
    }

    void a(k3 k3Var, long j2, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean zB;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f49336h) {
            try {
                zB = b(k3Var);
                if (!zB) {
                    this.f49335g.put(k3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, k3Var.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j2);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f49334f.put(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zB) {
            return;
        }
        this.f49329a.a(k3Var);
        this.f49329a.X().processAdapterInitializationPostback(k3Var, j2, initializationStatus, str);
        this.f49329a.t().a(initializationStatus, k3Var.b());
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(new k3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), jSONObject, this.f49329a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f49336h) {
            this.f49335g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f49329a.t().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
