package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzggg implements zzgha {
    private final Map zza;
    private final zzawg zzb;
    private final zzgoc zzc;
    private final long zzd;

    public final Void zza() throws Exception {
        zzaxg zzaxgVar;
        try {
            try {
                this.zzc.zza();
                com.google.common.util.concurrent.Xo xo = (com.google.common.util.concurrent.Xo) this.zza.get("gs");
                if (xo != null && (zzaxgVar = (zzaxg) xo.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzawg zzawgVar = this.zzb;
                    synchronized (zzawgVar) {
                        zzawgVar.zzad(zzaxgVar.zzh());
                        zzawgVar.zzN(zzaxgVar.zzd());
                    }
                }
            } catch (Throwable th) {
                this.zzc.zzc();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e2) {
            this.zzc.zzb(e2);
        }
        this.zzc.zzc();
        return null;
    }

    zzggg(zzawg zzawgVar, Map map, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        this.zza = map;
        this.zzb = zzawgVar;
        this.zzc = zzgoeVar.zza(112);
        this.zzd = zzgbfVar.zzj();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zza();
        return null;
    }
}
