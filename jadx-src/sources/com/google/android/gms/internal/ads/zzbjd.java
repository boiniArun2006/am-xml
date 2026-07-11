package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbjd {
    public static final zzbio zza = new zzbio("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbio zzb = new zzbio("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbio zzc = zzbio.zzb("gads:gma_attestation:click:timeout", 2000);
    public static final zzbio zzd = zzbio.zza("gads:gma_attestation:click:enable", false);
    public static final zzbio zze = zzbio.zzb("gads:gma_attestation:click:enable_dynamite_version", 213806100);
    public static final zzbio zzf = zzbio.zza("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbio zzg = zzbio.zza("gads:gma_attestation:image_hash", false);
    public static final zzbio zzh = zzbio.zza("gads:gma_attestation:impression:enable", false);
    public static final zzbio zzi;

    static {
        zzbio.zza("gads:gma_attestation:request:enable_javascript", false);
        zzbio.zza("gads:gma_attestation:request:enable", true);
        zzi = zzbio.zza("gads:gma_attestation:click:report_error", true);
    }
}
