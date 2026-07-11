package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzctv implements zzikg {
    private final zzctu zza;

    private zzctv(zzctu zzctuVar) {
        this.zza = zzctuVar;
    }

    public static zzctv zzc(zzctu zzctuVar) {
        return new zzctv(zzctuVar);
    }

    @Nullable
    public final ViewGroup zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
