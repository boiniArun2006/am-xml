package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaei implements zzafy {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        int i2 = this.zza;
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i2);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        long[] jArr = this.zze;
        int iZzm = zzfj.zzm(jArr, j2, true, true);
        long j3 = jArr[iZzm];
        long[] jArr2 = this.zzc;
        zzafz zzafzVar = new zzafz(j3, jArr2[iZzm]);
        if (zzafzVar.zzb >= j2 || iZzm == this.zza - 1) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i2 = iZzm + 1;
        return new zzafw(zzafzVar, new zzafz(jArr[i2], jArr2[i2]));
    }

    public zzaei(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i2 = length - 1;
            this.zzf = jArr2[i2] + jArr3[i2];
        } else {
            this.zzf = 0L;
        }
    }
}
