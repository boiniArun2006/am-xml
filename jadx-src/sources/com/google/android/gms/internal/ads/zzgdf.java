package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgdf {
    private final zzika zza;
    private final zzika zzb;
    private final ExecutorService zzc;
    private final zzika zzd;
    private com.google.common.util.concurrent.Xo zze = null;

    zzgdf(zzika zzikaVar, zzika zzikaVar2, ExecutorService executorService, zzika zzikaVar3) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = executorService;
        this.zzd = zzikaVar3;
    }

    public final synchronized com.google.common.util.concurrent.Xo zza() {
        try {
            com.google.common.util.concurrent.Xo xo = this.zze;
            if (xo != null) {
                return xo;
            }
            Set set = (Set) this.zzb.zzb();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzgdd) it.next()).zza());
            }
            zzgoe zzgoeVar = (zzgoe) this.zzd.zzb();
            com.google.common.util.concurrent.Xo xoZzk = zzgzo.zzk(zzgzo.zzm(arrayList), zzgde.zza, this.zzc);
            zzgoeVar.zze(2, xoZzk);
            this.zze = xoZzk;
            Iterator it2 = ((Set) this.zza.zzb()).iterator();
            while (it2.hasNext()) {
                ((zzgdd) it2.next()).zza();
            }
            com.google.common.util.concurrent.Xo xo2 = this.zze;
            if (xo2 != null) {
                return xo2;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized com.google.common.util.concurrent.Xo zzb() {
        com.google.common.util.concurrent.Xo xo;
        xo = this.zze;
        if (xo == null) {
            throw null;
        }
        return xo;
    }
}
