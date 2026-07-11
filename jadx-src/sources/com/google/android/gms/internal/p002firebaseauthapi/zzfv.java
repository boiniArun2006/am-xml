package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfz;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzfv extends zzcv {
    private final zzfz zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzfz) zza();
    }

    public static zzfv zza(zzfz zzfzVar, zzaaf zzaafVar, Integer num) throws GeneralSecurityException {
        zzaae zzaaeVarZzb;
        zzfz.zza zzaVarZzc = zzfzVar.zzc();
        zzfz.zza zzaVar = zzfz.zza.zzb;
        if (zzaVarZzc != zzaVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzfzVar.zzc()) + " the value of idRequirement must be non-null");
        }
        if (zzfzVar.zzc() == zzaVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzaafVar.zza() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zzaafVar.zza());
        }
        if (zzfzVar.zzc() == zzaVar) {
            zzaaeVarZzb = zzpd.zza;
        } else {
            if (zzfzVar.zzc() != zzfz.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zzfzVar.zzc()));
            }
            zzaaeVarZzb = zzpd.zzb(num.intValue());
        }
        return new zzfv(zzfzVar, zzaafVar, zzaaeVarZzb, num);
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

    private zzfv(zzfz zzfzVar, zzaaf zzaafVar, zzaae zzaaeVar, Integer num) {
        this.zza = zzfzVar;
        this.zzb = zzaafVar;
        this.zzc = zzaaeVar;
        this.zzd = num;
    }
}
