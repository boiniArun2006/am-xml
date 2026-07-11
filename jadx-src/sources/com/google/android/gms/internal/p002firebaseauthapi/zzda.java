package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzda implements zzqc<zzbe, zzbe> {
    private static final zzda zza = new zzda();
    private static final zzpr<zzoe, zzbe> zzb = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcz
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzhz.zza((zzoe) zzbmVar);
        }
    }, zzoe.class, zzbe.class);

    zzda() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzbe> zza() {
        return zzbe.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final /* synthetic */ zzbe zza(zzoa zzoaVar, zzoj zzojVar, zzqb<zzbe> zzqbVar) throws GeneralSecurityException {
        zzon zzonVar;
        zzon zzonVarZza;
        zzaae zzaaeVarZzc;
        zzpq zzpqVar = new zzpq();
        for (int i2 = 0; i2 < zzoaVar.zza(); i2++) {
            zzod zzodVarZza = zzoaVar.zza(i2);
            if (zzodVarZza.zzc().equals(zzbo.zza)) {
                zzbm zzbmVarZzb = zzodVarZza.zzb();
                if (zzbmVarZzb instanceof zzcv) {
                    zzaaeVarZzc = ((zzcv) zzbmVarZzb).zzd();
                } else {
                    if (!(zzbmVarZzb instanceof zzoe)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzbmVarZzb.getClass().getName() + " with parameters " + String.valueOf(zzbmVarZzb.zza()));
                    }
                    zzaaeVarZzc = ((zzoe) zzbmVarZzb).zzc();
                }
                zzpqVar.zza(zzaaeVarZzc, new zzdc(zzqbVar.zza(zzodVarZza), zzodVarZza.zza()));
            }
        }
        if (zzojVar.zza()) {
            zzonVar = zzoq.zza;
            zzonVarZza = zzonVar;
        } else {
            zzoo zzooVarZza = zzov.zzb().zza();
            zzon zzonVarZza2 = zzooVarZza.zza(zzoaVar, zzojVar, "aead", "encrypt");
            zzonVarZza = zzooVarZza.zza(zzoaVar, zzojVar, "aead", "decrypt");
            zzonVar = zzonVarZza2;
        }
        return new zzdb(new zzdc(zzqbVar.zza(zzoaVar.zzc()), zzoaVar.zzc().zza()), zzpqVar.zza(), zzonVar, zzonVarZza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzbe> zzb() {
        return zzbe.class;
    }

    public static void zzc() throws GeneralSecurityException {
        zzoz.zza().zza(zza);
        zzoz.zza().zza(zzb);
    }

    public static void zza(zzpx zzpxVar) throws GeneralSecurityException {
        zzpxVar.zza(zza);
    }
}
