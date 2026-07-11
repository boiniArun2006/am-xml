package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhlo {
    private zzhlw zza = null;
    private zzhyg zzb = null;
    private Integer zzc = null;

    private zzhlo() {
    }

    public final zzhlo zza(zzhlw zzhlwVar) {
        this.zza = zzhlwVar;
        return this;
    }

    public final zzhlo zzb(zzhyg zzhygVar) throws GeneralSecurityException {
        this.zzb = zzhygVar;
        return this;
    }

    public final zzhlo zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    /* synthetic */ zzhlo(byte[] bArr) {
    }

    public final zzhlp zzd() throws GeneralSecurityException {
        zzhyg zzhygVar;
        zzhye zzhyeVarZza;
        zzhlw zzhlwVar = this.zza;
        if (zzhlwVar == null || (zzhygVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhlwVar.zzc() != zzhygVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhlwVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhlv.zzd) {
            zzhyeVarZza = zzhkh.zza;
        } else if (this.zza.zzf() == zzhlv.zzc || this.zza.zzf() == zzhlv.zzb) {
            zzhyeVarZza = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhlv.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzhyeVarZza = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhlp(this.zza, this.zzb, zzhyeVarZza, this.zzc, null);
    }
}
