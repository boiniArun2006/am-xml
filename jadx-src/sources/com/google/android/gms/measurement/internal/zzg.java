package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import androidx.core.database.sqlite.cL.PtsLKY;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzg extends zzf {
    private boolean zza;

    final boolean zza() {
        return this.zza;
    }

    protected abstract boolean zze();

    @WorkerThread
    protected void zzf() {
    }

    public final void zzc() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zze()) {
            return;
        }
        this.zzu.zzG();
        this.zza = true;
    }

    public final void zzd() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzf();
        this.zzu.zzG();
        this.zza = true;
    }

    zzg(zzib zzibVar) {
        super(zzibVar);
        this.zzu.zzF();
    }

    protected final void zzb() {
        if (zza()) {
        } else {
            throw new IllegalStateException(PtsLKY.SgDJBYlwovQMao);
        }
    }
}
