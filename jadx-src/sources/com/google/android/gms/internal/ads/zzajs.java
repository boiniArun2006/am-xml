package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzajs implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajs(long[] jArr, long[] jArr2, long j2, long j3, long j4, int i2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j2;
        this.zzd = j4;
        this.zze = i2;
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
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zze;
    }

    @Nullable
    public static zzajs zzd(long j2, long j3, zzafr zzafrVar, zzer zzerVar) {
        int iZzs;
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzk(6);
        int iZzB = zzerVar2.zzB();
        long j4 = zzafrVar.zzc;
        long j5 = iZzB;
        if (zzerVar2.zzB() <= 0) {
            return null;
        }
        long jZzr = zzfj.zzr((((long) r4) * ((long) zzafrVar.zzg)) - 1, zzafrVar.zzd);
        int iZzt = zzerVar2.zzt();
        int iZzt2 = zzerVar2.zzt();
        int iZzt3 = zzerVar2.zzt();
        zzerVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i2 = 0;
        long j6 = j3 + ((long) zzafrVar.zzc);
        while (i2 < iZzt) {
            long j7 = j4;
            jArr[i2] = (((long) i2) * jZzr) / ((long) iZzt);
            jArr2[i2] = j6;
            if (iZzt3 == 1) {
                iZzs = zzerVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzerVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzerVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzerVar2.zzH();
            }
            j6 += ((long) iZzs) * ((long) iZzt2);
            i2++;
            zzerVar2 = zzerVar;
            iZzt = iZzt;
            j4 = j7;
        }
        long j9 = j3 + j4;
        long jMax = j9 + j5;
        if (j2 != -1 && j2 != jMax) {
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 27 + String.valueOf(jMax).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j2);
            sb.append(", ");
            sb.append(jMax);
            zzee.zzc("VbriSeeker", sb.toString());
        }
        if (jMax != j6) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jMax).length() + 43 + String.valueOf(j6).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(jMax);
            sb2.append(", ");
            sb2.append(j6);
            sb2.append("\nSeeking will be inaccurate.");
            zzee.zzc("VbriSeeker", sb2.toString());
            jMax = Math.max(jMax, j6);
        }
        return new zzajs(jArr, jArr2, jZzr, j9, jMax, zzafrVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        long[] jArr = this.zza;
        int iZzm = zzfj.zzm(jArr, j2, true, true);
        long j3 = jArr[iZzm];
        long[] jArr2 = this.zzb;
        zzafz zzafzVar = new zzafz(j3, jArr2[iZzm]);
        if (zzafzVar.zzb >= j2 || iZzm == jArr.length - 1) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i2 = iZzm + 1;
        return new zzafw(zzafzVar, new zzafz(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j2) {
        return this.zza[zzfj.zzm(this.zzb, j2, true, true)];
    }
}
