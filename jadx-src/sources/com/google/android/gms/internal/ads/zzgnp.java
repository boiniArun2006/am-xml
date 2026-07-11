package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgnp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgnp(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgnp zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgnp(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgno((Context) this.zza.zzb(), (ExecutorService) this.zzb.zzb());
    }
}
