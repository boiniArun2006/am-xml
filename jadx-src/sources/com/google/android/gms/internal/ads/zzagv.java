package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzagv implements zzagq {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzagv(int i2, int i3, int i5, int i7, int i8, int i9, int i10) {
        this.zza = i2;
        this.zzb = i5;
        this.zzc = i7;
        this.zzd = i8;
        this.zze = i9;
        this.zzf = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return 1752331379;
    }

    public final int zzc() {
        int i2 = this.zza;
        if (i2 == 1935960438) {
            return 2;
        }
        if (i2 == 1935963489) {
            return 1;
        }
        if (i2 == 1937012852) {
            return 3;
        }
        zzee.zzc("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i2))));
        return -1;
    }

    public final long zzd() {
        return zzfj.zzt(this.zzd, ((long) this.zzb) * 1000000, this.zzc, RoundingMode.DOWN);
    }

    public static zzagv zzb(zzer zzerVar) {
        int iZzC = zzerVar.zzC();
        zzerVar.zzk(12);
        int iZzC2 = zzerVar.zzC();
        int iZzC3 = zzerVar.zzC();
        int iZzC4 = zzerVar.zzC();
        zzerVar.zzk(4);
        int iZzC5 = zzerVar.zzC();
        int iZzC6 = zzerVar.zzC();
        zzerVar.zzk(4);
        return new zzagv(iZzC, iZzC2, iZzC3, iZzC4, iZzC5, iZzC6, zzerVar.zzC());
    }
}
