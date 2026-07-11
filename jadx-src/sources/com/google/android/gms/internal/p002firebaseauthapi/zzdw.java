package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzdw {
    private static final zzpr<zzds, zzbe> zza = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdv
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzys.zza((zzds) zzbmVar);
        }
    }, zzds.class, zzbe.class);
    private static final zzbl<zzbe> zzb = zzoc.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", zzbe.class, zzws.zza.SYMMETRIC, zzty.zze());
    private static final zzow<zzdz> zzc = new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdy
    };
    private static final zzou<zzdz> zzd = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdx
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzdw.zza((zzdz) zzceVar, num);
        }
    };
    private static final zzix.zza zze = zzix.zza.zzb;

    public static /* synthetic */ zzds zza(zzdz zzdzVar, Integer num) throws GeneralSecurityException {
        if (zzdzVar.zzc() != 24) {
            return zzds.zze().zza(zzdzVar).zza(num).zza(zzaaf.zza(zzdzVar.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static void zza(boolean z2) throws GeneralSecurityException {
        zzix.zza zzaVar = zze;
        if (zzaVar.zza()) {
            zzgw.zza();
            zzoz.zza().zza(zza);
            zzpa zzpaVarZza = zzpa.zza();
            HashMap map = new HashMap();
            map.put("AES128_GCM", zzfl.zza);
            zzdz.zza zzaVarZzc = zzdz.zze().zza(12).zzb(16).zzc(16);
            zzdz.zzb zzbVar = zzdz.zzb.zzc;
            map.put("AES128_GCM_RAW", zzaVarZzc.zza(zzbVar).zza());
            map.put("AES256_GCM", zzfl.zzb);
            map.put("AES256_GCM_RAW", zzdz.zze().zza(12).zzb(32).zzc(16).zza(zzbVar).zza());
            zzpaVarZza.zza(Collections.unmodifiableMap(map));
            zzot.zza().zza(zzc, zzdz.class);
            zzos.zza().zza(zzd, zzdz.class);
            zznt.zza().zza((zzbl) zzb, zzaVar, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
