package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzes {
    public static final zzes zza = new zzes(-1, -1);
    private final int zzb;
    private final int zzc;

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzes) {
            zzes zzesVar = (zzes) obj;
            if (this.zzb == zzesVar.zzb && this.zzc == zzesVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        return ((i2 >>> 16) | (i2 << 16)) ^ this.zzc;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    static {
        new zzes(0, 0);
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public final String toString() {
        int i2 = this.zzb;
        int length = String.valueOf(i2).length();
        int i3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i3).length());
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        return sb.toString();
    }

    public zzes(int i2, int i3) {
        boolean z2 = false;
        if ((i2 == -1 || i2 >= 0) && (i3 == -1 || i3 >= 0)) {
            z2 = true;
        }
        zzgrc.zza(z2);
        this.zzb = i2;
        this.zzc = i3;
    }
}
