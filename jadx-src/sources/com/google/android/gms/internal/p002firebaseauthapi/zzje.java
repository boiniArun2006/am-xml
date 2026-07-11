package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzjh;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzje {
    private static final zzpr<zzja, zzbi> zza = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjd
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzje.zza((zzja) zzbmVar);
        }
    }, zzja.class, zzbi.class);
    private static final zzbl<zzbi> zzb = zzoc.zza("type.googleapis.com/google.crypto.tink.AesSivKey", zzbi.class, zzws.zza.SYMMETRIC, zzuk.zze());
    private static final zzow<zzjh> zzc = new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjg
    };
    private static final zzou<zzjh> zzd = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjf
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzje.zza((zzjh) zzceVar, num);
        }
    };

    public static /* synthetic */ zzbi zza(zzja zzjaVar) throws GeneralSecurityException {
        zza((zzjh) ((zzjm) zzjaVar.zza()));
        return zzyr.zza(zzjaVar);
    }

    static zzja zza(zzjh zzjhVar, Integer num) throws GeneralSecurityException {
        zza(zzjhVar);
        return zzja.zzc().zza(zzjhVar).zza(num).zza(zzaaf.zza(zzjhVar.zzb())).zza();
    }

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (zzix.zza.zza.zza()) {
            zzjr.zza();
            zzoz.zza().zza(zza);
            zzpa zzpaVarZza = zzpa.zza();
            HashMap map = new HashMap();
            map.put("AES256_SIV", zzjp.zza);
            map.put("AES256_SIV_RAW", zzjh.zzc().zza(64).zza(zzjh.zzb.zzc).zza());
            zzpaVarZza.zza(Collections.unmodifiableMap(map));
            zzot.zza().zza(zzc, zzjh.class);
            zzos.zza().zza(zzd, zzjh.class);
            zznt.zza().zza((zzbl) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
    }

    private static void zza(zzjh zzjhVar) throws GeneralSecurityException {
        if (zzjhVar.zzb() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + zzjhVar.zzb() + ". Valid keys must have 64 bytes.");
    }
}
