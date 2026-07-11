package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zznx {
    final /* synthetic */ zzob zza;
    private zznw zzb;

    @WorkerThread
    final void zza() {
        zzob zzobVar = this.zza;
        zzobVar.zzg();
        zznw zznwVar = this.zzb;
        if (zznwVar != null) {
            zzobVar.zzm().removeCallbacks(zznwVar);
        }
        zzib zzibVar = zzobVar.zzu;
        zzibVar.zzd().zzn.zzb(false);
        zzobVar.zzh(false);
        if (zzibVar.zzc().zzp(null, zzfx.zzaT)) {
            zzib zzibVar2 = zzobVar.zzu;
            if (zzibVar2.zzj().zzx()) {
                zzibVar.zzaV().zzk().zza("Retrying trigger URI registration in foreground");
                zzibVar2.zzj().zzz();
            }
        }
    }

    @WorkerThread
    final void zzb(long j2) {
        zzob zzobVar = this.zza;
        this.zzb = new zznw(this, zzobVar.zzu.zzaZ().currentTimeMillis(), j2);
        zzobVar.zzm().postDelayed(this.zzb, 2000L);
    }

    zznx(zzob zzobVar) {
        Objects.requireNonNull(zzobVar);
        this.zza = zzobVar;
    }
}
