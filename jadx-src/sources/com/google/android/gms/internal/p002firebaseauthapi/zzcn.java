package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzcn {
    private static final zzno zza = zzb();

    public static /* synthetic */ zzbe zza(zzgb zzgbVar) {
        return zzij.zza() ? zzij.zza(zzgbVar) : zzaab.zza(zzgbVar);
    }

    private static zzno zzb() {
        try {
            zzpx zzpxVarZza = zzpv.zza();
            zzda.zza(zzpxVarZza);
            zzpxVarZza.zza(zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcq
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
                public final Object zza(zzbm zzbmVar) {
                    return zzze.zza((zzdd) zzbmVar);
                }
            }, zzdd.class, zzbe.class));
            zzpxVarZza.zza(zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcp
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
                public final Object zza(zzbm zzbmVar) {
                    return zzys.zza((zzds) zzbmVar);
                }
            }, zzds.class, zzbe.class));
            zzpxVarZza.zza(zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcs
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
                public final Object zza(zzbm zzbmVar) {
                    return zzis.zza((zzeb) zzbmVar);
                }
            }, zzeb.class, zzbe.class));
            zzpxVarZza.zza(zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcr
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
                public final Object zza(zzbm zzbmVar) {
                    return zzyn.zza((zzdl) zzbmVar);
                }
            }, zzdl.class, zzbe.class));
            zzpxVarZza.zza(zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcu
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
                public final Object zza(zzbm zzbmVar) {
                    return zzcn.zza((zzei) zzbmVar);
                }
            }, zzei.class, zzbe.class));
            zzpxVarZza.zza(zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzct
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
                public final Object zza(zzbm zzbmVar) {
                    return zzcn.zza((zzgb) zzbmVar);
                }
            }, zzgb.class, zzbe.class));
            zzpxVarZza.zza(zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcw
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
                public final Object zza(zzbm zzbmVar) {
                    return zzie.zza((zzfv) zzbmVar);
                }
            }, zzfv.class, zzbe.class));
            return zzno.zza(zzpxVarZza.zza());
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static /* synthetic */ zzbe zza(zzei zzeiVar) {
        if (zzhk.zzb()) {
            return zzhk.zza(zzeiVar);
        }
        return zzyw.zza(zzeiVar);
    }

    public static zzbf zza() throws GeneralSecurityException {
        if (!zzix.zzb()) {
            return zza;
        }
        throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
    }
}
