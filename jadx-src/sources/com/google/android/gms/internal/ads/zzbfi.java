package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbfi implements zzbdy {
    final /* synthetic */ zzbfl zza;

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z2) {
        if (z2) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }

    zzbfi(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }
}
