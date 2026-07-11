package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhjc {
    private static final Logger zza = Logger.getLogger(zzhjc.class.getName());
    private static final zzhjc zzd = new zzhjc();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhjc zza() {
        return zzd;
    }

    private final synchronized zzhba zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzhba) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhba zzhbaVar, boolean z2, boolean z3) throws GeneralSecurityException {
        try {
            String strZzb = zzhbaVar.zzb();
            if (z3) {
                ConcurrentMap concurrentMap = this.zzc;
                if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzhba zzhbaVar2 = (zzhba) concurrentMap2.get(strZzb);
            if (zzhbaVar2 != null && !zzhbaVar2.getClass().equals(zzhbaVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, zzhbaVar2.getClass().getName(), zzhbaVar.getClass().getName()));
            }
            concurrentMap2.putIfAbsent(strZzb, zzhbaVar);
            this.zzc.put(strZzb, Boolean.valueOf(z3));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(zzhba zzhbaVar, boolean z2) throws GeneralSecurityException {
        zzf(zzhbaVar, 1, z2);
    }

    public final synchronized void zzf(zzhba zzhbaVar, int i2, boolean z2) throws GeneralSecurityException {
        if (!zzhid.zza(i2)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzhbaVar, false, z2);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final zzhba zzc(String str, Class cls) throws GeneralSecurityException {
        zzhba zzhbaVarZzg = zzg(str);
        if (zzhbaVarZzg.zzc().equals(cls)) {
            return zzhbaVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzhbaVarZzg.getClass());
        String string = zzhbaVarZzg.zzc().toString();
        StringBuilder sb = new StringBuilder(name.length() + 53 + strValueOf.length() + 23 + string.length());
        sb.append("Primitive type ");
        sb.append(name);
        sb.append(" not supported by key manager of type ");
        sb.append(strValueOf);
        sb.append(", which only supports: ");
        sb.append(string);
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhba zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }
}
