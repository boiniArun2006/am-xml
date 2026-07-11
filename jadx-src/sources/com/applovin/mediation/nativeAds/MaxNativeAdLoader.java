package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.C1802k;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class MaxNativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f51081a;

    public MaxNativeAdLoader(String str) {
        this(str, C1802k.o());
    }

    public void destroy() {
        this.f51081a.logApiCall("destroy()");
        this.f51081a.destroy();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->render(Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)Z");
        CreativeInfoManager.onMaxNativeAdLoaded(maxNativeAdView, maxAd);
        return safedk_MaxNativeAdLoader_render_15e187b196d84406225bb047dba3a142(maxNativeAdView, maxAd);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f51081a.logApiCall("a()");
        this.f51081a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f51081a.logApiCall("b()");
        this.f51081a.handleNativeAdViewRendered(maxAd);
    }

    public String getAdUnitId() {
        return this.f51081a.getAdUnitId();
    }

    public String getPlacement() {
        this.f51081a.logApiCall("getPlacement()");
        return this.f51081a.getPlacement();
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f51081a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f51081a.loadAd(maxNativeAdView);
    }

    public boolean safedk_MaxNativeAdLoader_render_15e187b196d84406225bb047dba3a142(MaxNativeAdView p0, MaxAd p1) {
        this.f51081a.logApiCall("render(adView=" + p0 + ", ad=" + p1 + ")");
        return this.f51081a.render(p0, p1);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f51081a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f51081a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f51081a.logApiCall("setCustomData(value=" + str + ")");
        this.f51081a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f51081a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f51081a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f51081a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + YjqZUJsVmhcjko.Vzj);
        this.f51081a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f51081a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f51081a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f51081a.logApiCall("setPlacement(placement=" + str + ")");
        this.f51081a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f51081a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f51081a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f51081a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void destroy(MaxAd maxAd) {
        this.f51081a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f51081a.destroy(maxAd);
    }
}
