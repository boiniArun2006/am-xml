package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhno extends zzhnr {
    private final int zza;

    private zzhno(int i2) {
        this.zza = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }

    public static zzhno zzb(int i2) throws GeneralSecurityException {
        if (i2 == 16 || i2 == 32) {
            return new zzhno(i2);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i2 * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhno) && ((zzhno) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhno.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 34);
        sb.append("AesCmac PRF Parameters (");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }
}
