package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgcn implements zzgcl {
    private final Executor zza;
    private final Queue zzb = new PriorityQueue();

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zza(Runnable runnable, long j2) {
        if (j2 <= 0) {
            this.zza.execute(runnable);
            return;
        }
        zzgcp zzgcpVar = new zzgcp(runnable, System.currentTimeMillis() + j2);
        Queue queue = this.zzb;
        synchronized (queue) {
            queue.add(zzgcpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zzb() {
        Queue queue = this.zzb;
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (zzgcp zzgcpVar = (zzgcp) queue.peek(); zzgcpVar != null && zzgcpVar.zzb <= jCurrentTimeMillis; zzgcpVar = (zzgcp) queue.peek()) {
                    priorityQueue.add(zzgcpVar);
                }
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    try {
                        this.zza.execute(((zzgcp) it.next()).zza);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzgcn(Executor executor, zzgao zzgaoVar) {
        this.zza = executor;
    }
}
