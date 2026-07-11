package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzgcj implements zzgcd {
    private final int zza;
    private final byte[] zzb;

    zzgcj(int i2, byte[] bArr) {
        this.zza = i2;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
