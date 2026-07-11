package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcfo implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcfs zzb;

    zzcfo(zzcfs zzcfsVar, boolean z2) {
        this.zza = z2;
        Objects.requireNonNull(zzcfsVar);
        this.zzb = zzcfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}
