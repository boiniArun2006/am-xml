package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhsj {
    private zzhsg zza = null;
    private ECPoint zzb = null;
    private Integer zzc = null;

    private zzhsj() {
    }

    public final zzhsj zza(zzhsg zzhsgVar) {
        this.zza = zzhsgVar;
        return this;
    }

    public final zzhsj zzb(ECPoint eCPoint) {
        this.zzb = eCPoint;
        return this;
    }

    public final zzhsj zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    /* synthetic */ zzhsj(byte[] bArr) {
    }

    public final zzhsk zzd() throws GeneralSecurityException {
        zzhye zzhyeVarZza;
        zzhsg zzhsgVar = this.zza;
        if (zzhsgVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = this.zzb;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        zzhis.zza(eCPoint, zzhsgVar.zzd().zza().getCurve());
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhsf.zzd) {
            zzhyeVarZza = zzhkh.zza;
        } else if (this.zza.zzf() == zzhsf.zzc || this.zza.zzf() == zzhsf.zzb) {
            zzhyeVarZza = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhsf.zza) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.zza.zzf().toString()));
            }
            zzhyeVarZza = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhsk(this.zza, this.zzb, zzhyeVarZza, this.zzc, null);
    }
}
