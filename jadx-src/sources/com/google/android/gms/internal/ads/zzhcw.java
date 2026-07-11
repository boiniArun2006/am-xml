package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhcw {
    private zzhdd zza = null;
    private zzhyg zzb = null;
    private Integer zzc = null;

    private zzhcw() {
    }

    public final zzhcw zza(zzhdd zzhddVar) {
        this.zza = zzhddVar;
        return this;
    }

    public final zzhcw zzb(zzhyg zzhygVar) {
        this.zzb = zzhygVar;
        return this;
    }

    public final zzhcw zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    /* synthetic */ zzhcw(byte[] bArr) {
    }

    public final zzhcx zzd() throws GeneralSecurityException {
        zzhyg zzhygVar;
        zzhye zzhyeVarZzb;
        zzhdd zzhddVar = this.zza;
        if (zzhddVar == null || (zzhygVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhddVar.zzc() != zzhygVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhddVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhdc.zzc) {
            zzhyeVarZzb = zzhkh.zza;
        } else if (this.zza.zze() == zzhdc.zzb) {
            zzhyeVarZzb = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhdc.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzhyeVarZzb = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhcx(this.zza, this.zzb, zzhyeVarZzb, this.zzc, null);
    }
}
