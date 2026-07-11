package com.applovin.mediation.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.C1802k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class MaxAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f51060a;

    public MaxAppOpenAd(@NonNull String str) {
        this(str, C1802k.o());
    }

    public void showAd() {
        showAd(null);
    }

    @Deprecated
    public MaxAppOpenAd(@NonNull String str, @NonNull Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f51060a.logApiCall("destroy()");
        this.f51060a.destroy();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f51060a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f51060a.isReady();
        this.f51060a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f51060a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f51060a.logApiCall("loadAd()");
        this.f51060a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f51060a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f51060a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f51060a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f51060a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(@NonNull String str, @Nullable String str2) {
        this.f51060a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f51060a.setExtraParameter(str, str2);
    }

    public void setListener(@Nullable MaxAdListener maxAdListener) {
        this.f51060a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f51060a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(@NonNull String str, @Nullable Object obj) {
        this.f51060a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f51060a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f51060a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f51060a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(@Nullable MaxAdRevenueListener maxAdRevenueListener) {
        this.f51060a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f51060a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(@Nullable String str) {
        showAd(str, null);
    }

    @NonNull
    public String toString() {
        return "" + this.f51060a;
    }

    @Deprecated
    public MaxAppOpenAd(@NonNull String str, @NonNull AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, C1802k.o());
    }

    public void showAd(@Nullable String str, @Nullable String str2) {
        this.f51060a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        n7.b(str2, "MaxAppOpenAd");
        this.f51060a.showAd(str, str2, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + QiDPjiOCZHDS.DkIklhv + appLovinSdk + ", context=" + context + ")");
        this.f51060a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }
}
