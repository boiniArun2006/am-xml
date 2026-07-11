package com.google.firebase.perf.network;

import R0.CN3;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import jMi.C;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return Uo(httpClient, httpUriRequest, new Timer(), C.gh());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return KN(httpClient, httpUriRequest, httpContext, new Timer(), C.gh());
    }

    static HttpResponse J2(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, C c2) throws IOException {
        CN3 cn3T = CN3.t(c2);
        try {
            cn3T.Z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mUb(httpRequest.getRequestLine().getMethod());
            Long lN2 = nl4.Ml.n(httpRequest);
            if (lN2 != null) {
                cn3T.az(lN2.longValue());
            }
            timer.Uo();
            cn3T.ty(timer.O());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            cn3T.r(timer.t());
            cn3T.gh(httpResponseExecute.getStatusLine().getStatusCode());
            Long lN3 = nl4.Ml.n(httpResponseExecute);
            if (lN3 != null) {
                cn3T.ck(lN3.longValue());
            }
            String strRl = nl4.Ml.rl(httpResponseExecute);
            if (strRl != null) {
                cn3T.HI(strRl);
            }
            cn3T.rl();
            return httpResponseExecute;
        } catch (IOException e2) {
            cn3T.r(timer.t());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    static HttpResponse KN(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, C c2) throws IOException {
        CN3 cn3T = CN3.t(c2);
        try {
            cn3T.Z(httpUriRequest.getURI().toString()).mUb(httpUriRequest.getMethod());
            Long lN2 = nl4.Ml.n(httpUriRequest);
            if (lN2 != null) {
                cn3T.az(lN2.longValue());
            }
            timer.Uo();
            cn3T.ty(timer.O());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            cn3T.r(timer.t());
            cn3T.gh(httpResponseExecute.getStatusLine().getStatusCode());
            Long lN3 = nl4.Ml.n(httpResponseExecute);
            if (lN3 != null) {
                cn3T.ck(lN3.longValue());
            }
            String strRl = nl4.Ml.rl(httpResponseExecute);
            if (strRl != null) {
                cn3T.HI(strRl);
            }
            cn3T.rl();
            return httpResponseExecute;
        } catch (IOException e2) {
            cn3T.r(timer.t());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    static HttpResponse O(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, C c2) throws IOException {
        CN3 cn3T = CN3.t(c2);
        try {
            cn3T.Z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mUb(httpRequest.getRequestLine().getMethod());
            Long lN2 = nl4.Ml.n(httpRequest);
            if (lN2 != null) {
                cn3T.az(lN2.longValue());
            }
            timer.Uo();
            cn3T.ty(timer.O());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            cn3T.r(timer.t());
            cn3T.gh(httpResponseExecute.getStatusLine().getStatusCode());
            Long lN3 = nl4.Ml.n(httpResponseExecute);
            if (lN3 != null) {
                cn3T.ck(lN3.longValue());
            }
            String strRl = nl4.Ml.rl(httpResponseExecute);
            if (strRl != null) {
                cn3T.HI(strRl);
            }
            cn3T.rl();
            return httpResponseExecute;
        } catch (IOException e2) {
            cn3T.r(timer.t());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    static HttpResponse Uo(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, C c2) throws IOException {
        CN3 cn3T = CN3.t(c2);
        try {
            cn3T.Z(httpUriRequest.getURI().toString()).mUb(httpUriRequest.getMethod());
            Long lN2 = nl4.Ml.n(httpUriRequest);
            if (lN2 != null) {
                cn3T.az(lN2.longValue());
            }
            timer.Uo();
            cn3T.ty(timer.O());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            cn3T.r(timer.t());
            cn3T.gh(httpResponseExecute.getStatusLine().getStatusCode());
            Long lN3 = nl4.Ml.n(httpResponseExecute);
            if (lN3 != null) {
                cn3T.ck(lN3.longValue());
            }
            String strRl = nl4.Ml.rl(httpResponseExecute);
            if (strRl != null) {
                cn3T.HI(strRl);
            }
            cn3T.rl();
            return httpResponseExecute;
        } catch (IOException e2) {
            cn3T.r(timer.t());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) t(httpClient, httpUriRequest, responseHandler, new Timer(), C.gh());
    }

    static Object n(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, Timer timer, C c2) throws IOException {
        CN3 cn3T = CN3.t(c2);
        try {
            cn3T.Z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mUb(httpRequest.getRequestLine().getMethod());
            Long lN2 = nl4.Ml.n(httpRequest);
            if (lN2 != null) {
                cn3T.az(lN2.longValue());
            }
            timer.Uo();
            cn3T.ty(timer.O());
            return httpClient.execute(httpHost, httpRequest, new nl4.w6(responseHandler, timer, cn3T));
        } catch (IOException e2) {
            cn3T.r(timer.t());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    static Object nr(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, C c2) throws IOException {
        CN3 cn3T = CN3.t(c2);
        try {
            cn3T.Z(httpUriRequest.getURI().toString()).mUb(httpUriRequest.getMethod());
            Long lN2 = nl4.Ml.n(httpUriRequest);
            if (lN2 != null) {
                cn3T.az(lN2.longValue());
            }
            timer.Uo();
            cn3T.ty(timer.O());
            return httpClient.execute(httpUriRequest, new nl4.w6(responseHandler, timer, cn3T), httpContext);
        } catch (IOException e2) {
            cn3T.r(timer.t());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    static Object rl(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, C c2) throws IOException {
        CN3 cn3T = CN3.t(c2);
        try {
            cn3T.Z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mUb(httpRequest.getRequestLine().getMethod());
            Long lN2 = nl4.Ml.n(httpRequest);
            if (lN2 != null) {
                cn3T.az(lN2.longValue());
            }
            timer.Uo();
            cn3T.ty(timer.O());
            return httpClient.execute(httpHost, httpRequest, new nl4.w6(responseHandler, timer, cn3T), httpContext);
        } catch (IOException e2) {
            cn3T.r(timer.t());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    static Object t(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, Timer timer, C c2) throws IOException {
        CN3 cn3T = CN3.t(c2);
        try {
            cn3T.Z(httpUriRequest.getURI().toString()).mUb(httpUriRequest.getMethod());
            Long lN2 = nl4.Ml.n(httpUriRequest);
            if (lN2 != null) {
                cn3T.az(lN2.longValue());
            }
            timer.Uo();
            cn3T.ty(timer.O());
            return httpClient.execute(httpUriRequest, new nl4.w6(responseHandler, timer, cn3T));
        } catch (IOException e2) {
            cn3T.r(timer.t());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) nr(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), C.gh());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return O(httpClient, httpHost, httpRequest, new Timer(), C.gh());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return J2(httpClient, httpHost, httpRequest, httpContext, new Timer(), C.gh());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) n(httpClient, httpHost, httpRequest, responseHandler, new Timer(), C.gh());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) rl(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), C.gh());
    }
}
