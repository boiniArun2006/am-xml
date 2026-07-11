package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzfap implements zzfax {
    private final boolean zza;

    zzfap(@Nullable zzfgn zzfgnVar) {
        this.zza = zzfgnVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        return zzgzo.zza(new zzfao(this.zza, null));
    }
}
