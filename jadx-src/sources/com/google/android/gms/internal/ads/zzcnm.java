package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcnm implements zzdmp {
    private final zzcnp zza;
    private zzfgn zzb;
    private zzffr zzc;
    private zzdhf zzd;
    private zzdao zze;
    private zzdml zzf;
    private zzctu zzg;

    /* synthetic */ zzcnm(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public final /* synthetic */ zzdmp zzb(@Nullable zzffr zzffrVar) {
        this.zzc = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public final /* synthetic */ zzdmp zzc(@Nullable zzfgn zzfgnVar) {
        this.zzb = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzi(@Nullable zzffr zzffrVar) {
        this.zzc = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzj(@Nullable zzfgn zzfgnVar) {
        this.zzb = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp, com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza */
    public final zzdmq zzh() {
        zziko.zzc(this.zzd, zzdhf.class);
        zziko.zzc(this.zze, zzdao.class);
        zziko.zzc(this.zzf, zzdml.class);
        zziko.zzc(this.zzg, zzctu.class);
        return new zzcnn(this.zza, this.zzg, this.zzf, new zzcxl(), new zzfkq(), new zzczm(), new zzdyo(), this.zzd, this.zze, zzeoc.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public final /* bridge */ /* synthetic */ zzdmp zzd(zzctu zzctuVar) {
        this.zzg = zzctuVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public final /* bridge */ /* synthetic */ zzdmp zze(zzdml zzdmlVar) {
        this.zzf = zzdmlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public final /* bridge */ /* synthetic */ zzdmp zzf(zzdao zzdaoVar) {
        this.zze = zzdaoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public final /* bridge */ /* synthetic */ zzdmp zzg(zzdhf zzdhfVar) {
        this.zzd = zzdhfVar;
        return this;
    }
}
