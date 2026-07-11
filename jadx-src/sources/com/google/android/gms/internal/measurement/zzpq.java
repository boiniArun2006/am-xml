package com.google.android.gms.internal.measurement;

import t1.Q;
import t1.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzpq implements UGc {
    private static final zzpq zza = new zzpq();
    private final UGc zzb = Q.rl(new zzps());

    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    public static boolean zzc() {
        return zza.get().zzc();
    }

    public static boolean zzd() {
        return zza.get().zzd();
    }

    @Override // t1.UGc
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzpr get() {
        return (zzpr) this.zzb.get();
    }
}
