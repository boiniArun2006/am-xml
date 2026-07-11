package com.fyber.inneractive.sdk.player.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f54408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f54409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f54410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54412e;

    public k(FileInputStream fileInputStream) {
        Charset charset = l.f54413a;
        charset.getClass();
        if (!charset.equals(charset)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f54408a = fileInputStream;
        this.f54409b = charset;
        this.f54410c = new byte[8192];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a() {
        int i2;
        synchronized (this.f54408a) {
            try {
                byte[] bArr = this.f54410c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f54411d >= this.f54412e) {
                    int i3 = this.f54408a.read(bArr, 0, bArr.length);
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.f54411d = 0;
                    this.f54412e = i3;
                }
                for (int i5 = this.f54411d; i5 != this.f54412e; i5++) {
                    byte[] bArr2 = this.f54410c;
                    if (bArr2[i5] == 10) {
                        int i7 = this.f54411d;
                        if (i5 != i7) {
                            i2 = i5 - 1;
                            if (bArr2[i2] != 13) {
                                i2 = i5;
                            }
                        }
                        String str = new String(bArr2, i7, i2 - i7, this.f54409b.name());
                        this.f54411d = i5 + 1;
                        return str;
                    }
                }
                j jVar = new j(this, (this.f54412e - this.f54411d) + 80);
                while (true) {
                    byte[] bArr3 = this.f54410c;
                    int i8 = this.f54411d;
                    jVar.write(bArr3, i8, this.f54412e - i8);
                    this.f54412e = -1;
                    InputStream inputStream = this.f54408a;
                    byte[] bArr4 = this.f54410c;
                    int i9 = inputStream.read(bArr4, 0, bArr4.length);
                    if (i9 == -1) {
                        throw new EOFException();
                    }
                    this.f54411d = 0;
                    this.f54412e = i9;
                    for (int i10 = 0; i10 != this.f54412e; i10++) {
                        byte[] bArr5 = this.f54410c;
                        if (bArr5[i10] == 10) {
                            int i11 = this.f54411d;
                            if (i10 != i11) {
                                jVar.write(bArr5, i11, i10 - i11);
                            }
                            this.f54411d = i10 + 1;
                            return jVar.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f54408a) {
            try {
                if (this.f54410c != null) {
                    this.f54410c = null;
                    this.f54408a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
