package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzqh {
    private final Map<zzqm, zznw<?, ?>> zza;
    private final Map<zzqj, zzns<?>> zzb;
    private final Map<zzqm, zzpk<?, ?>> zzc;
    private final Map<zzqj, zzpg<?>> zzd;

    private zzqh(zzqk zzqkVar) {
        this.zza = new HashMap(zzqkVar.zza);
        this.zzb = new HashMap(zzqkVar.zzb);
        this.zzc = new HashMap(zzqkVar.zzc);
        this.zzd = new HashMap(zzqkVar.zzd);
    }

    public final <SerializationT extends zzqi> zzbm zza(SerializationT serializationt, zzck zzckVar) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(serializationt.getClass(), serializationt.zzb());
        if (this.zzb.containsKey(zzqjVar)) {
            return this.zzb.get(zzqjVar).zza(serializationt, zzckVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + String.valueOf(zzqjVar) + " available");
    }

    public final <SerializationT extends zzqi> boolean zzb(SerializationT serializationt) {
        return this.zzb.containsKey(new zzqj(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzqi> boolean zzc(SerializationT serializationt) {
        return this.zzd.containsKey(new zzqj(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzqi> zzce zza(SerializationT serializationt) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(serializationt.getClass(), serializationt.zzb());
        if (this.zzd.containsKey(zzqjVar)) {
            return this.zzd.get(zzqjVar).zza(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + String.valueOf(zzqjVar) + " available");
    }

    public final <KeyT extends zzbm, SerializationT extends zzqi> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzck zzckVar) throws GeneralSecurityException {
        zzqm zzqmVar = new zzqm(keyt.getClass(), cls);
        if (this.zza.containsKey(zzqmVar)) {
            return (SerializationT) this.zza.get(zzqmVar).zza(keyt, zzckVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + String.valueOf(zzqmVar) + " available");
    }

    public final <ParametersT extends zzce, SerializationT extends zzqi> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        zzqm zzqmVar = new zzqm(parameterst.getClass(), cls);
        if (this.zzc.containsKey(zzqmVar)) {
            return (SerializationT) this.zzc.get(zzqmVar).zza(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + String.valueOf(zzqmVar) + " available");
    }
}
