package com.applovin.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.AbstractC1775d;
import com.applovin.impl.C1786m;
import com.applovin.impl.C1813w;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class l extends n3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, C1813w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1802k f48830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1793n f48831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i8 f48832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1786m f48833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdView f48834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f48835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f48836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f48837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdView f48838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f48839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxAd f48840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f48841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f48842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ListView f48843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f48844o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f48845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f48846q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1813w f48847r;

    class a extends MaxNativeAdListener {
        a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (l.this.f48840k != null) {
                l.this.f48839j.destroy(l.this.f48840k);
            }
            l.this.f48840k = maxAd;
            l.this.f48839j.render(l.this.f48838i, maxAd);
            l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        this.f48845p.setControlState(AdControlButton.b.LOAD);
        this.f48846q.setText("");
        if (204 == maxError.getCode()) {
            n7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        n7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f48833d.k());
        this.f48843n = (ListView) findViewById(R.id.listView);
        this.f48844o = findViewById(R.id.ad_presenter_view);
        this.f48845p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f48846q = (TextView) findViewById(R.id.status_textview);
        this.f48843n.setAdapter((ListAdapter) this.f48833d);
        this.f48846q.setText(a());
        this.f48846q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f48845p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f48844o.setBackground(layerDrawable);
    }

    private void b() {
        String strC = this.f48831b.c();
        if (this.f48831b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f48831b.a());
            this.f48834e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", V8ValueBoolean.FALSE);
            this.f48834e.setExtraParameter("disable_auto_retries", "true");
            this.f48834e.setExtraParameter("disable_precache", "true");
            this.f48834e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f48834e.stopAutoRefresh();
            this.f48834e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f48831b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC);
            this.f48835f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f48835f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f48831b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC);
            this.f48836g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f48836g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f48831b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC);
            this.f48837h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f48837h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f48831b.a()) {
            this.f48838i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), C1802k.o());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC);
            this.f48839j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f48839j.setNativeAdListener(new a());
            this.f48839j.setRevenueListener(this);
        }
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        return this.f48830a;
    }

    public void initialize(final C1793n c1793n, @Nullable final C1794o c1794o, @Nullable i8 i8Var, final C1802k c1802k) {
        List listA;
        this.f48830a = c1802k;
        this.f48831b = c1793n;
        this.f48832c = i8Var;
        this.f48842m = c1802k.s0().b();
        C1786m c1786m = new C1786m(c1793n, c1794o, i8Var, this);
        this.f48833d = c1786m;
        c1786m.a(new s2.a() { // from class: com.applovin.impl.oXP
            @Override // com.applovin.impl.s2.a
            public final void a(j2 j2Var, r2 r2Var) {
                this.f49630n.a(c1802k, c1793n, c1794o, j2Var, r2Var);
            }
        });
        b();
        if (c1793n.f().f()) {
            if ((i8Var != null && !i8Var.b().d().C()) || (listA = c1802k.U().a(c1793n.c())) == null || listA.isEmpty()) {
                return;
            }
            this.f48847r = new C1813w(listA, c1793n.a(), getApplicationContext(), this);
        }
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
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f48845p.setControlState(AdControlButton.b.LOAD);
        this.f48846q.setText("");
        n7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
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

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        this.f48846q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f48845p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f48834e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f48831b.a()) {
            a(this.f48838i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f48830a.s0().c()) {
            n7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f48833d.j() != this.f48831b.f()) {
            n7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f48831b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            C1813w c1813w = this.f48847r;
            if (c1813w != null) {
                c1813w.a();
                return;
            } else {
                a(maxAdFormatA);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatA.isAdViewAd() && maxAdFormatA != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(maxAdFormatA);
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final C1802k c1802k, final C1793n c1793n, final C1794o c1794o, j2 j2Var, final r2 r2Var) {
        if (r2Var instanceof C1786m.b) {
            AbstractC1775d.a(this, MaxDebuggerAdUnitDetailActivity.class, c1802k.e(), new AbstractC1775d.b() { // from class: com.applovin.impl.U4
                @Override // com.applovin.impl.AbstractC1775d.b
                public final void a(Activity activity) {
                    l.a(r2Var, c1793n, c1794o, c1802k, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    @Override // com.applovin.impl.C1813w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f48834e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f48835f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f48836g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f48837h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f48839j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f48832c != null) {
            this.f48830a.s0().a(this.f48842m);
        }
        MaxAdView maxAdView = this.f48834e;
        if (maxAdView != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView);
        }
        MaxInterstitialAd maxInterstitialAd = this.f48835f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f48836g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f48837h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f48839j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f48840k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f48839j.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(r2 r2Var, C1793n c1793n, C1794o c1794o, C1802k c1802k, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c1793n, c1794o, ((C1786m.b) r2Var).v(), c1802k);
    }

    @Override // com.applovin.impl.C1813w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f48834e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f48835f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f48836g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f48837h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f48839j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append("Loading live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        i8 i8Var = this.f48832c;
        sb.append(i8Var != null ? i8Var.b().a() : this.f48833d.j().c());
        C1804o.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (this.f48832c != null) {
            this.f48830a.s0().a(this.f48832c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f48834e.setPlacement("[Mediation Debugger Live Ad]");
            this.f48834e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f48831b.a()) {
            this.f48835f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f48831b.a()) {
            this.f48836g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f48831b.a()) {
            this.f48837h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f48831b.a()) {
            this.f48839j.setPlacement("[Mediation Debugger Live Ad]");
            this.f48839j.loadAd();
        } else {
            n7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f48841l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.f48841l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.V1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f47848n.a(dialogInterface);
            }
        });
        this.f48841l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f48841l = null;
    }

    private String a() {
        if (this.f48830a.s0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.f48833d.j() != this.f48831b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append("Showing live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        i8 i8Var = this.f48832c;
        sb.append(i8Var != null ? i8Var.b().a() : this.f48833d.j().c());
        C1804o.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f48834e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f48831b.a()) {
            this.f48835f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f48831b.a()) {
            this.f48836g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f48831b.a()) {
            this.f48837h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f48831b.a()) {
            a(this.f48838i, MaxAdFormat.MREC.getSize());
        }
    }
}
