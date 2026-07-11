package IFj;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Dsr {
    private static void O(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j2);
            i3++;
            j2 >>= 8;
        }
    }

    private static void rl(byte[] bArr, byte[] bArr2, int i2) {
        int iMin = Math.min(16, bArr2.length - i2);
        System.arraycopy(bArr2, i2, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }

    public static byte[] n(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jT2 = t(bArr, 0, 0) & 67108863;
        int i2 = 3;
        int i3 = 2;
        long jT3 = t(bArr, 3, 2) & 67108611;
        long jT4 = t(bArr, 6, 4) & 67092735;
        long jT5 = t(bArr, 9, 6) & 66076671;
        long jT6 = t(bArr, 12, 8) & 1048575;
        long j2 = jT3 * 5;
        long j3 = jT4 * 5;
        long j4 = jT5 * 5;
        long j5 = jT6 * 5;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        int i5 = 0;
        long j7 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        while (i5 < bArr2.length) {
            rl(bArr3, bArr2, i5);
            long jT7 = j11 + t(bArr3, 0, 0);
            long jT8 = j6 + t(bArr3, i2, i3);
            long jT9 = j7 + t(bArr3, 6, 4);
            long jT10 = j9 + t(bArr3, 9, 6);
            long j12 = jT3;
            long jT11 = j10 + (t(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j13 = (jT7 * jT2) + (jT8 * j5) + (jT9 * j4) + (jT10 * j3) + (jT11 * j2);
            long j14 = (jT7 * j12) + (jT8 * jT2) + (jT9 * j5) + (jT10 * j4) + (jT11 * j3);
            long j15 = (jT7 * jT4) + (jT8 * j12) + (jT9 * jT2) + (jT10 * j5) + (jT11 * j4);
            long j16 = (jT7 * jT5) + (jT8 * jT4) + (jT9 * j12) + (jT10 * jT2) + (jT11 * j5);
            long j17 = (jT7 * jT6) + (jT8 * jT5) + (jT9 * jT4) + (jT10 * j12) + (jT11 * jT2);
            long j18 = j14 + (j13 >> 26);
            long j19 = j15 + (j18 >> 26);
            j7 = j19 & 67108863;
            long j20 = j16 + (j19 >> 26);
            j9 = j20 & 67108863;
            long j21 = j17 + (j20 >> 26);
            j10 = j21 & 67108863;
            long j22 = (j13 & 67108863) + ((j21 >> 26) * 5);
            j11 = j22 & 67108863;
            j6 = (j18 & 67108863) + (j22 >> 26);
            i5 += 16;
            jT3 = j12;
            i2 = 3;
            i3 = 2;
        }
        long j23 = j7 + (j6 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j9 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j10 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = j11 + ((j27 >> 26) * 5);
        long j30 = j29 & 67108863;
        long j31 = (j6 & 67108863) + (j29 >> 26);
        long j32 = j30 + 5;
        long j33 = j32 & 67108863;
        long j34 = (j32 >> 26) + j31;
        long j35 = j24 + (j34 >> 26);
        long j36 = j26 + (j35 >> 26);
        long j37 = j36 & 67108863;
        long j38 = (j28 + (j36 >> 26)) - 67108864;
        long j39 = j38 >> 63;
        long j40 = j30 & j39;
        long j41 = j31 & j39;
        long j42 = j24 & j39;
        long j43 = j26 & j39;
        long j44 = j28 & j39;
        long j45 = ~j39;
        long j46 = (j34 & 67108863 & j45) | j41;
        long j47 = (j35 & 67108863 & j45) | j42;
        long j48 = (j37 & j45) | j43;
        long j49 = j44 | (j38 & j45);
        long j50 = (j40 | (j33 & j45) | (j46 << 26)) & 4294967295L;
        long j51 = ((j46 >> 6) | (j47 << 20)) & 4294967295L;
        long j52 = ((j47 >> 12) | (j48 << 14)) & 4294967295L;
        long j53 = ((j48 >> 18) | (j49 << 8)) & 4294967295L;
        long jNr = j50 + nr(bArr, 16);
        long j54 = jNr & 4294967295L;
        long jNr2 = j51 + nr(bArr, 20) + (jNr >> 32);
        long j55 = jNr2 & 4294967295L;
        long jNr3 = j52 + nr(bArr, 24) + (jNr2 >> 32);
        long j56 = jNr3 & 4294967295L;
        long jNr4 = (j53 + nr(bArr, 28) + (jNr3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        O(bArr4, j54, 0);
        O(bArr4, j55, 4);
        O(bArr4, j56, 8);
        O(bArr4, jNr4, 12);
        return bArr4;
    }

    private static long nr(byte[] bArr, int i2) {
        return ((long) (((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16))) & 4294967295L;
    }

    public static void J2(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (B8M.Wre.rl(n(bArr, bArr2), bArr3)) {
        } else {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    private static long t(byte[] bArr, int i2, int i3) {
        return (nr(bArr, i2) >> i3) & 67108863;
    }
}
