package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzbm;
import com.google.android.gms.internal.p002firebaseauthapi.zzqi;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zznw<KeyT extends zzbm, SerializationT extends zzqi> {
    private final Class<KeyT> zza;
    private final Class<SerializationT> zzb;

    public static <KeyT extends zzbm, SerializationT extends zzqi> zznw<KeyT, SerializationT> zza(zzny<KeyT, SerializationT> zznyVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new zznz(cls, cls2, zznyVar);
    }

    public abstract SerializationT zza(KeyT keyt, zzck zzckVar) throws GeneralSecurityException;

    private zznw(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
