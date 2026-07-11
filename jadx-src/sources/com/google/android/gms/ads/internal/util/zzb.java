package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcei;
import com.google.common.util.concurrent.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }

    public Xo zzb() {
        return zzcei.zza.submit(this.zza);
    }
}
