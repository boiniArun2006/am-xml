package KEC;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.w6;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import com.vungle.mediation.VungleInterstitialAdapter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class n implements MediationBannerAd, BannerAdListener {
    private VungleBannerView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private MediationBannerAdCallback f5277O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediationBannerAdConfiguration f5278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.ads.mediation.vungle.n f5279o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RelativeLayout f5280r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MediationAdLoadCallback f5281t;

    class j implements w6.j {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f5282O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f5283n;
        final /* synthetic */ VungleAdSize nr;
        final /* synthetic */ String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AdSize f5284t;

        j(Context context, String str, AdSize adSize, VungleAdSize vungleAdSize, String str2, String str3) {
            this.f5283n = context;
            this.rl = str;
            this.f5284t = adSize;
            this.nr = vungleAdSize;
            this.f5282O = str2;
            this.J2 = str3;
        }

        @Override // com.google.ads.mediation.vungle.w6.j
        public void onInitializeError(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            n.this.f5281t.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.w6.j
        public void onInitializeSuccess() throws Throwable {
            n.this.t(this.f5283n, this.rl, this.f5284t, this.nr, this.f5282O, this.J2);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(Context context, String str, AdSize adSize, VungleAdSize vungleAdSize, String str2, String str3) throws Throwable {
        this.f5280r = new RelativeLayout(context);
        int heightInPixels = adSize.getHeightInPixels(context);
        if (heightInPixels <= 0) {
            heightInPixels = Math.round(vungleAdSize.getHeight() * context.getResources().getDisplayMetrics().density);
        }
        this.f5280r.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
        VungleBannerView vungleBannerViewRl = this.f5279o.rl(context, str, vungleAdSize);
        this.J2 = vungleBannerViewRl;
        vungleBannerViewRl.setAdListener(this);
        if (!TextUtils.isEmpty(str3)) {
            this.J2.getAdConfig().setWatermark(str3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14, -1);
        layoutParams.addRule(15, -1);
        this.f5280r.addView(this.J2, layoutParams);
        this.J2.load(str2);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f5280r;
    }

    public void nr() {
        Bundle serverParameters = this.f5278n.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.e(VungleMediationAdapter.TAG, adError.getMessage());
            this.f5281t.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.e(VungleMediationAdapter.TAG, adError2.getMessage());
            this.f5281t.onFailure(adError2);
        } else {
            Context context = this.f5278n.getContext();
            AdSize adSize = this.f5278n.getAdSize();
            com.google.ads.mediation.vungle.w6.n().rl(string, context, new j(context, string2, adSize, VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(adSize, string2), this.f5278n.getBidResponse(), this.f5278n.getWatermark()));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f5277O;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f5277O.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f5277O;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f5277O;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        this.f5277O = (MediationBannerAdCallback) this.f5281t.onSuccess(this);
    }

    public n(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.n nVar) {
        this.f5278n = mediationBannerAdConfiguration;
        this.f5281t = mediationAdLoadCallback;
        this.f5279o = nVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f5281t.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
    }
}
