package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.d6;
import com.applovin.impl.h0;
import com.applovin.impl.o0;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w1 implements AppLovinBroadcastManager.Receiver, a.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected int f50638A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected boolean f50639B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ContentObserver f50640C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Float f50641D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected AppLovinAdClickListener f50642E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected AppLovinAdDisplayListener f50643F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected AppLovinAdVideoPlaybackListener f50644G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected g7 f50645H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected g7 f50646I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected boolean f50647J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final h0 f50648K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f50649L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f50650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C1802k f50651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final C1804o f50652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Activity f50653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f50655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC1772b f50656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i.a f50657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdView f50658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected com.applovin.impl.adview.k f50659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f50660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f50661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final long f50662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f50663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f50664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f50665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected long f50666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected long f50667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f50668s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f50669t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f50670u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f50671v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f50672w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ArrayList f50673x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected int f50674y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f50675z;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class a implements AppLovinAdDisplayListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            C1804o c1804o = w1.this.f50652c;
            if (C1804o.a()) {
                w1.this.f50652c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            C1804o c1804o = w1.this.f50652c;
            if (C1804o.a()) {
                w1.this.f50652c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            w1.this.a("web_view");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class b implements i.a {
        b() {
        }

        @Override // com.applovin.impl.sdk.i.a
        public void a(int i2) {
            w1 w1Var = w1.this;
            if (w1Var.f50638A != com.applovin.impl.sdk.i.f50197h) {
                w1Var.f50639B = true;
            }
            com.applovin.impl.adview.b bVarF = w1Var.f50658i.getController().f();
            if (bVarF == null) {
                C1804o c1804o = w1.this.f50652c;
                if (C1804o.a()) {
                    w1.this.f50652c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.i.a(i2) && !com.applovin.impl.sdk.i.a(w1.this.f50638A)) {
                bVarF.a("javascript:al_muteSwitchOn();");
            } else if (i2 == 2) {
                bVarF.a("javascript:al_muteSwitchOff();");
            }
            w1.this.f50638A = i2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class c extends AbstractC1772b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1802k f50678a;

        c(C1802k c1802k) {
            this.f50678a = c1802k;
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(n7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f50678a));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1802k f50680a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Handler handler, C1802k c1802k) {
            super(handler);
            this.f50680a = c1802k;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            Float fB = this.f50680a.p().b();
            if (fB == null || w1.this.f50641D == null || fB.equals(w1.this.f50641D)) {
                return;
            }
            String str = fB.floatValue() > w1.this.f50641D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fB.floatValue());
            w1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            w1.this.f50641D = fB;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class e extends AbstractC1772b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s4 f50682a;

        e(s4 s4Var) {
            this.f50682a = s4Var;
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f50682a.b(null);
                w1.this.f50651b.e().b(this);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class f implements h0.c {
        @Override // com.applovin.impl.h0.c
        public void a(int i2, int i3) {
            Map mapA = f2.a((AppLovinAdImpl) w1.this.f50650a);
            mapA.putAll(f2.a(w1.this.f50650a));
            mapA.put("details", "detection_count=" + i2 + ",total_checks=" + i3);
            w1.this.f50651b.D().d(d2.f48258K0, mapA);
        }

        f() {
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i2, int i3, int i5) {
            Map mapA = f2.a((AppLovinAdImpl) w1.this.f50650a);
            mapA.putAll(f2.a(w1.this.f50650a));
            mapA.put("details", "detections_to_report=" + i2 + ",detection_count=" + i3 + ",total_checks=" + i5);
            w1.this.f50651b.D().d(d2.L0, mapA);
            if (((Boolean) w1.this.f50651b.a(x4.r6)).booleanValue()) {
                w1.this.x();
            }
            if (((Boolean) w1.this.f50651b.a(x4.P0)).booleanValue()) {
                w1.this.f50651b.G().c(w1.this.f50650a, C1802k.o());
            }
            if (((Boolean) w1.this.f50651b.a(x4.n6)).booleanValue()) {
                w1.this.a("black_view_auto_dismiss");
                return;
            }
            w1 w1Var = w1.this;
            w1Var.f50649L = ((Boolean) w1Var.f50651b.a(x4.o6)).booleanValue();
            if (((Boolean) w1.this.f50651b.a(x4.p6)).booleanValue()) {
                w1.this.A();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface g {
        void a(w1 w1Var);

        void a(String str, Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        /* synthetic */ h(w1 w1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            w1.this.f50666q = SystemClock.elapsedRealtime();
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            C1804o c1804o = w1.this.f50652c;
            if (C1804o.a()) {
                w1.this.f50652c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            t2.a(w1.this.f50642E, appLovinAd);
            w1.this.f50675z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w1 w1Var = w1.this;
            if (view != w1Var.f50660k || !((Boolean) w1Var.f50651b.a(x4.f50802X1)).booleanValue()) {
                C1804o c1804o = w1.this.f50652c;
                if (C1804o.a()) {
                    w1.this.f50652c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            w1.f(w1.this);
            if (w1.this.f50650a.O0()) {
                w1.this.e("javascript:al_onCloseButtonTapped(" + w1.this.f50672w + "," + w1.this.f50674y + "," + w1.this.f50675z + ");");
            }
            List listF = w1.this.f50650a.F();
            C1804o c1804o2 = w1.this.f50652c;
            if (C1804o.a()) {
                w1.this.f50652c.a("AppLovinFullscreenActivity", "Handling close button tap " + w1.this.f50672w + " with multi close delay: " + listF);
            }
            if (listF == null || listF.size() <= w1.this.f50672w) {
                w1.this.a("native_close_button");
                return;
            }
            w1.this.f50673x.add(Long.valueOf(SystemClock.elapsedRealtime() - w1.this.f50666q));
            List listD = w1.this.f50650a.D();
            if (listD != null && listD.size() > w1.this.f50672w) {
                w1 w1Var2 = w1.this;
                w1Var2.f50660k.a((e.a) listD.get(w1Var2.f50672w));
            }
            C1804o c1804o3 = w1.this.f50652c;
            if (C1804o.a()) {
                w1.this.f50652c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listF.get(w1.this.f50672w));
            }
            w1.this.f50660k.setVisibility(8);
            w1 w1Var3 = w1.this;
            w1Var3.a(w1Var3.f50660k, ((Integer) listF.get(w1Var3.f50672w)).intValue(), new Runnable() { // from class: com.applovin.impl.yLi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50925n.a();
                }
            });
        }
    }

    static /* synthetic */ int f(w1 w1Var) {
        int i2 = w1Var.f50672w;
        w1Var.f50672w = i2 + 1;
        return i2;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f63161a);
        p0.startActivity(p1);
    }

    protected abstract void A();

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(long j2);

    protected abstract void m();

    public abstract void v();

    public abstract void w();

    private void B() {
        if (this.f50657h != null) {
            this.f50651b.p().a(this.f50657h);
        }
        if (this.f50656g != null) {
            this.f50651b.e().a(this.f50656g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        C1804o.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th) {
            C1804o.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
            try {
                l();
            } catch (Throwable unused) {
            }
        }
    }

    private void f(final String str) {
        if (this.f50664o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.rCj
            @Override // java.lang.Runnable
            public final void run() {
                this.f49890n.c(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.f50650a.R() <= this.f50654e && !AbstractC1775d.d(this.f50653d)) {
            if (C1804o.a()) {
                this.f50652c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f50665p = false;
            long jC = this.f50650a.c();
            if (jC > 0) {
                a(jC).a(s4.f49923i, new s4.b() { // from class: com.applovin.impl.hzY
                    @Override // com.applovin.impl.s4.b
                    public final void a(boolean z2, Object obj, Object obj2) {
                        this.f48678n.a(z2, (Void) obj, (Void) obj2);
                    }
                });
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.f50650a.z0().getAndSet(true)) {
            return;
        }
        this.f50651b.q0().a((AbstractRunnableC1782i5) new m6(this.f50650a, this.f50651b), d6.b.OTHER);
    }

    public AppLovinAdView b() {
        return this.f50658i;
    }

    public void d(boolean z2) {
        this.f50665p = z2;
    }

    public void e(String str) {
        a(str, 0L);
    }

    public boolean g() {
        return this.f50668s;
    }

    protected boolean h() {
        return AppLovinAdType.INCENTIVIZED == this.f50650a.getType();
    }

    protected boolean i() {
        return this.f50653d instanceof AppLovinFullscreenActivity;
    }

    protected void l() {
        if (!this.f50665p && this.f50664o.compareAndSet(false, true)) {
            t2.b(this.f50643F, this.f50650a);
            this.f50651b.H().b(this.f50650a);
            HashMap map = new HashMap();
            com.applovin.impl.sdk.ad.b bVar = this.f50650a;
            if (bVar != null) {
                CollectionUtils.putStringIfValid("source", bVar.v(), map);
                CollectionUtils.putStringIfValid("details", f2.b(this.f50650a), map);
            }
            this.f50651b.g().a(d2.f48252G, this.f50650a, map);
        }
    }

    protected void n() {
        g7 g7Var = this.f50645H;
        if (g7Var != null) {
            g7Var.d();
        }
    }

    protected void o() {
        g7 g7Var = this.f50645H;
        if (g7Var != null) {
            g7Var.e();
        }
    }

    protected void p() {
        com.applovin.impl.adview.b bVarF;
        if (this.f50658i == null || !this.f50650a.t0() || (bVarF = this.f50658i.getController().f()) == null) {
            return;
        }
        this.f50648K.a(bVarF, new f());
    }

    public void r() {
        AppLovinAdView appLovinAdView = this.f50658i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f50658i.destroy();
            this.f50658i = null;
            if ((parent instanceof ViewGroup) && i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        l();
        this.f50642E = null;
        this.f50643F = null;
        this.f50644G = null;
        this.f50653d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void t() {
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        o();
    }

    public boolean y() {
        return this.f50665p;
    }

    w1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, C1802k c1802k, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f50655f = handler;
        this.f50662m = SystemClock.elapsedRealtime();
        this.f50663n = new AtomicBoolean();
        this.f50664o = new AtomicBoolean();
        this.f50666q = -1L;
        this.f50672w = 0;
        this.f50673x = new ArrayList();
        this.f50674y = 0;
        this.f50675z = 0;
        this.f50638A = com.applovin.impl.sdk.i.f50197h;
        this.f50649L = false;
        this.f50650a = bVar;
        this.f50651b = c1802k;
        this.f50652c = c1802k.O();
        this.f50653d = activity;
        this.f50654e = bVar.R();
        this.f50642E = appLovinAdClickListener;
        this.f50643F = appLovinAdDisplayListener;
        this.f50644G = appLovinAdVideoPlaybackListener;
        this.f50648K = new h0(c1802k);
        h hVar = new h(this, null);
        if (((Boolean) c1802k.a(x4.n2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) c1802k.a(x4.f50845t2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        u1 u1Var = new u1(c1802k.y0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f50658i = u1Var;
        u1Var.setAdClickListener(hVar);
        this.f50658i.setAdDisplayListener(new a());
        bVar.h().putString("ad_view_address", e8.a(this.f50658i));
        this.f50658i.getController().a(this);
        c2 c2Var = new c2(map, c1802k);
        if (c2Var.c()) {
            this.f50659j = new com.applovin.impl.adview.k(c2Var, activity);
        }
        c1802k.k().trackImpression(bVar);
        List listF = bVar.F();
        if (bVar.r() < 0 && listF == null) {
            this.f50660k = null;
        } else {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.p(), activity);
            this.f50660k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(hVar);
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f50661l = gVar2;
        gVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.kO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48828n.a(view);
            }
        });
        if (bVar.V0()) {
            this.f50657h = new b();
        } else {
            this.f50657h = null;
        }
        this.f50656g = new c(c1802k);
        if (bVar.R0()) {
            this.f50641D = c1802k.p().b();
            this.f50640C = new d(handler, c1802k);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.f50640C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (z()) {
            if (C1804o.a()) {
                this.f50652c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
            }
            this.f50665p = true;
            long jF = this.f50650a.f();
            if (jF < 0) {
                return;
            }
            a(new Runnable() { // from class: com.applovin.impl.Pta
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47806n.j();
                }
            }, jF);
            return;
        }
        f("app_relaunch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        if (a() >= 0) {
            return true;
        }
        return false;
    }

    public void b(boolean z2) {
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z2);
        }
        d("javascript:al_onWindowFocusChanged( " + z2 + " );");
        g7 g7Var = this.f50646I;
        if (g7Var != null) {
            if (z2) {
                g7Var.e();
            } else {
                g7Var.d();
            }
        }
    }

    public void e() {
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action != null) {
            byte b2 = -1;
            switch (action.hashCode()) {
                case -1852867992:
                    if (action.equals("com.applovin.al_onPoststitialShow_evaluation_error")) {
                        b2 = 0;
                    }
                    break;
                case -1770043299:
                    if (action.equals("com.applovin.custom_intent_launch_failure")) {
                        b2 = 1;
                    }
                    break;
                case -1638166742:
                    if (action.equals("com.applovin.external_redirect_success")) {
                        b2 = 2;
                    }
                    break;
                case -859884819:
                    if (action.equals("com.applovin.custom_tabs_failure")) {
                        b2 = 3;
                    }
                    break;
                case -857571151:
                    if (action.equals("com.applovin.external_redirect_failure")) {
                        b2 = 4;
                    }
                    break;
                case -794532889:
                    if (action.equals("com.applovin.custom_tabs_hidden")) {
                        b2 = 5;
                    }
                    break;
                case -292584652:
                    if (action.equals("com.applovin.custom_tabs_shown")) {
                        b2 = 6;
                    }
                    break;
                case -269649010:
                    if (action.equals(dpcnwfoVOnrtRA.wHEXTrs)) {
                        b2 = 7;
                    }
                    break;
                case 329711075:
                    if (action.equals("com.applovin.preload_success")) {
                        b2 = 8;
                    }
                    break;
                case 1110306666:
                    if (action.equals("com.applovin.preload_failure")) {
                        b2 = 9;
                    }
                    break;
                case 1744328406:
                    if (action.equals("com.applovin.custom_intent_launch_success")) {
                        b2 = 10;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    e();
                    break;
                case 1:
                case 10:
                    a(action, map);
                    break;
                case 2:
                case 4:
                    c(action, map);
                    break;
                case 3:
                case 5:
                case 6:
                    b(action, map);
                    break;
                case 7:
                    if (!this.f50669t) {
                        f();
                    }
                    break;
                case 8:
                case 9:
                    d(action, map);
                    break;
            }
        }
    }

    public void q() {
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.f50649L) {
            a("back_button");
        }
        if (this.f50650a.O0()) {
            e("javascript:onBackPressed();");
        }
    }

    public void s() {
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        n();
    }

    public void u() {
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    protected void x() {
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.f50647J = true;
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, C1802k c1802k, Activity activity, g gVar) {
        w1 z1Var;
        if (bVar instanceof o7) {
            try {
                z1Var = new z1(bVar, activity, map, c1802k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th) {
                gVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + c1802k + " and throwable: " + th.getMessage(), th);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                z1Var = new a2(bVar, activity, map, c1802k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + c1802k + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else {
            try {
                z1Var = new x1(bVar, activity, map, c1802k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + c1802k + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        }
        z1Var.B();
        gVar.a(z1Var);
    }

    public void f() {
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f50669t = true;
    }

    protected void c(boolean z2) {
        a(z2, ((Long) this.f50651b.a(x4.m2)).longValue());
        if (!this.f50650a.s0()) {
            t2.a(this.f50643F, this.f50650a);
        }
        this.f50651b.H().a(this.f50650a);
        if (!this.f50650a.s0() && (this.f50650a.hasVideoUrl() || h())) {
            t2.a(this.f50644G, this.f50650a);
        }
        new n4(this.f50653d).a(this.f50650a);
        this.f50650a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b bVarF;
        AppLovinAdView appLovinAdView = this.f50658i;
        if (appLovinAdView == null || (bVarF = appLovinAdView.getController().f()) == null) {
            return;
        }
        bVarF.a(str);
    }

    protected void d(String str) {
        if (this.f50650a.v0()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        e8.a(gVar, 400L, new Runnable() { // from class: com.applovin.impl.nKE
            @Override // java.lang.Runnable
            public final void run() {
                w1.a(gVar, runnable);
            }
        });
    }

    private void d(String str, Map map) {
        e(o8.d(str, map));
    }

    private void b(String str, Map map) {
        e(o8.b(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a("backup_close_button");
    }

    public long a() {
        com.applovin.impl.sdk.ad.b bVar = this.f50650a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.I5
            @Override // java.lang.Runnable
            public final void run() {
                w1.b(gVar, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, Void r2, Void r3) {
        if (z2) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    protected int c() {
        int iT = this.f50650a.t();
        return (iT <= 0 && ((Boolean) this.f50651b.a(x4.l2)).booleanValue()) ? this.f50670u + 1 : iT;
    }

    private s4 a(long j2) {
        final s4 s4Var = new s4("bringAdActivityToFront");
        final e eVar = new e(s4Var);
        this.f50651b.e().a(eVar);
        Intent intent = new Intent(this.f50653d, (Class<?>) (this.f50650a.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.f50653d, intent);
        a(new Runnable() { // from class: com.applovin.impl.G
            @Override // java.lang.Runnable
            public final void run() {
                this.f47729n.a(eVar, s4Var);
            }
        }, j2);
        return s4Var;
    }

    protected void c(long j2) {
        if (C1804o.a()) {
            this.f50652c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j2) + " seconds...");
        }
        this.f50645H = g7.a(j2, this.f50651b, new Runnable() { // from class: com.applovin.impl.LIz
            @Override // java.lang.Runnable
            public final void run() {
                this.f47766n.k();
            }
        });
    }

    private void c(String str, Map map) {
        e(o8.c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AbstractC1772b abstractC1772b, s4 s4Var) {
        this.f50651b.e().b(abstractC1772b);
        if (s4Var.d()) {
            return;
        }
        s4Var.a((Object) null);
    }

    protected boolean a(boolean z2) {
        List listA = n7.a(z2, this.f50650a, this.f50651b, this.f50653d);
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f50651b.a(x4.W0)).booleanValue() && !n7.a(listA, this.f50650a)) {
            a(listA, (com.applovin.impl.sdk.ad.a) this.f50650a);
            return false;
        }
        String str = "Missing ad resources: " + listA;
        Map mapA = f2.a((AppLovinAdImpl) this.f50650a);
        if (((Boolean) this.f50651b.a(x4.f50795T5)).booleanValue()) {
            if (C1804o.a()) {
                this.f50652c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
            }
            if (((Boolean) this.f50651b.a(x4.W5)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.f50643F;
                if (appLovinAdDisplayListener instanceof l2) {
                    t2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                n2.a(this.f50650a, this.f50643F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            a("missing_ad_resources");
            a(str, "Failing ad display", mapA);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f50651b.g().a(d2.f48251F, this.f50650a, mapHashMap);
            return ((Boolean) this.f50651b.a(x4.V5)).booleanValue();
        }
        if (C1804o.a()) {
            this.f50652c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
        }
        this.f50650a.E0();
        a(str, "Streaming ad", mapA);
        return false;
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        if (C1804o.a()) {
            this.f50652c.a("AppLovinFullscreenActivity", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.a(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f50651b.g().a(d2.f48257K, aVar, mapHashMap);
    }

    public void a(o0.a aVar, o0.a aVar2, o0.a aVar3) {
        if (((Boolean) this.f50651b.a(x4.E4)).booleanValue()) {
            HashMap map = new HashMap();
            map.put("orientation", n7.b(this.f50653d));
            if (aVar != null) {
                map.put("display_cutout_insets", aVar.e());
            }
            if (aVar2 != null) {
                map.put("status_bar_insets", aVar2.e());
            }
            if (aVar3 != null) {
                map.put("nav_bar_insets", aVar3.e());
            }
            e(o8.a(map));
        }
    }

    public void a(String str) {
        this.f50668s = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f50662m;
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.f50650a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f50655f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f50650a != null ? r0.w() : 0L);
        if (((Boolean) this.f50651b.a(x4.f50783P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar2 = this.f50650a;
            if (bVar2 != null) {
                bVar2.a(str);
            }
            m();
        }
        l();
        this.f50648K.b();
        if (this.f50657h != null) {
            this.f50651b.p().b(this.f50657h);
        }
        if (this.f50656g != null) {
            this.f50651b.e().b(this.f50656g);
        }
        if (this.f50640C != null) {
            this.f50653d.getContentResolver().unregisterContentObserver(this.f50640C);
            this.f50640C = null;
        }
        if (i()) {
            this.f50653d.finish();
            return;
        }
        this.f50651b.O();
        if (C1804o.a()) {
            this.f50651b.O().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        r();
    }

    public void a(Configuration configuration) {
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i2, KeyEvent keyEvent) {
        if (this.f50652c == null || !C1804o.a()) {
            return;
        }
        this.f50652c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i2 + ", " + keyEvent);
    }

    protected void a(final String str, long j2) {
        if (j2 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.hg
            @Override // java.lang.Runnable
            public final void run() {
                this.f48675n.b(str);
            }
        }, j2);
    }

    protected void a(final com.applovin.impl.adview.g gVar, long j2, final Runnable runnable) {
        if (j2 >= ((Long) this.f50651b.a(x4.W1)).longValue()) {
            return;
        }
        this.f50646I = g7.a(TimeUnit.SECONDS.toMillis(j2), this.f50651b, new Runnable() { // from class: com.applovin.impl.RP
            @Override // java.lang.Runnable
            public final void run() {
                w1.c(gVar, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    protected void a(int i2, boolean z2, boolean z3, long j2) {
        if (!this.f50665p && this.f50663n.compareAndSet(false, true)) {
            if (this.f50650a.hasVideoUrl() || h()) {
                t2.a(this.f50644G, this.f50650a, i2, z3);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f50662m;
            this.f50651b.k().trackVideoEnd(this.f50650a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i2, z2);
            long jElapsedRealtime2 = this.f50666q != -1 ? SystemClock.elapsedRealtime() - this.f50666q : -1L;
            this.f50651b.k().trackFullScreenAdClosed(this.f50650a, jElapsedRealtime2, this.f50673x, j2, this.f50639B, this.f50638A);
            if (C1804o.a()) {
                this.f50652c.a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i2 + "%, elapsedTime: " + jElapsedRealtime + "ms, skipTimeMillis: " + j2 + "ms, closeTimeMillis: " + jElapsedRealtime2 + "ms");
            }
        }
    }

    private void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, map2);
        CollectionUtils.putStringIfValid("details", str2, map2);
        this.f50651b.D().a(d2.M0, "missingCachedAdResources", map2);
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (C1804o.a()) {
            this.f50652c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.f50647J = true;
    }

    protected void a(boolean z2, long j2) {
        if (this.f50650a.H0()) {
            a(z2 ? "javascript:al_mute();" : "javascript:al_unmute();", j2);
        }
    }

    private void a(String str, Map map) {
        e(o8.a(str, map));
    }

    protected void a(Runnable runnable, long j2) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j2, this.f50655f);
    }
}
