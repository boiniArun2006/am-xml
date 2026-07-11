package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@AdNetworkIdentifier(packageName = h.f63158D)
public class MobileFuseCreativeInfo extends CreativeInfo {
    private static final long serialVersionUID = 0;

    public MobileFuseCreativeInfo() {
    }

    public MobileFuseCreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id, String creativeId, String sdkVersion, String placementId, String eventId) {
        super(adType, sdk, id, creativeId, null, null, null, sdkVersion);
        this.f62469K = placementId;
        h(eventId);
    }
}
