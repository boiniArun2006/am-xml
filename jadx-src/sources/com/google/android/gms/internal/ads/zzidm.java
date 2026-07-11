package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzidm {
    private static final zzidm zza = new zzidm();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzidv zzb = new zzict();

    static zzidm zza() {
        return zza;
    }

    final zzidu zzb(Class cls) {
        zzice.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzc;
        zzidu zziduVarZza = (zzidu) concurrentMap.get(cls);
        if (zziduVarZza == null) {
            zziduVarZza = this.zzb.zza(cls);
            zzidu zziduVar = (zzidu) concurrentMap.putIfAbsent(cls, zziduVarZza);
            if (zziduVar != null) {
                return zziduVar;
            }
        }
        return zziduVarZza;
    }

    private zzidm() {
    }
}
