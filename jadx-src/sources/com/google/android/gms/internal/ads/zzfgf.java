package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfgf {
    private final zzfkz zza;
    private final zzdam zzb;
    private final Executor zzc;
    private zzfgd zzd;

    public zzfgf(zzfkz zzfkzVar, zzdam zzdamVar, Executor executor) {
        this.zza = zzfkzVar;
        this.zzb = zzdamVar;
        this.zzc = executor;
    }

    final /* synthetic */ zzfgd zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzd(zzfgd zzfgdVar) {
        this.zzd = zzfgdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzflj zzb() {
        zzfjk zzfjkVarZzb = this.zzb.zzb();
        return this.zza.zzd(zzfjkVarZzb.zzd, zzfjkVarZzb.zzg, zzfjkVarZzb.zzk);
    }

    public final com.google.common.util.concurrent.Xo zza() {
        com.google.common.util.concurrent.Xo xoZza;
        zzfgd zzfgdVar = this.zzd;
        if (zzfgdVar != null) {
            return zzgzo.zza(zzfgdVar);
        }
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            zzgzg zzgzgVarZzw = zzgzg.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzfgc zzfgcVar = new zzfgc(this);
            Executor executor = this.zzc;
            xoZza = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk(zzgzgVarZzw, zzfgcVar, executor), zzeff.class, new zzfgb(this), executor);
        } else {
            zzfgd zzfgdVar2 = new zzfgd(null, zzb(), null);
            this.zzd = zzfgdVar2;
            xoZza = zzgzo.zza(zzfgdVar2);
        }
        return zzgzo.zzk(xoZza, zzfge.zza, this.zzc);
    }
}
