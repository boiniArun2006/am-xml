package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzfs extends zzds {

    @Nullable
    private final OnPaidEventListener zza;

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final boolean zzf() {
        return this.zza == null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(zzt zztVar) {
        OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zztVar.zzb, zztVar.zzc, zztVar.zzd));
        }
    }

    public zzfs(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }
}
