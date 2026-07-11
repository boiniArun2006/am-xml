package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzddy extends zzdhd {
    private boolean zzb;

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(zzddx.zza);
        this.zzb = true;
    }

    @VisibleForTesting
    public zzddy(Set set) {
        super(set);
        this.zzb = false;
    }
}
