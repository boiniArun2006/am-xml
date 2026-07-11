package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.google.ads.mediation.applovin.Ml;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class o extends Wre implements MediationRewardedAd {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected static final HashMap f57273O = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f57274n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f57275t;

    class j implements Ml.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Bundle f57276n;
        final /* synthetic */ Context rl;

        j(Bundle bundle, Context context) {
            this.f57276n = bundle;
            this.rl = context;
        }

        @Override // com.google.ads.mediation.applovin.Ml.n
        public void onInitializeSuccess() {
            o.this.f57274n = AppLovinUtils.retrieveZoneId(this.f57276n);
            o oVar = o.this;
            oVar.appLovinSdk = oVar.appLovinInitializer.t(this.rl);
            String str = String.format("Requesting rewarded video for zone '%s'", o.this.f57274n);
            String str2 = Wre.TAG;
            Log.d(str2, str);
            HashMap map = o.f57273O;
            if (map.containsKey(o.this.f57274n)) {
                AdError adError = new AdError(105, "Cannot load multiple rewarded ads with the same Zone ID. Let the first ad finish loading before attempting to load another.", AppLovinMediationAdapter.ERROR_DOMAIN);
                Log.e(str2, adError.toString());
                o.this.adLoadCallback.onFailure(adError);
                return;
            }
            map.put(o.this.f57274n, new WeakReference(o.this));
            if (Objects.equals(o.this.f57274n, "")) {
                o oVar2 = o.this;
                oVar2.incentivizedInterstitial = oVar2.appLovinAdFactory.rl(oVar2.appLovinSdk);
            } else {
                o oVar3 = o.this;
                oVar3.incentivizedInterstitial = oVar3.appLovinAdFactory.t(oVar3.f57274n, o.this.appLovinSdk);
            }
            o oVar4 = o.this;
            oVar4.incentivizedInterstitial.preload(oVar4);
        }
    }

    @Override // com.google.ads.mediation.applovin.Wre, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        f57273O.remove(this.f57274n);
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.Wre, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (this.f57275t) {
            f57273O.remove(this.f57274n);
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.Wre, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        f57273O.remove(this.f57274n);
        super.failedToReceiveAd(i2);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        String str = this.f57274n;
        if (str != null) {
            Log.d(Wre.TAG, String.format("Showing rewarded video for zone '%s'", str));
        }
        if (this.incentivizedInterstitial.isAdReadyToDisplay()) {
            this.incentivizedInterstitial.show(context, this, this, this, this);
            return;
        }
        AdError adError = new AdError(106, "Ad not ready to show.", AppLovinMediationAdapter.ERROR_DOMAIN);
        Log.e(Wre.TAG, adError.toString());
        this.rewardedAdCallback.onAdFailedToShow(adError);
    }

    protected o(MediationAdLoadCallback mediationAdLoadCallback, Ml ml, com.google.ads.mediation.applovin.j jVar, CN3 cn3) {
        super(mediationAdLoadCallback, ml, jVar, cn3);
        this.f57275t = false;
    }

    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(Wre.TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.f57275t = true;
            }
            this.networkExtras = mediationRewardedAdConfiguration.getMediationExtras();
            this.appLovinInitializer.rl(context, string, new j(serverParameters, context));
        }
    }
}
