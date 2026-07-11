package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcnz implements zzffi {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzcnp zzj;

    @Override // com.google.android.gms.internal.ads.zzffi
    public final zzequ zza() {
        zzfff zzfffVar = (zzfff) this.zzf.zzb();
        zzerp zzerpVar = (zzerp) this.zzc.zzb();
        zzcnp zzcnpVar = this.zzj;
        zzikp zzikpVar = zzcnpVar.zzl;
        return new zzequ(this.zzg, this.zzh, this.zzi, zzfffVar, zzerpVar, zzcna.zzd(zzcnpVar.zzI()), (zzdxz) zzikpVar.zzb());
    }

    zzcnz(zzcnp zzcnpVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcnpVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzikg zzikgVarZza = zzikh.zza(context);
        this.zza = zzikgVarZza;
        zzikg zzikgVarZza2 = zzikh.zza(zzrVar);
        this.zzb = zzikgVarZza2;
        zzikp zzikpVarZza = zzikf.zza(zzerq.zza(zzcnpVar.zzl));
        this.zzc = zzikpVarZza;
        zzikp zzikpVarZza2 = zzikf.zza(zzerv.zza());
        this.zzd = zzikpVarZza2;
        zzikp zzikpVarZza3 = zzikf.zza(zzdgn.zza());
        this.zze = zzikpVarZza3;
        this.zzf = zzikf.zza(zzffg.zza(zzikgVarZza, zzcnpVar.zza, zzikgVarZza2, zzcnpVar.zzab, zzikpVarZza, zzikpVarZza2, zzfjm.zza(), zzikpVarZza3));
    }
}
