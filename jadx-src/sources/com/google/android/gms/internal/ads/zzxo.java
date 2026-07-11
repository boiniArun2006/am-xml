package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzxo {
    public final int zza;
    public final boolean zzb;

    public zzxo(int i2, boolean z2) {
        this.zza = i2;
        this.zzb = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxo.class == obj.getClass()) {
            zzxo zzxoVar = (zzxo) obj;
            if (this.zza == zzxoVar.zza && this.zzb == zzxoVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
