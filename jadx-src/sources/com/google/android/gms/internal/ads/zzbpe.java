package com.google.android.gms.internal.ads;

import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
public final class zzbpe extends zzbpg {
    private final OnH5AdsEventListener zza;

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }

    public zzbpe(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }
}
