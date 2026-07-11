package com.facebook.ads;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Keep
public class AdSize implements Serializable {
    private final int UNDEFINED;

    @Nullable
    private AdSizeApi mAdSizeApi;
    private final int mInitHeight;
    private final int mInitSizeType;
    private final int mInitWidth;

    @Deprecated
    public static final AdSize BANNER_320_50 = new AdSize(4);
    public static final AdSize INTERSTITIAL = new AdSize(100);
    public static final AdSize BANNER_HEIGHT_50 = new AdSize(5);
    public static final AdSize BANNER_HEIGHT_90 = new AdSize(6);
    public static final AdSize RECTANGLE_HEIGHT_250 = new AdSize(7);

    public AdSize(int i2, int i3) {
        this.UNDEFINED = -1;
        this.mInitSizeType = -1;
        this.mInitWidth = i2;
        this.mInitHeight = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdSize adSize = (AdSize) obj;
            if (getWidth() == adSize.getWidth() && getHeight() == adSize.getHeight()) {
                return true;
            }
        }
        return false;
    }

    public static AdSize fromWidthAndHeight(int i2, int i3) {
        AdSize adSize = INTERSTITIAL;
        if (adSize.getHeight() == i3 && adSize.getWidth() == i2) {
            return adSize;
        }
        AdSize adSize2 = BANNER_320_50;
        if (adSize2.getHeight() == i3 && adSize2.getWidth() == i2) {
            return adSize2;
        }
        AdSize adSize3 = BANNER_HEIGHT_50;
        if (adSize3.getHeight() == i3 && adSize3.getWidth() == i2) {
            return adSize3;
        }
        AdSize adSize4 = BANNER_HEIGHT_90;
        if (adSize4.getHeight() == i3 && adSize4.getWidth() == i2) {
            return adSize4;
        }
        AdSize adSize5 = RECTANGLE_HEIGHT_250;
        if (adSize5.getHeight() == i3 && adSize5.getWidth() == i2) {
            return adSize5;
        }
        throw new IllegalArgumentException("Can't create AdSize using this width = " + i2 + " && height = " + i3);
    }

    private AdSizeApi getAdSizeApi(int i2) {
        if (this.mAdSizeApi == null) {
            this.mAdSizeApi = DynamicLoaderFactory.makeLoaderUnsafe().createAdSizeApi(i2);
        }
        return this.mAdSizeApi;
    }

    public int getHeight() {
        int i2 = this.mInitSizeType;
        return i2 != -1 ? getAdSizeApi(i2).getHeight() : this.mInitHeight;
    }

    public int getWidth() {
        int i2 = this.mInitSizeType;
        return i2 != -1 ? getAdSizeApi(i2).getWidth() : this.mInitWidth;
    }

    public int hashCode() {
        return (getWidth() * 31) + getHeight();
    }

    private AdSize(int i2) {
        this.UNDEFINED = -1;
        this.mInitSizeType = i2;
        this.mInitWidth = -1;
        this.mInitHeight = -1;
    }
}
