package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzevg implements zzfax {

    @Nullable
    private final zzffr zza;

    zzevg(@Nullable zzffr zzffrVar) {
        this.zza = zzffrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        zzffr zzffrVar = this.zza;
        if (zzffrVar == null) {
            return zzgzo.zza(new zzevf(null));
        }
        String strZza = zzffrVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzgzo.zza(new zzevf(null)) : zzgzo.zza(new zzevf(strZza));
    }
}
