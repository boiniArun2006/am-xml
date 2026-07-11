package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaig extends zzain {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzain[] zze;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaig.class == obj.getClass()) {
            zzaig zzaigVar = (zzaig) obj;
            if (this.zzb == zzaigVar.zzb && this.zzc == zzaigVar.zzc && Objects.equals(this.zza, zzaigVar.zza) && Arrays.equals(this.zzd, zzaigVar.zzd) && Arrays.equals(this.zze, zzaigVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public zzaig(String str, boolean z2, boolean z3, String[] strArr, zzain[] zzainVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = strArr;
        this.zze = zzainVarArr;
    }

    public final int hashCode() {
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + this.zza.hashCode();
    }
}
