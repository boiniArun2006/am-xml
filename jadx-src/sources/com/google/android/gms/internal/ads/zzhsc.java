package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhsc {
    public static final zzhsc zza = new zzhsc("NIST_P256", zzhis.zza);
    public static final zzhsc zzb = new zzhsc("NIST_P384", zzhis.zzb);
    public static final zzhsc zzc = new zzhsc("NIST_P521", zzhis.zzc);
    private final String zzd;
    private final ECParameterSpec zze;

    private zzhsc(String str, ECParameterSpec eCParameterSpec) {
        this.zzd = str;
        this.zze = eCParameterSpec;
    }

    public final String toString() {
        return this.zzd;
    }

    public final ECParameterSpec zza() {
        return this.zze;
    }
}
