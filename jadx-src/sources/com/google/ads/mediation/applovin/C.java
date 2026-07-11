package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.Ml;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C extends I28 implements MediationInterstitialAd {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected static final HashMap f57257O = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AppLovinSdk f57258n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f57259t;

    class j implements Ml.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Bundle f57260n;
        final /* synthetic */ Context rl;

        j(Bundle bundle, Context context) {
            this.f57260n = bundle;
            this.rl = context;
        }

        @Override // com.google.ads.mediation.applovin.Ml.n
        public void onInitializeSuccess() {
            C.this.zoneId = AppLovinUtils.retrieveZoneId(this.f57260n);
            HashMap map = C.f57257O;
            if (map.containsKey(C.this.zoneId) && ((WeakReference) map.get(C.this.zoneId)).get() != null) {
                AdError adError = new AdError(105, I28.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                Log.e(I28.TAG, adError.getMessage());
                C.this.interstitialAdLoadCallback.onFailure(adError);
                return;
            }
            map.put(C.this.zoneId, new WeakReference(C.this));
            C c2 = C.this;
            c2.f57258n = c2.appLovinInitializer.t(this.rl);
            Log.d(I28.TAG, "Requesting interstitial for zone: " + C.this.zoneId);
            if (TextUtils.isEmpty(C.this.zoneId)) {
                C.this.f57258n.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, C.this);
                return;
            }
            AppLovinAdService adService = C.this.f57258n.getAdService();
            C c4 = C.this;
            adService.loadNextAdForZoneId(c4.zoneId, c4);
        }
    }

    @Override // com.google.ads.mediation.applovin.I28, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (this.f57259t) {
            t();
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f57258n.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogNr = this.appLovinAdFactory.nr(this.f57258n, context);
        appLovinInterstitialAdDialogNr.setAdDisplayListener(this);
        appLovinInterstitialAdDialogNr.setAdClickListener(this);
        appLovinInterstitialAdDialogNr.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd == null) {
            String str = I28.TAG;
            Log.d(str, "Attempting to show interstitial before one was loaded.");
            if (TextUtils.isEmpty(this.zoneId)) {
                Log.d(str, "Showing interstitial preloaded by SDK.");
                appLovinInterstitialAdDialogNr.show();
                return;
            }
            return;
        }
        Log.d(I28.TAG, "Showing interstitial for zone: " + this.zoneId);
        appLovinInterstitialAdDialogNr.showAndRender(this.appLovinInterstitialAd);
    }

    void t() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap map = f57257O;
        if (map.containsKey(this.zoneId) && equals(((WeakReference) map.get(this.zoneId)).get())) {
            map.remove(this.zoneId);
        }
    }

    public C(MediationAdLoadCallback mediationAdLoadCallback, Ml ml, com.google.ads.mediation.applovin.j jVar) {
        super(mediationAdLoadCallback, ml, jVar);
        this.f57259t = false;
    }

    @Override // com.google.ads.mediation.applovin.I28, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        t();
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.I28, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        t();
        super.failedToReceiveAd(i2);
    }

    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(I28.TAG, adError.getMessage());
            this.interstitialAdLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.f57259t = true;
            }
            this.networkExtras = mediationInterstitialAdConfiguration.getMediationExtras();
            this.appLovinInitializer.rl(context, string, new j(serverParameters, context));
        }
    }
}
