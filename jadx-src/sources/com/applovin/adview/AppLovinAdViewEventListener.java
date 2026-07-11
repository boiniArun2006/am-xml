package com.applovin.adview;

import com.applovin.sdk.AppLovinAd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface AppLovinAdViewEventListener {
    void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView);

    void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode);

    void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView);

    void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView);
}
