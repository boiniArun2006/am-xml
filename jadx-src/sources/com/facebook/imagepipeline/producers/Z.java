package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.alightcreative.time.Kw.znsSxz;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.P;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.internal.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Z extends Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Jv.n f52524O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f52525n;
    private final ExecutorService nr;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f52526t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w6 f52528n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ P.j f52529t;

        j(w6 w6Var, P.j jVar) {
            this.f52528n = w6Var;
            this.f52529t = jVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Z.this.mUb(this.f52528n, this.f52529t);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class n extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Future f52530n;
        final /* synthetic */ P.j rl;

        n(Future future, P.j jVar) {
            this.f52530n = future;
            this.rl = jVar;
        }

        @Override // com.facebook.imagepipeline.producers.OU
        public void rl() {
            if (this.f52530n.cancel(false)) {
                this.rl.n();
            }
        }
    }

    public Z(int i2) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f52525n = i2;
    }

    private static boolean az(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    private static boolean qie(int i2) {
        if (i2 == 307 || i2 == 308) {
            return true;
        }
        switch (i2) {
            case d.f62986a /* 300 */:
            case MRAID_ERROR_VALUE:
            case INVALID_IFA_STATUS_VALUE:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void mUb(w6 w6Var, P.j jVar) throws Throwable {
        HttpURLConnection httpURLConnectionUo;
        InputStream inputStream = null;
        try {
            httpURLConnectionUo = Uo(w6Var.Uo(), 5);
            try {
                try {
                    w6Var.Uo = this.f52524O.now();
                    if (httpURLConnectionUo != null) {
                        inputStream = httpURLConnectionUo.getInputStream();
                        jVar.rl(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionUo == null) {
                        return;
                    }
                } catch (IOException e2) {
                    e = e2;
                    jVar.onFailure(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionUo == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnectionUo != null) {
                    throw th;
                }
                httpURLConnectionUo.disconnect();
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnectionUo = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionUo = null;
            if (inputStream != null) {
            }
            if (httpURLConnectionUo != null) {
            }
        }
        httpURLConnectionUo.disconnect();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static class w6 extends afx {
        private long J2;
        private long KN;
        private long Uo;

        public w6(Pl pl, mz mzVar) {
            super(pl, mzVar);
        }
    }

    @Override // com.facebook.imagepipeline.producers.P
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public w6 O(Pl pl, mz mzVar) {
        return new w6(pl, mzVar);
    }

    @Override // com.facebook.imagepipeline.producers.P
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public Map nr(w6 w6Var, int i2) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(w6Var.Uo - w6Var.J2));
        map.put("fetch_time", Long.toString(w6Var.KN - w6Var.Uo));
        map.put("total_time", Long.toString(w6Var.KN - w6Var.J2));
        map.put(znsSxz.xBNPDLlweELeh, Integer.toString(i2));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.P
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void rl(w6 w6Var, int i2) {
        w6Var.KN = this.f52524O.now();
    }

    @Override // com.facebook.imagepipeline.producers.P
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public void n(w6 w6Var, P.j jVar) {
        w6Var.J2 = this.f52524O.now();
        w6Var.rl().rl(new n(this.nr.submit(new j(w6Var, jVar)), jVar));
    }

    Z(String str, Map map, Jv.n nVar) {
        this.nr = Executors.newFixedThreadPool(3);
        this.f52524O = nVar;
        this.f52526t = map;
        this.rl = str;
    }

    static HttpURLConnection HI(Uri uri) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(vn.I28.Ik(uri).openConnection()));
    }

    private static String KN(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private HttpURLConnection Uo(Uri uri, int i2) throws IOException {
        Uri uri2;
        String strKN;
        HttpURLConnection httpURLConnectionHI = HI(uri);
        String str = this.rl;
        if (str != null) {
            httpURLConnectionHI.setRequestProperty("User-Agent", str);
        }
        Map map = this.f52526t;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionHI.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        httpURLConnectionHI.setConnectTimeout(this.f52525n);
        int responseCode = httpURLConnectionHI.getResponseCode();
        if (az(responseCode)) {
            return httpURLConnectionHI;
        }
        if (qie(responseCode)) {
            String headerField = httpURLConnectionHI.getHeaderField("Location");
            httpURLConnectionHI.disconnect();
            if (headerField == null) {
                uri2 = null;
            } else {
                uri2 = Uri.parse(headerField);
            }
            String scheme = uri.getScheme();
            if (i2 > 0 && uri2 != null && !Hh.Dsr.n(uri2.getScheme(), scheme)) {
                return Uo(uri2, i2 - 1);
            }
            if (i2 == 0) {
                strKN = KN("URL %s follows too many redirects", uri.toString());
            } else {
                strKN = KN("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
            }
            throw new IOException(strKN);
        }
        httpURLConnectionHI.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
    }
}
