package com.applovin.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.w3;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class MaxAdFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51042b;
    public static final MaxAdFormat BANNER = new MaxAdFormat(BrandSafetyUtils.f61447m, "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat(BrandSafetyUtils.f61449o, BrandSafetyUtils.f61449o);
    public static final MaxAdFormat LEADER = new MaxAdFormat(BrandSafetyUtils.f61448n, "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat(BrandSafetyUtils.f61444j, "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat(BrandSafetyUtils.f61446l, "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat(BrandSafetyUtils.f61445k, "Rewarded");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");

    @Deprecated
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");

    public AppLovinSdkUtils.Size getAdaptiveSize(Context context) {
        return getAdaptiveSize(-1, context);
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i2, Context context) {
        return (this == BANNER || this == LEADER) ? w3.a(i2, this, context) : getSize();
    }

    @Deprecated
    public String getDisplayName() {
        return this.f51042b;
    }

    public String getLabel() {
        return this.f51041a;
    }

    public AppLovinSdkUtils.Size getSize() {
        return this == BANNER ? new AppLovinSdkUtils.Size(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50) : this == LEADER ? new AppLovinSdkUtils.Size(728, 90) : this == MREC ? new AppLovinSdkUtils.Size(d.f62986a, 250) : new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED;
    }

    public String toString() {
        return "MaxAdFormat{label='" + this.f51041a + "'}";
    }

    private MaxAdFormat(String str, String str2) {
        this.f51041a = str;
        this.f51042b = str2;
    }

    @Nullable
    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("native")) {
            return NATIVE;
        }
        if (!str.equalsIgnoreCase("leaderboard") && !str.equalsIgnoreCase("leader")) {
            if (!str.equalsIgnoreCase(Constants.PLACEMENT_TYPE_INTERSTITIAL) && !str.equalsIgnoreCase("inter")) {
                if (!str.equalsIgnoreCase(Constants.PLACEMENT_TYPE_APP_OPEN) && !str.equalsIgnoreCase("app_open")) {
                    if (!str.equalsIgnoreCase(Constants.PLACEMENT_TYPE_REWARDED) && !str.equalsIgnoreCase("reward")) {
                        C1804o.h("AppLovinSdk", "Unknown ad format: " + str);
                        return null;
                    }
                    return REWARDED;
                }
                return APP_OPEN;
            }
            return INTERSTITIAL;
        }
        return LEADER;
    }
}
