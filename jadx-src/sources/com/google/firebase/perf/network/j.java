package com.google.firebase.perf.network;

import R0.CN3;
import com.google.firebase.perf.util.Timer;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j extends HttpURLConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f60658n;

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f60658n.J2();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i2) {
        return this.f60658n.r(i2);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i2) {
        this.f60658n.P5(i2);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f60658n.n(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f60658n.rl();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f60658n.t();
    }

    public boolean equals(Object obj) {
        return this.f60658n.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f60658n.nr();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f60658n.O();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f60658n.Uo(clsArr);
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f60658n.KN();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f60658n.xMQ();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f60658n.mUb();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f60658n.gh();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f60658n.qie();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f60658n.az();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f60658n.ty();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f60658n.HI();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f60658n.ck();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f60658n.Ik();
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f60658n.o(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j2) {
        return this.f60658n.Z(str, j2);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i2) {
        return this.f60658n.XQ(str, i2);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i2) {
        return this.f60658n.S(i2);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j2) {
        return this.f60658n.WPU(str, j2);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f60658n.aYN();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f60658n.ViF();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f60658n.nY();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f60658n.g();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f60658n.te();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f60658n.iF();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f60658n.fD();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f60658n.E2();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f60658n.e();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f60658n.X();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f60658n.T(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f60658n.N();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f60658n.nHg();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f60658n.s7N();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f60658n.wTp();
    }

    public int hashCode() {
        return this.f60658n.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z2) {
        this.f60658n.v(z2);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i2) {
        this.f60658n.rV9(i2);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i2) {
        this.f60658n.bzg(i2);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z2) {
        this.f60658n.Xw(z2);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z2) {
        this.f60658n.jB(z2);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z2) {
        this.f60658n.U(z2);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j2) {
        this.f60658n.M7(j2);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j2) {
        this.f60658n.p5(j2);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z2) {
        this.f60658n.eF(z2);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i2) {
        this.f60658n.E(i2);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f60658n.M(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f60658n.FX(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z2) {
        this.f60658n.B(z2);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f60658n.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f60658n.D();
    }

    j(HttpURLConnection httpURLConnection, Timer timer, CN3 cn3) {
        super(httpURLConnection.getURL());
        this.f60658n = new w6(httpURLConnection, timer, cn3);
    }
}
