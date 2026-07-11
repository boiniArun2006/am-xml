package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zznt {
    public static final /* synthetic */ int zza = 0;
    private static final zznt zzb = new zznt();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zznx zzc = new zznc();

    public static zznt zza() {
        return zzb;
    }

    public final zznw zzb(Class cls) {
        zzmo.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzd;
        zznw zznwVarZza = (zznw) concurrentMap.get(cls);
        if (zznwVarZza == null) {
            zznwVarZza = this.zzc.zza(cls);
            zzmo.zza(cls, "messageType");
            zznw zznwVar = (zznw) concurrentMap.putIfAbsent(cls, zznwVarZza);
            if (zznwVar != null) {
                return zznwVar;
            }
        }
        return zznwVarZza;
    }

    private zznt() {
    }
}
