package com.google.ads.mediation.fyber;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.BidTokenProvider;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kc.C2216j;
import kc.C2218w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class FyberMediationAdapter extends RtbAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    public static final String KEY_MUTE_VIDEO = "muteVideo";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected static final InneractiveMediationName f57296T = InneractiveMediationName.ADMOB;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    static final String f57297X = "FyberMediationAdapter";
    private com.google.ads.mediation.fyber.I28 E2;
    private MediationBannerListener J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ViewGroup f57298O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private com.google.ads.mediation.fyber.j f57299S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private InneractiveAdSpot f57300Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.ads.mediation.fyber.w6 f57301e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.ads.mediation.fyber.n f57302g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdSize f57303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WeakReference f57304o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MediationInterstitialListener f57305r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InneractiveAdSpot f57306t;

    class CN3 implements InneractiveAdSpot.RequestListener {
        CN3() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            if (!(FyberMediationAdapter.this.f57300Z.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
                AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", InneractiveUnitController.class.getName(), FyberMediationAdapter.this.f57306t.getSelectedUnitController().getClass().getName()), "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f57297X, adError.getMessage());
                FyberMediationAdapter.this.f57305r.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                FyberMediationAdapter.this.f57300Z.destroy();
            }
            ((InneractiveFullscreenUnitController) FyberMediationAdapter.this.f57300Z.getSelectedUnitController()).setEventsListener(FyberMediationAdapter.this.XQ());
            FyberMediationAdapter.this.f57305r.onAdLoaded(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            AdError adErrorN = C2216j.n(inneractiveErrorCode);
            Log.w(FyberMediationAdapter.f57297X, adErrorN.getMessage());
            FyberMediationAdapter.this.f57305r.onAdFailedToLoad(FyberMediationAdapter.this, adErrorN);
        }
    }

    class I28 extends InneractiveAdViewEventsListenerAdapter {
        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        }

        I28() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.J2.onAdClicked(FyberMediationAdapter.this);
            FyberMediationAdapter.this.J2.onAdOpened(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.J2.onAdClosed(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.J2.onAdLeftApplication(FyberMediationAdapter.this);
        }
    }

    class Ml implements InneractiveAdSpot.RequestListener {
        Ml() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            if (!(FyberMediationAdapter.this.f57306t.getSelectedUnitController() instanceof InneractiveAdViewUnitController)) {
                AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", InneractiveUnitController.class.getName(), FyberMediationAdapter.this.f57306t.getSelectedUnitController().getClass().getName()), "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f57297X, adError.getMessage());
                FyberMediationAdapter.this.J2.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                FyberMediationAdapter.this.f57306t.destroy();
            }
            InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) FyberMediationAdapter.this.f57306t.getSelectedUnitController();
            inneractiveAdViewUnitController.setEventsListener(FyberMediationAdapter.this.r());
            inneractiveAdViewUnitController.bindView(FyberMediationAdapter.this.f57298O);
            Context context = FyberMediationAdapter.this.f57298O.getContext();
            float f3 = context.getResources().getDisplayMetrics().density;
            int iRound = Math.round(inneractiveAdViewUnitController.getAdContentWidth() / f3);
            int iRound2 = Math.round(inneractiveAdViewUnitController.getAdContentHeight() / f3);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AdSize(iRound, iRound2));
            if (MediationUtils.findClosestSize(context, FyberMediationAdapter.this.f57303n, arrayList) != null) {
                FyberMediationAdapter.this.J2.onAdLoaded(FyberMediationAdapter.this);
                return;
            }
            AdError adError2 = new AdError(103, String.format("The loaded ad size did not match the requested ad size. Requested ad size: %dx%d. Loaded ad size: %dx%d.", Integer.valueOf(Math.round(FyberMediationAdapter.this.f57303n.getWidthInPixels(context) / f3)), Integer.valueOf(Math.round(FyberMediationAdapter.this.f57303n.getHeightInPixels(context) / f3)), Integer.valueOf(iRound), Integer.valueOf(iRound2)), "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f57297X, adError2.getMessage());
            FyberMediationAdapter.this.J2.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            AdError adErrorN = C2216j.n(inneractiveErrorCode);
            Log.w(FyberMediationAdapter.f57297X, adErrorN.getMessage());
            FyberMediationAdapter.this.J2.onAdFailedToLoad(FyberMediationAdapter.this, adErrorN);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
    }

    class Wre implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Bundle f57310n;
        final /* synthetic */ Context rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Bundle f57311t;

        Wre(Bundle bundle, Context context, Bundle bundle2) {
            this.f57310n = bundle;
            this.rl = context;
            this.f57311t = bundle2;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError adErrorRl = C2216j.rl(fyberInitStatus);
                Log.w(FyberMediationAdapter.f57297X, adErrorRl.getMessage());
                FyberMediationAdapter.this.f57305r.onAdFailedToLoad(FyberMediationAdapter.this, adErrorRl);
                return;
            }
            String string = this.f57310n.getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Cannot render interstitial ad. Please define a valid spot id on the AdMob UI.", "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f57297X, adError.getMessage());
                FyberMediationAdapter.this.f57305r.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                return;
            }
            if (!(this.rl instanceof Activity)) {
                AdError adError2 = new AdError(107, "Cannot request an interstitial ad without an activity context.", "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f57297X, adError2.getMessage());
                if (FyberMediationAdapter.this.f57305r != null) {
                    FyberMediationAdapter.this.f57305r.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
                    return;
                }
                return;
            }
            FyberMediationAdapter.this.f57304o = new WeakReference((Activity) this.rl);
            FyberMediationAdapter.this.f57300Z = InneractiveAdSpotManager.get().createSpot();
            FyberMediationAdapter.this.f57300Z.addUnitController(new InneractiveFullscreenUnitController());
            FyberMediationAdapter.this.f57300Z.setRequestListener(FyberMediationAdapter.this.Z());
            com.google.ads.mediation.fyber.Ml.t(this.f57311t);
            FyberMediationAdapter.this.f57300Z.requestAd(new InneractiveAdRequest(string));
        }
    }

    class fuX extends InneractiveFullscreenAdEventsListenerAdapter {
        fuX() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f57305r.onAdClicked(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
        public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f57305r.onAdClosed(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f57305r.onAdOpened(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f57305r.onAdLeftApplication(FyberMediationAdapter.this);
        }
    }

    class j implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MediationAdLoadCallback f57313n;
        final /* synthetic */ MediationRewardedAdConfiguration rl;

        j(MediationAdLoadCallback mediationAdLoadCallback, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
            this.f57313n = mediationAdLoadCallback;
            this.rl = mediationRewardedAdConfiguration;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError adErrorRl = C2216j.rl(fyberInitStatus);
                Log.w(FyberMediationAdapter.f57297X, adErrorRl.getMessage());
                this.f57313n.onFailure(adErrorRl);
            } else {
                FyberMediationAdapter.this.E2 = new com.google.ads.mediation.fyber.I28(this.f57313n);
                FyberMediationAdapter.this.E2.nr(this.rl);
            }
        }
    }

    class n implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InitializationCompleteCallback f57315n;

        n(InitializationCompleteCallback initializationCompleteCallback) {
            this.f57315n = initializationCompleteCallback;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                this.f57315n.onInitializationSucceeded();
                return;
            }
            AdError adErrorRl = C2216j.rl(fyberInitStatus);
            Log.w(FyberMediationAdapter.f57297X, adErrorRl.getMessage());
            this.f57315n.onInitializationFailed(adErrorRl.getMessage());
        }
    }

    class w6 implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Bundle f57317n;
        final /* synthetic */ Bundle nr;
        final /* synthetic */ Context rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AdSize f57318t;

        w6(Bundle bundle, Context context, AdSize adSize, Bundle bundle2) {
            this.f57317n = bundle;
            this.rl = context;
            this.f57318t = adSize;
            this.nr = bundle2;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError adErrorRl = C2216j.rl(fyberInitStatus);
                Log.w(FyberMediationAdapter.f57297X, adErrorRl.getMessage());
                FyberMediationAdapter.this.J2.onAdFailedToLoad(FyberMediationAdapter.this, adErrorRl);
                return;
            }
            String string = this.f57317n.getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f57297X, adError.getMessage());
                FyberMediationAdapter.this.J2.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                return;
            }
            FyberMediationAdapter.this.f57306t = InneractiveAdSpotManager.get().createSpot();
            FyberMediationAdapter.this.f57306t.addUnitController(new InneractiveAdViewUnitController());
            FyberMediationAdapter.this.f57298O = new RelativeLayout(this.rl);
            FyberMediationAdapter.this.f57306t.setRequestListener(FyberMediationAdapter.this.o());
            FyberMediationAdapter.this.f57303n = this.f57318t;
            com.google.ads.mediation.fyber.Ml.t(this.nr);
            FyberMediationAdapter.this.f57306t.requestAd(new InneractiveAdRequest(string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InneractiveFullscreenAdEventsListener XQ() {
        return new fuX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InneractiveAdSpot.RequestListener Z() {
        return new CN3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InneractiveAdSpot.RequestListener o() {
        return new Ml();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InneractiveAdViewEventsListener r() {
        return new I28();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.f57298O;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.fyber.j jVar = new com.google.ads.mediation.fyber.j(mediationAdLoadCallback);
        this.f57299S = jVar;
        jVar.n(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.fyber.n nVar = new com.google.ads.mediation.fyber.n(mediationAdLoadCallback);
        this.f57302g = nVar;
        nVar.n(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAdMapper(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.fyber.w6 w6Var = this.f57301e;
        if (w6Var != null) {
            w6Var.destroy();
            this.f57301e = null;
        }
        com.google.ads.mediation.fyber.w6 w6Var2 = new com.google.ads.mediation.fyber.w6(mediationAdLoadCallback);
        this.f57301e = w6Var2;
        w6Var2.J2(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.E2 = new com.google.ads.mediation.fyber.I28(mediationAdLoadCallback);
        InneractiveAdManager.setMediationName(f57296T);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        this.E2.t(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        InneractiveAdSpot inneractiveAdSpot = this.f57306t;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
            this.f57306t = null;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f57300Z;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
            this.f57300Z = null;
        }
        WeakReference weakReference = this.f57304o;
        if (weakReference != null) {
            weakReference.clear();
            this.f57304o = null;
        }
        com.google.ads.mediation.fyber.w6 w6Var = this.f57301e;
        if (w6Var != null) {
            w6Var.destroy();
            this.f57301e = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.J2 = mediationBannerListener;
        String string = bundle.getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w(f57297X, adError.getMessage());
            this.J2.onAdFailedToLoad(this, adError);
        } else {
            InneractiveAdManager.setMediationName(f57296T);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(context, string, new w6(bundle, context, adSize, bundle2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.f57305r = mediationInterstitialListener;
        String string = bundle.getString("applicationId");
        AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
        if (TextUtils.isEmpty(string)) {
            Log.w(f57297X, adError.getMessage());
            this.f57305r.onAdFailedToLoad(this, adError);
        } else {
            InneractiveAdManager.setMediationName(f57296T);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(context, string, new Wre(bundle, context, bundle2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        WeakReference weakReference = this.f57304o;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (activity == null) {
            Log.w(f57297X, "showInterstitial called, but activity reference was lost.");
            this.f57305r.onAdOpened(this);
            this.f57305r.onAdClosed(this);
        } else {
            if (!(this.f57300Z.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
                Log.w(f57297X, "showInterstitial called, but wrong spot has been used (should not happen).");
                this.f57305r.onAdOpened(this);
                this.f57305r.onAdClosed(this);
                return;
            }
            InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) this.f57300Z.getSelectedUnitController();
            if (this.f57300Z.isReady()) {
                inneractiveFullscreenUnitController.show(activity);
                return;
            }
            Log.w(f57297X, "showInterstitial called, but Ad has expired.");
            this.f57305r.onAdOpened(this);
            this.f57305r.onAdClosed(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        String bidderToken = BidTokenProvider.getBidderToken();
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        signalCallbacks.onSuccess(bidderToken);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String strRl = com.google.ads.mediation.fyber.Ml.rl();
        String[] strArrSplit = strRl.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(f57297X, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strRl));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String strN = com.google.ads.mediation.fyber.Ml.n();
        String[] strArrSplit = strN.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(f57297X, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", strN));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (C2218w6.n().isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("applicationId");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(101, "DT Exchange SDK requires an appId to be configured on the AdMob UI.", "com.google.ads.mediation.dtexchange");
            Log.w(f57297X, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        } else {
            String str = (String) hashSet.iterator().next();
            if (hashSet.size() > 1) {
                Log.w(f57297X, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the DT Exchange SDK.", "applicationId", hashSet, str));
            }
            InneractiveAdManager.initialize(context, str, new n(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w(f57297X, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
        } else {
            InneractiveAdManager.setMediationName(f57296T);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(mediationRewardedAdConfiguration.getContext(), string, new j(mediationAdLoadCallback, mediationRewardedAdConfiguration));
        }
    }
}
