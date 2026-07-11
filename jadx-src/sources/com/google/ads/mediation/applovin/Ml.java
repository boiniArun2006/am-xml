package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Ml {
    private static Ml rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f57263n = new fuX();

    class j implements AppLovinSdk.SdkInitializationListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ n f57264n;

        j(n nVar) {
            this.f57264n = nVar;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            this.f57264n.onInitializeSuccess();
        }
    }

    public interface n {
        void onInitializeSuccess();
    }

    public static Ml n() {
        if (rl == null) {
            rl = new Ml();
        }
        return rl;
    }

    public void rl(Context context, String str, n nVar) {
        this.f57263n.n(context).initialize(AppLovinSdkInitializationConfiguration.builder(str).setMediationProvider("admob").setPluginVersion(BuildConfig.ADAPTER_VERSION).build(), new j(nVar));
    }

    public AppLovinSdk t(Context context) {
        return this.f57263n.n(context);
    }

    private Ml() {
    }
}
