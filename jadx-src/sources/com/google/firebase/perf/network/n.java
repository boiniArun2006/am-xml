package com.google.firebase.perf.network;

import R0.CN3;
import com.google.firebase.perf.util.Timer;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n extends HttpsURLConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f60659n;
    private final HttpsURLConnection rl;

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f60659n.J2();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i2) {
        return this.f60659n.r(i2);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i2) {
        this.f60659n.P5(i2);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f60659n.n(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f60659n.rl();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f60659n.t();
    }

    public boolean equals(Object obj) {
        return this.f60659n.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f60659n.nr();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.rl.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f60659n.O();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f60659n.Uo(clsArr);
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f60659n.KN();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f60659n.xMQ();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f60659n.mUb();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f60659n.gh();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f60659n.qie();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f60659n.az();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f60659n.ty();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f60659n.HI();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f60659n.ck();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f60659n.Ik();
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f60659n.o(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j2) {
        return this.f60659n.Z(str, j2);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i2) {
        return this.f60659n.XQ(str, i2);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i2) {
        return this.f60659n.S(i2);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j2) {
        return this.f60659n.WPU(str, j2);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f60659n.aYN();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.rl.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f60659n.ViF();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f60659n.nY();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f60659n.g();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f60659n.te();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.rl.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.rl.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f60659n.iF();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.rl.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f60659n.fD();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f60659n.E2();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f60659n.e();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f60659n.X();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f60659n.T(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f60659n.N();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f60659n.nHg();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.rl.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.rl.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f60659n.s7N();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f60659n.wTp();
    }

    public int hashCode() {
        return this.f60659n.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z2) {
        this.f60659n.v(z2);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i2) {
        this.f60659n.rV9(i2);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i2) {
        this.f60659n.bzg(i2);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z2) {
        this.f60659n.Xw(z2);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z2) {
        this.f60659n.jB(z2);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z2) {
        this.f60659n.U(z2);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j2) {
        this.f60659n.M7(j2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.rl.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j2) {
        this.f60659n.p5(j2);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z2) {
        this.f60659n.eF(z2);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i2) {
        this.f60659n.E(i2);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f60659n.M(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f60659n.FX(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.rl.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z2) {
        this.f60659n.B(z2);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f60659n.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f60659n.D();
    }

    n(HttpsURLConnection httpsURLConnection, Timer timer, CN3 cn3) {
        super(httpsURLConnection.getURL());
        this.rl = httpsURLConnection;
        this.f60659n = new w6(httpsURLConnection, timer, cn3);
    }
}
