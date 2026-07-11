package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.view.Lifecycle;
import com.applovin.impl.C1784j;
import com.applovin.impl.C1797r6;
import com.applovin.impl.EnumC1781i;
import com.applovin.impl.c3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.g0;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.w3;
import com.applovin.impl.x3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0708a, C1784j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f49123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f49124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f49125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f49126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f49127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c3 f49128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f49129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f49130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f49131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g0 f49132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f49133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f49134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f49135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f49136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f49137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f49138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WeakReference f49139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f49140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f49141s;

    public interface a {
        Activity getActivity();
    }

    protected class b implements MaxAdListener, MaxAdRevenueListener, a.InterfaceC0704a {
        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f49135m) {
                C1804o c1804o = MaxFullscreenAdImpl.this.logger;
                if (C1804o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Attempting ad failover");
                }
                c3Var.j(MaxFullscreenAdImpl.this.f49138p);
                MaxFullscreenAdImpl.this.sdk.P().a(d2.z0, c3Var, CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.f49138p));
                MaxFullscreenAdImpl.this.g();
                return;
            }
            C1804o c1804o2 = MaxFullscreenAdImpl.this.logger;
            if (C1804o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final c3 c3Var = (c3) maxAd;
            MaxFullscreenAdImpl.this.d();
            final boolean z2 = MaxFullscreenAdImpl.this.f49135m;
            if (z2) {
                C1804o c1804o = MaxFullscreenAdImpl.this.logger;
                if (C1804o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.B0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.this.f49135m = false;
            }
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.QJ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49173n.a(maxAd, z2, c3Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            final c3 c3Var = (c3) maxAd;
            if (MaxFullscreenAdImpl.this.f49135m) {
                C1804o c1804o = MaxFullscreenAdImpl.this.logger;
                if (C1804o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Ad failover succeeded");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.A0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.this.f49135m = false;
            }
            MaxFullscreenAdImpl.this.sdk.f().a(c3Var);
            MaxFullscreenAdImpl.this.b(c3Var);
            MaxFullscreenAdImpl.this.f();
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(r3.p8)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.q0().b(new C1797r6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new Runnable() { // from class: com.applovin.impl.mediation.ads.l3D
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49197n.a(c3Var);
                    }
                }), d6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            C1804o c1804o2 = MaxFullscreenAdImpl.this.logger;
            if (C1804o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        protected b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            C1804o c1804o = MaxFullscreenAdImpl.this.logger;
            if (C1804o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f49135m = false;
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.Pl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49170n.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.e();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.eO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49192n.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            c3 c3Var;
            synchronized (MaxFullscreenAdImpl.this.f49127e) {
                c3Var = MaxFullscreenAdImpl.this.f49128f;
            }
            MaxFullscreenAdImpl.this.sdk.H().a(MaxFullscreenAdImpl.this.adUnitId);
            final c3 c3Var2 = (c3) maxAd;
            MaxFullscreenAdImpl.this.a(c3Var2);
            if (!MaxFullscreenAdImpl.this.f49130h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.Xo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49179n.a(c3Var2, maxAd);
                    }
                });
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f49131i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.g();
            }
            C1804o c1804o = MaxFullscreenAdImpl.this.logger;
            if (C1804o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + c3Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            t2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) c3Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            C1804o c1804o = MaxFullscreenAdImpl.this.logger;
            if (C1804o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            t2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C1804o c1804o = MaxFullscreenAdImpl.this.logger;
            if (C1804o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            t2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            C1804o c1804o = MaxFullscreenAdImpl.this.logger;
            if (C1804o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var) {
            if (c3Var.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.P().a(d2.t0, c3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            C1804o c1804o = MaxFullscreenAdImpl.this.logger;
            if (C1804o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z2, c3 c3Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z2 && c3Var.z0()) {
                if (MaxFullscreenAdImpl.this.b()) {
                    AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49213n.a();
                        }
                    });
                    return;
                }
                C1804o c1804o = MaxFullscreenAdImpl.this.logger;
                if (C1804o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Unable to attempt ad failover due to missing cached ad");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.y0, c3Var);
            }
            C1804o c1804o2 = MaxFullscreenAdImpl.this.logger;
            if (C1804o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f49135m = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public void loadAd() {
        loadAd(EnumC1781i.PUBLISHER_INITIATED);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        c3 c3Var;
        List listB = this.sdk.s0().b();
        if (!this.sdk.s0().d() || listB == null || (c3Var = this.f49128f) == null || listB.contains(c3Var.c())) {
            if (activity == null) {
                activity = this.sdk.u0();
            }
            if (a(activity, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49202n.a(str, str2, activity);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.f49128f.c() + "> which is not in the list of selected ad networks " + listB;
        C1804o.h(this.tag, str3);
        a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f49081n.b(str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        c3 c3Var = this.f49128f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (C1804o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f49127e) {
            try {
                if (this.f49128f != null) {
                    if (C1804o.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f49128f + "...");
                    }
                    this.sdk.X().destroyAd(this.f49128f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.sdk.j().b(this);
        this.f49126d.a();
        g0 g0Var = this.f49132j;
        if (g0Var != null) {
            g0Var.a();
            this.f49132j = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            this.sdk.p0().b(z4.f50997R);
        }
        if (this.f49132j != null) {
            this.sdk.p0().b(z4.f50998S);
            this.f49132j.a();
            this.f49132j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c3 c3Var;
        if (this.f49130h.compareAndSet(true, false)) {
            synchronized (this.f49127e) {
                c3Var = this.f49128f;
                this.f49128f = null;
            }
            this.sdk.X().destroyAd(c3Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        final Long l2 = (Long) this.sdk.a(x4.D2);
        if (l2.longValue() <= 0) {
            return;
        }
        this.f49132j = g0.a(l2.longValue(), true, this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.qz
            @Override // java.lang.Runnable
            public final void run() {
                this.f49204n.a(l2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Activity activityU0 = (Activity) this.f49139q.get();
        if (activityU0 == null) {
            activityU0 = this.sdk.u0();
        }
        Activity activity = activityU0;
        if (this.f49134l) {
            showAd(this.f49136n, this.f49137o, (ViewGroup) this.f49140r.get(), (Lifecycle) this.f49141s.get(), activity);
        } else {
            showAd(this.f49136n, this.f49137o, activity);
        }
    }

    protected b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                this.f49088n.c();
            }
        });
    }

    public boolean isReady() {
        boolean z2;
        synchronized (this.f49127e) {
            try {
                c3 c3Var = this.f49128f;
                z2 = c3Var != null && c3Var.X() && this.f49129g == c.READY;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            this.sdk.H().c(this.adUnitId);
        }
        return z2;
    }

    public void loadAd(final EnumC1781i enumC1781i) {
        if (C1804o.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f49129g == c.DESTROYED) {
            boolean zC2 = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC2));
            if (zC2) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.f49123a;
            final Activity activity = aVar != null ? aVar.getActivity() : null;
            final Context context = (Context) this.f49124b.get();
            a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.aC
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49182n.a(activity, context, enumC1781i);
                }
            });
            return;
        }
        if (C1804o.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (C1804o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.f49128f + "), listener=" + this.adListener);
        }
        t2.f(this.adListener, (MaxAd) this.f49128f, true);
    }

    @Override // com.applovin.impl.C1784j.b
    public void onCreativeIdGenerated(String str, String str2) {
        c3 c3Var = this.f49128f;
        if (c3Var == null || !c3Var.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f49128f.h(str2);
        t2.b(this.adReviewListener, str2, this.f49128f);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f49123a) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, C1802k c1802k, Context context) {
        super(str, maxAdFormat, str2, c1802k);
        this.f49127e = new Object();
        this.f49128f = null;
        this.f49129g = c.IDLE;
        this.f49130h = new AtomicBoolean();
        this.f49131i = new AtomicBoolean();
        this.f49139q = new WeakReference(null);
        this.f49140r = new WeakReference(null);
        this.f49141s = new WeakReference(null);
        this.f49123a = aVar;
        this.f49125c = createAdListenerWrapper();
        this.f49126d = new com.applovin.impl.mediation.b(c1802k);
        this.f49124b = new WeakReference(context);
        c1802k.j().a(this);
        C1804o.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0708a
    public void onAdExpired(t1 t1Var) {
        Activity activityB;
        if (C1804o.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f49130h.set(true);
        a aVar = this.f49123a;
        if (aVar != null) {
            activityB = aVar.getActivity();
        } else {
            activityB = null;
        }
        if (activityB == null && (activityB = this.sdk.e().b()) == null) {
            e();
            this.f49125c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, EnumC1781i.EXPIRED, this.localExtraParameters, this.extraParameters, activityB, this.f49125c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, EnumC1781i enumC1781i) {
        Context context2;
        Context contextO = activity;
        if (activity != null) {
            context2 = contextO;
        } else if (context != null) {
            context2 = context;
        } else {
            if (this.sdk.u0() != null) {
                contextO = this.sdk.u0();
            } else {
                contextO = C1802k.o();
            }
            context2 = contextO;
        }
        this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, enumC1781i, this.localExtraParameters, this.extraParameters, context2, this.f49125c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            List listB = y2Var.b("mappk_urls");
            if (CollectionUtils.isEmpty(listB)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) listB));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(f2.a(y2Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(w3.a(y2Var, this.sdk)));
            this.sdk.p0().b(z4.f50997R, jSONObject.toString());
        }
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final Lifecycle lifecycle, Activity activity) {
        c3 c3Var;
        if (viewGroup != null && lifecycle != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(r3.k8)).booleanValue()) {
                C1804o.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                t2.a(this.adListener, (MaxAd) this.f49128f, (MaxError) maxErrorImpl, true);
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f49128f);
                return;
            }
            List listB = this.sdk.s0().b();
            if (this.sdk.s0().d() && listB != null && (c3Var = this.f49128f) != null && !listB.contains(c3Var.c())) {
                final String str3 = "Attempting to show ad from <" + this.f49128f.c() + "> which is not in the list of selected ad networks " + listB;
                C1804o.h(this.tag, str3);
                a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.Wre
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49176n.c(str3);
                    }
                });
                return;
            }
            if (activity == null) {
                activity = this.sdk.u0();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.CN3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49084n.a(str, str2, activity2, viewGroup, lifecycle);
                    }
                });
                return;
            }
            return;
        }
        C1804o.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (C1804o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f49128f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) this.f49128f, (MaxError) maxErrorImpl2, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f49128f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f49134l = false;
        this.f49139q = new WeakReference(activity);
        this.sdk.X().showFullscreenAd(this.f49128f, activity, this.localExtraParameters, this.extraParameters, this.f49125c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        c3 c3Var = this.f49128f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (C1804o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, Lifecycle lifecycle) {
        a(str, str2);
        this.f49134l = true;
        this.f49139q = new WeakReference(activity);
        this.f49140r = new WeakReference(viewGroup);
        this.f49141s = new WeakReference(lifecycle);
        this.sdk.X().showFullscreenAd(this.f49128f, viewGroup, lifecycle, activity, this.localExtraParameters, this.extraParameters, this.f49125c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        if (this.sdk.R() != null) {
            return this.sdk.R().e(this.adUnitId);
        }
        return this.sdk.Q().d(this.adUnitId);
    }

    private boolean a(Activity activity, final String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f49129g == c.DESTROYED) {
            boolean zC2 = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC2));
            if (zC2) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            C1804o.h(this.tag, str2);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (C1804o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + x3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f49128f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f49128f);
            }
            return false;
        }
        Long l2 = (Long) this.sdk.a(r3.V7);
        Long l5 = (Long) this.sdk.a(r3.O7);
        if (l2.longValue() > 0 && (this.f49128f.getTimeToLiveMillis() < l5.longValue() || this.f49130h.get())) {
            this.f49131i.set(true);
            this.sdk.q0().a(new C1797r6(this.sdk, "handleShowOnLoadTimeoutError", new Runnable() { // from class: com.applovin.impl.mediation.ads.fuX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49194n.a(str);
                }
            }), d6.b.TIMEOUT, l2.longValue());
            return false;
        }
        if (n7.a(C1802k.o()) != 0 && this.sdk.n0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!n7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(r3.f49871j8)).booleanValue()) {
                    C1804o.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (C1804o.a()) {
                        this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f49128f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                    }
                    t2.a(this.adListener, (MaxAd) this.f49128f, (MaxError) maxErrorImpl2, true);
                    this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f49128f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.H().e() && !this.sdk.H().d()) {
            return true;
        }
        C1804o.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (C1804o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f49128f + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) this.f49128f, (MaxError) maxErrorImpl3, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f49128f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.f49131i.compareAndSet(true, false)) {
            C1804o.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.H().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (C1804o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + x3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f49128f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f49128f);
            }
        }
    }

    private void a(String str, String str2) {
        this.f49126d.e(this.f49128f);
        this.f49128f.g(str);
        this.f49128f.f(str2);
        this.f49136n = str;
        this.f49137o = str2;
        this.f49138p = this.f49128f.getNetworkName();
        this.sdk.y().d(this.f49128f);
        if (C1804o.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f49128f + "...");
        }
        a((y2) this.f49128f);
    }

    private void a() {
        c3 c3Var;
        synchronized (this.f49127e) {
            c3Var = this.f49128f;
            this.f49128f = null;
        }
        this.sdk.X().destroyAd(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l2) {
        this.f49133k += l2.longValue();
        this.sdk.p0().b(z4.f50998S, Long.valueOf(this.f49133k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var) {
        if (this.sdk.f().a(c3Var, this)) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + c3Var);
            }
            this.f49128f = c3Var;
            return;
        }
        if (C1804o.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z2;
        c cVar2 = this.f49129g;
        synchronized (this.f49127e) {
            try {
                c cVar3 = c.IDLE;
                if (cVar2 == cVar3) {
                    if (cVar == c.LOADING || cVar == c.DESTROYED) {
                        z2 = true;
                    } else {
                        if (cVar == c.SHOWING) {
                            C1804o.h(this.tag, "No ad is loading or loaded");
                        } else if (C1804o.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                        }
                        z2 = false;
                    }
                } else {
                    c cVar4 = c.LOADING;
                    if (cVar2 == cVar4) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                C1804o.h(this.tag, "An ad is already loading");
                            } else if (cVar != c.READY) {
                                if (cVar == c.SHOWING) {
                                    C1804o.h(this.tag, "An ad is not ready to be shown yet");
                                } else if (cVar != c.DESTROYED) {
                                    if (C1804o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z2 = false;
                        }
                        z2 = true;
                    } else {
                        c cVar5 = c.READY;
                        if (cVar2 == cVar5) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    C1804o.h(this.tag, "An ad is already loaded");
                                } else if (cVar == cVar5) {
                                    if (C1804o.a()) {
                                        this.logger.b(this.tag, "An ad is already marked as ready");
                                    }
                                } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                    if (C1804o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                                z2 = false;
                            }
                            z2 = true;
                        } else {
                            c cVar6 = c.SHOWING;
                            if (cVar2 == cVar6) {
                                if (cVar != cVar3) {
                                    if (cVar == cVar4) {
                                        C1804o.h(this.tag, "Can not load another ad while the ad is showing");
                                    } else if (cVar == cVar5) {
                                        if (C1804o.a()) {
                                            this.logger.b(this.tag, "An ad is already showing, ignoring");
                                        }
                                    } else if (cVar == cVar6) {
                                        C1804o.h(this.tag, "The ad is already showing, not showing another one");
                                    } else if (cVar != c.DESTROYED) {
                                        if (C1804o.a()) {
                                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                        }
                                    }
                                }
                                z2 = true;
                            } else if (cVar2 == c.DESTROYED) {
                                C1804o.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (C1804o.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.f49129g);
                            }
                            z2 = false;
                        }
                    }
                }
                if (z2) {
                    if (C1804o.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.f49129g + " to " + cVar + "...");
                    }
                    this.f49129g = cVar;
                } else if (C1804o.a()) {
                    this.logger.k(this.tag, "Not allowed to transition from " + this.f49129g + " to " + cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((c3) maxAd);
        this.f49126d.a();
        a();
        this.sdk.a0().a((y2) maxAd);
    }
}
