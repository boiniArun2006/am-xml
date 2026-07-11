package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzce;
import com.google.android.gms.internal.p002firebaseauthapi.zzqi;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzpk<ParametersT extends zzce, SerializationT extends zzqi> {
    private final Class<ParametersT> zza;
    private final Class<SerializationT> zzb;

    public static <ParametersT extends zzce, SerializationT extends zzqi> zzpk<ParametersT, SerializationT> zza(zzpm<ParametersT, SerializationT> zzpmVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new zzpj(cls, cls2, zzpmVar);
    }

    public abstract SerializationT zza(ParametersT parameterst) throws GeneralSecurityException;

    private zzpk(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class<ParametersT> zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
