package com.safedk.android.internal;

import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.SDKDependancy;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@SDKDependancy(packageName = "okio")
public class SafeDKSource implements Source {
    private static final String TAG = "SafeDKSource";
    private int bodyId;
    private final Source delegate;

    public static BufferedSource create(BufferedSource delegate, int bodyId) {
        return Okio.buffer(new SafeDKSource(delegate, bodyId));
    }

    private SafeDKSource(BufferedSource delegate, int bodyId) {
        this.delegate = delegate;
        this.bodyId = bodyId;
    }

    @Override // okio.Source
    public long read(Buffer sink, long byteCount) throws IOException {
        try {
            long jForwardingSource_read = ForwardingSource_read(sink, byteCount);
            Logger.d(TAG, "retrofit read - body id= ", Integer.valueOf(this.bodyId), ",  max bytes= ", Long.valueOf(byteCount), " actual count= ", Long.valueOf(jForwardingSource_read));
            if (jForwardingSource_read > 0) {
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.f63089d.get(Integer.valueOf(this.bodyId));
                if (requestInfo != null) {
                    long size = sink.size();
                    long j2 = size - jForwardingSource_read;
                    byte[] byteArray = sink.snapshot().substring((int) j2, (int) size).toByteArray();
                    Logger.d(TAG, "retrofit read - updating buffer body id= ", Integer.valueOf(this.bodyId), ",  total length= ", Long.valueOf(size), ",    offset= ", Long.valueOf(j2), ", chunk read length= ", Integer.valueOf(byteArray.length));
                    requestInfo.a(byteArray, byteArray.length);
                } else {
                    Logger.v(TAG, "retrofit read cant find bodyId ", Integer.valueOf(this.bodyId));
                }
            }
            return jForwardingSource_read;
        } catch (IOException e2) {
            Logger.e(TAG, "retrofit SafeDKSource :", e2.getMessage());
            throw e2;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ForwardingSource_close();
        NetworkBridge.RequestInfo requestInfoRemove = NetworkBridge.f63089d.remove(Integer.valueOf(this.bodyId));
        Logger.v(TAG, "retrofit closing. close reqInfo = ", requestInfoRemove);
        if (requestInfoRemove != null && requestInfoRemove.d()) {
            Logger.v(TAG, "retrofit closing. package: ", requestInfoRemove.a(), ", url: ", requestInfoRemove.b());
            CreativeInfoManager.a(requestInfoRemove.a(), requestInfoRemove.b(), requestInfoRemove.c(), (Map<String, List<String>>) null);
        }
    }

    public final Source delegate() {
        return this.delegate;
    }

    public long ForwardingSource_read(Buffer sink, long byteCount) throws IOException {
        return this.delegate.read(sink, byteCount);
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return this.delegate.getTimeout();
    }

    public void ForwardingSource_close() throws IOException {
        this.delegate.close();
    }
}
