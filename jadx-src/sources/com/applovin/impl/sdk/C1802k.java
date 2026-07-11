package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1773c;
import com.applovin.impl.C1784j;
import com.applovin.impl.C1797r6;
import com.applovin.impl.a5;
import com.applovin.impl.c4;
import com.applovin.impl.c6;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e1;
import com.applovin.impl.f1;
import com.applovin.impl.f7;
import com.applovin.impl.h8;
import com.applovin.impl.j1;
import com.applovin.impl.j4;
import com.applovin.impl.k2;
import com.applovin.impl.k3;
import com.applovin.impl.l3;
import com.applovin.impl.l7;
import com.applovin.impl.l8;
import com.applovin.impl.m7;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n7;
import com.applovin.impl.o2;
import com.applovin.impl.p3;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.q0;
import com.applovin.impl.r0;
import com.applovin.impl.r1;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t5;
import com.applovin.impl.u0;
import com.applovin.impl.u3;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.w4;
import com.applovin.impl.x4;
import com.applovin.impl.y3;
import com.applovin.impl.y4;
import com.applovin.impl.z2;
import com.applovin.impl.z4;
import com.applovin.impl.z6;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C1802k {
    public static C1802k C0;
    protected static Context D0;
    private static boolean E0;
    private static final boolean G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private static volatile C1773c f50208H0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f50237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f50239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f50240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f50241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f50242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f50244h;
    private com.applovin.impl.mediation.e i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinSdkSettings f50246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxSegmentCollection f50247k;
    private List k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f50248l;
    private boolean p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile AppLovinSdk f50254q;
    private String u0;
    private AppLovinSdkInitializationConfiguration v0;
    private AppLovinSdk.SdkInitializationListener y0;
    private AppLovinSdk.SdkInitializationListener z0;
    private static final Object I0 = new Object();
    private static final long F0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f50245i = new AtomicBoolean();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicReference f50250m = new AtomicReference();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f50251n = new AtomicReference();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicReference f50252o = new AtomicReference();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicReference f50253p = new AtomicReference();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1804o f50255r = new C1804o(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.applovin.impl.f f50257s = new com.applovin.impl.f(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z2 f50258t = new z2(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final r1 f50259u = new r1(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final l7 f50260v = new l7(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f50261w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicReference f50262x = new AtomicReference();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicReference f50264y = new AtomicReference();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicReference f50265z = new AtomicReference();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final AtomicReference f50209A = new AtomicReference();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final AtomicReference f50210B = new AtomicReference();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final AtomicReference f50211C = new AtomicReference();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final AtomicReference f50212D = new AtomicReference();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final AtomicReference f50213E = new AtomicReference();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final AtomicReference f50214F = new AtomicReference();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final AtomicReference f50215G = new AtomicReference();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final AtomicReference f50216H = new AtomicReference();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final AtomicReference f50217I = new AtomicReference();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final AtomicReference f50218J = new AtomicReference();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final AtomicReference f50219K = new AtomicReference();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final AtomicReference f50220L = new AtomicReference();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final AtomicReference f50221M = new AtomicReference();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final AtomicReference f50222N = new AtomicReference();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AtomicReference f50223O = new AtomicReference();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final AtomicReference f50224P = new AtomicReference();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final AtomicReference f50225Q = new AtomicReference();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final AtomicReference f50226R = new AtomicReference();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final AtomicReference f50227S = new AtomicReference();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final AtomicReference f50228T = new AtomicReference();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final AtomicReference f50229U = new AtomicReference();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final AtomicReference f50230V = new AtomicReference();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final AtomicReference f50231W = new AtomicReference();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final AtomicReference f50232X = new AtomicReference();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final AtomicReference f50233Y = new AtomicReference();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final AtomicReference f50234Z = new AtomicReference();
    private final AtomicReference a0 = new AtomicReference();
    private final AtomicReference b0 = new AtomicReference();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final AtomicReference f50238c0 = new AtomicReference();
    private final AtomicReference d0 = new AtomicReference();
    private final AtomicReference e0 = new AtomicReference();
    private final AtomicReference f0 = new AtomicReference();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final AtomicReference f50243g0 = new AtomicReference();
    private final AtomicReference h0 = new AtomicReference();
    private final AtomicReference j0 = new AtomicReference();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final Object f50249l0 = new Object();
    private final AtomicBoolean m0 = new AtomicBoolean(true);
    private final AtomicBoolean n0 = new AtomicBoolean();
    private final AtomicBoolean o0 = new AtomicBoolean();
    private boolean q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f50256r0 = false;
    private boolean s0 = false;
    private int t0 = 0;
    private final Object w0 = new Object();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private SdkConfigurationImpl f50263x0 = new SdkConfigurationImpl(this);
    private final AbstractRunnableC1782i5 A0 = new C1797r6(this, true, "scheduleAdLoadIntegrationError", new Runnable() { // from class: com.applovin.impl.sdk.Z
        @Override // java.lang.Runnable
        public final void run() {
            this.f50055n.K0();
        }
    });
    private final AbstractRunnableC1782i5 B0 = new C1797r6(this, true, "sdkInit", new Runnable() { // from class: com.applovin.impl.sdk.Ew
        @Override // java.lang.Runnable
        public final void run() {
            this.f50007n.L0();
        }
    });

    /* JADX INFO: renamed from: com.applovin.impl.sdk.k$a */
    class a implements t5.b {
        a() {
        }

        @Override // com.applovin.impl.t5.b
        public void a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            C1802k.this.c(jSONObject);
            if (((Boolean) C1802k.this.a(r3.e8)).booleanValue()) {
                C1802k c1802k = C1802k.this;
                c1802k.i0 = new com.applovin.impl.mediation.e(c1802k);
            }
            C1802k.this.m().a();
            r0.a(jSONObject, zIsValid, C1802k.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            C1802k.this.U().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            C1802k.this.D().b();
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(l.J()));
            JsonUtils.putBoolean(jSONObject2, "init_success", zIsValid);
            JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(C1802k.D0).getAll().size());
            C1802k.this.v0().d(d2.f48279f, CollectionUtils.map("details", jSONObject2.toString()));
            C1802k c1802k2 = C1802k.this;
            c1802k2.k0 = c1802k2.a(jSONObject);
            if (zIsValid) {
                C1802k.this.f50263x0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            C1802k.this.s0().a(jSONObject);
            C1802k.this.b(jSONObject);
            t2.b(((Boolean) C1802k.this.a(x4.w6)).booleanValue());
            t2.a(((Boolean) C1802k.this.a(x4.x6)).booleanValue());
            C1802k.this.P0();
            if (!((Boolean) C1802k.this.a(x4.f50814d3)).booleanValue() || zIsValid || !r0.a(C1802k.o())) {
                C1802k.this.N0();
                return;
            }
            C1802k.this.O();
            if (C1804o.a()) {
                C1802k.this.O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            C1802k.this.S0();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.k$b */
    class b implements u0.c {
        b() {
        }

        @Override // com.applovin.impl.u0.c
        public void a(u0.b bVar) {
            C1802k.this.O();
            if (C1804o.a()) {
                C1802k.this.O().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            C1802k.this.o0.set(bVar.b());
            if (!bVar.a()) {
                C1802k.this.c("Initializing SDK in MAX environment...");
                return;
            }
            C1802k.this.O();
            if (C1804o.a()) {
                C1802k.this.O().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            C1802k.this.R0();
            C1802k.this.Q0();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.k$c */
    class c implements t5.b {
        c() {
        }

        @Override // com.applovin.impl.t5.b
        public void a(JSONObject jSONObject) {
            C1802k.this.c(jSONObject);
            C1802k.this.f50245i.set(false);
            C1802k.this.N0();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.k$d */
    class d implements y3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y3 f50269a;

        @Override // com.applovin.impl.y3.a
        public void b() {
        }

        d(y3 y3Var) {
            this.f50269a = y3Var;
        }

        @Override // com.applovin.impl.y3.a
        public void a() {
            C1802k.this.O();
            if (C1804o.a()) {
                C1802k.this.O().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (C1802k.this.f50249l0) {
                try {
                    if (!C1802k.this.p0) {
                        C1802k.this.R0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f50269a.b(this);
        }
    }

    protected void M0() {
        b(false);
    }

    public void W0() {
        a((Map) null);
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.r
                @Override // java.lang.Runnable
                public final void run() {
                    n7.c();
                }
            });
            G0 = true;
        } catch (Throwable unused) {
            G0 = false;
        }
    }

    private void A0() {
        Context context = D0;
        C1804o c1804oO = O();
        a5 a5VarP0 = p0();
        u0 u0VarX = x();
        a(context);
        m0();
        j();
        c0();
        S().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f50235a;
        if (str == null || str.length() != 86) {
            C1804o.h("AppLovinSdk", "SDK key provided is invalid (" + this.f50235a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f50236b) && this.f50236b.length() != 36) {
            String str2 = "Axon event key length " + this.f50236b + " is invalid - expected 36";
            if (n7.c(this)) {
                throw new IllegalArgumentException(str2);
            }
            C1804o.h("AppLovinSdk", str2);
        }
        if (u0VarX.l()) {
            String str3 = "Terms Flow has been replaced. " + u0VarX.g();
            if (n7.c(this)) {
                throw new IllegalStateException(str3);
            }
            C1804o.h("AppLovinSdk", str3);
        }
        if (n7.j()) {
            C1804o.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!n7.b(this)) {
            C1804o.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (n7.m(context)) {
            this.f50246j.setVerboseLogging(true);
        }
        o0().a(x4.f50826k, Boolean.valueOf(this.f50246j.isVerboseLoggingEnabled()));
        w3.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        z4 z4Var = z4.f51000c;
        if (TextUtils.isEmpty((String) a5VarP0.a(z4Var, (Object) null, defaultSharedPreferences))) {
            this.f50256r0 = true;
            a5VarP0.b(z4Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            a5VarP0.b(z4Var, Boolean.toString(false), defaultSharedPreferences);
        }
        z4 z4Var2 = z4.f51001d;
        if (((Boolean) a5VarP0.a(z4Var2, Boolean.FALSE)).booleanValue()) {
            if (C1804o.a()) {
                c1804oO.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.s0 = true;
        } else {
            if (C1804o.a()) {
                c1804oO.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            a5VarP0.b(z4Var2, Boolean.TRUE);
            a5VarP0.b(z4.f51017t, Boolean.valueOf(u0VarX.j()));
        }
        z4 z4Var3 = z4.f51002e;
        this.f50241f = ((Long) a5VarP0.a(z4Var3, 0L)).longValue() + 1;
        p0().b(z4Var3, Long.valueOf(this.f50241f));
        z4 z4Var4 = z4.f51003f;
        this.f50242g = (Long) a5VarP0.a(z4Var4, null);
        p0().b(z4Var4, Long.valueOf(F0));
        z4 z4Var5 = z4.f51004g;
        String str4 = (String) a5VarP0.a(z4Var5, null);
        if (StringUtils.isValidString(str4)) {
            if (AppLovinSdk.VERSION_CODE > n7.g(str4)) {
                a5VarP0.b(z4Var5, AppLovinSdk.VERSION);
            }
        } else {
            a5VarP0.b(z4Var5, AppLovinSdk.VERSION);
        }
        v0().d(d2.f48278e, CollectionUtils.map("details", "isInitProviderContextSet=" + E0));
    }

    public static boolean F0() {
        return G0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        synchronized (this.f50249l0) {
            try {
                boolean zA = r0.a(o());
                if (!G0()) {
                    O();
                    if (C1804o.a()) {
                        O().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + V());
                    }
                }
                if (!((Boolean) a(x4.e3)).booleanValue() || zA) {
                    R0();
                }
                if (((Boolean) a(x4.f50814d3)).booleanValue() && !zA) {
                    O();
                    if (C1804o.a()) {
                        O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    S0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        Long l2 = (Long) a(x4.m3);
        if (l2.longValue() >= 0 && this.f50245i.compareAndSet(false, true)) {
            h8.a(l2.longValue(), false, this, new Runnable() { // from class: com.applovin.impl.sdk.afx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50122n.J0();
                }
            });
        }
    }

    private Map W() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(x4.f50823i4)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private void d() {
        d6 d6VarQ0 = q0();
        int i2 = this.t0 + 1;
        this.t0 = i2;
        d6VarQ0.a((AbstractRunnableC1782i5) new t5(i2, this, new a()), d6.b.CORE);
    }

    public static long n() {
        return F0;
    }

    public static Context o() {
        return D0;
    }

    public l A() {
        Object lVar = this.f50209A.get();
        if (lVar == null) {
            synchronized (this.f50209A) {
                try {
                    lVar = this.f50209A.get();
                    if (lVar == null) {
                        lVar = new l(this);
                        this.f50209A.set(lVar);
                    }
                } finally {
                }
            }
        }
        if (lVar == this.f50209A) {
            lVar = null;
        }
        return (l) lVar;
    }

    public j1 B() {
        Object j1Var = this.f50212D.get();
        if (j1Var == null) {
            synchronized (this.f50212D) {
                try {
                    j1Var = this.f50212D.get();
                    if (j1Var == null) {
                        j1Var = new j1(this);
                        this.f50212D.set(j1Var);
                    }
                } finally {
                }
            }
        }
        if (j1Var == this.f50212D) {
            j1Var = null;
        }
        return (j1) j1Var;
    }

    public boolean B0() {
        boolean z2;
        synchronized (this.f50249l0) {
            z2 = this.q0;
        }
        return z2;
    }

    public String C() {
        return this.u0;
    }

    public boolean C0() {
        return this.f50256r0;
    }

    public r1 D() {
        return this.f50259u;
    }

    public boolean D0() {
        boolean z2;
        synchronized (this.w0) {
            z2 = this.v0 != null;
        }
        return z2;
    }

    public boolean E0() {
        boolean z2;
        synchronized (this.f50249l0) {
            z2 = this.p0;
        }
        return z2;
    }

    public EventServiceImpl F() {
        Object eventServiceImpl = this.f50252o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f50252o) {
                try {
                    eventServiceImpl = this.f50252o.get();
                    if (eventServiceImpl == null) {
                        eventServiceImpl = new EventServiceImpl(this);
                        this.f50252o.set(eventServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (eventServiceImpl == this.f50252o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    public C1803m G() {
        Object c1803m = this.f50215G.get();
        if (c1803m == null) {
            synchronized (this.f50215G) {
                try {
                    c1803m = this.f50215G.get();
                    if (c1803m == null) {
                        c1803m = new C1803m(this);
                        this.f50215G.set(c1803m);
                    }
                } finally {
                }
            }
        }
        if (c1803m == this.f50215G) {
            c1803m = null;
        }
        return (C1803m) c1803m;
    }

    public n H() {
        Object nVar = this.f50217I.get();
        if (nVar == null) {
            synchronized (this.f50217I) {
                try {
                    nVar = this.f50217I.get();
                    if (nVar == null) {
                        nVar = new n(this);
                        this.f50217I.set(nVar);
                    }
                } finally {
                }
            }
        }
        if (nVar == this.f50217I) {
            nVar = null;
        }
        return (n) nVar;
    }

    public boolean H0() {
        return n7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public Activity I() {
        WeakReference weakReference;
        if (!((Boolean) a(x4.y4)).booleanValue() || (weakReference = this.f50237c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AppLovinSdkInitializationConfiguration J() {
        return this.v0;
    }

    public long K() {
        return this.f50239d;
    }

    public Long L() {
        return this.f50242g;
    }

    public long M() {
        return this.f50241f;
    }

    public o2 N() {
        Object o2Var = this.f50232X.get();
        if (o2Var == null) {
            synchronized (this.f50232X) {
                try {
                    o2Var = this.f50232X.get();
                    if (o2Var == null) {
                        o2Var = new o2(this);
                        this.f50232X.set(o2Var);
                    }
                } finally {
                }
            }
        }
        if (o2Var == this.f50232X) {
            o2Var = null;
        }
        return (o2) o2Var;
    }

    public C1804o O() {
        return this.f50255r;
    }

    public void O0() {
        if (StringUtils.isValidString(this.f50248l)) {
            return;
        }
        this.f50248l = "max";
    }

    public z2 P() {
        return this.f50258t;
    }

    public com.applovin.impl.mediation.d Q() {
        Object dVar = this.h0.get();
        if (dVar == null) {
            synchronized (this.h0) {
                try {
                    dVar = this.h0.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.mediation.d(this);
                        this.h0.set(dVar);
                    }
                } finally {
                }
            }
        }
        if (dVar == this.h0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public com.applovin.impl.mediation.e R() {
        return this.i0;
    }

    public void R0() {
        synchronized (this.f50249l0) {
            this.p0 = true;
            q0().h();
            d();
        }
    }

    public com.applovin.impl.mediation.f S() {
        Object fVar = this.f50238c0.get();
        if (fVar == null) {
            synchronized (this.f50238c0) {
                try {
                    fVar = this.f50238c0.get();
                    if (fVar == null) {
                        fVar = new com.applovin.impl.mediation.f(this);
                        this.f50238c0.set(fVar);
                    }
                } finally {
                }
            }
        }
        if (fVar == this.f50238c0) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public com.applovin.impl.mediation.g T() {
        Object gVar = this.b0.get();
        if (gVar == null) {
            synchronized (this.b0) {
                try {
                    gVar = this.b0.get();
                    if (gVar == null) {
                        gVar = new com.applovin.impl.mediation.g(this);
                        this.b0.set(gVar);
                    }
                } finally {
                }
            }
        }
        if (gVar == this.b0) {
            gVar = null;
        }
        return (com.applovin.impl.mediation.g) gVar;
    }

    public void T0() {
        C1804o.h("AppLovinSdk", "Resetting SDK state...");
        o0().a();
        o0().e();
        if (this.m0.compareAndSet(true, false)) {
            R0();
        } else {
            this.m0.set(true);
        }
    }

    public p3 U() {
        Object p3Var = this.f0.get();
        if (p3Var == null) {
            synchronized (this.f0) {
                try {
                    p3Var = this.f0.get();
                    if (p3Var == null) {
                        p3Var = new p3(this);
                        this.f0.set(p3Var);
                    }
                } finally {
                }
            }
        }
        if (p3Var == this.f0) {
            p3Var = null;
        }
        return (p3) p3Var;
    }

    public void U0() {
        if (StringUtils.isValidString(this.u0)) {
            return;
        }
        this.u0 = "max";
        O();
        if (C1804o.a()) {
            O().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public String V() {
        return this.f50248l;
    }

    public MediationServiceImpl X() {
        Object mediationServiceImpl = this.d0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.d0) {
                try {
                    mediationServiceImpl = this.d0.get();
                    if (mediationServiceImpl == null) {
                        mediationServiceImpl = new MediationServiceImpl(this);
                        this.d0.set(mediationServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (mediationServiceImpl == this.d0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    public void X0() {
        if ("admob".equalsIgnoreCase(this.f50248l) && ((Boolean) a(x4.f50774M3)).booleanValue()) {
            String str = (String) a(x4.f50772L3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb.append(str2);
            sb.append(".");
            if (str.startsWith(sb.toString())) {
                return;
            }
            final String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
            C1804o.h("AppLovinSdk", str3);
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.g9s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50179n.b(str3);
                }
            });
        }
    }

    public u3 Y() {
        Object u3Var = this.f50265z.get();
        if (u3Var == null) {
            synchronized (this.f50265z) {
                try {
                    u3Var = this.f50265z.get();
                    if (u3Var == null) {
                        u3Var = new u3(this);
                        this.f50265z.set(u3Var);
                    }
                } finally {
                }
            }
        }
        if (u3Var == this.f50265z) {
            u3Var = null;
        }
        return (u3) u3Var;
    }

    public v3 Z() {
        Object v3Var = this.e0.get();
        if (v3Var == null) {
            synchronized (this.e0) {
                try {
                    v3Var = this.e0.get();
                    if (v3Var == null) {
                        v3Var = new v3();
                        this.e0.set(v3Var);
                    }
                } finally {
                }
            }
        }
        if (v3Var == this.e0) {
            v3Var = null;
        }
        return (v3) v3Var;
    }

    public C1805p a0() {
        Object c1805p = this.f50243g0.get();
        if (c1805p == null) {
            synchronized (this.f50243g0) {
                try {
                    c1805p = this.f50243g0.get();
                    if (c1805p == null) {
                        c1805p = new C1805p(this);
                        this.f50243g0.set(c1805p);
                    }
                } finally {
                }
            }
        }
        if (c1805p == this.f50243g0) {
            c1805p = null;
        }
        return (C1805p) c1805p;
    }

    public AppLovinNativeAdService b0() {
        Object appLovinNativeAdService = this.f50251n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f50251n) {
                try {
                    appLovinNativeAdService = this.f50251n.get();
                    if (appLovinNativeAdService == null) {
                        appLovinNativeAdService = new AppLovinNativeAdService(this);
                        this.f50251n.set(appLovinNativeAdService);
                    }
                } finally {
                }
            }
        }
        if (appLovinNativeAdService == this.f50251n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    public y3 c0() {
        Object y3Var = this.f50220L.get();
        if (y3Var == null) {
            synchronized (this.f50220L) {
                try {
                    y3Var = this.f50220L.get();
                    if (y3Var == null) {
                        y3Var = new y3(o());
                        this.f50220L.set(y3Var);
                    }
                } finally {
                }
            }
        }
        if (y3Var == this.f50220L) {
            y3Var = null;
        }
        return (y3) y3Var;
    }

    public c4 d0() {
        Object c4Var = this.f50231W.get();
        if (c4Var == null) {
            synchronized (this.f50231W) {
                try {
                    c4Var = this.f50231W.get();
                    if (c4Var == null) {
                        c4Var = new c4(this);
                        this.f50231W.set(c4Var);
                    }
                } finally {
                }
            }
        }
        if (c4Var == this.f50231W) {
            c4Var = null;
        }
        return (c4) c4Var;
    }

    public C1773c e() {
        return a(D0);
    }

    public j4 e0() {
        Object j4Var = this.f50227S.get();
        if (j4Var == null) {
            synchronized (this.f50227S) {
                try {
                    j4Var = this.f50227S.get();
                    if (j4Var == null) {
                        j4Var = new j4(this);
                        this.f50227S.set(j4Var);
                    }
                } finally {
                }
            }
        }
        if (j4Var == this.f50227S) {
            j4Var = null;
        }
        return (j4) j4Var;
    }

    public com.applovin.impl.sdk.a f() {
        Object aVar = this.f50214F.get();
        if (aVar == null) {
            synchronized (this.f50214F) {
                try {
                    aVar = this.f50214F.get();
                    if (aVar == null) {
                        aVar = new com.applovin.impl.sdk.a(this);
                        this.f50214F.set(aVar);
                    }
                } finally {
                }
            }
        }
        if (aVar == this.f50214F) {
            aVar = null;
        }
        return (com.applovin.impl.sdk.a) aVar;
    }

    public com.applovin.impl.sdk.network.b f0() {
        Object bVar = this.f50234Z.get();
        if (bVar == null) {
            synchronized (this.f50234Z) {
                try {
                    bVar = this.f50234Z.get();
                    if (bVar == null) {
                        bVar = new com.applovin.impl.sdk.network.b(this);
                        this.f50234Z.set(bVar);
                    }
                } finally {
                }
            }
        }
        if (bVar == this.f50234Z) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public com.applovin.impl.f g() {
        return this.f50257s;
    }

    public PostbackServiceImpl g0() {
        Object postbackServiceImpl = this.f50233Y.get();
        if (postbackServiceImpl == null) {
            synchronized (this.f50233Y) {
                try {
                    postbackServiceImpl = this.f50233Y.get();
                    if (postbackServiceImpl == null) {
                        postbackServiceImpl = new PostbackServiceImpl(this);
                        this.f50233Y.set(postbackServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (postbackServiceImpl == this.f50233Y) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    public com.applovin.impl.sdk.d h() {
        Object dVar = this.f50229U.get();
        if (dVar == null) {
            synchronized (this.f50229U) {
                try {
                    dVar = this.f50229U.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.sdk.d(this);
                        this.f50229U.set(dVar);
                    }
                } finally {
                }
            }
        }
        if (dVar == this.f50229U) {
            dVar = null;
        }
        return (com.applovin.impl.sdk.d) dVar;
    }

    public e i() {
        Object eVar = this.f50213E.get();
        if (eVar == null) {
            synchronized (this.f50213E) {
                try {
                    eVar = this.f50213E.get();
                    if (eVar == null) {
                        eVar = new e(this);
                        this.f50213E.set(eVar);
                    }
                } finally {
                }
            }
        }
        if (eVar == this.f50213E) {
            eVar = null;
        }
        return (e) eVar;
    }

    public String i0() {
        return this.f50235a;
    }

    public C1784j j() {
        Object c1784j = this.a0.get();
        if (c1784j == null) {
            synchronized (this.a0) {
                try {
                    c1784j = this.a0.get();
                    if (c1784j == null) {
                        c1784j = new C1784j(this);
                        this.a0.set(c1784j);
                    }
                } finally {
                }
            }
        }
        if (c1784j == this.a0) {
            c1784j = null;
        }
        return (C1784j) c1784j;
    }

    public MaxSegmentCollectionImpl j0() {
        return (MaxSegmentCollectionImpl) this.f50247k;
    }

    public AppLovinAdServiceImpl k() {
        Object appLovinAdServiceImpl = this.f50250m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f50250m) {
                try {
                    appLovinAdServiceImpl = this.f50250m.get();
                    if (appLovinAdServiceImpl == null) {
                        appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                        this.f50250m.set(appLovinAdServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (appLovinAdServiceImpl == this.f50250m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public g l() {
        Object gVar = this.f50218J.get();
        if (gVar == null) {
            synchronized (this.f50218J) {
                try {
                    gVar = this.f50218J.get();
                    if (gVar == null) {
                        gVar = new g(this);
                        this.f50218J.set(gVar);
                    }
                } finally {
                }
            }
        }
        if (gVar == this.f50218J) {
            gVar = null;
        }
        return (g) gVar;
    }

    public w4 l0() {
        Object w4Var = this.f50222N.get();
        if (w4Var == null) {
            synchronized (this.f50222N) {
                try {
                    w4Var = this.f50222N.get();
                    if (w4Var == null) {
                        w4Var = new w4(this);
                        this.f50222N.set(w4Var);
                    }
                } finally {
                }
            }
        }
        if (w4Var == this.f50222N) {
            w4Var = null;
        }
        return (w4) w4Var;
    }

    public h m() {
        Object hVar = this.f50230V.get();
        if (hVar == null) {
            synchronized (this.f50230V) {
                try {
                    hVar = this.f50230V.get();
                    if (hVar == null) {
                        hVar = new h(this);
                        this.f50230V.set(hVar);
                    }
                } finally {
                }
            }
        }
        if (hVar == this.f50230V) {
            hVar = null;
        }
        return (h) hVar;
    }

    public SessionTracker m0() {
        Object sessionTracker = this.f50216H.get();
        if (sessionTracker == null) {
            synchronized (this.f50216H) {
                try {
                    sessionTracker = this.f50216H.get();
                    if (sessionTracker == null) {
                        sessionTracker = new SessionTracker(this);
                        this.f50216H.set(sessionTracker);
                    }
                } finally {
                }
            }
        }
        if (sessionTracker == this.f50216H) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public AppLovinSdkSettings n0() {
        return this.f50246j;
    }

    public y4 o0() {
        Object y4Var = this.f50262x.get();
        if (y4Var == null) {
            synchronized (this.f50262x) {
                try {
                    y4Var = this.f50262x.get();
                    if (y4Var == null) {
                        y4Var = new y4(this);
                        this.f50262x.set(y4Var);
                    }
                } finally {
                }
            }
        }
        if (y4Var == this.f50262x) {
            y4Var = null;
        }
        return (y4) y4Var;
    }

    public i p() {
        Object iVar = this.f50223O.get();
        if (iVar == null) {
            synchronized (this.f50223O) {
                try {
                    iVar = this.f50223O.get();
                    if (iVar == null) {
                        iVar = new i(this);
                        this.f50223O.set(iVar);
                    }
                } finally {
                }
            }
        }
        if (iVar == this.f50223O) {
            iVar = null;
        }
        return (i) iVar;
    }

    public a5 p0() {
        Object a5Var = this.f50210B.get();
        if (a5Var == null) {
            synchronized (this.f50210B) {
                try {
                    a5Var = this.f50210B.get();
                    if (a5Var == null) {
                        a5Var = new a5(this);
                        this.f50210B.set(a5Var);
                    }
                } finally {
                }
            }
        }
        if (a5Var == this.f50210B) {
            a5Var = null;
        }
        return (a5) a5Var;
    }

    public String q() {
        return this.f50236b;
    }

    public d6 q0() {
        Object d6Var = this.f50261w.get();
        if (d6Var == null) {
            synchronized (this.f50261w) {
                try {
                    d6Var = this.f50261w.get();
                    if (d6Var == null) {
                        d6Var = new d6(this);
                        this.f50261w.set(d6Var);
                    }
                } finally {
                }
            }
        }
        if (d6Var == this.f50261w) {
            d6Var = null;
        }
        return (d6) d6Var;
    }

    public z6 r0() {
        Object z6Var = this.f50225Q.get();
        if (z6Var == null) {
            synchronized (this.f50225Q) {
                try {
                    z6Var = this.f50225Q.get();
                    if (z6Var == null) {
                        z6Var = new z6(this);
                        this.f50225Q.set(z6Var);
                    }
                } finally {
                }
            }
        }
        if (z6Var == this.f50225Q) {
            z6Var = null;
        }
        return (z6) z6Var;
    }

    public CmpServiceImpl s() {
        Object cmpServiceImpl = this.f50253p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f50253p) {
                try {
                    cmpServiceImpl = this.f50253p.get();
                    if (cmpServiceImpl == null) {
                        cmpServiceImpl = new CmpServiceImpl(this);
                        this.f50253p.set(cmpServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (cmpServiceImpl == this.f50253p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    public f7 s0() {
        Object f7Var = this.j0.get();
        if (f7Var == null) {
            synchronized (this.j0) {
                try {
                    f7Var = this.j0.get();
                    if (f7Var == null) {
                        f7Var = new f7(this);
                        this.j0.set(f7Var);
                    }
                } finally {
                }
            }
        }
        if (f7Var == this.j0) {
            f7Var = null;
        }
        return (f7) f7Var;
    }

    public j t() {
        Object jVar = this.f50221M.get();
        if (jVar == null) {
            synchronized (this.f50221M) {
                try {
                    jVar = this.f50221M.get();
                    if (jVar == null) {
                        jVar = new j(this);
                        this.f50221M.set(jVar);
                    }
                } finally {
                }
            }
        }
        if (jVar == this.f50221M) {
            jVar = null;
        }
        return (j) jVar;
    }

    public long t0() {
        if (this.f50244h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f50244h;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f50235a + "', enabled=" + this.q0 + ", isFirstSession=" + this.f50256r0 + '}';
    }

    public SdkConfigurationImpl v() {
        return this.f50263x0;
    }

    public l7 v0() {
        return this.f50260v;
    }

    public q0 w() {
        Object q0Var = this.f50264y.get();
        if (q0Var == null) {
            synchronized (this.f50264y) {
                try {
                    q0Var = this.f50264y.get();
                    if (q0Var == null) {
                        q0Var = new q0(this);
                        this.f50264y.set(q0Var);
                    }
                } finally {
                }
            }
        }
        if (q0Var == this.f50264y) {
            q0Var = null;
        }
        return (q0) q0Var;
    }

    public m7 w0() {
        Object m7Var = this.f50211C.get();
        if (m7Var == null) {
            synchronized (this.f50211C) {
                try {
                    m7Var = this.f50211C.get();
                    if (m7Var == null) {
                        m7Var = new m7(this);
                        this.f50211C.set(m7Var);
                    }
                } finally {
                }
            }
        }
        if (m7Var == this.f50211C) {
            m7Var = null;
        }
        return (m7) m7Var;
    }

    public u0 x() {
        Object u0Var = this.f50224P.get();
        if (u0Var == null) {
            synchronized (this.f50224P) {
                try {
                    u0Var = this.f50224P.get();
                    if (u0Var == null) {
                        u0Var = new u0(this);
                        this.f50224P.set(u0Var);
                    }
                } finally {
                }
            }
        }
        if (u0Var == this.f50224P) {
            u0Var = null;
        }
        return (u0) u0Var;
    }

    public l8 x0() {
        Object l8Var = this.f50219K.get();
        if (l8Var == null) {
            synchronized (this.f50219K) {
                try {
                    l8Var = this.f50219K.get();
                    if (l8Var == null) {
                        l8Var = new l8(this);
                        this.f50219K.set(l8Var);
                    }
                } finally {
                }
            }
        }
        if (l8Var == this.f50219K) {
            l8Var = null;
        }
        return (l8) l8Var;
    }

    public e1 y() {
        Object e1Var = this.f50226R.get();
        if (e1Var == null) {
            synchronized (this.f50226R) {
                try {
                    e1Var = this.f50226R.get();
                    if (e1Var == null) {
                        e1Var = new e1(this);
                        this.f50226R.set(e1Var);
                    }
                } finally {
                }
            }
        }
        if (e1Var == this.f50226R) {
            e1Var = null;
        }
        return (e1) e1Var;
    }

    public AppLovinSdk y0() {
        return this.f50254q;
    }

    public f1 z() {
        Object f1Var = this.f50228T.get();
        if (f1Var == null) {
            synchronized (this.f50228T) {
                try {
                    f1Var = this.f50228T.get();
                    if (f1Var == null) {
                        f1Var = new f1(this);
                        this.f50228T.set(f1Var);
                    }
                } finally {
                }
            }
        }
        if (f1Var == this.f50228T) {
            f1Var = null;
        }
        return (f1) f1Var;
    }

    public boolean z0() {
        return this.s0;
    }

    public C1802k(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.p0 = false;
        C0 = this;
        this.f50246j = appLovinSdkSettings;
        this.f50239d = System.currentTimeMillis();
        this.p0 = true;
        if (F0()) {
            D0 = context.getApplicationContext();
            if (context instanceof Activity) {
                this.f50237c = new WeakReference((Activity) context);
                return;
            }
            return;
        }
        throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() {
        if (q0().f()) {
            return;
        }
        O();
        if (C1804o.a()) {
            O().a("AppLovinSdk", "Timing out adapters init...");
        }
        q0().g();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        d6 d6VarQ0 = q0();
        int i2 = this.t0 + 1;
        this.t0 = i2;
        d6VarQ0.a((AbstractRunnableC1782i5) new t5(i2, this, new c()), d6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        if (G0()) {
            k2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        if (!G0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.n0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!x().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            x().a(u0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        y3 y3VarC0 = c0();
        y3VarC0.a(new d(y3VarC0));
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        D0 = context.getApplicationContext();
        E0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f50244h = System.currentTimeMillis();
            r0.c(jSONObject, this);
            r0.b(jSONObject, this);
            r0.a(jSONObject, this);
            l3.f(jSONObject, this);
            l3.d(jSONObject, this);
            l3.e(jSONObject, this);
            l3.g(jSONObject, this);
        }
    }

    public String E() {
        return w0().d();
    }

    public boolean G0() {
        return StringUtils.containsIgnoreCase(V(), "max");
    }

    public void Q0() {
        t().a();
    }

    public void V0() {
        y().n();
    }

    public String h0() {
        return w0().a();
    }

    public Map k0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplJ0 = j0();
        if (maxSegmentCollectionImplJ0 == null) {
            return null;
        }
        return maxSegmentCollectionImplJ0.getJsonData();
    }

    public String r() {
        return w0().b();
    }

    public String u() {
        return w0().c();
    }

    public Activity u0() {
        Activity activityB = a(o()).b();
        if (activityB != null) {
            return activityB;
        }
        return I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        A0();
        this.f50246j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            C1804o.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            o0().a(x4.f50772L3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(x4.f50842s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        d6 d6VarQ0 = q0();
        AbstractRunnableC1782i5 abstractRunnableC1782i5 = this.A0;
        d6.b bVar = d6.b.CORE;
        d6VarQ0.a(abstractRunnableC1782i5, bVar);
        q0().a(this.B0, bVar);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f50254q = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i2) {
        return a(i2, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextO = o();
        return a(contextO.getResources().getIdentifier(str, "string", contextO.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        O();
        if (C1804o.a()) {
            O().a("AppLovinSdk", str);
        }
        q0().a(new c6(this));
    }

    public static String a(int i2, List list) {
        String string = o().getResources().getString(i2);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.EMPTY_LIST).iterator();
        while (it.hasNext()) {
            C1804o.h("AppLovinSdk", (String) it.next());
        }
    }

    public void c() {
        synchronized (this.f50249l0) {
            try {
                if (!this.p0 && !this.q0) {
                    R0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1773c a(Context context) {
        if (f50208H0 == null) {
            synchronized (I0) {
                try {
                    if (f50208H0 == null) {
                        f50208H0 = new C1773c(context);
                    }
                } finally {
                }
            }
        }
        return f50208H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (!n7.c(this)) {
            HashMap map = new HashMap();
            map.put("details", "admob");
            map.put("error_message", str);
            D().a(d2.S0, "adapterVersionMismatch", map);
            return;
        }
        throw new IllegalStateException(str);
    }

    public List c(x4 x4Var) {
        return o0().c(x4Var);
    }

    public void c(z4 z4Var) {
        p0().b(z4Var);
    }

    public void a(final AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.w0) {
            try {
                if (this.v0 != null) {
                    C1804o.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.v0 + ". Ignoring the provided initialization configuration.");
                    if (!B0() || sdkInitializationListener == null) {
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.UGc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f50048n.a(sdkInitializationListener);
                        }
                    });
                    return;
                }
                this.f50240e = System.currentTimeMillis();
                this.v0 = appLovinSdkInitializationConfiguration;
                this.y0 = sdkInitializationListener;
                this.f50235a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.f50236b = appLovinSdkInitializationConfiguration.getAxonEventKey();
                this.f50248l = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.f50247k = appLovinSdkInitializationConfiguration.getSegmentCollection();
                n7.a(new Runnable() { // from class: com.applovin.impl.sdk.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50019n.a(appLovinSdkInitializationConfiguration);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void b(boolean z2) {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (x().i() || (sdkInitializationListener = this.y0) == null) {
            return;
        }
        if (B0()) {
            this.y0 = null;
            this.z0 = null;
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.z0 == sdkInitializationListener) {
                return;
            }
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(x4.f50835p)).booleanValue()) {
                this.y0 = null;
            } else {
                this.z0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", B0());
        JsonUtils.putBoolean(jSONObject, "timeout", z2);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.o0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f50240e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f50260v.d(d2.f48284j, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.SPz
            @Override // java.lang.Runnable
            public final void run() {
                this.f50025n.b(sdkInitializationListener);
            }
        }, Math.max(0L, ((Long) a(x4.f50836q)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f50263x0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        O();
        if (C1804o.a()) {
            O().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f50263x0);
    }

    public void a(boolean z2) {
        synchronized (this.f50249l0) {
            this.p0 = false;
            this.q0 = z2;
        }
        if (z2) {
            List listA = w3.a(this);
            if (listA.isEmpty()) {
                q0().g();
                M0();
                return;
            }
            Long l2 = (Long) a(r3.o7);
            C1797r6 c1797r6 = new C1797r6(this, true, "timeoutInitAdapters", new Runnable() { // from class: com.applovin.impl.sdk.ci
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50137n.I0();
                }
            });
            O();
            if (C1804o.a()) {
                O().a("AppLovinSdk", "Waiting for required adapters to init: " + listA + " - timing out in " + l2 + "ms...");
            }
            q0().a(c1797r6, d6.b.TIMEOUT, l2.longValue(), true);
        }
    }

    public List b(x4 x4Var) {
        return o0().b(x4Var);
    }

    public void b(z4 z4Var, Object obj) {
        p0().b(z4Var, obj);
    }

    public Object b(z4 z4Var) {
        return p0().a(z4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r12.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r15.u0 = (java.lang.String) r13.getValue();
        O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (com.applovin.impl.sdk.C1804o.a() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        O().a("AppLovinSdk", "Detected mediation provider: " + r15.u0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (r6.booleanValue() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String b() {
        if (StringUtils.isValidString(this.u0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Map mapW = W();
        List listC = c(x4.k4);
        Boolean bool = (Boolean) a(x4.f50831l4);
        if (mapW.isEmpty() && !bool.booleanValue()) {
            return null;
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Integer numValueOf = (Integer) a(x4.j4);
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (numValueOf.intValue() <= 0) {
                    break;
                }
                String className = stackTraceElement.getClassName();
                Iterator it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (className.startsWith((String) it.next())) {
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            D().a("AppLovinSdk", "detectMediationProvider", th);
        }
        this.u0 = "unknown";
        O();
        if (C1804o.a()) {
            O().k("AppLovinSdk", "Unable to detect mediation provider");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String strJoin = StringUtils.join(",", arrayList);
        if (!((Boolean) a(x4.m4)).booleanValue()) {
            return strJoin;
        }
        D().a(d2.f48277d, "detectMediationProvider", CollectionUtils.hashMap("details", strJoin));
        return null;
    }

    public void a(k3 k3Var) {
        if (q0().f()) {
            return;
        }
        List listA = w3.a(this);
        if (listA.size() <= 0 || !S().a().containsAll(listA)) {
            return;
        }
        O();
        if (C1804o.a()) {
            O().a("AppLovinSdk", "All required adapters initialized");
        }
        q0().g();
        M0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.k0;
        return (list == null || list.size() <= 0 || this.k0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) p0().a(z4.f51004g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < n7.g(str)) {
                C1804o.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public Object a(x4 x4Var) {
        return o0().a(x4Var);
    }

    public boolean a(x4 x4Var, MaxAdFormat maxAdFormat) {
        return b(x4Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        U().a(map);
    }

    public void a(Uri uri) {
        B().a(uri);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        p0().a(str, obj, editor);
    }

    public Object a(z4 z4Var) {
        return a(z4Var, (Object) null);
    }

    public Object a(z4 z4Var, Object obj) {
        return p0().a(z4Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a5.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        p0().a(sharedPreferences);
    }
}
