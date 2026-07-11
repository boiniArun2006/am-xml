package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.RendererCapabilities;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzafs {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzb(int i2) {
        int i3;
        int i5;
        if (!zzl(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i5 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i7 = i2 >>> 12;
        int i8 = (i2 >>> 10) & 3;
        int i9 = i7 & 15;
        if (i9 == 0 || i9 == 15 || i8 == 3) {
            return -1;
        }
        return zzm(i3, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzl(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzm(int i2, int i3) {
        if (i3 == 1) {
            return i2 == 3 ? 1152 : 576;
        }
        if (i3 != 2) {
            return RendererCapabilities.DECODER_SUPPORT_MASK;
        }
        return 1152;
    }

    public static int zza(int i2) {
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        if (!zzl(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i5 = (i2 >>> 17) & 3) == 0 || (i7 = (i2 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i11 = i7 - 1;
        int i12 = zzb[i8];
        if (i3 == 2) {
            i12 /= 2;
        } else if (i3 == 0) {
            i12 /= 4;
        }
        int i13 = (i2 >>> 9) & 1;
        if (i5 == 3) {
            if (i3 == 3) {
                i10 = zzc[i11];
            } else {
                i10 = zzd[i11];
            }
            return (((i10 * 12) / i12) + i13) * 4;
        }
        if (i3 == 3) {
            if (i5 == 2) {
                i9 = zze[i11];
            } else {
                i9 = zzf[i11];
            }
        } else {
            i9 = zzg[i11];
        }
        int i14 = 144;
        if (i3 == 3) {
            return ((i9 * 144) / i12) + i13;
        }
        if (i5 == 1) {
            i14 = 72;
        }
        return ((i14 * i9) / i12) + i13;
    }
}
