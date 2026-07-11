package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgoe {
    private final zzgdh zza;
    private final zzgao zzb;

    zzgoe(zzgao zzgaoVar, zzgdh zzgdhVar) {
        this.zza = zzgdhVar;
        this.zzb = zzgaoVar;
    }

    public final zzgoc zza(int i2) {
        return new zzgoc(i2, this.zzb, this.zza);
    }

    public final void zzb(int i2) {
        this.zza.zzb(i2 - 1, -1L, null, null);
    }

    public final void zzc(int i2, String str) {
        this.zza.zzb(i2 - 1, -1L, null, str);
    }

    public final void zzd(int i2, Throwable th) {
        this.zza.zzb(i2 - 1, -1L, th, null);
    }

    public final com.google.common.util.concurrent.Xo zze(int i2, com.google.common.util.concurrent.Xo xo) {
        zzgoc zzgocVarZza = zza(i2);
        zzgocVarZza.zza();
        zzgzo.zzr(xo, new zzgod(this, zzgocVarZza), zzhaf.zza());
        return xo;
    }

    public final void zzf(int i2, Runnable runnable) {
        try {
            zza(i2).zza();
            runnable.run();
        } finally {
        }
    }
}
