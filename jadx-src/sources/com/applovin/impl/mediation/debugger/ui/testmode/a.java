package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.C1813w;
import com.applovin.impl.e3;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.n3;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.special.SpecialsBridge;
import com.safedk.android.utils.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class a extends n3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, C1813w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e3 f49267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1802k f49268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaxAdView f49269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaxAdView f49270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f49271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f49272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f49273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxAd f49274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f49275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f49276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f49277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AdControlButton f49278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdControlButton f49279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdControlButton f49280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AdControlButton f49281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f49282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AdControlButton f49283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Button f49284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Button f49285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FrameLayout f49286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f49287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Switch f49288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Switch f49289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f49290x;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    class C0705a extends MaxNativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f49291a;

        C0705a(MaxNativeAdView maxNativeAdView) {
            this.f49291a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f49274h != null) {
                a.this.f49275i.destroy(a.this.f49274h);
            }
            a.this.f49274h = maxAd;
            a.this.f49275i.render(this.f49291a, maxAd);
            a.this.f49287u.removeAllViews();
            a.this.f49287u.addView(this.f49291a);
            a.this.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f49270d.removeAllViews();
        this.f49279m.setControlState(AdControlButton.b.LOAD);
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        n7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f49267a == null) {
            C1804o.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f49267a.g() + " Test Ads");
        this.f49276j = this.f49268b.s0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f49284r = (Button) findViewById(R.id.show_mrec_button);
        this.f49285s = (Button) findViewById(R.id.show_native_button);
        if (this.f49267a.I() && this.f49267a.r().contains(MaxAdFormat.MREC)) {
            this.f49287u.setVisibility(8);
            this.f49284r.setBackgroundColor(-1);
            this.f49285s.setBackgroundColor(-3355444);
            this.f49284r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49293n.a(view);
                }
            });
            this.f49285s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49294n.b(view);
                }
            });
        } else {
            this.f49284r.setVisibility(8);
            this.f49285s.setVisibility(8);
        }
        this.f49288v = (Switch) findViewById(R.id.native_banner_switch);
        this.f49289w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f49267a.J()) {
            this.f49288v.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.w6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49295n.c(view);
                }
            });
            this.f49289w.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.Ml
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49266n.d(view);
                }
            });
        } else {
            this.f49288v.setVisibility(8);
            this.f49289w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.f49267a.e()) || this.f49267a.d() == null || this.f49267a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.f49267a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap map = new HashMap(this.f49267a.d().size());
        for (MaxAdFormat maxAdFormat : this.f49267a.d().keySet()) {
            map.put(maxAdFormat, new C1813w((x) this.f49267a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.f49290x = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f49287u.setVisibility(0);
        this.f49286t.setVisibility(8);
        this.f49285s.setBackgroundColor(-1);
        this.f49284r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f49269c.removeAllViews();
        this.f49278l.setControlState(AdControlButton.b.LOAD);
    }

    private void e() {
        List listR = this.f49267a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f49267a.m();
        this.f49277k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f49268b.y0(), this);
        this.f49273g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.f49273g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f49282p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f49282p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        return this.f49268b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f49267a.x() == null || !this.f49267a.x().containsKey(maxAdFormat)) ? this.f49267a.m() : (String) this.f49267a.x().get(maxAdFormat);
    }

    public void initialize(e3 e3Var) {
        this.f49267a = e3Var;
        this.f49268b = e3Var.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        n7.a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        n7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        n7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        n7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        n7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.impl.C1813w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f49269c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f49270d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f49271e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f49272f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f49273g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f49275i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f49286t.setVisibility(0);
        this.f49287u.setVisibility(8);
        this.f49284r.setBackgroundColor(-1);
        this.f49285s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f49287u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f49267a.I()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f49275i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f49275i.setNativeAdListener(new C0705a(maxNativeAdView));
            this.f49275i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f49283q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f49283q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f49287u.setVisibility(8);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        n7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (!maxAd.getFormat().isAdViewAd() && !maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            Map map = this.f49290x;
            if (map != null && map.get(format) != null) {
                ((C1813w) this.f49290x.get(format)).a();
                return;
            } else {
                a(format);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(bVar);
            b(format);
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f49268b.s0().a(this.f49276j);
        MaxAdView maxAdView = this.f49269c;
        if (maxAdView != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView);
        }
        MaxAdView maxAdView2 = this.f49270d;
        if (maxAdView2 != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView2);
        }
        MaxInterstitialAd maxInterstitialAd = this.f49271e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f49273g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f49275i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f49274h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f49275i.destroy();
        }
    }

    private void c() {
        this.f49286t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f49267a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f49268b.y0(), this);
            this.f49270d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f49270d.setExtraParameter("disable_precache", "true");
            this.f49270d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f49270d.stopAutoRefresh();
            this.f49270d.setListener(this);
            this.f49286t.addView(this.f49270d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f49279m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f49279m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f49286t.setVisibility(8);
    }

    @Override // com.applovin.impl.C1813w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f49270d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f49271e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f49272f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f49273g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f49275i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f49269c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void b() {
        List listR = this.f49267a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f49268b.y0(), this);
            this.f49271e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f49271e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f49280n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f49280n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f49267a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f49268b.y0(), this);
            this.f49269c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", V8ValueBoolean.FALSE);
            this.f49269c.setExtraParameter("disable_auto_retries", "true");
            this.f49269c.setExtraParameter("disable_precache", "true");
            this.f49269c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f49269c.stopAutoRefresh();
            this.f49269c.setListener(this);
            frameLayout.addView(this.f49269c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f49278l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f49278l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        C1804o.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f49267a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f49271e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f49272f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f49273g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        C1804o.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f49267a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z2 = false;
        boolean z3 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f49288v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f49289w.isChecked()) {
            z2 = true;
        }
        if (!z3 && !z2) {
            this.f49268b.s0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f49268b.s0().a(this.f49267a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f49269c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f49270d.loadAd();
            this.f49284r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f49271e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f49272f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f49273g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f49275i.loadAd();
            this.f49285s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f49279m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f49280n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f49281o;
            }
            if (str.equals(this.f49277k)) {
                return this.f49282p;
            }
            if (str.equals("test_mode_native")) {
                return this.f49283q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.f49278l;
    }
}
