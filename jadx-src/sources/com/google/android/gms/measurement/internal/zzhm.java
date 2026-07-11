package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhm implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzhs zza;

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i2, String str, List list, boolean z2, boolean z3) {
        int i3 = i2 - 1;
        zzgr zzgrVarZzi = i3 != 0 ? i3 != 1 ? i3 != 3 ? i3 != 4 ? this.zza.zzu.zzaV().zzi() : z2 ? this.zza.zzu.zzaV().zzf() : !z3 ? this.zza.zzu.zzaV().zzh() : this.zza.zzu.zzaV().zze() : this.zza.zzu.zzaV().zzk() : z2 ? this.zza.zzu.zzaV().zzc() : !z3 ? this.zza.zzu.zzaV().zzd() : this.zza.zzu.zzaV().zzb() : this.zza.zzu.zzaV().zzj();
        int size = list.size();
        if (size == 1) {
            zzgrVarZzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgrVarZzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgrVarZzi.zza(str);
        } else {
            zzgrVarZzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }

    zzhm(zzhs zzhsVar) {
        Objects.requireNonNull(zzhsVar);
        this.zza = zzhsVar;
    }
}
