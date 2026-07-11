package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzos {
    private static final zzou<zzoh> zza = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzor
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzos.zza((zzoh) zzceVar, num);
        }
    };
    private static final zzos zzb = zzb();
    private final Map<Class<? extends zzce>, zzou<? extends zzce>> zzc = new HashMap();

    private final synchronized <ParametersT extends zzce> zzbm zzb(ParametersT parameterst, Integer num) throws GeneralSecurityException {
        zzou<? extends zzce> zzouVar;
        zzouVar = this.zzc.get(parameterst.getClass());
        if (zzouVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(parameterst) + ": no key creator for this class was registered.");
        }
        return zzouVar.zza(parameterst, num);
    }

    public final zzbm zza(zzce zzceVar, Integer num) throws GeneralSecurityException {
        return zzb(zzceVar, num);
    }

    public static /* synthetic */ zzoe zza(zzoh zzohVar, Integer num) throws GeneralSecurityException {
        zzww zzwwVarZza = zzohVar.zzb().zza();
        zzbl<?> zzblVarZza = zznt.zza().zza(zzwwVarZza.zzf());
        if (!zznt.zza().zzb(zzwwVarZza.zzf())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzws zzwsVarZza = zzblVarZza.zza(zzwwVarZza.zze());
        return new zzoe(zzqe.zza(zzwsVarZza.zzf(), zzwsVarZza.zze(), zzwsVarZza.zzb(), zzwwVarZza.zzd(), num), zzbj.zza());
    }

    private static zzos zzb() {
        zzos zzosVar = new zzos();
        try {
            zzosVar.zza(zza, zzoh.class);
            return zzosVar;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("unexpected error.", e2);
        }
    }

    public static zzos zza() {
        return zzb;
    }

    public final synchronized <ParametersT extends zzce> void zza(zzou<ParametersT> zzouVar, Class<ParametersT> cls) throws GeneralSecurityException {
        try {
            zzou<? extends zzce> zzouVar2 = this.zzc.get(cls);
            if (zzouVar2 != null && !zzouVar2.equals(zzouVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.zzc.put(cls, zzouVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
