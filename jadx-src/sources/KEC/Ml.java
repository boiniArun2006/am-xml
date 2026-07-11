package KEC;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.w6;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.ui.view.MediaView;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Ml extends UnifiedNativeAdMapper implements NativeAdListener {
    private NativeAd J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private MediationNativeAdCallback f5267O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final com.google.ads.mediation.vungle.n f5268Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediationNativeAdConfiguration f5269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f5270o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MediaView f5271r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MediationAdLoadCallback f5272t;

    class j implements w6.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f5274n;
        final /* synthetic */ String nr;
        final /* synthetic */ String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f5275t;

        j(Context context, String str, int i2, String str2) {
            this.f5274n = context;
            this.rl = str;
            this.f5275t = i2;
            this.nr = str2;
        }

        @Override // com.google.ads.mediation.vungle.w6.j
        public void onInitializeError(AdError adError) {
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            Ml.this.f5272t.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.w6.j
        public void onInitializeSuccess() throws Throwable {
            Ml ml = Ml.this;
            ml.J2 = ml.f5268Z.nr(this.f5274n, this.rl);
            Ml.this.J2.setAdOptionsPosition(this.f5275t);
            Ml.this.J2.setAdListener(Ml.this);
            Ml.this.f5271r = new MediaView(this.f5274n);
            if (!TextUtils.isEmpty(this.nr)) {
                Ml.this.J2.getAdConfig().setWatermark(this.nr);
            }
            Ml.this.J2.load(Ml.this.f5270o);
        }
    }

    private static class n extends NativeAd.Image {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Uri f5276n;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f5276n;
        }

        public n(Uri uri) {
            this.f5276n = uri;
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
    }

    private void Uo() {
        setHeadline(this.J2.getAdTitle());
        setBody(this.J2.getAdBodyText());
        setCallToAction(this.J2.getAdCallToActionText());
        Double adStarRating = this.J2.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.J2.getAdSponsoredText());
        setMediaView(this.f5271r);
        String appIcon = this.J2.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(AdPayload.FILE_SCHEME)) {
            setIcon(new n(Uri.parse(appIcon)));
        }
        if (TextUtils.isEmpty(this.f5270o)) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
    }

    public void KN() {
        int i2;
        int i3;
        Bundle serverParameters = this.f5269n.getServerParameters();
        NativeAdOptions nativeAdOptions = this.f5269n.getNativeAdOptions();
        Context context = this.f5269n.getContext();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            this.f5272t.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            this.f5272t.onFailure(adError2);
            return;
        }
        this.f5270o = this.f5269n.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            i2 = 3;
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement != 3) {
                    i2 = 1;
                } else {
                    i3 = 2;
                }
            }
            com.google.ads.mediation.vungle.w6.n().rl(string, context, new j(context, string2, i3, this.f5269n.getWatermark()));
        }
        i2 = 0;
        i3 = i2;
        com.google.ads.mediation.vungle.w6.n().rl(string, context, new j(context, string2, i3, this.f5269n.getWatermark()));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f5267O;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f5267O.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f5267O;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f5267O;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    public Ml(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.n nVar) {
        this.f5269n = mediationNativeAdConfiguration;
        this.f5272t = mediationAdLoadCallback;
        this.f5268Z = nVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.f5272t.onFailure(VungleMediationAdapter.getAdError(vungleError));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        Uo();
        this.f5267O = (MediationNativeAdCallback) this.f5272t.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) throws Throwable {
        super.trackViews(view, map, map2);
        String str = VungleMediationAdapter.TAG;
        Log.d(str, "trackViews()");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            com.vungle.ads.NativeAd nativeAd = this.J2;
            if (nativeAd != null && nativeAd.canPlayAd().booleanValue()) {
                View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                if (!(childAt instanceof FrameLayout)) {
                    Log.d(str, "Vungle requires a FrameLayout to render the native ad.");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ImageView imageView = null;
                View view2 = null;
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add((View) entry.getValue());
                    if (((String) entry.getKey()).equals("3003")) {
                        view2 = (View) entry.getValue();
                    }
                }
                if (view2 instanceof ImageView) {
                    imageView = (ImageView) view2;
                } else {
                    Log.d(VungleMediationAdapter.TAG, "The view to display a Vungle native icon image is not a type of ImageView, so it can't be registered for click events.");
                }
                this.J2.registerViewForInteraction((FrameLayout) childAt, this.f5271r, imageView, arrayList);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) throws Throwable {
        super.untrackView(view);
        Log.d(VungleMediationAdapter.TAG, "untrackView()");
        com.vungle.ads.NativeAd nativeAd = this.J2;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }
}
