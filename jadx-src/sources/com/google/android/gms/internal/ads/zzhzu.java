package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhzu extends FilterInputStream {
    private int zza;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int i2 = super.read();
        if (i2 >= 0) {
            this.zza--;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i5 = this.zza;
        if (i5 <= 0) {
            return -1;
        }
        int i7 = super.read(bArr, i2, Math.min(i3, i5));
        if (i7 >= 0) {
            this.zza -= i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        int iSkip = (int) super.skip(Math.min(j2, this.zza));
        if (iSkip >= 0) {
            this.zza -= iSkip;
        }
        return iSkip;
    }

    zzhzu(InputStream inputStream, int i2) {
        super(inputStream);
        this.zza = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return Math.min(super.available(), this.zza);
    }
}
