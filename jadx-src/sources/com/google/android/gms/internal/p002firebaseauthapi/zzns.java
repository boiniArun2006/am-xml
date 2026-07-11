package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqi;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzns<SerializationT extends zzqi> {
    private final zzaae zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzqi> zzns<SerializationT> zza(zznu<SerializationT> zznuVar, zzaae zzaaeVar, Class<SerializationT> cls) {
        return new zznv(zzaaeVar, cls, zznuVar);
    }

    public abstract zzbm zza(SerializationT serializationt, zzck zzckVar) throws GeneralSecurityException;

    private zzns(zzaae zzaaeVar, Class<SerializationT> cls) {
        this.zza = zzaaeVar;
        this.zzb = cls;
    }

    public final zzaae zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
