package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcnr implements zzctk {
    private final zzcnp zza;
    private zzfgn zzb;
    private zzffr zzc;
    private zzdhf zzd;
    private zzdao zze;

    /* synthetic */ zzcnr(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public final /* synthetic */ zzctk zzb(@Nullable zzffr zzffrVar) {
        this.zzc = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public final /* synthetic */ zzctk zzc(@Nullable zzfgn zzfgnVar) {
        this.zzb = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzi(@Nullable zzffr zzffrVar) {
        this.zzc = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzj(@Nullable zzfgn zzfgnVar) {
        this.zzb = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk, com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza */
    public final zzctl zzh() {
        zziko.zzc(this.zzd, zzdhf.class);
        zziko.zzc(this.zze, zzdao.class);
        return new zzcns(this.zza, new zzcxl(), new zzfkq(), new zzczm(), new zzdyo(), this.zzd, this.zze, zzeoc.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public final /* bridge */ /* synthetic */ zzctk zzd(zzdao zzdaoVar) {
        this.zze = zzdaoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public final /* bridge */ /* synthetic */ zzctk zze(zzdhf zzdhfVar) {
        this.zzd = zzdhfVar;
        return this;
    }
}
