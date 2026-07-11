package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzglp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzglp(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzglp zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzglp(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzgdc zzgdcVar = (zzgdc) this.zzb.zzb();
        final zzgoe zzgoeVar = (zzgoe) this.zzc.zzb();
        return zzgdcVar.zzb(file, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.zzglh
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                zzgoeVar.zzd(15310, (Throwable) obj);
                return new byte[0];
            }
        });
    }
}
