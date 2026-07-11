package com.google.ads.mediation.vungle;

import android.content.Context;
import com.vungle.ads.InitializationListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface j {
    String getSdkVersion();

    boolean isInitialized();

    void n(Context context, String str, InitializationListener initializationListener);

    String rl(Context context);
}
