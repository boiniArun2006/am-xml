package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzem;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzel {
    private static final zzpr<zzei, zzbe> zza = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzek
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzel.zza((zzei) zzbmVar);
        }
    }, zzei.class, zzbe.class);
    private static final zzou<zzem> zzb = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzen
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzel.zza((zzem) zzceVar, num);
        }
    };
    private static final zzbl<zzbe> zzc = zzoc.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzbe.class, zzws.zza.SYMMETRIC, zzuq.zze());

    public static /* synthetic */ zzbe zza(zzei zzeiVar) {
        return zzhk.zzb() ? zzhk.zza(zzeiVar) : zzyw.zza(zzeiVar);
    }

    static zzei zza(zzem zzemVar, Integer num) throws GeneralSecurityException {
        return zzei.zza(zzemVar.zzb(), zzaaf.zza(32), num);
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (zzix.zza.zza.zza()) {
            zzhm.zza();
            zzoz.zza().zza(zza);
            zzos.zza().zza(zzb, zzem.class);
            zzpa zzpaVarZza = zzpa.zza();
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", zzem.zza(zzem.zza.zza));
            map.put("CHACHA20_POLY1305_RAW", zzem.zza(zzem.zza.zzc));
            zzpaVarZza.zza(Collections.unmodifiableMap(map));
            zznt.zza().zza((zzbl) zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
