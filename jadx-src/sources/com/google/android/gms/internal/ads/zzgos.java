package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgos extends zzgpu {
    private String zza;
    private String zzb;

    zzgos() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final zzgpu zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final zzgpu zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final zzgpv zzc() {
        return new zzgot(this.zza, this.zzb, null);
    }
}
