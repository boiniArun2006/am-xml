package com.google.ads.mediation.applovin;

import android.content.Context;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdSize;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AppLovinAdView f57272n;
    private final FrameLayout rl;

    public static n rl(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, AdSize adSize, Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        return new n(appLovinSdk, appLovinAdSize, frameLayout, context);
    }

    public void J2(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f57272n.setAdViewEventListener(appLovinAdViewEventListener);
    }

    public void O(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f57272n.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public FrameLayout n() {
        return this.rl;
    }

    public void nr(AppLovinAdClickListener appLovinAdClickListener) {
        this.f57272n.setAdClickListener(appLovinAdClickListener);
    }

    public void t(AppLovinAd appLovinAd) {
        this.f57272n.renderAd(appLovinAd);
    }

    private n(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, FrameLayout frameLayout, Context context) {
        AppLovinAdView appLovinAdView = new AppLovinAdView(appLovinSdk, appLovinAdSize, context);
        this.f57272n = appLovinAdView;
        this.rl = frameLayout;
        frameLayout.addView(appLovinAdView);
    }
}
