package com.google.firebase.perf.network;

import O2.qz;
import R0.CN3;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import jMi.C;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        return n(new qz(url), C.gh(), new Timer());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return rl(new qz(url), clsArr, C.gh(), new Timer());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        return obj instanceof HttpsURLConnection ? new n((HttpsURLConnection) obj, new Timer(), CN3.t(C.gh())) : obj instanceof HttpURLConnection ? new j((HttpURLConnection) obj, new Timer(), CN3.t(C.gh())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return t(new qz(url), C.gh(), new Timer());
    }

    static Object n(qz qzVar, C c2, Timer timer) throws IOException {
        timer.Uo();
        long jO = timer.O();
        CN3 cn3T = CN3.t(c2);
        try {
            URLConnection uRLConnectionN = qzVar.n();
            if (uRLConnectionN instanceof HttpsURLConnection) {
                return new n((HttpsURLConnection) uRLConnectionN, timer, cn3T).getContent();
            }
            if (uRLConnectionN instanceof HttpURLConnection) {
                return new j((HttpURLConnection) uRLConnectionN, timer, cn3T).getContent();
            }
            return uRLConnectionN.getContent();
        } catch (IOException e2) {
            cn3T.ty(jO);
            cn3T.r(timer.t());
            cn3T.Z(qzVar.toString());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    static Object rl(qz qzVar, Class[] clsArr, C c2, Timer timer) throws IOException {
        timer.Uo();
        long jO = timer.O();
        CN3 cn3T = CN3.t(c2);
        try {
            URLConnection uRLConnectionN = qzVar.n();
            if (uRLConnectionN instanceof HttpsURLConnection) {
                return new n((HttpsURLConnection) uRLConnectionN, timer, cn3T).getContent(clsArr);
            }
            if (uRLConnectionN instanceof HttpURLConnection) {
                return new j((HttpURLConnection) uRLConnectionN, timer, cn3T).getContent(clsArr);
            }
            return uRLConnectionN.getContent(clsArr);
        } catch (IOException e2) {
            cn3T.ty(jO);
            cn3T.r(timer.t());
            cn3T.Z(qzVar.toString());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }

    static InputStream t(qz qzVar, C c2, Timer timer) throws IOException {
        if (!C.gh().XQ()) {
            return qzVar.n().getInputStream();
        }
        timer.Uo();
        long jO = timer.O();
        CN3 cn3T = CN3.t(c2);
        try {
            URLConnection uRLConnectionN = qzVar.n();
            if (uRLConnectionN instanceof HttpsURLConnection) {
                return new n((HttpsURLConnection) uRLConnectionN, timer, cn3T).getInputStream();
            }
            if (uRLConnectionN instanceof HttpURLConnection) {
                return new j((HttpURLConnection) uRLConnectionN, timer, cn3T).getInputStream();
            }
            return uRLConnectionN.getInputStream();
        } catch (IOException e2) {
            cn3T.ty(jO);
            cn3T.r(timer.t());
            cn3T.Z(qzVar.toString());
            nl4.Ml.nr(cn3T);
            throw e2;
        }
    }
}
