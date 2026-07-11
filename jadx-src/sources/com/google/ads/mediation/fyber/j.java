package com.google.ads.mediation.fyber;

import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import kc.C2216j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements MediationBannerAd, InneractiveAdSpot.RequestListener, InneractiveAdViewEventsListener {
    private MediationBannerAdCallback J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private RelativeLayout f57324O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediationAdLoadCallback f57325n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InneractiveAdSpot f57326t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0761j f57323r = new C0761j(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f57322o = Reflection.getOrCreateKotlinClass(j.class).getSimpleName();

    /* JADX INFO: renamed from: com.google.ads.mediation.fyber.j$j, reason: collision with other inner class name */
    public static final class C0761j {
        public /* synthetic */ C0761j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0761j() {
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdExpanded(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdResized(InneractiveAdSpot inneractiveAdSpot) {
    }

    public j(MediationAdLoadCallback mediationAdLoadCallback) {
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        this.f57325n = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        RelativeLayout relativeLayout = this.f57324O;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wrapperView");
        return null;
    }

    public final void n(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Intrinsics.checkNotNullParameter(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        InneractiveAdManager.setMediationName(FyberMediationAdapter.f57296T);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        Intrinsics.checkNotNullExpressionValue(bidResponse, "getBidResponse(...)");
        this.f57326t = InneractiveAdSpotManager.get().createSpot();
        InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        InneractiveAdSpot inneractiveAdSpot = this.f57326t;
        InneractiveAdSpot inneractiveAdSpot2 = null;
        if (inneractiveAdSpot == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            inneractiveAdSpot = null;
        }
        inneractiveAdSpot.addUnitController(inneractiveAdViewUnitController);
        this.f57324O = new RelativeLayout(mediationBannerAdConfiguration.getContext());
        InneractiveAdSpot inneractiveAdSpot3 = this.f57326t;
        if (inneractiveAdSpot3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            inneractiveAdSpot3 = null;
        }
        inneractiveAdSpot3.setRequestListener(this);
        inneractiveAdViewUnitController.setEventsListener(this);
        Ml.t(mediationBannerAdConfiguration.getMediationExtras());
        InneractiveAdSpot inneractiveAdSpot4 = this.f57326t;
        if (inneractiveAdSpot4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adSpot");
        } else {
            inneractiveAdSpot2 = inneractiveAdSpot4;
        }
        inneractiveAdSpot2.loadAd(bidResponse);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.J2;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.J2;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.J2;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.J2;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f57325n.onFailure(C2216j.n(errorCode));
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdSpot inneractiveAdSpot2 = this.f57326t;
        RelativeLayout relativeLayout = null;
        InneractiveAdSpot inneractiveAdSpot3 = null;
        InneractiveAdSpot inneractiveAdSpot4 = null;
        if (inneractiveAdSpot2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            inneractiveAdSpot2 = null;
        }
        if (!inneractiveAdSpot2.isReady()) {
            AdError adError = new AdError(106, "DT Exchange's banner ad spot is not ready.", "com.google.ads.mediation.dtexchange");
            Log.w(f57322o, adError.getMessage());
            this.f57325n.onFailure(adError);
            InneractiveAdSpot inneractiveAdSpot5 = this.f57326t;
            if (inneractiveAdSpot5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            } else {
                inneractiveAdSpot3 = inneractiveAdSpot5;
            }
            inneractiveAdSpot3.destroy();
            return;
        }
        InneractiveAdSpot inneractiveAdSpot6 = this.f57326t;
        if (inneractiveAdSpot6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            inneractiveAdSpot6 = null;
        }
        InneractiveUnitController selectedUnitController = inneractiveAdSpot6.getSelectedUnitController();
        InneractiveAdViewUnitController inneractiveAdViewUnitController = selectedUnitController instanceof InneractiveAdViewUnitController ? (InneractiveAdViewUnitController) selectedUnitController : null;
        if (inneractiveAdViewUnitController != null) {
            RelativeLayout relativeLayout2 = this.f57324O;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wrapperView");
            } else {
                relativeLayout = relativeLayout2;
            }
            inneractiveAdViewUnitController.bindView(relativeLayout);
            this.J2 = (MediationBannerAdCallback) this.f57325n.onSuccess(this);
            return;
        }
        AdError adError2 = new AdError(105, "Unexpected controller type.", "com.google.ads.mediation.dtexchange");
        Log.w(f57322o, adError2.getMessage());
        this.f57325n.onFailure(adError2);
        InneractiveAdSpot inneractiveAdSpot7 = this.f57326t;
        if (inneractiveAdSpot7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adSpot");
        } else {
            inneractiveAdSpot4 = inneractiveAdSpot7;
        }
        inneractiveAdSpot4.destroy();
    }
}
