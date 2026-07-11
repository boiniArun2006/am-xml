package com.google.ads.mediation.fyber;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import kc.C2216j;
import kc.C2217n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class I28 implements MediationRewardedAd, InneractiveAdSpot.RequestListener, InneractiveFullscreenAdEventsListener, InneractiveFullScreenAdRewardedListener {
    private InneractiveFullscreenUnitController J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private InneractiveAdSpot f57319O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediationAdLoadCallback f57320n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MediationRewardedAdCallback f57321t;

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
    }

    private void O() {
        this.J2.setEventsListener(this);
        this.J2.setRewardedListener(this);
        this.J2.addContentController(new InneractiveFullscreenVideoContentController());
    }

    private boolean rl(InneractiveFullscreenUnitController inneractiveFullscreenUnitController) {
        return (inneractiveFullscreenUnitController == null || inneractiveFullscreenUnitController.getSelectedContentController() == null || !(inneractiveFullscreenUnitController.getSelectedContentController() instanceof InneractiveFullscreenVideoContentController)) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        this.f57321t.reportAdClicked();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        this.f57321t.onAdClosed();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        this.f57321t.onAdOpened();
        if (rl(this.J2)) {
            this.f57321t.onVideoStart();
        }
        this.f57321t.reportAdImpression();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
    public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
        this.f57321t.onUserEarnedReward();
        this.f57321t.onVideoComplete();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        this.f57321t = (MediationRewardedAdCallback) this.f57320n.onSuccess(this);
        O();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        if (!(context instanceof Activity)) {
            AdError adError = new AdError(107, "Cannot show a rewarded ad without an activity context.", "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f57297X, adError.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f57321t;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f57319O;
        if (inneractiveAdSpot != null && this.J2 != null && inneractiveAdSpot.isReady()) {
            this.J2.show((Activity) context);
        } else if (this.f57321t != null) {
            AdError adError2 = new AdError(106, "DT Exchange's rewarded spot is not ready.", "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f57297X, adError2.getMessage());
            this.f57321t.onAdFailedToShow(adError2);
        }
    }

    I28(MediationAdLoadCallback mediationAdLoadCallback) {
        this.f57320n = mediationAdLoadCallback;
    }

    private void n(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        this.f57319O = C2217n.nr();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitControllerN = C2217n.n();
        this.J2 = inneractiveFullscreenUnitControllerN;
        this.f57319O.addUnitController(inneractiveFullscreenUnitControllerN);
        this.f57319O.setRequestListener(this);
        Ml.t(mediationRewardedAdConfiguration.getMediationExtras());
    }

    void nr(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("spotId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Spot ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f57297X, adError.getMessage());
            this.f57320n.onFailure(adError);
        } else {
            n(mediationRewardedAdConfiguration);
            this.f57319O.requestAd(new InneractiveAdRequest(string));
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        AdError adErrorN = C2216j.n(inneractiveErrorCode);
        Log.w(FyberMediationAdapter.f57297X, adErrorN.getMessage());
        this.f57320n.onFailure(adErrorN);
    }

    void t(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        n(mediationRewardedAdConfiguration);
        this.f57319O.loadAd(bidResponse);
    }
}
