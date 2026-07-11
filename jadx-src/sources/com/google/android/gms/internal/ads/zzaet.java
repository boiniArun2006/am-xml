package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.RendererCapabilities;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaet {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(byte[] bArr) {
        int i2;
        int i3;
        byte b2;
        int i5;
        int i7;
        int i8;
        byte b4;
        boolean z2 = false;
        byte b5 = bArr[0];
        if (b5 != -2) {
            if (b5 == -1) {
                i7 = (bArr[7] & 3) << 12;
                i8 = (bArr[6] & UByte.MAX_VALUE) << 4;
                b4 = bArr[9];
            } else if (b5 != 31) {
                i2 = (bArr[5] & 3) << 12;
                i3 = (bArr[6] & UByte.MAX_VALUE) << 4;
                b2 = bArr[7];
            } else {
                i7 = (bArr[6] & 3) << 12;
                i8 = (bArr[7] & UByte.MAX_VALUE) << 4;
                b4 = bArr[8];
            }
            i5 = (((b4 & 60) >> 2) | i7 | i8) + 1;
            z2 = true;
            return !z2 ? (i5 * 16) / 14 : i5;
        }
        i2 = (bArr[4] & 3) << 12;
        i3 = (bArr[7] & UByte.MAX_VALUE) << 4;
        b2 = bArr[6];
        i5 = (((b2 & 240) >> 4) | i2 | i3) + 1;
        if (!z2) {
        }
    }

    private static int zzh(zzeq zzeqVar, int[] iArr, boolean z2) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && zzeqVar.zzi(); i3++) {
            i2++;
        }
        int i5 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            i5 += 1 << iArr[i7];
        }
        return i5 + zzeqVar.zzj(iArr[i2]);
    }

    private static zzeq zzi(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new zzeq(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b4 = bArrCopyOf[0];
        if (b4 == -2 || b4 == -1 || b4 == 37 || b4 == -14 || b4 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b5 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b5;
            }
        }
        int length = bArrCopyOf.length;
        zzeq zzeqVar = new zzeq(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzeq zzeqVar2 = new zzeq(bArrCopyOf, length);
            while (zzeqVar2.zzc() >= 16) {
                zzeqVar2.zzh(2);
                zzeqVar.zzp(zzeqVar2.zzj(14), 14);
            }
        }
        zzeqVar.zzb(bArrCopyOf, bArrCopyOf.length);
        return zzeqVar;
    }

    public static zzaes zzf(byte[] bArr, AtomicInteger atomicInteger) throws zzat {
        long jZzt;
        int iZzj;
        AtomicInteger atomicInteger2;
        int i2;
        int i3;
        zzeq zzeqVarZzi = zzi(bArr);
        int iZzj2 = zzeqVarZzi.zzj(32);
        int iZzh = zzh(zzeqVarZzi, zzf, true);
        int i5 = iZzh + 1;
        char c2 = iZzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c2 == 0) {
            jZzt = -9223372036854775807L;
            iZzj = -2147483647;
        } else {
            if (!zzeqVarZzi.zzi()) {
                throw zzat.zzc("Only supports full channel mask-based audio presentation");
            }
            int i7 = iZzh - 1;
            if (((bArr[iZzh] & UByte.MAX_VALUE) | ((char) (bArr[i7] << 8))) != zzfj.zzH(bArr, 0, i7, 65535)) {
                throw zzat.zzb("CRC check failed", null);
            }
            int iZzj3 = zzeqVarZzi.zzj(2);
            if (iZzj3 == 0) {
                i2 = 512;
            } else if (iZzj3 == 1) {
                i2 = 480;
            } else {
                if (iZzj3 != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzj3).length() + 51);
                    sb.append("Unsupported base duration index in DTS UHD header: ");
                    sb.append(iZzj3);
                    throw zzat.zzb(sb.toString(), null);
                }
                i2 = RendererCapabilities.DECODER_SUPPORT_MASK;
            }
            int iZzj4 = zzeqVarZzi.zzj(3) + 1;
            int iZzj5 = zzeqVarZzi.zzj(2);
            if (iZzj5 == 0) {
                i3 = 32000;
            } else if (iZzj5 == 1) {
                i3 = 44100;
            } else {
                if (iZzj5 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj5).length() + 48);
                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                    sb2.append(iZzj5);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i3 = 48000;
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(36);
            }
            iZzj = (1 << zzeqVarZzi.zzj(2)) * i3;
            jZzt = zzfj.zzt(i2 * iZzj4, 1000000L, i3, RoundingMode.DOWN);
        }
        int i8 = iZzj;
        long j2 = jZzt;
        int iZzh2 = 0;
        for (char c4 = 0; c4 < c2; c4 = 1) {
            iZzh2 += zzh(zzeqVarZzi, zzg, true);
        }
        for (int i9 = 0; i9 <= 0; i9++) {
            if (c2 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(zzh(zzeqVarZzi, zzh, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iZzh2 += atomicInteger2.get() != 0 ? zzh(zzeqVarZzi, zzi, true) : 0;
        }
        return new zzaes("audio/vnd.dts.uhd;profile=p2", 2, i8, i5 + iZzh2, j2, 0, null);
    }

    public static zzv zzb(byte[] bArr, @Nullable String str, @Nullable String str2, int i2, String str3, @Nullable zzq zzqVar) {
        int i3;
        int i5;
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(60);
        int i7 = zzb[zzeqVarZzi.zzj(6)];
        int i8 = zzc[zzeqVarZzi.zzj(4)];
        int iZzj = zzeqVarZzi.zzj(5);
        if (iZzj >= 29) {
            i3 = -1;
        } else {
            i3 = (zzd[iZzj] * 1000) / 2;
        }
        zzeqVarZzi.zzh(10);
        if (zzeqVarZzi.zzj(2) > 0) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i9 = i7 + i5;
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzl("video/mp2t");
        zztVar.zzm("audio/vnd.dts");
        zztVar.zzh(i3);
        zztVar.zzE(i9);
        zztVar.zzF(i8);
        zztVar.zzq(null);
        zztVar.zze(str2);
        zztVar.zzg(i2);
        return zztVar.zzM();
    }

    public static zzaes zzd(byte[] bArr) throws zzat {
        int i2;
        int i3;
        int iZzj;
        int i5;
        long jZzt;
        int i7;
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(40);
        int iZzj2 = zzeqVarZzi.zzj(2);
        boolean zZzi = zzeqVarZzi.zzi();
        if (true != zZzi) {
            i2 = 16;
        } else {
            i2 = 20;
        }
        if (true != zZzi) {
            i3 = 8;
        } else {
            i3 = 12;
        }
        zzeqVarZzi.zzh(i3);
        int iZzj3 = zzeqVarZzi.zzj(i2) + 1;
        boolean zZzi2 = zzeqVarZzi.zzi();
        int iZzj4 = -1;
        int i8 = 0;
        if (zZzi2) {
            iZzj = zzeqVarZzi.zzj(2);
            int iZzj5 = zzeqVarZzi.zzj(3) + 1;
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(36);
            }
            int iZzj6 = zzeqVarZzi.zzj(3) + 1;
            int iZzj7 = zzeqVarZzi.zzj(3) + 1;
            if (iZzj6 == 1 && iZzj7 == 1) {
                int i9 = iZzj2 + 1;
                int iZzj8 = zzeqVarZzi.zzj(i9);
                for (int i10 = 0; i10 < i9; i10++) {
                    if (((iZzj8 >> i10) & 1) == 1) {
                        zzeqVarZzi.zzh(8);
                    }
                }
                int i11 = iZzj5 * 512;
                if (zzeqVarZzi.zzi()) {
                    zzeqVarZzi.zzh(2);
                    int iZzj9 = (zzeqVarZzi.zzj(2) + 1) << 2;
                    int iZzj10 = zzeqVarZzi.zzj(2) + 1;
                    while (i8 < iZzj10) {
                        zzeqVarZzi.zzh(iZzj9);
                        i8++;
                    }
                }
                i8 = i11;
            } else {
                throw zzat.zzc("Multiple audio presentations or assets not supported");
            }
        } else {
            iZzj = -1;
        }
        zzeqVarZzi.zzh(i2);
        zzeqVarZzi.zzh(12);
        if (zZzi2) {
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(4);
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(24);
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzo(zzeqVarZzi.zzj(10) + 1);
            }
            zzeqVarZzi.zzh(5);
            i5 = zze[zzeqVarZzi.zzj(4)];
            iZzj4 = zzeqVarZzi.zzj(8) + 1;
        } else {
            i5 = -2147483647;
        }
        int i12 = i5;
        if (zZzi2) {
            if (iZzj != 0) {
                if (iZzj != 1) {
                    if (iZzj == 2) {
                        i7 = 48000;
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzj).length() + 51);
                        sb.append("Unsupported reference clock code in DTS HD header: ");
                        sb.append(iZzj);
                        throw zzat.zzb(sb.toString(), null);
                    }
                } else {
                    i7 = 44100;
                }
            } else {
                i7 = 32000;
            }
            jZzt = zzfj.zzt(i8, 1000000L, i7, RoundingMode.DOWN);
        } else {
            jZzt = -9223372036854775807L;
        }
        return new zzaes("audio/vnd.dts.hd;profile=lbr", iZzj4, i12, iZzj3, jZzt, 0, null);
    }

    public static int zze(byte[] bArr) {
        int i2;
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(42);
        if (true != zzeqVarZzi.zzi()) {
            i2 = 8;
        } else {
            i2 = 12;
        }
        return zzeqVarZzi.zzj(i2) + 1;
    }

    public static int zzg(byte[] bArr) {
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(32);
        return zzh(zzeqVarZzi, zzj, true) + 1;
    }
}
