package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqi;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzpg<SerializationT extends zzqi> {
    private final zzaae zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzqi> zzpg<SerializationT> zza(zzpi<SerializationT> zzpiVar, zzaae zzaaeVar, Class<SerializationT> cls) {
        return new zzpf(zzaaeVar, cls, zzpiVar);
    }

    public abstract zzce zza(SerializationT serializationt) throws GeneralSecurityException;

    private zzpg(zzaae zzaaeVar, Class<SerializationT> cls) {
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
