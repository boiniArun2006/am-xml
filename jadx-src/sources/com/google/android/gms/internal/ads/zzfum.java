package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzfum implements Runnable {
    final /* synthetic */ zzfur zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }

    zzfum(zzfur zzfurVar) {
        Objects.requireNonNull(zzfurVar);
        this.zza = zzfurVar;
    }
}
