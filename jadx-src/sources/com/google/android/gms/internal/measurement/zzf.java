package com.google.android.gms.internal.measurement;

import aT.dE.JLZo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzf {
    final zzaw zza;
    final zzg zzb;
    final zzg zzc;
    final zzj zzd;

    public final zzao zza(zzg zzgVar, zzje... zzjeVarArr) {
        zzao zzaoVarZzb = zzao.zzf;
        for (zzje zzjeVar : zzjeVarArr) {
            zzaoVarZzb = zzi.zzb(zzjeVar);
            zzh.zzl(this.zzc);
            if ((zzaoVarZzb instanceof zzap) || (zzaoVarZzb instanceof zzan)) {
                zzaoVarZzb = this.zza.zzb(zzgVar, zzaoVarZzb);
            }
        }
        return zzaoVarZzb;
    }

    public zzf() {
        zzaw zzawVar = new zzaw();
        this.zza = zzawVar;
        zzg zzgVar = new zzg(null, zzawVar);
        this.zzc = zzgVar;
        this.zzb = zzgVar.zzc();
        zzj zzjVar = new zzj();
        this.zzd = zzjVar;
        zzgVar.zze(JLZo.ntQJPlSumYEW, new zzw(zzjVar));
        zzjVar.zza("internal.platform", zze.zza);
        zzgVar.zze("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }
}
