package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhhk {
    private static void zzd(byte[] bArr, long j2, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) (255 & j2);
            j2 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzc = zzc(bArr, 0, 0);
        long jZzc2 = zzc(bArr, 3, 2) & 67108611;
        long jZzc3 = zzc(bArr, 6, 4) & 67092735;
        long jZzc4 = zzc(bArr, 9, 6) & 66076671;
        long jZzc5 = zzc(bArr, 12, 8) & 1048575;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j7 = j2 + (j3 >> 26);
                long j9 = j7 & 67108863;
                long j10 = j4 + (j7 >> 26);
                long j11 = j10 & 67108863;
                long j12 = j5 + (j10 >> 26);
                long j13 = j12 & 67108863;
                long j14 = j6 + ((j12 >> 26) * 5);
                long j15 = j14 & 67108863;
                long j16 = j15 + 5;
                long j17 = (j3 & 67108863) + (j14 >> 26);
                long j18 = j17 + (j16 >> 26);
                long j19 = (j18 >> 26) + j9;
                long j20 = j11 + (j19 >> 26);
                long j21 = (j13 + (j20 >> 26)) - 67108864;
                long j22 = j21 >> 63;
                long j23 = ~j22;
                long j24 = (j17 & j22) | (j18 & 67108863 & j23);
                long j25 = (j9 & j22) | (j19 & 67108863 & j23);
                long j26 = (j11 & j22) | (j20 & 67108863 & j23);
                long j27 = (j13 & j22) | (j21 & j23);
                long jZzb = (((j22 & j15) | (j16 & 67108863 & j23) | (j24 << 26)) & 4294967295L) + zzb(bArr, 16);
                long jZzb2 = (((j24 >> 6) | (j25 << 20)) & 4294967295L) + zzb(bArr, 20);
                long jZzb3 = (((j25 >> 12) | (j26 << 14)) & 4294967295L) + zzb(bArr, 24);
                long jZzb4 = (((j26 >> 18) | (j27 << 8)) & 4294967295L) + zzb(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzb & 4294967295L, 0);
                long j28 = jZzb2 + (jZzb >> 32);
                zzd(bArr4, j28 & 4294967295L, 4);
                long j29 = jZzb3 + (j28 >> 32);
                zzd(bArr4, j29 & 4294967295L, 8);
                zzd(bArr4, (jZzb4 + (j29 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i2, (byte) 0);
            }
            long j30 = jZzc5 * 5;
            long j31 = jZzc4 * 5;
            long j32 = jZzc3 * 5;
            long jZzc6 = j6 + zzc(bArr3, 0, 0);
            long jZzc7 = j3 + zzc(bArr3, 3, 2);
            long jZzc8 = j2 + zzc(bArr3, 6, 4);
            long jZzc9 = j4 + zzc(bArr3, 9, 6);
            long jZzc10 = j5 + (zzc(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j33 = jZzc7 * jZzc;
            long j34 = jZzc7 * jZzc2;
            long j35 = jZzc7 * jZzc3;
            long j36 = jZzc9 * jZzc;
            long j37 = jZzc7 * jZzc4;
            long j38 = jZzc10 * jZzc;
            long j39 = (jZzc6 * jZzc) + (jZzc7 * j30) + (jZzc8 * j31) + (jZzc9 * j32) + (jZzc2 * 5 * jZzc10);
            long j40 = (jZzc6 * jZzc2) + j33 + (jZzc8 * j30) + (jZzc9 * j31) + (j32 * jZzc10) + (j39 >> 26);
            long j41 = (jZzc6 * jZzc3) + j34 + (jZzc8 * jZzc) + (jZzc9 * j30) + (j31 * jZzc10) + (j40 >> 26);
            long j42 = (jZzc6 * jZzc4) + j35 + (jZzc8 * jZzc2) + j36 + (jZzc10 * j30) + (j41 >> 26);
            long j43 = (jZzc6 * jZzc5) + j37 + (jZzc8 * jZzc3) + (jZzc9 * jZzc2) + j38 + (j42 >> 26);
            long j44 = (j39 & 67108863) + ((j43 >> 26) * 5);
            j3 = (j40 & 67108863) + (j44 >> 26);
            i3 += 16;
            j2 = j41 & 67108863;
            j4 = j42 & 67108863;
            j5 = j43 & 67108863;
            i2 = 17;
            j6 = j44 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i2) {
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i7 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((long) (((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16))) & 4294967295L;
    }

    private static long zzc(byte[] bArr, int i2, int i3) {
        return (zzb(bArr, i2) >> i3) & 67108863;
    }
}
