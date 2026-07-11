package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdnd {
    private final JSONObject zza;
    private final zzdtk zzb;

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zzc;

    @Nullable
    private final zzcce zzd;

    public zzdnd(JSONObject jSONObject, zzdtk zzdtkVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzcce zzcceVar) {
        this.zza = jSONObject;
        this.zzb = zzdtkVar;
        this.zzc = zzbVar;
        this.zzd = zzcceVar;
    }

    @Nullable
    final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    @Nullable
    final zzcce zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdtk zzd() {
        return this.zzb;
    }
}
