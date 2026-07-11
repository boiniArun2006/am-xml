package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfg {

    @GuardedBy
    private long zza;

    @GuardedBy
    private long zzb;

    @GuardedBy
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public final synchronized long zza() {
        long j2 = this.zza;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j2;
    }

    public final synchronized long zzb() {
        long j2;
        try {
            j2 = this.zzc;
        } catch (Throwable th) {
            throw th;
        }
        return j2 != -9223372036854775807L ? j2 + this.zzb : zza();
    }

    public final synchronized long zzc() {
        return this.zzb;
    }

    public final synchronized void zzd(long j2) {
        this.zza = j2;
        this.zzb = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized long zze(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.zzc;
            if (j3 != -9223372036854775807L) {
                long jZzj = zzj(j3);
                long j4 = (4294967296L + jZzj) / 8589934592L;
                long j5 = (((-1) + j4) * 8589934592L) + j2;
                j2 += j4 * 8589934592L;
                if (Math.abs(j5 - jZzj) < Math.abs(j2 - jZzj)) {
                    j2 = j5;
                }
            }
            return zzg(zzi(j2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzf(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.zzc;
            if (j3 != -9223372036854775807L) {
                long jZzj = zzj(j3);
                long j4 = jZzj / 8589934592L;
                long j5 = (j4 * 8589934592L) + j2;
                j2 += (j4 + 1) * 8589934592L;
                if (j5 >= jZzj) {
                    j2 = j5;
                }
            }
            return zzg(zzi(j2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzg(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!zzh()) {
                long jLongValue = this.zza;
                if (jLongValue == 9223372036854775806L) {
                    Long l2 = (Long) this.zzd.get();
                    if (l2 == null) {
                        throw null;
                    }
                    jLongValue = l2.longValue();
                }
                this.zzb = jLongValue - j2;
                notifyAll();
            }
            this.zzc = j2;
            return j2 + this.zzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzh() {
        return this.zzb != -9223372036854775807L;
    }

    public zzfg(long j2) {
        zzd(0L);
    }

    public static long zzi(long j2) {
        return zzfj.zzt(j2, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzj(long j2) {
        return zzfj.zzt(j2, 90000L, 1000000L, RoundingMode.DOWN);
    }
}
