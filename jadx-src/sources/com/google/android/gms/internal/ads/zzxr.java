package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzxr extends zzvy {
    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i2, zzbe zzbeVar, long j2) {
        this.zzb.zzb(i2, zzbeVar, j2);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i2, zzbd zzbdVar, boolean z2) {
        this.zzb.zzd(i2, zzbdVar, z2);
        zzbdVar.zzf = true;
        return zzbdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzxr(zzxu zzxuVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzxuVar);
    }
}
