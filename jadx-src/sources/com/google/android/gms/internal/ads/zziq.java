package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zziq implements zzaan {
    final /* synthetic */ zzis zza;

    @GuardedBy
    private final HashMap zzb;

    @GuardedBy
    private final zzpq zzc;

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized zzaal zza() {
        zzaal zzaalVarZza;
        zzis zzisVar = this.zza;
        zzaat zzaatVarZzk = zzisVar.zzk();
        HashMap map = this.zzb;
        zzaalVarZza = zzaatVarZzk.zza();
        zzpq zzpqVar = this.zzc;
        map.put(zzaalVarZza, zzpqVar);
        zzir zzirVar = (zzir) zzisVar.zzl().get(zzpqVar);
        if (zzirVar != null) {
            zzirVar.zza();
        }
        return zzaalVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzb(zzaal zzaalVar) {
        this.zza.zzk().zzb(zzaalVar);
        zze(zzaalVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzc(@Nullable zzaam zzaamVar) {
        this.zza.zzk().zzc(zzaamVar);
        while (zzaamVar != null) {
            zze(zzaamVar.zzd());
            zzaamVar = zzaamVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzd() {
        this.zza.zzk().zzd();
    }

    @GuardedBy
    private final void zze(zzaal zzaalVar) {
        zzpq zzpqVar = (zzpq) this.zzb.remove(zzaalVar);
        zzpqVar.getClass();
        zzir zzirVar = (zzir) this.zza.zzl().get(zzpqVar);
        if (zzirVar != null) {
            zzirVar.zzb();
        }
    }

    public zziq(zzis zzisVar, zzpq zzpqVar) {
        Objects.requireNonNull(zzisVar);
        this.zza = zzisVar;
        this.zzb = new HashMap();
        this.zzc = zzpqVar;
    }
}
