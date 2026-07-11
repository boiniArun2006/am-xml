package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzaak {
    public final int zza;
    public final zzmo[] zzb;
    public final zzaac[] zzc;
    public final zzbn zzd;

    @Nullable
    public final Object zze;

    public final boolean zzb(@Nullable zzaak zzaakVar, int i2) {
        return zzaakVar != null && Objects.equals(this.zzb[i2], zzaakVar.zzb[i2]) && Objects.equals(this.zzc[i2], zzaakVar.zzc[i2]);
    }

    public final boolean zza(int i2) {
        return this.zzb[i2] != null;
    }

    public zzaak(zzmo[] zzmoVarArr, zzaac[] zzaacVarArr, zzbn zzbnVar, @Nullable Object obj) {
        boolean z2;
        int length = zzmoVarArr.length;
        if (length == zzaacVarArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        this.zzb = zzmoVarArr;
        this.zzc = (zzaac[]) zzaacVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }
}
