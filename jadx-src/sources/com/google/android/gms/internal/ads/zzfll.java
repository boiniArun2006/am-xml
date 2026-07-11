package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfll implements zzflj {
    private final String zza;

    public zzfll(String str) {
        this.zza = str;
    }

    public final String toString() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzflj
    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzfll) {
            return this.zza.equals(((zzfll) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzflj
    public final int hashCode() {
        return this.zza.hashCode();
    }
}
