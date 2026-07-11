package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.mediation.adapter.MaxAdapterError;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface MaxAdViewAdapterListener extends MaxAdapterListener {
    void onAdViewAdClicked();

    void onAdViewAdClicked(@Nullable Bundle bundle);

    void onAdViewAdCollapsed();

    void onAdViewAdCollapsed(@Nullable Bundle bundle);

    void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, @Nullable Bundle bundle);

    void onAdViewAdDisplayed();

    void onAdViewAdDisplayed(@Nullable Bundle bundle);

    void onAdViewAdExpanded();

    void onAdViewAdExpanded(@Nullable Bundle bundle);

    void onAdViewAdHidden();

    void onAdViewAdHidden(@Nullable Bundle bundle);

    void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError);

    void onAdViewAdLoaded(View view);

    void onAdViewAdLoaded(View view, @Nullable Bundle bundle);
}
