package com.google.android.gms.internal.ads;

import java.util.Objects;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgtn {
    static Object zza(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 41);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    static int zzd(int i2) {
        return (i2 < 32 ? 4 : 2) * (i2 + 1);
    }

    static int zzb(Object obj, int i2) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & UByte.MAX_VALUE : obj instanceof short[] ? (char) ((short[]) obj)[i2] : ((int[]) obj)[i2];
    }

    static void zzc(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    static int zze(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i5;
        int iZzb = zzgty.zzb(obj);
        int i7 = iZzb & i2;
        int iZzb2 = zzb(obj3, i7);
        if (iZzb2 != 0) {
            int i8 = ~i2;
            int i9 = iZzb & i8;
            int i10 = -1;
            while (true) {
                i3 = iZzb2 - 1;
                int i11 = iArr[i3];
                i5 = i11 & i2;
                if ((i11 & i8) != i9 || !Objects.equals(obj, objArr[i3]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i3]))) {
                    if (i5 == 0) {
                        break;
                    }
                    i10 = i3;
                    iZzb2 = i5;
                } else {
                    break;
                }
            }
            if (i10 == -1) {
                zzc(obj3, i7, i5);
                return i3;
            }
            iArr[i10] = (iArr[i10] & i8) | (i5 & i2);
            return i3;
        }
        return -1;
    }
}
