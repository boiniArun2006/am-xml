package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzagw {
    private final zzagv zza;
    private final zzagh zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    private static int zzj(int i2, int i3) {
        return (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48) | i3;
    }

    public final boolean zzc(int i2) {
        return this.zzc == i2 || this.zzd == i2;
    }

    public final void zzd(int i2) {
        this.zzg = i2;
        this.zzh = i2;
    }

    private final long zzh(int i2) {
        return (this.zze * ((long) i2)) / ((long) this.zzf);
    }

    private final zzafz zzi(int i2) {
        return new zzafz(((long) this.zzn[i2]) * zzh(1), this.zzm[i2]);
    }

    public final void zza(long j2, boolean z2) {
        if (this.zzl == -1) {
            this.zzl = j2;
        }
        if (z2) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i2 = this.zzk;
            jArr2[i2] = j2;
            this.zzn[i2] = this.zzj;
            this.zzk = i2 + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i2;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i2 = this.zzk) <= 0) {
            return;
        }
        this.zzf = i2;
    }

    public final boolean zze(zzaev zzaevVar) throws IOException {
        int i2 = this.zzh;
        zzagh zzaghVar = this.zzb;
        int iZza = i2 - zzaghVar.zza(zzaevVar, i2, false);
        this.zzh = iZza;
        boolean z2 = iZza == 0;
        if (z2) {
            if (this.zzg > 0) {
                zzaghVar.zze(zzh(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z2;
    }

    public final void zzf(long j2) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzfj.zzm(this.zzm, j2, true, true)];
        }
    }

    public final zzafw zzg(long j2) {
        if (this.zzk == 0) {
            zzafz zzafzVar = new zzafz(0L, this.zzl);
            return new zzafw(zzafzVar, zzafzVar);
        }
        int iZzh = (int) (j2 / zzh(1));
        int iZzl = zzfj.zzl(this.zzn, iZzh, true, true);
        if (this.zzn[iZzl] == iZzh) {
            zzafz zzafzVarZzi = zzi(iZzl);
            return new zzafw(zzafzVarZzi, zzafzVarZzi);
        }
        zzafz zzafzVarZzi2 = zzi(iZzl);
        int i2 = iZzl + 1;
        return i2 < this.zzm.length ? new zzafw(zzafzVarZzi2, zzi(i2)) : new zzafw(zzafzVarZzi2, zzafzVarZzi2);
    }

    public zzagw(int i2, zzagv zzagvVar, zzagh zzaghVar) {
        int i3;
        int iZzj;
        this.zza = zzagvVar;
        int iZzc = zzagvVar.zzc();
        boolean z2 = true;
        if (iZzc != 1) {
            if (iZzc == 2) {
                iZzc = 2;
            } else {
                z2 = false;
            }
        }
        zzgrc.zza(z2);
        if (iZzc == 2) {
            i3 = 1667497984;
        } else {
            i3 = 1651965952;
        }
        this.zzc = zzj(i2, i3);
        this.zze = zzagvVar.zzd();
        this.zzb = zzaghVar;
        if (iZzc == 2) {
            iZzj = zzj(i2, 1650720768);
        } else {
            iZzj = -1;
        }
        this.zzd = iZzj;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzagvVar.zzd;
    }
}
