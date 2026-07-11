package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaiq extends zzain {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaiq.class == obj.getClass()) {
            zzaiq zzaiqVar = (zzaiq) obj;
            if (this.zza == zzaiqVar.zza && this.zzb == zzaiqVar.zzb && this.zzc == zzaiqVar.zzc && Arrays.equals(this.zzd, zzaiqVar.zzd) && Arrays.equals(this.zze, zzaiqVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public zzaiq(int i2, int i3, int i5, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i5;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final int hashCode() {
        return ((((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }
}
