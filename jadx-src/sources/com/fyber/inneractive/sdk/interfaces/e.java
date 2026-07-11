package com.fyber.inneractive.sdk.interfaces;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.Orientation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface e {
    void destroy();

    void disableCloseButton();

    void dismissAd(boolean z2);

    View getCloseButton();

    ViewGroup getLayout();

    boolean isCloseButtonDisplay();

    void secondEndCardWasDisplayed();

    void setActivityOrientation(boolean z2, Orientation orientation);

    void showCloseButton(boolean z2, int i2, int i3);

    void showCloseCountdown();

    void updateCloseCountdown(int i2);

    boolean wasDismissedByUser();
}
