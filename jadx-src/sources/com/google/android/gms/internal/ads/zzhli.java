package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhli {
    private final Class zza;
    private final zzhye zzb;

    /* synthetic */ zzhli(Class cls, zzhye zzhyeVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzhyeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhli)) {
            return false;
        }
        zzhli zzhliVar = (zzhli) obj;
        return zzhliVar.zza.equals(this.zza) && zzhliVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzhye zzhyeVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zzhyeVar);
        StringBuilder sb = new StringBuilder(simpleName.length() + 21 + strValueOf.length());
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
