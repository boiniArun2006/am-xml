package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzxn implements zzyc {
    final /* synthetic */ zzxq zza;
    private final int zzb;

    final /* synthetic */ int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean zzb() {
        return this.zza.zzp(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzc() throws IOException {
        this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i2) {
        return this.zza.zzs(this.zzb, zzlhVar, zzihVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zze(long j2) {
        return this.zza.zzt(this.zzb, j2);
    }

    public zzxn(zzxq zzxqVar, int i2) {
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
        this.zzb = i2;
    }
}
