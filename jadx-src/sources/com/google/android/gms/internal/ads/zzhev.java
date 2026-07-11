package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhev extends zzhch {
    private final zzheu zza;
    private final String zzb;
    private final zzhet zzc;
    private final zzhch zzd;

    /* synthetic */ zzhev(zzheu zzheuVar, String str, zzhet zzhetVar, zzhch zzhchVar, byte[] bArr) {
        this.zza = zzheuVar;
        this.zzb = str;
        this.zzc = zzhetVar;
        this.zzd = zzhchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza != zzheu.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzheu zzc() {
        return this.zza;
    }

    public final zzhch zzd() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhev)) {
            return false;
        }
        zzhev zzhevVar = (zzhev) obj;
        return zzhevVar.zzc.equals(this.zzc) && zzhevVar.zzd.equals(this.zzd) && zzhevVar.zzb.equals(this.zzb) && zzhevVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzhev.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzheu zzheuVar = this.zza;
        zzhch zzhchVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhchVar);
        String strValueOf3 = String.valueOf(zzheuVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(str);
        sb.append(", dekParsingStrategy: ");
        sb.append(strValueOf);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(strValueOf2);
        sb.append(", variant: ");
        sb.append(strValueOf3);
        sb.append(")");
        return sb.toString();
    }
}
