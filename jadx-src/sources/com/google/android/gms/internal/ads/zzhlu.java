package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhlu {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhlv zzc = zzhlv.zzd;

    private zzhlu() {
    }

    public final zzhlu zzc(zzhlv zzhlvVar) {
        this.zzc = zzhlvVar;
        return this;
    }

    /* synthetic */ zzhlu(byte[] bArr) {
    }

    public final zzhlu zza(int i2) throws GeneralSecurityException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i2 * 8)));
        }
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzhlu zzb(int i2) throws GeneralSecurityException {
        if (i2 >= 10 && i2 <= 16) {
            this.zzb = Integer.valueOf(i2);
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
        sb.append("Invalid tag size for AesCmacParameters: ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhlw zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhlw(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
