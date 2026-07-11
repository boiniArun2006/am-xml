package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhun {
    private zzhuk zza = null;
    private BigInteger zzb = null;
    private Integer zzc = null;

    private zzhun() {
    }

    public final zzhun zza(zzhuk zzhukVar) {
        this.zza = zzhukVar;
        return this;
    }

    public final zzhun zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhun zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    /* synthetic */ zzhun(byte[] bArr) {
    }

    public final zzhuo zzd() throws GeneralSecurityException {
        zzhye zzhyeVarZza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iZzc = this.zza.zzc();
        if (iBitLength != iZzc) {
            StringBuilder sb = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iZzc).length());
            sb.append("Got modulus size ");
            sb.append(iBitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(iZzc);
            throw new GeneralSecurityException(sb.toString());
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhuj.zzd) {
            zzhyeVarZza = zzhkh.zza;
        } else if (this.zza.zze() == zzhuj.zzc || this.zza.zze() == zzhuj.zzb) {
            zzhyeVarZza = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhuj.zza) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzhyeVarZza = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhuo(this.zza, this.zzb, zzhyeVarZza, this.zzc, null);
    }
}
