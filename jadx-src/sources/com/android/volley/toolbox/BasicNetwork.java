package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Header;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class BasicNetwork implements Network {
    private static final int DEFAULT_POOL_SIZE = 4096;
    private final BaseHttpStack mBaseHttpStack;

    @Deprecated
    protected final HttpStack mHttpStack;
    protected final ByteArrayPool mPool;

    @Deprecated
    public BasicNetwork(HttpStack httpStack) {
        this(httpStack, new ByteArrayPool(4096));
    }

    @Deprecated
    public BasicNetwork(HttpStack httpStack, ByteArrayPool byteArrayPool) {
        this.mHttpStack = httpStack;
        this.mBaseHttpStack = new AdaptedHttpStack(httpStack);
        this.mPool = byteArrayPool;
    }

    @Deprecated
    protected static Map<String, String> convertHeaders(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i2 = 0; i2 < headerArr.length; i2++) {
            treeMap.put(headerArr[i2].getName(), headerArr[i2].getValue());
        }
        return treeMap;
    }

    @Override // com.android.volley.Network
    public NetworkResponse performRequest(Request<?> request) throws VolleyError {
        IOException iOException;
        HttpResponse httpResponse;
        byte[] bArr;
        Request<?> request2;
        byte[] bArrInputStreamToBytes;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                HttpResponse httpResponseExecuteRequest = this.mBaseHttpStack.executeRequest(request, HttpHeaderParser.getCacheHeaders(request.getCacheEntry()));
                try {
                    int statusCode = httpResponseExecuteRequest.getStatusCode();
                    List<Header> headers = httpResponseExecuteRequest.getHeaders();
                    if (statusCode == 304) {
                        return NetworkUtility.getNotModifiedNetworkResponse(request, SystemClock.elapsedRealtime() - jElapsedRealtime, headers);
                    }
                    InputStream content = httpResponseExecuteRequest.getContent();
                    if (content != null) {
                        bArrInputStreamToBytes = NetworkUtility.inputStreamToBytes(content, httpResponseExecuteRequest.getContentLength(), this.mPool);
                    } else {
                        bArrInputStreamToBytes = new byte[0];
                    }
                    byte[] bArr2 = bArrInputStreamToBytes;
                    try {
                        NetworkUtility.logSlowRequests(SystemClock.elapsedRealtime() - jElapsedRealtime, request, bArr2, statusCode);
                        if (statusCode >= 200 && statusCode <= 299) {
                            return new NetworkResponse(statusCode, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, headers);
                        }
                        throw new IOException();
                    } catch (IOException e2) {
                        e = e2;
                        request2 = request;
                        httpResponse = httpResponseExecuteRequest;
                        bArr = bArr2;
                        iOException = e;
                        NetworkUtility.attemptRetryOnException(request2, NetworkUtility.shouldRetryException(request2, iOException, jElapsedRealtime, httpResponse, bArr));
                        request = request2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    bArr = null;
                    httpResponse = httpResponseExecuteRequest;
                    request2 = request;
                }
            } catch (IOException e4) {
                iOException = e4;
                httpResponse = null;
                bArr = null;
                request2 = request;
            }
            NetworkUtility.attemptRetryOnException(request2, NetworkUtility.shouldRetryException(request2, iOException, jElapsedRealtime, httpResponse, bArr));
            request = request2;
        }
    }

    public BasicNetwork(BaseHttpStack baseHttpStack) {
        this(baseHttpStack, new ByteArrayPool(4096));
    }

    public BasicNetwork(BaseHttpStack baseHttpStack, ByteArrayPool byteArrayPool) {
        this.mBaseHttpStack = baseHttpStack;
        this.mHttpStack = baseHttpStack;
        this.mPool = byteArrayPool;
    }
}
