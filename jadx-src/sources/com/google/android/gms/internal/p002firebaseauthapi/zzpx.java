package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzpx {
    private final Map<zzqa, zzpr<?, ?>> zza;
    private final Map<Class<?>, zzqc<?, ?>> zzb;

    public final <KeyT extends zzbm, PrimitiveT> zzpx zza(zzpr<KeyT, PrimitiveT> zzprVar) throws GeneralSecurityException {
        if (zzprVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzqa zzqaVar = new zzqa(zzprVar.zza(), zzprVar.zzb());
        if (!this.zza.containsKey(zzqaVar)) {
            this.zza.put(zzqaVar, zzprVar);
            return this;
        }
        zzpr<?, ?> zzprVar2 = this.zza.get(zzqaVar);
        if (zzprVar2.equals(zzprVar) && zzprVar.equals(zzprVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + String.valueOf(zzqaVar));
    }

    private zzpx() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzpx(zzpv zzpvVar) {
        this.zza = new HashMap(zzpvVar.zza);
        this.zzb = new HashMap(zzpvVar.zzb);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzpx zza(zzqc<InputPrimitiveT, WrapperPrimitiveT> zzqcVar) throws GeneralSecurityException {
        if (zzqcVar != null) {
            Class<WrapperPrimitiveT> clsZzb = zzqcVar.zzb();
            if (this.zzb.containsKey(clsZzb)) {
                zzqc<?, ?> zzqcVar2 = this.zzb.get(clsZzb);
                if (zzqcVar2.equals(zzqcVar) && zzqcVar.equals(zzqcVar2)) {
                    return this;
                }
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + String.valueOf(clsZzb));
            }
            this.zzb.put(clsZzb, zzqcVar);
            return this;
        }
        throw new NullPointerException("wrapper must be non-null");
    }

    public final zzpv zza() {
        return new zzpv(this);
    }
}
