package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzfua implements Runnable {
    final /* synthetic */ zzfub zza;
    private final WebView zzb;

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }

    zzfua(zzfub zzfubVar) {
        Objects.requireNonNull(zzfubVar);
        this.zza = zzfubVar;
        this.zzb = zzfubVar.zzq();
    }
}
