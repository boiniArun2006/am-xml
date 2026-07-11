package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzib {
    private static long zza(byte[] bArr, int i2, int i3) {
        return (zza(bArr, i2) >> i3) & 67108863;
    }

    private static long zza(byte[] bArr, int i2) {
        return ((long) (((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16))) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j2);
            i3++;
            j2 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long jZza = zza(bArr, 0, 0) & 67108863;
            long jZza2 = zza(bArr, 3, 2) & 67108611;
            long jZza3 = zza(bArr, 6, 4) & 67092735;
            long jZza4 = zza(bArr, 9, 6) & 66076671;
            long jZza5 = zza(bArr, 12, 8) & 1048575;
            long j2 = jZza2 * 5;
            long j3 = jZza3 * 5;
            long j4 = jZza4 * 5;
            long j5 = jZza5 * 5;
            int i2 = 17;
            byte[] bArr3 = new byte[17];
            long j6 = 0;
            int i3 = 0;
            long j7 = 0;
            long j9 = 0;
            long j10 = 0;
            long j11 = 0;
            while (i3 < bArr2.length) {
                int iMin = Math.min(16, bArr2.length - i3);
                System.arraycopy(bArr2, i3, bArr3, 0, iMin);
                bArr3[iMin] = 1;
                if (iMin != 16) {
                    Arrays.fill(bArr3, iMin + 1, i2, (byte) 0);
                }
                long jZza6 = j11 + zza(bArr3, 0, 0);
                long jZza7 = j6 + zza(bArr3, 3, 2);
                long jZza8 = j7 + zza(bArr3, 6, 4);
                long jZza9 = j9 + zza(bArr3, 9, 6);
                long jZza10 = j10 + (zza(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
                long j12 = (jZza6 * jZza) + (jZza7 * j5) + (jZza8 * j4) + (jZza9 * j3) + (jZza10 * j2);
                long j13 = (jZza6 * jZza2) + (jZza7 * jZza) + (jZza8 * j5) + (jZza9 * j4) + (jZza10 * j3);
                long j14 = (jZza6 * jZza3) + (jZza7 * jZza2) + (jZza8 * jZza) + (jZza9 * j5) + (jZza10 * j4);
                long j15 = (jZza6 * jZza4) + (jZza7 * jZza3) + (jZza8 * jZza2) + (jZza9 * jZza) + (jZza10 * j5);
                long j16 = j13 + (j12 >> 26);
                long j17 = j14 + (j16 >> 26);
                long j18 = j15 + (j17 >> 26);
                long j19 = (jZza6 * jZza5) + (jZza7 * jZza4) + (jZza8 * jZza3) + (jZza9 * jZza2) + (jZza10 * jZza) + (j18 >> 26);
                long j20 = (j12 & 67108863) + ((j19 >> 26) * 5);
                j6 = (j16 & 67108863) + (j20 >> 26);
                i3 += 16;
                j7 = j17 & 67108863;
                j9 = j18 & 67108863;
                j10 = j19 & 67108863;
                i2 = 17;
                j11 = j20 & 67108863;
            }
            long j21 = j7 + (j6 >> 26);
            long j22 = j21 & 67108863;
            long j23 = j9 + (j21 >> 26);
            long j24 = j23 & 67108863;
            long j25 = j10 + (j23 >> 26);
            long j26 = j25 & 67108863;
            long j27 = j11 + ((j25 >> 26) * 5);
            long j28 = j27 & 67108863;
            long j29 = (j6 & 67108863) + (j27 >> 26);
            long j30 = j28 + 5;
            long j31 = j30 & 67108863;
            long j32 = (j30 >> 26) + j29;
            long j33 = j22 + (j32 >> 26);
            long j34 = j24 + (j33 >> 26);
            long j35 = (j26 + (j34 >> 26)) - 67108864;
            long j36 = j35 >> 63;
            long j37 = ~j36;
            long j38 = (j29 & j36) | (j32 & 67108863 & j37);
            long j39 = (j22 & j36) | (j33 & 67108863 & j37);
            long j40 = (j24 & j36) | (j34 & 67108863 & j37);
            long j41 = ((j38 << 26) | (j28 & j36) | (j31 & j37)) & 4294967295L;
            long j42 = ((j38 >> 6) | (j39 << 20)) & 4294967295L;
            long j43 = ((j39 >> 12) | (j40 << 14)) & 4294967295L;
            long j44 = ((((j35 & j37) | (j26 & j36)) << 8) | (j40 >> 18)) & 4294967295L;
            long jZza11 = j41 + zza(bArr, 16);
            long j45 = jZza11 & 4294967295L;
            long jZza12 = j42 + zza(bArr, 20) + (jZza11 >> 32);
            long jZza13 = j43 + zza(bArr, 24) + (jZza12 >> 32);
            long jZza14 = (j44 + zza(bArr, 28) + (jZza13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j45, 0);
            zza(bArr4, jZza12 & 4294967295L, 4);
            zza(bArr4, jZza13 & 4294967295L, 8);
            zza(bArr4, jZza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
