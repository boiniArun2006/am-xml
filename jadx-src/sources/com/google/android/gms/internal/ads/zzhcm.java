package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhcm {
    private zzhcv zza = null;
    private zzhyg zzb = null;
    private zzhyg zzc = null;
    private Integer zzd = null;

    private zzhcm() {
    }

    public final zzhcm zza(zzhcv zzhcvVar) {
        this.zza = zzhcvVar;
        return this;
    }

    public final zzhcm zzb(zzhyg zzhygVar) {
        this.zzb = zzhygVar;
        return this;
    }

    public final zzhcm zzc(zzhyg zzhygVar) {
        this.zzc = zzhygVar;
        return this;
    }

    public final zzhcm zzd(Integer num) {
        this.zzd = num;
        return this;
    }

    /* synthetic */ zzhcm(byte[] bArr) {
    }

    public final zzhcn zze() throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        zzhcv zzhcvVar = this.zza;
        if (zzhcvVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzhyg zzhygVar = this.zzb;
        if (zzhygVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzhcvVar.zzc() != zzhygVar.zzd()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzhcvVar.zzd() != this.zzc.zzd()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzhcu.zzc) {
            zzhyeVarZzb = zzhkh.zza;
        } else if (this.zza.zzg() == zzhcu.zzb) {
            zzhyeVarZzb = zzhkh.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzg() != zzhcu.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zzhyeVarZzb = zzhkh.zzb(this.zzd.intValue());
        }
        return new zzhcn(this.zza, this.zzb, this.zzc, zzhyeVarZzb, this.zzd, null);
    }
}
