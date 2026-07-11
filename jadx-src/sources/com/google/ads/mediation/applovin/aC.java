package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.google.ads.mediation.applovin.Ml;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class aC implements MediationAppOpenAd, MaxAdListener {
    private MaxAppOpenAd J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final j f57268O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediationAdLoadCallback f57269n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MediationAppOpenAdCallback f57270r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f57271t;

    public aC(MediationAdLoadCallback loadCallback, Ml appLovinInitializer, j appLovinAdFactory) {
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        Intrinsics.checkNotNullParameter(appLovinInitializer, "appLovinInitializer");
        Intrinsics.checkNotNullParameter(appLovinAdFactory, "appLovinAdFactory");
        this.f57269n = loadCallback;
        this.f57271t = appLovinInitializer;
        this.f57268O = appLovinAdFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(aC aCVar, String str) {
        MaxAppOpenAd maxAppOpenAdO = aCVar.f57268O.O(str);
        aCVar.J2 = maxAppOpenAdO;
        if (maxAppOpenAdO != null) {
            maxAppOpenAdO.setListener(aCVar);
        }
        MaxAppOpenAd maxAppOpenAd = aCVar.J2;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.loadAd();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f57270r;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd ad, MaxError appLovinError) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(appLovinError, "appLovinError");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f57270r;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(new AdError(appLovinError.getCode(), appLovinError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f57270r;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback2 = this.f57270r;
        if (mediationAppOpenAdCallback2 != null) {
            mediationAppOpenAdCallback2.reportAdImpression();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f57270r;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String p0, MaxError appLovinError) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(appLovinError, "appLovinError");
        this.f57269n.onFailure(new AdError(appLovinError.getCode(), appLovinError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f57270r = (MediationAppOpenAdCallback) this.f57269n.onSuccess(this);
    }

    public final void rl(MediationAppOpenAdConfiguration appOpenAdConfiguration) {
        Intrinsics.checkNotNullParameter(appOpenAdConfiguration, "appOpenAdConfiguration");
        Bundle serverParameters = appOpenAdConfiguration.getServerParameters();
        Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (string == null || string.length() == 0) {
            this.f57269n.onFailure(new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN));
            return;
        }
        final String string2 = serverParameters.getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        if (string2 != null && string2.length() != 0) {
            this.f57271t.rl(appOpenAdConfiguration.getContext(), string, new Ml.n() { // from class: com.google.ads.mediation.applovin.Dsr
                @Override // com.google.ads.mediation.applovin.Ml.n
                public final void onInitializeSuccess() {
                    aC.t(this.f57262n, string2);
                }
            });
        } else {
            this.f57269n.onFailure(new AdError(113, "Ad Unit ID is missing.", AppLovinMediationAdapter.ERROR_DOMAIN));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MaxAppOpenAd maxAppOpenAd = this.J2;
        if (maxAppOpenAd != null) {
            if (maxAppOpenAd == null || !maxAppOpenAd.isReady()) {
                MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f57270r;
                if (mediationAppOpenAdCallback != null) {
                    mediationAppOpenAdCallback.onAdFailedToShow(new AdError(106, "Ad is not ready to be displayed", AppLovinMediationAdapter.ERROR_DOMAIN));
                    return;
                }
                return;
            }
            MaxAppOpenAd maxAppOpenAd2 = this.J2;
            if (maxAppOpenAd2 != null) {
                maxAppOpenAd2.showAd();
            }
        }
    }
}
