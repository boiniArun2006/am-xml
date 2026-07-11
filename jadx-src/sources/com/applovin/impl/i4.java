package com.applovin.impl;

import android.webkit.WebView;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class i4 extends f4 {
    @Override // com.applovin.impl.f4
    protected AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f48526b.e0().b(), this.f48526b.e0().a(), this.f48525a.getOpenMeasurementVerificationScriptResources(), this.f48525a.getOpenMeasurementContentUrl(), this.f48525a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (!C1804o.a()) {
                return null;
            }
            this.f48527c.a(this.f48528d, "Failed to create ad session context", th);
            return null;
        }
    }

    public i4(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.f4
    protected AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (!C1804o.a()) {
                return null;
            }
            this.f48527c.a(this.f48528d, "Failed to create ad session configuration", th);
            return null;
        }
    }
}
