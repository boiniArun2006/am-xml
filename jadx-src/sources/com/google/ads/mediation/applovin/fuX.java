package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class fuX {
    public String rl() {
        return AppLovinSdk.VERSION;
    }

    public AppLovinSdk n(Context context) {
        return AppLovinSdk.getInstance(context);
    }
}
