package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbjn {
    public static final zzbio zza = zzbio.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static final zzbio zzb = zzbio.zza("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbio zzc = new zzbio("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final zzbio zzd = new zzbio("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbio zze;
    public static final zzbio zzf;

    static {
        zzbio.zza("gads:sdk_crash_report_enabled", false);
        zze = zzbio.zza("gads:sdk_crash_report_full_stacktrace", false);
        zzf = zzbio.zzc("gads:trapped_exception_sample_rate", 0.01d);
    }
}
