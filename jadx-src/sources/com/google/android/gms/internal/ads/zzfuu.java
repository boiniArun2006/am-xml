package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfuu {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfut zzd = null;

    public final void zzb(zzfut zzfutVar) {
        this.zzd = null;
        zzc();
    }

    private final void zzc() {
        zzfut zzfutVar = (zzfut) this.zzc.poll();
        this.zzd = zzfutVar;
        if (zzfutVar != null) {
            zzfutVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public zzfuu() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void zza(zzfut zzfutVar) {
        zzfutVar.zzb(this);
        this.zzc.add(zzfutVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
