package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbjs {
    public static final zzbio zza;

    static {
        zzbio.zzb("gads:ad_loader:timeout_ms", 60000L);
        zza = zzbio.zzb("gads:rendering:timeout_ms", 60000L);
        zzbio.zzb("gads:resolve_future:default_timeout_ms", 30000L);
    }
}
