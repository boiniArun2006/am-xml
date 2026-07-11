package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzft implements zzao {
    public final int zza;

    public zzft(int i2) {
        this.zza = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzft) && this.zza == ((zzft) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 19);
        sb.append("Mp4AlternateGroup: ");
        sb.append(i2);
        return sb.toString();
    }
}
