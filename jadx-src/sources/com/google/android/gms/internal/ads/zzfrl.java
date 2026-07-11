package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfrl {
    private final String zza;

    @Nullable
    private final AdFormat zzb;

    @Nullable
    private String zzc;

    public zzfrl(String str, @Nullable AdFormat adFormat) {
        this.zza = str;
        this.zzb = adFormat;
    }

    public final zzfrl zza(String str) {
        this.zzc = str;
        return this;
    }

    final /* synthetic */ String zzb() {
        return this.zza;
    }

    final /* synthetic */ AdFormat zzc() {
        return this.zzb;
    }

    final /* synthetic */ String zzd() {
        return this.zzc;
    }
}
