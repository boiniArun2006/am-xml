package com.applovin.impl;

import android.os.Process;
import android.os.SystemClock;
import androidx.core.util.Consumer;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f48098a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1802k f48099b;

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BlockingQueue f48100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1802k f48101b;

        private void a() {
            b((c) this.f48100a.take());
        }

        private b(BlockingQueue blockingQueue, int i2, C1802k c1802k) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (c1802k == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f48100a = blockingQueue;
            this.f48101b = c1802k;
            setPriority(((Integer) c1802k.a(x4.f50790S)).intValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f3 A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #14 {all -> 0x00ff, blocks: (B:56:0x00db, B:58:0x00f3, B:83:0x013a), top: B:114:0x00db }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void b(final c cVar) {
            int i2;
            HttpURLConnection httpURLConnection;
            byte[] bArrA;
            Throwable th;
            long j2;
            byte[] bArr;
            Throwable th2;
            byte[] bArr2;
            HttpURLConnection httpURLConnectionA;
            long jElapsedRealtime;
            byte[] bArr3;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            int iHttpUrlConnectionGetResponseCode = 0;
            try {
                httpURLConnectionA = a(cVar);
                try {
                    if (cVar.f48106d != null && cVar.f48106d.length > 0) {
                        httpURLConnectionA.setDoOutput(true);
                        httpURLConnectionA.setFixedLengthStreamingMode(cVar.f48106d.length);
                        try {
                            OutputStream outputStreamUrlConnectionGetOutputStream = AppLovinNetworkBridge.urlConnectionGetOutputStream(httpURLConnectionA);
                            try {
                                outputStreamUrlConnectionGetOutputStream.write(cVar.f48106d);
                                outputStreamUrlConnectionGetOutputStream.close();
                            } finally {
                            }
                        } catch (Throwable th3) {
                            HashMap map = new HashMap();
                            CollectionUtils.putStringIfValid("details", "outputStream", map);
                            CollectionUtils.putStringIfValid("url", cVar.f48103a, map);
                            CollectionUtils.putStringIfValid("code", Integer.toString(0), map);
                            this.f48101b.D().a("NetworkCommunicationThread", "processRequest", th3, map);
                            throw th3;
                        }
                    }
                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    iHttpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionA);
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (iHttpUrlConnectionGetResponseCode > 0) {
                        try {
                            InputStream inputStreamUrlConnectionGetInputStream = AppLovinNetworkBridge.urlConnectionGetInputStream(httpURLConnectionA);
                            try {
                                bArrA = r0.a(inputStreamUrlConnectionGetInputStream, this.f48101b);
                                if (inputStreamUrlConnectionGetInputStream != null) {
                                    try {
                                        inputStreamUrlConnectionGetInputStream.close();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            HashMap map2 = new HashMap();
                                            CollectionUtils.putStringIfValid("details", "responseDataInputStream", map2);
                                            CollectionUtils.putStringIfValid("url", cVar.f48103a, map2);
                                            CollectionUtils.putStringIfValid("code", Integer.toString(iHttpUrlConnectionGetResponseCode), map2);
                                            this.f48101b.D().a("NetworkCommunicationThread", "processRequest", th, map2);
                                            throw th;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            httpURLConnection = httpURLConnectionA;
                                            i2 = iHttpUrlConnectionGetResponseCode;
                                            long j3 = jElapsedRealtime2;
                                            th = th;
                                            try {
                                                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                                                this.f48101b.O().a("NetworkCommunicationThread", th);
                                                this.f48101b.O();
                                                if (C1804o.a()) {
                                                    this.f48101b.O().d("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                                }
                                                if (httpURLConnection == null) {
                                                    try {
                                                        InputStream errorStream = httpURLConnection.getErrorStream();
                                                        try {
                                                            byte[] bArrA2 = r0.a(errorStream, this.f48101b);
                                                            if (errorStream != null) {
                                                                try {
                                                                    errorStream.close();
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    j2 = j3;
                                                                    bArr = bArrA2;
                                                                    this.f48101b.O().a("NetworkCommunicationThread", th);
                                                                    HashMap map3 = new HashMap();
                                                                    CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", map3);
                                                                    CollectionUtils.putStringIfValid("url", cVar.f48103a, map3);
                                                                    CollectionUtils.putStringIfValid("code", Integer.toString(i2), map3);
                                                                    this.f48101b.D().a("NetworkCommunicationThread", "processRequest", th, map3);
                                                                    th2 = th;
                                                                    bArr2 = bArr;
                                                                    iHttpUrlConnectionGetResponseCode = i2;
                                                                    httpURLConnectionA = httpURLConnection;
                                                                    jElapsedRealtime = jElapsedRealtime3;
                                                                    bArr3 = bArrA;
                                                                    jElapsedRealtime2 = j2;
                                                                }
                                                            }
                                                            th2 = th;
                                                            jElapsedRealtime2 = j3;
                                                            iHttpUrlConnectionGetResponseCode = i2;
                                                            httpURLConnectionA = httpURLConnection;
                                                            jElapsedRealtime = jElapsedRealtime3;
                                                            bArr3 = bArrA;
                                                            bArr2 = bArrA2;
                                                        } catch (Throwable th7) {
                                                            j2 = j3;
                                                            if (errorStream == null) {
                                                                throw th7;
                                                            }
                                                            try {
                                                                try {
                                                                    errorStream.close();
                                                                    throw th7;
                                                                } catch (Throwable th8) {
                                                                    th7.addSuppressed(th8);
                                                                    throw th7;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                bArr = null;
                                                                this.f48101b.O().a("NetworkCommunicationThread", th);
                                                                HashMap map32 = new HashMap();
                                                                CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", map32);
                                                                CollectionUtils.putStringIfValid("url", cVar.f48103a, map32);
                                                                CollectionUtils.putStringIfValid("code", Integer.toString(i2), map32);
                                                                this.f48101b.D().a("NetworkCommunicationThread", "processRequest", th, map32);
                                                                th2 = th;
                                                                bArr2 = bArr;
                                                                iHttpUrlConnectionGetResponseCode = i2;
                                                                httpURLConnectionA = httpURLConnection;
                                                                jElapsedRealtime = jElapsedRealtime3;
                                                                bArr3 = bArrA;
                                                                jElapsedRealtime2 = j2;
                                                                n7.a(httpURLConnectionA, this.f48101b);
                                                                final d dVarA = d.a().a(iHttpUrlConnectionGetResponseCode).a(bArr3).b(bArr2).a(jElapsedRealtime - jElapsedRealtime2).a(th2).a();
                                                                cVar.f48109g.execute(new Runnable() { // from class: com.applovin.impl.SPz
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        b4.b.a(cVar, dVarA);
                                                                    }
                                                                });
                                                            }
                                                            th = th9;
                                                            bArr = null;
                                                            this.f48101b.O().a("NetworkCommunicationThread", th);
                                                            HashMap map322 = new HashMap();
                                                            CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", map322);
                                                            CollectionUtils.putStringIfValid("url", cVar.f48103a, map322);
                                                            CollectionUtils.putStringIfValid("code", Integer.toString(i2), map322);
                                                            this.f48101b.D().a("NetworkCommunicationThread", "processRequest", th, map322);
                                                            th2 = th;
                                                            bArr2 = bArr;
                                                            iHttpUrlConnectionGetResponseCode = i2;
                                                            httpURLConnectionA = httpURLConnection;
                                                            jElapsedRealtime = jElapsedRealtime3;
                                                            bArr3 = bArrA;
                                                            jElapsedRealtime2 = j2;
                                                            n7.a(httpURLConnectionA, this.f48101b);
                                                            final d dVarA2 = d.a().a(iHttpUrlConnectionGetResponseCode).a(bArr3).b(bArr2).a(jElapsedRealtime - jElapsedRealtime2).a(th2).a();
                                                            cVar.f48109g.execute(new Runnable() { // from class: com.applovin.impl.SPz
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    b4.b.a(cVar, dVarA2);
                                                                }
                                                            });
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        j2 = j3;
                                                    }
                                                } else {
                                                    th2 = th;
                                                    iHttpUrlConnectionGetResponseCode = i2;
                                                    httpURLConnectionA = httpURLConnection;
                                                    jElapsedRealtime = jElapsedRealtime3;
                                                    bArr3 = bArrA;
                                                    jElapsedRealtime2 = j3;
                                                    bArr2 = null;
                                                }
                                                n7.a(httpURLConnectionA, this.f48101b);
                                                final d dVarA22 = d.a().a(iHttpUrlConnectionGetResponseCode).a(bArr3).b(bArr2).a(jElapsedRealtime - jElapsedRealtime2).a(th2).a();
                                                cVar.f48109g.execute(new Runnable() { // from class: com.applovin.impl.SPz
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        b4.b.a(cVar, dVarA22);
                                                    }
                                                });
                                            } catch (Throwable th11) {
                                                n7.a(httpURLConnection, this.f48101b);
                                                throw th11;
                                            }
                                        }
                                    }
                                }
                                bArr3 = bArrA;
                                bArr2 = null;
                                th2 = null;
                            } catch (Throwable th12) {
                                if (inputStreamUrlConnectionGetInputStream == null) {
                                    throw th12;
                                }
                                try {
                                    inputStreamUrlConnectionGetInputStream.close();
                                    throw th12;
                                } catch (Throwable th13) {
                                    th12.addSuppressed(th13);
                                    throw th12;
                                }
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            bArrA = null;
                            HashMap map22 = new HashMap();
                            CollectionUtils.putStringIfValid("details", "responseDataInputStream", map22);
                            CollectionUtils.putStringIfValid("url", cVar.f48103a, map22);
                            CollectionUtils.putStringIfValid("code", Integer.toString(iHttpUrlConnectionGetResponseCode), map22);
                            this.f48101b.D().a("NetworkCommunicationThread", "processRequest", th, map22);
                            throw th;
                        }
                    } else {
                        bArr2 = null;
                        th2 = null;
                        bArr3 = null;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    httpURLConnection = httpURLConnectionA;
                    bArrA = null;
                    i2 = iHttpUrlConnectionGetResponseCode;
                    long j32 = jElapsedRealtime2;
                    th = th;
                    long jElapsedRealtime32 = SystemClock.elapsedRealtime();
                    this.f48101b.O().a("NetworkCommunicationThread", th);
                    this.f48101b.O();
                    if (C1804o.a()) {
                    }
                    if (httpURLConnection == null) {
                    }
                    n7.a(httpURLConnectionA, this.f48101b);
                    final d dVarA222 = d.a().a(iHttpUrlConnectionGetResponseCode).a(bArr3).b(bArr2).a(jElapsedRealtime - jElapsedRealtime2).a(th2).a();
                    cVar.f48109g.execute(new Runnable() { // from class: com.applovin.impl.SPz
                        @Override // java.lang.Runnable
                        public final void run() {
                            b4.b.a(cVar, dVarA222);
                        }
                    });
                }
            } catch (Throwable th16) {
                th = th16;
                i2 = 0;
                httpURLConnection = null;
                bArrA = null;
            }
            n7.a(httpURLConnectionA, this.f48101b);
            final d dVarA2222 = d.a().a(iHttpUrlConnectionGetResponseCode).a(bArr3).b(bArr2).a(jElapsedRealtime - jElapsedRealtime2).a(th2).a();
            cVar.f48109g.execute(new Runnable() { // from class: com.applovin.impl.SPz
                @Override // java.lang.Runnable
                public final void run() {
                    b4.b.a(cVar, dVarA2222);
                }
            });
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f48108f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(cVar.f48103a).openConnection()));
            httpURLConnection.setRequestMethod(cVar.f48104b);
            httpURLConnection.setConnectTimeout(cVar.f48107e);
            httpURLConnection.setReadTimeout(cVar.f48107e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f48105c.isEmpty()) {
                for (Map.Entry entry : cVar.f48105c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    public static class c implements Comparable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final AtomicInteger f48102i = new AtomicInteger();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f48104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f48105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f48106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f48107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Consumer f48108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Executor f48109g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f48110h;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f48111a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f48112b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Map f48113c = new HashMap();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private byte[] f48114d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f48115e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Consumer f48116f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f48117g;

            public a a(String str) {
                this.f48111a = str;
                return this;
            }

            public a b(String str) {
                this.f48112b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f48113c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f48113c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f48114d = bArr;
                return this;
            }

            public a a(int i2) {
                this.f48115e = i2;
                return this;
            }

            public a a(Consumer consumer) {
                this.f48116f = consumer;
                return this;
            }

            public a a(Executor executor) {
                this.f48117g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        private c(a aVar) {
            this.f48103a = aVar.f48111a;
            this.f48104b = aVar.f48112b;
            this.f48105c = aVar.f48113c != null ? aVar.f48113c : Collections.EMPTY_MAP;
            this.f48106d = aVar.f48114d;
            this.f48107e = aVar.f48115e;
            this.f48108f = aVar.f48116f;
            this.f48109g = aVar.f48117g;
            this.f48110h = f48102i.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f48110h - cVar.f48110h;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f48119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f48120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f48121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Throwable f48122e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f48123a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f48124b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private byte[] f48125c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f48126d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Throwable f48127e;

            public a a(int i2) {
                this.f48123a = i2;
                return this;
            }

            public a b(byte[] bArr) {
                this.f48125c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f48124b = bArr;
                return this;
            }

            public a a(Throwable th) {
                this.f48127e = th;
                return this;
            }

            public a a(long j2) {
                this.f48126d = j2;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        private d(a aVar) {
            this.f48118a = aVar.f48123a;
            this.f48119b = aVar.f48124b;
            this.f48120c = aVar.f48125c;
            this.f48121d = aVar.f48126d;
            this.f48122e = aVar.f48127e;
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f48118a;
        }

        public int c() throws Throwable {
            Throwable th = this.f48122e;
            if (th == null) {
                return this.f48118a;
            }
            throw th;
        }

        public byte[] d() throws Throwable {
            Throwable th = this.f48122e;
            if (th == null) {
                return this.f48119b;
            }
            throw th;
        }

        public long e() {
            return this.f48121d;
        }

        public byte[] f() {
            return this.f48120c;
        }
    }

    public void a() {
        for (int i2 = 0; i2 < ((Integer) this.f48099b.a(x4.f50787R)).intValue(); i2++) {
            new b(this.f48098a, i2, this.f48099b).start();
        }
    }

    public b4(C1802k c1802k) {
        this.f48099b = c1802k;
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f48098a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
