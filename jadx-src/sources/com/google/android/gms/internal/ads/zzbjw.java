package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbjw {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static zzbju zza() {
        return (zzbju) zza.get();
    }

    static zzbjv zzb() {
        return (zzbjv) zzb.get();
    }

    public static void zzc(zzbju zzbjuVar) {
        zza.set(zzbjuVar);
    }
}
