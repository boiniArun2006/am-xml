package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzajm implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private static Pair zzh(long j2, long[] jArr, long[] jArr2) {
        int iZzm = zzfj.zzm(jArr, j2, true, true);
        long j3 = jArr[iZzm];
        long j4 = jArr2[iZzm];
        int i2 = iZzm + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((jArr[i2] == j3 ? 0.0d : (j2 - j3) / (r6 - j3)) * (jArr2[i2] - j4))) + j4));
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return -2147483647;
    }

    public static zzajm zzd(long j2, zzaiq zzaiqVar, long j3) {
        int[] iArr = zzaiqVar.zzd;
        int length = iArr.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j2;
        long j4 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i5 = i3 - 1;
            j2 += (long) (zzaiqVar.zzb + iArr[i5]);
            j4 += (long) (zzaiqVar.zzc + zzaiqVar.zze[i5]);
            jArr[i3] = j2;
            jArr2[i3] = j4;
        }
        return new zzajm(jArr, jArr2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        String str = zzfj.zza;
        Pair pairZzh = zzh(zzfj.zzp(Math.max(0L, Math.min(j2, this.zzc))), this.zzb, this.zza);
        zzafz zzafzVar = new zzafz(zzfj.zzq(((Long) pairZzh.first).longValue()), ((Long) pairZzh.second).longValue());
        return new zzafw(zzafzVar, zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j2) {
        return zzfj.zzq(((Long) zzh(j2, this.zza, this.zzb).second).longValue());
    }

    private zzajm(long[] jArr, long[] jArr2, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j2 == -9223372036854775807L ? zzfj.zzq(jArr2[jArr2.length - 1]) : j2;
    }
}
