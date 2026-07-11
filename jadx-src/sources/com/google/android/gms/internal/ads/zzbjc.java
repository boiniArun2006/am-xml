package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbjc {
    public static final zzbio zza = zzbio.zza("gads:init:init_on_bg_thread", true);
    public static final zzbio zzb = zzbio.zza("gads:init:init_on_single_bg_thread", false);
    public static final zzbio zzc = zzbio.zza("gads:adloader_load_bg_thread", true);
    public static final zzbio zzd = zzbio.zza("gads:appopen_load_on_bg_thread", true);
    public static final zzbio zze = zzbio.zza("gads:banner_destroy_bg_thread", false);
    public static final zzbio zzf = zzbio.zza("gads:banner_load_bg_thread", true);
    public static final zzbio zzg = zzbio.zza("gads:banner_pause_bg_thread", false);
    public static final zzbio zzh = zzbio.zza("gads:banner_resume_bg_thread", false);
    public static final zzbio zzi = zzbio.zza("gads:interstitial_load_on_bg_thread", true);
    public static final zzbio zzj;
    public static final zzbio zzk;

    static {
        zzbio.zza("gads:persist_flags_on_bg_thread", true);
        zzj = zzbio.zza("gads:query_info_bg_thread", true);
        zzk = zzbio.zza("gads:rewarded_load_bg_thread", true);
    }
}
