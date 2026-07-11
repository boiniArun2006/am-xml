package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zznz {

    @VisibleForTesting
    protected long zza;

    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzob zzc;
    private final zzay zzd;

    @WorkerThread
    final void zza(long j2) {
        this.zzc.zzg();
        this.zzd.zzd();
        this.zza = j2;
        this.zzb = j2;
    }

    @WorkerThread
    final void zzb(long j2) {
        this.zzd.zzd();
    }

    final void zzc() {
        this.zzd.zzd();
        long jElapsedRealtime = this.zzc.zzu.zzaZ().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    @WorkerThread
    public final boolean zzd(boolean z2, boolean z3, long j2) {
        zzob zzobVar = this.zzc;
        zzobVar.zzg();
        zzobVar.zzb();
        if (zzobVar.zzu.zzB()) {
            zzib zzibVar = zzobVar.zzu;
            zzibVar.zzd().zzk.zzb(zzibVar.zzaZ().currentTimeMillis());
        }
        long j3 = j2 - this.zza;
        if (!z2 && j3 < 1000) {
            zzobVar.zzu.zzaV().zzk().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
            return false;
        }
        if (!z3) {
            j3 = j2 - this.zzb;
            this.zzb = j2;
        }
        zzib zzibVar2 = zzobVar.zzu;
        zzibVar2.zzaV().zzk().zzb("Recording user engagement, ms", Long.valueOf(j3));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j3);
        boolean z4 = !zzibVar2.zzc().zzv();
        zzib zzibVar3 = zzobVar.zzu;
        zzpo.zzav(zzibVar3.zzs().zzh(z4), bundle, true);
        if (!z3) {
            zzibVar3.zzj().zzF(TtmlNode.TEXT_EMPHASIS_AUTO, "_e", bundle);
        }
        this.zza = j2;
        zzay zzayVar = this.zzd;
        zzayVar.zzd();
        zzayVar.zzb(((Long) zzfx.zzaq.zzb(null)).longValue());
        return true;
    }

    public zznz(zzob zzobVar) {
        Objects.requireNonNull(zzobVar);
        this.zzc = zzobVar;
        this.zzd = new zzny(this, zzobVar.zzu);
        long jElapsedRealtime = zzobVar.zzu.zzaZ().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }
}
