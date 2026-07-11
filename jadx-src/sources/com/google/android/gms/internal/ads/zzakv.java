package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzakv {
    public final zzalc zza;
    public final zzalf zzb;
    public final zzagh zzc;

    @Nullable
    public final zzagi zzd;
    public int zze;

    @Nullable
    public zzv zzf;

    public zzakv(zzalc zzalcVar, zzalf zzalfVar, zzagh zzaghVar) {
        zzagi zzagiVar;
        this.zza = zzalcVar;
        this.zzb = zzalfVar;
        this.zzc = zzaghVar;
        if ("audio/true-hd".equals(zzalcVar.zzg.zzo)) {
            zzagiVar = new zzagi();
        } else {
            zzagiVar = null;
        }
        this.zzd = zzagiVar;
    }
}
