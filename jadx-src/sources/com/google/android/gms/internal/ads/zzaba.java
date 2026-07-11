package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzaba extends Handler implements Runnable {
    final /* synthetic */ zzabf zza;
    private final zzabb zzb;
    private final long zzc;

    @Nullable
    private zzaax zzd;

    @Nullable
    private IOException zze;
    private int zzf;

    @Nullable
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            zzd();
            return;
        }
        if (i2 == 4) {
            throw ((Error) message.obj);
        }
        zzabf zzabfVar = this.zza;
        zzabfVar.zzk(null);
        long j2 = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = jElapsedRealtime - j2;
        zzaax zzaaxVar = this.zzd;
        zzaaxVar.getClass();
        if (this.zzh) {
            zzaaxVar.zzA(this.zzb, jElapsedRealtime, j3, false);
            return;
        }
        int i3 = message.what;
        if (i3 == 2) {
            try {
                zzaaxVar.zzB(this.zzb, jElapsedRealtime, j3);
                return;
            } catch (RuntimeException e2) {
                zzee.zzf("LoadTask", "Unexpected exception handling load completed", e2);
                this.zza.zzl(new zzabe(e2));
                return;
            }
        }
        if (i3 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i5 = this.zzf + 1;
        this.zzf = i5;
        zzaaz zzaazVarZzz = zzaaxVar.zzz(this.zzb, jElapsedRealtime, j3, iOException, i5);
        if (zzaazVarZzz.zzb() == 3) {
            zzabfVar.zzl(this.zze);
        } else if (zzaazVarZzz.zzb() != 2) {
            if (zzaazVarZzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzaazVarZzz.zzc() != -9223372036854775807L ? zzaazVarZzz.zzc() : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        try {
            synchronized (this) {
                z2 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z2) {
                zzabb zzabbVar = this.zzb;
                String simpleName = zzabbVar.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    zzabbVar.zzc();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e2) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (Exception e3) {
            if (this.zzi) {
                return;
            }
            zzee.zzf("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(3, new zzabe(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.zzi) {
                return;
            }
            zzee.zzf("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(3, new zzabe(e4)).sendToTarget();
        } catch (Error e5) {
            if (!this.zzi) {
                zzee.zzf("LoadTask", "Unexpected error loading stream", e5);
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        }
    }

    public final void zza(int i2) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i2) {
            throw iOException;
        }
    }

    public final void zzb(long j2) {
        zzabf zzabfVar = this.zza;
        zzgrc.zzi(zzabfVar.zzj() == null);
        zzabfVar.zzk(this);
        if (j2 > 0) {
            sendEmptyMessageDelayed(1, j2);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z2) {
        this.zzi = z2;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z2) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzb();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.zza.zzk(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzaax zzaaxVar = this.zzd;
            zzaaxVar.getClass();
            zzaaxVar.zzA(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaba(zzabf zzabfVar, Looper looper, zzabb zzabbVar, zzaax zzaaxVar, int i2, long j2) {
        super(looper);
        Objects.requireNonNull(zzabfVar);
        this.zza = zzabfVar;
        this.zzb = zzabbVar;
        this.zzd = zzaaxVar;
        this.zzc = j2;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - this.zzc;
        zzaax zzaaxVar = this.zzd;
        zzaaxVar.getClass();
        zzaaxVar.zzC(this.zzb, jElapsedRealtime, j2, this.zzf);
        this.zze = null;
        zzabf zzabfVar = this.zza;
        zzaba zzabaVarZzj = zzabfVar.zzj();
        zzabaVarZzj.getClass();
        zzabfVar.zzi().execute(zzabaVarZzj);
    }
}
