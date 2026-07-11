package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcoq implements zzfil {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    final zzikp zzg;
    final zzikp zzh;
    private final zzcnp zzi;

    @Override // com.google.android.gms.internal.ads.zzfil
    public final zzfio zza() {
        return (zzfio) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final zzfii zzb() {
        return (zzfii) this.zzh.zzb();
    }

    zzcoq(zzcnp zzcnpVar, Context context, String str) {
        this.zzi = zzcnpVar;
        zzikg zzikgVarZza = zzikh.zza(context);
        this.zza = zzikgVarZza;
        zzikp zzikpVar = zzcnpVar.zzbw;
        zzfgm zzfgmVarZzc = zzfgm.zzc(zzikgVarZza, zzikpVar, zzcnpVar.zzbx);
        this.zzb = zzfgmVarZzc;
        zzikp zzikpVarZza = zzikf.zza(zzfhw.zza(zzikpVar));
        this.zzc = zzikpVarZza;
        zzikp zzikpVarZza2 = zzikf.zza(zzfji.zza());
        this.zzd = zzikpVarZza2;
        zzikp zzikpVarZza3 = zzikf.zza(zzfif.zza(zzikgVarZza, zzcnpVar.zza, zzcnpVar.zzab, zzfgmVarZzc, zzikpVarZza, zzfjm.zza(), zzikpVarZza2));
        this.zze = zzikpVarZza3;
        this.zzf = zzikf.zza(zzfip.zza(zzikpVarZza3, zzikpVarZza, zzikpVarZza2));
        zzikg zzikgVarZzc = zzikh.zzc(str);
        this.zzg = zzikgVarZzc;
        this.zzh = zzikf.zza(zzfij.zza(zzikgVarZzc, zzikpVarZza3, zzikgVarZza, zzikpVarZza, zzikpVarZza2, zzcnpVar.zzi, zzcnpVar.zzae, zzcnpVar.zzl));
    }
}
