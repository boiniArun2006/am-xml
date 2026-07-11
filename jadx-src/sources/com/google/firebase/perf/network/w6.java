package com.google.firebase.perf.network;

import R0.CN3;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class w6 {
    private static final yMa.j J2 = yMa.j.O();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Timer f60660O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HttpURLConnection f60661n;
    private final CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f60662t = -1;
    private long nr = -1;

    private void J() {
        if (this.f60662t == -1) {
            this.f60660O.Uo();
            long jO = this.f60660O.O();
            this.f60662t = jO;
            this.rl.ty(jO);
        }
        String strE = e();
        if (strE != null) {
            this.rl.mUb(strE);
        } else if (HI()) {
            this.rl.mUb("POST");
        } else {
            this.rl.mUb("GET");
        }
    }

    public void B(boolean z2) {
        this.f60661n.setUseCaches(z2);
    }

    public boolean D() {
        return this.f60661n.usingProxy();
    }

    public void E(int i2) {
        this.f60661n.setReadTimeout(i2);
    }

    public int E2() {
        return this.f60661n.getReadTimeout();
    }

    public void FX(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.rl.XQ(str2);
        }
        this.f60661n.setRequestProperty(str, str2);
    }

    public boolean HI() {
        return this.f60661n.getDoOutput();
    }

    public void M(String str) {
        this.f60661n.setRequestMethod(str);
    }

    public void M7(long j2) {
        this.f60661n.setFixedLengthStreamingMode(j2);
    }

    public int O() {
        return this.f60661n.getConnectTimeout();
    }

    public void P5(int i2) {
        this.f60661n.setFixedLengthStreamingMode(i2);
    }

    public String T(String str) {
        return this.f60661n.getRequestProperty(str);
    }

    public void U(boolean z2) {
        this.f60661n.setDoOutput(z2);
    }

    public long ViF() {
        return this.f60661n.getIfModifiedSince();
    }

    public Map X() {
        return this.f60661n.getRequestProperties();
    }

    public void Xw(boolean z2) {
        this.f60661n.setDefaultUseCaches(z2);
    }

    public boolean az() {
        return this.f60661n.getDefaultUseCaches();
    }

    public void bzg(int i2) {
        this.f60661n.setConnectTimeout(i2);
    }

    public String e() {
        return this.f60661n.getRequestMethod();
    }

    public void eF(boolean z2) {
        this.f60661n.setInstanceFollowRedirects(z2);
    }

    public boolean equals(Object obj) {
        return this.f60661n.equals(obj);
    }

    public Permission fD() throws IOException {
        try {
            return this.f60661n.getPermission();
        } catch (IOException e2) {
            this.rl.r(this.f60660O.t());
            nl4.Ml.nr(this.rl);
            throw e2;
        }
    }

    public boolean g() {
        return this.f60661n.getInstanceFollowRedirects();
    }

    public int hashCode() {
        return this.f60661n.hashCode();
    }

    public OutputStream iF() throws IOException {
        try {
            OutputStream outputStream = this.f60661n.getOutputStream();
            return outputStream != null ? new nl4.n(outputStream, this.rl, this.f60660O) : outputStream;
        } catch (IOException e2) {
            this.rl.r(this.f60660O.t());
            nl4.Ml.nr(this.rl);
            throw e2;
        }
    }

    public void jB(boolean z2) {
        this.f60661n.setDoInput(z2);
    }

    public void n(String str, String str2) {
        this.f60661n.addRequestProperty(str, str2);
    }

    public boolean nr() {
        return this.f60661n.getAllowUserInteraction();
    }

    public void p5(long j2) {
        this.f60661n.setIfModifiedSince(j2);
    }

    public void rV9(int i2) {
        this.f60661n.setChunkedStreamingMode(i2);
    }

    public void rl() {
        if (this.f60662t == -1) {
            this.f60660O.Uo();
            long jO = this.f60660O.O();
            this.f60662t = jO;
            this.rl.ty(jO);
        }
        try {
            this.f60661n.connect();
        } catch (IOException e2) {
            this.rl.r(this.f60660O.t());
            nl4.Ml.nr(this.rl);
            throw e2;
        }
    }

    public URL s7N() {
        return this.f60661n.getURL();
    }

    public void t() {
        this.rl.r(this.f60660O.t());
        this.rl.rl();
        this.f60661n.disconnect();
    }

    public String toString() {
        return this.f60661n.toString();
    }

    public boolean ty() {
        return this.f60661n.getDoInput();
    }

    public void v(boolean z2) {
        this.f60661n.setAllowUserInteraction(z2);
    }

    public boolean wTp() {
        return this.f60661n.getUseCaches();
    }

    public w6(HttpURLConnection httpURLConnection, Timer timer, CN3 cn3) {
        this.f60661n = httpURLConnection;
        this.rl = cn3;
        this.f60660O = timer;
        cn3.Z(httpURLConnection.getURL().toString());
    }

    public long Ik() {
        J();
        return this.f60661n.getExpiration();
    }

    public Object J2() throws IOException {
        J();
        this.rl.gh(this.f60661n.getResponseCode());
        try {
            Object content = this.f60661n.getContent();
            if (content instanceof InputStream) {
                this.rl.HI(this.f60661n.getContentType());
                return new nl4.j((InputStream) content, this.rl, this.f60660O);
            }
            this.rl.HI(this.f60661n.getContentType());
            this.rl.ck(this.f60661n.getContentLength());
            this.rl.r(this.f60660O.t());
            this.rl.rl();
            return content;
        } catch (IOException e2) {
            this.rl.r(this.f60660O.t());
            nl4.Ml.nr(this.rl);
            throw e2;
        }
    }

    public String KN() {
        J();
        return this.f60661n.getContentEncoding();
    }

    public int N() throws IOException {
        J();
        if (this.nr == -1) {
            long jT2 = this.f60660O.t();
            this.nr = jT2;
            this.rl.o(jT2);
        }
        try {
            int responseCode = this.f60661n.getResponseCode();
            this.rl.gh(responseCode);
            return responseCode;
        } catch (IOException e2) {
            this.rl.r(this.f60660O.t());
            nl4.Ml.nr(this.rl);
            throw e2;
        }
    }

    public String S(int i2) {
        J();
        return this.f60661n.getHeaderFieldKey(i2);
    }

    public Object Uo(Class[] clsArr) throws IOException {
        J();
        this.rl.gh(this.f60661n.getResponseCode());
        try {
            Object content = this.f60661n.getContent(clsArr);
            if (content instanceof InputStream) {
                this.rl.HI(this.f60661n.getContentType());
                return new nl4.j((InputStream) content, this.rl, this.f60660O);
            }
            this.rl.HI(this.f60661n.getContentType());
            this.rl.ck(this.f60661n.getContentLength());
            this.rl.r(this.f60660O.t());
            this.rl.rl();
            return content;
        } catch (IOException e2) {
            this.rl.r(this.f60660O.t());
            nl4.Ml.nr(this.rl);
            throw e2;
        }
    }

    public long WPU(String str, long j2) {
        J();
        return this.f60661n.getHeaderFieldLong(str, j2);
    }

    public int XQ(String str, int i2) {
        J();
        return this.f60661n.getHeaderFieldInt(str, i2);
    }

    public long Z(String str, long j2) {
        J();
        return this.f60661n.getHeaderFieldDate(str, j2);
    }

    public Map aYN() {
        J();
        return this.f60661n.getHeaderFields();
    }

    public InputStream ck() {
        J();
        try {
            this.rl.gh(this.f60661n.getResponseCode());
        } catch (IOException unused) {
            J2.n("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f60661n.getErrorStream();
        if (errorStream != null) {
            return new nl4.j(errorStream, this.rl, this.f60660O);
        }
        return errorStream;
    }

    public String gh() {
        J();
        return this.f60661n.getContentType();
    }

    public long mUb() {
        J();
        return this.f60661n.getContentLengthLong();
    }

    public String nHg() throws IOException {
        J();
        if (this.nr == -1) {
            long jT2 = this.f60660O.t();
            this.nr = jT2;
            this.rl.o(jT2);
        }
        try {
            String responseMessage = this.f60661n.getResponseMessage();
            this.rl.gh(this.f60661n.getResponseCode());
            return responseMessage;
        } catch (IOException e2) {
            this.rl.r(this.f60660O.t());
            nl4.Ml.nr(this.rl);
            throw e2;
        }
    }

    public InputStream nY() throws IOException {
        J();
        this.rl.gh(this.f60661n.getResponseCode());
        this.rl.HI(this.f60661n.getContentType());
        try {
            InputStream inputStream = this.f60661n.getInputStream();
            if (inputStream != null) {
                return new nl4.j(inputStream, this.rl, this.f60660O);
            }
            return inputStream;
        } catch (IOException e2) {
            this.rl.r(this.f60660O.t());
            nl4.Ml.nr(this.rl);
            throw e2;
        }
    }

    public String o(String str) {
        J();
        return this.f60661n.getHeaderField(str);
    }

    public long qie() {
        J();
        return this.f60661n.getDate();
    }

    public String r(int i2) {
        J();
        return this.f60661n.getHeaderField(i2);
    }

    public long te() {
        J();
        return this.f60661n.getLastModified();
    }

    public int xMQ() {
        J();
        return this.f60661n.getContentLength();
    }
}
