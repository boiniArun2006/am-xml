package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzsv {

    @Nullable
    private Exception zza;
    private long zzb = -9223372036854775807L;
    private long zzc = -9223372036854775807L;

    public final void zzc() {
        this.zza = null;
        this.zzb = -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final boolean zzb() {
        if (this.zza == null) {
            return false;
        }
        return zzsw.zzG() || SystemClock.elapsedRealtime() < this.zzc;
    }

    public final void zza(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
        }
        if (this.zzb == -9223372036854775807L && !zzsw.zzG()) {
            this.zzb = 200 + jElapsedRealtime;
        }
        long j2 = this.zzb;
        if (j2 != -9223372036854775807L && jElapsedRealtime >= j2) {
            Exception exc2 = this.zza;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.zza;
            zzc();
            throw exc3;
        }
        this.zzc = jElapsedRealtime + 50;
    }
}
