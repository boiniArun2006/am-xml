package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class p1 extends i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f54298a = new OkHttpClient().newBuilder().build();

    @Override // com.fyber.inneractive.sdk.network.h
    public final l a(t0 t0Var, String str, String str2) throws Exception {
        IAlog.a("%s okhttp network stack is in use", "OkHttpExecutorImpl");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(t0Var.r());
            Pair pairA = a(t0Var.r(), t0Var, arrayList, str, str2);
            Object obj = pairA.second;
            String strMessage = obj != null ? ((Response) obj).message() : "";
            FilterInputStream filterInputStreamA = a((Response) pairA.second);
            Object obj2 = pairA.second;
            int iCode = obj2 == null ? -1 : ((Response) obj2).code();
            HashMap mapB = b((Response) pairA.second);
            Response response = (Response) pairA.second;
            o1 o1Var = new o1(i.a(filterInputStreamA, iCode, strMessage, mapB, response != null ? response.headers().get("Last-Modified") : null), (Response) pairA.second);
            Iterator it = ((List) pairA.first).iterator();
            while (it.hasNext()) {
                o1Var.f54275f.add((String) it.next());
            }
            return o1Var;
        } catch (b e2) {
            IAlog.b("%s cannot connect exception: %s", "OkHttpExecutorImpl", e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            IAlog.b("%s exception: %s", "OkHttpExecutorImpl", e3.getMessage());
            throw e3;
        }
    }

    public static HashMap b(Response response) {
        HashMap map = new HashMap();
        if (response != null) {
            Headers headers = response.headers();
            for (int i2 = 0; i2 < headers.size(); i2++) {
                String strName = headers.name(i2);
                map.put(strName, Collections.singletonList(headers.get(strName)));
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb A[Catch: all -> 0x0161, Exception -> 0x0164, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0164, all -> 0x0161, blocks: (B:16:0x00a4, B:18:0x00b0, B:37:0x00e0, B:39:0x00ea, B:51:0x012e, B:29:0x00cb), top: B:78:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0 A[Catch: all -> 0x0161, Exception -> 0x0164, TRY_ENTER, TryCatch #5 {Exception -> 0x0164, all -> 0x0161, blocks: (B:16:0x00a4, B:18:0x00b0, B:37:0x00e0, B:39:0x00ea, B:51:0x012e, B:29:0x00cb), top: B:78:0x00a4 }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.fyber.inneractive.sdk.network.t0] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(String str, t0 t0Var, ArrayList arrayList, String str2, String str3) throws Exception {
        Throwable th;
        Exception exc;
        ?? r42;
        l1 l1VarP = t0Var.p();
        Request.Builder builder = new Request.Builder();
        ?? it = "gzip";
        a(builder, "Accept-Encoding", "gzip");
        a(builder, "User-Agent", str2);
        a(builder, "If-Modified-Since", str3);
        Map mapL = t0Var.l();
        if (mapL != null) {
            it = mapL.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                a(builder, str4, (String) mapL.get(str4));
            }
        }
        builder.url(str);
        if (t0Var.m() == m0.POST || t0Var.m() == m0.PUT) {
            byte[] bArrF = t0Var.f();
            if (bArrF != null) {
                builder.post(RequestBody.create(bArrF, MediaType.parse(t0Var.n())));
            } else {
                throw new Exception("Could not create ok http request. post payload is null");
            }
        }
        Request requestBuild = builder.build();
        boolean z2 = !(t0Var instanceof h1);
        OkHttpClient.Builder builderFollowSslRedirects = this.f54298a.newBuilder().followRedirects(z2).followSslRedirects(z2);
        long j2 = l1VarP.f54283a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient okHttpClientBuild = builderFollowSslRedirects.connectTimeout(j2, timeUnit).readTimeout(l1VarP.f54284b, timeUnit).build();
        t0Var.c(System.currentTimeMillis());
        IAlog.a("OkHttpExecutorImpl: start connection timestamp: %s", t0Var.f54321g);
        try {
            try {
                Response responseOkhttp3CallExecute = DTExchangeNetworkBridge.okhttp3CallExecute(okHttpClientBuild.newCall(requestBuild));
                try {
                    if (t0Var instanceof h1) {
                        if (responseOkhttp3CallExecute.code() > 300) {
                            try {
                                if (responseOkhttp3CallExecute.code() >= 304) {
                                    if (responseOkhttp3CallExecute.code() == 307 || responseOkhttp3CallExecute.code() == 308) {
                                        String strHeader = responseOkhttp3CallExecute.header("Location", "");
                                        if (strHeader != null) {
                                            if (!strHeader.startsWith(com.safedk.android.analytics.brandsafety.creatives.g.f62375e) && !strHeader.contains("://") && arrayList.size() > 0) {
                                                Uri uri = Uri.parse((String) arrayList.get(arrayList.size() - 1));
                                                strHeader = String.format(strHeader.startsWith("/") ? "%s://%s%s" : "%s://%s/%s", uri.getScheme(), uri.getHost(), strHeader);
                                            }
                                            String str5 = strHeader;
                                            arrayList.add(str5);
                                            if (arrayList.size() <= 5) {
                                                Pair pairA = a(str5, t0Var, arrayList, str2, str3);
                                                t0Var.a(System.currentTimeMillis());
                                                IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.f54321g);
                                                return pairA;
                                            }
                                            throw new b("Url chain too big for us");
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                throw new b(exc);
                            } catch (Throwable th2) {
                                th = th2;
                                r42 = t0Var;
                                r42.a(System.currentTimeMillis());
                                IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", r42.f54321g);
                                throw th;
                            }
                        }
                    }
                    Pair pair = new Pair(arrayList, responseOkhttp3CallExecute);
                    t0Var.a(System.currentTimeMillis());
                    IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.f54321g);
                    return pair;
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    throw new b(exc);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                r42 = it;
                r42.a(System.currentTimeMillis());
                IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", r42.f54321g);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th4) {
            th = th4;
            it = t0Var;
            th = th;
            r42 = it;
            r42.a(System.currentTimeMillis());
            IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", r42.f54321g);
            throw th;
        }
    }

    public static FilterInputStream a(Response response) {
        if (response == null) {
            return null;
        }
        try {
            if (DTExchangeNetworkBridge.okhttp3Response_body(response) == null) {
                return null;
            }
            return i.a(DTExchangeNetworkBridge.okhttp3Response_body(response).byteStream(), TextUtils.equals("gzip", response.headers().get("content-encoding")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Request.Builder builder, String str, String str2) {
        IAlog.d("%s %s : %s", "REQUEST_HEADER", str, str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.addHeader(str, str2);
    }
}
