package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class a6 extends C1815y5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1785k f47927j;

    public a6(C1785k c1785k, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        super(C1809u.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", c1802k);
        this.f47927j = c1785k;
    }

    @Override // com.applovin.impl.r5
    protected Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f47927j.b());
        map.put("adtoken_prefix", this.f47927j.d());
        return map;
    }
}
