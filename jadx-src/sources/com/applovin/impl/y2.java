package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.arch.core.util.Function;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class y2 extends k3 implements MaxAd {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f50870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f50871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a3 f50872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected com.applovin.impl.mediation.h f50873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f50874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MaxAdWaterfallInfo f50875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f50876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f50877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f50878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f50879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f50880u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f50881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f50882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f50883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f50884y;

    public static y2 a(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, C1802k c1802k) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new b3(a3Var, jSONObject, jSONObject2, c1802k);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new d3(a3Var, jSONObject, jSONObject2, c1802k);
        }
        if (fromString.isFullscreenAd()) {
            return new c3(a3Var, jSONObject, jSONObject2, c1802k);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    public abstract y2 a(com.applovin.impl.mediation.h hVar);

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    private long J() {
        return a("load_started_time_ms", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("ad_values", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(h5 h5Var) {
        JSONObject jSONObjectA;
        if (h5Var.a("credentials")) {
            jSONObjectA = h5Var.a("credentials", new JSONObject());
        } else {
            jSONObjectA = h5Var.a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, R());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject d(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double e(h5 h5Var) {
        return Double.valueOf(JsonUtils.getDouble(h5Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject f(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("revenue_parameters", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(h5 h5Var) {
        return JsonUtils.getString(h5Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public com.applovin.impl.mediation.h A() {
        return this.f50873n;
    }

    public String B() {
        return a("bcode", "");
    }

    public String D() {
        return a("bid_response", (String) null);
    }

    public Bundle E() {
        JSONObject jSONObjectA;
        h5 h5Var = this.f48814h;
        if (h5Var != null) {
            return (Bundle) h5Var.a(new Function() { // from class: com.applovin.impl.JT
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f47751n.c((h5) obj);
                }
            });
        }
        if (c("credentials")) {
            jSONObjectA = a("credentials", new JSONObject());
        } else {
            jSONObjectA = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, R());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    public long F() {
        return this.f50882w;
    }

    public long H() {
        return this.f50880u;
    }

    public long I() {
        return a("load_completed_time_ms", 0L);
    }

    public String K() {
        return this.f50883x;
    }

    public int L() {
        return a("mspc", ((Integer) this.f48807a.a(r3.f49870g8)).intValue());
    }

    public JSONObject M() {
        h5 h5Var = this.f48814h;
        return h5Var != null ? (JSONObject) h5Var.a(new Function() { // from class: com.applovin.impl.hWw
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return y2.d((h5) obj);
            }
        }) : a("publisher_extra_info", new JSONObject());
    }

    public a3 N() {
        return this.f50872m;
    }

    public String O() {
        return JsonUtils.getString(P(), "revenue_event", "");
    }

    public JSONObject P() {
        h5 h5Var = this.f48814h;
        return h5Var != null ? (JSONObject) h5Var.a(new Function() { // from class: com.applovin.impl.FdJ
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return y2.f((h5) obj);
            }
        }) : a("revenue_parameters", new JSONObject());
    }

    public String Q() {
        return b("event_id", "");
    }

    public String R() {
        return a(BrandSafetyEvent.f62740k, (String) null);
    }

    public long S() {
        return this.f50881v;
    }

    public List T() {
        return b("mwf_info_urls");
    }

    public String U() {
        return b("waterfall_name", "");
    }

    public String V() {
        return b("waterfall_test_name", "");
    }

    public boolean X() {
        com.applovin.impl.mediation.h hVar = this.f50873n;
        return hVar != null && hVar.k() && this.f50873n.j();
    }

    public boolean Y() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean Z() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public void c0() {
        long totalBackgroundDurationMillis = this.f48807a.m0().getTotalBackgroundDurationMillis() - this.f50879t;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f50877r;
        this.f50881v = jElapsedRealtime;
        this.f50880u = jElapsedRealtime - totalBackgroundDurationMillis;
    }

    public Boolean g0() {
        return a(GDEJgAYrPQHfw.ReCXxbhsVg, (Boolean) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f50884y;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectX = x();
        if (jSONObjectX.has(str)) {
            return JsonUtils.getString(jSONObjectX, str, str2);
        }
        Bundle bundleL = l();
        if (bundleL.containsKey(str)) {
            return bundleL.getString(str);
        }
        JSONObject jSONObjectM = M();
        return jSONObjectM.has(str) ? JsonUtils.getString(jSONObjectM, str, str2) : a(str, str2);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.h hVar = this.f50873n;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a(BrandSafetyEvent.ad, "");
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f50876q;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f48807a.a(r3.l8)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            h5 h5Var = this.f48814h;
            return h5Var != null ? ((Double) h5Var.a(new Function() { // from class: com.applovin.impl.ca
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return y2.e((h5) obj);
                }
            })).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f48807a.O();
        if (!C1804o.a()) {
            return 0.0d;
        }
        this.f48807a.O().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        h5 h5Var = this.f48814h;
        return h5Var != null ? (String) h5Var.a(new Function() { // from class: com.applovin.impl.xMz
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return y2.g((h5) obj);
            }
        }) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iA = a("ad_width", -3);
        int iA2 = a("ad_height", -3);
        return (iA == -3 || iA2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(iA, iA2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f50875p;
    }

    public void h(String str) {
        this.f50884y = str;
    }

    public Boolean h0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public void i(String str) {
        this.f50883x = str;
    }

    public Boolean i0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    public void t() {
        this.f50873n = null;
        this.f50875p = null;
    }

    @Override // com.applovin.impl.k3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + R() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public AtomicBoolean u() {
        return this.f50870k;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.f50871l;
    }

    public JSONObject x() {
        h5 h5Var = this.f48814h;
        return h5Var != null ? (JSONObject) h5Var.a(new Function() { // from class: com.applovin.impl.QGL
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return y2.b((h5) obj);
            }
        }) : a("ad_values", new JSONObject());
    }

    public String z() {
        return this.f50874o;
    }

    protected y2(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, C1802k c1802k) {
        String strB;
        super(a3Var.e(), jSONObject, jSONObject2, c1802k);
        this.f50870k = new AtomicBoolean();
        this.f50871l = new AtomicBoolean();
        this.f50872m = a3Var;
        this.f50873n = hVar;
        if (hVar != null) {
            strB = hVar.b();
        } else {
            strB = null;
        }
        this.f50874o = strB;
    }

    public long C() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public long G() {
        if (J() > 0) {
            return I() - J();
        }
        return -1L;
    }

    public boolean W() {
        return StringUtils.isValidString(D());
    }

    public void a0() {
        this.f50882w = SystemClock.elapsedRealtime() - this.f50878s;
    }

    public void b0() {
        this.f50877r = SystemClock.elapsedRealtime();
        this.f50879t = this.f48807a.m0().getTotalBackgroundDurationMillis();
    }

    public void d0() {
        this.f50878s = SystemClock.elapsedRealtime();
    }

    public void e0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void f0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(R());
    }

    public View y() {
        com.applovin.impl.mediation.h hVar;
        if (X() && (hVar = this.f50873n) != null) {
            return hVar.d();
        }
        return null;
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f50875p = maxAdWaterfallInfo;
    }

    public void a(long j2) {
        this.f50876q = j2;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectM = M();
        JsonUtils.putAll(jSONObjectM, jSONObject);
        a("publisher_extra_info", (Object) jSONObjectM);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i2 = BundleUtils.getInt("ad_width", bundle);
            int i3 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i2);
            c("ad_height", i3);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
