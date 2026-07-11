package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzwk {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzwk(Object obj, int i2, int i3, long j2, int i5) {
        this.zza = obj;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j2;
        this.zze = i5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwk)) {
            return false;
        }
        zzwk zzwkVar = (zzwk) obj;
        return this.zza.equals(zzwkVar.zza) && this.zzb == zzwkVar.zzb && this.zzc == zzwkVar.zzc && this.zzd == zzwkVar.zzd && this.zze == zzwkVar.zze;
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzwk(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzwk zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzwk(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public zzwk(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public zzwk(Object obj, long j2, int i2) {
        this(obj, -1, -1, j2, i2);
    }
}
