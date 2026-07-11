package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcoh implements zzdlt {
    private final zzcnp zza;
    private zzfgn zzb;
    private zzffr zzc;
    private zzdhf zzd;
    private zzdao zze;
    private zzepw zzf;

    /* synthetic */ zzcoh(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public final /* synthetic */ zzdlt zzb(@Nullable zzffr zzffrVar) {
        this.zzc = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public final /* synthetic */ zzdlt zzc(@Nullable zzfgn zzfgnVar) {
        this.zzb = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzi(@Nullable zzffr zzffrVar) {
        this.zzc = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzj(@Nullable zzfgn zzfgnVar) {
        this.zzb = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt, com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza */
    public final zzdlu zzh() {
        zziko.zzc(this.zzd, zzdhf.class);
        zziko.zzc(this.zze, zzdao.class);
        zziko.zzc(this.zzf, zzepw.class);
        return new zzcoi(this.zza, new zzcxl(), new zzfkq(), new zzczm(), new zzdyo(), this.zzd, this.zze, zzeoc.zza(), this.zzf, null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public final /* bridge */ /* synthetic */ zzdlt zzd(zzepw zzepwVar) {
        this.zzf = zzepwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public final /* bridge */ /* synthetic */ zzdlt zze(zzdao zzdaoVar) {
        this.zze = zzdaoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public final /* bridge */ /* synthetic */ zzdlt zzf(zzdhf zzdhfVar) {
        this.zzd = zzdhfVar;
        return this;
    }
}
