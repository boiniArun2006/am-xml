package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfsx {
    private final String zza;
    private final String zzb;

    private zzfsx(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public static zzfsx zza(String str, String str2) {
        zzfuh.zzc(str, "Name is null or empty");
        zzfuh.zzc(str2, "Version is null or empty");
        return new zzfsx(str, str2);
    }
}
