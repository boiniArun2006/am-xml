package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.extractor.OpusUtil;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaey {
    public static int zzb(zzaev zzaevVar, byte[] bArr, int i2, int i3) throws IOException {
        int i5 = 0;
        while (i5 < i3) {
            int iZzg = zzaevVar.zzg(bArr, i2 + i5, i3 - i5);
            if (iZzg == -1) {
                break;
            }
            i5 += iZzg;
        }
        return i5;
    }

    public static boolean zze(zzaev zzaevVar, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        try {
            return zzaevVar.zzh(bArr, 0, i3, z2);
        } catch (EOFException e2) {
            if (z2) {
                return false;
            }
            throw e2;
        }
    }

    public static int zzf(int i2) {
        if (i2 == 20) {
            return OpusUtil.MAX_BYTES_PER_SECOND;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static void zza(boolean z2, @Nullable String str) throws zzat {
        if (!z2) {
            throw zzat.zzb(str, null);
        }
    }

    public static boolean zzc(zzaev zzaevVar, byte[] bArr, int i2, int i3) throws IOException {
        try {
            zzaevVar.zzc(bArr, i2, i3);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(zzaev zzaevVar, int i2) throws IOException {
        try {
            zzaevVar.zzf(i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
