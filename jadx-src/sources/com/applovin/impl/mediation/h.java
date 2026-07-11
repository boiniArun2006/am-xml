package com.applovin.impl.mediation;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import YgZ.uQga.IYJfqUyym;
import aT.dE.JLZo;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import androidx.view.Lifecycle;
import c8G.Fsz.qwlyMfUJj;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1797r6;
import com.applovin.impl.c3;
import com.applovin.impl.d5;
import com.applovin.impl.d6;
import com.applovin.impl.k3;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.r1;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.ads.internal.Constants;
import d8q.jqQ.QTafcm;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1802k f49363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1804o f49364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f49365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k3 f49366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f49367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAdapter f49368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f49369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y2 f49370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f49371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxNativeAd f49372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaxNativeAdView f49373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f49374m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MaxAdapterResponseParameters f49376o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f49380s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f49362a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f49375n = new b(this, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f49377p = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f49378q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f49379r = new AtomicBoolean(false);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class a implements MaxSignalCollectionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d5 f49381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.s4 f49382b;

        a(d5 d5Var, com.applovin.impl.s4 s4Var) {
            this.f49381a = d5Var;
            this.f49382b = s4Var;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f49381a.y() && TextUtils.isEmpty(str)) {
                this.f49382b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f49382b.b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f49382b.a(new MaxErrorImpl(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediationServiceImpl.b f49384a;

        private b() {
        }

        private void b(String str, final Bundle bundle) {
            if (h.this.f49370i.w().compareAndSet(false, true)) {
                a(str, this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.iwV
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49392n.i(bundle);
                    }
                });
            }
        }

        private void c(String str, final Bundle bundle) {
            if (!h.this.f49370i.w().get()) {
                h.this.f49379r.set(true);
                a(str, this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49429n.j(bundle);
                    }
                });
                return;
            }
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.b("MediationAdapterWrapper", h.this.f49367f + ": blocking ad loaded callback for " + h.this.f49370i + " since onAdHidden() has been called");
            }
            h.this.f49363b.t().a(h.this.f49370i, str);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        /* synthetic */ b(h hVar, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.f49384a.a(h.this.f49370i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.f49384a.a(h.this.f49370i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.f49384a.a(h.this.f49370i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.f49384a.c(h.this.f49370i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.f49384a.c(h.this.f49370i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.f49384a.e(h.this.f49370i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (h.this.f49378q.compareAndSet(false, true)) {
                this.f49384a.f(h.this.f49370i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.M
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48992n.a(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.Ln
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48989n.a();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.k("MediationAdapterWrapper", h.this.f49367f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(final Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.P
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49051n.b(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.k("MediationAdapterWrapper", h.this.f49367f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": adview ad loaded with extra info: " + bundle);
            }
            h.this.f49371j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(final Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.Zs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49071n.c(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.k("MediationAdapterWrapper", h.this.f49367f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d(qfEYuUHwj.dJbYYaZleThe, h.this.f49367f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.k("MediationAdapterWrapper", h.this.f49367f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.psW
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49413n.d(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.k("MediationAdapterWrapper", h.this.f49367f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.k("MediationAdapterWrapper", h.this.f49367f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(final Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.lej
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49399n.e(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.k("MediationAdapterWrapper", h.this.f49367f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": native ad loaded with extra info: " + bundle);
            }
            h.this.f49372k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.vd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49431n.f(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.k("MediationAdapterWrapper", h.this.f49367f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.k("MediationAdapterWrapper", h.this.f49367f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            C1804o unused = h.this.f49364c;
            if (C1804o.a()) {
                h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(final MaxReward maxReward, final Bundle bundle) {
            if (h.this.f49370i instanceof c3) {
                final c3 c3Var = (c3) h.this.f49370i;
                if (c3Var.t0().compareAndSet(false, true)) {
                    C1804o unused = h.this.f49364c;
                    if (C1804o.a()) {
                        h.this.f49364c.d("MediationAdapterWrapper", h.this.f49367f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.rv6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49424n.a(c3Var, maxReward, bundle);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.f49384a.d(h.this.f49370i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f49384a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.f49384a.a(h.this.f49370i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            if (h.this.f49370i.w().get()) {
                C1804o unused = h.this.f49364c;
                if (C1804o.a()) {
                    h.this.f49364c.b("MediationAdapterWrapper", h.this.f49367f + ": blocking ad load failed callback for " + h.this.f49370i + " since onAdHidden() has been called");
                }
                h.this.f49363b.t().a(h.this.f49370i, str);
                return;
            }
            a(str, this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.DAz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48978n.a(maxError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (h.this.f49378q.compareAndSet(false, true)) {
                this.f49384a.onAdLoadFailed(h.this.f49369h, maxError);
            }
        }

        private void a(String str, final Bundle bundle) {
            if (h.this.f49370i.w().get()) {
                C1804o unused = h.this.f49364c;
                if (C1804o.a()) {
                    h.this.f49364c.b("MediationAdapterWrapper", h.this.f49367f + ": blocking ad displayed callback for " + h.this.f49370i + " since onAdHidden() has been called");
                }
                h.this.f49363b.t().a(h.this.f49370i, str);
                return;
            }
            if (!((Boolean) h.this.f49363b.a(r3.w8)).booleanValue()) {
                if (h.this.f49370i.u().compareAndSet(false, true)) {
                    a(str, this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.K
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f48987n.h(bundle);
                        }
                    });
                    return;
                }
                return;
            }
            a(str, this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.Lu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48990n.g(bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError, final Bundle bundle) {
            if (h.this.f49370i.w().get()) {
                C1804o unused = h.this.f49364c;
                if (C1804o.a()) {
                    h.this.f49364c.b("MediationAdapterWrapper", h.this.f49367f + ": blocking ad display failed callback for " + h.this.f49370i + " since onAdHidden() has been called");
                }
                h.this.f49363b.t().a(h.this.f49370i, str);
                return;
            }
            a(str, this.f49384a, new Runnable() { // from class: com.applovin.impl.mediation.qf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49416n.a(maxError, bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f49384a.a(h.this.f49370i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var, MaxReward maxReward, Bundle bundle) {
            this.f49384a.a(c3Var, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.f49384a.a(h.this.f49370i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f49384a.onAdCollapsed(h.this.f49370i);
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            h.this.f49362a.post(new Runnable() { // from class: com.applovin.impl.mediation.Md
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49036n.a(runnable, maxAdListener, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                C1804o.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + (maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                h.this.f49363b.D().a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", h.this.f49366e.b()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static class c implements MaxAdapter.OnCompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1802k f49386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k3 f49387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f49388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final MaxAdapter.OnCompletionListener f49389d;

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49402n.a(initializationStatus, str);
                }
            }, this.f49387b.h());
        }

        public c(C1802k c1802k, k3 k3Var, long j2, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f49386a = c1802k;
            this.f49387b = k3Var;
            this.f49388c = j2;
            this.f49389d = onCompletionListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f49386a.S().a(this.f49387b, SystemClock.elapsedRealtime() - this.f49388c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f49389d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    private class d extends AbstractRunnableC1782i5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WeakReference f49390g;

        /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        private d() {
            super("TaskTimeoutMediatedAd", h.this.f49363b);
            this.f49390g = new WeakReference(h.this.f49375n);
        }

        private void b(y2 y2Var) {
            if (y2Var != null) {
                this.f48733a.Z().a(y2Var);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f49378q.get()) {
                return;
            }
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, h.this.f49367f + " is timing out " + h.this.f49370i + "...");
            }
            b(h.this.f49370i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.f49390g.get();
            if (bVar != null) {
                bVar.a(this.f48734b, maxErrorImpl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f49368g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f49375n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.f49368g;
        if (maxAdapter != null) {
            this.f49368g = null;
            maxAdapter.onDestroy();
        } else if (C1804o.a()) {
            this.f49364c.k("MediationAdapterWrapper", "Mediation adapter '" + this.f49367f + "' is already destroyed");
        }
        this.f49371j = null;
        this.f49372k = null;
        this.f49373l = null;
        this.f49374m = null;
    }

    public MediationServiceImpl.b c() {
        return this.f49375n.f49384a;
    }

    public View d() {
        return this.f49371j;
    }

    public MaxNativeAd e() {
        return this.f49372k;
    }

    public MaxNativeAdView f() {
        return this.f49373l;
    }

    public String g() {
        return this.f49365d;
    }

    public ViewGroup h() {
        return this.f49374m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f49368g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            C1804o.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f49365d, th);
            this.f49363b.D().a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.f49366e.b()));
            a("sdk_version");
            this.f49363b.T().a(this.f49366e.b(), "sdk_version", this.f49370i);
            return null;
        }
    }

    public boolean j() {
        return this.f49378q.get() && this.f49379r.get();
    }

    public boolean k() {
        return this.f49377p.get();
    }

    public String toString() {
        return QTafcm.VZIytaCKGDdDtcS + this.f49367f + "'}";
    }

    h(k3 k3Var, MaxAdapter maxAdapter, boolean z2, C1802k c1802k) {
        if (k3Var != null) {
            if (maxAdapter != null) {
                if (c1802k != null) {
                    this.f49365d = k3Var.c();
                    this.f49368g = maxAdapter;
                    this.f49363b = c1802k;
                    this.f49364c = c1802k.O();
                    this.f49366e = k3Var;
                    this.f49367f = maxAdapter.getClass().getSimpleName();
                    this.f49380s = z2;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No adapter specified");
        }
        throw new IllegalArgumentException("No adapter name specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f49368g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f49375n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f49368g).loadNativeAd(maxAdapterResponseParameters, activity, this.f49375n);
    }

    void a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        b("initialize", new Runnable() { // from class: com.applovin.impl.mediation.QJ
            @Override // java.lang.Runnable
            public final void run() {
                this.f49057n.a(onCompletionListener, maxAdapterInitializationParameters, activity);
            }
        });
    }

    public void b(y2 y2Var, final Activity activity) {
        Runnable runnable;
        if (a(y2Var, activity)) {
            if (y2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49054n.a(activity);
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49421n.b(activity);
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.SPz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49059n.c(activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, y2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (C1804o.a()) {
            this.f49364c.a("MediationAdapterWrapper", "Initializing " + this.f49367f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f49366e.r());
        }
        this.f49368g.initialize(maxAdapterInitializationParameters, activity, new c(this.f49363b, this.f49366e, jElapsedRealtime, onCompletionListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedAdapter) this.f49368g).showRewardedAd(this.f49376o, activity, this.f49375n);
    }

    void a(String str, y2 y2Var) {
        this.f49369h = str;
        this.f49370i = y2Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f49373l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f49374m = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxAppOpenAdapter) this.f49368g).showAppOpenAd(this.f49376o, activity, this.f49375n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final y2 y2Var, final Activity activity, MediationServiceImpl.b bVar) {
        final Runnable runnable;
        if (y2Var != null) {
            if (!this.f49377p.get()) {
                String str2 = "Mediation adapter '" + this.f49367f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                C1804o.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f49376o = maxAdapterResponseParameters;
            this.f49375n.a(bVar);
            final MaxAdFormat format = y2Var.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.ci
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49225n.a(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g9s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49360n.b(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.afx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49215n.c(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.NATIVE) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49069n.d(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format.isAdViewAd()) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.Ew
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48983n.a(maxAdapterResponseParameters, format, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(Constants.LOAD_AD, format, new Runnable() { // from class: com.applovin.impl.mediation.nKK
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49408n.a(y2Var, runnable);
                }
            });
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f49368g).showRewardedAd(this.f49376o, viewGroup, lifecycle, activity, this.f49375n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f49368g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            C1804o.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f49365d, th);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("adapter_class", this.f49366e.b());
            r1 r1VarD = this.f49363b.D();
            String str = pTYaLzzmJSGAPQ.JcaBdOEzcxfw;
            r1VarD.a("MediationAdapterWrapper", str, th, mapHashMap);
            a(str);
            this.f49363b.T().a(this.f49366e.b(), str, this.f49370i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f49368g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f49375n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f49368g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f49375n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(y2 y2Var, Runnable runnable) {
        a(this.f49366e, y2Var);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.f49365d + " due to: " + th;
            String str2 = qwlyMfUJj.ssfNWBVcScrH;
            C1804o.h(str2, str);
            this.f49375n.a(Constants.LOAD_AD, new MaxErrorImpl(-1, str));
            this.f49363b.D().a(str2, Constants.LOAD_AD, th, CollectionUtils.hashMap(IYJfqUyym.HINWUCwozNSY, this.f49366e.b()));
            a(Constants.LOAD_AD);
            this.f49363b.T().a(this.f49366e.b(), Constants.LOAD_AD, this.f49370i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxInterstitialAdapter) this.f49368g).showInterstitialAd(this.f49376o, activity, this.f49375n);
    }

    public void a(y2 y2Var, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (a(y2Var, activity)) {
            if (y2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.s4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49427n.a(viewGroup, lifecycle, activity);
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.UGc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49062n.b(viewGroup, lifecycle, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, y2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f49368g).showInterstitialAd(this.f49376o, viewGroup, lifecycle, activity, this.f49375n);
    }

    private boolean a(y2 y2Var, Activity activity) {
        if (y2Var != null) {
            if (y2Var.A() == null) {
                C1804o.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f49375n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (y2Var.A() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != y2Var.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f49377p.get()) {
                    String str = "Mediation adapter '" + this.f49367f + "' is disabled. Showing ads with this adapter is disabled.";
                    C1804o.h("MediationAdapterWrapper", str);
                    this.f49375n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException("Mediation adapter '" + this.f49367f + "' does not have an ad loaded. Please load an ad first");
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(final Runnable runnable, y2 y2Var) {
        y2Var.d0();
        a("show_ad", y2Var.getFormat(), new Runnable() { // from class: com.applovin.impl.mediation.Xo
            @Override // java.lang.Runnable
            public final void run() {
                this.f49066n.a(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.f49365d + " due to: " + th;
            C1804o.h("MediationAdapterWrapper", str);
            this.f49375n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f49363b.D().a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.f49366e.b()));
            a("show_ad");
            this.f49363b.T().a(this.f49366e.b(), "show_ad", this.f49370i);
        }
    }

    void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final d5 d5Var, final Activity activity, final com.applovin.impl.s4 s4Var) {
        if (s4Var != null) {
            if (!this.f49377p.get()) {
                C1804o.h("MediationAdapterWrapper", "Mediation adapter '" + this.f49367f + "' is disabled. Signal collection ads with this adapter is disabled.");
                s4Var.a(new MaxErrorImpl("The adapter (" + this.f49367f + ") is disabled"));
                return;
            }
            MaxAdapter maxAdapter = this.f49368g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                b("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49437n.a(maxSignalProvider, maxAdapterSignalCollectionParameters, activity, d5Var, s4Var);
                    }
                });
                return;
            }
            s4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "The adapter (" + this.f49367f + ") does not support signal collection"));
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, d5 d5Var, com.applovin.impl.s4 s4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(d5Var, s4Var));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f49365d + " due to: " + th);
            C1804o.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            s4Var.a(maxErrorImpl);
            this.f49363b.D().a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.f49366e.b()));
            a("collect_signal");
            this.f49363b.T().a(this.f49366e.b(), "collect_signal", this.f49370i);
        }
        if (!s4Var.d() && d5Var.m() == 0) {
            if (C1804o.a()) {
                this.f49364c.a("MediationAdapterWrapper", "Failing signal collection " + d5Var + " since it has 0 timeout");
            }
            s4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + this.f49367f + ") has 0 timeout"));
        }
    }

    void a() {
        if (this.f49380s) {
            return;
        }
        b("destroy", new Runnable() { // from class: com.applovin.impl.mediation.l3D
            @Override // java.lang.Runnable
            public final void run() {
                this.f49398n.l();
            }
        });
    }

    private void a(k3 k3Var, y2 y2Var) {
        a(new d(this, null), k3Var, y2Var);
    }

    private void a(AbstractRunnableC1782i5 abstractRunnableC1782i5, k3 k3Var, y2 y2Var) {
        long jM = k3Var.m();
        if (jM <= 0) {
            if (C1804o.a()) {
                C1804o c1804o = this.f49364c;
                StringBuilder sb = new StringBuilder();
                sb.append("Non-positive timeout set for ");
                if (y2Var != null) {
                    k3Var = y2Var;
                }
                sb.append(k3Var);
                sb.append(", not scheduling a timeout");
                c1804o.a("MediationAdapterWrapper", sb.toString());
                return;
            }
            return;
        }
        if (C1804o.a()) {
            C1804o c1804o2 = this.f49364c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting timeout ");
            sb2.append(jM);
            sb2.append("ms for ");
            if (y2Var != null) {
                k3Var = y2Var;
            }
            sb2.append(k3Var);
            c1804o2.a("MediationAdapterWrapper", sb2.toString());
        }
        this.f49363b.q0().a(abstractRunnableC1782i5, d6.b.TIMEOUT, jM);
    }

    private void a(String str) {
        if (C1804o.a()) {
            this.f49364c.d("MediationAdapterWrapper", "Marking " + this.f49367f + " as disabled due to: " + str);
        }
        this.f49377p.set(false);
    }

    private void a(final String str, MaxAdFormat maxAdFormat, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.eO
            @Override // java.lang.Runnable
            public final void run() {
                this.f49327n.a(str, runnable);
            }
        };
        if (a(str, maxAdFormat)) {
            this.f49362a.post(runnable2);
            return;
        }
        C1797r6 c1797r6 = new C1797r6(this.f49363b, str + ":" + this.f49366e.c(), runnable2);
        if (((Boolean) this.f49363b.a(x4.f50806Z)).booleanValue()) {
            this.f49363b.q0().a(c1797r6, this.f49366e);
        } else {
            this.f49363b.q0().a(c1797r6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (C1804o.a()) {
                this.f49364c.a("MediationAdapterWrapper", this.f49367f + ": running " + str + "...");
            }
            runnable.run();
            if (C1804o.a()) {
                this.f49364c.a("MediationAdapterWrapper", this.f49367f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            C1804o.c("MediationAdapterWrapper", "Failed operation " + str + " for " + this.f49365d, th);
            StringBuilder sb = new StringBuilder();
            sb.append("fail_");
            sb.append(str);
            a(sb.toString());
            if (!str.equals("destroy")) {
                this.f49363b.T().a(this.f49366e.b(), str, this.f49370i);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.f49366e.b(), mapHashMap);
            this.f49363b.D().a("MediationAdapterWrapper", str, th, mapHashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolG0;
        Boolean boolI0;
        Boolean boolH0;
        MaxAdapter maxAdapter = this.f49368g;
        if (maxAdapter == null) {
            return this.f49366e.r();
        }
        if ("initialize".equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if (JLZo.uQvxyaOyaDGQ.equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if (Constants.LOAD_AD.equals(str) && maxAdFormat != null) {
            y2 y2Var = this.f49370i;
            if (y2Var != null && (boolH0 = y2Var.h0()) != null) {
                return boolH0.booleanValue();
            }
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            y2 y2Var2 = this.f49370i;
            if (y2Var2 != null && (boolI0 = y2Var2.i0()) != null) {
                return boolI0.booleanValue();
            }
            Boolean boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (boolShouldShowAdsOnUiThread != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            y2 y2Var3 = this.f49370i;
            if (y2Var3 != null && (boolG0 = y2Var3.g0()) != null) {
                return boolG0.booleanValue();
            }
            Boolean boolShouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (boolShouldDestroyOnUiThread != null) {
                return boolShouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.f49366e.r();
    }
}
