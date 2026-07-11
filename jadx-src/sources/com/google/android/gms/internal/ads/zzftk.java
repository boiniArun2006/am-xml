package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzftk {
    private final zzfuy zza;
    private final String zzb;
    private final zzfsq zzc;
    private final String zzd = "Ad overlay";

    public final zzfuy zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzfsq zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public zzftk(View view, zzfsq zzfsqVar, @Nullable String str) {
        this.zza = new zzfuy(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfsqVar;
    }
}
