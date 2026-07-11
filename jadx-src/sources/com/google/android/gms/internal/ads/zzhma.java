package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhma {
    private zzhmk zza = null;
    private zzhyg zzb = null;
    private Integer zzc = null;

    private zzhma() {
    }

    public final zzhma zza(zzhmk zzhmkVar) {
        this.zza = zzhmkVar;
        return this;
    }

    public final zzhma zzb(zzhyg zzhygVar) {
        this.zzb = zzhygVar;
        return this;
    }

    public final zzhma zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    /* synthetic */ zzhma(byte[] bArr) {
    }

    public final zzhmb zzd() throws GeneralSecurityException {
        zzhyg zzhygVar;
        zzhye zzhyeVarZza;
        zzhmk zzhmkVar = this.zza;
        if (zzhmkVar == null || (zzhygVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhmkVar.zzc() != zzhygVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhmkVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhmj.zzd) {
            zzhyeVarZza = zzhkh.zza;
        } else if (this.zza.zzf() == zzhmj.zzc || this.zza.zzf() == zzhmj.zzb) {
            zzhyeVarZza = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhmj.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzhyeVarZza = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhmb(this.zza, this.zzb, zzhyeVarZza, this.zzc, null);
    }
}
