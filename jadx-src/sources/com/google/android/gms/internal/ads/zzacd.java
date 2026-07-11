package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzacd extends HandlerThread implements Handler.Callback {
    private zzdt zza;
    private Handler zzb;

    @Nullable
    private Error zzc;

    @Nullable
    private RuntimeException zzd;

    @Nullable
    private zzace zze;

    public zzacd() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzdt zzdtVar;
        int i2 = message.what;
        try {
            if (i2 == 1) {
                try {
                    int i3 = message.arg1;
                    zzdt zzdtVar2 = this.zza;
                    if (zzdtVar2 == null) {
                        throw null;
                    }
                    zzdtVar2.zza(i3);
                    this.zze = new zzace(this, this.zza.zzc(), i3 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzdu e2) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.zzd = new IllegalStateException(e2);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e3) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzc = e3;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e4) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.zzd = e4;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i2 == 2) {
                try {
                    zzdtVar = this.zza;
                } finally {
                    try {
                    } finally {
                    }
                }
                if (zzdtVar == null) {
                    throw null;
                }
                zzdtVar.zzb();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    public final zzace zza(int i2) {
        boolean z2;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdt(this.zzb, null);
        synchronized (this) {
            z2 = false;
            this.zzb.obtainMessage(1, i2, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzace zzaceVar = this.zze;
                zzaceVar.getClass();
                return zzaceVar;
            }
            throw error;
        }
        throw runtimeException;
    }
}
