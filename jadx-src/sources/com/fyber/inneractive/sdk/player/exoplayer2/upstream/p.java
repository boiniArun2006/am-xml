package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class p implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f56133o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicReference f56134p = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f56139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f56140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f56141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpURLConnection f56142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InputStream f56143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f56144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f56145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f56146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f56147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f56148n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f56142h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection b(k kVar) throws IOException {
        URL url = new URL(kVar.f56108a.toString());
        long j2 = kVar.f56110c;
        long j3 = kVar.f56111d;
        int i2 = 0;
        boolean z2 = (kVar.f56113f & 1) == 1;
        if (!this.f56135a) {
            return a(url, null, j2, j3, z2, true);
        }
        while (true) {
            int i3 = i2 + 1;
            if (i2 > 20) {
                throw new NoRouteToHostException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Too many redirects: ", i3));
            }
            boolean z3 = z2;
            long j4 = j3;
            long j5 = j2;
            HttpURLConnection httpURLConnectionA = a(url, null, j5, j4, z3, false);
            j2 = j5;
            j3 = j4;
            z2 = z3;
            int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionA);
            if (iHttpUrlConnectionGetResponseCode != 300 && iHttpUrlConnectionGetResponseCode != 301 && iHttpUrlConnectionGetResponseCode != 302 && iHttpUrlConnectionGetResponseCode != 303 && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
                return httpURLConnectionA;
            }
            String headerField = httpURLConnectionA.getHeaderField("Location");
            DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
            if (headerField == null) {
                throw new ProtocolException("Null location redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !com.safedk.android.analytics.brandsafety.creatives.g.f62375e.equals(protocol)) {
                throw new ProtocolException("Unsupported protocol redirect: " + protocol);
            }
            i2 = i3;
            url = url2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        try {
            if (this.f56143i != null) {
                HttpURLConnection httpURLConnection = this.f56142h;
                long j2 = this.f56146l;
                if (j2 != -1) {
                    j2 -= this.f56148n;
                }
                a(httpURLConnection, j2);
                try {
                    this.f56143i.close();
                } catch (IOException e2) {
                    throw new u(e2);
                }
            }
        } finally {
            this.f56143i = null;
            b();
            if (this.f56144j) {
                this.f56144j = false;
                m mVar = this.f56141g;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(k kVar) throws u {
        long j2;
        long jMax;
        String headerField;
        this.f56148n = 0L;
        this.f56147m = 0L;
        try {
            HttpURLConnection httpURLConnectionB = b(kVar);
            this.f56142h = httpURLConnectionB;
            try {
                int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionB);
                if (iHttpUrlConnectionGetResponseCode < 200 || iHttpUrlConnectionGetResponseCode > 299) {
                    this.f56142h.getHeaderFields();
                    b();
                    v vVar = new v(iHttpUrlConnectionGetResponseCode);
                    if (iHttpUrlConnectionGetResponseCode != 416) {
                        throw vVar;
                    }
                    vVar.initCause(new i());
                    throw vVar;
                }
                this.f56142h.getContentType();
                if (iHttpUrlConnectionGetResponseCode == 200) {
                    j2 = kVar.f56110c;
                    if (j2 == 0) {
                        j2 = 0;
                    }
                }
                this.f56145k = j2;
                if ((kVar.f56113f & 1) == 1) {
                    this.f56146l = kVar.f56111d;
                } else {
                    long j3 = kVar.f56111d;
                    if (j3 != -1) {
                        this.f56146l = j3;
                    } else {
                        HttpURLConnection httpURLConnection = this.f56142h;
                        String headerField2 = httpURLConnection.getHeaderField("Content-Length");
                        if (TextUtils.isEmpty(headerField2)) {
                            jMax = -1;
                            headerField = httpURLConnection.getHeaderField("Content-Range");
                            if (!TextUtils.isEmpty(headerField)) {
                            }
                            this.f56146l = jMax != -1 ? jMax - this.f56145k : -1L;
                        } else {
                            try {
                                jMax = Long.parseLong(headerField2);
                            } catch (NumberFormatException unused) {
                                Log.e("DefaultHttpDataSource", jhotmBbwMbr.rBAFjMjqd + headerField2 + "]");
                                jMax = -1;
                            }
                            headerField = httpURLConnection.getHeaderField("Content-Range");
                            if (!TextUtils.isEmpty(headerField)) {
                                Matcher matcher = f56133o.matcher(headerField);
                                if (matcher.find()) {
                                    try {
                                        long j4 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                        if (jMax < 0) {
                                            jMax = j4;
                                        } else if (jMax != j4) {
                                            Log.w("DefaultHttpDataSource", "Inconsistent headers [" + headerField2 + "] [" + headerField + "]");
                                            jMax = Math.max(jMax, j4);
                                        }
                                    } catch (NumberFormatException unused2) {
                                        Log.e("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField + "]");
                                    }
                                }
                            }
                            this.f56146l = jMax != -1 ? jMax - this.f56145k : -1L;
                        }
                    }
                }
                try {
                    this.f56143i = DTExchangeNetworkBridge.urlConnectionGetInputStream(this.f56142h);
                    this.f56144j = true;
                    m mVar = this.f56141g;
                    if (mVar != null) {
                        synchronized (mVar) {
                            try {
                                if (mVar.f56120b == 0) {
                                    mVar.f56121c = SystemClock.elapsedRealtime();
                                }
                                mVar.f56120b++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return this.f56146l;
                } catch (IOException e2) {
                    b();
                    throw new u(e2);
                }
            } catch (IOException e3) {
                b();
                throw new u("Unable to connect to " + kVar.f56108a.toString(), e3);
            }
        } catch (IOException e4) {
            throw new u("Unable to connect to " + kVar.f56108a.toString(), e4);
        }
    }

    public final void c() throws IOException {
        if (this.f56147m == this.f56145k) {
            return;
        }
        byte[] bArr = (byte[]) f56134p.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j2 = this.f56147m;
            long j3 = this.f56145k;
            if (j2 == j3) {
                f56134p.set(bArr);
                return;
            }
            int i2 = this.f56143i.read(bArr, 0, (int) Math.min(j3 - j2, bArr.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (i2 == -1) {
                throw new EOFException();
            }
            long j4 = i2;
            this.f56147m += j4;
            m mVar = this.f56141g;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f56122d += j4;
                }
            }
        }
    }

    public p(String str, m mVar, int i2, int i3, boolean z2, w wVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f56138d = str;
            this.f56141g = mVar;
            this.f56140f = new w();
            this.f56136b = i2;
            this.f56137c = i3;
            this.f56135a = z2;
            this.f56139e = wVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i2, int i3) throws u {
        try {
            c();
            return a(bArr, i2, i3);
        } catch (IOException e2) {
            throw new u(e2);
        }
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.f56142h;
        if (httpURLConnection != null) {
            try {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f56142h = null;
        }
    }

    public final HttpURLConnection a(URL url, byte[] bArr, long j2, long j3, boolean z2, boolean z3) throws IOException {
        Map map;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f56136b);
        httpURLConnection.setReadTimeout(this.f56137c);
        w wVar = this.f56139e;
        if (wVar != null) {
            synchronized (wVar) {
                try {
                    if (wVar.f56162b == null) {
                        wVar.f56162b = Collections.unmodifiableMap(new HashMap(wVar.f56161a));
                    }
                    map = wVar.f56162b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : this.f56140f.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (j2 != 0 || j3 != -1) {
            String str = "bytes=" + j2 + "-";
            if (j3 != -1) {
                str = str + ((j2 + j3) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f56138d);
        if (!z2) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
                return httpURLConnection;
            }
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStreamUrlConnectionGetOutputStream = DTExchangeNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
            outputStreamUrlConnectionGetOutputStream.write(bArr);
            outputStreamUrlConnectionGetOutputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final int a(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f56146l;
        if (j2 != -1) {
            long j3 = j2 - this.f56148n;
            if (j3 == 0) {
                return -1;
            }
            i3 = (int) Math.min(i3, j3);
        }
        int i5 = this.f56143i.read(bArr, i2, i3);
        if (i5 == -1) {
            if (this.f56146l == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j4 = i5;
        this.f56148n += j4;
        m mVar = this.f56141g;
        if (mVar == null) {
            return i5;
        }
        synchronized (mVar) {
            mVar.f56122d += j4;
        }
        return i5;
    }

    public static void a(HttpURLConnection httpURLConnection, long j2) {
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f56234a;
        if (i2 == 19 || i2 == 20) {
            try {
                InputStream inputStreamUrlConnectionGetInputStream = DTExchangeNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                if (j2 == -1) {
                    if (inputStreamUrlConnectionGetInputStream.read() == -1) {
                        return;
                    }
                } else if (j2 <= 2048) {
                    return;
                }
                String name = inputStreamUrlConnectionGetInputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStreamUrlConnectionGetInputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStreamUrlConnectionGetInputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
