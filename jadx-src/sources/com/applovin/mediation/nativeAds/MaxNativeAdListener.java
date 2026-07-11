package com.applovin.mediation.nativeAds;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class MaxNativeAdListener {
    public void onNativeAdClicked(@NonNull MaxAd maxAd) {
    }

    public void onNativeAdExpired(@NonNull MaxAd maxAd) {
    }

    public void onNativeAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
    }

    public void onNativeAdLoaded(@Nullable MaxNativeAdView maxNativeAdView, @NonNull MaxAd maxAd) {
    }
}
