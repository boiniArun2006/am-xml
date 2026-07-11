package com.applovin.impl;

import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class d4 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f48315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f48316c = new AtomicReference();

    private OkHttpClient a() {
        Object objBuild = this.f48316c.get();
        if (objBuild == null) {
            synchronized (this.f48316c) {
                try {
                    objBuild = this.f48316c.get();
                    if (objBuild == null) {
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        long jIntValue = ((Integer) this.f48314a.a(x4.T2)).intValue();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        objBuild = builder.connectTimeout(jIntValue, timeUnit).readTimeout(((Integer) this.f48314a.a(x4.f50797U2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                        if (objBuild == null) {
                            objBuild = this.f48316c;
                        }
                        this.f48316c.set(objBuild);
                    }
                } finally {
                }
            }
        }
        if (objBuild == this.f48316c) {
            objBuild = null;
        }
        return (OkHttpClient) objBuild;
    }

    public d4(C1802k c1802k) {
        this.f48314a = c1802k;
        this.f48315b = c1802k.O();
    }

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) throws IOException {
        Response responseExecute = a().newCall(new Request.Builder().url(str).get().build()).execute();
        int iCode = responseExecute.code();
        this.f48314a.D().a("loadResource", str, iCode, responseExecute.message());
        if (r0.a(iCode)) {
            return null;
        }
        if (C1804o.a()) {
            this.f48315b.a("OkHttpLoader", "Opened stream to resource " + str);
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null) {
            return null;
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(GDEJgAYrPQHfw.hrWWxjvPihWwlnj, str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", mapHashMap);
        CollectionUtils.putStringIfValid("details", responseExecute.protocol().name(), mapHashMap);
        this.f48314a.g().d(d2.f48264Q, mapHashMap);
        return responseBodyBody.byteStream();
    }
}
