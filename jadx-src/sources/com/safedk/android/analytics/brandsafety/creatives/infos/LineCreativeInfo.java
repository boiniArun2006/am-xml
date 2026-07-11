package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@AdNetworkIdentifier(packageName = h.f63186z)
public class LineCreativeInfo extends CreativeInfo {
    private static final long serialVersionUID = 0;

    public LineCreativeInfo() {
    }

    public LineCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String placementId, String sdkVersion) {
        super(adType == null ? BrandSafetyUtils.AdType.INTERSTITIAL : adType, h.f63186z, id, creativeId, clickUrl, null, null, sdkVersion);
        j(placementId);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean v(String str) {
        return super.v(str);
    }
}
