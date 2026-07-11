package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgta extends zzgvz implements Serializable {
    final zzgqt zza;
    final zzgvz zzb;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgta) {
            zzgta zzgtaVar = (zzgta) obj;
            if (this.zza.equals(zzgtaVar.zza) && this.zzb.equals(zzgtaVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgvz, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgqt zzgqtVar = this.zza;
        return this.zzb.compare(zzgqtVar.apply(obj), zzgqtVar.apply(obj2));
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        int length = string.length();
        String string2 = this.zza.toString();
        StringBuilder sb = new StringBuilder(length + 12 + string2.length() + 1);
        sb.append(string);
        sb.append(".onResultOf(");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }

    zzgta(zzgqt zzgqtVar, zzgvz zzgvzVar) {
        this.zza = zzgqtVar;
        this.zzb = zzgvzVar;
    }
}
