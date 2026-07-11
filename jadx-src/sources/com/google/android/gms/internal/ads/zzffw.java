package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzffw implements zzfgj {
    private final zzfkz zza;
    private final Executor zzb;
    private final zzgzl zzc = new zzfft(this);

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.Xo zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zza(zzfgkVar, zzfgiVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }

    public final com.google.common.util.concurrent.Xo zza(zzfgk zzfgkVar, zzfgi zzfgiVar, final zzdam zzdamVar) {
        zzfkz zzfkzVar = this.zza;
        Executor executor = this.zzb;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzj(zzgzg.zzw(new zzfgf(zzfkzVar, zzdamVar, executor).zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzffu
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzb(zzdamVar, (zzfgd) obj);
            }
        }, executor), Exception.class, new zzffs(this), executor);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzb(zzdam zzdamVar, zzfgd zzfgdVar) {
        zzfkz zzfkzVar = this.zza;
        zzflj zzfljVar = zzfgdVar.zzb;
        zzbzu zzbzuVar = zzfgdVar.zza;
        zzfli zzfliVarZza = zzfkzVar.zza(zzfljVar);
        if (zzfliVarZza != null && zzbzuVar != null) {
            zzgzo.zzr(zzdamVar.zza().zzf(zzbzuVar), this.zzc, this.zzb);
        }
        return zzgzo.zza(new zzffv(zzfljVar, zzbzuVar, zzfliVarZza));
    }

    public zzffw(zzfkz zzfkzVar, Executor executor) {
        this.zza = zzfkzVar;
        this.zzb = executor;
    }
}
