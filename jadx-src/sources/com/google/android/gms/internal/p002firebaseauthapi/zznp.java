package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zznp {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i5 = 2; i5 < 10; i5 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i8 = 2; i8 < 100; i8 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i9 = 2; i9 < 50; i9 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j2 = jArr2[0];
        long j3 = jArr3[1] * j2;
        long j4 = jArr2[1];
        long j5 = jArr3[0];
        jArr[1] = j3 + (j4 * j5);
        long j6 = jArr2[1];
        long j7 = jArr3[1];
        jArr[2] = (j6 * 2 * j7) + (jArr3[2] * j2) + (jArr2[2] * j5);
        long j9 = jArr3[2];
        long j10 = jArr2[2];
        jArr[3] = (j6 * j9) + (j10 * j7) + (jArr3[3] * j2) + (jArr2[3] * j5);
        long j11 = jArr3[3];
        long j12 = jArr2[3];
        jArr[4] = (j10 * j9) + (((j6 * j11) + (j12 * j7)) * 2) + (jArr3[4] * j2) + (jArr2[4] * j5);
        long j13 = jArr3[4];
        long j14 = jArr2[4];
        jArr[5] = (j10 * j11) + (j12 * j9) + (j6 * j13) + (j14 * j7) + (jArr3[5] * j2) + (jArr2[5] * j5);
        long j15 = jArr3[5];
        long j16 = jArr2[5];
        jArr[6] = (((j12 * j11) + (j6 * j15) + (j16 * j7)) * 2) + (j10 * j13) + (j14 * j9) + (jArr3[6] * j2) + (jArr2[6] * j5);
        long j17 = jArr3[6];
        long j18 = jArr2[6];
        jArr[7] = (j12 * j13) + (j14 * j11) + (j10 * j15) + (j16 * j9) + (j6 * j17) + (j18 * j7) + (jArr3[7] * j2) + (jArr2[7] * j5);
        long j19 = jArr3[7];
        long j20 = jArr2[7];
        jArr[8] = (j14 * j13) + (((j12 * j15) + (j16 * j11) + (j6 * j19) + (j20 * j7)) * 2) + (j10 * j17) + (j18 * j9) + (jArr3[8] * j2) + (jArr2[8] * j5);
        long j21 = jArr3[8];
        long j22 = jArr2[8];
        jArr[9] = (j14 * j15) + (j16 * j13) + (j12 * j17) + (j18 * j11) + (j10 * j19) + (j20 * j9) + (j6 * j21) + (j22 * j7) + (j2 * jArr3[9]) + (jArr2[9] * j5);
        long j23 = jArr3[9];
        long j24 = jArr2[9];
        jArr[10] = (((j16 * j15) + (j12 * j19) + (j20 * j11) + (j6 * j23) + (j7 * j24)) * 2) + (j14 * j17) + (j18 * j13) + (j10 * j21) + (j22 * j9);
        jArr[11] = (j16 * j17) + (j18 * j15) + (j14 * j19) + (j20 * j13) + (j12 * j21) + (j22 * j11) + (j10 * j23) + (j9 * j24);
        jArr[12] = (j18 * j17) + (((j16 * j19) + (j20 * j15) + (j12 * j23) + (j11 * j24)) * 2) + (j14 * j21) + (j22 * j13);
        jArr[13] = (j18 * j19) + (j20 * j17) + (j16 * j21) + (j22 * j15) + (j14 * j23) + (j13 * j24);
        jArr[14] = (((j20 * j19) + (j16 * j23) + (j15 * j24)) * 2) + (j18 * j21) + (j22 * j17);
        jArr[15] = (j20 * j21) + (j22 * j19) + (j18 * j23) + (j17 * j24);
        jArr[16] = (j22 * j21) + (((j20 * j23) + (j19 * j24)) * 2);
        jArr[17] = (j22 * j23) + (j21 * j24);
        jArr[18] = j24 * 2 * j23;
    }

    static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i3 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                break;
            }
            int i7 = 0;
            while (i7 < 9) {
                long j2 = jArrCopyOf[i7];
                int i8 = zzd[i7 & 1];
                int i9 = -((int) (((j2 >> 31) & j2) >> i8));
                jArrCopyOf[i7] = j2 + ((long) (i9 << i8));
                i7++;
                jArrCopyOf[i7] = jArrCopyOf[i7] - ((long) i9);
            }
            long j3 = jArrCopyOf[9];
            int i10 = -((int) (((j3 >> 31) & j3) >> 25));
            jArrCopyOf[9] = j3 + ((long) (i10 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i10) * 19);
            i5++;
        }
        long j4 = jArrCopyOf[0];
        int i11 = -((int) (((j4 >> 31) & j4) >> 26));
        jArrCopyOf[0] = j4 + ((long) (i11 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i11);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i3;
            while (i13 < 9) {
                long j5 = jArrCopyOf[i13];
                int i14 = i13 & 1;
                int i15 = i3;
                int i16 = (int) (j5 >> zzd[i14]);
                jArrCopyOf[i13] = j5 & ((long) zzc[i14]);
                i13++;
                jArrCopyOf[i13] = jArrCopyOf[i13] + ((long) i16);
                i3 = i15;
                i12 = i12;
            }
            i12++;
        }
        int i17 = i3;
        long j6 = jArrCopyOf[9];
        jArrCopyOf[9] = j6 & 33554431;
        long j7 = jArrCopyOf[i17] + (((long) ((int) (j6 >> 25))) * 19);
        jArrCopyOf[i17] = j7;
        int i18 = ~((((int) j7) - 67108845) >> 31);
        for (int i19 = 1; i19 < 10; i19++) {
            int i20 = ~(((int) jArrCopyOf[i19]) ^ zzc[i19 & 1]);
            int i21 = i20 & (i20 << 16);
            int i22 = i21 & (i21 << 8);
            int i23 = i22 & (i22 << 4);
            int i24 = i23 & (i23 << 2);
            i18 &= (i24 & (i24 << 1)) >> 31;
        }
        jArrCopyOf[i17] = jArrCopyOf[i17] - ((long) (67108845 & i18));
        long j9 = 33554431 & i18;
        jArrCopyOf[1] = jArrCopyOf[1] - j9;
        for (i2 = 2; i2 < 10; i2 += 2) {
            jArrCopyOf[i2] = jArrCopyOf[i2] - ((long) (67108863 & i18));
            int i25 = i2 + 1;
            jArrCopyOf[i25] = jArrCopyOf[i25] - j9;
        }
        for (int i26 = i17; i26 < 10; i26++) {
            jArrCopyOf[i26] = jArrCopyOf[i26] << zzb[i26];
        }
        byte[] bArr = new byte[32];
        for (int i27 = i17; i27 < 10; i27++) {
            int i28 = zza[i27];
            long j10 = bArr[i28];
            long j11 = jArrCopyOf[i27];
            bArr[i28] = (byte) (j10 | (j11 & 255));
            bArr[i28 + 1] = (byte) (((long) bArr[r5]) | ((j11 >> 8) & 255));
            bArr[i28 + 2] = (byte) (((long) bArr[r5]) | ((j11 >> 16) & 255));
            bArr[i28 + 3] = (byte) (((long) bArr[r4]) | ((j11 >> 24) & 255));
        }
        return bArr;
    }

    static void zzb(long[] jArr) {
        long j2 = jArr[8];
        long j3 = jArr[18];
        long j4 = j2 + (j3 << 4);
        jArr[8] = j4;
        long j5 = j4 + (j3 << 1);
        jArr[8] = j5;
        jArr[8] = j5 + j3;
        long j6 = jArr[7];
        long j7 = jArr[17];
        long j9 = j6 + (j7 << 4);
        jArr[7] = j9;
        long j10 = j9 + (j7 << 1);
        jArr[7] = j10;
        jArr[7] = j10 + j7;
        long j11 = jArr[6];
        long j12 = jArr[16];
        long j13 = j11 + (j12 << 4);
        jArr[6] = j13;
        long j14 = j13 + (j12 << 1);
        jArr[6] = j14;
        jArr[6] = j14 + j12;
        long j15 = jArr[5];
        long j16 = jArr[15];
        long j17 = j15 + (j16 << 4);
        jArr[5] = j17;
        long j18 = j17 + (j16 << 1);
        jArr[5] = j18;
        jArr[5] = j18 + j16;
        long j19 = jArr[4];
        long j20 = jArr[14];
        long j21 = j19 + (j20 << 4);
        jArr[4] = j21;
        long j22 = j21 + (j20 << 1);
        jArr[4] = j22;
        jArr[4] = j22 + j20;
        long j23 = jArr[3];
        long j24 = jArr[13];
        long j25 = j23 + (j24 << 4);
        jArr[3] = j25;
        long j26 = j25 + (j24 << 1);
        jArr[3] = j26;
        jArr[3] = j26 + j24;
        long j27 = jArr[2];
        long j28 = jArr[12];
        long j29 = j27 + (j28 << 4);
        jArr[2] = j29;
        long j30 = j29 + (j28 << 1);
        jArr[2] = j30;
        jArr[2] = j30 + j28;
        long j31 = jArr[1];
        long j32 = jArr[11];
        long j33 = j31 + (j32 << 4);
        jArr[1] = j33;
        long j34 = j33 + (j32 << 1);
        jArr[1] = j34;
        jArr[1] = j34 + j32;
        long j35 = jArr[0];
        long j36 = jArr[10];
        long j37 = j35 + (j36 << 4);
        jArr[0] = j37;
        long j38 = j37 + (j36 << 1);
        jArr[0] = j38;
        jArr[0] = j38 + j36;
    }

    static void zzb(long[] jArr, long[] jArr2) {
        long j2 = jArr2[0];
        long j3 = jArr2[1];
        long j4 = jArr2[2];
        long j5 = jArr2[3];
        long j6 = jArr2[4];
        long j7 = jArr2[5];
        long j9 = jArr2[6];
        long j10 = jArr2[7];
        long j11 = jArr2[8];
        long j12 = jArr2[9];
        zze(new long[]{j2 * j2, j2 * 2 * j3, ((j3 * j3) + (j2 * j4)) * 2, ((j3 * j4) + (j2 * j5)) * 2, (j4 * j4) + (j3 * 4 * j5) + (j2 * 2 * j6), ((j4 * j5) + (j3 * j6) + (j2 * j7)) * 2, ((j5 * j5) + (j4 * j6) + (j2 * j9) + (j3 * 2 * j7)) * 2, ((j5 * j6) + (j4 * j7) + (j3 * j9) + (j2 * j10)) * 2, (j6 * j6) + (((j4 * j9) + (j2 * j11) + (((j3 * j10) + (j5 * j7)) * 2)) * 2), ((j6 * j7) + (j5 * j9) + (j4 * j10) + (j3 * j11) + (j2 * j12)) * 2, ((j7 * j7) + (j6 * j9) + (j4 * j11) + (((j5 * j10) + (j3 * j12)) * 2)) * 2, ((j7 * j9) + (j6 * j10) + (j5 * j11) + (j4 * j12)) * 2, (j9 * j9) + (((j6 * j11) + (((j7 * j10) + (j5 * j12)) * 2)) * 2), ((j9 * j10) + (j7 * j11) + (j6 * j12)) * 2, ((j10 * j10) + (j9 * j11) + (j7 * 2 * j12)) * 2, ((j10 * j11) + (j9 * j12)) * 2, (j11 * j11) + (j10 * 4 * j12), j11 * 2 * j12, 2 * j12 * j12}, jArr);
    }

    static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    static void zza(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = jArr[i2];
            long j3 = j2 / 67108864;
            jArr[i2] = j2 - (j3 << 26);
            int i3 = i2 + 1;
            long j4 = jArr[i3] + j3;
            jArr[i3] = j4;
            long j5 = j4 / 33554432;
            jArr[i3] = j4 - (j5 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j5;
        }
        long j6 = jArr[0];
        long j7 = jArr[10];
        long j9 = j6 + (j7 << 4);
        jArr[0] = j9;
        long j10 = j9 + (j7 << 1);
        jArr[0] = j10;
        long j11 = j10 + j7;
        jArr[0] = j11;
        jArr[10] = 0;
        long j12 = j11 / 67108864;
        jArr[0] = j11 - (j12 << 26);
        jArr[1] = jArr[1] + j12;
    }

    static void zza(long[] jArr, long[] jArr2, long j2) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] * j2;
        }
    }

    static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = zza[i2];
            jArr[i2] = ((((((long) (bArr[i3] & UByte.MAX_VALUE)) | (((long) (bArr[i3 + 1] & UByte.MAX_VALUE)) << 8)) | (((long) (bArr[i3 + 2] & UByte.MAX_VALUE)) << 16)) | (((long) (bArr[i3 + 3] & UByte.MAX_VALUE)) << 24)) >> zzb[i2]) & ((long) zzc[i2 & 1]);
        }
        return jArr;
    }
}
