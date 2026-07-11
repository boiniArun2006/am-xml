package KEC;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.w6;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class I28 implements MediationRewardedAd, RewardedAdListener {
    private RewardedAd J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private MediationRewardedAdCallback f5260O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediationRewardedAdConfiguration f5261n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.ads.mediation.vungle.n f5262r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MediationAdLoadCallback f5263t;

    class j implements w6.j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f5264O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f5265n;
        final /* synthetic */ String nr;
        final /* synthetic */ String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AdConfig f5266t;

        j(Context context, String str, AdConfig adConfig, String str2, String str3) {
            this.f5265n = context;
            this.rl = str;
            this.f5266t = adConfig;
            this.nr = str2;
            this.f5264O = str3;
        }

        @Override // com.google.ads.mediation.vungle.w6.j
        public void onInitializeError(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            I28.this.f5263t.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.w6.j
        public void onInitializeSuccess() {
            I28 i28 = I28.this;
            i28.J2 = i28.f5262r.O(this.f5265n, this.rl, this.f5266t);
            I28.this.J2.setAdListener(I28.this);
            if (!TextUtils.isEmpty(this.nr)) {
                I28.this.J2.setUserId(this.nr);
            }
            I28.this.J2.load(this.f5264O);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
    }

    public void O() {
        Bundle mediationExtras = this.f5261n.getMediationExtras();
        Bundle serverParameters = this.f5261n.getServerParameters();
        String string = mediationExtras.getString("userId");
        String string2 = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string2)) {
            AdError adError = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f5263t.onFailure(adError);
            return;
        }
        String string3 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string3)) {
            AdError adError2 = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f5263t.onFailure(adError2);
            return;
        }
        String bidResponse = this.f5261n.getBidResponse();
        AdConfig adConfigN = this.f5262r.n();
        if (mediationExtras.containsKey("adOrientation")) {
            adConfigN.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = this.f5261n.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            adConfigN.setWatermark(watermark);
        }
        Context context = this.f5261n.getContext();
        com.google.ads.mediation.vungle.w6.n().rl(string2, context, new j(context, string3, adConfigN, string, bidResponse));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f5260O;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f5260O;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f5260O;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.f5260O.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        this.f5260O = (MediationRewardedAdCallback) this.f5263t.onSuccess(this);
    }

    @Override // com.vungle.ads.RewardedAdListener
    public void onAdRewarded(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f5260O;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.f5260O.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f5260O;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        RewardedAd rewardedAd = this.J2;
        if (rewardedAd != null) {
            rewardedAd.play(context);
        } else if (this.f5260O != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f5260O.onAdFailedToShow(adError);
        }
    }

    public I28(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.n nVar) {
        this.f5261n = mediationRewardedAdConfiguration;
        this.f5263t = mediationAdLoadCallback;
        this.f5262r = nVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f5263t.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f5260O;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }
}
