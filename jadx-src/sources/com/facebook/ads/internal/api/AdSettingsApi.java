package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
public interface AdSettingsApi {
    boolean isTestMode(Context context);

    void turnOnDebugger();
}
