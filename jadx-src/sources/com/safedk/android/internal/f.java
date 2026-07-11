package com.safedk.android.internal;

import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class f extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63031a = "SafeDKInputStream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f63032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f63033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f63034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InputStream f63035e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, List<String>> f63040j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private HttpURLConnection f63042l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f63037g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f63038h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f63039i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteArrayOutputStream f63041k = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f63036f = System.currentTimeMillis();

    public f(String str, String str2, InputStream inputStream, Map<String, List<String>> map, boolean z2) {
        this.f63033c = str;
        this.f63034d = str2;
        this.f63035e = inputStream;
        this.f63040j = map;
        this.f63032b = z2;
    }

    public void a(HttpURLConnection httpURLConnection) {
        this.f63042l = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.f63035e;
        if (inputStream == null) {
            return 0;
        }
        int i2 = inputStream.read();
        if (i2 >= 0) {
            try {
                this.f63041k.write(i2);
            } catch (Throwable th) {
                try {
                    Logger.e(f63031a, th.getMessage());
                } catch (Throwable th2) {
                }
            }
        }
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] b2) throws IOException {
        InputStream inputStream = this.f63035e;
        if (inputStream == null) {
            return 0;
        }
        int i2 = inputStream.read(b2);
        a(b2, 0, i2);
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] b2, int off, int len) throws IOException {
        InputStream inputStream = this.f63035e;
        if (inputStream != null) {
            int i2 = inputStream.read(b2, off, len);
            a(b2, off, i2);
            return i2;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f63035e;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public long skip(long n2) throws IOException {
        InputStream inputStream = this.f63035e;
        if (inputStream != null) {
            return inputStream.skip(n2);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f63035e != null) {
            this.f63035e.reset();
        }
    }

    private int a(ByteArrayOutputStream byteArrayOutputStream) {
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.size();
        }
        return 0;
    }

    private void b() {
        int i2;
        do {
            try {
                i2 = this.f63035e.read();
                if (i2 > 0) {
                    this.f63041k.write(i2);
                }
            } catch (Exception e2) {
                Logger.d(f63031a, "read all before close - exception= ", e2);
                return;
            }
        } while (i2 > 0);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (this.f63035e != null) {
                b();
                int iA = a(this.f63041k);
                int iC = c(this.f63040j);
                if (iC == iA || this.f63038h) {
                    Logger.d(f63031a, "closing the stream, ", this, ", with amount read: ", Integer.valueOf(iA));
                    this.f63035e.close();
                } else if (iC > -1) {
                    Logger.d(f63031a, "Attempt to close the stream, ", this, ", before reading all of it has been made! amount read: ", Integer.valueOf(iA), ", content size: ", Integer.valueOf(iC), " sdk: ", this.f63033c);
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.f63035e;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    public void a() {
        if (!this.f63037g) {
            a("cd");
        }
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (i3 > 0) {
            try {
                if (this.f63041k != null) {
                    this.f63041k.write(bArr, i2, i3);
                }
            } catch (Throwable th) {
                try {
                    Logger.e(f63031a, th.getMessage(), th);
                    return;
                } catch (Throwable th2) {
                    return;
                }
            }
        }
        if (b(this.f63040j) && i3 == -1) {
            a("sr-lc");
        }
        if (this.f63032b && this.f63041k != null) {
            int iC = c(this.f63040j);
            int size = this.f63041k.size();
            if (iC > -1) {
                if (iC == size) {
                    a("sr-cs");
                }
            } else if (a(this.f63040j) && i3 < this.f63039i) {
                a("sr-rb");
            }
            this.f63039i = i3;
        }
    }

    public void a(String str) {
        boolean zB;
        boolean zB2;
        String string;
        try {
            if ((!b(this.f63040j) && this.f63041k != null && this.f63041k.size() == 0) || this.f63037g) {
                return;
            }
            this.f63037g = true;
            com.safedk.android.analytics.brandsafety.creatives.b bVarK = CreativeInfoManager.k(this.f63033c);
            if (bVarK == null) {
                zB = false;
                zB2 = false;
            } else {
                zB2 = bVarK.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT);
                zB = bVarK.b(AdNetworkConfiguration.SHOULD_ADD_BYTE_ARRAY_AS_PARAM_ON_AD_FETCHED);
            }
            if (zB2 && a(this.f63040j)) {
                String strA = com.safedk.android.utils.c.a(this.f63041k.toByteArray());
                if (strA == null) {
                    this.f63037g = false;
                    return;
                }
                string = strA;
            } else {
                string = this.f63041k.toString();
            }
            boolean z2 = string == null || string.length() == 0;
            if (!this.f63033c.equals(com.safedk.android.utils.h.f63176p) || !z2) {
                String str2 = this.f63036f + ";" + str + ";" + (System.currentTimeMillis() - this.f63036f);
                if (zB) {
                    CreativeInfoManager.a(this.f63033c, this.f63034d, string, this.f63041k.toByteArray(), this.f63040j, str2);
                } else {
                    CreativeInfoManager.a(this.f63033c, this.f63034d, string, null, this.f63040j, str2);
                }
                this.f63038h = true;
            }
            this.f63041k = null;
            this.f63040j = null;
            if (this.f63042l != null) {
                NetworkBridge.disposeOfConnectionToStreamMapping(this.f63042l);
            }
        } catch (Throwable th) {
            try {
                Logger.e(f63031a, th.getMessage());
            } catch (Throwable th2) {
            }
        }
    }

    private static boolean a(Map<String, List<String>> map) {
        List<String> list;
        return (map == null || (list = map.get("Content-Encoding")) == null || !list.contains("gzip")) ? false : true;
    }

    private static boolean b(Map<String, List<String>> map) {
        List<String> list;
        return (map == null || (list = map.get("Transfer-Encoding")) == null || !list.contains("chunked")) ? false : true;
    }

    private static int c(Map<String, List<String>> map) {
        List<String> list;
        if (map != null && (list = map.get("Content-Length")) != null) {
            return Integer.parseInt(list.get(0));
        }
        return -1;
    }
}
