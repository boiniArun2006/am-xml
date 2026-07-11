package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzasj {
    public static final boolean zza = zzask.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final synchronized void zza(String str, long j2) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzasi(str, j2, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzasi> list = this.zzb;
        long j2 = list.size() == 0 ? 0L : ((zzasi) list.get(list.size() - 1)).zzc - ((zzasi) list.get(0)).zzc;
        if (j2 > 0) {
            long j3 = ((zzasi) list.get(0)).zzc;
            zzask.zzb("(%-4d ms) %s", Long.valueOf(j2), str);
            for (zzasi zzasiVar : list) {
                long j4 = zzasiVar.zzc;
                zzask.zzb("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(zzasiVar.zzb), zzasiVar.zza);
                j3 = j4;
            }
        }
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzask.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    zzasj() {
    }
}
