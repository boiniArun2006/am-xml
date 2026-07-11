package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcof implements zzdzr {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    private final Context zze;
    private final zzbph zzf;
    private final zzcnp zzg;
    private final zzcof zzh = this;

    final zzdzm zza() {
        return zzdzn.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdzr
    public final zzdzj zzc() {
        return new zzcoc(this.zzg, this.zzh, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdzr
    public final zzdzo zzb() {
        return (zzdzo) this.zzd.zzb();
    }

    zzcof(zzcnp zzcnpVar, Context context, zzbph zzbphVar) {
        this.zzg = zzcnpVar;
        this.zze = context;
        this.zzf = zzbphVar;
        zzikg zzikgVarZza = zzikh.zza(this);
        this.zza = zzikgVarZza;
        zzikg zzikgVarZza2 = zzikh.zza(zzbphVar);
        this.zzb = zzikgVarZza2;
        zzdzn zzdznVarZzc = zzdzn.zzc(zzikgVarZza2);
        this.zzc = zzdznVarZzc;
        this.zzd = zzikf.zza(zzdzp.zza(zzikgVarZza, zzdznVarZzc));
    }
}
