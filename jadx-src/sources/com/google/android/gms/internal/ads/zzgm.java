package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgm {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static void zzj(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    @Nullable
    public static String zzk(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i3 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                int i5 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i5 >= length2) {
                        break;
                    }
                    int iZzi = zzi(bArr, i5, length2, zArr);
                    if (iZzi != length2) {
                        zzgucVar.zzf(Integer.valueOf(iZzi));
                    }
                    i5 = iZzi + 3;
                }
                zzguf zzgufVarZzi = zzgucVar.zzi();
                for (int i7 = 0; i7 < zzgufVarZzi.size(); i7++) {
                    if (((Integer) zzgufVarZzi.get(i7)).intValue() + 3 < length) {
                        zzgn zzgnVar = new zzgn(bArr, ((Integer) zzgufVarZzi.get(i7)).intValue() + 3, length);
                        zzga zzgaVarZzl = zzl(zzgnVar);
                        if (zzgaVarZzl.zza == 33 && zzgaVarZzl.zzb == 0) {
                            zzgnVar.zzb(4);
                            int iZzf = zzgnVar.zzf(3);
                            zzgnVar.zza();
                            zzgb zzgbVarZzm = zzm(zzgnVar, true, iZzf, null);
                            return zzdo.zzb(zzgbVarZzm.zza, zzgbVarZzm.zzb, zzgbVarZzm.zzc, zzgbVarZzm.zzd, zzgbVarZzm.zze, zzgbVarZzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static int zzn(int i2, int i3, int i5, int i7) {
        int i8 = 2;
        if (i3 != 1 && i3 != 2) {
            i8 = 1;
        }
        return i2 - (i8 * (i5 + i7));
    }

    private static int zzo(int i2, int i3, int i5, int i7) {
        return i2 - ((i3 == 1 ? 2 : 1) * (i5 + i7));
    }

    public static int zza(byte[] bArr, int i2) {
        int i3;
        synchronized (zzc) {
            int i5 = 0;
            int i7 = 0;
            while (i5 < i2) {
                while (true) {
                    try {
                        if (i5 >= i2 - 2) {
                            i5 = i2;
                            break;
                        }
                        int i8 = i5 + 1;
                        if (bArr[i5] == 0 && bArr[i8] == 0 && bArr[i5 + 2] == 3) {
                            break;
                        }
                        i5 = i8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i5 < i2) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i7) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i7] = i5;
                    i5 += 3;
                    i7++;
                }
            }
            i3 = i2 - i7;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = zzd[i11] - i9;
                System.arraycopy(bArr, i9, bArr, i10, i12);
                int i13 = i10 + i12;
                int i14 = i13 + 1;
                bArr[i13] = 0;
                i10 = i13 + 2;
                bArr[i14] = 0;
                i9 += i12 + 3;
            }
            System.arraycopy(bArr, i9, bArr, i10, i3 - i10);
        }
        return i3;
    }

    public static boolean zzd(byte[] bArr, int i2, int i3, zzv zzvVar) {
        String str = zzvVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) != 0) {
                return true;
            }
            int i5 = b2 & 31;
            return (i5 == 1 || i5 == 9 || i5 == 14) ? false : true;
        }
        if (Objects.equals(str, "video/hevc")) {
            zzga zzgaVarZzl = zzl(new zzgn(bArr, 4, i3 + 4));
            int i7 = zzgaVarZzl.zza;
            if (i7 == 35) {
                return false;
            }
            return (i7 <= 14 && i7 % 2 == 0 && zzgaVarZzl.zzc == zzvVar.zzF + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c A[PHI: r2
      0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f A[PHI: r2
      0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgl zze(byte[] bArr, int i2, int i3) {
        int iZzg;
        int i5;
        boolean zZze;
        int i7;
        int iZzg2;
        int i8;
        int i9;
        int iZzg3;
        boolean z2;
        boolean zZze2;
        int iZzg4;
        int i10;
        float f3;
        int i11;
        int i12;
        int iZzb;
        int iZzc;
        int i13;
        zzgn zzgnVar = new zzgn(bArr, i2, i3);
        int iZzf = zzgnVar.zzf(8);
        int iZzf2 = zzgnVar.zzf(8);
        int iZzf3 = zzgnVar.zzf(8);
        int iZzg5 = zzgnVar.zzg();
        if (iZzf == 100 || iZzf == 110 || iZzf == 122 || iZzf == 244 || iZzf == 44 || iZzf == 83 || iZzf == 86 || iZzf == 118 || iZzf == 128) {
            iZzg = zzgnVar.zzg();
            if (iZzg != 3) {
                zZze = zzgnVar.zze();
                i5 = 3;
            } else {
                i5 = iZzg;
                zZze = false;
            }
            i7 = 16;
            int iZzg6 = zzgnVar.zzg();
            iZzg2 = zzgnVar.zzg();
            zzgnVar.zza();
            if (zzgnVar.zze()) {
                int i14 = i5 != 3 ? 8 : 12;
                int i15 = 0;
                while (i15 < i14) {
                    if (zzgnVar.zze()) {
                        int i16 = i15 < 6 ? 16 : 64;
                        int iZzh = 8;
                        int i17 = 8;
                        for (int i18 = 0; i18 < i16; i18++) {
                            if (iZzh != 0) {
                                iZzh = ((i17 + zzgnVar.zzh()) + 256) % 256;
                            }
                            if (iZzh != 0) {
                                i17 = iZzh;
                            }
                        }
                    }
                    i15++;
                }
            }
            i8 = iZzg6;
        } else if (iZzf == 138) {
            iZzf = 138;
            iZzg = zzgnVar.zzg();
            if (iZzg != 3) {
            }
            i7 = 16;
            int iZzg62 = zzgnVar.zzg();
            iZzg2 = zzgnVar.zzg();
            zzgnVar.zza();
            if (zzgnVar.zze()) {
            }
            i8 = iZzg62;
        } else {
            iZzg = 1;
            i7 = 16;
            i8 = 0;
            zZze = false;
            iZzg2 = 0;
        }
        int iZzg7 = zzgnVar.zzg() + 4;
        int iZzg8 = zzgnVar.zzg();
        if (iZzg8 == 0) {
            iZzg3 = zzgnVar.zzg() + 4;
            i9 = 244;
        } else {
            if (iZzg8 == 1) {
                boolean zZze3 = zzgnVar.zze();
                zzgnVar.zzh();
                zzgnVar.zzh();
                long jZzg = zzgnVar.zzg();
                for (int i19 = 0; i19 < jZzg; i19++) {
                    zzgnVar.zzg();
                }
                z2 = zZze3;
                iZzg8 = 1;
                i9 = 244;
                iZzg3 = 0;
                int iZzg9 = zzgnVar.zzg();
                zzgnVar.zza();
                int iZzg10 = zzgnVar.zzg() + 1;
                int iZzg11 = zzgnVar.zzg() + 1;
                zZze2 = zzgnVar.zze();
                int i20 = 2 - (zZze2 ? 1 : 0);
                if (!zZze2) {
                    zzgnVar.zza();
                }
                zzgnVar.zza();
                int i21 = iZzg10 * 16;
                int i22 = iZzg11 * i20 * 16;
                if (zzgnVar.zze()) {
                    int iZzg12 = zzgnVar.zzg();
                    int iZzg13 = zzgnVar.zzg();
                    int iZzg14 = zzgnVar.zzg();
                    int iZzg15 = zzgnVar.zzg();
                    if (iZzg == 0) {
                        i13 = 1;
                    } else {
                        i13 = iZzg == 3 ? 1 : 2;
                        i20 *= iZzg == 1 ? 2 : 1;
                    }
                    i21 -= (iZzg12 + iZzg13) * i13;
                    i22 -= (iZzg14 + iZzg15) * i20;
                }
                if (iZzf != 44 || iZzf == 86 || iZzf == 100 || iZzf == 110 || iZzf == 122) {
                    iZzg4 = (iZzf2 & 16) != 0 ? 0 : i7;
                } else if (iZzf == i9) {
                    iZzf = i9;
                    if ((iZzf2 & 16) != 0) {
                    }
                }
                float f4 = 1.0f;
                int i23 = -1;
                if (zzgnVar.zze()) {
                    i10 = iZzg4;
                    f3 = 1.0f;
                    i11 = -1;
                    i12 = -1;
                } else {
                    if (zzgnVar.zze()) {
                        int iZzf4 = zzgnVar.zzf(8);
                        if (iZzf4 == 255) {
                            int i24 = i7;
                            int iZzf5 = zzgnVar.zzf(i24);
                            int iZzf6 = zzgnVar.zzf(i24);
                            if (iZzf5 != 0 && iZzf6 != 0) {
                                f4 = iZzf5 / iZzf6;
                            }
                        } else if (iZzf4 < 17) {
                            f4 = zzb[iZzf4];
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(iZzf4).length() + 35);
                            sb.append("Unexpected aspect_ratio_idc value: ");
                            sb.append(iZzf4);
                            zzee.zzc("NalUnitUtil", sb.toString());
                        }
                    }
                    if (zzgnVar.zze()) {
                        zzgnVar.zza();
                    }
                    if (zzgnVar.zze()) {
                        zzgnVar.zzb(3);
                        int i25 = true != zzgnVar.zze() ? 2 : 1;
                        if (zzgnVar.zze()) {
                            int iZzf7 = zzgnVar.zzf(8);
                            int iZzf8 = zzgnVar.zzf(8);
                            zzgnVar.zzb(8);
                            iZzb = zzi.zzb(iZzf7);
                            iZzc = zzi.zzc(iZzf8);
                        } else {
                            iZzb = -1;
                            iZzc = -1;
                        }
                        i23 = i25;
                    } else {
                        iZzb = -1;
                        iZzc = -1;
                    }
                    if (zzgnVar.zze()) {
                        zzgnVar.zzg();
                        zzgnVar.zzg();
                    }
                    if (zzgnVar.zze()) {
                        zzgnVar.zzb(65);
                    }
                    boolean zZze4 = zzgnVar.zze();
                    if (zZze4) {
                        zzp(zzgnVar);
                    }
                    boolean zZze5 = zzgnVar.zze();
                    if (zZze5) {
                        zzp(zzgnVar);
                    }
                    if (zZze4 || zZze5) {
                        zzgnVar.zza();
                    }
                    zzgnVar.zza();
                    if (zzgnVar.zze()) {
                        zzgnVar.zza();
                        zzgnVar.zzg();
                        zzgnVar.zzg();
                        zzgnVar.zzg();
                        zzgnVar.zzg();
                        iZzg4 = zzgnVar.zzg();
                        zzgnVar.zzg();
                    }
                    i12 = iZzc;
                    i10 = iZzg4;
                    f3 = f4;
                    i11 = i23;
                    i23 = iZzb;
                }
                return new zzgl(iZzf, iZzf2, iZzf3, iZzg5, iZzg9, i21, i22, f3, i8, iZzg2, zZze, zZze2, iZzg7, iZzg8, iZzg3, z2, i23, i11, i12, i10);
            }
            i9 = 244;
            iZzg3 = 0;
        }
        z2 = false;
        int iZzg92 = zzgnVar.zzg();
        zzgnVar.zza();
        int iZzg102 = zzgnVar.zzg() + 1;
        int iZzg112 = zzgnVar.zzg() + 1;
        zZze2 = zzgnVar.zze();
        int i202 = 2 - (zZze2 ? 1 : 0);
        if (!zZze2) {
        }
        zzgnVar.zza();
        int i212 = iZzg102 * 16;
        int i222 = iZzg112 * i202 * 16;
        if (zzgnVar.zze()) {
        }
        if (iZzf != 44) {
            if ((iZzf2 & 16) != 0) {
            }
        }
        float f42 = 1.0f;
        int i232 = -1;
        if (zzgnVar.zze()) {
        }
        return new zzgl(iZzf, iZzf2, iZzf3, iZzg5, iZzg92, i212, i222, f3, i8, iZzg2, zZze, zZze2, iZzg7, iZzg8, iZzg3, z2, i232, i11, i12, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgj zzf(byte[] bArr, int i2, int i3) {
        int i5;
        int[] iArr;
        zzgi zzgiVar;
        boolean z2;
        int iZzf;
        zzga zzgaVar;
        int iZzf2;
        int iZzf3;
        int iZzf4;
        zzguf zzgufVar;
        boolean[][] zArr;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean[][] zArr2;
        int[] iArr2;
        boolean[][] zArr3;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        boolean zZze;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iZzg;
        int i19;
        int i20;
        boolean z3;
        boolean z4;
        zzgn zzgnVar = new zzgn(bArr, i2, i3);
        zzga zzgaVarZzl = zzl(zzgnVar);
        zzgnVar.zzb(4);
        boolean zZze2 = zzgnVar.zze();
        boolean zZze3 = zzgnVar.zze();
        int iZzf5 = zzgnVar.zzf(6);
        int i21 = iZzf5 + 1;
        int iZzf6 = zzgnVar.zzf(3);
        zzgnVar.zzb(17);
        zzgb zzgbVarZzm = zzm(zzgnVar, true, iZzf6, null);
        for (int i22 = true != zzgnVar.zze() ? iZzf6 : 0; i22 <= iZzf6; i22++) {
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zzg();
        }
        int iZzf7 = zzgnVar.zzf(6);
        int iZzg2 = zzgnVar.zzg() + 1;
        int i23 = 6;
        zzgc zzgcVar = new zzgc(zzguf.zzj(zzgbVarZzm), new int[1]);
        boolean z5 = i21 >= 2 && iZzg2 >= 2;
        boolean z6 = zZze2 && zZze3;
        int i24 = 1;
        int i25 = iZzf7 + 1;
        if (!z5 || !z6 || i25 < i21) {
            return new zzgj(zzgaVarZzl, null, zzgcVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iZzg2, i25);
        int[] iArr5 = new int[iZzg2];
        int[] iArr6 = new int[iZzg2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i26 = 1; i26 < iZzg2; i26++) {
            int i27 = 0;
            for (int i28 = 0; i28 <= iZzf7; i28++) {
                if (zzgnVar.zze()) {
                    iArr4[i26][i27] = i28;
                    iArr6[i26] = i28;
                    i27++;
                }
                iArr5[i26] = i27;
            }
        }
        if (zzgnVar.zze()) {
            zzgnVar.zzb(64);
            if (zzgnVar.zze()) {
                zzgnVar.zzg();
            }
            int iZzg3 = zzgnVar.zzg();
            int i29 = 0;
            while (i29 < iZzg3) {
                zzgnVar.zzg();
                if (i29 == 0 || zzgnVar.zze()) {
                    boolean zZze4 = zzgnVar.zze();
                    boolean zZze5 = zzgnVar.zze();
                    if (zZze4 || zZze5) {
                        zZze = zzgnVar.zze();
                        i14 = iZzg3;
                        if (zZze) {
                            zzgnVar.zzb(19);
                        }
                        zzgnVar.zzb(8);
                        if (zZze) {
                            zzgnVar.zzb(4);
                        }
                        zzgnVar.zzb(15);
                        i16 = zZze4;
                        i15 = zZze5;
                        i17 = 0;
                        while (i17 <= iZzf6) {
                            if (zzgnVar.zze() || zzgnVar.zze()) {
                                zzgnVar.zzg();
                            } else {
                                if (zzgnVar.zze()) {
                                    i18 = i17;
                                    iZzg = 0;
                                }
                                zzga zzgaVar2 = zzgaVarZzl;
                                i19 = i16 + i15;
                                int[][] iArr7 = iArr4;
                                i20 = 0;
                                while (i20 < i19) {
                                    int i30 = i19;
                                    for (int i31 = 0; i31 <= iZzg; i31++) {
                                        zzgnVar.zzg();
                                        zzgnVar.zzg();
                                        if (zZze) {
                                            zzgnVar.zzg();
                                            zzgnVar.zzg();
                                        }
                                        zzgnVar.zza();
                                    }
                                    i20++;
                                    i19 = i30;
                                }
                                i17 = i18 + 1;
                                zzgaVarZzl = zzgaVar2;
                                iArr4 = iArr7;
                            }
                            i18 = i17;
                            iZzg = zzgnVar.zzg();
                            zzga zzgaVar22 = zzgaVarZzl;
                            i19 = i16 + i15;
                            int[][] iArr72 = iArr4;
                            i20 = 0;
                            while (i20 < i19) {
                            }
                            i17 = i18 + 1;
                            zzgaVarZzl = zzgaVar22;
                            iArr4 = iArr72;
                        }
                        i29++;
                        iZzg3 = i14;
                    } else {
                        i14 = iZzg3;
                        z4 = zZze4;
                        z3 = zZze5;
                    }
                } else {
                    i14 = iZzg3;
                    z4 = false;
                    z3 = false;
                }
                zZze = false;
                i16 = z4;
                i15 = z3;
                i17 = 0;
                while (i17 <= iZzf6) {
                }
                i29++;
                iZzg3 = i14;
            }
        }
        zzga zzgaVar3 = zzgaVarZzl;
        int[][] iArr8 = iArr4;
        if (!zzgnVar.zze()) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        zzgnVar.zzc();
        zzgb zzgbVarZzm2 = zzm(zzgnVar, false, iZzf6, zzgbVarZzm);
        boolean zZze6 = zzgnVar.zze();
        boolean[] zArr4 = new boolean[16];
        int i32 = 0;
        for (int i33 = 0; i33 < 16; i33++) {
            boolean zZze7 = zzgnVar.zze();
            zArr4[i33] = zZze7;
            if (zZze7) {
                i32++;
            }
        }
        if (i32 == 0 || !zArr4[1]) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        int i34 = i32 + 1;
        int[] iArr9 = new int[i32];
        for (int i35 = 0; i35 < i32 - (zZze6 ? 1 : 0); i35++) {
            iArr9[i35] = zzgnVar.zzf(3);
        }
        int[] iArr10 = new int[i34];
        if (zZze6) {
            for (int i36 = 1; i36 < i32; i36++) {
                for (int i37 = 0; i37 < i36; i37++) {
                    iArr10[i36] = iArr10[i36] + iArr9[i37] + 1;
                }
            }
            iArr10[i32] = 6;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i21, i32);
        int[] iArr12 = new int[i21];
        iArr12[0] = 0;
        boolean zZze8 = zzgnVar.zze();
        int i38 = 1;
        while (i38 < i21) {
            if (zZze8) {
                iArr12[i38] = zzgnVar.zzf(i23);
            } else {
                iArr12[i38] = i38;
            }
            if (zZze6) {
                i13 = i38;
                for (int i39 = 0; i39 < i32; i39++) {
                    iArr11[i13][i39] = (iArr12[i13] & ((1 << iArr10[r31]) - 1)) >> iArr10[i39];
                }
            } else {
                int i40 = 0;
                while (i40 < i32) {
                    iArr11[i38][i40] = zzgnVar.zzf(iArr9[i40] + 1);
                    i40++;
                    i38 = i38;
                }
                i13 = i38;
            }
            i38 = i13 + 1;
            i23 = 6;
        }
        int[] iArr13 = new int[i25];
        int i41 = 1;
        int i42 = 0;
        while (i42 < i21) {
            iArr13[iArr12[i42]] = -1;
            int[] iArr14 = iArr13;
            int i43 = 0;
            int i44 = 0;
            while (i43 < 16) {
                if (zArr4[i43]) {
                    i12 = i24;
                    if (i43 == i12) {
                        iArr14[iArr12[i42]] = iArr11[i42][i44];
                        i43 = i12;
                    }
                    i44++;
                } else {
                    i12 = i24;
                }
                i43 += i12;
                i24 = i12;
            }
            if (i42 > 0) {
                int i45 = 0;
                while (true) {
                    if (i45 >= i42) {
                        i41++;
                        break;
                    }
                    if (iArr14[iArr12[i42]] == iArr14[iArr12[i45]]) {
                        break;
                    }
                    i45++;
                }
            }
            i42++;
            iArr13 = iArr14;
            i24 = 1;
        }
        int[] iArr15 = iArr13;
        int iZzf8 = zzgnVar.zzf(4);
        if (i41 < 2 || iZzf8 == 0) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        int[] iArr16 = new int[i41];
        for (int i46 = 0; i46 < i41; i46++) {
            iArr16[i46] = zzgnVar.zzf(iZzf8);
        }
        int[] iArr17 = new int[i25];
        for (int i47 = 0; i47 < i21; i47++) {
            iArr17[Math.min(iArr12[i47], iZzf7)] = i47;
        }
        zzguc zzgucVar = new zzguc();
        int i48 = 0;
        while (i48 <= iZzf7) {
            int[] iArr18 = iArr16;
            int i49 = i41;
            int iMin = Math.min(iArr15[i48], i49 - 1);
            int[] iArr19 = iArr17;
            zzgucVar.zzf(new zzfz(iArr19[i48], iMin >= 0 ? iArr18[iMin] : -1));
            i48++;
            i41 = i49;
            iArr16 = iArr18;
            iArr17 = iArr19;
        }
        zzguf zzgufVarZzi = zzgucVar.zzi();
        if (((zzfz) zzgufVarZzi.get(0)).zzb == -1) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        int i50 = 1;
        while (true) {
            zzga zzgaVar4 = zzgaVar3;
            if (i50 > iZzf7) {
                zzgaVar3 = zzgaVar4;
                i5 = -1;
                i50 = -1;
                break;
            }
            zzgaVar3 = zzgaVar4;
            i5 = -1;
            if (((zzfz) zzgufVarZzi.get(i50)).zzb != -1) {
                break;
            }
            i50++;
        }
        if (i50 == i5) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i21, i21);
        boolean[][] zArr6 = (boolean[][]) Array.newInstance((Class<?>) cls2, i21, i21);
        int i51 = 1;
        while (i51 < i21) {
            boolean[][] zArr7 = zArr6;
            for (int i52 = 0; i52 < i51; i52++) {
                boolean[] zArr8 = zArr5[i51];
                boolean[] zArr9 = zArr7[i51];
                boolean zZze9 = zzgnVar.zze();
                zArr9[i52] = zZze9;
                zArr8[i52] = zZze9;
            }
            i51++;
            zArr6 = zArr7;
        }
        boolean[][] zArr10 = zArr6;
        for (int i53 = 1; i53 < i21; i53++) {
            int i54 = 0;
            while (i54 < iZzf5) {
                int i55 = i54;
                int i56 = 0;
                while (true) {
                    if (i56 < i53) {
                        boolean[] zArr11 = zArr10[i53];
                        if (zArr11[i56] && zArr10[i56][i55]) {
                            zArr11[i55] = true;
                            break;
                        }
                        i56++;
                    }
                }
                i54 = i55 + 1;
            }
        }
        int[] iArr20 = new int[i25];
        int i57 = 0;
        while (i57 < i21) {
            int[] iArr21 = iArr20;
            int i58 = 0;
            for (int i59 = 0; i59 < i57; i59++) {
                i58 += zArr5[i57][i59] ? 1 : 0;
            }
            iArr21[iArr12[i57]] = i58;
            i57++;
            iArr20 = iArr21;
        }
        int[] iArr22 = iArr20;
        int i60 = 0;
        for (int i61 = 0; i61 < i21; i61++) {
            if (iArr22[iArr12[i61]] == 0) {
                i60++;
            }
        }
        if (i60 > 1) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        int[] iArr23 = new int[i21];
        int[] iArr24 = new int[iZzg2];
        if (zzgnVar.zze()) {
            iArr = iArr24;
            int i62 = 0;
            while (i62 < i21) {
                int i63 = i62;
                iArr23[i63] = zzgnVar.zzf(3);
                i62 = i63 + 1;
            }
        } else {
            iArr = iArr24;
            Arrays.fill(iArr23, 0, i21, iZzf6);
        }
        int i64 = 0;
        while (i64 < iZzg2) {
            int[] iArr25 = iArr23;
            int i65 = i64;
            int[] iArr26 = iArr12;
            int iMax = 0;
            for (int i66 = 0; i66 < iArr5[i65]; i66++) {
                iMax = Math.max(iMax, iArr25[((zzfz) zzgufVarZzi.get(iArr8[i65][i66])).zza]);
            }
            iArr[i65] = iMax + 1;
            i64 = i65 + 1;
            iArr23 = iArr25;
            iArr12 = iArr26;
        }
        int[] iArr27 = iArr12;
        if (zzgnVar.zze()) {
            int i67 = 0;
            while (i67 < iZzf5) {
                int i68 = i67 + 1;
                int i69 = i68;
                while (i69 < i21) {
                    if (zArr5[i69][i67]) {
                        i11 = i67;
                        zzgnVar.zzb(3);
                    } else {
                        i11 = i67;
                    }
                    i69++;
                    i67 = i11;
                }
                i67 = i68;
            }
        }
        zzgnVar.zza();
        int iZzg4 = zzgnVar.zzg() + 1;
        zzguc zzgucVar2 = new zzguc();
        zzgucVar2.zzf(zzgbVarZzm);
        if (iZzg4 > 1) {
            zzgucVar2.zzf(zzgbVarZzm2);
            for (int i70 = 2; i70 < iZzg4; i70++) {
                zzgbVarZzm2 = zzm(zzgnVar, zzgnVar.zze(), iZzf6, zzgbVarZzm2);
                zzgucVar2.zzf(zzgbVarZzm2);
            }
        }
        zzguf zzgufVarZzi2 = zzgucVar2.zzi();
        int iZzg5 = zzgnVar.zzg() + iZzg2;
        if (iZzg5 > iZzg2) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        int iZzf9 = zzgnVar.zzf(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, iZzg5, i25);
        int[] iArr28 = new int[iZzg5];
        int i71 = 0;
        int[] iArr29 = new int[iZzg5];
        int i72 = 0;
        while (i72 < iZzg2) {
            iArr28[i72] = i71;
            int i73 = i72;
            int i74 = iArr6[i73];
            iArr29[i73] = i74;
            if (iZzf9 == 0) {
                iArr2 = iArr6;
                zArr3 = zArr12;
                iArr3 = iArr28;
                Arrays.fill(zArr12[i73], i71, iArr5[i73], true);
                iArr3[i73] = iArr5[i73];
            } else {
                iArr2 = iArr6;
                zArr3 = zArr12;
                iArr3 = iArr28;
                if (iZzf9 == 1) {
                    for (int i75 = 0; i75 < iArr5[i73]; i75++) {
                        zArr3[i73][i75] = iArr8[i73][i75] == i74;
                    }
                    iArr3[i73] = 1;
                } else {
                    i71 = 0;
                    zArr3[0][0] = true;
                    iArr3[0] = 1;
                    i72 = i73 + 1;
                    iArr6 = iArr2;
                    zArr12 = zArr3;
                    iArr28 = iArr3;
                }
            }
            i71 = 0;
            i72 = i73 + 1;
            iArr6 = iArr2;
            zArr12 = zArr3;
            iArr28 = iArr3;
        }
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i25];
        int i76 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i25;
        iArr32[i71] = iZzg5;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i77 = 1;
        int i78 = 0;
        while (i77 < iZzg5) {
            if (iZzf9 == i76) {
                for (int i79 = 0; i79 < iArr5[i77]; i79++) {
                    zArr13[i77][i79] = zzgnVar.zze();
                    int i80 = iArr30[i77];
                    boolean z7 = zArr13[i77][i79];
                    iArr30[i77] = i80 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr29[i77] = iArr8[i77][i79];
                    }
                }
            }
            if (i78 == 0) {
                i8 = 0;
                if (iArr8[i77][0] == 0 && zArr13[i77][0]) {
                    i78 = 0;
                    for (int i81 = 1; i81 < iArr5[i77]; i81++) {
                        if (iArr8[i77][i81] == i50 && zArr13[i77][i50]) {
                            i78 = i77;
                        }
                    }
                } else {
                    i78 = 0;
                }
            } else {
                i8 = 0;
            }
            int i82 = i8;
            while (i82 < iArr5[i77]) {
                if (iZzg4 > 1) {
                    zArr14[i77][i82] = zArr13[i77][i82];
                    zArr2 = zArr5;
                    i9 = iZzg4;
                    int iZzc = zzgxp.zzc(iZzg4, RoundingMode.CEILING);
                    if (zArr14[i77][i82]) {
                        i10 = iZzf9;
                        if (zArr14[i77][i82]) {
                        }
                    } else {
                        int i83 = ((zzfz) zzgufVarZzi.get(iArr8[i77][i82])).zza;
                        int i84 = i8;
                        while (i84 < i82) {
                            i10 = iZzf9;
                            if (zArr10[i83][((zzfz) zzgufVarZzi.get(iArr8[i77][i84])).zza]) {
                                zArr14[i77][i82] = true;
                                break;
                            }
                            i84++;
                            iZzf9 = i10;
                        }
                        i10 = iZzf9;
                        if (zArr14[i77][i82]) {
                            if (i78 <= 0 || i77 != i78) {
                                zzgnVar.zzb(iZzc);
                            } else {
                                iArr31[i82] = zzgnVar.zzf(iZzc);
                            }
                        }
                    }
                } else {
                    i9 = iZzg4;
                    i10 = iZzf9;
                    zArr2 = zArr5;
                }
                i82++;
                zArr5 = zArr2;
                iZzg4 = i9;
                iZzf9 = i10;
            }
            int i85 = iZzg4;
            int i86 = iZzf9;
            boolean[][] zArr15 = zArr5;
            if (iArr30[i77] == 1 && iArr22[iArr29[i77]] > 0) {
                zzgnVar.zza();
            }
            i77++;
            zArr5 = zArr15;
            iZzg4 = i85;
            iZzf9 = i86;
            i76 = 2;
        }
        boolean[][] zArr16 = zArr5;
        if (i78 == 0) {
            return new zzgj(zzgaVar3, null, zzgcVar, null, null);
        }
        zzga zzgaVar5 = zzgaVar3;
        int iZzg6 = zzgnVar.zzg();
        int i87 = iZzg6 + 1;
        zzguc zzgucVarZzv = zzguf.zzv(i87);
        int[] iArr33 = new int[i21];
        int i88 = 0;
        while (i88 < i87) {
            int iZzf10 = zzgnVar.zzf(16);
            zzguf zzgufVar2 = zzgufVarZzi;
            int iZzf11 = zzgnVar.zzf(16);
            if (zzgnVar.zze()) {
                zzgaVar = zzgaVar5;
                iZzf2 = zzgnVar.zzf(2);
                if (iZzf2 == 3) {
                    zzgnVar.zza();
                }
                iZzf3 = zzgnVar.zzf(4);
                iZzf4 = zzgnVar.zzf(4);
            } else {
                zzgaVar = zzgaVar5;
                iZzf2 = 0;
                iZzf3 = 0;
                iZzf4 = 0;
            }
            if (zzgnVar.zze()) {
                int iZzg7 = zzgnVar.zzg();
                zArr = zArr14;
                int iZzg8 = zzgnVar.zzg();
                i7 = i88;
                int iZzg9 = zzgnVar.zzg();
                zzgufVar = zzgufVarZzi2;
                int iZzg10 = zzgnVar.zzg();
                iZzf10 = zzn(iZzf10, iZzf2, iZzg7, iZzg8);
                iZzf11 = zzo(iZzf11, iZzf2, iZzg9, iZzg10);
            } else {
                zzgufVar = zzgufVarZzi2;
                zArr = zArr14;
                i7 = i88;
            }
            zzgucVarZzv.zzf(new zzgd(iZzf2, iZzf3, iZzf4, iZzf10, iZzf11));
            i88 = i7 + 1;
            zzgufVarZzi = zzgufVar2;
            zArr14 = zArr;
            zzgaVar5 = zzgaVar;
            zzgufVarZzi2 = zzgufVar;
        }
        zzguf zzgufVar3 = zzgufVarZzi;
        zzga zzgaVar6 = zzgaVar5;
        zzguf zzgufVar4 = zzgufVarZzi2;
        boolean[][] zArr17 = zArr14;
        if (i87 <= 1 || !zzgnVar.zze()) {
            for (int i89 = 1; i89 < i21; i89++) {
                iArr33[i89] = Math.min(i89, iZzg6);
            }
        } else {
            int iZzc2 = zzgxp.zzc(i87, RoundingMode.CEILING);
            for (int i90 = 1; i90 < i21; i90++) {
                iArr33[i90] = zzgnVar.zzf(iZzc2);
            }
        }
        zzge zzgeVar = new zzge(zzgucVarZzv.zzi(), iArr33);
        zzgnVar.zzb(2);
        for (int i91 = 1; i91 < i21; i91++) {
            if (iArr22[iArr27[i91]] == 0) {
                zzgnVar.zza();
            }
        }
        for (int i92 = 1; i92 < iZzg5; i92++) {
            boolean zZze10 = zzgnVar.zze();
            int i93 = 0;
            while (i93 < iArr[i92]) {
                if ((i93 <= 0 || !zZze10) ? i93 == 0 : zzgnVar.zze()) {
                    for (int i94 = 0; i94 < iArr5[i92]; i94++) {
                        if (zArr17[i92][i94]) {
                            zzgnVar.zzg();
                        }
                    }
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                }
                i93++;
            }
        }
        int iZzg11 = zzgnVar.zzg() + 2;
        if (zzgnVar.zze()) {
            zzgnVar.zzb(iZzg11);
        } else {
            for (int i95 = 1; i95 < i21; i95++) {
                for (int i96 = 0; i96 < i95; i96++) {
                    if (zArr16[i95][i96]) {
                        zzgnVar.zzb(iZzg11);
                    }
                }
            }
        }
        int iZzg12 = zzgnVar.zzg();
        for (int i97 = 1; i97 <= iZzg12; i97++) {
            zzgnVar.zzb(8);
        }
        if (zzgnVar.zze()) {
            zzgnVar.zzc();
            if (zzgnVar.zze() || zzgnVar.zze()) {
                zzgnVar.zza();
            }
            boolean zZze11 = zzgnVar.zze();
            boolean zZze12 = zzgnVar.zze();
            if (zZze11 || zZze12) {
                for (int i98 = 0; i98 < iZzg2; i98++) {
                    for (int i99 = 0; i99 < iArr[i98]; i99++) {
                        boolean zZze13 = zZze11 ? zzgnVar.zze() : false;
                        boolean zZze14 = zZze12 ? zzgnVar.zze() : false;
                        if (zZze13) {
                            zzgnVar.zzb(32);
                        }
                        if (zZze14) {
                            zzgnVar.zzb(18);
                        }
                    }
                }
            }
            boolean zZze15 = zzgnVar.zze();
            if (zZze15) {
                z2 = true;
                iZzf = zzgnVar.zzf(4) + 1;
            } else {
                z2 = true;
                iZzf = i21;
            }
            zzguc zzgucVarZzv2 = zzguf.zzv(iZzf);
            int[] iArr34 = new int[i21];
            int i100 = 0;
            while (i100 < iZzf) {
                zzgnVar.zzb(3);
                int i101 = z2 != zzgnVar.zze() ? 2 : 1;
                int iZzb = zzi.zzb(zzgnVar.zzf(8));
                int iZzc3 = zzi.zzc(zzgnVar.zzf(8));
                zzgnVar.zzb(8);
                zzgucVarZzv2.zzf(new zzgh(iZzb, i101, iZzc3));
                i100++;
                z2 = true;
            }
            if (zZze15 && iZzf > 1) {
                for (int i102 = 0; i102 < i21; i102++) {
                    iArr34[i102] = zzgnVar.zzf(4);
                }
            }
            zzgiVar = new zzgi(zzgucVarZzv2.zzi(), iArr34);
        } else {
            zzgiVar = null;
        }
        return new zzgj(zzgaVar6, zzgufVar3, new zzgc(zzgufVar4, iArr31), zzgeVar, zzgiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgg zzg(byte[] bArr, int i2, int i3, @Nullable zzgj zzgjVar) {
        boolean z2;
        int i5;
        int i7;
        int iZzo;
        int iZzn;
        int iZzg;
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzg2;
        int i12;
        int i13;
        int i14;
        int iMax;
        float f3;
        zzgb zzgbVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iZzb;
        int iZzc;
        int i22;
        zzgi zzgiVar;
        int i23;
        int i24;
        zzga zzgaVar;
        int i25;
        int i26;
        int i27;
        zzge zzgeVar;
        zzga zzgaVarZzl = zzl(new zzgn(bArr, i2, i3));
        zzgn zzgnVar = new zzgn(bArr, i2 + 2, i3);
        zzgnVar.zzb(4);
        int iZzf = zzgnVar.zzf(3);
        int i28 = zzgaVarZzl.zzb;
        if (i28 == 0 || iZzf != 7) {
            z2 = false;
        } else {
            iZzf = 7;
            z2 = true;
        }
        if (zzgjVar != null) {
            zzguf zzgufVar = zzgjVar.zza;
            i5 = !zzgufVar.isEmpty() ? ((zzfz) zzgufVar.get(Math.min(i28, zzgufVar.size() - 1))).zza : 0;
        }
        zzgb zzgbVarZzm = null;
        if (!z2) {
            zzgnVar.zza();
            zzgbVarZzm = zzm(zzgnVar, true, iZzf, null);
        } else if (zzgjVar != null) {
            zzgc zzgcVar = zzgjVar.zzb;
            int i29 = zzgcVar.zzb[i5];
            zzguf zzgufVar2 = zzgcVar.zza;
            if (zzgufVar2.size() > i29) {
                zzgbVarZzm = (zzgb) zzgufVar2.get(i29);
            }
        }
        int iZzg3 = zzgnVar.zzg();
        if (z2) {
            int iZzf2 = zzgnVar.zze() ? zzgnVar.zzf(8) : -1;
            if (zzgjVar == null || (zzgeVar = zzgjVar.zzc) == null) {
                i9 = 0;
                i11 = 0;
                iZzg = 0;
                i12 = 0;
                iZzg2 = 0;
                i8 = 0;
                i10 = 0;
            } else {
                if (iZzf2 == -1) {
                    iZzf2 = zzgeVar.zzb[i5];
                }
                if (iZzf2 != -1) {
                    zzguf zzgufVar3 = zzgeVar.zza;
                    if (zzgufVar3.size() > iZzf2) {
                        zzgd zzgdVar = (zzgd) zzgufVar3.get(iZzf2);
                        int i30 = zzgdVar.zza;
                        i10 = zzgdVar.zzd;
                        i8 = zzgdVar.zze;
                        iZzg = zzgdVar.zzb;
                        iZzg2 = zzgdVar.zzc;
                        i12 = i30;
                        i9 = i8;
                        i11 = i10;
                    }
                }
            }
        } else {
            int iZzg4 = zzgnVar.zzg();
            if (iZzg4 == 3) {
                zzgnVar.zza();
                i7 = 3;
            } else {
                i7 = iZzg4;
            }
            int iZzg5 = zzgnVar.zzg();
            int iZzg6 = zzgnVar.zzg();
            if (zzgnVar.zze()) {
                int iZzg7 = zzgnVar.zzg();
                int iZzg8 = zzgnVar.zzg();
                int iZzg9 = zzgnVar.zzg();
                int iZzg10 = zzgnVar.zzg();
                iZzn = zzn(iZzg5, i7, iZzg7, iZzg8);
                iZzo = zzo(iZzg6, i7, iZzg9, iZzg10);
            } else {
                iZzo = iZzg6;
                iZzn = iZzg5;
            }
            iZzg = zzgnVar.zzg();
            i8 = iZzo;
            i9 = iZzg6;
            i10 = iZzn;
            i11 = iZzg5;
            iZzg2 = zzgnVar.zzg();
            i12 = iZzg4;
        }
        int iZzg11 = zzgnVar.zzg();
        if (z2) {
            i13 = i9;
            i14 = i11;
            iMax = -1;
        } else {
            i13 = i9;
            i14 = i11;
            iMax = -1;
            for (int i31 = true != zzgnVar.zze() ? iZzf : 0; i31 <= iZzf; i31++) {
                zzgnVar.zzg();
                iMax = Math.max(zzgnVar.zzg(), iMax);
                zzgnVar.zzg();
            }
        }
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        if (zzgnVar.zze()) {
            if (z2 && zzgnVar.zze()) {
                zzgnVar.zzb(6);
            } else if (zzgnVar.zze()) {
                int i32 = 0;
                int i33 = 4;
                while (i32 < i33) {
                    int i34 = iMax;
                    int i35 = i33;
                    for (int i36 = 0; i36 < 6; i36 = i27 + (i32 == 3 ? 3 : 1)) {
                        if (zzgnVar.zze()) {
                            i27 = i36;
                            int iMin = Math.min(64, 1 << ((i32 + i32) + 4));
                            if (i32 > 1) {
                                zzgnVar.zzh();
                            }
                            for (int i37 = 0; i37 < iMin; i37++) {
                                zzgnVar.zzh();
                            }
                        } else {
                            zzgnVar.zzg();
                            i27 = i36;
                        }
                    }
                    i32++;
                    iMax = i34;
                    i33 = i35;
                }
            }
        }
        int i38 = iMax;
        zzgnVar.zzb(2);
        if (zzgnVar.zze()) {
            zzgnVar.zzb(8);
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zza();
        }
        int iZzg12 = zzgnVar.zzg();
        int i39 = 0;
        int[] iArr = new int[0];
        int i40 = iZzf;
        int[] iArrCopyOf = new int[0];
        int i41 = iZzg;
        int i42 = -1;
        int i43 = -1;
        while (i39 < iZzg12) {
            if (i39 == 0 || !zzgnVar.zze()) {
                i23 = iZzg12;
                i24 = i39;
                zzgaVar = zzgaVarZzl;
                i25 = i5;
                int iZzg13 = zzgnVar.zzg();
                int iZzg14 = zzgnVar.zzg();
                int[] iArr2 = new int[iZzg13];
                int i44 = 0;
                while (i44 < iZzg13) {
                    iArr2[i44] = (i44 > 0 ? iArr2[i44 - 1] : 0) - (zzgnVar.zzg() + 1);
                    zzgnVar.zza();
                    i44++;
                }
                int[] iArr3 = new int[iZzg14];
                int i45 = 0;
                while (i45 < iZzg14) {
                    iArr3[i45] = (i45 > 0 ? iArr3[i45 - 1] : 0) + zzgnVar.zzg() + 1;
                    zzgnVar.zza();
                    i45++;
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i42 = iZzg13;
                i43 = iZzg14;
            } else {
                i23 = iZzg12;
                int i46 = i42 + i43;
                boolean zZze = zzgnVar.zze();
                boolean z3 = true;
                int iZzg15 = zzgnVar.zzg() + 1;
                int i47 = 1 - ((zZze ? 1 : 0) + (zZze ? 1 : 0));
                i24 = i39;
                int i48 = i46 + 1;
                zzgaVar = zzgaVarZzl;
                boolean[] zArr = new boolean[i48];
                int i49 = 0;
                while (i49 <= i46) {
                    if (zzgnVar.zze()) {
                        zArr[i49] = z3;
                    } else {
                        zArr[i49] = zzgnVar.zze();
                    }
                    i49++;
                    z3 = true;
                }
                int i50 = i43 - 1;
                int[] iArr4 = new int[i48];
                int[] iArr5 = new int[i48];
                int i51 = 0;
                while (true) {
                    i26 = i47 * iZzg15;
                    if (i50 < 0) {
                        break;
                    }
                    int i52 = iArrCopyOf[i50] + i26;
                    if (i52 < 0 && zArr[i42 + i50]) {
                        iArr4[i51] = i52;
                        i51++;
                    }
                    i50--;
                }
                if (i26 < 0 && zArr[i46]) {
                    iArr4[i51] = i26;
                    i51++;
                }
                i25 = i5;
                int i53 = i51;
                for (int i54 = 0; i54 < i42; i54++) {
                    int i55 = iArr[i54] + i26;
                    if (i55 < 0 && zArr[i54]) {
                        iArr4[i53] = i55;
                        i53++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i53);
                int i56 = 0;
                for (int i57 = i42 - 1; i57 >= 0; i57--) {
                    int i58 = iArr[i57] + i26;
                    if (i58 > 0 && zArr[i57]) {
                        iArr5[i56] = i58;
                        i56++;
                    }
                }
                if (i26 > 0 && zArr[i46]) {
                    iArr5[i56] = i26;
                    i56++;
                }
                int i59 = i56;
                for (int i60 = 0; i60 < i43; i60++) {
                    int i61 = iArrCopyOf[i60] + i26;
                    if (i61 > 0 && zArr[i42 + i60]) {
                        iArr5[i59] = i61;
                        i59++;
                    }
                }
                iArr = iArrCopyOf2;
                iArrCopyOf = Arrays.copyOf(iArr5, i59);
                i42 = i53;
                i43 = i59;
            }
            i39 = i24 + 1;
            iZzg12 = i23;
            i5 = i25;
            zzgaVarZzl = zzgaVar;
        }
        zzga zzgaVar2 = zzgaVarZzl;
        int i62 = i5;
        if (zzgnVar.zze()) {
            int iZzg16 = zzgnVar.zzg();
            for (int i63 = 0; i63 < iZzg16; i63++) {
                zzgnVar.zzb(iZzg11 + 5);
            }
        }
        zzgnVar.zzb(2);
        float f4 = 1.0f;
        if (zzgnVar.zze()) {
            if (zzgnVar.zze()) {
                int iZzf3 = zzgnVar.zzf(8);
                if (iZzf3 == 255) {
                    int iZzf4 = zzgnVar.zzf(16);
                    int iZzf5 = zzgnVar.zzf(16);
                    if (iZzf4 != 0 && iZzf5 != 0) {
                        f4 = iZzf4 / iZzf5;
                    }
                } else if (iZzf3 < 17) {
                    f4 = zzb[iZzf3];
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzf3).length() + 35);
                    sb.append("Unexpected aspect_ratio_idc value: ");
                    sb.append(iZzf3);
                    zzee.zzc("NalUnitUtil", sb.toString());
                }
            }
            if (zzgnVar.zze()) {
                zzgnVar.zza();
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzb(3);
                i22 = true != zzgnVar.zze() ? 2 : 1;
                if (zzgnVar.zze()) {
                    int iZzf6 = zzgnVar.zzf(8);
                    int iZzf7 = zzgnVar.zzf(8);
                    zzgnVar.zzb(8);
                    iZzb = zzi.zzb(iZzf6);
                    iZzc = zzi.zzc(iZzf7);
                } else {
                    iZzb = -1;
                    iZzc = -1;
                }
            } else if (zzgjVar == null || (zzgiVar = zzgjVar.zzd) == null) {
                iZzb = -1;
                iZzc = -1;
                i22 = -1;
            } else {
                int i64 = zzgiVar.zzb[i62];
                zzguf zzgufVar4 = zzgiVar.zza;
                if (zzgufVar4.size() > i64) {
                    zzgh zzghVar = (zzgh) zzgufVar4.get(i64);
                    int i65 = zzghVar.zza;
                    int i66 = zzghVar.zzb;
                    iZzc = zzghVar.zzc;
                    iZzb = i65;
                    i22 = i66;
                }
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzg();
                zzgnVar.zzg();
            }
            zzgnVar.zza();
            if (zzgnVar.zze()) {
                i8 += i8;
            }
            i19 = iZzb;
            f3 = f4;
            zzgbVar = zzgbVarZzm;
            i15 = iZzg3;
            i16 = i10;
            i17 = i13;
            i18 = i14;
            i21 = iZzc;
            i20 = i22;
        } else {
            f3 = 1.0f;
            zzgbVar = zzgbVarZzm;
            i15 = iZzg3;
            i16 = i10;
            i17 = i13;
            i18 = i14;
            i19 = -1;
            i20 = -1;
            i21 = -1;
        }
        return new zzgg(zzgaVar2, i40, zzgbVar, i12, i41, iZzg2, i15, i16, i8, i18, i17, f3, i38, i19, i20, i21);
    }

    public static zzgk zzh(byte[] bArr, int i2, int i3) {
        zzgn zzgnVar = new zzgn(bArr, 4, i3);
        int iZzg = zzgnVar.zzg();
        int iZzg2 = zzgnVar.zzg();
        zzgnVar.zza();
        return new zzgk(iZzg, iZzg2, zzgnVar.zze());
    }

    public static int zzi(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i5 = i3 - i2;
        zzgrc.zzi(i5 >= 0);
        if (i5 == 0) {
            return i3;
        }
        if (zArr[0]) {
            zzj(zArr);
            return i2 - 3;
        }
        if (i5 > 1 && zArr[1] && bArr[i2] == 1) {
            zzj(zArr);
            return i2 - 2;
        }
        if (i5 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            zzj(zArr);
            return i2 - 1;
        }
        int i7 = i3 - 1;
        int i8 = i2 + 2;
        while (i8 < i7) {
            byte b2 = bArr[i8];
            if ((b2 & 254) == 0) {
                int i9 = i8 - 2;
                if (bArr[i9] == 0 && bArr[i8 - 1] == 0 && b2 == 1) {
                    zzj(zArr);
                    return i9;
                }
                i8 = i9;
            }
            i8 += 3;
        }
        zArr[0] = i5 <= 2 ? !(i5 != 2 ? !(zArr[1] && bArr[i7] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i7] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i7] == 1;
        zArr[1] = i5 <= 1 ? zArr[2] && bArr[i7] == 0 : bArr[i3 + (-2)] == 0 && bArr[i7] == 0;
        zArr[2] = bArr[i7] == 0;
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzgb zzm(zzgn zzgnVar, boolean z2, int i2, @Nullable zzgb zzgbVar) {
        int[] iArr;
        int i3;
        boolean z3;
        int i5;
        int i7;
        boolean zZze;
        int iZzf;
        int i8;
        int[] iArr2 = new int[6];
        if (z2) {
            int iZzf2 = zzgnVar.zzf(2);
            zZze = zzgnVar.zze();
            iZzf = zzgnVar.zzf(5);
            i8 = 0;
            for (int i9 = 0; i9 < 32; i9++) {
                if (zzgnVar.zze()) {
                    i8 |= 1 << i9;
                }
            }
            for (int i10 = 0; i10 < 6; i10++) {
                iArr2[i10] = zzgnVar.zzf(8);
            }
            i3 = iZzf2;
        } else {
            if (zzgbVar == null) {
                iArr = iArr2;
                i3 = 0;
                z3 = false;
                i5 = 0;
                i7 = 0;
                int iZzf3 = zzgnVar.zzf(8);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    if (zzgnVar.zze()) {
                        i11 += 88;
                    }
                    if (zzgnVar.zze()) {
                        i11 += 8;
                    }
                }
                zzgnVar.zzb(i11);
                if (i2 > 0) {
                    int i13 = 8 - i2;
                    zzgnVar.zzb(i13 + i13);
                }
                return new zzgb(i3, z3, i5, i7, iArr, iZzf3);
            }
            int i14 = zzgbVar.zza;
            zZze = zzgbVar.zzb;
            iZzf = zzgbVar.zzc;
            i8 = zzgbVar.zzd;
            iArr2 = zzgbVar.zze;
            i3 = i14;
        }
        iArr = iArr2;
        z3 = zZze;
        i5 = iZzf;
        i7 = i8;
        int iZzf32 = zzgnVar.zzf(8);
        int i112 = 0;
        while (i12 < i2) {
        }
        zzgnVar.zzb(i112);
        if (i2 > 0) {
        }
        return new zzgb(i3, z3, i5, i7, iArr, iZzf32);
    }

    @Nullable
    private static String zzq(zzv zzvVar) {
        String str;
        String str2 = zzvVar.zzo;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.zzk) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }

    public static boolean zzb(zzv zzvVar, byte b2) {
        String strZzq = zzq(zzvVar);
        if (Objects.equals(strZzq, "video/avc") && (b2 & 31) == 6) {
            return true;
        }
        if (Objects.equals(strZzq, "video/hevc") && ((b2 & 126) >> 1) == 39) {
            return true;
        }
        return false;
    }

    public static int zzc(zzv zzvVar) {
        String strZzq = zzq(zzvVar);
        if (Objects.equals(strZzq, "video/avc")) {
            return 1;
        }
        if (Objects.equals(strZzq, "video/hevc")) {
            return 2;
        }
        return 0;
    }

    private static zzga zzl(zzgn zzgnVar) {
        zzgnVar.zza();
        return new zzga(zzgnVar.zzf(6), zzgnVar.zzf(6), zzgnVar.zzf(3) - 1);
    }

    private static void zzp(zzgn zzgnVar) {
        int iZzg = zzgnVar.zzg() + 1;
        zzgnVar.zzb(8);
        for (int i2 = 0; i2 < iZzg; i2++) {
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zza();
        }
        zzgnVar.zzb(20);
    }
}
