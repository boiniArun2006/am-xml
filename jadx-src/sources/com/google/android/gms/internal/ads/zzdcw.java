package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdcw implements zzikg {
    private final zzikp zza;

    private zzdcw(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdcw zzc(zzikp zzikpVar) {
        return new zzdcw(zzikpVar);
    }

    public static zzdcv zzd(Set set) {
        return new zzdcv(set);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdcv zzb() {
        return new zzdcv(((zziks) this.zza).zzb());
    }
}
