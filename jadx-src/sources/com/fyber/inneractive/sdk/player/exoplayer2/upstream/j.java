package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f56102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f56103b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f56107f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56105d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56106e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f56104c = new byte[1];

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f56104c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f56104c[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f56106e) {
            return;
        }
        this.f56102a.close();
        this.f56106e = true;
    }

    public j(h hVar, k kVar) {
        this.f56102a = hVar;
        this.f56103b = kVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        if (!this.f56106e) {
            if (!this.f56105d) {
                this.f56102a.a(this.f56103b);
                this.f56105d = true;
            }
            int i5 = this.f56102a.read(bArr, i2, i3);
            if (i5 == -1) {
                return -1;
            }
            this.f56107f += (long) i5;
            return i5;
        }
        throw new IllegalStateException();
    }
}
