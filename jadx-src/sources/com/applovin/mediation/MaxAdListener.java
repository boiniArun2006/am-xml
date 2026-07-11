package com.applovin.mediation;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface MaxAdListener {
    void onAdClicked(@NonNull MaxAd maxAd);

    void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError);

    void onAdDisplayed(@NonNull MaxAd maxAd);

    void onAdHidden(@NonNull MaxAd maxAd);

    void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError);

    void onAdLoaded(@NonNull MaxAd maxAd);
}
