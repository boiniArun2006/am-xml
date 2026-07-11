package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcwv {
    private final zzfjc zza;
    private final zzfir zzb;
    private final String zzc;

    public zzcwv(zzfjc zzfjcVar, zzfir zzfirVar, @Nullable String str) {
        this.zza = zzfjcVar;
        this.zzb = zzfirVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfjc zza() {
        return this.zza;
    }

    public final zzfir zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final zzfiu zzc() {
        return this.zza.zzb.zzb;
    }
}
