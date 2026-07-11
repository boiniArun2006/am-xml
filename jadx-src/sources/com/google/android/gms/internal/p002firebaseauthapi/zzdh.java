package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdk;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzdh {
    private static final zzpr<zzdd, zzbe> zza = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdg
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzze.zza((zzdd) zzbmVar);
        }
    }, zzdd.class, zzbe.class);
    private static final zzbl<zzbe> zzb = zzoc.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzbe.class, zzws.zza.SYMMETRIC, zzta.zzf());
    private static final zzow<zzdk> zzc = new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdj
    };
    private static final zzou<zzdk> zzd = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdi
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzdh.zza((zzdk) zzceVar, num);
        }
    };
    private static final zzix.zza zze = zzix.zza.zzb;

    static zzdd zza(zzdk zzdkVar, Integer num) throws GeneralSecurityException {
        if (zzdkVar.zzb() == 16 || zzdkVar.zzb() == 32) {
            return zzdd.zze().zza(zzdkVar).zza(num).zza(zzaaf.zza(zzdkVar.zzb())).zzb(zzaaf.zza(zzdkVar.zzc())).zza();
        }
        throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static void zza(boolean z2) throws GeneralSecurityException {
        zzix.zza zzaVar = zze;
        if (zzaVar.zza()) {
            zzgi.zza();
            zzoz.zza().zza(zza);
            zzpa zzpaVarZza = zzpa.zza();
            HashMap map = new HashMap();
            map.put("AES128_CTR_HMAC_SHA256", zzfl.zze);
            zzdk.zza zzaVarZzc = zzdk.zzf().zza(16).zzb(32).zzd(16).zzc(16);
            zzdk.zzc zzcVar = zzdk.zzc.zzc;
            zzdk.zza zzaVarZza = zzaVarZzc.zza(zzcVar);
            zzdk.zzb zzbVar = zzdk.zzb.zzc;
            map.put("AES128_CTR_HMAC_SHA256_RAW", zzaVarZza.zza(zzbVar).zza());
            map.put("AES256_CTR_HMAC_SHA256", zzfl.zzf);
            map.put("AES256_CTR_HMAC_SHA256_RAW", zzdk.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzcVar).zza(zzbVar).zza());
            zzpaVarZza.zza(Collections.unmodifiableMap(map));
            zzot.zza().zza(zzc, zzdk.class);
            zzos.zza().zza(zzd, zzdk.class);
            zznt.zza().zza((zzbl) zzb, zzaVar, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
