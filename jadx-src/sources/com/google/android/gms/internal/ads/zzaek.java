package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class zzaek implements zzafy {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return this.zzd != -1;
    }

    private static long zze(long j2, long j3, int i2) {
        return (Math.max(0L, j2 - j3) * 8000000) / ((long) i2);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        long j3 = this.zzd;
        if (j3 == -1) {
            zzafz zzafzVar = new zzafz(0L, this.zzb);
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j4 = ((long) this.zze) * j2;
        long j5 = this.zzc;
        long jMin = ((j4 / 8000000) / j5) * j5;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j5);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzd = zzd(jMax);
        zzafz zzafzVar2 = new zzafz(jZzd, jMax);
        if (j3 != -1 && jZzd < j2) {
            long j6 = jMax + j5;
            if (j6 < this.zza) {
                return new zzafw(zzafzVar2, new zzafz(zzd(j6), j6));
            }
        }
        return new zzafw(zzafzVar2, zzafzVar2);
    }

    public final long zzd(long j2) {
        return zze(j2, this.zzb, this.zze);
    }

    public zzaek(long j2, long j3, int i2, int i3, boolean z2) {
        long jZze;
        this.zza = j2;
        this.zzb = j3;
        this.zzc = i3 == -1 ? 1 : i3;
        this.zze = i2;
        if (j2 == -1) {
            this.zzd = -1L;
            jZze = -9223372036854775807L;
        } else {
            this.zzd = j2 - j3;
            jZze = zze(j2, j3, i2);
        }
        this.zzf = jZze;
    }
}
