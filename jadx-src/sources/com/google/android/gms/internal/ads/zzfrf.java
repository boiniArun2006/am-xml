package com.google.android.gms.internal.ads;

import WJ.phkN.HFAkacKHsU;
import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.mediation.AppLovinUtils;
import com.google.android.gms.ads.AdFormat;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfrf {
    private final zzdxz zza;

    zzfrf(zzdxz zzdxzVar, Context context) {
        this.zza = zzdxzVar;
    }

    public final void zze(long j2, String str) {
        zzu("poll_ad", "ppacwe_ts", j2, -1, -1, null, null, "2");
    }

    public final void zzj(long j2, zzfrm zzfrmVar, int i2, String str) {
        zzu("pae", "paeo_ts", j2, i2, 0, null, zzfrmVar, str);
    }

    public final void zzl(long j2, AdFormat adFormat, int i2) {
        zzt("pda", j2, null, null, adFormat, -1, -1, i2, "2");
    }

    public final void zzn(AdFormat adFormat, long j2, int i2) {
        zzt("pgcs", j2, null, null, adFormat, -1, -1, i2, "2");
    }

    private final void zzt(String str, long j2, @Nullable String str2, @Nullable String str3, AdFormat adFormat, int i2, int i3, int i5, String str4) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc(FileUploadManager.f61572j, str);
        zzdxyVarZza.zzc("pat", Long.toString(j2));
        zzdxyVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdxyVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i3));
        zzdxyVarZza.zzc("pas", Integer.toString(i5));
        zzdxyVarZza.zzc("pv", "2");
        zzdxyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str3);
        zzdxyVarZza.zzc("pid", str2);
        zzdxyVarZza.zzd();
    }

    private final void zzu(@Nullable String str, String str2, long j2, int i2, int i3, @Nullable String str3, @Nullable zzfrm zzfrmVar, String str4) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc(str2, Long.toString(j2));
        if (zzfrmVar != null) {
            zzdxyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfrmVar.zza());
            zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
            zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        }
        zzdxyVarZza.zzc(FileUploadManager.f61572j, str);
        if (str3 != null) {
            zzdxyVarZza.zzc("gqi", str3);
        }
        if (i2 >= 0) {
            zzdxyVarZza.zzc("max_ads", Integer.toString(i2));
        }
        if (i3 >= 0) {
            zzdxyVarZza.zzc("cache_size", Integer.toString(i3));
        }
        zzdxyVarZza.zzc("pv", str4);
        zzdxyVarZza.zzd();
    }

    private final void zzv(String str, long j2, String str2, String str3, @Nullable AdFormat adFormat, int i2, int i3, int i5, int i7, int i8) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc(FileUploadManager.f61572j, str);
        zzdxyVarZza.zzc("pat", Long.toString(j2));
        zzdxyVarZza.zzc("pid", str2);
        zzdxyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str3);
        zzdxyVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i3));
        zzdxyVarZza.zzc("tpcnt", Integer.toString(i7));
        zzdxyVarZza.zzc("mpl", Integer.toString(i8));
        if (adFormat != null) {
            zzdxyVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i5 > 0) {
            zzdxyVarZza.zzc("nptr", Integer.toString(i5));
        }
        zzdxyVarZza.zzd();
    }

    public final void zza(int i2, long j2, zzfrm zzfrmVar, String str) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc(FileUploadManager.f61572j, "start_preload");
        zzdxyVarZza.zzc("sp_ts", Long.toString(j2));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxyVarZza.zzc("pv", str);
        zzdxyVarZza.zzd();
    }

    public final void zzb(Map map, long j2, String str) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc(FileUploadManager.f61572j, "start_preload");
        zzdxyVarZza.zzc("sp_ts", Long.toString(j2));
        zzdxyVarZza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdxyVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdxyVarZza.zzd();
    }

    public final void zzc(int i2, int i3, long j2, zzfrm zzfrmVar) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc(FileUploadManager.f61572j, HFAkacKHsU.xfbBTipdK);
        zzdxyVarZza.zzc("cs_ts", Long.toString(j2));
        zzdxyVarZza.zzc("orig_ma", Integer.toString(i2));
        zzdxyVarZza.zzc("max_ads", Integer.toString(i3));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("pv", "1");
        zzdxyVarZza.zzd();
    }

    public final void zzd(int i2, int i3, long j2, @Nullable Long l2, @Nullable String str, @Nullable zzfrm zzfrmVar, String str2) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("plaac_ts", Long.toString(j2));
        zzdxyVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i3));
        zzdxyVarZza.zzc(FileUploadManager.f61572j, "is_ad_available");
        if (zzfrmVar != null) {
            zzdxyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfrmVar.zza());
            zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
            zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        }
        if (l2 != null) {
            zzdxyVarZza.zzc("plaay_ts", Long.toString(l2.longValue()));
        }
        if (str != null) {
            zzdxyVarZza.zzc("gqi", str);
        }
        zzdxyVarZza.zzc("pv", str2);
        zzdxyVarZza.zzd();
    }

    public final void zzf(long j2, zzfrm zzfrmVar, int i2, int i3, String str) {
        zzu("poll_ad", "ppac_ts", j2, i2, i3, null, zzfrmVar, str);
    }

    public final void zzg(long j2, int i2, int i3, String str, zzfrm zzfrmVar, String str2) {
        zzu("poll_ad", "psvroc_ts", j2, i2, i3, str, zzfrmVar, str2);
    }

    public final void zzh(long j2, int i2, int i3, @Nullable String str, zzfrm zzfrmVar, String str2) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("ppla_ts", Long.toString(j2));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i3));
        zzdxyVarZza.zzc(FileUploadManager.f61572j, "poll_ad");
        if (str != null) {
            zzdxyVarZza.zzc("gqi", str);
        }
        zzdxyVarZza.zzc("pv", str2);
        zzdxyVarZza.zzd();
    }

    public final void zzi(long j2, @Nullable String str, zzfrm zzfrmVar, int i2, int i3, String str2) {
        zzu("paa", "pano_ts", j2, i2, i3, str, zzfrmVar, str2);
    }

    public final void zzk(long j2, zzfrm zzfrmVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i2, int i3, String str) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc(FileUploadManager.f61572j, "pftla");
        zzdxyVarZza.zzc("pftlat_ts", Long.toString(j2));
        zzdxyVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i3));
        zzdxyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("pv", str);
        zzdxyVarZza.zzd();
    }

    public final void zzm(long j2, String str, String str2, AdFormat adFormat, int i2, int i3) {
        zzt("pd", j2, str, str2, adFormat, i2, i3, 1, "2");
    }

    public final void zzo(long j2, String str, @Nullable String str2, AdFormat adFormat, int i2, int i3) {
        zzt("pgc", j2, str, str2, adFormat, i2, i3, 1, "2");
    }

    public final void zzp(int i2, long j2, String str, @Nullable String str2, AdFormat adFormat, int i3) {
        zzt("pnav", j2, str, str2, adFormat, i3, i2, 1, "2");
    }

    public final void zzq(long j2, String str, String str2, @Nullable AdFormat adFormat, int i2, int i3, int i5, int i7) {
        zzv("acmpa", j2, str, str2, adFormat, i2, i3, 0, i5, i7);
    }

    public final void zzr(long j2, String str, String str2, @Nullable AdFormat adFormat, int i2, int i3, int i5, int i7, int i8) {
        zzv("acmpr", j2, str, str2, adFormat, i2, i3, i5, i7, i8);
    }

    public final void zzs(long j2, int i2, int i3) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc(FileUploadManager.f61572j, "acmlr");
        zzdxyVarZza.zzc("pat", Long.toString(j2));
        zzdxyVarZza.zzc("mpl", Integer.toString(i2));
        zzdxyVarZza.zzc("pas", Integer.toString(i3));
        zzdxyVarZza.zzd();
    }
}
