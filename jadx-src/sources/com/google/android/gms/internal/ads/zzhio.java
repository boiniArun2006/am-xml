package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhio {
    private static final zzhij zzb = new zzhij(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final zzhil zzc = new zzhil(new zzhim(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    private static int zzj(int i2, int i3) {
        int i5 = (~(i2 ^ i3)) & 255;
        int i7 = i5 & (i5 << 4);
        int i8 = i7 & (i7 << 2);
        return (i8 & (i8 + i8)) >> 7;
    }

    private static void zzm(long[] jArr, long[] jArr2) {
        for (int i2 = 0; i2 < jArr2.length; i2++) {
            jArr[i2] = -jArr2[i2];
        }
    }

    public static byte[] zza(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i5 = i3 + i3;
            bArr2[i5] = (byte) (bArr[i3] & 15);
            bArr2[i5 + 1] = (byte) ((bArr[i3] & UByte.MAX_VALUE) >> 4);
            i3++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < 63) {
            byte b2 = (byte) (bArr2[i7] + i8);
            bArr2[i7] = b2;
            int i9 = (b2 + 8) >> 4;
            bArr2[i7] = (byte) (b2 - (i9 << 4));
            i7++;
            i8 = i9;
        }
        bArr2[63] = (byte) (bArr2[63] + i8);
        zzhil zzhilVar = new zzhil(zzc);
        zzhin zzhinVar = new zzhin();
        for (i2 = 1; i2 < 64; i2 += 2) {
            zzhij zzhijVar = new zzhij(zzb);
            zzk(zzhijVar, i2 / 2, bArr2[i2]);
            zzhin.zza(zzhinVar, zzhilVar);
            zzg(zzhilVar, zzhinVar, zzhijVar);
        }
        zzhim zzhimVar = new zzhim();
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        for (int i10 = 0; i10 < 64; i10 += 2) {
            zzhij zzhijVar2 = new zzhij(zzb);
            zzk(zzhijVar2, i10 / 2, bArr2[i10]);
            zzhin.zza(zzhinVar, zzhilVar);
            zzg(zzhilVar, zzhinVar, zzhijVar2);
        }
        zzhim zzhimVar2 = new zzhim(zzhilVar);
        long[] jArr = new long[10];
        zzhiv.zzf(jArr, zzhimVar2.zza);
        long[] jArr2 = new long[10];
        zzhiv.zzf(jArr2, zzhimVar2.zzb);
        long[] jArr3 = new long[10];
        zzhiv.zzf(jArr3, zzhimVar2.zzc);
        long[] jArr4 = new long[10];
        zzhiv.zzf(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhiv.zzb(jArr5, jArr2, jArr);
        zzhiv.zze(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhiv.zze(jArr6, jArr, jArr2);
        zzhiv.zze(jArr6, jArr6, zzhiq.zza);
        zzhiv.zza(jArr6, jArr6, jArr4);
        zzhiv.zzc(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhiv.zzh(jArr5), zzhiv.zzh(jArr6))) {
            return zzhimVar2.zzb();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i2 = bArrDigest[31] & ByteCompanionObject.MAX_VALUE;
        bArrDigest[31] = (byte) i2;
        bArrDigest[31] = (byte) (i2 | 64);
        return bArrDigest;
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte b2;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i2 = 31;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int i3 = bArrCopyOfRange[i2] & UByte.MAX_VALUE;
            int i5 = zza[i2] & UByte.MAX_VALUE;
            if (i3 == i5) {
                i2--;
                bArr4 = bArr2;
                bArr5 = bArr3;
            } else if (i3 < i5) {
                MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr5);
                messageDigest.update(bArr);
                byte[] bArrDigest = messageDigest.digest();
                long jZzn = zzn(bArrDigest, 0) & 2097151;
                long jZzo = zzo(bArrDigest, 2) >> 5;
                long jZzn2 = zzn(bArrDigest, 5) >> 2;
                long jZzo2 = zzo(bArrDigest, 7) >> 7;
                long jZzo3 = zzo(bArrDigest, 10) >> 4;
                long jZzn3 = zzn(bArrDigest, 13) >> 1;
                long jZzo4 = zzo(bArrDigest, 15) >> 6;
                long jZzn4 = zzn(bArrDigest, 18) >> 3;
                long jZzn5 = zzn(bArrDigest, 21) & 2097151;
                long jZzo5 = zzo(bArrDigest, 23) >> 5;
                long jZzn6 = zzn(bArrDigest, 26) >> 2;
                long jZzo6 = zzo(bArrDigest, 28) >> 7;
                long jZzo7 = zzo(bArrDigest, 31) >> 4;
                long jZzn7 = zzn(bArrDigest, 34) >> 1;
                long jZzo8 = zzo(bArrDigest, 36) >> 6;
                long jZzn8 = zzn(bArrDigest, 39) >> 3;
                long jZzn9 = zzn(bArrDigest, 42) & 2097151;
                long jZzo9 = zzo(bArrDigest, 44) >> 5;
                long jZzn10 = (zzn(bArrDigest, 47) >> 2) & 2097151;
                long jZzo10 = (zzo(bArrDigest, 49) >> 7) & 2097151;
                long jZzo11 = (zzo(bArrDigest, 52) >> 4) & 2097151;
                long jZzn11 = (zzn(bArrDigest, 55) >> 1) & 2097151;
                long jZzo12 = (zzo(bArrDigest, 57) >> 6) & 2097151;
                long jZzo13 = zzo(bArrDigest, 60) >> 3;
                long j2 = (jZzo4 & 2097151) + (jZzn10 * 666643);
                long j3 = (j2 + 1048576) >> 21;
                long j4 = j3 << 21;
                long j5 = jZzn5 + (jZzo11 * 666643) + (jZzo10 * 470296) + (jZzn10 * 654183);
                long j6 = (j5 + 1048576) >> 21;
                long j7 = j6 << 21;
                long j9 = (((((jZzn6 & 2097151) + (jZzo12 * 666643)) + (jZzn11 * 470296)) + (jZzo11 * 654183)) - (jZzo10 * 997805)) + (jZzn10 * 136657);
                long j10 = (j9 + 1048576) >> 21;
                long j11 = j10 << 21;
                long j12 = (((((jZzo7 & 2097151) + (jZzo13 * 470296)) + (jZzo12 * 654183)) - (jZzn11 * 997805)) + (jZzo11 * 136657)) - (jZzo10 * 683901);
                long j13 = (j12 + 1048576) >> 21;
                long j14 = (((jZzo8 & 2097151) - (jZzo13 * 997805)) + (jZzo12 * 136657)) - (jZzn11 * 683901);
                long j15 = (j14 + 1048576) >> 21;
                long j16 = jZzn9 - (jZzo13 * 683901);
                long j17 = (j16 + 1048576) >> 21;
                long j18 = jZzn4 + (jZzo10 * 666643) + (jZzn10 * 470296) + j3;
                long j19 = (j18 + 1048576) >> 21;
                long j20 = j19 << 21;
                long j21 = (((((jZzo5 & 2097151) + (jZzn11 * 666643)) + (jZzo11 * 470296)) + (jZzo10 * 654183)) - (jZzn10 * 997805)) + j6;
                long j22 = (j21 + 1048576) >> 21;
                long j23 = j22 << 21;
                long j24 = (((((((jZzo6 & 2097151) + (jZzo13 * 666643)) + (jZzo12 * 470296)) + (jZzn11 * 654183)) - (jZzo11 * 997805)) + (jZzo10 * 136657)) - (jZzn10 * 683901)) + j10;
                long j25 = (j24 + 1048576) >> 21;
                long j26 = j25 << 21;
                long j27 = (((((jZzn7 & 2097151) + (jZzo13 * 654183)) - (jZzo12 * 997805)) + (jZzn11 * 136657)) - (jZzo11 * 683901)) + j13;
                long j28 = (j27 + 1048576) >> 21;
                long j29 = ((jZzn8 + (jZzo13 * 136657)) - (jZzo12 * 683901)) + j15;
                long j30 = (j29 + 1048576) >> 21;
                long j31 = (j12 - (j13 << 21)) + j25;
                long j32 = jZzn + (j31 * 666643);
                long j33 = (j32 + 1048576) >> 21;
                long j34 = j33 << 21;
                long j35 = (j14 - (j15 << 21)) + j28;
                long j36 = j27 - (j28 << 21);
                long j37 = (jZzn2 & 2097151) + (j35 * 666643) + (j36 * 470296) + (j31 * 654183);
                long j38 = (j37 + 1048576) >> 21;
                long j39 = j38 << 21;
                long j40 = (j16 - (j17 << 21)) + j30;
                long j41 = j29 - (j30 << 21);
                long j42 = (((((jZzo3 & 2097151) + (j40 * 666643)) + (j41 * 470296)) + (j35 * 654183)) - (j36 * 997805)) + (j31 * 136657);
                long j43 = (j42 + 1048576) >> 21;
                long j44 = j43 << 21;
                long j45 = (jZzo9 & 2097151) + j17;
                long j46 = (((((j2 - j4) + (j45 * 470296)) + (j40 * 654183)) - (j41 * 997805)) + (j35 * 136657)) - (j36 * 683901);
                long j47 = (j46 + 1048576) >> 21;
                long j48 = j47 << 21;
                long j49 = ((((j5 - j7) + j19) - (j45 * 997805)) + (j40 * 136657)) - (j41 * 683901);
                long j50 = (j49 + 1048576) >> 21;
                long j51 = j50 << 21;
                long j52 = ((j9 - j11) + j22) - (j45 * 683901);
                long j53 = (j52 + 1048576) >> 21;
                long j54 = (jZzo & 2097151) + (j36 * 666643) + (j31 * 470296) + j33;
                long j55 = (j54 + 1048576) >> 21;
                long j56 = (((((jZzo2 & 2097151) + (j41 * 666643)) + (j35 * 470296)) + (j36 * 654183)) - (j31 * 997805)) + j38;
                long j57 = (j56 + 1048576) >> 21;
                long j58 = (((((((jZzn3 & 2097151) + (j45 * 666643)) + (j40 * 470296)) + (j41 * 654183)) - (j35 * 997805)) + (j36 * 136657)) - (j31 * 683901)) + j43;
                long j59 = (j58 + 1048576) >> 21;
                long j60 = (((((j18 - j20) + (j45 * 654183)) - (j40 * 997805)) + (j41 * 136657)) - (j35 * 683901)) + j47;
                long j61 = (j60 + 1048576) >> 21;
                long j62 = (((j21 - j23) + (j45 * 136657)) - (j40 * 683901)) + j50;
                long j63 = (j62 + 1048576) >> 21;
                long j64 = (j24 - j26) + j53;
                long j65 = (j64 + 1048576) >> 21;
                long j66 = j65 << 21;
                long j67 = (j32 - j34) + (j65 * 666643);
                long j68 = j67 >> 21;
                long j69 = j68 << 21;
                long j70 = (j54 - (j55 << 21)) + (j65 * 470296) + j68;
                long j71 = j70 >> 21;
                long j72 = j71 << 21;
                long j73 = (j37 - j39) + j55 + (j65 * 654183) + j71;
                long j74 = j73 >> 21;
                long j75 = j74 << 21;
                long j76 = ((j56 - (j57 << 21)) - (j65 * 997805)) + j74;
                long j77 = j76 >> 21;
                long j78 = j77 << 21;
                long j79 = (j42 - j44) + j57 + (j65 * 136657) + j77;
                long j80 = j79 >> 21;
                long j81 = j80 << 21;
                long j82 = ((j58 - (j59 << 21)) - (j65 * 683901)) + j80;
                long j83 = j82 >> 21;
                long j84 = j83 << 21;
                long j85 = (j46 - j48) + j59 + j83;
                long j86 = j85 >> 21;
                long j87 = j86 << 21;
                long j88 = (j60 - (j61 << 21)) + j86;
                long j89 = j88 >> 21;
                long j90 = j89 << 21;
                long j91 = (j49 - j51) + j61 + j89;
                long j92 = j91 >> 21;
                long j93 = j92 << 21;
                long j94 = (j62 - (j63 << 21)) + j92;
                long j95 = j94 >> 21;
                long j96 = j95 << 21;
                long j97 = (j52 - (j53 << 21)) + j63 + j95;
                long j98 = j97 >> 21;
                long j99 = j98 << 21;
                long j100 = (j64 - j66) + j98;
                long j101 = j100 >> 21;
                long j102 = j101 << 21;
                long j103 = (j67 - j69) + (666643 * j101);
                long j104 = j103 >> 21;
                long j105 = j104 << 21;
                long j106 = (j70 - j72) + (470296 * j101) + j104;
                long j107 = j106 >> 21;
                long j108 = j107 << 21;
                long j109 = (j73 - j75) + (654183 * j101) + j107;
                long j110 = j109 >> 21;
                long j111 = j110 << 21;
                long j112 = ((j76 - j78) - (997805 * j101)) + j110;
                long j113 = j112 >> 21;
                long j114 = j113 << 21;
                long j115 = (j79 - j81) + (136657 * j101) + j113;
                long j116 = j115 >> 21;
                long j117 = ((j82 - j84) - (j101 * 683901)) + j116;
                long j118 = j117 >> 21;
                long j119 = j118 << 21;
                long j120 = (j85 - j87) + j118;
                long j121 = j120 >> 21;
                long j122 = j121 << 21;
                long j123 = (j88 - j90) + j121;
                long j124 = j123 >> 21;
                long j125 = j124 << 21;
                long j126 = (j91 - j93) + j124;
                long j127 = j126 >> 21;
                long j128 = j127 << 21;
                long j129 = (j94 - j96) + j127;
                long j130 = j129 >> 21;
                long j131 = j130 << 21;
                long j132 = (j97 - j99) + j130;
                long j133 = j132 >> 21;
                bArrDigest[0] = (byte) (j103 - j105);
                long j134 = j123 - j125;
                long j135 = j120 - j122;
                long j136 = j117 - j119;
                long j137 = j115 - (j116 << 21);
                long j138 = j112 - j114;
                long j139 = j109 - j111;
                long j140 = j106 - j108;
                bArrDigest[1] = (byte) (r8 >> 8);
                bArrDigest[2] = (byte) ((r8 >> 16) | (j140 << 5));
                bArrDigest[3] = (byte) (j140 >> 3);
                bArrDigest[4] = (byte) (j140 >> 11);
                bArrDigest[5] = (byte) ((j140 >> 19) | (j139 << 2));
                bArrDigest[6] = (byte) (j139 >> 6);
                bArrDigest[7] = (byte) ((j139 >> 14) | (j138 << 7));
                bArrDigest[8] = (byte) (j138 >> 1);
                bArrDigest[9] = (byte) (j138 >> 9);
                bArrDigest[10] = (byte) ((j138 >> 17) | (j137 << 4));
                bArrDigest[11] = (byte) (j137 >> 4);
                bArrDigest[12] = (byte) (j137 >> 12);
                bArrDigest[13] = (byte) ((j137 >> 20) | (j136 + j136));
                bArrDigest[14] = (byte) (j136 >> 7);
                bArrDigest[15] = (byte) ((j136 >> 15) | (j135 << 6));
                bArrDigest[16] = (byte) (j135 >> 2);
                bArrDigest[17] = (byte) (j135 >> 10);
                bArrDigest[18] = (byte) ((j135 >> 18) | (j134 << 3));
                long j141 = j132 - (j133 << 21);
                long j142 = (j100 - j102) + j133;
                long j143 = j129 - j131;
                bArrDigest[19] = (byte) (j134 >> 5);
                bArrDigest[20] = (byte) (j134 >> 13);
                bArrDigest[21] = (byte) (j126 - j128);
                bArrDigest[22] = (byte) (r6 >> 8);
                bArrDigest[23] = (byte) ((r6 >> 16) | (j143 << 5));
                bArrDigest[24] = (byte) (j143 >> 3);
                bArrDigest[25] = (byte) (j143 >> 11);
                bArrDigest[26] = (byte) ((j143 >> 19) | (j141 << 2));
                bArrDigest[27] = (byte) (j141 >> 6);
                bArrDigest[28] = (byte) ((j141 >> 14) | (j142 << 7));
                bArrDigest[29] = (byte) (j142 >> 1);
                bArrDigest[30] = (byte) (j142 >> 9);
                bArrDigest[31] = (byte) (j142 >> 17);
                long[] jArr = new long[10];
                long[] jArrZzg = zzhiv.zzg(bArr5);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                zzhiv.zzf(jArr4, jArrZzg);
                zzhiv.zze(jArr5, jArr4, zzhiq.zza);
                zzhiv.zzb(jArr4, jArr4, jArr2);
                zzhiv.zza(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                zzhiv.zzf(jArr8, jArr5);
                zzhiv.zze(jArr8, jArr8, jArr5);
                zzhiv.zzf(jArr, jArr8);
                zzhiv.zze(jArr, jArr, jArr5);
                zzhiv.zze(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                zzhiv.zzf(jArr9, jArr);
                zzhiv.zzf(jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr10);
                zzhiv.zze(jArr10, jArr, jArr10);
                zzhiv.zze(jArr9, jArr9, jArr10);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i7 = 1; i7 < 5; i7++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i8 = 1; i8 < 10; i8++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr10, jArr10, jArr9);
                zzhiv.zzf(jArr11, jArr10);
                for (int i9 = 1; i9 < 20; i9++) {
                    zzhiv.zzf(jArr11, jArr11);
                }
                zzhiv.zze(jArr10, jArr11, jArr10);
                zzhiv.zzf(jArr10, jArr10);
                for (int i10 = 1; i10 < 10; i10++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i11 = 1; i11 < 50; i11++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr10, jArr10, jArr9);
                zzhiv.zzf(jArr11, jArr10);
                for (int i12 = 1; i12 < 100; i12++) {
                    zzhiv.zzf(jArr11, jArr11);
                }
                zzhiv.zze(jArr10, jArr11, jArr10);
                zzhiv.zzf(jArr10, jArr10);
                for (int i13 = 1; i13 < 50; i13++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zze(jArr, jArr9, jArr);
                zzhiv.zze(jArr, jArr, jArr8);
                zzhiv.zze(jArr, jArr, jArr4);
                zzhiv.zzf(jArr6, jArr);
                zzhiv.zze(jArr6, jArr6, jArr5);
                zzhiv.zzb(jArr7, jArr6, jArr4);
                if (zze(jArr7)) {
                    zzhiv.zza(jArr7, jArr6, jArr4);
                    if (zze(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    zzhiv.zze(jArr, jArr, zzhiq.zzc);
                }
                if (zze(jArr)) {
                    b2 = UByte.MAX_VALUE;
                } else {
                    byte b4 = bArr3[31];
                    b2 = UByte.MAX_VALUE;
                    if (((b4 & UByte.MAX_VALUE) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (zzf(jArr) == ((bArr3[31] & b2) >> 7)) {
                    zzm(jArr, jArr);
                }
                zzhiv.zze(jArr3, jArr, jArrZzg);
                zzhin zzhinVar = new zzhin(new zzhim(jArr, jArrZzg, jArr2), jArr3);
                zzhik[] zzhikVarArr = new zzhik[8];
                zzhikVarArr[0] = new zzhik(zzhinVar);
                zzhil zzhilVar = new zzhil(new zzhim(), new long[10]);
                zzi(zzhilVar, zzhinVar.zza);
                zzhin zzhinVar2 = new zzhin(zzhilVar);
                for (int i14 = 1; i14 < 8; i14++) {
                    zzg(zzhilVar, zzhinVar2, zzhikVarArr[i14 - 1]);
                    zzhikVarArr[i14] = new zzhik(new zzhin(zzhilVar));
                }
                byte[] bArrZzl = zzl(bArrDigest);
                byte[] bArrZzl2 = zzl(bArrCopyOfRange);
                zzhil zzhilVar2 = new zzhil(zzc);
                zzhin zzhinVar3 = new zzhin();
                int i15 = b2;
                while (i15 >= 0 && bArrZzl[i15] == 0 && bArrZzl2[i15] == 0) {
                    i15--;
                }
                while (i15 >= 0) {
                    zzi(zzhilVar2, new zzhim(zzhilVar2));
                    byte b5 = bArrZzl[i15];
                    if (b5 > 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzg(zzhilVar2, zzhinVar3, zzhikVarArr[bArrZzl[i15] / 2]);
                    } else if (b5 < 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzh(zzhilVar2, zzhinVar3, zzhikVarArr[(-bArrZzl[i15]) / 2]);
                    }
                    byte b6 = bArrZzl2[i15];
                    if (b6 > 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzg(zzhilVar2, zzhinVar3, zzhiq.zze[bArrZzl2[i15] / 2]);
                    } else if (b6 < 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzh(zzhilVar2, zzhinVar3, zzhiq.zze[(-bArrZzl2[i15]) / 2]);
                    }
                    i15--;
                }
                byte[] bArrZzb = new zzhim(zzhilVar2).zzb();
                for (int i16 = 0; i16 < 32; i16++) {
                    if (bArrZzb[i16] != bArr2[i16]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void zzd() {
        if (zzhiq.zza == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    static /* synthetic */ boolean zze(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhiv.zzd(jArr2);
        byte[] bArrZzh = zzhiv.zzh(jArr2);
        for (int i2 = 0; i2 < 32; i2++) {
            if (bArrZzh[i2] != 0) {
                return true;
            }
        }
        return false;
    }

    private static void zzg(zzhil zzhilVar, zzhin zzhinVar, zzhij zzhijVar) {
        zzhim zzhimVar = zzhinVar.zza;
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhimVar.zzb;
        long[] jArr4 = zzhimVar.zza;
        zzhiv.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhimVar2.zzb;
        zzhiv.zzb(jArr5, jArr3, jArr4);
        zzhiv.zze(jArr5, jArr5, zzhijVar.zzb);
        long[] jArr6 = zzhijVar.zza;
        long[] jArr7 = zzhimVar2.zzc;
        zzhiv.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhilVar.zzb;
        zzhiv.zze(jArr8, zzhinVar.zzb, zzhijVar.zzc);
        zzhijVar.zza(jArr2, zzhimVar.zzc);
        zzhiv.zza(jArr, jArr2, jArr2);
        zzhiv.zzb(jArr2, jArr7, jArr5);
        zzhiv.zza(jArr5, jArr7, jArr5);
        zzhiv.zza(jArr7, jArr, jArr8);
        zzhiv.zzb(jArr8, jArr, jArr8);
    }

    private static void zzh(zzhil zzhilVar, zzhin zzhinVar, zzhij zzhijVar) {
        zzhim zzhimVar = zzhinVar.zza;
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhimVar.zzb;
        long[] jArr4 = zzhimVar.zza;
        zzhiv.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhimVar2.zzb;
        zzhiv.zzb(jArr5, jArr3, jArr4);
        zzhiv.zze(jArr5, jArr5, zzhijVar.zza);
        long[] jArr6 = zzhijVar.zzb;
        long[] jArr7 = zzhimVar2.zzc;
        zzhiv.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhilVar.zzb;
        zzhiv.zze(jArr8, zzhinVar.zzb, zzhijVar.zzc);
        zzhijVar.zza(jArr2, zzhimVar.zzc);
        zzhiv.zza(jArr, jArr2, jArr2);
        zzhiv.zzb(jArr2, jArr7, jArr5);
        zzhiv.zza(jArr5, jArr7, jArr5);
        zzhiv.zzb(jArr7, jArr, jArr8);
        zzhiv.zza(jArr8, jArr, jArr8);
    }

    private static void zzi(zzhil zzhilVar, zzhim zzhimVar) {
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = zzhimVar2.zza;
        long[] jArr2 = zzhimVar.zza;
        long[] jArr3 = new long[10];
        zzhiv.zzf(jArr, jArr2);
        long[] jArr4 = zzhimVar2.zzc;
        long[] jArr5 = zzhimVar.zzb;
        zzhiv.zzf(jArr4, jArr5);
        long[] jArr6 = zzhilVar.zzb;
        zzhiv.zzf(jArr6, zzhimVar.zzc);
        zzhiv.zza(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhimVar2.zzb;
        zzhiv.zza(jArr7, jArr2, jArr5);
        zzhiv.zzf(jArr3, jArr7);
        zzhiv.zza(jArr7, jArr4, jArr);
        zzhiv.zzb(jArr4, jArr4, jArr);
        zzhiv.zzb(jArr, jArr3, jArr7);
        zzhiv.zzb(jArr6, jArr6, jArr4);
    }

    private static void zzk(zzhij zzhijVar, int i2, byte b2) {
        zzhij[][] zzhijVarArr = zzhiq.zzd;
        zzhij zzhijVar2 = zzhijVarArr[i2][0];
        int i3 = (b2 & UByte.MAX_VALUE) >> 7;
        int i5 = (-i3) & b2;
        int i7 = b2 - (i5 + i5);
        zzhijVar.zzb(zzhijVar2, zzj(i7, 1));
        zzhijVar.zzb(zzhijVarArr[i2][1], zzj(i7, 2));
        zzhijVar.zzb(zzhijVarArr[i2][2], zzj(i7, 3));
        zzhijVar.zzb(zzhijVarArr[i2][3], zzj(i7, 4));
        zzhijVar.zzb(zzhijVarArr[i2][4], zzj(i7, 5));
        zzhijVar.zzb(zzhijVarArr[i2][5], zzj(i7, 6));
        zzhijVar.zzb(zzhijVarArr[i2][6], zzj(i7, 7));
        zzhijVar.zzb(zzhijVarArr[i2][7], zzj(i7, 8));
        long[] jArr = zzhijVar.zzc;
        long[] jArr2 = zzhijVar.zza;
        long[] jArrCopyOf = Arrays.copyOf(zzhijVar.zzb, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        zzm(jArrCopyOf3, jArrCopyOf3);
        zzhijVar.zzb(new zzhij(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i3);
    }

    private static byte[] zzl(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            bArr2[i3] = (byte) (1 & ((bArr[i3 >> 3] & UByte.MAX_VALUE) >> (i3 & 7)));
        }
        for (int i5 = 0; i5 < 256; i5++) {
            if (bArr2[i5] != 0) {
                for (int i7 = 1; i7 <= 6 && (i2 = i5 + i7) < 256; i7++) {
                    byte b2 = bArr2[i2];
                    if (b2 != 0) {
                        byte b4 = bArr2[i5];
                        int i8 = b2 << i7;
                        int i9 = b4 + i8;
                        if (i9 <= 15) {
                            bArr2[i5] = (byte) i9;
                            bArr2[i2] = 0;
                        } else {
                            int i10 = b4 - i8;
                            if (i10 >= -15) {
                                bArr2[i5] = (byte) i10;
                                while (true) {
                                    if (i2 >= 256) {
                                        break;
                                    }
                                    if (bArr2[i2] == 0) {
                                        bArr2[i2] = 1;
                                        break;
                                    }
                                    bArr2[i2] = 0;
                                    i2++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static long zzn(byte[] bArr, int i2) {
        return (((long) (bArr[i2 + 2] & UByte.MAX_VALUE)) << 16) | (bArr[i2] & 255) | (((long) (bArr[i2 + 1] & UByte.MAX_VALUE)) << 8);
    }

    private static long zzo(byte[] bArr, int i2) {
        return (((long) (bArr[i2 + 3] & UByte.MAX_VALUE)) << 24) | zzn(bArr, i2);
    }

    static /* synthetic */ int zzf(long[] jArr) {
        return zzhiv.zzh(jArr)[0] & 1;
    }
}
