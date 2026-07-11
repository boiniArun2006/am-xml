package com.safedk.android.a;

import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61253a = f.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f61254b;

    public f(URLConnection uRLConnection) {
        this.f61254b = (HttpURLConnection) uRLConnection;
    }

    public void a(boolean z2) {
        this.f61254b.setUseCaches(z2);
    }

    public void a(String str) throws ProtocolException {
        this.f61254b.setRequestMethod(str);
    }

    public void a(String str, String str2) {
        this.f61254b.setRequestProperty(str, str2);
    }

    public void b(boolean z2) {
        this.f61254b.setDoOutput(z2);
    }

    public OutputStream a() throws IOException {
        return this.f61254b.getOutputStream();
    }

    public void c(boolean z2) {
        this.f61254b.setInstanceFollowRedirects(z2);
    }

    public int b() throws IOException {
        return this.f61254b.getResponseCode();
    }

    public URL c() {
        return this.f61254b.getURL();
    }

    public void a(int i2) {
        this.f61254b.setConnectTimeout(i2);
    }

    public void d() {
        this.f61254b.disconnect();
    }

    public InputStream e() throws IOException {
        return this.f61254b.getInputStream();
    }

    public void f() throws IOException {
        if (SafeDK.getInstance().t()) {
            Logger.e(f61253a, "SafeDK network activity in offline mode ");
            Logger.printStackTrace();
        }
        this.f61254b.connect();
    }

    public String b(String str) {
        return this.f61254b.getHeaderField(str);
    }

    public InputStream g() {
        return this.f61254b.getErrorStream();
    }

    public void d(boolean z2) {
        this.f61254b.setDoInput(z2);
    }

    public void b(int i2) {
        this.f61254b.setReadTimeout(i2);
    }
}
