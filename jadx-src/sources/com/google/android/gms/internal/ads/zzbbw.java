package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbbw implements Runnable {
    final /* synthetic */ zzbbx zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }

    zzbbw(zzbbx zzbbxVar) {
        Objects.requireNonNull(zzbbxVar);
        this.zza = zzbbxVar;
    }
}
