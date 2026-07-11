package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbqc implements Runnable {
    final /* synthetic */ zzbqf zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }

    zzbqc(zzbqf zzbqfVar) {
        Objects.requireNonNull(zzbqfVar);
        this.zza = zzbqfVar;
    }
}
