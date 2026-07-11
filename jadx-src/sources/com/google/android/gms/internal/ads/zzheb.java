package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzheb extends zzhch {
    private final zzhea zza;

    private zzheb(zzhea zzheaVar) {
        this.zza = zzheaVar;
    }

    public static zzheb zzb(zzhea zzheaVar) {
        return new zzheb(zzheaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza != zzhea.zzc;
    }

    public final zzhea zzc() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzheb) && ((zzheb) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzheb.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 39);
        sb.append("ChaCha20Poly1305 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
