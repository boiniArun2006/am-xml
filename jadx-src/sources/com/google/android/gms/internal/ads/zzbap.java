package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbap implements Runnable {
    final /* synthetic */ zzbar zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }

    zzbap(zzbar zzbarVar) {
        Objects.requireNonNull(zzbarVar);
        this.zza = zzbarVar;
    }
}
