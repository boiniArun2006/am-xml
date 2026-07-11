package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzqy implements zzqc<zzqz, zzqz> {
    private static final zzqy zza = new zzqy();

    private zzqy() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzqz> zza() {
        return zzqz.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final /* synthetic */ zzqz zza(zzoa zzoaVar, zzoj zzojVar, zzqb<zzqz> zzqbVar) throws GeneralSecurityException {
        zzaae zzaaeVarZzc;
        zzod zzodVarZzc = zzoaVar.zzc();
        if (zzodVarZzc == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        zzpq zzpqVar = new zzpq();
        for (int i2 = 0; i2 < zzoaVar.zza(); i2++) {
            zzod zzodVarZza = zzoaVar.zza(i2);
            if (zzodVarZza.zzc().equals(zzbo.zza)) {
                zzqz zzqzVarZza = zzqbVar.zza(zzodVarZza);
                zzbm zzbmVarZzb = zzodVarZza.zzb();
                if (zzbmVarZzb instanceof zzrn) {
                    zzaaeVarZzc = ((zzrn) zzbmVarZzb).zze();
                } else {
                    if (!(zzbmVarZzb instanceof zzoe)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzbmVarZzb.getClass().getName() + " with parameters " + String.valueOf(zzbmVarZzb.zza()));
                    }
                    zzaaeVarZzc = ((zzoe) zzbmVarZzb).zzc();
                }
                zzpqVar.zza(zzaaeVarZzc, zzqzVarZza);
            }
        }
        return new zzrb(zzpqVar.zza(), zzqbVar.zza(zzodVarZzc));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzqz> zzb() {
        return zzqz.class;
    }

    static void zzc() throws GeneralSecurityException {
        zzoz.zza().zza(zza);
    }
}
