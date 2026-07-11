package com.applovin.mediation.rtb;

import android.content.Context;
import androidx.annotation.NonNull;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.CN3;
import com.google.ads.mediation.applovin.Ml;
import com.google.ads.mediation.applovin.Wre;
import com.google.ads.mediation.applovin.j;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class AppLovinRtbRewardedRenderer extends Wre {
    private AppLovinAd appLovinAd;

    @Override // com.google.ads.mediation.applovin.Wre, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(@NonNull AppLovinAd appLovinAd) {
        this.appLovinAd = appLovinAd;
        super.adReceived(appLovinAd);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        this.incentivizedInterstitial.show(this.appLovinAd, context, this, this, this, this);
    }

    public AppLovinRtbRewardedRenderer(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull Ml ml, @NonNull j jVar, @NonNull CN3 cn3) {
        super(mediationAdLoadCallback, ml, jVar, cn3);
    }

    public void loadAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        AppLovinSdk appLovinSdkT = this.appLovinInitializer.t(mediationRewardedAdConfiguration.getContext());
        this.appLovinSdk = appLovinSdkT;
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitialRl = this.appLovinAdFactory.rl(appLovinSdkT);
        this.incentivizedInterstitial = appLovinIncentivizedInterstitialRl;
        appLovinIncentivizedInterstitialRl.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, mediationRewardedAdConfiguration.getWatermark());
        this.networkExtras = mediationRewardedAdConfiguration.getMediationExtras();
        this.appLovinSdk.getAdService().loadNextAdForAdToken(mediationRewardedAdConfiguration.getBidResponse(), this);
    }
}
