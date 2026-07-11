package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbah implements Runnable {
    final /* synthetic */ zzbak zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
    }

    zzbah(zzbak zzbakVar) {
        Objects.requireNonNull(zzbakVar);
        this.zza = zzbakVar;
    }
}
