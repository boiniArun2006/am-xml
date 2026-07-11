package com.fyber.inneractive.sdk.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56519a;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f56519a <= 0) {
            return -1;
        }
        int i2 = super.read();
        if (i2 >= 0) {
            this.f56519a--;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long jSkip = super.skip(Math.min(j2, this.f56519a));
        if (jSkip >= 0) {
            this.f56519a = (int) (((long) this.f56519a) - jSkip);
        }
        return jSkip;
    }

    public a(InputStream inputStream, int i2) {
        super(inputStream);
        this.f56519a = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f56519a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i5 = this.f56519a;
        if (i5 <= 0) {
            return -1;
        }
        int i7 = super.read(bArr, i2, Math.min(i3, i5));
        if (i7 >= 0) {
            this.f56519a -= i7;
        }
        return i7;
    }
}
