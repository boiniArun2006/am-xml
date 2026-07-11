package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzbio {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbio(String str, Object obj, int i2) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i2;
    }

    public static zzbio zzd(String str, String str2) {
        return new zzbio("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbio zza(String str, boolean z2) {
        return new zzbio(str, Boolean.valueOf(z2), 1);
    }

    public static zzbio zzb(String str, long j2) {
        return new zzbio(str, Long.valueOf(j2), 2);
    }

    public static zzbio zzc(String str, double d2) {
        return new zzbio(str, Double.valueOf(d2), 3);
    }

    public final Object zze() {
        zzbju zzbjuVarZza = zzbjw.zza();
        if (zzbjuVarZza == null) {
            if (zzbjw.zzb() != null) {
                zzbjw.zzb().zza();
            }
            return this.zzb;
        }
        int i2 = this.zzc - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return zzbjuVarZza.zzd(this.zza, (String) this.zzb);
                }
                return zzbjuVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zzbjuVarZza.zzb(this.zza, ((Long) this.zzb).longValue());
        }
        return zzbjuVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
