package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@AdNetworkIdentifier(packageName = h.f63158D)
public class MolocoCreativeInfo extends CreativeInfo {
    private static final long serialVersionUID = 0;

    public MolocoCreativeInfo() {
    }

    public MolocoCreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id, String creativeId, String downstreamStruct, String sdkVersion, String placementId, String packageName, String adDomain, String eventId) {
        super(adType, sdk, id, creativeId, null, null, downstreamStruct, sdkVersion);
        this.f62469K = placementId;
        this.aZ = adDomain;
        this.f62470M = packageName;
        h(eventId);
    }
}
