package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@VisibleForTesting
final class zzass extends FilterInputStream {
    private final long zza;
    private long zzb;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2 = super.read();
        if (i2 != -1) {
            this.zzb++;
        }
        return i2;
    }

    final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i5 = super.read(bArr, i2, i3);
        if (i5 != -1) {
            this.zzb += (long) i5;
        }
        return i5;
    }

    zzass(InputStream inputStream, long j2) {
        super(inputStream);
        this.zza = j2;
    }
}
