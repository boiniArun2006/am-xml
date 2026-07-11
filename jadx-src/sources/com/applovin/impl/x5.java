package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class x5 extends z5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1785k f50855j;

    public x5(C1785k c1785k, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1802k c1802k) {
        super(C1809u.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, c1802k);
        this.f50855j = c1785k;
    }

    @Override // com.applovin.impl.r5
    protected Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f50855j.b());
        map.put("adtoken_prefix", this.f50855j.d());
        return map;
    }
}
