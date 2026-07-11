package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbfh implements Runnable {
    final /* synthetic */ zzbfl zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }

    zzbfh(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }
}
