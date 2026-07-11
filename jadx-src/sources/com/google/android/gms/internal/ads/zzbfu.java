package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbfu extends PushbackInputStream {
    final /* synthetic */ zzbfx zza;

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zza.zzc.zzb();
        super.close();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbfu(zzbfx zzbfxVar, InputStream inputStream, int i2) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbfxVar);
        this.zza = zzbfxVar;
    }
}
