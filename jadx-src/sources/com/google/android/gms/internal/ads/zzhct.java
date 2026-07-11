package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhct {
    public static final zzhct zza = new zzhct("SHA1");
    public static final zzhct zzb = new zzhct("SHA224");
    public static final zzhct zzc = new zzhct("SHA256");
    public static final zzhct zzd = new zzhct("SHA384");
    public static final zzhct zze = new zzhct("SHA512");
    private final String zzf;

    private zzhct(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
