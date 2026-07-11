package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zznj {
    private static final byte[][] zza = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}};

    public static void zza(long[] jArr, byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        int i2 = 32;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf[31] = (byte) (bArrCopyOf[31] & ByteCompanionObject.MAX_VALUE);
        int i3 = 0;
        int i5 = 0;
        while (true) {
            byte[][] bArr3 = zza;
            if (i5 >= bArr3.length) {
                long[] jArrZza = zznp.zza(bArrCopyOf);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                int i7 = 10;
                System.arraycopy(jArrZza, 0, jArr2, 0, 10);
                int i8 = 0;
                while (i8 < i2) {
                    int i9 = bArr[31 - i8] & UByte.MAX_VALUE;
                    while (i3 < 8) {
                        int i10 = (i9 >> (7 - i3)) & 1;
                        zza(jArr4, jArr2, i10);
                        zza(jArr5, jArr3, i10);
                        long[] jArrCopyOf = Arrays.copyOf(jArr4, i7);
                        int i11 = i9;
                        long[] jArr10 = new long[19];
                        int i12 = i3;
                        long[] jArr11 = new long[19];
                        int i13 = i8;
                        long[] jArr12 = new long[19];
                        long[] jArr13 = new long[19];
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zznp.zzd(jArr4, jArr5);
                        zznp.zzc(jArr5, jArrCopyOf);
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                        zznp.zzd(jArr2, jArr3);
                        zznp.zzc(jArr3, jArrCopyOf2);
                        zznp.zzb(jArr13, jArr2, jArr5);
                        zznp.zzb(jArr14, jArr4, jArr3);
                        zznp.zzb(jArr13);
                        zznp.zza(jArr13);
                        zznp.zzb(jArr14);
                        zznp.zza(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, jArrCopyOf2, 0, 10);
                        zznp.zzd(jArr13, jArr14);
                        zznp.zzc(jArr14, jArrCopyOf2);
                        zznp.zzb(jArr17, jArr13);
                        zznp.zzb(jArr16, jArr14);
                        zznp.zzb(jArr14, jArr16, jArrZza);
                        zznp.zzb(jArr14);
                        zznp.zza(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zznp.zzb(jArr11, jArr4);
                        zznp.zzb(jArr12, jArr5);
                        zznp.zzb(jArr8, jArr11, jArr12);
                        zznp.zzb(jArr8);
                        zznp.zza(jArr8);
                        zznp.zzc(jArr12, jArr11);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        zznp.zza(jArr10, jArr12, 121665L);
                        zznp.zza(jArr10);
                        zznp.zzd(jArr10, jArr11);
                        zznp.zzb(jArr15, jArr12, jArr10);
                        zznp.zzb(jArr15);
                        zznp.zza(jArr15);
                        zza(jArr8, jArr6, i10);
                        zza(jArr15, jArr7, i10);
                        i3 = i12 + 1;
                        long[] jArr19 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr19;
                        long[] jArr20 = jArr8;
                        jArr8 = jArr4;
                        jArr4 = jArr20;
                        jArr9 = jArr5;
                        jArr5 = jArr15;
                        jArr2 = jArr6;
                        i9 = i11;
                        i8 = i13;
                        jArr6 = jArr18;
                        i7 = 10;
                    }
                    i8++;
                    i2 = 32;
                    i3 = 0;
                    i7 = 10;
                }
                int i14 = i7;
                long[] jArr21 = new long[i14];
                zznp.zza(jArr21, jArr5);
                zznp.zza(jArr, jArr4, jArr21);
                long[] jArr22 = new long[i14];
                long[] jArr23 = new long[i14];
                long[] jArr24 = new long[11];
                long[] jArr25 = new long[11];
                long[] jArr26 = new long[11];
                zznp.zza(jArr22, jArrZza, jArr);
                zznp.zzd(jArr23, jArrZza, jArr);
                long[] jArr27 = new long[i14];
                jArr27[0] = 486662;
                zznp.zzd(jArr25, jArr23, jArr27);
                zznp.zza(jArr25, jArr25, jArr3);
                zznp.zzd(jArr25, jArr2);
                zznp.zza(jArr25, jArr25, jArr22);
                zznp.zza(jArr25, jArr25, jArr2);
                zznp.zza(jArr24, jArr25, 4L);
                zznp.zza(jArr24);
                zznp.zza(jArr25, jArr22, jArr3);
                zznp.zzc(jArr25, jArr25, jArr3);
                zznp.zza(jArr26, jArr23, jArr2);
                zznp.zzd(jArr25, jArr25, jArr26);
                zznp.zzb(jArr25, jArr25);
                if (MessageDigest.isEqual(zznp.zzc(jArr24), zznp.zzc(jArr25))) {
                    return;
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + zzzr.zza(bArr2));
            }
            if (MessageDigest.isEqual(bArr3[i5], bArrCopyOf)) {
                throw new InvalidKeyException("Banned public key: " + zzzr.zza(bArr3[i5]));
            }
            i5++;
        }
    }

    private static void zza(long[] jArr, long[] jArr2, int i2) {
        int i3 = -i2;
        for (int i5 = 0; i5 < 10; i5++) {
            int i7 = (((int) jArr[i5]) ^ ((int) jArr2[i5])) & i3;
            jArr[i5] = ((int) r1) ^ i7;
            jArr2[i5] = ((int) jArr2[i5]) ^ i7;
        }
    }
}
