package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zztj {
    public final int zza;

    @Nullable
    public final zzwk zzb;
    private final CopyOnWriteArrayList zzc;

    private zztj(CopyOnWriteArrayList copyOnWriteArrayList, int i2, @Nullable zzwk zzwkVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzwkVar;
    }

    @CheckResult
    public final zztj zza(int i2, @Nullable zzwk zzwkVar) {
        return new zztj(this.zzc, 0, zzwkVar);
    }

    public zztj() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void zzb(Handler handler, zztk zztkVar) {
        this.zzc.add(new zzti(handler, zztkVar));
    }

    public final void zzc(zztk zztkVar) {
        CopyOnWriteArrayList<zzti> copyOnWriteArrayList = this.zzc;
        for (zzti zztiVar : copyOnWriteArrayList) {
            if (zztiVar.zza == zztkVar) {
                copyOnWriteArrayList.remove(zztiVar);
            }
        }
    }
}
