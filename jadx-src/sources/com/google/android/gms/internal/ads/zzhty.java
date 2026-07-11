package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhty extends zzhuu {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhtx zzd;
    private final zzhtw zze;

    /* synthetic */ zzhty(int i2, BigInteger bigInteger, zzhtx zzhtxVar, zzhtw zzhtwVar, byte[] bArr) {
        this.zzb = i2;
        this.zzc = bigInteger;
        this.zzd = zzhtxVar;
        this.zze = zzhtwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhtx.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhtx zze() {
        return this.zzd;
    }

    public final zzhtw zzf() {
        return this.zze;
    }

    public static zzhtv zzb() {
        return new zzhtv(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhty)) {
            return false;
        }
        zzhty zzhtyVar = (zzhty) obj;
        return zzhtyVar.zzb == this.zzb && Objects.equals(zzhtyVar.zzc, this.zzc) && zzhtyVar.zzd == this.zzd && zzhtyVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzhty.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhtw zzhtwVar = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhtwVar);
        String strValueOf3 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i2).length() + 13);
        sb.append("RSA SSA PKCS1 Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i2);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
