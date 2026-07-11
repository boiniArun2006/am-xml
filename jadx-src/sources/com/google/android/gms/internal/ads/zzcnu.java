package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcnu implements zzfdv {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    private final zzcnp zzg;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final zzfez zza() {
        return (zzfez) this.zzf.zzb();
    }

    zzcnu(zzcnp zzcnpVar, Context context, String str) {
        this.zzg = zzcnpVar;
        zzikg zzikgVarZza = zzikh.zza(context);
        this.zza = zzikgVarZza;
        zzikg zzikgVarZza2 = zzikh.zza(str);
        this.zzb = zzikgVarZza2;
        zzikp zzikpVar = zzcnpVar.zzbw;
        zzfgl zzfglVarZzc = zzfgl.zzc(zzikgVarZza, zzikpVar, zzcnpVar.zzbx);
        this.zzc = zzfglVarZzc;
        zzikp zzikpVarZza = zzikf.zza(zzfes.zza(zzikpVar));
        this.zzd = zzikpVarZza;
        zzikp zzikpVar2 = zzcnpVar.zza;
        zzikp zzikpVar3 = zzcnpVar.zzab;
        zzfjm zzfjmVarZza = zzfjm.zza();
        zzikp zzikpVar4 = zzcnpVar.zzi;
        zzikp zzikpVarZza2 = zzikf.zza(zzfeu.zza(zzikgVarZza, zzikpVar2, zzikpVar3, zzfglVarZzc, zzikpVarZza, zzfjmVarZza, zzikpVar4));
        this.zze = zzikpVarZza2;
        this.zzf = zzikf.zza(zzffa.zza(zzikpVar3, zzikgVarZza, zzikgVarZza2, zzikpVarZza2, zzikpVarZza, zzikpVar4, zzcnpVar.zzl));
    }
}
