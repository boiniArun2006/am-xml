package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f57072b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f57073c = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f57074a = new z0();

    public static c1 a(HttpURLConnection httpURLConnection, ByteBuffer byteBuffer) throws IOException {
        InputStream inputStreamUrlConnectionGetInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        String strTrim;
        String strTrim2;
        httpURLConnection.connect();
        for (int i2 = 0; i2 < 20; i2++) {
            int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (iHttpUrlConnectionGetResponseCode < 300 || iHttpUrlConnectionGetResponseCode >= 400) {
                try {
                    inputStreamUrlConnectionGetInputStream = DTExchangeNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                } catch (Throwable unused) {
                    inputStreamUrlConnectionGetInputStream = null;
                }
                try {
                    byte[] bArrArray = byteBuffer.array();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int i3 = inputStreamUrlConnectionGetInputStream.read(bArrArray);
                            if (i3 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArrArray, 0, i3);
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable unused3) {
                    byteArrayOutputStream = null;
                }
                com.fyber.inneractive.sdk.util.v.b((Closeable) inputStreamUrlConnectionGetInputStream);
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                String contentType = httpURLConnection.getContentType();
                if (TextUtils.isEmpty(contentType)) {
                    strTrim = "";
                    strTrim2 = strTrim;
                } else {
                    String[] strArrSplit = contentType.split(";");
                    strTrim = strArrSplit.length > 0 ? strArrSplit[0].trim() : "";
                    strTrim2 = strArrSplit.length > 1 ? strArrSplit[1].trim() : "";
                }
                HashMap map = new HashMap();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (headerFields != null) {
                    for (String str : headerFields.keySet()) {
                        List<String> list = headerFields.get(str);
                        if (list != null && list.size() > 0) {
                            map.put(str, list.get(0));
                        }
                    }
                }
                String responseMessage = httpURLConnection.getResponseMessage();
                if (TextUtils.isEmpty(responseMessage)) {
                    return null;
                }
                return new c1(byteArrayOutputStream == null ? f57072b : byteArrayOutputStream.toByteArray(), map, strTrim, strTrim2, iHttpUrlConnectionGetResponseCode, responseMessage);
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                return null;
            }
            DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(headerField).openConnection()));
            httpURLConnection.connect();
        }
        return null;
    }

    public static void a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() == null || webResourceRequest.getRequestHeaders().size() <= 0) {
            return;
        }
        for (String str : webResourceRequest.getRequestHeaders().keySet()) {
            if (str != null && webResourceRequest.getRequestHeaders().get(str) != null) {
                httpURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
        }
    }
}
