package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaff implements zzafy {
    private final zzafh zza;
    private final long zzb;

    public zzaff(zzafh zzafhVar, long j2) {
        this.zza = zzafhVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    private final zzafz zzd(long j2, long j3) {
        return new zzafz((j2 * 1000000) / ((long) this.zza.zze), this.zzb + j3);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        zzafh zzafhVar = this.zza;
        zzafg zzafgVar = zzafhVar.zzk;
        zzafgVar.getClass();
        long jZzb = zzafhVar.zzb(j2);
        long[] jArr = zzafgVar.zza;
        int iZzm = zzfj.zzm(jArr, jZzb, true, false);
        long j3 = iZzm == -1 ? 0L : jArr[iZzm];
        long[] jArr2 = zzafgVar.zzb;
        zzafz zzafzVarZzd = zzd(j3, iZzm != -1 ? jArr2[iZzm] : 0L);
        if (zzafzVarZzd.zzb == j2 || iZzm == jArr.length - 1) {
            return new zzafw(zzafzVarZzd, zzafzVarZzd);
        }
        int i2 = iZzm + 1;
        return new zzafw(zzafzVarZzd, zzd(jArr[i2], jArr2[i2]));
    }
}
