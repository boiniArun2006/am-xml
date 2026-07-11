package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgxx implements Serializable {
    private static final zzgxx zza = new zzgxx(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgxx(int[] iArr, int i2, int i3) {
        this.zzb = iArr;
        this.zzc = i3;
    }

    public static zzgxx zza() {
        return zza;
    }

    public static zzgxx zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgxx(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxx)) {
            return false;
        }
        zzgxx zzgxxVar = (zzgxx) obj;
        int i2 = this.zzc;
        if (i2 != zzgxxVar.zzc) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (zzd(i3) != zzgxxVar.zzd(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zzb[i2]);
        }
        return iHashCode;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final String toString() {
        int i2 = this.zzc;
        if (i2 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i2 * 5);
        sb.append('[');
        int[] iArr = this.zzb;
        sb.append(iArr[0]);
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(", ");
            sb.append(iArr[i3]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zzd(int i2) {
        zzgrc.zzm(i2, this.zzc, "index");
        return this.zzb[i2];
    }
}
