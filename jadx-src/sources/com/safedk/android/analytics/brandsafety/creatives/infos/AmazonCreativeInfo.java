package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@AdNetworkIdentifier(packageName = h.f63155A)
public class AmazonCreativeInfo extends CreativeInfo {
    private static final long serialVersionUID = 0;

    public AmazonCreativeInfo() {
    }

    public AmazonCreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String creativeId, String sdkVersion) {
        super(adType, sdk, null, creativeId, null, null, null, sdkVersion);
        this.f62469K = "";
    }
}
