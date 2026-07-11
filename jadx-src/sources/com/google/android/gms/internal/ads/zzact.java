package com.google.android.gms.internal.ads;

import android.util.Range;
import androidx.annotation.FloatRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzact {
    private long zza;
    private long zzb;
    private double zzc;
    private Range zzd;

    public final long zzb(long j2) {
        if (this.zza == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.zzb + ((j2 - r0) * this.zzc));
    }

    public final void zzc(@FloatRange float f3) {
        zzgrc.zza(f3 > 0.0f);
        this.zzd = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f3)));
        zzd();
    }

    public final void zzd() {
        this.zzc = ((Double) this.zzd.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }

    public zzact(@FloatRange float f3) {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.zzd = range;
        this.zzc = ((Double) range.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(long j2, long j3) {
        boolean z2;
        double dDoubleValue;
        boolean z3 = false;
        if (j2 != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        if (j3 != -9223372036854775807L) {
            z3 = true;
        }
        zzgrc.zza(z3);
        long j4 = this.zza;
        if (j4 != -9223372036854775807L) {
            if (this.zzb != -9223372036854775807L && j2 != j4) {
                dDoubleValue = (j3 - r4) / (j2 - j4);
            } else {
                dDoubleValue = ((Double) this.zzd.getUpper()).doubleValue();
            }
        }
        this.zzc = (this.zzc * 0.800000011920929d) + (((Double) this.zzd.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d);
        this.zza = j2;
        this.zzb = j3;
    }
}
