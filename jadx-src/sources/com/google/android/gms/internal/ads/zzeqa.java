package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzeqa implements zzdmc {
    final /* synthetic */ zzfir zza;

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z2, Context context, @Nullable zzdbs zzdbsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zza;
    }

    zzeqa(zzeqd zzeqdVar, zzfir zzfirVar) {
        this.zza = zzfirVar;
        Objects.requireNonNull(zzeqdVar);
    }
}
