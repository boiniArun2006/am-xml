package com.google.android.gms.internal.measurement;

import t1.Q;
import t1.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzrg implements UGc {
    private static final zzrg zza = new zzrg();
    private final UGc zzb = Q.rl(new zzri());

    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // t1.UGc
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzrh get() {
        return (zzrh) this.zzb.get();
    }
}
