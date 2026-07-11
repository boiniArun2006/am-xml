package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhat implements zzhbl {
    private final InputStream zza;

    private zzhat(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzhbl zza(byte[] bArr) {
        return new zzhat(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final zzhql zzb() throws IOException {
        try {
            return zzhql.zzg(this.zza, zzibb.zza());
        } finally {
            this.zza.close();
        }
    }
}
