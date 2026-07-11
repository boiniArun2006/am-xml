package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzagg {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzagg(int i2, byte[] bArr, int i3, int i5) {
        this.zza = i2;
        this.zzb = bArr;
        this.zzc = i3;
        this.zzd = i5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagg.class == obj.getClass()) {
            zzagg zzaggVar = (zzagg) obj;
            if (this.zza == zzaggVar.zza && this.zzc == zzaggVar.zzc && this.zzd == zzaggVar.zzd && Arrays.equals(this.zzb, zzaggVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
