package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcok implements zzfgy {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    final zzikp zzg;
    private final zzcnp zzh;

    @Override // com.google.android.gms.internal.ads.zzfgy
    public final zzerx zza() {
        return (zzerx) this.zzg.zzb();
    }

    zzcok(zzcnp zzcnpVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcnpVar;
        zzikg zzikgVarZza = zzikh.zza(context);
        this.zza = zzikgVarZza;
        zzikg zzikgVarZza2 = zzikh.zza(zzrVar);
        this.zzb = zzikgVarZza2;
        zzikg zzikgVarZza3 = zzikh.zza(str);
        this.zzc = zzikgVarZza3;
        zzikp zzikpVar = zzcnpVar.zzl;
        zzikp zzikpVarZza = zzikf.zza(zzerq.zza(zzikpVar));
        this.zzd = zzikpVarZza;
        zzikp zzikpVarZza2 = zzikf.zza(zzfhw.zza(zzcnpVar.zzbw));
        this.zze = zzikpVarZza2;
        zzikp zzikpVarZza3 = zzikf.zza(zzfgw.zza(zzikgVarZza, zzcnpVar.zza, zzcnpVar.zzab, zzikpVarZza, zzikpVarZza2, zzfjm.zza()));
        this.zzf = zzikpVarZza3;
        this.zzg = zzikf.zza(zzery.zza(zzikgVarZza, zzikgVarZza2, zzikgVarZza3, zzikpVarZza3, zzikpVarZza, zzikpVarZza2, zzcnpVar.zzi, zzcnpVar.zzae, zzikpVar));
    }
}
