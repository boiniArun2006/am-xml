package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhet {
    public static final zzhet zza = new zzhet("ASSUME_AES_GCM");
    public static final zzhet zzb = new zzhet("ASSUME_XCHACHA20POLY1305");
    public static final zzhet zzc = new zzhet("ASSUME_CHACHA20POLY1305");
    public static final zzhet zzd = new zzhet("ASSUME_AES_CTR_HMAC");
    public static final zzhet zze = new zzhet("ASSUME_AES_EAX");
    public static final zzhet zzf = new zzhet("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzhet(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
