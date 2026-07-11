package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhjz {
    private static final zzhjz zzb = new zzhjz();
    private final Map zza = new HashMap();

    public static zzhjz zza() {
        return zzb;
    }

    public final synchronized void zzb(zzhjy zzhjyVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.zza;
            zzhjy zzhjyVar2 = (zzhjy) map.get(cls);
            if (zzhjyVar2 != null && !zzhjyVar2.equals(zzhjyVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, zzhjyVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
