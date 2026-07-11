package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfe;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzfc extends zzcv {
    private final zzfe zza;
    private final zzaae zzb;
    private final Integer zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzfe) zza();
    }

    public static zzfc zza(zzfe zzfeVar, Integer num) throws GeneralSecurityException {
        zzaae zzaaeVarZzb;
        if (zzfeVar.zzc() == zzfe.zzb.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzaaeVarZzb = zzpd.zza;
        } else {
            if (zzfeVar.zzc() != zzfe.zzb.zza) {
                throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(zzfeVar.zzc()));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzaaeVarZzb = zzpd.zzb(num.intValue());
        }
        return new zzfc(zzfeVar, zzaaeVarZzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    /* JADX INFO: renamed from: zzc */
    public final /* synthetic */ zzcx zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    public final zzaae zzd() {
        return this.zzb;
    }

    private zzfc(zzfe zzfeVar, zzaae zzaaeVar, Integer num) {
        this.zza = zzfeVar;
        this.zzb = zzaaeVar;
        this.zzc = num;
    }
}
