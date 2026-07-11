package com.google.android.gms.internal.fido;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class zzeg {
    private static String zza = "com.google.android.gms.internal.fido.zzel";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.gms.internal.fido.zzel", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    protected abstract zzdp zze(String str);

    protected abstract zzef zzh();

    protected abstract String zzm();

    protected long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public static int zza() {
        return zzfm.zza();
    }

    public static long zzb() {
        return zzee.zza.zzc();
    }

    public static zzdp zzd(String str) {
        return zzee.zza.zze(str);
    }

    public static zzdr zzf() {
        return zzi().zza();
    }

    public static zzef zzg() {
        return zzee.zza.zzh();
    }

    public static zzev zzi() {
        return zzee.zza.zzj();
    }

    public static zzfi zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        return zzee.zza.zzm();
    }

    public static boolean zzn(String str, Level level, boolean z2) {
        zzi().zzd(str, level, z2);
        return false;
    }

    protected zzev zzj() {
        return zzev.zze();
    }
}
