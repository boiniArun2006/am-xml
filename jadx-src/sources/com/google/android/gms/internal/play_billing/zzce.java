package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class zzce implements Comparable, Serializable {
    final Comparable zza = "";

    zzce(Comparable comparable) {
    }

    public abstract int hashCode();

    abstract void zzc(StringBuilder sb);

    abstract void zzd(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof zzce) {
            try {
                if (compareTo((zzce) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public int compareTo(zzce zzceVar) {
        if (zzceVar != zzcd.zzb) {
            if (zzceVar == zzcb.zzb) {
                return -1;
            }
            Comparable comparable = zzceVar.zza;
            int i2 = zzdh.zzc;
            int iCompareTo = "".compareTo("");
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            return Boolean.compare(this instanceof zzcc, zzceVar instanceof zzcc);
        }
        return 1;
    }
}
