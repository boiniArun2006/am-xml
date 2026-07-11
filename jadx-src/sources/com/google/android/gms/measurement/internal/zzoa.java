package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzoa {
    final /* synthetic */ zzob zza;

    @WorkerThread
    final void zza() {
        zzob zzobVar = this.zza;
        zzobVar.zzg();
        zzib zzibVar = zzobVar.zzu;
        if (zzibVar.zzd().zzp(zzibVar.zzaZ().currentTimeMillis())) {
            zzibVar.zzd().zzg.zzb(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzibVar.zzaV().zzk().zza("Detected application was in foreground");
                zzc(zzibVar.zzaZ().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    final void zzb(long j2, boolean z2) {
        zzob zzobVar = this.zza;
        zzobVar.zzg();
        zzobVar.zzj();
        zzib zzibVar = zzobVar.zzu;
        if (zzibVar.zzd().zzp(j2)) {
            zzibVar.zzd().zzg.zzb(true);
            zzobVar.zzu.zzv().zzi();
        }
        zzibVar.zzd().zzk.zzb(j2);
        if (zzibVar.zzd().zzg.zza()) {
            zzc(j2, z2);
        }
    }

    @VisibleForTesting
    @WorkerThread
    final void zzc(long j2, boolean z2) {
        zzob zzobVar = this.zza;
        zzobVar.zzg();
        if (zzobVar.zzu.zzB()) {
            zzib zzibVar = zzobVar.zzu;
            zzibVar.zzd().zzk.zzb(j2);
            zzibVar.zzaV().zzk().zzb("Session started, time", Long.valueOf(zzibVar.zzaZ().elapsedRealtime()));
            long j3 = j2 / 1000;
            zzib zzibVar2 = zzobVar.zzu;
            zzibVar2.zzj().zzN(TtmlNode.TEXT_EMPHASIS_AUTO, "_sid", Long.valueOf(j3), j2);
            zzibVar.zzd().zzl.zzb(j3);
            zzibVar.zzd().zzg.zzb(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            zzibVar2.zzj().zzG(TtmlNode.TEXT_EMPHASIS_AUTO, "_s", j2, bundle);
            String strZza = zzibVar.zzd().zzq.zza();
            if (TextUtils.isEmpty(strZza)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strZza);
            zzibVar2.zzj().zzG(TtmlNode.TEXT_EMPHASIS_AUTO, "_ssr", j2, bundle2);
        }
    }

    zzoa(zzob zzobVar) {
        Objects.requireNonNull(zzobVar);
        this.zza = zzobVar;
    }
}
