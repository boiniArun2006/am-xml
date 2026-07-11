package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class k extends i implements h {
    @Override // com.fyber.inneractive.sdk.network.h
    public final l a(t0 t0Var, String str, String str2) throws b, q1, t1 {
        l lVarA;
        IAlog.a("%s hurl network stack is in use", "HttpExecutorImpl");
        String strR = t0Var.r();
        URL url = new URL(strR);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strR);
        Pair pairA = a(t0Var, arrayList, url, str, str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) pairA.second;
        List list = (List) pairA.first;
        if (httpURLConnection == null) {
            try {
                if (list.size() <= 0) {
                    throw new q1();
                }
            } catch (SocketTimeoutException e2) {
                throw new t1(e2);
            } catch (IOException e3) {
                IAlog.a("failed reading network response for url: %s msg: %s", httpURLConnection.getURL(), e3.getMessage());
                throw new q1(e3);
            }
        }
        FilterInputStream filterInputStreamA = null;
        if (httpURLConnection == null) {
            lVarA = i.a(null, 200, "", null, null);
        } else {
            try {
                filterInputStreamA = i.a(DTExchangeNetworkBridge.urlConnectionGetInputStream(httpURLConnection), TextUtils.equals("gzip", httpURLConnection.getContentEncoding()));
            } catch (Exception unused) {
            }
            lVarA = i.a(filterInputStreamA, DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField("Last-Modified"));
        }
        j jVar = new j(httpURLConnection, lVarA.f54270a, (FilterInputStream) lVarA.f54272c, lVarA.f54273d, lVarA.f54274e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.f54275f.add((String) it.next());
        }
        return jVar;
    }

    public static Pair a(t0 t0Var, ArrayList arrayList, URL url, String str, String str2) throws b {
        String headerField;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            t0Var.getClass();
            if (t0Var instanceof h1) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            l1 l1VarP = t0Var.p();
            httpURLConnection.setConnectTimeout(l1VarP.f54283a);
            httpURLConnection.setReadTimeout(l1VarP.f54284b);
            a(httpURLConnection, "User-Agent", str);
            a(httpURLConnection, "If-Modified-Since", str2);
            a(httpURLConnection, "Accept-Encoding", "gzip");
            com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.f53260M.f53294t;
            if (sVar != null && sVar.f53466b.a("add_accept", 1, 0) == 1) {
                a(httpURLConnection, com.safedk.android.utils.n.f63222c, "*/*");
            }
            Map mapL = t0Var.l();
            if (mapL != null) {
                for (String str3 : mapL.keySet()) {
                    a(httpURLConnection, str3, (String) mapL.get(str3));
                }
            }
            t0Var.c(System.currentTimeMillis());
            if (t0Var.m() != m0.POST && t0Var.m() != m0.PUT) {
                httpURLConnection.connect();
            } else {
                a(httpURLConnection, t0Var);
            }
            int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            t0Var.a(System.currentTimeMillis());
            IAlog.a("%s (%s) response code - %d", t0Var.toString(), url, Integer.valueOf(iHttpUrlConnectionGetResponseCode));
            if ((t0Var instanceof h1) && (((iHttpUrlConnectionGetResponseCode > 300 && iHttpUrlConnectionGetResponseCode < 304) || iHttpUrlConnectionGetResponseCode == 307 || iHttpUrlConnectionGetResponseCode == 308) && (headerField = httpURLConnection.getHeaderField("Location")) != null)) {
                if (!headerField.startsWith(com.safedk.android.analytics.brandsafety.creatives.g.f62375e) && !headerField.contains("://") && arrayList.size() > 0) {
                    Uri uri = Uri.parse((String) arrayList.get(arrayList.size() - 1));
                    headerField = String.format(headerField.startsWith("/") ? "%s://%s%s" : "%s://%s/%s", uri.getScheme(), uri.getHost(), headerField);
                }
                arrayList.add(headerField);
                if (arrayList.size() <= 20) {
                    if (headerField.startsWith(com.safedk.android.analytics.brandsafety.creatives.g.f62375e)) {
                        return a(t0Var, arrayList, new URL(headerField), str, str2);
                    }
                    return Pair.create(arrayList, null);
                }
                throw new b("Url chain too big for us");
            }
            return new Pair(arrayList, httpURLConnection);
        } catch (Exception e2) {
            t0Var.a(System.currentTimeMillis());
            IAlog.a("failed executing network request for url: %s msg: %s", t0Var.r(), e2.getMessage());
            throw new b(e2);
        }
    }

    public static void a(HttpURLConnection httpURLConnection, t0 t0Var) throws IOException {
        httpURLConnection.setRequestMethod(t0Var.m().key);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        byte[] bArrF = t0Var.f();
        httpURLConnection.setRequestProperty("Content-Length", "" + (bArrF != null ? bArrF.length : 0));
        httpURLConnection.setRequestProperty("Content-Type", t0Var.n());
        httpURLConnection.connect();
        OutputStream outputStreamUrlConnectionGetOutputStream = DTExchangeNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
        outputStreamUrlConnectionGetOutputStream.write(bArrF);
        try {
            outputStreamUrlConnectionGetOutputStream.close();
        } catch (Throwable unused) {
        }
    }

    public static void a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        IAlog.d("%s %s : %s", "REQUEST_HEADER", str, str2);
        httpURLConnection.addRequestProperty(str, str2);
    }
}
