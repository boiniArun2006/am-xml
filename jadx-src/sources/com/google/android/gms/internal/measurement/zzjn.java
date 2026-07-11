package com.google.android.gms.internal.measurement;

import android.content.Context;
import t1.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzjn extends zzkg {
    private final Context zza;
    private final UGc zzb;

    public final boolean equals(Object obj) {
        UGc uGc;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza()) && ((uGc = this.zzb) != null ? uGc.equals(zzkgVar.zzb()) : zzkgVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    final Context zza() {
        return this.zza;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        UGc uGc = this.zzb;
        return (iHashCode * 1000003) ^ (uGc == null ? 0 : uGc.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb.append("FlagsContext{context=");
        sb.append(string);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    final UGc zzb() {
        return this.zzb;
    }

    zzjn(Context context, UGc uGc) {
        this.zza = context;
        this.zzb = uGc;
    }
}
