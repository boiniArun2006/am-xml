package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgny implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgoa zza;

    public final void onOpActiveChanged(String str, int i2, String str2, boolean z2) {
        zzgoa zzgoaVar = this.zza;
        synchronized (zzgoaVar) {
            try {
                if (z2) {
                    zzgoaVar.zzg(System.currentTimeMillis());
                    zzgoaVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgoaVar.zzh() > 0 && jCurrentTimeMillis >= zzgoaVar.zzh()) {
                        zzgoaVar.zzi(jCurrentTimeMillis - zzgoaVar.zzh());
                    }
                    zzgoaVar.zzj(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    zzgny(zzgoa zzgoaVar) {
        Objects.requireNonNull(zzgoaVar);
        this.zza = zzgoaVar;
    }
}
