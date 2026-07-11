package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhsq extends zzhuu {
    private final zzhsp zza;

    private zzhsq(zzhsp zzhspVar) {
        this.zza = zzhspVar;
    }

    public static zzhsq zzb(zzhsp zzhspVar) {
        return new zzhsq(zzhspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza != zzhsp.zzd;
    }

    public final zzhsp zzc() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhsq) && ((zzhsq) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhsq.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 30);
        sb.append("Ed25519 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
