package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class zzje extends zzjd {
    private boolean zza;

    protected abstract boolean zza();

    protected void zzba() {
    }

    final boolean zzv() {
        return this.zza;
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zza()) {
            return;
        }
        this.zzu.zzG();
        this.zza = true;
    }

    public final void zzy() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzba();
        this.zzu.zzG();
        this.zza = true;
    }

    zzje(zzib zzibVar) {
        super(zzibVar);
        this.zzu.zzF();
    }

    protected final void zzw() {
        if (zzv()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }
}
