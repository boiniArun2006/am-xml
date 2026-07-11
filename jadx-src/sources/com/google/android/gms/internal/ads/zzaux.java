package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzaux {
    public final ArrayList zza = new ArrayList();
    public int zzb = 0;

    public zzaux(int i2) {
    }

    public final int zza(long j2) throws zzauv {
        long j3;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int i12 = i10 + (((((~i2) & i3) | i5) + ((i2 & i7) | i8)) - i9);
        int i13 = i11 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j9 = jArr[4];
        long j10 = jArr[5];
        long j11 = jArr[6];
        long j12 = jArr[7];
        long j13 = j11 + (((((~j4) & j5) | j6) + ((j4 & j7) | j9)) - j10);
        long j14 = j12 % 438792350;
        if (j2 >= 0) {
            j3 = ((long) (this.zzb + (i12 ^ i13))) - j2;
        } else {
            j3 = (j13 ^ j14) + (-j2);
        }
        if (j3 < 0 || j3 >= this.zzb) {
            throw new zzauv();
        }
        return (int) j3;
    }

    public final void zzb(zzavg zzavgVar) throws zzauw {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int i12 = i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9);
        int i13 = this.zzb;
        if (i13 >= ((i11 % 937558955) ^ i12)) {
            throw new zzauw();
        }
        ArrayList arrayList = this.zza;
        if (i13 == arrayList.size()) {
            arrayList.add(zzavgVar);
        } else {
            arrayList.set(this.zzb, zzavgVar);
        }
        this.zzb++;
    }

    public final zzavg zzc() throws zzauv {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int i12 = i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9);
        int i13 = i11 % 459541652;
        int i14 = this.zzb;
        if (i14 <= 0) {
            throw new zzauv();
        }
        int i15 = i13 ^ i12;
        ArrayList arrayList = this.zza;
        zzavg zzavgVar = (zzavg) arrayList.get(i14 + i15);
        arrayList.set(this.zzb + i15, null);
        this.zzb += i15;
        return zzavgVar;
    }

    public final zzavg zzd(long j2) throws zzauv {
        return (zzavg) this.zza.get(zza(j2));
    }

    public final void zze(long j2, zzavg zzavgVar) throws zzauv {
        this.zza.set(zza(j2), zzavgVar);
    }
}
