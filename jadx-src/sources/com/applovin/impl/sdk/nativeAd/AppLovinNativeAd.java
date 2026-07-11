package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface AppLovinNativeAd {
    void destroy();

    long getAdIdNumber();

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Uri getIconUri();

    AppLovinMediaView getMediaView();

    AppLovinOptionsView getOptionsView();

    Double getStarRating();

    String getTitle();

    void registerViewsForInteraction(List<View> list, ViewGroup viewGroup);

    void unregisterViewsForInteraction();
}
