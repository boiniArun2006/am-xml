package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zznt {
    private static final Logger zza = Logger.getLogger(zznt.class.getName());
    private static final zznt zzb = new zznt();
    private ConcurrentMap<String, zzbl<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    private final synchronized zzbl<?> zzc(String str) throws GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return this.zzc.get(str);
    }

    public final <P> zzbl<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zzbl<P> zzblVar = (zzbl<P>) zzc(str);
        if (zzblVar.zza().equals(cls)) {
            return zzblVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(zzblVar.getClass()) + ", which only supports: " + String.valueOf(zzblVar.zza()));
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }

    public final zzbl<?> zza(String str) throws GeneralSecurityException {
        return zzc(str);
    }

    public static zznt zza() {
        return zzb;
    }

    private final synchronized void zza(zzbl<?> zzblVar, boolean z2, boolean z3) throws GeneralSecurityException {
        try {
            String strZzb = zzblVar.zzb();
            if (z3 && this.zzd.containsKey(strZzb) && !this.zzd.get(strZzb).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strZzb);
            }
            zzbl<?> zzblVar2 = this.zzc.get(strZzb);
            if (zzblVar2 != null && !zzblVar2.getClass().equals(zzblVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + strZzb);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, zzblVar2.getClass().getName(), zzblVar.getClass().getName()));
            }
            this.zzc.putIfAbsent(strZzb, zzblVar);
            this.zzd.put(strZzb, Boolean.valueOf(z3));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized <P> void zza(zzbl<P> zzblVar, boolean z2) throws GeneralSecurityException {
        zza(zzblVar, zzix.zza.zza, z2);
    }

    public final synchronized <P> void zza(zzbl<P> zzblVar, zzix.zza zzaVar, boolean z2) throws GeneralSecurityException {
        if (zzaVar.zza()) {
            zza((zzbl<?>) zzblVar, false, z2);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
