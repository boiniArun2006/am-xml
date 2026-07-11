package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdcz extends zzdhd implements zzbmx {
    private final Bundle zzb;

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzs(zzdcy.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }

    zzdcz(Set set) {
        super(set);
        this.zzb = new Bundle();
    }
}
