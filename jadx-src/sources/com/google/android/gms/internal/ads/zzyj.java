package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzyj implements zzyc {
    private final zzyc zza;
    private final long zzb;

    public zzyj(zzyc zzycVar, long j2) {
        this.zza = zzycVar;
        this.zzb = j2;
    }

    public final zzyc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i2) {
        int iZzd = this.zza.zzd(zzlhVar, zzihVar, i2);
        if (iZzd != -4) {
            return iZzd;
        }
        zzihVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zze(long j2) {
        return this.zza.zze(j2 - this.zzb);
    }
}
