package com.google.ads.mediation.fyber;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.external.NativeAdEventsListener;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Map;
import kc.C2216j;
import kc.C2217n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 extends NativeAdMapper {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final j f57331O = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediationAdLoadCallback f57332n;
    private NativeAdContent nr;
    private MediationNativeAdCallback rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InneractiveAdSpot f57333t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class I28 extends InneractiveAdSpot.NativeAdRequestListener {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MediationNativeAdConfiguration f57335t;

        I28(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
            this.f57335t = mediationNativeAdConfiguration;
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            w6.this.xMQ("onInneractiveFailedAdRequest error: " + inneractiveErrorCode, inneractiveErrorCode);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener
        public void onInneractiveSuccessfulNativeAdRequest(InneractiveAdSpot inneractiveAdSpot, NativeAdContent nativeAdContent) {
            if (nativeAdContent == null) {
                w6.this.xMQ("content is NOT NativeAdContent", InneractiveErrorCode.SDK_INTERNAL_ERROR);
                return;
            }
            w6 w6Var = w6.this;
            Context context = this.f57335t.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            w6Var.KN(context, nativeAdContent);
            w6 w6Var2 = w6.this;
            w6Var2.rl = (MediationNativeAdCallback) w6Var2.f57332n.onSuccess(w6.this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Ml extends NativeAdEventsListener {
        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot adSpot) {
            Intrinsics.checkNotNullParameter(adSpot, "adSpot");
        }

        Ml() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot adSpot) {
            Intrinsics.checkNotNullParameter(adSpot, "adSpot");
            MediationNativeAdCallback mediationNativeAdCallback = w6.this.rl;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.reportAdClicked();
            }
            MediationNativeAdCallback mediationNativeAdCallback2 = w6.this.rl;
            if (mediationNativeAdCallback2 != null) {
                mediationNativeAdCallback2.onAdOpened();
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot adSpot) {
            Intrinsics.checkNotNullParameter(adSpot, "adSpot");
            MediationNativeAdCallback mediationNativeAdCallback = w6.this.rl;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onAdOpened();
            }
            MediationNativeAdCallback mediationNativeAdCallback2 = w6.this.rl;
            if (mediationNativeAdCallback2 != null) {
                mediationNativeAdCallback2.reportAdImpression();
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot adSpot) {
            Intrinsics.checkNotNullParameter(adSpot, "adSpot");
            MediationNativeAdCallback mediationNativeAdCallback = w6.this.rl;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onAdLeftApplication();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class n extends NativeAd.Image {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f57337n;

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        public Void n() {
            return null;
        }

        public n(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f57337n = uri;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public Uri getUri() {
            return this.f57337n;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public /* bridge */ /* synthetic */ Drawable getDrawable() {
            return (Drawable) n();
        }
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.fyber.w6$w6, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class C0762w6 implements VideoContentListener {
        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
        public void onPlayerError() {
        }

        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
        public void onProgress(int i2, int i3) {
        }

        C0762w6() {
        }

        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
        public void onCompleted() {
            MediationNativeAdCallback mediationNativeAdCallback = w6.this.rl;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onVideoComplete();
            }
        }
    }

    public w6(MediationAdLoadCallback adLoadCallback) {
        Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        this.f57332n = adLoadCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KN(Context context, NativeAdContent nativeAdContent) {
        nativeAdContent.bindMediaView(new MediaView(context));
        this.nr = nativeAdContent;
        String adTitle = nativeAdContent.getAdTitle();
        if (adTitle != null) {
            setHeadline(adTitle);
        }
        String adDescription = nativeAdContent.getAdDescription();
        if (adDescription != null) {
            setBody(adDescription);
        }
        Uri appIcon = nativeAdContent.getAppIcon();
        if (appIcon != null) {
            setIcon(new n(appIcon));
        }
        String adCallToAction = nativeAdContent.getAdCallToAction();
        if (adCallToAction != null) {
            setCallToAction(adCallToAction);
        }
        MediaView mediaView = nativeAdContent.getMediaView();
        if (mediaView != null) {
            setMediaView(mediaView);
        }
        if (nativeAdContent.getRating() != null) {
            setStarRating(Double.valueOf(r3.floatValue()));
        }
        Float mediaAspectRatio = nativeAdContent.getMediaAspectRatio();
        if (mediaAspectRatio != null) {
            setMediaContentAspectRatio(mediaAspectRatio.floatValue());
        }
        setOverrideClickHandling(true);
        setOverrideImpressionRecording(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xMQ(String str, InneractiveErrorCode inneractiveErrorCode) {
        Log.e("DTExchangeNativeAdMapper", str);
        MediationAdLoadCallback mediationAdLoadCallback = this.f57332n;
        if (inneractiveErrorCode == null) {
            inneractiveErrorCode = InneractiveErrorCode.SDK_INTERNAL_ERROR;
        }
        mediationAdLoadCallback.onFailure(C2216j.n(inneractiveErrorCode));
        InneractiveAdSpot inneractiveAdSpot = this.f57333t;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.f57333t = null;
    }

    public final void J2(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        Intrinsics.checkNotNullParameter(mediationNativeAdConfiguration, "mediationNativeAdConfiguration");
        InneractiveAdManager.setMediationName(FyberMediationAdapter.f57296T);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        Intrinsics.checkNotNullExpressionValue(bidResponse, "getBidResponse(...)");
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        NativeAdUnitController nativeAdUnitControllerRl = C2217n.rl();
        NativeAdVideoContentController nativeAdVideoContentControllerT = C2217n.t();
        nativeAdVideoContentControllerT.setEventsListener(new C0762w6());
        nativeAdUnitControllerRl.addContentController(nativeAdVideoContentControllerT);
        nativeAdUnitControllerRl.setEventsListener(new Ml());
        inneractiveAdSpotCreateSpot.addUnitController(nativeAdUnitControllerRl);
        inneractiveAdSpotCreateSpot.setRequestListener(new I28(mediationNativeAdConfiguration));
        com.google.ads.mediation.fyber.Ml.t(mediationNativeAdConfiguration.getMediationExtras());
        inneractiveAdSpotCreateSpot.loadAd(bidResponse);
        this.f57333t = inneractiveAdSpotCreateSpot;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void trackViews(View containerView, Map clickableAssetViews, Map nonClickableAssetViews) {
        MediaView mediaView;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        Intrinsics.checkNotNullParameter(nonClickableAssetViews, "nonClickableAssetViews");
        containerView.setTag(NativeAdContent.ViewTag.ROOT);
        NativeAdContent nativeAdContent = this.nr;
        if (nativeAdContent != null && (mediaView = nativeAdContent.getMediaView()) != null) {
            mediaView.setTag(NativeAdContent.ViewTag.MEDIA_VIEW);
        }
        for (Map.Entry entry : clickableAssetViews.entrySet()) {
            ((View) entry.getValue()).setTag(Uo((String) entry.getKey()));
        }
        NativeAdContent nativeAdContent2 = this.nr;
        if (nativeAdContent2 != null) {
            nativeAdContent2.registerViewsForInteraction((ViewGroup) containerView, nativeAdContent2 != null ? nativeAdContent2.getMediaView() : null, null, clickableAssetViews.values());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final String Uo(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 1567014) {
            switch (iHashCode) {
                case 1567006:
                    if (str.equals(aNrWBQYwFf.YEwLfuGQFTT)) {
                        return NativeAdContent.ViewTag.AD_TITLE;
                    }
                    return NativeAdContent.ViewTag.OTHER;
                case 1567007:
                    if (str.equals("3002")) {
                        return NativeAdContent.ViewTag.CTA;
                    }
                    return NativeAdContent.ViewTag.OTHER;
                case 1567008:
                    if (str.equals("3003")) {
                        return NativeAdContent.ViewTag.AD_ICON;
                    }
                    return NativeAdContent.ViewTag.OTHER;
                case 1567009:
                    if (str.equals("3004")) {
                        return NativeAdContent.ViewTag.AD_DESCRIPTION;
                    }
                    return NativeAdContent.ViewTag.OTHER;
                default:
                    return NativeAdContent.ViewTag.OTHER;
            }
        }
        if (!str.equals("3009")) {
            return NativeAdContent.ViewTag.OTHER;
        }
        return NativeAdContent.ViewTag.RATING;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void destroy() {
        super.destroy();
        InneractiveAdSpot inneractiveAdSpot = this.f57333t;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.f57333t = null;
        NativeAdContent nativeAdContent = this.nr;
        if (nativeAdContent != null) {
            nativeAdContent.destroy();
        }
        this.nr = null;
        this.rl = null;
    }
}
