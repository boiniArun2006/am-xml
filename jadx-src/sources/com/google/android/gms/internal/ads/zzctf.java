package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.FileUploadManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzctf {
    private final zzdxz zza;
    private final zzfjc zzb;

    zzctf(zzdxz zzdxzVar, zzfjc zzfjcVar) {
        this.zza = zzdxzVar;
        this.zzb = zzfjcVar;
    }

    public final void zza(long j2, int i2) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zza(this.zzb.zzb.zzb);
        zzdxyVarZza.zzc(FileUploadManager.f61572j, "ad_closed");
        zzdxyVarZza.zzc("show_time", String.valueOf(j2));
        zzdxyVarZza.zzc("ad_format", "app_open_ad");
        int i3 = i2 - 1;
        zzdxyVarZza.zzc("acr", i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : CmcdData.STREAMING_FORMAT_HLS);
        zzdxyVarZza.zzd();
    }
}
