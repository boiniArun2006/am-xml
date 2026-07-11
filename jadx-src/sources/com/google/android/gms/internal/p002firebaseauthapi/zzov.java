package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzov {
    private static final zzov zza = new zzov();
    private static final zzoy zzb = new zzoy();
    private final AtomicReference<zzoo> zzc = new AtomicReference<>();

    public static zzov zzb() {
        return zza;
    }

    public final zzoo zza() {
        zzoo zzooVar = this.zzc.get();
        return zzooVar == null ? zzb : zzooVar;
    }
}
