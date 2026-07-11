package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzem;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzei extends zzcv {
    private final zzem zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzem) zza();
    }

    public static zzei zza(zzem.zza zzaVar, zzaaf zzaafVar, Integer num) throws GeneralSecurityException {
        zzaae zzaaeVarZzb;
        zzem.zza zzaVar2 = zzem.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzaVar) + " the value of idRequirement must be non-null");
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzaafVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzaafVar.zza());
        }
        zzem zzemVarZza = zzem.zza(zzaVar);
        if (zzemVarZza.zzb() == zzaVar2) {
            zzaaeVarZzb = zzpd.zza;
        } else if (zzemVarZza.zzb() == zzem.zza.zzb) {
            zzaaeVarZzb = zzpd.zza(num.intValue());
        } else {
            if (zzemVarZza.zzb() != zzem.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zzemVarZza.zzb()));
            }
            zzaaeVarZzb = zzpd.zzb(num.intValue());
        }
        return new zzei(zzemVarZza, zzaafVar, zzaaeVarZzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    /* JADX INFO: renamed from: zzc */
    public final /* synthetic */ zzcx zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    public final zzaae zzd() {
        return this.zzc;
    }

    public final zzaaf zze() {
        return this.zzb;
    }

    private zzei(zzem zzemVar, zzaaf zzaafVar, zzaae zzaaeVar, Integer num) {
        this.zza = zzemVar;
        this.zzb = zzaafVar;
        this.zzc = zzaaeVar;
        this.zzd = num;
    }
}
