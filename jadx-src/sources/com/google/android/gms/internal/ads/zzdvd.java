package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdvd implements zzdca {

    @Nullable
    private final zzcjl zza;

    zzdvd(@Nullable zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zza(@Nullable Context context) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzb(@Nullable Context context) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzc(@Nullable Context context) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
        }
    }
}
