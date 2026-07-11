package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzlc implements zzqc<zzbk, zzbk> {
    private static final zzlc zza = new zzlc();
    private static final zzpr<zzoe, zzbk> zzb = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlf
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzmo.zza((zzoe) zzbmVar);
        }
    }, zzoe.class, zzbk.class);

    zzlc() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzbk> zza() {
        return zzbk.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final /* synthetic */ zzbk zza(zzoa zzoaVar, zzoj zzojVar, zzqb<zzbk> zzqbVar) throws GeneralSecurityException {
        zzon zzonVarZza = !zzojVar.zza() ? zzov.zzb().zza().zza(zzoaVar, zzojVar, "hybrid_encrypt", "encrypt") : zzoq.zza;
        zzod zzodVarZzc = zzoaVar.zzc();
        return new zzlh(new zzle(zzqbVar.zza(zzodVarZzc), zzodVarZzc.zza()), zzonVarZza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzbk> zzb() {
        return zzbk.class;
    }

    public static void zzc() throws GeneralSecurityException {
        zzoz.zza().zza(zza);
        zzoz.zza().zza(zzb);
    }

    public static void zza(zzpx zzpxVar) throws GeneralSecurityException {
        zzpxVar.zza(zza);
    }
}
