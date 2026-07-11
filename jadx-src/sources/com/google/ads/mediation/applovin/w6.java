package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.Ml;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final String f57278S = "w6";
    private final Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f57279O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private MediationBannerAdCallback f57280Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n f57281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final MediationAdLoadCallback f57282o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.ads.mediation.applovin.j f57283r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AppLovinSdk f57284t;

    class j implements Ml.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f57286n;
        final /* synthetic */ AdSize nr;
        final /* synthetic */ Bundle rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AppLovinAdSize f57287t;

        j(Context context, Bundle bundle, AppLovinAdSize appLovinAdSize, AdSize adSize) {
            this.f57286n = context;
            this.rl = bundle;
            this.f57287t = appLovinAdSize;
            this.nr = adSize;
        }

        @Override // com.google.ads.mediation.applovin.Ml.n
        public void onInitializeSuccess() {
            w6 w6Var = w6.this;
            w6Var.f57284t = w6Var.J2.t(this.f57286n);
            w6.this.f57279O = AppLovinUtils.retrieveZoneId(this.rl);
            Log.d(w6.f57278S, "Requesting banner of size " + this.f57287t + " for zone: " + w6.this.f57279O);
            w6 w6Var2 = w6.this;
            w6Var2.f57281n = w6Var2.f57283r.n(w6.this.f57284t, this.f57287t, this.nr, this.f57286n);
            w6.this.f57281n.O(w6.this);
            w6.this.f57281n.nr(w6.this);
            w6.this.f57281n.J2(w6.this);
            if (TextUtils.isEmpty(w6.this.f57279O)) {
                w6.this.f57284t.getAdService().loadNextAd(this.f57287t, w6.this);
            } else {
                w6.this.f57284t.getAdService().loadNextAdForZoneId(w6.this.f57279O, w6.this);
            }
        }
    }

    public static w6 gh(MediationAdLoadCallback mediationAdLoadCallback, Ml ml, com.google.ads.mediation.applovin.j jVar) {
        return new w6(mediationAdLoadCallback, ml, jVar);
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(f57278S, "Banner clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f57280Z;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f57278S, "Banner closed fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f57280Z;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(f57278S, "Banner displayed.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f57280Z;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w(f57278S, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(f57278S, "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f57278S, "Banner left application.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f57280Z;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f57278S, "Banner opened fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f57280Z;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        Log.d(f57278S, "Banner did load ad for zone: " + this.f57279O);
        this.f57281n.t(appLovinAd);
        this.f57280Z = (MediationBannerAdCallback) this.f57282o.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f57281n.n();
    }

    private w6(MediationAdLoadCallback mediationAdLoadCallback, Ml ml, com.google.ads.mediation.applovin.j jVar) {
        this.f57282o = mediationAdLoadCallback;
        this.J2 = ml;
        this.f57283r = jVar;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        AdError adError = AppLovinUtils.getAdError(i2);
        Log.w(f57278S, "Failed to load banner ad with error: " + i2);
        this.f57282o.onFailure(adError);
    }

    public void mUb(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(f57278S, adError.getMessage());
            this.f57282o.onFailure(adError);
            return;
        }
        AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, adSize);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize == null) {
            AdError adError2 = new AdError(101, "Failed to request banner with unsupported size.", AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(f57278S, adError2.getMessage());
            this.f57282o.onFailure(adError2);
            return;
        }
        this.J2.rl(context, string, new j(context, serverParameters, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, adSize));
    }
}
