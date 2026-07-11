package com.applovin.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.applovin.Ml;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ApplovinAdapter extends AppLovinMediationAdapter implements MediationBannerAdapter {
    private static final boolean LOGGING_ENABLED = true;
    private AppLovinAdView adView;
    private FrameLayout adViewWrapper;
    private AppLovinSdk sdk;
    private String zoneId;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    public static void log(int i2, String str) {
        Log.println(i2, "AppLovinAdapter", str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.adViewWrapper;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull final Context context, @NonNull final MediationBannerListener mediationBannerListener, @NonNull final Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        if (AppLovinUtils.isChildUser()) {
            mediationBannerListener.onAdFailedToLoad(this, AppLovinUtils.getChildUserError());
            return;
        }
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError.getMessage());
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        final AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, adSize);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize == null) {
            AdError adError2 = new AdError(101, "Failed to request banner with unsupported size.", AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError2.getMessage());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
            FrameLayout frameLayout = new FrameLayout(context);
            this.adViewWrapper = frameLayout;
            frameLayout.setLayoutParams(layoutParams);
            Ml.n().rl(context, string, new Ml.n() { // from class: com.applovin.mediation.ApplovinAdapter.1
                @Override // com.google.ads.mediation.applovin.Ml.n
                public void onInitializeSuccess() {
                    ApplovinAdapter.this.sdk = Ml.n().t(context);
                    ApplovinAdapter.this.zoneId = AppLovinUtils.retrieveZoneId(bundle);
                    ApplovinAdapter.log(3, "Requesting banner of size " + appLovinAdSizeAppLovinAdSizeFromAdMobAdSize + " for zone: " + ApplovinAdapter.this.zoneId);
                    ApplovinAdapter.this.adView = new AppLovinAdView(ApplovinAdapter.this.sdk, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, context);
                    AppLovinBannerAdListener appLovinBannerAdListener = new AppLovinBannerAdListener(ApplovinAdapter.this.zoneId, ApplovinAdapter.this.adView, ApplovinAdapter.this, mediationBannerListener);
                    ApplovinAdapter.this.adView.setAdDisplayListener(appLovinBannerAdListener);
                    ApplovinAdapter.this.adView.setAdClickListener(appLovinBannerAdListener);
                    ApplovinAdapter.this.adView.setAdViewEventListener(appLovinBannerAdListener);
                    ApplovinAdapter.this.adViewWrapper.addView(ApplovinAdapter.this.adView);
                    if (TextUtils.isEmpty(ApplovinAdapter.this.zoneId)) {
                        ApplovinAdapter.this.sdk.getAdService().loadNextAd(appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, appLovinBannerAdListener);
                    } else {
                        ApplovinAdapter.this.sdk.getAdService().loadNextAdForZoneId(ApplovinAdapter.this.zoneId, appLovinBannerAdListener);
                    }
                }
            });
        }
    }
}
