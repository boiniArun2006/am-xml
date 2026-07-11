package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbjk {
    public static final zzbio zza = zzbio.zza("gads:adapter_initialization:red_button", false);
    public static final zzbio zzb = zzbio.zza("gads:adapter_settings:red_button", false);
    public static final zzbio zzc;
    public static final zzbio zzd;
    public static final zzbio zze;
    public static final zzbio zzf;
    public static final zzbio zzg;

    static {
        zzbio.zza("gads:ads_service_force_stop:red_button", true);
        zzc = zzbio.zza("gads:mediation_serving_domain:red_button", false);
        zzd = zzbio.zza("gads:banner_refresh_sequential_caching:red_button", false);
        zzbio.zza("gads:ad_serving:enabled", true);
        zzbio.zza("gads:ad_preloading:enabled", true);
        zze = zzbio.zza("gads:adaptive_banner:fail_invalid_ad_size", true);
        zzbio.zza("gads:return_null_ads_preloader_from_remote_creator", false);
        zzbio.zza("gads:sdk_use_dynamic_module", true);
        zzf = zzbio.zza("gads:signal_adapters:red_button", false);
        zzg = zzbio.zza("gads:use_non_templated_client_sdkcore:enabled", false);
        zzbio.zza("gads:use_non_templated_mediation_client_sdkcore:enabled", false);
    }
}
