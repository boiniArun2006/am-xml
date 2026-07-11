package com.google.android.datatransport.cct;

import Z8.AbstractC1495c;
import Z8.Pl;
import Z8.Q;
import Z8.QJ;
import Z8.UGc;
import Z8.Xo;
import Z8.eO;
import Z8.l3D;
import Z8.r;
import Z8.s4;
import Z8.z;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.datatransport.cct.Ml;
import com.google.firebase.encoders.EncodingException;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.vungle.ads.internal.protos.Sdk;
import hay.CN3;
import hay.Wre;
import hay.qz;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import veW.Dsr;
import veW.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class Ml implements qz {
    private final MR.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MR.j f57348O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WkR.j f57349n;
    final URL nr;
    private final ConnectivityManager rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f57350t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final URL f57351n;
        final Pl rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final String f57352t;

        j n(URL url) {
            return new j(url, this.rl, this.f57352t);
        }

        j(URL url, Pl pl, String str) {
            this.f57351n = url;
            this.rl = pl;
            this.f57352t = str;
        }
    }

    Ml(Context context, MR.j jVar, MR.j jVar2, int i2) {
        this.f57349n = Pl.rl();
        this.f57350t = context;
        this.rl = (ConnectivityManager) context.getSystemService("connectivity");
        this.nr = ty(com.google.android.datatransport.cct.j.f57356t);
        this.f57348O = jVar2;
        this.J2 = jVar;
        this.Uo = i2;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f57353n;
        final URL rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final long f57354t;

        n(int i2, URL url, long j2) {
            this.f57353n = i2;
            this.rl = url;
            this.f57354t = j2;
        }
    }

    private static int KN(NetworkInfo networkInfo) {
        return networkInfo == null ? Q.w6.NONE.rl() : networkInfo.getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n O(j jVar) throws IOException {
        l0.j.J2("CctTransportBackend", "Making request to: %s", jVar.f57351n);
        HttpURLConnection httpURLConnection = (HttpURLConnection) jVar.f57351n.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.Uo);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = jVar.f57352t;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f57349n.n(jVar.rl, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    l0.j.J2("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    l0.j.rl("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    l0.j.rl("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new n(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new n(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamAz = az(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            n nVar = new n(responseCode, null, UGc.rl(new BufferedReader(new InputStreamReader(inputStreamAz))).t());
                            if (inputStreamAz != null) {
                                inputStreamAz.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return nVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e2) {
            e = e2;
            l0.j.nr("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new n(Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE, null, 0L);
        } catch (ConnectException e3) {
            e = e3;
            l0.j.nr("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new n(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            l0.j.nr("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new n(500, null, 0L);
        } catch (IOException e5) {
            e = e5;
            l0.j.nr("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new n(Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE, null, 0L);
        }
    }

    private static int Uo(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return Q.n.UNKNOWN_MOBILE_SUBTYPE.rl();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return Q.n.COMBINED.rl();
        }
        if (Q.n.n(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static InputStream az(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static TelephonyManager gh(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    private Pl mUb(Wre wre) {
        AbstractC1495c.j jVarQie;
        HashMap map = new HashMap();
        for (Dsr dsr : wre.rl()) {
            String strTy = dsr.ty();
            if (map.containsKey(strTy)) {
                ((List) map.get(strTy)).add(dsr);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dsr);
                map.put(strTy, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Dsr dsr2 = (Dsr) ((List) entry.getValue()).get(0);
            s4.j jVarRl = s4.n().J2(r.DEFAULT).Uo(this.J2.getTime()).KN(this.f57348O.getTime()).rl(Xo.n().t(Xo.n.ANDROID_FIREBASE).rl(Z8.j.n().az(Integer.valueOf(dsr2.xMQ("sdk-version"))).mUb(dsr2.rl("model")).J2(dsr2.rl("hardware")).nr(dsr2.rl("device")).qie(dsr2.rl(AppLovinEventTypes.USER_VIEWED_PRODUCT)).gh(dsr2.rl("os-uild")).KN(dsr2.rl("manufacturer")).O(dsr2.rl(FileUploadManager.f61565c)).t(dsr2.rl("country")).Uo(dsr2.rl("locale")).xMQ(dsr2.rl("mcc_mnc")).rl(dsr2.rl("application_build")).n()).n());
            try {
                jVarRl.xMQ(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                jVarRl.mUb((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Dsr dsr3 : (List) entry.getValue()) {
                fuX fuxO = dsr3.O();
                bF.n nVarRl = fuxO.rl();
                if (nVarRl.equals(bF.n.rl("proto"))) {
                    jVarQie = AbstractC1495c.qie(fuxO.n());
                } else if (nVarRl.equals(bF.n.rl("json"))) {
                    jVarQie = AbstractC1495c.gh(new String(fuxO.n(), Charset.forName(qfEYuUHwj.fOOBpxbxratwLRn)));
                } else {
                    l0.j.Uo("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", nVarRl);
                }
                jVarQie.nr(dsr3.J2()).O(dsr3.HI()).mUb(dsr3.mUb("tz-offset")).Uo(Q.n().t(Q.w6.n(dsr3.xMQ("net-type"))).rl(Q.n.n(dsr3.xMQ("mobile-subtype"))).n());
                if (dsr3.nr() != null) {
                    jVarQie.t(dsr3.nr());
                }
                if (dsr3.qie() != null) {
                    jVarQie.rl(eO.n().rl(l3D.n().rl(QJ.n().rl(dsr3.qie()).n()).n()).t(eO.n.EVENT_OVERRIDE).n());
                }
                if (dsr3.Uo() != null || dsr3.KN() != null) {
                    z.j jVarN = z.n();
                    if (dsr3.Uo() != null) {
                        jVarN.rl(dsr3.Uo());
                    }
                    if (dsr3.KN() != null) {
                        jVarN.t(dsr3.KN());
                    }
                    jVarQie.J2(jVarN.n());
                }
                arrayList3.add(jVarQie.n());
            }
            jVarRl.t(arrayList3);
            arrayList2.add(jVarRl.n());
        }
        return Pl.n(arrayList2);
    }

    public static /* synthetic */ j nr(j jVar, n nVar) {
        URL url = nVar.rl;
        if (url == null) {
            return null;
        }
        l0.j.rl("CctTransportBackend", "Following redirect to: %s", url);
        return jVar.n(nVar.rl);
    }

    private static URL ty(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    @Override // hay.qz
    public Dsr rl(Dsr dsr) {
        NetworkInfo activeNetworkInfo = this.rl.getActiveNetworkInfo();
        return dsr.ck().n("sdk-version", Build.VERSION.SDK_INT).t("model", Build.MODEL).t("hardware", Build.HARDWARE).t("device", Build.DEVICE).t(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT).t("os-uild", Build.ID).t("manufacturer", Build.MANUFACTURER).t(FileUploadManager.f61565c, Build.FINGERPRINT).rl("tz-offset", qie()).n("net-type", KN(activeNetworkInfo)).n("mobile-subtype", Uo(activeNetworkInfo)).t("country", Locale.getDefault().getCountry()).t("locale", Locale.getDefault().getLanguage()).t("mcc_mnc", J2(this.f57350t)).t("application_build", Integer.toString(xMQ(this.f57350t))).nr();
    }

    private static String J2(Context context) {
        String simOperator = gh(context).getSimOperator();
        if (simOperator != null) {
            return simOperator;
        }
        return "";
    }

    static long qie() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static int xMQ(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            l0.j.nr("CctTransportBackend", "Unable to find version code for package", e2);
            return -1;
        }
    }

    @Override // hay.qz
    public CN3 n(Wre wre) {
        Pl plMUb = mUb(wre);
        URL urlTy = this.nr;
        String strNr = null;
        if (wre.t() != null) {
            try {
                com.google.android.datatransport.cct.j jVarT = com.google.android.datatransport.cct.j.t(wre.t());
                if (jVarT.nr() != null) {
                    strNr = jVarT.nr();
                }
                if (jVarT.O() != null) {
                    urlTy = ty(jVarT.O());
                }
            } catch (IllegalArgumentException unused) {
                return CN3.n();
            }
        }
        try {
            n nVar = (n) LF5.n.n(5, new j(urlTy, plMUb, strNr), new LF5.j() { // from class: com.google.android.datatransport.cct.n
                @Override // LF5.j
                public final Object apply(Object obj) {
                    return this.f57358n.O((Ml.j) obj);
                }
            }, new LF5.w6() { // from class: com.google.android.datatransport.cct.w6
                @Override // LF5.w6
                public final Object n(Object obj, Object obj2) {
                    return Ml.nr((Ml.j) obj, (Ml.n) obj2);
                }
            });
            int i2 = nVar.f57353n;
            if (i2 == 200) {
                return CN3.O(nVar.f57354t);
            }
            if (i2 < 500 && i2 != 404) {
                if (i2 == 400) {
                    return CN3.nr();
                }
                return CN3.n();
            }
            return CN3.J2();
        } catch (IOException e2) {
            l0.j.nr("CctTransportBackend", "Could not make request to the backend", e2);
            return CN3.J2();
        }
    }

    Ml(Context context, MR.j jVar, MR.j jVar2) {
        this(context, jVar, jVar2, 130000);
    }
}
