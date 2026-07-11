package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzah {
    private static final Object zza = new Object();
    private static volatile boolean zzb;
    private static volatile zzag zzc;
    private static volatile boolean zzd;
    private static volatile zzag zze;

    static void zza() {
        zzd = true;
    }

    static void zzb() {
        if (zze == null) {
            zze = new zzag(null);
        }
    }

    static void zzc() {
        if (zzc == null) {
            zzc = new zzag(null);
        }
    }

    static boolean zzd() {
        synchronized (zza) {
        }
        return false;
    }
}
