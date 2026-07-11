package com.google.android.gms.internal.p002firebaseauthapi;

import android.graphics.Trmy.yioUaKMByL;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzpv {
    private final Map<zzqa, zzpr<?, ?>> zza;
    private final Map<Class<?>, zzqc<?, ?>> zzb;

    public static zzpx zza() {
        return new zzpx();
    }

    private zzpv(zzpx zzpxVar) {
        this.zza = new HashMap(zzpxVar.zza);
        this.zzb = new HashMap(zzpxVar.zzb);
    }

    public static zzpx zza(zzpv zzpvVar) {
        return new zzpx(zzpvVar);
    }

    public final <KeyT extends zzbm, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        zzqa zzqaVar = new zzqa(keyt.getClass(), cls);
        if (this.zza.containsKey(zzqaVar)) {
            return (PrimitiveT) this.zza.get(zzqaVar).zza(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + String.valueOf(zzqaVar) + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    public final <WrappedPrimitiveT> WrappedPrimitiveT zza(zzoa zzoaVar, zzoj zzojVar, Class<WrappedPrimitiveT> cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            final zzqc<?, ?> zzqcVar = this.zzb.get(cls);
            return (WrappedPrimitiveT) zzqcVar.zza(zzoaVar, zzojVar, new zzqb() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpy
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqb
                public final Object zza(zzod zzodVar) {
                    return this.zza.zza(zzodVar.zzb(), zzqcVar.zza());
                }
            });
        }
        throw new GeneralSecurityException(yioUaKMByL.XJfdArvkbCEus + String.valueOf(cls));
    }
}
