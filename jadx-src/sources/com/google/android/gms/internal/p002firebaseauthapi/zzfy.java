package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzfy {
    private static final zzou<zzfz> zza = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfx
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzfv.zza((zzfz) zzceVar, zzaaf.zza(32), num);
        }
    };
    private static final zzpr<zzfv, zzbe> zzb = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzga
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzie.zza((zzfv) zzbmVar);
        }
    }, zzfv.class, zzbe.class);

    public static void zza(boolean z2) throws GeneralSecurityException {
        zzid.zza();
        zzpa zzpaVarZza = zzpa.zza();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", zzfl.zzg);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzfl.zzh);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzfl.zzi);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzfl.zzj);
        zzpaVarZza.zza(Collections.unmodifiableMap(map));
        zzoz.zza().zza(zzb);
        zzos.zza().zza(zza, zzfz.class);
    }
}
