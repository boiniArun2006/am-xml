package com.applovin.impl;

import android.os.Bundle;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1802k f48807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f48808b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f48810d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f48812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h5 f48813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final h5 f48814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f48815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f48816j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f48809c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Object f48811e = new Object();

    protected JSONObject a() {
        JSONObject jSONObject;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f48811e) {
            jSONObject = this.f48810d;
        }
        return jSONObject;
    }

    protected Boolean b(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f48813g;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f48809c) {
            bool2 = JsonUtils.getBoolean(this.f48808b, str, bool);
        }
        return bool2;
    }

    protected boolean c(String str) {
        boolean zHas;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f48811e) {
            zHas = this.f48810d.has(str);
        }
        return zHas;
    }

    protected boolean d(String str) {
        boolean zHas;
        h5 h5Var = this.f48813g;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f48809c) {
            zHas = this.f48808b.has(str);
        }
        return zHas;
    }

    protected Object e(String str) {
        Object objOpt;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return h5Var.b(str);
        }
        synchronized (this.f48811e) {
            objOpt = this.f48810d.opt(str);
        }
        return objOpt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        h5 h5Var = this.f48813g;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f48809c) {
            jSONObject = this.f48808b;
        }
        return jSONObject;
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f48807a.a(r3.b8)).intValue()));
    }

    public void f(String str) {
        this.f48816j = str;
    }

    public String getAdUnitId() {
        return b(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, "");
    }

    public String getPlacement() {
        return this.f48815i;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public Map i() {
        return this.f48812f;
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            h5 h5Var = this.f48814h;
            bundle = h5Var != null ? (Bundle) h5Var.a(new Function() { // from class: com.applovin.impl.crp
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return k3.a((h5) obj);
                }
            }) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f48807a.n0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, b(AppLovinEventParameters.REVENUE_AMOUNT, 0L));
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_CURRENCY)) {
            bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, b(AppLovinEventParameters.REVENUE_CURRENCY, ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f48807a.a(r3.x7)).longValue());
    }

    public Boolean n() {
        String str = this.f48807a.n0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f48807a.n0().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return jhotmBbwMbr.nEcMEqIpq + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public k3(Map map, JSONObject jSONObject, JSONObject jSONObject2, C1802k c1802k) {
        if (c1802k != null) {
            if (jSONObject2 != null) {
                if (jSONObject != null) {
                    this.f48807a = c1802k;
                    if (((Boolean) c1802k.a(x4.f50755C6)).booleanValue()) {
                        this.f48813g = new h5(jSONObject2);
                        this.f48814h = new h5(jSONObject);
                        this.f48808b = null;
                        this.f48810d = null;
                    } else {
                        this.f48808b = jSONObject2;
                        this.f48810d = jSONObject;
                        this.f48813g = null;
                        this.f48814h = null;
                    }
                    this.f48812f = map;
                    return;
                }
                throw new IllegalArgumentException("No ad object specified");
            }
            throw new IllegalArgumentException("No full response specified");
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public String k() {
        return c().split("_")[0];
    }

    protected Boolean a(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f48811e) {
            bool2 = JsonUtils.getBoolean(this.f48810d, str, bool);
        }
        return bool2;
    }

    protected int b(String str, int i2) {
        int i3;
        h5 h5Var = this.f48813g;
        if (h5Var != null) {
            return h5Var.a(str, i2);
        }
        synchronized (this.f48809c) {
            i3 = JsonUtils.getInt(this.f48808b, str, i2);
        }
        return i3;
    }

    protected void c(String str, int i2) {
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            h5Var.b(str, i2);
            return;
        }
        synchronized (this.f48811e) {
            JsonUtils.putInt(this.f48810d, str, i2);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f48807a.r0().j();
    }

    public String e() {
        return this.f48816j;
    }

    public void g(String str) {
        this.f48815i = str;
    }

    protected float a(String str, float f3) {
        float f4;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return h5Var.a(str, f3);
        }
        synchronized (this.f48811e) {
            f4 = JsonUtils.getFloat(this.f48810d, str, f3);
        }
        return f4;
    }

    protected JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f48813g;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f48809c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f48808b, str, jSONArray);
        }
        return jSONArray2;
    }

    protected void c(String str, long j2) {
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            h5Var.b(str, j2);
            return;
        }
        synchronized (this.f48811e) {
            JsonUtils.putLong(this.f48810d, str, j2);
        }
    }

    protected int a(String str, int i2) {
        int i3;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return h5Var.a(str, i2);
        }
        synchronized (this.f48811e) {
            i3 = JsonUtils.getInt(this.f48810d, str, i2);
        }
        return i3;
    }

    protected long b(String str, long j2) {
        long j3;
        h5 h5Var = this.f48813g;
        if (h5Var != null) {
            return h5Var.a(str, j2);
        }
        synchronized (this.f48809c) {
            j3 = JsonUtils.getLong(this.f48808b, str, j2);
        }
        return j3;
    }

    protected void c(String str, String str2) {
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            h5Var.b(str, str2);
            return;
        }
        synchronized (this.f48811e) {
            JsonUtils.putString(this.f48810d, str, str2);
        }
    }

    protected JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f48811e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f48810d, str, jSONArray);
        }
        return jSONArray2;
    }

    protected String b(String str, String str2) {
        String string;
        h5 h5Var = this.f48813g;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f48809c) {
            string = JsonUtils.getString(this.f48808b, str, str2);
        }
        return string;
    }

    public String c() {
        return a(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) null);
    }

    protected JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return h5Var.a(str, jSONObject);
        }
        synchronized (this.f48811e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f48810d, str, jSONObject);
        }
        return jSONObject2;
    }

    public String b() {
        return a(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, (String) null);
    }

    public List b(String str) {
        List listOptList;
        List listOptList2;
        if (str != null) {
            h5 h5Var = this.f48813g;
            if (h5Var != null) {
                listOptList = h5Var.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            h5 h5Var2 = this.f48814h;
            if (h5Var2 != null) {
                listOptList2 = h5Var2.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            ArrayList arrayList = new ArrayList(listOptList.size() + listOptList2.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    protected long a(String str, long j2) {
        long j3;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return h5Var.a(str, j2);
        }
        synchronized (this.f48811e) {
            j3 = JsonUtils.getLong(this.f48810d, str, j2);
        }
        return j3;
    }

    protected String a(String str, String str2) {
        String string;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f48811e) {
            string = JsonUtils.getString(this.f48810d, str, str2);
        }
        return string;
    }

    protected void a(String str, Object obj) {
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            h5Var.a(str, obj);
            return;
        }
        synchronized (this.f48811e) {
            JsonUtils.putObject(this.f48810d, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(h5 h5Var) {
        return JsonUtils.toBundle(h5Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }
}
