package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfrq implements Runnable {
    final /* synthetic */ zzfsa zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzu();
    }

    zzfrq(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }
}
