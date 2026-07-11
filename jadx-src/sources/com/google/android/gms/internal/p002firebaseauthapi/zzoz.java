package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzoz {
    private static zzoz zza = new zzoz();
    private final AtomicReference<zzpv> zzb = new AtomicReference<>(zzpv.zza().zza());

    public static zzoz zza() {
        return zza;
    }

    public final <KeyT extends zzbm, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (PrimitiveT) this.zzb.get().zza(keyt, cls);
    }

    zzoz() {
    }

    public final synchronized <KeyT extends zzbm, PrimitiveT> void zza(zzpr<KeyT, PrimitiveT> zzprVar) throws GeneralSecurityException {
        this.zzb.set(zzpv.zza(this.zzb.get()).zza(zzprVar).zza());
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzqc<InputPrimitiveT, WrapperPrimitiveT> zzqcVar) throws GeneralSecurityException {
        this.zzb.set(zzpv.zza(this.zzb.get()).zza(zzqcVar).zza());
    }
}
