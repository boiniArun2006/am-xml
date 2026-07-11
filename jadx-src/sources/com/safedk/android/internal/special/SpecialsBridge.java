package com.safedk.android.internal.special;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class SpecialsBridge {
    public static void appLovinAdViewRenderAd(AppLovinAdView targetInstance, AppLovinAd appLovinAd) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinAdViewRenderAd(Lcom/applovin/adview/AppLovinAdView;Lcom/applovin/sdk/AppLovinAd;)V");
        if (SafeDK.ad()) {
            Logger.d("SafeDK-Special", "appLovinAdViewRenderAd started, ad: ", appLovinAd);
            try {
                if (AppLovinAdSize.INTERSTITIAL.equals(appLovinAd.getSize())) {
                    String clCode = ((AppLovinAdBase) appLovinAd).getClCode();
                    BrandSafetyEvent.AdFormatType adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                    Logger.d("SafeDK-Special", "appLovinAdViewRenderAd clcode:", clCode, " ad: ", appLovinAd, " formatType: ", adFormatType);
                    CreativeInfoManager.a(h.f63161a, "clcode=" + clCode + "&", adFormatType, targetInstance);
                }
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "appLovinAdViewRenderAd failed");
            }
        }
        targetInstance.renderAd(appLovinAd);
    }

    public static void maxAdViewDestroy(MaxAdView targetInstance) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->maxAdViewDestroy(Lcom/applovin/mediation/ads/MaxAdView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "maxAdViewDestroy started ", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(targetInstance);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "maxAdViewDestroy failed");
            }
        }
        targetInstance.destroy();
    }

    public static void maxNativeAdListenerOnNativeAdLoaded(MaxNativeAdListener targetInstance, MaxNativeAdView nativeAdView, MaxAd ad) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->maxNativeAdListenerOnNativeAdLoaded(Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)V");
        targetInstance.onNativeAdLoaded(nativeAdView, ad);
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "maxNativeAdListenerOnNativeAdLoaded Impl started, nativeAdView: ", nativeAdView, ", ad: ", ad, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.onMaxNativeAdLoaded(nativeAdView, ad);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "maxNativeAdListenerOnNativeAdLoaded failed", th);
            }
        }
    }

    public static void appLovinAdViewEventListenerAdOpenedFullscreen(AppLovinAdViewEventListener targetInstance, AppLovinAd ad, AppLovinAdView adView) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinAdViewEventListenerAdOpenedFullscreen(Lcom/applovin/adview/AppLovinAdViewEventListener;Lcom/applovin/sdk/AppLovinAd;Lcom/applovin/adview/AppLovinAdView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", LHbnkhI.rum, ad, ", adView: ", adView, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                BrandSafetyUtils.a(h.f63161a, (String) null, (String) null, RedirectEvent.f62801i);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "appLovinAdViewEventListenerAdOpenedFullscreen failed", th);
            }
        }
        targetInstance.adOpenedFullscreen(ad, adView);
    }

    public static void appLovinMaxAdViewAdListenerOnAdExpanded(MaxAdViewAdListener targetInstance, MaxAd ad) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinMaxAdViewAdListenerOnAdExpanded(Lcom/applovin/mediation/MaxAdViewAdListener;Lcom/applovin/mediation/MaxAd;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "appLovinMaxAdViewAdListenerOnAdExpanded started, ad: ", ad, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                BrandSafetyUtils.f();
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "appLovinMaxAdViewAdListenerOnAdExpanded failed", th);
            }
        }
        targetInstance.onAdExpanded(ad);
    }

    public static void fyberOnImpression(OnGlobalImpressionDataListener targetInstance, String spotId, String creativeId, ImpressionData impressionData) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->fyberOnImpression(Lcom/fyber/inneractive/sdk/external/OnGlobalImpressionDataListener;Ljava/lang/String;Ljava/lang/String;Lcom/fyber/inneractive/sdk/external/ImpressionData;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "fyberOnImpression started, spotId=", spotId, ", creativeId=", creativeId, ", impressionData = ", impressionData.toString(), ", isOnUiThread=", Boolean.valueOf(n.c()));
                CreativeInfoManager.b(h.f63176p, impressionData, (Object) null);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "Error in fyberOnImpression", th);
            }
        }
        targetInstance.onImpression(spotId, creativeId, impressionData);
    }

    public static void fyberOnAdExpanded(InneractiveAdViewEventsListener targetInstance, InneractiveAdSpot adSpot) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->fyberOnAdExpanded(Lcom/fyber/inneractive/sdk/external/InneractiveAdViewEventsListener;Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "fyberOnAdExpanded started", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                BrandSafetyUtils.a(h.f63176p, (String) null, (String) null, RedirectEvent.f62801i);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "Error in fyberOnAdExpanded", th);
            }
        }
        targetInstance.onAdExpanded(adSpot);
    }
}
