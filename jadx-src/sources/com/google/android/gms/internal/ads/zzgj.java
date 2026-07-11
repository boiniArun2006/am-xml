package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgj {
    public final zzguf zza;
    public final zzgc zzb;

    @Nullable
    public final zzge zzc;

    @Nullable
    public final zzgi zzd;

    public zzgj(zzga zzgaVar, @Nullable List list, zzgc zzgcVar, @Nullable zzge zzgeVar, @Nullable zzgi zzgiVar) {
        zzguf zzgufVarZzi;
        if (list != null) {
            zzgufVarZzi = zzguf.zzq(list);
        } else {
            zzgufVarZzi = zzguf.zzi();
        }
        this.zza = zzgufVarZzi;
        this.zzb = zzgcVar;
        this.zzc = zzgeVar;
        this.zzd = zzgiVar;
    }
}
