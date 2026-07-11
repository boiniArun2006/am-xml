package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcos implements zzdud {
    private final zzcnp zza;
    private zzfgn zzb;
    private zzffr zzc;
    private zzdhf zzd;
    private zzdao zze;

    /* synthetic */ zzcos(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    public final /* synthetic */ zzdud zzb(@Nullable zzffr zzffrVar) {
        this.zzc = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    public final /* synthetic */ zzdud zzc(@Nullable zzfgn zzfgnVar) {
        this.zzb = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzi(@Nullable zzffr zzffrVar) {
        this.zzc = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzj(@Nullable zzfgn zzfgnVar) {
        this.zzb = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud, com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza */
    public final zzdue zzh() {
        zziko.zzc(this.zzd, zzdhf.class);
        zziko.zzc(this.zze, zzdao.class);
        return new zzcot(this.zza, new zzcxl(), new zzfkq(), new zzczm(), new zzdyo(), this.zzd, this.zze, zzeoc.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    public final /* bridge */ /* synthetic */ zzdud zzd(zzdao zzdaoVar) {
        this.zze = zzdaoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    public final /* bridge */ /* synthetic */ zzdud zze(zzdhf zzdhfVar) {
        this.zzd = zzdhfVar;
        return this;
    }
}
