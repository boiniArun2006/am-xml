package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaku implements zzafy {
    private final long zza;
    private final zzakv[] zzb;
    private final int zzc;

    public zzaku(long j2, zzakv[] zzakvVarArr, int i2) {
        this.zza = j2;
        this.zzb = zzakvVarArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzafw zzc(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        int i2;
        int iZzb;
        zzakv[] zzakvVarArr = this.zzb;
        if (zzakvVarArr.length == 0) {
            zzafz zzafzVar = zzafz.zza;
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i3 = this.zzc;
        if (i3 != -1) {
            zzalf zzalfVar = zzakvVarArr[i3].zzb;
            int iZzl = zzakw.zzl(zzalfVar, j2);
            if (iZzl == -1) {
                zzafz zzafzVar2 = zzafz.zza;
                return new zzafw(zzafzVar2, zzafzVar2);
            }
            long[] jArr = zzalfVar.zzf;
            j4 = jArr[iZzl];
            long[] jArr2 = zzalfVar.zzc;
            j3 = jArr2[iZzl];
            if (j4 < j2 && iZzl < zzalfVar.zzb - 1 && (iZzb = zzalfVar.zzb(j2)) != -1 && iZzb != iZzl) {
                j5 = jArr[iZzb];
                j6 = jArr2[iZzb];
            }
            long jZzh = j3;
            long jZzh2 = j6;
            for (i2 = 0; i2 < zzakvVarArr.length; i2++) {
                if (i2 != i3) {
                    zzalf zzalfVar2 = zzakvVarArr[i2].zzb;
                    jZzh = zzakw.zzh(zzalfVar2, j4, jZzh);
                    if (j5 != -9223372036854775807L) {
                        jZzh2 = zzakw.zzh(zzalfVar2, j5, jZzh2);
                    }
                }
            }
            zzafz zzafzVar3 = new zzafz(j4, jZzh);
            return j5 != -9223372036854775807L ? new zzafw(zzafzVar3, zzafzVar3) : new zzafw(zzafzVar3, new zzafz(j5, jZzh2));
        }
        j3 = Long.MAX_VALUE;
        j4 = j2;
        j5 = -9223372036854775807L;
        j6 = -1;
        long jZzh3 = j3;
        long jZzh22 = j6;
        while (i2 < zzakvVarArr.length) {
        }
        zzafz zzafzVar32 = new zzafz(j4, jZzh3);
        if (j5 != -9223372036854775807L) {
        }
    }
}
