package com.google.android.gms.measurement.internal;

import android.os.Process;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhx extends Thread {
    final /* synthetic */ zzhy zza;
    private final Object zzb;
    private final BlockingQueue zzc;

    @GuardedBy
    private boolean zzd;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z2 = false;
        while (!z2) {
            try {
                this.zza.zzs().acquire();
                z2 = true;
            } catch (InterruptedException e2) {
                zzc(e2);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.zzc;
                zzhw zzhwVar = (zzhw) blockingQueue.poll();
                if (zzhwVar != null) {
                    Process.setThreadPriority(true != zzhwVar.zza ? 10 : threadPriority);
                    zzhwVar.run();
                } else {
                    Object obj = this.zzb;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.zza.zzt();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e3) {
                                zzc(e3);
                            }
                        }
                    }
                    synchronized (this.zza.zzr()) {
                        if (this.zzc.peek() == null) {
                            zzb();
                            zzb();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            zzb();
            throw th;
        }
    }

    private final void zzb() {
        zzhy zzhyVar = this.zza;
        synchronized (zzhyVar.zzr()) {
            try {
                if (!this.zzd) {
                    zzhyVar.zzs().release();
                    zzhyVar.zzr().notifyAll();
                    if (this == zzhyVar.zzn()) {
                        zzhyVar.zzo(null);
                    } else if (this == zzhyVar.zzp()) {
                        zzhyVar.zzq(null);
                    } else {
                        zzhyVar.zzu.zzaV().zzb().zza("Current scheduler thread is neither worker nor network");
                    }
                    this.zzd = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzu.zzaV().zze().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void zza() {
        Object obj = this.zzb;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public zzhx(zzhy zzhyVar, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(zzhyVar);
        this.zza = zzhyVar;
        this.zzd = false;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }
}
