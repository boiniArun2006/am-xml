package com.google.firebase.perf.network;

import R0.CN3;
import com.google.firebase.perf.util.Timer;
import jMi.C;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Ml implements Callback {
    private final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Timer f60655O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Callback f60656n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CN3 f60657t;

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) throws IOException {
        FirebasePerfOkHttpClient.n(response, this.f60657t, this.J2, this.f60655O.t());
        this.f60656n.onResponse(call, response);
    }

    public Ml(Callback callback, C c2, Timer timer, long j2) {
        this.f60656n = callback;
        this.f60657t = CN3.t(c2);
        this.J2 = j2;
        this.f60655O = timer;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        if (request != null) {
            HttpUrl httpUrlUrl = request.url();
            if (httpUrlUrl != null) {
                this.f60657t.Z(httpUrlUrl.url().toString());
            }
            if (request.method() != null) {
                this.f60657t.mUb(request.method());
            }
        }
        this.f60657t.ty(this.J2);
        this.f60657t.r(this.f60655O.t());
        nl4.Ml.nr(this.f60657t);
        this.f60656n.onFailure(call, iOException);
    }
}
