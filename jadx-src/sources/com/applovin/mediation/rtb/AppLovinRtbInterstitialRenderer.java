package com.applovin.mediation.rtb;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.I28;
import com.google.ads.mediation.applovin.Ml;
import com.google.ads.mediation.applovin.j;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class AppLovinRtbInterstitialRenderer extends I28 implements MediationInterstitialAd {

    @Nullable
    private AppLovinInterstitialAdDialog interstitialAd;
    private AppLovinSdk sdk;

    public void loadAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        AppLovinSdk appLovinSdkT = this.appLovinInitializer.t(mediationInterstitialAdConfiguration.getContext());
        this.sdk = appLovinSdkT;
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogNr = this.appLovinAdFactory.nr(appLovinSdkT, mediationInterstitialAdConfiguration.getContext());
        this.interstitialAd = appLovinInterstitialAdDialogNr;
        appLovinInterstitialAdDialogNr.setAdDisplayListener(this);
        this.interstitialAd.setAdClickListener(this);
        this.interstitialAd.setAdVideoPlaybackListener(this);
        this.interstitialAd.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, mediationInterstitialAdConfiguration.getWatermark());
        this.networkExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        this.sdk.getAdService().loadNextAdForAdToken(mediationInterstitialAdConfiguration.getBidResponse(), this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.sdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        this.interstitialAd.showAndRender(this.appLovinInterstitialAd);
    }

    public AppLovinRtbInterstitialRenderer(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull Ml ml, @NonNull j jVar) {
        super(mediationAdLoadCallback, ml, jVar);
    }
}
