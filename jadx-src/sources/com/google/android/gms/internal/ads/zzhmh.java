package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhmh {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhmi zzc = null;
    private zzhmj zzd = zzhmj.zzd;

    private zzhmh() {
    }

    public final zzhmh zzc(zzhmj zzhmjVar) {
        this.zzd = zzhmjVar;
        return this;
    }

    public final zzhmh zzd(zzhmi zzhmiVar) {
        this.zzc = zzhmiVar;
        return this;
    }

    /* synthetic */ zzhmh(byte[] bArr) {
    }

    public final zzhmk zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
        }
        Integer num2 = this.zzb;
        int iIntValue = num2.intValue();
        zzhmi zzhmiVar = this.zzc;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (zzhmiVar == zzhmi.zza) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (zzhmiVar == zzhmi.zzb) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (zzhmiVar == zzhmi.zzc) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (zzhmiVar == zzhmi.zzd) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (zzhmiVar != zzhmi.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new zzhmk(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
    }

    public final zzhmh zza(int i2) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzhmh zzb(int i2) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i2);
        return this;
    }
}
