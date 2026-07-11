package YJ;

import FQ.I28;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w6 extends UnifiedNativeAdMapper {
    private MediaView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private MediationNativeAdCallback f12078O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediationAdLoadCallback f12079n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final I28 f12080r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private NativeAdBase f12081t;

    private class Ml implements AdListener, NativeAdListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference f12083n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final NativeAdBase f12084t;

        class j implements InterfaceC0432w6 {
            j() {
            }

            @Override // YJ.w6.InterfaceC0432w6
            public void n(AdError adError) {
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                w6.this.f12079n.onFailure(adError);
            }

            @Override // YJ.w6.InterfaceC0432w6
            public void rl() {
                w6 w6Var = w6.this;
                w6Var.f12078O = (MediationNativeAdCallback) w6Var.f12079n.onSuccess(w6.this);
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        Ml(Context context, NativeAdBase nativeAdBase) {
            this.f12084t = nativeAdBase;
            this.f12083n = new WeakReference(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            w6.this.f12078O.reportAdClicked();
            w6.this.f12078O.onAdOpened();
            w6.this.f12078O.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            if (ad != this.f12084t) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
                w6.this.f12079n.onFailure(adError);
                return;
            }
            Context context = (Context) this.f12083n.get();
            if (context != null) {
                w6.this.O(context, new j());
                return;
            }
            AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            w6.this.f12079n.onFailure(adError2);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            w6.this.f12079n.onFailure(adError2);
        }
    }

    class j implements MediaViewListener {
        @Override // com.facebook.ads.MediaViewListener
        public void onEnterFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onExitFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenBackground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenForeground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPause(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPlay(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onVolumeChange(MediaView mediaView, float f3) {
        }

        j() {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onComplete(MediaView mediaView) {
            if (w6.this.f12078O != null) {
                w6.this.f12078O.onVideoComplete();
            }
        }
    }

    private class n extends NativeAd.Image {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Drawable f12087n;
        private Uri rl;

        public n() {
        }

        public n(Uri uri) {
            this.rl = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f12087n;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.rl;
        }

        public n(Drawable drawable) {
            this.f12087n = drawable;
        }
    }

    /* JADX INFO: renamed from: YJ.w6$w6, reason: collision with other inner class name */
    private interface InterfaceC0432w6 {
        void n(AdError adError);

        void rl();
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = (View) map.get("3003");
        NativeAdBase nativeAdBase = this.f12081t;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            } else if (view2 instanceof ImageView) {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
                return;
            }
        }
        if (!(nativeAdBase instanceof com.facebook.ads.NativeAd)) {
            Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
            return;
        }
        com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
        if (view2 instanceof ImageView) {
            nativeAd.registerViewForInteraction(view, this.J2, (ImageView) view2, arrayList);
        } else {
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.J2, arrayList);
        }
    }

    public void O(Context context, InterfaceC0432w6 interfaceC0432w6) {
        if (!nr(this.f12081t)) {
            AdError adError = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            interfaceC0432w6.n(adError);
            return;
        }
        setHeadline(this.f12081t.getAdHeadline());
        if (this.f12081t.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new n(Uri.parse(this.f12081t.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.f12081t.getAdBodyText());
        if (this.f12081t.getPreloadedIconViewDrawable() != null) {
            setIcon(new n(this.f12081t.getPreloadedIconViewDrawable()));
        } else if (this.f12081t.getAdIcon() == null) {
            setIcon(new n());
        } else {
            setIcon(new n(Uri.parse(this.f12081t.getAdIcon().getUrl())));
        }
        setCallToAction(this.f12081t.getAdCallToAction());
        setAdvertiser(this.f12081t.getAdvertiserName());
        this.J2.setListener(new j());
        setHasVideoContent(true);
        setMediaView(this.J2);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", this.f12081t.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f12081t.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.f12081t, null));
        interfaceC0432w6.rl();
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        NativeAdBase nativeAdBase = this.f12081t;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }

    public w6(MediationAdLoadCallback mediationAdLoadCallback, I28 i28) {
        this.f12079n = mediationAdLoadCallback;
        this.f12080r = i28;
    }

    private boolean nr(NativeAdBase nativeAdBase) {
        boolean z2;
        if (nativeAdBase.getAdHeadline() != null && nativeAdBase.getAdBodyText() != null && nativeAdBase.getAdIcon() != null && nativeAdBase.getAdCallToAction() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (nativeAdBase instanceof NativeBannerAd) {
            return z2;
        }
        if (!z2 || nativeAdBase.getAdCoverImage() == null || this.J2 == null) {
            return false;
        }
        return true;
    }

    public void J2(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        String placementID = FacebookMediationAdapter.getPlacementID(mediationNativeAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f12079n.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationNativeAdConfiguration);
        this.J2 = this.f12080r.t(mediationNativeAdConfiguration.getContext());
        try {
            this.f12081t = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration.getContext(), placementID, mediationNativeAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration.getWatermark())) {
                this.f12081t.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = this.f12081t;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new Ml(mediationNativeAdConfiguration.getContext(), this.f12081t)).withBid(mediationNativeAdConfiguration.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e2) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e2.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f12079n.onFailure(adError2);
        }
    }
}
