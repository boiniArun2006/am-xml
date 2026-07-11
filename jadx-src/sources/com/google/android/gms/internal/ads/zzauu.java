package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzauu {
    public final ArrayDeque zza = new ArrayDeque();

    public zzauu(int i2) {
    }

    public final void zza(long j2, long j3, long j4) throws zzaus {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int i12 = i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9);
        zzaur zzaurVar = new zzaur(j2, j3, j4);
        ArrayDeque arrayDeque = this.zza;
        if (arrayDeque.size() >= ((i11 % 452867621) ^ i12)) {
            throw new zzaus();
        }
        arrayDeque.push(zzaurVar);
    }

    public final zzaur zzb() throws zzaut {
        return (zzaur) Optional.ofNullable((zzaur) this.zza.peek()).orElseThrow(zzauq.zza);
    }
}
