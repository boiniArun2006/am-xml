package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebView;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.y0;
import com.fyber.inneractive.sdk.web.a1;
import com.fyber.inneractive.sdk.web.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class IAConfigManager {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static long f53261N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.v0 f53263A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.v0 f53264B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public g f53265C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.ignite.h f53266D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.k f53267E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.f f53268F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final HashMap f53269G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.extradata.d f53270H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.e f53271I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public WebView f53272J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f53273K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.cellular.a f53274L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f53275a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f53276b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f53277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f53278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f53279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f53280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f53281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f53282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f53283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InneractiveUserConfig f53284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f53285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f53286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InneractiveMediationName f53287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f53288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f53289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f53290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f53291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.l0 f53292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f53293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s f53294t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f53295u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t f53296v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x0 f53297w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s1 f53298x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.a f53299y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y0 f53300z;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final IAConfigManager f53260M = new IAConfigManager();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final g0 f53262O = new g0();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z2, Exception exc);
    }

    public final void a(Exception exc) {
        for (OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener : this.f53281g) {
            if (onConfigurationReadyAndValidListener != null) {
                boolean z2 = f53260M.f53279e != null;
                IAlog.e("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, z2, !z2 ? exc : null);
            }
        }
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f53260M.f53281g.add(onConfigurationReadyAndValidListener);
    }

    public static JSONArray b() {
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = f53260M.f53270H;
        dVar.getClass();
        JSONArray jSONArray = (JSONArray) dVar.a(new JSONArray(), new com.fyber.inneractive.sdk.serverapi.extradata.b());
        if (jSONArray == null) {
            IAlog.a("%sExtra data JSON is empty", "UserExtraDataManager");
            return null;
        }
        IAlog.a("%sReturning extra data JSON objects", "UserExtraDataManager");
        return jSONArray;
    }

    public static boolean c() {
        g gVar = f53260M.f53265C;
        return gVar != null && gVar.f();
    }

    public static boolean d() {
        IAConfigManager iAConfigManager = f53260M;
        boolean z2 = iAConfigManager.f53279e != null;
        int i2 = k.f53392a;
        boolean zBooleanValue = Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false))).booleanValue();
        if ((z2 && System.currentTimeMillis() - f53261N > 3600000) || zBooleanValue) {
            if (zBooleanValue) {
                s sVar = iAConfigManager.f53294t;
                sVar.f53468d = false;
                com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.util.l(sVar.f53469e));
            }
            a();
            b1 b1Var = b1.f57073c;
            b1Var.getClass();
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new a1(b1Var));
        }
        return z2;
    }

    public static void e() {
        SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.f57018a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    public static boolean f() {
        IAConfigManager iAConfigManager = f53260M;
        Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.f53273K.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c("enable");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        IAlog.a(FijIa.ajuJP, String.valueOf(zBooleanValue));
        if (zBooleanValue) {
            com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.f53271I;
            return eVar == null || !eVar.f54037a;
        }
        IAlog.a("OM SDK disabled", new Object[0]);
        IAlog.d("OM SDK disabled", new Object[0]);
        return false;
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f53260M.f53281g.remove(onConfigurationReadyAndValidListener);
    }

    public IAConfigManager() {
        new HashSet();
        this.f53282h = false;
        this.f53283i = new k0();
        this.f53285k = false;
        this.f53291q = false;
        this.f53292r = new com.fyber.inneractive.sdk.network.l0();
        this.f53293s = "";
        this.f53297w = new x0();
        this.f53300z = new y0();
        this.f53266D = new com.fyber.inneractive.sdk.ignite.h();
        this.f53267E = new com.fyber.inneractive.sdk.cache.k();
        this.f53268F = new com.fyber.inneractive.sdk.network.f();
        this.f53269G = new HashMap();
        this.f53273K = com.fyber.inneractive.sdk.config.global.r.a();
        this.f53281g = new CopyOnWriteArrayList();
        this.f53270H = new com.fyber.inneractive.sdk.serverapi.extradata.d();
    }

    public static void a() {
        IAConfigManager iAConfigManager = f53260M;
        com.fyber.inneractive.sdk.network.v0 v0Var = iAConfigManager.f53263A;
        if (v0Var != null) {
            iAConfigManager.f53292r.a(v0Var);
        }
        s sVar = iAConfigManager.f53294t;
        if (sVar.f53468d) {
            return;
        }
        iAConfigManager.f53292r.a(new com.fyber.inneractive.sdk.network.v0(new p(sVar), sVar.f53465a, sVar.f53469e));
    }
}
