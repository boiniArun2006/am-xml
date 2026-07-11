package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzgg;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzgd {
    private static final zzpr<zzgb, zzbe> zza = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgc
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzgd.zza((zzgb) zzbmVar);
        }
    }, zzgb.class, zzbe.class);
    private static final zzbl<zzbe> zzb = zzoc.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzbe.class, zzws.zza.SYMMETRIC, zzyf.zze());
    private static final zzow<zzgg> zzc = new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgf
    };
    private static final zzou<zzgg> zzd = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzge
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzgd.zza((zzgg) zzceVar, num);
        }
    };

    public static /* synthetic */ zzbe zza(zzgb zzgbVar) {
        return zzij.zza() ? zzij.zza(zzgbVar) : zzaab.zza(zzgbVar);
    }

    static zzgb zza(zzgg zzggVar, Integer num) throws GeneralSecurityException {
        return zzgb.zza(zzggVar.zzb(), zzaaf.zza(32), num);
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (zzix.zza.zza.zza()) {
            zzim.zza();
            zzoz.zza().zza(zza);
            zzpa zzpaVarZza = zzpa.zza();
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", zzgg.zza(zzgg.zza.zza));
            map.put("XCHACHA20_POLY1305_RAW", zzgg.zza(zzgg.zza.zzc));
            zzpaVarZza.zza(Collections.unmodifiableMap(map));
            zzos.zza().zza(zzd, zzgg.class);
            zzot.zza().zza(zzc, zzgg.class);
            zznt.zza().zza((zzbl) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
