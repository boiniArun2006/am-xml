package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzqw;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzqt {
    private static final zzou<zzqw> zza = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqs
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzqt.zza((zzqw) zzceVar, num);
        }
    };
    private static final zzpr<zzqp, zzqz> zzb = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqv
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzqt.zzb((zzqp) zzbmVar);
        }
    }, zzqp.class, zzqz.class);
    private static final zzpr<zzqp, zzcb> zzc = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqu
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzqt.zza((zzqp) zzbmVar);
        }
    }, zzqp.class, zzcb.class);
    private static final zzbl<zzcb> zzd = zzoc.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", zzcb.class, zzws.zza.SYMMETRIC, zzsr.zzf());

    public static /* synthetic */ zzcb zza(zzqp zzqpVar) throws GeneralSecurityException {
        zza((zzqw) ((zzrm) zzqpVar.zza()));
        return zzzx.zza(zzqpVar);
    }

    public static /* synthetic */ zzqp zza(zzqw zzqwVar, Integer num) throws GeneralSecurityException {
        zza(zzqwVar);
        return zzqp.zzc().zza(zzqwVar).zza(zzaaf.zza(zzqwVar.zzc())).zza(num).zza();
    }

    public static /* synthetic */ zzqz zzb(zzqp zzqpVar) throws GeneralSecurityException {
        zza((zzqw) ((zzrm) zzqpVar.zza()));
        return new zzsh(zzqpVar);
    }

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (zzix.zza.zza.zza()) {
            zzry.zza();
            zzos.zza().zza(zza, zzqw.class);
            zzoz.zza().zza(zzb);
            zzoz.zza().zza(zzc);
            zzpa zzpaVarZza = zzpa.zza();
            HashMap map = new HashMap();
            zzqw zzqwVar = zzrs.zzc;
            map.put("AES_CMAC", zzqwVar);
            map.put("AES256_CMAC", zzqwVar);
            map.put("AES256_CMAC_RAW", zzqw.zzd().zza(32).zzb(16).zza(zzqw.zzb.zzd).zza());
            zzpaVarZza.zza(Collections.unmodifiableMap(map));
            zznt.zza().zza((zzbl) zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
    }

    private static void zza(zzqw zzqwVar) throws GeneralSecurityException {
        if (zzqwVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
