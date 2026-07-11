package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzlo {
    public final zzwk zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlo.class == obj.getClass()) {
            zzlo zzloVar = (zzlo) obj;
            if (this.zzb == zzloVar.zzb && this.zzc == zzloVar.zzc && this.zzd == zzloVar.zzd && this.zze == zzloVar.zze && this.zzh == zzloVar.zzh && this.zzi == zzloVar.zzi && this.zzj == zzloVar.zzj && Objects.equals(this.zza, zzloVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j2 = this.zze;
        long j3 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j3)) * 31) + ((int) j2)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzlo zza(long j2) {
        return j2 == this.zzb ? this : new zzlo(this.zza, j2, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzlo zzb(long j2) {
        return j2 == this.zzc ? this : new zzlo(this.zza, this.zzb, j2, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    zzlo(zzwk zzwkVar, long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        boolean z9 = true;
        if (!z6 || z4) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzgrc.zza(z7);
        if (z5 && !z4) {
            z9 = false;
        }
        zzgrc.zza(z9);
        this.zza = zzwkVar;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z4;
        this.zzi = z5;
        this.zzj = z6;
    }
}
