package com.safedk.android.internal;

import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class g extends OutputStream implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63043a = "SafeDKOutputStream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OutputStream f63045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteArrayOutputStream f63047e = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f63048f = this;

    public g(String str, String str2, OutputStream outputStream) {
        this.f63044b = str;
        this.f63046d = str2;
        this.f63045c = outputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        this.f63045c.write(i2);
        if (i2 >= 0) {
            try {
                this.f63047e.write(i2);
            } catch (Throwable th) {
                try {
                    Logger.e(f63043a, th.getMessage());
                } catch (Throwable th2) {
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] b2) throws IOException {
        this.f63045c.write(b2);
        a(b2, 0, b2.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b2, int off, int len) throws IOException {
        this.f63045c.write(b2, off, len);
        a(b2, off, len);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63045c.close();
        String string = this.f63047e.toString();
        Logger.d(f63043a, "closing output stream");
        this.f63048f.a(this.f63044b, this.f63046d, string);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f63045c.flush();
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (i3 > 0) {
            try {
                this.f63047e.write(bArr, i2, i3);
            } catch (Throwable th) {
                try {
                    Logger.e(f63043a, th.getMessage());
                } catch (Throwable th2) {
                }
            }
        }
    }

    public void a(c cVar) {
        this.f63048f = cVar;
    }

    @Override // com.safedk.android.internal.c
    public void a(String str, String str2, String str3) {
        Logger.d(f63043a, "onStreamClose ", this, " sdkPackageName: ", str);
        CreativeInfoManager.c(str, str2, str3);
    }
}
