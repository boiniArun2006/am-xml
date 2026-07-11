package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@AdNetworkIdentifier(packageName = h.f63168h)
public class AdMobCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static String[] f62413Y = {"googleusercontent.com", "/simgad/", "mts0.google.com", "gstatic.com", "pageadimg/imgad"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62414a = "AdMobCreativeInfo";
    private static final long serialVersionUID = 0;

    public AdMobCreativeInfo() {
    }

    public AdMobCreativeInfo(String id, BrandSafetyUtils.AdType adType, String creativeId, String clickUrl, String placementId, String videoUrl, String sdkVersion, String downstreamStruct, String appPackageName) {
        super(adType, h.f63168h, id, creativeId, clickUrl, videoUrl, downstreamStruct, sdkVersion);
        this.f62469K = placementId;
        if (p() == null && appPackageName != null) {
            q(appPackageName);
        }
    }

    public static boolean a(String str) {
        for (String str2 : f62413Y) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        return a(str) || super.b(str);
    }
}
