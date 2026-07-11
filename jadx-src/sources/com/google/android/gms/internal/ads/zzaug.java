package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Optional;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzaug {
    public static zzavg zza(final long j2) {
        return zzavg.zzf(new zzauy() { // from class: com.google.android.gms.internal.ads.zzauf
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((zzavb) obj).zzb.zzb(zzavg.zzb(j2));
                    return Optional.empty();
                } catch (zzauw unused) {
                    return Optional.of(zzatq.zza);
                }
            }
        });
    }

    public static int zzb(long j2, zzavf zzavfVar, boolean z2) throws IOException {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j9 = jArr[5];
        long j10 = jArr[6];
        long j11 = jArr[7];
        long j12 = j10 + (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j9);
        long j13 = j11 % 1629190168;
        int i2 = ((((~1725868784) & 388366538) | 739792167) + ((1725868784 & 1395525853) | 1087913783)) - 2073845026;
        int i3 = 1550046828 % 184366026;
        int i5 = ((((~84870791) & 719462960) | 688752780) + ((84870791 & 317383283) | 806209731)) - 1437974767;
        int i7 = 2023762697 % 959200313;
        int i8 = ((((~294151249) & 1465191424) | 201912514) + ((294151249 & 1398095366) | 75641662)) - 1330100008;
        int i9 = 1583887958 % 619175679;
        long j14 = z2 ? (j2 >> ((((((~1375552878) & 930005102) | 1249030018) + ((1375552878 & 1024213116) | 136481682)) - 2090967727) ^ (2014126950 % 228698447))) ^ (j2 + j2) : j2;
        int i10 = 1;
        while (true) {
            long j15 = j12 ^ j13;
            long j16 = j14 >>> (i5 ^ i7);
            boolean z3 = j16 != 0 || i10 < 0;
            int i11 = (int) (j14 & j15);
            if (z3) {
                int i12 = i2 ^ i3;
                i11 = ((i11 | (i8 ^ i9)) << i12) >> i12;
            }
            zzavfVar.zza((byte) i11);
            if (!z3) {
                return i10;
            }
            i10++;
            j14 = j16;
        }
    }
}
