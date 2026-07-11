package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzqk {
    private final Map<zzqm, zznw<?, ?>> zza;
    private final Map<zzqj, zzns<?>> zzb;
    private final Map<zzqm, zzpk<?, ?>> zzc;
    private final Map<zzqj, zzpg<?>> zzd;

    public zzqk() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final <SerializationT extends zzqi> zzqk zza(zzns<SerializationT> zznsVar) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(zznsVar.zzb(), zznsVar.zza());
        if (!this.zzb.containsKey(zzqjVar)) {
            this.zzb.put(zzqjVar, zznsVar);
            return this;
        }
        zzns<?> zznsVar2 = this.zzb.get(zzqjVar);
        if (zznsVar2.equals(zznsVar) && zznsVar.equals(zznsVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + String.valueOf(zzqjVar));
    }

    public zzqk(zzqh zzqhVar) {
        this.zza = new HashMap(zzqhVar.zza);
        this.zzb = new HashMap(zzqhVar.zzb);
        this.zzc = new HashMap(zzqhVar.zzc);
        this.zzd = new HashMap(zzqhVar.zzd);
    }

    public final <KeyT extends zzbm, SerializationT extends zzqi> zzqk zza(zznw<KeyT, SerializationT> zznwVar) throws GeneralSecurityException {
        zzqm zzqmVar = new zzqm(zznwVar.zza(), zznwVar.zzb());
        if (this.zza.containsKey(zzqmVar)) {
            zznw<?, ?> zznwVar2 = this.zza.get(zzqmVar);
            if (zznwVar2.equals(zznwVar) && zznwVar.equals(zznwVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + String.valueOf(zzqmVar));
        }
        this.zza.put(zzqmVar, zznwVar);
        return this;
    }

    public final <SerializationT extends zzqi> zzqk zza(zzpg<SerializationT> zzpgVar) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(zzpgVar.zzb(), zzpgVar.zza());
        if (this.zzd.containsKey(zzqjVar)) {
            zzpg<?> zzpgVar2 = this.zzd.get(zzqjVar);
            if (zzpgVar2.equals(zzpgVar) && zzpgVar.equals(zzpgVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + String.valueOf(zzqjVar));
        }
        this.zzd.put(zzqjVar, zzpgVar);
        return this;
    }

    public final <ParametersT extends zzce, SerializationT extends zzqi> zzqk zza(zzpk<ParametersT, SerializationT> zzpkVar) throws GeneralSecurityException {
        zzqm zzqmVar = new zzqm(zzpkVar.zza(), zzpkVar.zzb());
        if (this.zzc.containsKey(zzqmVar)) {
            zzpk<?, ?> zzpkVar2 = this.zzc.get(zzqmVar);
            if (zzpkVar2.equals(zzpkVar) && zzpkVar.equals(zzpkVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + String.valueOf(zzqmVar));
        }
        this.zzc.put(zzqmVar, zzpkVar);
        return this;
    }

    public final zzqh zza() {
        return new zzqh(this);
    }
}
