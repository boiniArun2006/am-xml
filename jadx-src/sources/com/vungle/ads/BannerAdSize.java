package com.vungle.ads;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Deprecated(message = "Use VungleAdSize instead")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/BannerAdSize;", "", "sizeName", "", "width", "", "height", "(Ljava/lang/String;ILjava/lang/String;II)V", "getHeight", "()I", "getSizeName", "()Ljava/lang/String;", "getWidth", "VUNGLE_MREC", BrandSafetyUtils.f61447m, "BANNER_SHORT", "BANNER_LEADERBOARD", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum BannerAdSize {
    VUNGLE_MREC("mrec", d.f62986a, 250),
    BANNER("banner", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50),
    BANNER_SHORT("banner_short", d.f62986a, 50),
    BANNER_LEADERBOARD("banner_leaderboard", 728, 90);

    private final int height;
    private final String sizeName;
    private final int width;

    public final int getHeight() {
        return this.height;
    }

    public final String getSizeName() {
        return this.sizeName;
    }

    public final int getWidth() {
        return this.width;
    }

    BannerAdSize(String str, int i2, int i3) {
        this.sizeName = str;
        this.width = i2;
        this.height = i3;
    }
}
