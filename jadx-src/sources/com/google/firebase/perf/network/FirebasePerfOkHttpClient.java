package com.google.firebase.perf.network;

import R0.CN3;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import jMi.C;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class FirebasePerfOkHttpClient {
    @Keep
    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        call.enqueue(new Ml(callback, C.gh(), timer, timer.O()));
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        CN3 cn3T = CN3.t(C.gh());
        Timer timer = new Timer();
        long jO = timer.O();
        try {
            Response responseExecute = call.execute();
            n(responseExecute, cn3T, jO, timer.t());
            return responseExecute;
        } catch (IOException e2) {
            Request request = call.request();
            if (request != null) {
                HttpUrl httpUrlUrl = request.url();
                if (httpUrlUrl != null) {
                    cn3T.Z(httpUrlUrl.url().toString());
                }
                if (request.method() != null) {
                    cn3T.mUb(request.method());
                }
            }
            cn3T.ty(jO);
            cn3T.r(timer.t());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    static void n(Response response, CN3 cn3, long j2, long j3) throws IOException {
        Request request = response.request();
        if (request == null) {
            return;
        }
        cn3.Z(request.url().url().toString());
        cn3.mUb(request.method());
        if (request.body() != null) {
            long jContentLength = request.body().contentLength();
            if (jContentLength != -1) {
                cn3.az(jContentLength);
            }
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            long contentLength = responseBodyBody.getContentLength();
            if (contentLength != -1) {
                cn3.ck(contentLength);
            }
            MediaType mediaType = responseBodyBody.get$contentType();
            if (mediaType != null) {
                cn3.HI(mediaType.getMediaType());
            }
        }
        cn3.gh(response.code());
        cn3.ty(j2);
        cn3.r(j3);
        cn3.rl();
    }
}
