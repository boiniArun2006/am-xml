package KEC;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.w6;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class w6 implements MediationInterstitialAd, InterstitialAdListener {
    private InterstitialAd J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private MediationInterstitialAdCallback f5285O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediationInterstitialAdConfiguration f5286n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.ads.mediation.vungle.n f5287r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MediationAdLoadCallback f5288t;

    class j implements w6.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f5290n;
        final /* synthetic */ String nr;
        final /* synthetic */ String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AdConfig f5291t;

        j(Context context, String str, AdConfig adConfig, String str2) {
            this.f5290n = context;
            this.rl = str;
            this.f5291t = adConfig;
            this.nr = str2;
        }

        @Override // com.google.ads.mediation.vungle.w6.j
        public void onInitializeError(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            w6.this.f5288t.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.w6.j
        public void onInitializeSuccess() {
            w6 w6Var = w6.this;
            w6Var.J2 = w6Var.f5287r.t(this.f5290n, this.rl, this.f5291t);
            w6.this.J2.setAdListener(w6.this);
            w6.this.J2.load(this.nr);
        }
    }

    public void O() {
        Bundle mediationExtras = this.f5286n.getMediationExtras();
        Bundle serverParameters = this.f5286n.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f5288t.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f5288t.onFailure(adError2);
            return;
        }
        String bidResponse = this.f5286n.getBidResponse();
        AdConfig adConfigN = this.f5287r.n();
        if (mediationExtras.containsKey("adOrientation")) {
            adConfigN.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = this.f5286n.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            adConfigN.setWatermark(watermark);
        }
        Context context = this.f5286n.getContext();
        com.google.ads.mediation.vungle.w6.n().rl(string, context, new j(context, string2, adConfigN, bidResponse));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f5285O;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f5285O;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f5285O;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f5285O;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        this.f5285O = (MediationInterstitialAdCallback) this.f5288t.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f5285O;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        InterstitialAd interstitialAd = this.J2;
        if (interstitialAd != null) {
            interstitialAd.play(context);
        } else if (this.f5285O != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f5285O.onAdFailedToShow(adError);
        }
    }

    public w6(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.n nVar) {
        this.f5286n = mediationInterstitialAdConfiguration;
        this.f5288t = mediationAdLoadCallback;
        this.f5287r = nVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f5288t.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f5285O;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }
}
