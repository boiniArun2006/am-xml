package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgfd implements zzikg {
    private final zzikp zza;

    private zzgfd(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgfd zza(zzikp zzikpVar) {
        return new zzgfd(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.zza.zzb()).getResources().getDisplayMetrics();
        zziko.zzb(displayMetrics);
        return displayMetrics;
    }
}
