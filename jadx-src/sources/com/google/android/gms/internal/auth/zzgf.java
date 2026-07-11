package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgf {
    private static final zzgf zza = new zzgf();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgj zzb = new zzfp();

    public static zzgf zza() {
        return zza;
    }

    public final zzgi zzb(Class cls) {
        zzfa.zzc(cls, "messageType");
        zzgi zzgiVar = (zzgi) this.zzc.get(cls);
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZza = this.zzb.zza(cls);
        zzfa.zzc(cls, "messageType");
        zzgi zzgiVar2 = (zzgi) this.zzc.putIfAbsent(cls, zzgiVarZza);
        return zzgiVar2 == null ? zzgiVarZza : zzgiVar2;
    }

    private zzgf() {
    }
}
