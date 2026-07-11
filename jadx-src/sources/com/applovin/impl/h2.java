package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class h2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f48653b;

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setConnectTimeout(((Integer) this.f48652a.a(x4.T2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f48652a.a(x4.f50797U2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int iHttpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
        this.f48652a.D().a("loadResource", str, iHttpUrlConnectionGetResponseCode, httpURLConnection.getResponseMessage());
        if (r0.a(iHttpUrlConnectionGetResponseCode)) {
            return null;
        }
        if (C1804o.a()) {
            this.f48653b.a("HttpUrlConnectionLoader", "Opened stream to resource " + str);
        }
        InputStream inputStreamUrlConnectionGetInputStream = AppLovinNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", mapHashMap);
        this.f48652a.g().d(d2.f48264Q, mapHashMap);
        return inputStreamUrlConnectionGetInputStream;
    }

    public h2(C1802k c1802k) {
        this.f48652a = c1802k;
        this.f48653b = c1802k.O();
    }
}
