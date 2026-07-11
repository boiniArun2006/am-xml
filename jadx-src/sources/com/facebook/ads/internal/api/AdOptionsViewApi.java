package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.facebook.ads.AdClosedListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
@UiThread
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int i2);

    void setIconSizeDp(int i2);

    void setOnAdClosedListener(AdClosedListener adClosedListener);

    void setSingleIcon(boolean z2);
}
