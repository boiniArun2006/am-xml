package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcnw implements zzcvb {
    private final zzcnp zza;
    private zzfgn zzb;
    private zzffr zzc;
    private zzdhf zzd;
    private zzdao zze;
    private zzepw zzf;
    private zzcvx zzg;
    private zzeoa zzh;
    private zzctu zzi;
    private zzdml zzj;

    /* synthetic */ zzcnw(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb
    public final /* synthetic */ zzcvb zzb(@Nullable zzffr zzffrVar) {
        this.zzc = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb
    public final /* synthetic */ zzcvb zzc(@Nullable zzfgn zzfgnVar) {
        this.zzb = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzi(@Nullable zzffr zzffrVar) {
        this.zzc = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzj(@Nullable zzfgn zzfgnVar) {
        this.zzb = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb, com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza */
    public final zzcvc zzh() {
        zziko.zzc(this.zzd, zzdhf.class);
        zziko.zzc(this.zze, zzdao.class);
        zziko.zzc(this.zzf, zzepw.class);
        zziko.zzc(this.zzg, zzcvx.class);
        if (this.zzh == null) {
            this.zzh = zzeoc.zza();
        }
        zziko.zzc(this.zzi, zzctu.class);
        zziko.zzc(this.zzj, zzdml.class);
        return new zzcnx(this.zza, this.zzi, this.zzj, new zzcxl(), new zzfkq(), new zzczm(), new zzdyo(), this.zzd, this.zze, this.zzh, this.zzf, this.zzg, null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcvb
    public final /* bridge */ /* synthetic */ zzcvb zzd(zzdml zzdmlVar) {
        this.zzj = zzdmlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb
    public final /* bridge */ /* synthetic */ zzcvb zze(zzctu zzctuVar) {
        this.zzi = zzctuVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb
    public final /* bridge */ /* synthetic */ zzcvb zzf(zzeoa zzeoaVar) {
        this.zzh = zzeoaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb
    public final /* bridge */ /* synthetic */ zzcvb zzg(zzcvx zzcvxVar) {
        this.zzg = zzcvxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb
    public final /* bridge */ /* synthetic */ zzcvb zzk(zzepw zzepwVar) {
        this.zzf = zzepwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb
    public final /* bridge */ /* synthetic */ zzcvb zzl(zzdao zzdaoVar) {
        this.zze = zzdaoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvb
    public final /* bridge */ /* synthetic */ zzcvb zzm(zzdhf zzdhfVar) {
        this.zzd = zzdhfVar;
        return this;
    }
}
