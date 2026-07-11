package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzark extends Thread {
    private static final boolean zza = zzask.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzari zzd;
    private volatile boolean zze = false;
    private final zzasl zzf;
    private final zzarp zzg;

    public final void zza() {
        this.zze = true;
        interrupt();
    }

    final /* synthetic */ BlockingQueue zzb() {
        return this.zzc;
    }

    private void zzc() throws InterruptedException {
        zzary zzaryVar = (zzary) this.zzb.take();
        zzaryVar.zzc("cache-queue-take");
        zzaryVar.zze(1);
        try {
            zzaryVar.zzl();
            zzari zzariVar = this.zzd;
            zzarh zzarhVarZza = zzariVar.zza(zzaryVar.zzi());
            if (zzarhVarZza == null) {
                zzaryVar.zzc("cache-miss");
                if (!this.zzf.zzc(zzaryVar)) {
                    this.zzc.put(zzaryVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzarhVarZza.zza(jCurrentTimeMillis)) {
                    zzaryVar.zzc("cache-hit-expired");
                    zzaryVar.zzj(zzarhVarZza);
                    if (!this.zzf.zzc(zzaryVar)) {
                        this.zzc.put(zzaryVar);
                    }
                } else {
                    zzaryVar.zzc("cache-hit");
                    zzase zzaseVarZzr = zzaryVar.zzr(new zzaru(zzarhVarZza.zza, zzarhVarZza.zzg));
                    zzaryVar.zzc("cache-hit-parsed");
                    if (!zzaseVarZzr.zzc()) {
                        zzaryVar.zzc("cache-parsing-failed");
                        zzariVar.zzd(zzaryVar.zzi(), true);
                        zzaryVar.zzj(null);
                        if (!this.zzf.zzc(zzaryVar)) {
                            this.zzc.put(zzaryVar);
                        }
                    } else if (zzarhVarZza.zzf < jCurrentTimeMillis) {
                        zzaryVar.zzc("cache-hit-refresh-needed");
                        zzaryVar.zzj(zzarhVarZza);
                        zzaseVarZzr.zzd = true;
                        if (this.zzf.zzc(zzaryVar)) {
                            this.zzg.zza(zzaryVar, zzaseVarZzr, null);
                        } else {
                            this.zzg.zza(zzaryVar, zzaseVarZzr, new zzarj(this, zzaryVar));
                        }
                    } else {
                        this.zzg.zza(zzaryVar, zzaseVarZzr, null);
                    }
                }
            }
            zzaryVar.zze(2);
        } catch (Throwable th) {
            zzaryVar.zze(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzask.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzask.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public zzark(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzari zzariVar, zzarp zzarpVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzariVar;
        this.zzg = zzarpVar;
        this.zzf = new zzasl(this, blockingQueue2, zzarpVar);
    }
}
