package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgcv implements zzgda {
    private final byte[] zza;

    public zzgcv(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return zzgxf.zza(inputStream);
        } catch (IOException e2) {
            throw new zzgcw("Cannot read bytes.", e2);
        }
    }
}
