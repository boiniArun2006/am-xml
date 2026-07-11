package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhkb {
    private static final zzhkb zza = new zzhkb();
    private static final zzhka zzb = new zzhka(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhkb zza() {
        return zza;
    }

    public final zzhjt zzb() {
        zzhjt zzhjtVar = (zzhjt) this.zzc.get();
        return zzhjtVar == null ? zzb : zzhjtVar;
    }
}
