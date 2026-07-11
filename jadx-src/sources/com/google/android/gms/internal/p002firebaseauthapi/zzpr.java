package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzbm;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzpr<KeyT extends zzbm, PrimitiveT> {
    private final Class<KeyT> zza;
    private final Class<PrimitiveT> zzb;

    public static <KeyT extends zzbm, PrimitiveT> zzpr<KeyT, PrimitiveT> zza(zzpt<KeyT, PrimitiveT> zzptVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new zzpu(cls, cls2, zzptVar);
    }

    public abstract PrimitiveT zza(KeyT keyt) throws GeneralSecurityException;

    private zzpr(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }

    public final Class<PrimitiveT> zzb() {
        return this.zzb;
    }
}
