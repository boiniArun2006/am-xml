package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgmq implements zzikg {
    private final zzikp zza;

    private zzgmq(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgmq zza(zzikp zzikpVar) {
        return new zzgmq(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "ocs"), "pcbc");
    }
}
