package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhsb {
    private zzhse zza = null;
    private zzhsc zzb = null;
    private zzhsd zzc = null;
    private zzhsf zzd = zzhsf.zzd;

    private zzhsb() {
    }

    public final zzhsb zza(zzhse zzhseVar) {
        this.zza = zzhseVar;
        return this;
    }

    public final zzhsb zzb(zzhsc zzhscVar) {
        this.zzb = zzhscVar;
        return this;
    }

    public final zzhsb zzc(zzhsd zzhsdVar) {
        this.zzc = zzhsdVar;
        return this;
    }

    public final zzhsb zzd(zzhsf zzhsfVar) {
        this.zzd = zzhsfVar;
        return this;
    }

    /* synthetic */ zzhsb(byte[] bArr) {
    }

    public final zzhsg zze() throws GeneralSecurityException {
        zzhse zzhseVar = this.zza;
        if (zzhseVar == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        zzhsc zzhscVar = this.zzb;
        if (zzhscVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        zzhsd zzhsdVar = this.zzc;
        if (zzhsdVar == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        zzhsf zzhsfVar = this.zzd;
        if (zzhsfVar == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (zzhscVar == zzhsc.zza && zzhsdVar != zzhsd.zza) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (zzhscVar == zzhsc.zzb && zzhsdVar != zzhsd.zzb && zzhsdVar != zzhsd.zzc) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (zzhscVar != zzhsc.zzc || zzhsdVar == zzhsd.zzc) {
            return new zzhsg(zzhseVar, zzhscVar, zzhsdVar, zzhsfVar, null);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }
}
