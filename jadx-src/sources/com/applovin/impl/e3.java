package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class e3 implements Comparable, AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final List f48424A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final List f48425B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final List f48426C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final List f48427D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Map f48428E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f48429F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final a7 f48430G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f48431H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final String f48432I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Map f48433J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f48435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f48437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f48438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f48439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f48440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f48442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f48443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f48444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f48445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f48446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f48447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f48448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f48449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f48450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f48451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f48452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f48453t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f48454u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f48455v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f48456w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f48457x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f48458y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f48459z;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48465a;

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f48465a;
        }

        a(String str) {
            this.f48465a = str;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f48474c;

        public String b() {
            return this.f48474c;
        }

        public String c() {
            return this.f48472a;
        }

        public int d() {
            return this.f48473b;
        }

        b(String str, int i2, String str2) {
            this.f48472a = str;
            this.f48473b = i2;
            this.f48474c = str2;
        }
    }

    private a a() {
        a aVar = this.f48437d ? this.f48438e ? a.COMPLETE : this.f48440g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.f48438e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f48459z.iterator();
        while (it.hasNext()) {
            if (!((p4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.f48424A.iterator();
        while (it2.hasNext()) {
            if (!((k1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f48448o || C1802k.F0()) ? E() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ca  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e3(JSONObject jSONObject, C1802k c1802k) {
        String adapterVersion;
        String strA;
        String str;
        boolean zEquals;
        boolean z2;
        boolean z3;
        Integer numA;
        JSONObject jSONObject2;
        String string;
        String string2;
        String str2;
        boolean zIsBeta;
        boolean z4;
        String str3;
        this.f48434a = c1802k;
        String string3 = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.f48449p = string3;
        this.f48450q = JsonUtils.getString(jSONObject, "display_name", "");
        this.f48451r = JsonUtils.getString(jSONObject, "adapter_class", "");
        this.f48454u = JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.f48425B = a(jSONObject);
        Boolean bool = Boolean.FALSE;
        this.f48444k = JsonUtils.getBoolean(jSONObject, "hide_if_missing", bool).booleanValue();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, com.safedk.android.utils.j.f63190c, new JSONObject());
        this.f48459z = a(jSONObject3, c1802k);
        this.f48448o = JsonUtils.getBoolean(jSONObject3, "java_8_required", bool).booleanValue();
        this.f48429F = JsonUtils.getBoolean(jSONObject3, "hide_initialization_status", bool).booleanValue();
        this.f48447n = JsonUtils.getBoolean(jSONObject3, "check_sdk_adapter_version_mismatch", Boolean.TRUE).booleanValue();
        this.f48426C = JsonUtils.getList(jSONObject3, "live_network_filtering_names", null);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "test_mode", new JSONObject());
        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "network_names", (JSONObject) null);
        if (jSONObject5 == null || jSONObject5.length() <= 0) {
            this.f48427D = Arrays.asList(string3);
            this.f48428E = null;
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(string3));
            HashMap map = new HashMap(jSONObject5.length());
            Iterator<String> itKeys = jSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                MaxAdFormat fromString = MaxAdFormat.formatFromString(next);
                String string4 = JsonUtils.getString(jSONObject5, next, null);
                if (fromString != null && !TextUtils.isEmpty(string4)) {
                    arrayList.add(string4);
                    map.put(fromString, string4);
                }
            }
            this.f48427D = arrayList;
            this.f48428E = map;
        }
        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject, "test_mode", new JSONObject());
        Boolean bool2 = Boolean.TRUE;
        this.f48442i = JsonUtils.getBoolean(jSONObject6, "supported", bool2).booleanValue();
        this.f48443j = JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", Boolean.FALSE).booleanValue();
        this.f48455v = JsonUtils.getString(jSONObject6, "message", null);
        this.f48430G = new a7(JsonUtils.getJSONObject(jSONObject3, "tcf_config"), this.f48450q);
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f48437d = n7.a(list);
        } else {
            this.f48437d = n7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
        List listA = Collections.EMPTY_LIST;
        String str4 = this.f48451r;
        String string5 = JsonUtils.getString(jSONObject3, "init_adapter_class", null);
        if (string5 != null) {
            this.f48451r = string5;
        }
        MaxAdapter maxAdapterA = w3.a(str4, c1802k);
        if (maxAdapterA != null) {
            this.f48438e = true;
            try {
                adapterVersion = maxAdapterA.getAdapterVersion();
                try {
                    strA = w3.a(maxAdapterA);
                    try {
                        this.f48441h = w3.a(maxAdapterA, this.f48451r);
                        listA = a(maxAdapterA, JsonUtils.getBoolean(jSONObject4, "is_mrec_supported", bool2).booleanValue());
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject3, "native_ad_view_config", (JSONObject) null);
                        if (jSONObject7 != null) {
                            String string6 = JsonUtils.getString(jSONObject7, "min_adapter_version", null);
                            if (string6 != null) {
                                z3 = n7.a(adapterVersion, string6) >= 0;
                                try {
                                    string2 = JsonUtils.getString(jSONObject7, BrandSafetyEvent.ad, null);
                                } catch (Throwable th) {
                                    th = th;
                                    string2 = null;
                                    C1804o.h("MediatedNetwork", "Failed to load adapter for network " + this.f48449p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                    str2 = string2;
                                    zIsBeta = false;
                                    Class<?> cls = Class.forName(this.f48451r);
                                    z4 = zIsBeta;
                                    str3 = str2;
                                    try {
                                        zEquals = cls.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls);
                                        z2 = z4;
                                        str = str3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c1802k.O();
                                        if (C1804o.a()) {
                                            c1802k.O().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th);
                                        }
                                        z2 = z4;
                                        str = str3;
                                        zEquals = false;
                                    }
                                    this.f48453t = adapterVersion;
                                    this.f48452s = strA;
                                    this.f48458y = listA;
                                    this.f48445l = zEquals;
                                    this.f48446m = z3;
                                    this.f48456w = str;
                                    this.f48424A = a(jSONObject3, adapterVersion, c1802k);
                                    this.f48440g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                                    this.f48435b = a();
                                    this.f48439f = (adapterVersion.equals(this.f48454u) || z2) ? false : true;
                                    Context contextO = C1802k.o();
                                    int iLastIndexOf = this.f48449p.lastIndexOf("_");
                                    if (iLastIndexOf != -1) {
                                    }
                                    this.f48457x = contextO.getResources().getIdentifier("applovin_ic_mediation_" + strSubstring, "drawable", contextO.getPackageName());
                                    this.f48436c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                                    AppLovinCommunicator.getInstance(contextO).subscribe(this, "adapter_initialization_status");
                                    numA = c1802k.S().a(this.f48451r);
                                    if (numA != null) {
                                    }
                                    jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                                    if (jSONObject2 != null) {
                                    }
                                    this.f48431H = false;
                                    this.f48432I = null;
                                    this.f48433J = null;
                                    return;
                                }
                            }
                        } else {
                            string2 = null;
                            z3 = false;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        string2 = null;
                        z3 = false;
                        C1804o.h("MediatedNetwork", "Failed to load adapter for network " + this.f48449p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        str2 = string2;
                        zIsBeta = false;
                        Class<?> cls2 = Class.forName(this.f48451r);
                        z4 = zIsBeta;
                        str3 = str2;
                        zEquals = cls2.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls2);
                        z2 = z4;
                        str = str3;
                        this.f48453t = adapterVersion;
                        this.f48452s = strA;
                        this.f48458y = listA;
                        this.f48445l = zEquals;
                        this.f48446m = z3;
                        this.f48456w = str;
                        this.f48424A = a(jSONObject3, adapterVersion, c1802k);
                        this.f48440g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                        this.f48435b = a();
                        this.f48439f = (adapterVersion.equals(this.f48454u) || z2) ? false : true;
                        Context contextO2 = C1802k.o();
                        int iLastIndexOf2 = this.f48449p.lastIndexOf("_");
                        if (iLastIndexOf2 != -1) {
                        }
                        this.f48457x = contextO2.getResources().getIdentifier("applovin_ic_mediation_" + strSubstring, "drawable", contextO2.getPackageName());
                        this.f48436c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                        AppLovinCommunicator.getInstance(contextO2).subscribe(this, "adapter_initialization_status");
                        numA = c1802k.S().a(this.f48451r);
                        if (numA != null) {
                        }
                        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                        if (jSONObject2 != null) {
                        }
                        this.f48431H = false;
                        this.f48432I = null;
                        this.f48433J = null;
                        return;
                    }
                    try {
                        str2 = string2;
                        zIsBeta = maxAdapterA.isBeta();
                    } catch (Throwable th4) {
                        th = th4;
                        C1804o.h("MediatedNetwork", "Failed to load adapter for network " + this.f48449p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        str2 = string2;
                        zIsBeta = false;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    strA = "";
                }
            } catch (Throwable th6) {
                th = th6;
                adapterVersion = "";
                strA = adapterVersion;
            }
            try {
                Class<?> cls22 = Class.forName(this.f48451r);
                z4 = zIsBeta;
                str3 = str2;
                zEquals = cls22.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls22);
                z2 = z4;
                str = str3;
            } catch (Throwable th7) {
                th = th7;
                z4 = zIsBeta;
                str3 = str2;
            }
        } else {
            this.f48438e = false;
            adapterVersion = "";
            strA = adapterVersion;
            str = null;
            zEquals = false;
            z2 = false;
            z3 = false;
        }
        this.f48453t = adapterVersion;
        this.f48452s = strA;
        this.f48458y = listA;
        this.f48445l = zEquals;
        this.f48446m = z3;
        this.f48456w = str;
        this.f48424A = a(jSONObject3, adapterVersion, c1802k);
        this.f48440g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
        this.f48435b = a();
        this.f48439f = (adapterVersion.equals(this.f48454u) || z2) ? false : true;
        Context contextO22 = C1802k.o();
        int iLastIndexOf22 = this.f48449p.lastIndexOf("_");
        String strSubstring = iLastIndexOf22 != -1 ? this.f48449p.toLowerCase().substring(0, iLastIndexOf22) : this.f48449p.toLowerCase();
        this.f48457x = contextO22.getResources().getIdentifier("applovin_ic_mediation_" + strSubstring, "drawable", contextO22.getPackageName());
        this.f48436c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        AppLovinCommunicator.getInstance(contextO22).subscribe(this, "adapter_initialization_status");
        numA = c1802k.S().a(this.f48451r);
        if (numA != null) {
            this.f48436c = numA.intValue();
        }
        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
        if (jSONObject2 != null || !this.f48437d) {
            this.f48431H = false;
            this.f48432I = null;
            this.f48433J = null;
            return;
        }
        this.f48431H = true;
        this.f48432I = JsonUtils.getString(jSONObject2, "test_mode_app_id", null);
        JSONObject jSONObject8 = JsonUtils.getJSONObject(jSONObject2, "test_mode_slot_ids", new JSONObject());
        HashMap map2 = new HashMap(jSONObject8.length());
        Iterator<String> itKeys2 = jSONObject8.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            MaxAdFormat fromString2 = MaxAdFormat.formatFromString(next2);
            JSONObject jSONObject9 = JsonUtils.getJSONObject(jSONObject8, next2, (JSONObject) null);
            if (fromString2 != null && jSONObject9 != null && (string = JsonUtils.getString(jSONObject9, QiDPjiOCZHDS.nvgB, null)) != null) {
                map2.put(fromString2, new x(string, jSONObject9, fromString2));
            }
        }
        this.f48433J = map2;
    }

    public boolean A() {
        return this.f48439f;
    }

    public boolean B() {
        return this.f48441h;
    }

    public boolean C() {
        return this.f48431H;
    }

    public boolean D() {
        return this.f48448o;
    }

    public boolean E() {
        if (!this.f48447n || !StringUtils.isValidString(this.f48452s)) {
            return false;
        }
        return !n7.d(this.f48452s).equals(n7.a(this.f48453t, this.f48452s.split("\\.").length));
    }

    public boolean F() {
        return this.f48437d;
    }

    public boolean G() {
        return this.f48435b == a.MISSING && this.f48444k;
    }

    public boolean H() {
        return this.f48429F;
    }

    public boolean I() {
        return this.f48445l;
    }

    public boolean J() {
        return this.f48446m;
    }

    public String b() {
        return this.f48451r;
    }

    public String c() {
        return this.f48453t;
    }

    public Map d() {
        return this.f48433J;
    }

    public String e() {
        return this.f48432I;
    }

    public List f() {
        return this.f48424A;
    }

    public String g() {
        return this.f48450q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f48457x;
    }

    public int i() {
        return this.f48436c;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.f48449p);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(this.f48435b.b());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f48437d || TextUtils.isEmpty(this.f48452s)) ? "UNAVAILABLE" : this.f48452s);
        sb.append("\nAdapter - ");
        if (this.f48438e && !TextUtils.isEmpty(this.f48453t)) {
            str = this.f48453t;
        }
        sb.append(str);
        for (p4 p4Var : n()) {
            if (!p4Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(p4Var.b());
                sb.append(": ");
                sb.append(p4Var.a());
            }
        }
        for (k1 k1Var : f()) {
            if (!k1Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(k1Var.b());
                sb.append(": ");
                sb.append(k1Var.a());
            }
        }
        return sb.toString();
    }

    public String k() {
        return this.f48454u;
    }

    public List l() {
        return this.f48426C;
    }

    public String m() {
        return this.f48449p;
    }

    public List n() {
        return this.f48459z;
    }

    public final C1802k o() {
        return this.f48434a;
    }

    public String p() {
        return this.f48452s;
    }

    public a q() {
        return this.f48435b;
    }

    public List r() {
        return this.f48458y;
    }

    public List s() {
        return this.f48425B;
    }

    public a7 t() {
        return this.f48430G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f48449p + ", displayName=" + this.f48450q + ", sdkAvailable=" + this.f48437d + ", sdkVersion=" + this.f48452s + ", adapterAvailable=" + this.f48438e + ", adapterVersion=" + this.f48453t + "}";
    }

    public List u() {
        return this.f48427D;
    }

    public String v() {
        return this.f48455v;
    }

    public String w() {
        return this.f48456w;
    }

    public Map x() {
        return this.f48428E;
    }

    public b y() {
        if (!this.f48442i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f48435b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && F() && z())) ? !this.f48434a.s0().c() ? b.DISABLED : (this.f48443j && (this.f48436c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f48436c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.f48438e;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f48451r.equals(string)) {
            this.f48436c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = w3.a(string, this.f48434a);
            if (maxAdapterA != null) {
                String strA = w3.a(maxAdapterA);
                if (!this.f48452s.equals(strA)) {
                    this.f48452s = strA;
                    this.f48434a.t().a(this.f48452s, string);
                }
            }
        }
    }

    private List a(MaxAdapter maxAdapter, boolean z2) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z2) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, C1802k c1802k) {
        ArrayList arrayList = new ArrayList();
        if (this.f48451r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            p4 p4Var = new p4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", C1802k.o());
            if (p4Var.c()) {
                arrayList.add(p4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new p4(next, jSONObject2.getString(next), C1802k.o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, C1802k c1802k) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new k1(jSONObject2, c1802k));
            }
        }
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i3, (JSONObject) null);
            if (jSONObject3 != null && k1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new k1(jSONObject3, c1802k));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e3 e3Var) {
        return this.f48450q.compareToIgnoreCase(e3Var.f48450q);
    }
}
