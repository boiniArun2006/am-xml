package com.vungle.ads;

import android.content.Context;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ViewUtility;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/VungleAdSize;", "", "width", "", "height", "(II)V", "getHeight", "()I", "isAdaptiveHeight", "", "isAdaptiveHeight$vungle_ads_release", "()Z", "setAdaptiveHeight$vungle_ads_release", "(Z)V", "isAdaptiveWidth", "isAdaptiveWidth$vungle_ads_release", "setAdaptiveWidth$vungle_ads_release", "getWidth", "isValidSize", "isValidSize$vungle_ads_release", "toString", "", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleAdSize {
    private final int height;
    private boolean isAdaptiveHeight;
    private boolean isAdaptiveWidth;
    private final int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final VungleAdSize BANNER = new VungleAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);

    @JvmField
    public static final VungleAdSize BANNER_SHORT = new VungleAdSize(d.f62986a, 50);

    @JvmField
    public static final VungleAdSize BANNER_LEADERBOARD = new VungleAdSize(728, 90);

    @JvmField
    public static final VungleAdSize MREC = new VungleAdSize(d.f62986a, 250);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/VungleAdSize$Companion;", "", "()V", BrandSafetyUtils.f61447m, "Lcom/vungle/ads/VungleAdSize;", "BANNER_LEADERBOARD", "BANNER_SHORT", BrandSafetyUtils.f61449o, "getAdSizeWithWidth", "context", "Landroid/content/Context;", "width", "", "getAdSizeWithWidthAndHeight", "height", "getValidAdSizeFromSize", "placementId", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final VungleAdSize getAdSizeWithWidthAndHeight(int width, int height) {
            if (width < 0) {
                width = 0;
            }
            if (height < 0) {
                height = 0;
            }
            VungleAdSize vungleAdSize = new VungleAdSize(width, height);
            if (vungleAdSize.getWidth() == 0) {
                vungleAdSize.setAdaptiveWidth$vungle_ads_release(true);
            }
            if (vungleAdSize.getHeight() == 0) {
                vungleAdSize.setAdaptiveHeight$vungle_ads_release(true);
            }
            return vungleAdSize;
        }

        private Companion() {
        }

        @JvmStatic
        public final VungleAdSize getAdSizeWithWidth(Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            int iIntValue = ViewUtility.INSTANCE.getDeviceWidthAndHeightWithOrientation(context, 0).component2().intValue();
            if (width < 0) {
                width = 0;
            }
            VungleAdSize vungleAdSize = new VungleAdSize(width, iIntValue);
            if (vungleAdSize.getWidth() == 0) {
                vungleAdSize.setAdaptiveWidth$vungle_ads_release(true);
            }
            vungleAdSize.setAdaptiveHeight$vungle_ads_release(true);
            return vungleAdSize;
        }

        @JvmStatic
        public final VungleAdSize getValidAdSizeFromSize(int width, int height, String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Placement placement = ConfigManager.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                if (!placement.isInline()) {
                    placement = null;
                }
                if (placement != null) {
                    return VungleAdSize.INSTANCE.getAdSizeWithWidthAndHeight(width, height);
                }
            }
            VungleAdSize vungleAdSize = VungleAdSize.MREC;
            if (width >= vungleAdSize.getWidth() && height >= vungleAdSize.getHeight()) {
                return vungleAdSize;
            }
            VungleAdSize vungleAdSize2 = VungleAdSize.BANNER_LEADERBOARD;
            if (width >= vungleAdSize2.getWidth() && height >= vungleAdSize2.getHeight()) {
                return vungleAdSize2;
            }
            VungleAdSize vungleAdSize3 = VungleAdSize.BANNER;
            if (width >= vungleAdSize3.getWidth() && height >= vungleAdSize3.getHeight()) {
                return vungleAdSize3;
            }
            VungleAdSize vungleAdSize4 = VungleAdSize.BANNER_SHORT;
            return (width < vungleAdSize4.getWidth() || height < vungleAdSize4.getHeight()) ? getAdSizeWithWidthAndHeight(width, height) : vungleAdSize4;
        }
    }

    @JvmStatic
    public static final VungleAdSize getAdSizeWithWidth(Context context, int i2) {
        return INSTANCE.getAdSizeWithWidth(context, i2);
    }

    @JvmStatic
    public static final VungleAdSize getAdSizeWithWidthAndHeight(int i2, int i3) {
        return INSTANCE.getAdSizeWithWidthAndHeight(i2, i3);
    }

    @JvmStatic
    public static final VungleAdSize getValidAdSizeFromSize(int i2, int i3, String str) {
        return INSTANCE.getValidAdSizeFromSize(i2, i3, str);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: isAdaptiveHeight$vungle_ads_release, reason: from getter */
    public final boolean getIsAdaptiveHeight() {
        return this.isAdaptiveHeight;
    }

    /* JADX INFO: renamed from: isAdaptiveWidth$vungle_ads_release, reason: from getter */
    public final boolean getIsAdaptiveWidth() {
        return this.isAdaptiveWidth;
    }

    public final boolean isValidSize$vungle_ads_release() {
        return this.width >= 0 && this.height >= 0;
    }

    public final void setAdaptiveHeight$vungle_ads_release(boolean z2) {
        this.isAdaptiveHeight = z2;
    }

    public final void setAdaptiveWidth$vungle_ads_release(boolean z2) {
        this.isAdaptiveWidth = z2;
    }

    public String toString() {
        return "VungleAdSize(width=" + this.width + ", height=" + this.height + ')';
    }

    public VungleAdSize(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }
}
