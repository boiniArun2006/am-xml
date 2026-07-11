package s9y;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.n;
import com.google.ads.mediation.vungle.w6;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import kotlin.jvm.internal.Intrinsics;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j implements MediationAppOpenAd, InterstitialAdListener {
    private InterstitialAd J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final n f73186O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediationAppOpenAdConfiguration f73187n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MediationAppOpenAdCallback f73188r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MediationAdLoadCallback f73189t;

    /* JADX INFO: renamed from: s9y.j$j, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class C1161j implements w6.j {
        final /* synthetic */ String nr;
        final /* synthetic */ Bundle rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f73191t;

        C1161j(Bundle bundle, Context context, String str) {
            this.rl = bundle;
            this.f73191t = context;
            this.nr = str;
        }

        @Override // com.google.ads.mediation.vungle.w6.j
        public void onInitializeError(AdError adError) {
            Intrinsics.checkNotNullParameter(adError, dpcnwfoVOnrtRA.CXibdszNRLbnkP);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            j.this.f73189t.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.w6.j
        public void onInitializeSuccess() {
            AdConfig adConfigN = j.this.f73186O.n();
            if (this.rl.containsKey("adOrientation")) {
                adConfigN.setAdOrientation(this.rl.getInt("adOrientation", 2));
            }
            j jVar = j.this;
            jVar.Uo(adConfigN, jVar.f73187n);
            j jVar2 = j.this;
            n nVar = jVar2.f73186O;
            Context context = this.f73191t;
            String str = this.nr;
            Intrinsics.checkNotNull(str);
            jVar2.J2 = nVar.t(context, str, adConfigN);
            InterstitialAd interstitialAd = j.this.J2;
            InterstitialAd interstitialAd2 = null;
            if (interstitialAd == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
                interstitialAd = null;
            }
            interstitialAd.setAdListener(j.this);
            InterstitialAd interstitialAd3 = j.this.J2;
            if (interstitialAd3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
            } else {
                interstitialAd2 = interstitialAd3;
            }
            j jVar3 = j.this;
            interstitialAd2.load(jVar3.J2(jVar3.f73187n));
        }
    }

    public abstract String J2(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void Uo(AdConfig adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
    }

    public j(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, n vungleFactory) {
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        Intrinsics.checkNotNullParameter(vungleFactory, "vungleFactory");
        this.f73187n = mediationAppOpenAdConfiguration;
        this.f73189t = mediationAdLoadCallback;
        this.f73186O = vungleFactory;
    }

    public final void KN() {
        Bundle mediationExtras = this.f73187n.getMediationExtras();
        Intrinsics.checkNotNullExpressionValue(mediationExtras, "getMediationExtras(...)");
        Bundle serverParameters = this.f73187n.getServerParameters();
        Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString("appid");
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f73189t.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (string2 == null || string2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f73189t.onFailure(adError2);
        } else {
            Context context = this.f73187n.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            w6 w6VarN = w6.n();
            Intrinsics.checkNotNull(string);
            w6VarN.rl(string, context, new C1161j(mediationExtras, context, string2));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f73188r;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f73188r;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(...)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        this.f73189t.onFailure(adError2);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(...)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f73188r;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError2);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f73188r;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.f73188r = (MediationAppOpenAdCallback) this.f73189t.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f73188r;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterstitialAd interstitialAd = this.J2;
        InterstitialAd interstitialAd2 = null;
        if (interstitialAd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
            interstitialAd = null;
        }
        if (interstitialAd.canPlayAd().booleanValue()) {
            InterstitialAd interstitialAd3 = this.J2;
            if (interstitialAd3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
            } else {
                interstitialAd2 = interstitialAd3;
            }
            interstitialAd2.play(context);
            return;
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f73188r;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }
}
