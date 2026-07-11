package com.google.android.gms.internal.measurement;

import t1.Q;
import t1.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzpn implements UGc {
    private static final zzpn zza = new zzpn();
    private final UGc zzb = Q.rl(new zzpp());

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

    @Override // t1.UGc
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzpo get() {
        return (zzpo) this.zzb.get();
    }
}
