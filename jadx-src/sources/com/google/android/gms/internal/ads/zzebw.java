package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzebw extends AdListener {
    final /* synthetic */ zzecc zza;

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzg(zzecc.zzm(loadAdError));
    }

    zzebw(zzecc zzeccVar) {
        Objects.requireNonNull(zzeccVar);
        this.zza = zzeccVar;
    }
}
