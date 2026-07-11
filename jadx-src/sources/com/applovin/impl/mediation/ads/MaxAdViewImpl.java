package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.AbstractC1798s;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1784j;
import com.applovin.impl.C1797r6;
import com.applovin.impl.EnumC1781i;
import com.applovin.impl.b3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements f.a, g8.a, C1784j.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f49090A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f49091B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f49092C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f49093D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdView f49095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f49097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f49098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b3 f49099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f49100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f49101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MaxAdViewConfiguration f49102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f49103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f49104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f f49105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f8 f49106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g8 f49107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f49108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f49109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b3 f49110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MaxAd f49111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f49112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f49113t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f49114u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f49115v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f49116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f49117x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f49118y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f49119z;

    private class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            C1804o c1804o = MaxAdViewImpl.this.logger;
            if (C1804o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            t2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                C1804o c1804o = MaxAdViewImpl.this.logger;
                if (C1804o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
                return;
            }
            b3 b3Var = (b3) maxAd;
            b3Var.g(MaxAdViewImpl.this.f49100g);
            b3Var.f(MaxAdViewImpl.this.f49101h);
            if (b3Var.y() == null) {
                MaxAdViewImpl.this.sdk.X().destroyAd(b3Var);
                onAdLoadFailed(b3Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (b3Var.w0()) {
                long jR0 = b3Var.r0();
                MaxAdViewImpl.this.sdk.O();
                if (C1804o.a()) {
                    MaxAdViewImpl.this.sdk.O().a(MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + jR0 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                }
                MaxAdViewImpl.this.f49105l.a(jR0);
                if (MaxAdViewImpl.this.f49105l.g() || MaxAdViewImpl.this.f49114u) {
                    C1804o c1804o2 = MaxAdViewImpl.this.logger;
                    if (C1804o.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f49105l.j();
                }
            }
            C1804o c1804o3 = MaxAdViewImpl.this.logger;
            if (C1804o.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                maxAdViewImpl3.logger.a(maxAdViewImpl3.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            t2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(b3Var);
        }
    }

    private abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0704a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f49110q)) {
                C1804o c1804o = MaxAdViewImpl.this.logger;
                if (C1804o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f49111r)) {
                MaxAdViewImpl.this.f49111r = null;
                if ((MaxAdViewImpl.this.f49110q.x0() || MaxAdViewImpl.this.f49091B) && MaxAdViewImpl.this.f49112s) {
                    MaxAdViewImpl.this.f49112s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                C1804o c1804o = MaxAdViewImpl.this.logger;
                if (C1804o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f49110q)) {
                C1804o c1804o = MaxAdViewImpl.this.logger;
                if (C1804o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f49110q)) {
                C1804o c1804o = MaxAdViewImpl.this.logger;
                if (C1804o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f49110q)) {
                MaxAdViewImpl.this.f49111r = maxAd;
                if ((MaxAdViewImpl.this.f49110q.x0() || MaxAdViewImpl.this.f49091B) && !MaxAdViewImpl.this.f49105l.g()) {
                    MaxAdViewImpl.this.f49112s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                C1804o c1804o = MaxAdViewImpl.this.logger;
                if (C1804o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f49110q)) {
                C1804o c1804o = MaxAdViewImpl.this.logger;
                if (C1804o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            C1804o c1804o = MaxAdViewImpl.this.logger;
            if (C1804o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            t2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C1804o c1804o = MaxAdViewImpl.this.logger;
            if (C1804o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            t2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    private class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            C1804o c1804o = MaxAdViewImpl.this.logger;
            if (C1804o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f49117x) {
                C1804o c1804o = MaxAdViewImpl.this.logger;
                if (C1804o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(r3.H7)).booleanValue()) {
                    MaxAdViewImpl.this.b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.a(maxAd);
                    return;
                }
            }
            C1804o c1804o2 = MaxAdViewImpl.this.logger;
            if (C1804o.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
        }
    }

    public void loadAd() {
        loadAd(EnumC1781i.PUBLISHER_INITIATED);
    }

    public void setPublisherBackgroundColor(int i2) {
        this.f49098e = i2;
    }

    public void startAutoRefresh() {
        this.f49114u = false;
        if (!this.f49105l.g()) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f49105l.m();
        if (C1804o.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f49105l.b() + "ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final b3 b3Var) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.w6
            @Override // java.lang.Runnable
            public final void run() {
                this.f49211n.b(b3Var);
            }
        });
    }

    private void e() {
        this.f49115v.set(false);
        if (this.f49099f != null) {
            i();
            return;
        }
        if (!b()) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(EnumC1781i.REFRESH);
        } else if (this.f49113t) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(EnumC1781i.REFRESH);
        } else {
            if (C1804o.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f49115v.set(true);
        }
    }

    private void f() {
        boolean z2;
        boolean z3;
        synchronized (this.f49109p) {
            try {
                z2 = false;
                this.f49115v.set(false);
                z3 = this.f49099f != null;
                if (!z3) {
                    if (b()) {
                        if (!this.f49113t) {
                            if (C1804o.a()) {
                                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                            }
                            this.f49115v.set(true);
                        } else if (C1804o.a()) {
                            this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                        }
                    } else if (C1804o.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network...");
                    }
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            i();
        } else if (z2) {
            loadAd(EnumC1781i.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h();
        if (this.f49099f != null) {
            this.sdk.X().destroyAd(this.f49099f);
        }
        synchronized (this.f49108o) {
            this.f49117x = true;
        }
        this.f49105l.a();
        this.sdk.j().b(this);
        if (this.sdk.R() != null) {
            this.sdk.R().c(this.adUnitId, this.f49096c);
        } else {
            this.sdk.Q().c(this.adUnitId, this.f49096c);
        }
        super.destroy();
    }

    private void h() {
        b3 b3Var;
        MaxAdView maxAdView = this.f49095b;
        if (maxAdView != null) {
            AbstractC1798s.a(maxAdView, this.f49097d);
        }
        this.f49107n.b();
        synchronized (this.f49108o) {
            b3Var = this.f49110q;
        }
        MaxAd maxAd = this.f49111r;
        if (maxAd != null && maxAd.equals(b3Var)) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            t2.b(this.f49103j, maxAd);
        }
        if (b3Var != null) {
            this.sdk.X().destroyAd(b3Var);
        }
    }

    private void i() {
        if (C1804o.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f49099f + "...");
        }
        this.f49103j.onAdLoaded(this.f49099f);
        this.f49099f = null;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        if (((Boolean) this.sdk.a(r3.I7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49196n.g();
                }
            });
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f49100g;
    }

    public void loadAd(EnumC1781i enumC1781i) {
        if (C1804o.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z2 = this.f49118y || ((Boolean) this.sdk.a(r3.f49867G7)).booleanValue();
        if (z2 && !this.f49105l.g() && this.f49105l.h()) {
            C1804o.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f49105l.b()) + " seconds.");
            return;
        }
        if (!z2) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(enumC1781i, this.f49103j);
        } else if (this.f49099f != null) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.f49116w) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f49115v.set(true);
        } else {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(enumC1781i, this.f49103j);
        }
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(r3.H7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.C1784j.b
    public void onCreativeIdGenerated(String str, String str2) {
        b3 b3Var = this.f49110q;
        if (b3Var != null && b3Var.Q().equalsIgnoreCase(str)) {
            this.f49110q.h(str2);
            t2.b(this.adReviewListener, str2, this.f49110q);
            return;
        }
        b3 b3Var2 = this.f49099f;
        if (b3Var2 == null || !b3Var2.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f49099f.h(str2);
    }

    @Override // com.applovin.impl.g8.a
    public void onLogVisibilityImpression() {
        a(this.f49110q, this.f49106m.a(this.f49110q));
    }

    public void onWindowVisibilityChanged(int i2) {
        if (((Boolean) this.sdk.a(r3.E7)).booleanValue() && this.f49105l.h()) {
            if (e8.b(i2)) {
                if (C1804o.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f49105l.d();
            } else {
                if (C1804o.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f49105l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f49110q != null && C1804o.a()) {
            this.logger.k(this.tag, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        n7.b(str, this.tag);
        this.f49101h = str;
    }

    public void setPlacement(String str) {
        if (this.f49110q != null && C1804o.a()) {
            this.logger.k(this.tag, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.f49100g = str;
    }

    public void stopAutoRefresh() {
        if (this.f49110q == null) {
            if (this.f49118y || ((Boolean) this.sdk.a(r3.f49867G7)).booleanValue()) {
                this.f49114u = true;
                return;
            } else {
                C1804o.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (C1804o.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f49105l.b() + "ms");
        }
        this.f49105l.j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f49095b) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", isDestroyed=");
        sb.append(a());
        sb.append('}');
        return sb.toString();
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).a());
        this.f49096c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f49098e = Long.MAX_VALUE;
        this.f49108o = new Object();
        this.f49109p = new Object();
        this.f49110q = null;
        this.f49111r = null;
        this.f49115v = new AtomicBoolean();
        this.f49117x = false;
        this.f49094a = context.getApplicationContext();
        this.f49095b = maxAdView;
        this.f49097d = view;
        this.f49103j = new b();
        this.f49104k = new d();
        this.f49105l = new f(this.sdk, this);
        this.f49106m = new f8(maxAdView, this.sdk);
        this.f49107n = new g8(maxAdView, this.sdk, this);
        this.f49102i = maxAdViewConfiguration;
        this.sdk.j().a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        if (C1804o.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final b3 b3Var) {
        View viewY = b3Var.y();
        String str = viewY == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f49095b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (C1804o.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (C1804o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + b3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) b3Var, (MaxError) maxErrorImpl, true);
            this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, b3Var);
            return;
        }
        h();
        a((y2) b3Var);
        if (b3Var.q0()) {
            this.f49107n.a(b3Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (b3Var.s0() != Long.MAX_VALUE) {
            this.f49097d.setBackgroundColor((int) b3Var.s0());
        } else {
            long j2 = this.f49098e;
            if (j2 != Long.MAX_VALUE) {
                this.f49097d.setBackgroundColor((int) j2);
            } else {
                this.f49097d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewY);
        a(viewY, b3Var);
        this.sdk.y().d(b3Var);
        c(b3Var);
        synchronized (this.f49108o) {
            this.f49110q = b3Var;
        }
        if (C1804o.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.X().processRawAdImpression(b3Var, this.f49103j);
        if (StringUtils.isValidString(this.f49110q.getAdReviewCreativeId())) {
            t2.a(this.adReviewListener, this.f49110q.getAdReviewCreativeId(), (MaxAd) this.f49110q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f49199n.a(b3Var);
            }
        }, b3Var.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (C1804o.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(EnumC1781i.SEQUENTIAL_OR_PRECACHE, this.f49104k);
    }

    private void d() {
        if (b()) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f49116w = true;
            this.sdk.q0().a((AbstractRunnableC1782i5) new C1797r6(this.sdk, "loadMaxAdForPrecacheRequest", new Runnable() { // from class: com.applovin.impl.mediation.ads.I28
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49089n.c();
                }
            }), d6.b.MEDIATION);
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    private void c(b3 b3Var) {
        int height = this.f49095b.getHeight();
        int width = this.f49095b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f49094a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f49094a, width);
            MaxAdFormat format = b3Var.getFormat();
            int height2 = (this.f49093D ? format.getAdaptiveSize(iPxToDp2, this.f49095b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), o0.b(this.f49094a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n**************************************************\n`MaxAdView` size ");
                sb.append(iPxToDp2);
                sb.append("x");
                sb.append(iPxToDp);
                sb.append(" dp smaller than required ");
                sb.append(this.f49093D ? "adaptive " : "");
                sb.append("size: ");
                sb.append(iMin);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String string = sb.toString();
                if (C1804o.a()) {
                    this.logger.b("AppLovinSdk", string);
                }
            }
        }
    }

    private void a(final EnumC1781i enumC1781i, final a.InterfaceC0704a interfaceC0704a) {
        if (a()) {
            boolean zC2 = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zC2));
            if (!zC2) {
                C1804o.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            }
            throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.Ml
            @Override // java.lang.Runnable
            public final void run() {
                this.f49168n.a(interfaceC0704a, enumC1781i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a.InterfaceC0704a interfaceC0704a, EnumC1781i enumC1781i) {
        int adaptiveWidth;
        b3 b3Var = this.f49110q;
        if (b3Var != null) {
            long jA = this.f49106m.a(b3Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f49110q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f49095b.getContext(), this.f49095b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f49095b.getContext(), this.f49095b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f49105l.g() || this.f49114u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f49119z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.f49102i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            C1804o.j(this.tag, "The requested adaptive ad view width (" + adaptiveWidth + " dp) is different from the MaxAdView width (" + iPxToDp + " dp).");
        }
        if (C1804o.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0704a + "...");
        }
        this.sdk.X().loadAd(this.adUnitId, this.f49096c, this.adFormat, enumC1781i, this.localExtraParameters, this.extraParameters, this.f49094a, interfaceC0704a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f49118y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Updated disable auto-retries to: " + str2);
            }
            this.f49119z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Updated precached disabled to: " + str2);
            }
            this.f49090A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.f49091B = Boolean.parseBoolean(str2);
            return;
        }
        if ("force_precache".equals(str)) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Updated force precache to: " + str2);
            }
            this.f49092C = Boolean.parseBoolean(str2);
            return;
        }
        if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Updated is adaptive banner to: " + str2);
            }
            if (this.f49102i == null) {
                C1804o.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://support.axon.ai/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.f49093D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f49116w = false;
        synchronized (this.f49109p) {
            try {
                zCompareAndSet = this.f49115v.compareAndSet(true, false);
                if (!zCompareAndSet) {
                    if (C1804o.a()) {
                        this.logger.a(this.tag, "Saving precache ad...");
                    }
                    b3 b3Var = (b3) maxAd;
                    this.f49099f = b3Var;
                    b3Var.g(this.f49100g);
                    this.f49099f.f(this.f49101h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zCompareAndSet) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f49103j.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.f49090A) {
            return false;
        }
        return ((Boolean) this.sdk.a(r3.N7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var) {
        long jA = this.f49106m.a(b3Var);
        if (!b3Var.q0()) {
            a(b3Var, jA);
        }
        a(jA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(r3.A7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.O();
            if (C1804o.a()) {
                this.sdk.O().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f49114u && !this.f49105l.g()) {
            this.f49113t = true;
            this.f49116w = false;
            long jLongValue = ((Long) this.sdk.a(r3.z7)).longValue();
            if (jLongValue >= 0) {
                this.sdk.O();
                if (C1804o.a()) {
                    this.sdk.O().a(this.tag, "Scheduling failed banner ad refresh " + jLongValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f49105l.a(jLongValue);
                return;
            }
            return;
        }
        if (this.f49116w) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f49116w = false;
        }
        if (this.f49115v.get()) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(View view, b3 b3Var) {
        int iV0 = b3Var.v0();
        int iT0 = b3Var.t0();
        int iDpToPx = iV0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iV0);
        int iDpToPx2 = iT0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iT0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Pinning ad view to MAX ad view with width: " + iDpToPx + " and height: " + iDpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i2 : e8.a(this.f49095b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i2);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(b3 b3Var, long j2) {
        if (C1804o.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.X().processViewabilityAdImpressionPostback(b3Var, j2, this.f49103j);
    }

    private void a(long j2) {
        if (n7.a(j2, ((Long) this.sdk.a(r3.M7)).longValue()) && !this.f49092C) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j2) + ", undesired: " + Long.toBinaryString(j2));
            }
            if (C1804o.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f49113t = true;
            return;
        }
        if (C1804o.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f49113t = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f49116w = false;
        if (this.f49115v.compareAndSet(true, false)) {
            if (C1804o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f49103j.onAdLoaded(maxAd);
            return;
        }
        if (C1804o.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        b3 b3Var = (b3) maxAd;
        this.f49099f = b3Var;
        b3Var.g(this.f49100g);
        this.f49099f.f(this.f49101h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z2;
        synchronized (this.f49108o) {
            z2 = this.f49117x;
        }
        return z2;
    }
}
