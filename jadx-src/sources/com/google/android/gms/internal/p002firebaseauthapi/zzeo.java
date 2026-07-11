package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzeo {
    private static final zzpr<zzew, zzbe> zza = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            zzew zzewVar = (zzew) zzbmVar;
            return zzhz.zza(zzbz.zza(((zzev) ((zzcx) zzewVar.zza())).zzc()).zza(((zzev) ((zzcx) zzewVar.zza())).zzc()), zzewVar.zzd());
        }
    }, zzew.class, zzbe.class);
    private static final zzbl<zzbe> zzb = zzoc.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzbe.class, zzws.zza.REMOTE, zzxi.zze());
    private static final zzou<zzev> zzc = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzep
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzew.zza((zzev) zzceVar, num);
        }
    };

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (zzix.zza.zza.zza()) {
            zzex.zza();
            zzoz.zza().zza(zza);
            zzos.zza().zza(zzc, zzev.class);
            zznt.zza().zza((zzbl) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
