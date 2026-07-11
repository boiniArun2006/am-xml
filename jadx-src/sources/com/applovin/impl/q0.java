package com.applovin.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.vungle.ads.internal.ui.AdActivity;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class q0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f49765e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f49767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b4 f49768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f49769d;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f49770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f49771b;

        public long a() {
            return this.f49770a;
        }

        public long b() {
            return this.f49771b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j2) {
            this.f49770a = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j2) {
            this.f49771b = j2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private class c implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f49773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f49774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f49775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f49776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f49777f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f49778g;

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z2, b bVar, e eVar) {
            this.f49772a = str;
            this.f49773b = aVar;
            this.f49774c = str2;
            this.f49775d = obj;
            this.f49776e = z2;
            this.f49777f = bVar;
            this.f49778g = eVar;
        }

        /* JADX WARN: Not initialized variable reg: 6, insn: 0x004d: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:78), block:B:29:0x004c */
        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b4.d dVar) {
            MalformedURLException malformedURLException;
            int iC;
            int i2;
            String str;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    iC = dVar.c();
                    try {
                        if (iC <= 0) {
                            try {
                                q0.this.a(this.f49774c, this.f49772a, iC, jE, (Throwable) null);
                                this.f49778g.a(this.f49772a, iC, null, null);
                                return;
                            } catch (MalformedURLException e2) {
                                e = e2;
                                iC = iC;
                            }
                        } else {
                            try {
                                if (iC >= 200 && iC < 400) {
                                    try {
                                        b bVar = this.f49777f;
                                        if (bVar != null) {
                                            bVar.a(jE);
                                        }
                                        q0.this.a(this.f49774c, this.f49772a, iC, jE);
                                        byte[] bArrD = dVar.d();
                                        if (n7.h(C1802k.o()) && (!this.f49776e || AbstractC1810u4.b(bArrD) != AbstractC1810u4.a.V2)) {
                                            String string = "";
                                            if (bArrD == null) {
                                                str = "";
                                            } else {
                                                str = new String(dVar.d(), Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME));
                                            }
                                            if (this.f49773b.b() != null) {
                                                string = this.f49773b.b().toString();
                                            }
                                            q0.this.f49766a.t().a(str, this.f49772a, string);
                                        }
                                        if (bArrD != null) {
                                            String str2 = new String(dVar.d(), Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME));
                                            b bVar2 = this.f49777f;
                                            if (bVar2 != null) {
                                                bVar2.b(bArrD.length);
                                                if (this.f49773b.r()) {
                                                    q0.this.f49769d = new d(this.f49773b.f(), bArrD.length, jE);
                                                }
                                            }
                                            if (this.f49776e) {
                                                String strB = AbstractC1810u4.b(bArrD, q0.this.f49766a.i0(), q0.this.f49766a);
                                                if (strB == null) {
                                                    HashMap map = new HashMap(2);
                                                    map.put(AdActivity.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(this.f49772a));
                                                    map.put("response", str2);
                                                    q0.this.f49766a.F().trackEvent("rdf", map);
                                                }
                                                str2 = strB;
                                            }
                                            try {
                                                this.f49778g.a(this.f49772a, q0.this.a(str2, this.f49775d), iC);
                                                return;
                                            } catch (Throwable th) {
                                                String str3 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f49772a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                                C1804o unused = q0.this.f49767b;
                                                if (C1804o.a()) {
                                                    q0.this.f49767b.a("ConnectionManager", str3, th);
                                                }
                                                q0.this.f49766a.D().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f49772a)));
                                                this.f49778g.a(this.f49772a, AppLovinErrorCodes.INVALID_RESPONSE, str3, null);
                                                return;
                                            }
                                        }
                                        this.f49778g.a(this.f49772a, this.f49775d, iC);
                                        return;
                                    } catch (MalformedURLException e3) {
                                        e = e3;
                                    }
                                } else {
                                    this.f49778g.a(this.f49772a, iC, null, null);
                                    return;
                                }
                            } catch (MalformedURLException e4) {
                                malformedURLException = e4;
                                iC = i2;
                            }
                        }
                    } catch (MalformedURLException e5) {
                        e = e5;
                    }
                    malformedURLException = e;
                } catch (MalformedURLException e6) {
                    malformedURLException = e6;
                    iC = 0;
                }
                MalformedURLException malformedURLException2 = malformedURLException;
                if (this.f49775d == null) {
                    q0.this.a(this.f49774c, this.f49772a, iC, jE);
                    this.f49778g.a(this.f49772a, this.f49775d, -901);
                } else {
                    q0.this.a(this.f49774c, this.f49772a, iC, jE, malformedURLException2);
                    this.f49778g.a(this.f49772a, -901, malformedURLException2.getMessage(), null);
                }
            } catch (Throwable th2) {
                int iB = dVar.b();
                try {
                    byte[] bArrF = dVar.f();
                    String str4 = new String(bArrF);
                    if (bArrF != null) {
                        if (this.f49776e) {
                            str4 = AbstractC1810u4.b(bArrF, q0.this.f49766a.i0(), q0.this.f49766a);
                        }
                        objA = q0.this.a(str4, this.f49775d);
                    }
                } catch (Throwable unused2) {
                }
                q0.this.a(this.f49774c, this.f49772a, iB, jE, th2);
                this.f49778g.a(this.f49772a, iB, th2.getMessage(), objA);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f49780a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f49781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f49782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f49783d;

        protected boolean a(Object obj) {
            return obj instanceof d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String strD = d();
            String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public long a() {
            return this.f49783d;
        }

        public long b() {
            return this.f49782c;
        }

        public long c() {
            return this.f49780a;
        }

        public String d() {
            return this.f49781b;
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + Apsps.nWoOCZ + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public d(String str, long j2, long j3) {
            this.f49781b = str;
            this.f49782c = j2;
            this.f49783d = j3;
        }

        public int hashCode() {
            int iHashCode;
            long jC = c();
            long jB = b();
            int i2 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            int i3 = ((i2 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59;
            if (strD == null) {
                iHashCode = 43;
            } else {
                iHashCode = strD.hashCode();
            }
            return i3 + iHashCode;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface e {
        void a(String str, int i2, String str2, Object obj);

        void a(String str, Object obj, int i2);
    }

    public q0(C1802k c1802k) {
        this.f49766a = c1802k;
        this.f49767b = c1802k.O();
        b4 b4Var = new b4(c1802k);
        this.f49768c = b4Var;
        b4Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0218 A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #0 {all -> 0x0143, blocks: (B:40:0x0106, B:44:0x0133, B:43:0x012f, B:51:0x016d, B:53:0x0185, B:59:0x01a7, B:74:0x01fe, B:77:0x020d, B:79:0x0218, B:61:0x01ab, B:64:0x01b3, B:69:0x01ca, B:71:0x01d0, B:72:0x01ea, B:55:0x0194, B:82:0x0221, B:66:0x01c4), top: B:107:0x0106, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(com.applovin.impl.sdk.network.a aVar, b bVar, e eVar) {
        String str;
        Throwable th;
        b4.c.a aVarA;
        byte[] bytes;
        byte[] bArrA;
        if (aVar != null) {
            String strF = aVar.f();
            String strH = aVar.h();
            if (strF == null) {
                throw new IllegalArgumentException("No endpoint specified");
            }
            if (strH == null) {
                throw new IllegalArgumentException("No method specified");
            }
            if (eVar != null) {
                if (!strF.toLowerCase().startsWith(com.safedk.android.analytics.brandsafety.creatives.g.f62375e)) {
                    String str2 = "Requested postback submission to non HTTP endpoint " + strF + "; skipping...";
                    C1804o.h("ConnectionManager", str2);
                    eVar.a(strF, AppLovinErrorCodes.INVALID_URL, str2, null);
                    return;
                }
                String httpsString = StringUtils.toHttpsString(strF);
                HashMap map = new HashMap(2);
                boolean zM = aVar.m();
                AbstractC1810u4.a aVarA2 = ((Boolean) this.f49766a.a(x4.o5)).booleanValue() ? AbstractC1810u4.a.a(((Integer) this.f49766a.a(x4.l5)).intValue()) : aVar.e();
                long jA = n7.a(this.f49766a);
                if ((aVar.i() != null && !aVar.i().isEmpty()) || aVar.c() > 0) {
                    Map mapI = aVar.i();
                    Boolean bool = (Boolean) this.f49766a.a(x4.i3);
                    if (mapI != null && aVar.c() > 0) {
                        mapI.put("current_retry_attempt", String.valueOf(aVar.c()));
                    }
                    if (zM) {
                        String strA = n7.a(mapI, bool.booleanValue());
                        String strB = AbstractC1810u4.b(strA, jA, aVarA2, this.f49766a.i0(), this.f49766a);
                        if (StringUtils.isValidString(strA) && TextUtils.isEmpty(strB)) {
                            map.put("query", strA);
                        }
                        httpsString = StringUtils.appendQueryParameter(httpsString, TtmlNode.TAG_P, strB);
                    } else {
                        httpsString = StringUtils.appendQueryParameters(httpsString, mapI, bool.booleanValue());
                    }
                }
                String str3 = httpsString;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Boolean boolEndsWith = StringUtils.endsWith(StringUtils.getHostAndPath(str3), f49765e);
                    if (C1804o.a()) {
                        try {
                            C1804o c1804o = this.f49767b;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Sending ");
                            sb.append(strH);
                            sb.append(" request to id=#");
                            sb.append(str3.hashCode());
                            sb.append(FijIa.bvM);
                            sb.append(boolEndsWith.booleanValue() ? str3 : StringUtils.getHostAndPath(str3));
                            sb.append("\"...");
                            c1804o.d("ConnectionManager", sb.toString());
                        } catch (Throwable th2) {
                            th = th2;
                            str = str3;
                        }
                    }
                    aVarA = new b4.c.a().a(str3).b(strH).a(aVar.g()).a(aVar.l());
                } catch (Throwable th3) {
                    th = th3;
                    str = str3;
                }
                if (aVar.b() != null) {
                    if (zM) {
                        bytes = AbstractC1810u4.a(aVar.b().toString(), jA, aVarA2, this.f49766a.i0(), this.f49766a);
                        if (bytes == null) {
                            map.put("body", aVar.b().toString());
                        }
                    } else {
                        bytes = aVar.b().toString().getBytes(com.google.android.exoplayer2.C.UTF8_NAME);
                    }
                    byte[] bArr = bytes;
                    if ((!zM || aVarA2 != AbstractC1810u4.a.V2) && aVar.o() && bArr != null && bArr.length > ((Integer) this.f49766a.a(x4.J5)).intValue()) {
                        try {
                            bArrA = n7.a(bArr);
                        } catch (Throwable th4) {
                            if (C1804o.a()) {
                                this.f49767b.a("ConnectionManager", "Failed to gzip POST body for request " + a(str3), th4);
                            }
                            this.f49766a.D().a("ConnectionManager", "gzip", th4, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(str3)));
                            bArrA = null;
                        }
                        aVarA.a("Content-Type", "application/json; charset=utf-8");
                        if (!aVar.o() && bArrA != null) {
                            aVarA.a("Content-Encoding", "gzip");
                            aVarA.a(bArrA);
                        } else if (bArr != null) {
                            aVarA.a(bArr);
                        }
                    } else {
                        bArrA = null;
                        aVarA.a("Content-Type", "application/json; charset=utf-8");
                        if (!aVar.o()) {
                            if (bArr != null) {
                            }
                        }
                    }
                    a(strH, str, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th);
                    eVar.a(str, 0, th.getMessage(), null);
                    return;
                }
                if (!map.isEmpty()) {
                    map.put(AdActivity.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(str3));
                    this.f49766a.F().trackEvent("ref", map);
                }
                b4 b4Var = this.f49768c;
                str = str3;
                try {
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    c cVar = new c(str, aVar, strH, aVar.d(), zM, bVar, eVar);
                    str = str;
                    strH = strH;
                    b4Var.a(aVarA.a(cVar).a(this.f49766a.q0().c()).a());
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    str = str;
                    strH = strH;
                    th = th;
                    a(strH, str, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th);
                    eVar.a(str, 0, th.getMessage(), null);
                    return;
                }
            }
            throw new IllegalArgumentException("No callback specified");
        }
        throw new IllegalArgumentException(QiDPjiOCZHDS.YclbztTQ);
    }

    public d a() {
        return this.f49769d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof p8) {
                return q8.a(str, this.f49766a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (C1804o.a()) {
                this.f49767b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i2, long j2) {
        if (C1804o.a()) {
            this.f49767b.d("ConnectionManager", "Successful " + str + " returned " + i2 + " in " + (j2 / 1000.0f) + " s over " + r0.g(this.f49766a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i2, long j2, Throwable th) {
        if (C1804o.a()) {
            this.f49767b.a("ConnectionManager", "Failed " + str + " returned " + i2 + " in " + (j2 / 1000.0f) + " s over " + r0.g(this.f49766a) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
