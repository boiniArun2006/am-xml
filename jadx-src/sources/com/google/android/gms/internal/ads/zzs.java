package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzs {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return this.zza.equals(((zzs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean zza(int i2) {
        return this.zza.get(i2);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i2) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzgrc.zzm(i2, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i2);
    }
}
