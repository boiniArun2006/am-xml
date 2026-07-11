package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzpc {
    private static final zzpc zza = (zzpc) zzqo.zza(new zzqn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpb
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqn
        public final Object zza() throws GeneralSecurityException {
            zzpc zzpcVar = new zzpc();
            zzpcVar.zza(zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpe
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
                public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                    return ((zzoe) zzbmVar).zza(zzckVar);
                }
            }, zzoe.class, zzqe.class));
            return zzpcVar;
        }
    });
    private final AtomicReference<zzqh> zzb = new AtomicReference<>(new zzqk().zza());

    public final <SerializationT extends zzqi> zzbm zza(SerializationT serializationt, zzck zzckVar) throws GeneralSecurityException {
        return this.zzb.get().zza(serializationt, zzckVar);
    }

    public final <SerializationT extends zzqi> zzce zza(SerializationT serializationt) throws GeneralSecurityException {
        return this.zzb.get().zza(serializationt);
    }

    public final <SerializationT extends zzqi> boolean zzb(SerializationT serializationt) {
        return this.zzb.get().zzb(serializationt);
    }

    public final <SerializationT extends zzqi> boolean zzc(SerializationT serializationt) {
        return this.zzb.get().zzc(serializationt);
    }

    public static zzpc zza() {
        return zza;
    }

    public final <KeyT extends zzbm, SerializationT extends zzqi> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzck zzckVar) throws GeneralSecurityException {
        return (SerializationT) this.zzb.get().zza(keyt, cls, zzckVar);
    }

    public final <ParametersT extends zzce, SerializationT extends zzqi> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        return (SerializationT) this.zzb.get().zza(parameterst, cls);
    }

    public final synchronized <SerializationT extends zzqi> void zza(zzns<SerializationT> zznsVar) throws GeneralSecurityException {
        this.zzb.set(new zzqk(this.zzb.get()).zza(zznsVar).zza());
    }

    public final synchronized <KeyT extends zzbm, SerializationT extends zzqi> void zza(zznw<KeyT, SerializationT> zznwVar) throws GeneralSecurityException {
        this.zzb.set(new zzqk(this.zzb.get()).zza(zznwVar).zza());
    }

    public final synchronized <SerializationT extends zzqi> void zza(zzpg<SerializationT> zzpgVar) throws GeneralSecurityException {
        this.zzb.set(new zzqk(this.zzb.get()).zza(zzpgVar).zza());
    }

    public final synchronized <ParametersT extends zzce, SerializationT extends zzqi> void zza(zzpk<ParametersT, SerializationT> zzpkVar) throws GeneralSecurityException {
        this.zzb.set(new zzqk(this.zzb.get()).zza(zzpkVar).zza());
    }
}
