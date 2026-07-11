package com.fyber.inneractive.sdk.network;

import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HttpURLConnection f54265g;

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        try {
            HttpURLConnection httpURLConnection = this.f54265g;
            if (httpURLConnection != null) {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            }
        } catch (Throwable unused) {
        }
        super.a();
    }

    public j(HttpURLConnection httpURLConnection, int i2, FilterInputStream filterInputStream, Map map, String str) {
        this.f54265g = httpURLConnection;
        this.f54270a = i2;
        this.f54272c = filterInputStream;
        this.f54273d = map;
        this.f54274e = str;
    }
}
