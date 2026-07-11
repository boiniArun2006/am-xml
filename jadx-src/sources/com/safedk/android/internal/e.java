package com.safedk.android.internal;

import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class e extends FileOutputStream implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f63029a = "SafeDKFileOutputStream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f63030b;

    public e(String str, String str2, FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(str2);
        g gVar = new g(str, str2, fileOutputStream);
        this.f63030b = gVar;
        gVar.a(this);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(int i2) throws IOException {
        this.f63030b.write(i2);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(byte[] b2) throws IOException {
        this.f63030b.write(b2);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(byte[] b2, int off, int len) throws IOException {
        this.f63030b.write(b2, off, len);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63030b.close();
    }

    @Override // com.safedk.android.internal.c
    public void a(String str, String str2, String str3) {
        Logger.d(f63029a, "onStreamClose ", this, " sdkPackageName: ", str, ", url: ", str2);
        CreativeInfoManager.b(str, str2, str3);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f63030b.flush();
    }
}
