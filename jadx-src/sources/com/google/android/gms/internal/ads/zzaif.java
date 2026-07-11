package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaif extends zzain {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzain[] zzg;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaif.class == obj.getClass()) {
            zzaif zzaifVar = (zzaif) obj;
            if (this.zzb == zzaifVar.zzb && this.zzc == zzaifVar.zzc && this.zzd == zzaifVar.zzd && this.zze == zzaifVar.zze && Objects.equals(this.zza, zzaifVar.zza) && Arrays.equals(this.zzg, zzaifVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public zzaif(String str, int i2, int i3, long j2, long j3, zzain[] zzainVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j2;
        this.zze = j3;
        this.zzg = zzainVarArr;
    }

    public final int hashCode() {
        int i2 = this.zzb + 527;
        String str = this.zza;
        long j2 = this.zze;
        return (((((((i2 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j2)) * 31) + str.hashCode();
    }
}
