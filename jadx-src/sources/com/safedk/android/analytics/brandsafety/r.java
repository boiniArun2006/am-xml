package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class r extends e {
    public r(String[] strArr, String str, int i2, String str2, Bundle bundle, String str3) {
        super(strArr, str, i2, str2, bundle, str3, BrandSafetyUtils.AdType.MREC);
    }

    public r(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        super(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.MREC);
    }

    public r(String str, long j2) {
        super(str, j2, BrandSafetyUtils.AdType.MREC);
    }
}
