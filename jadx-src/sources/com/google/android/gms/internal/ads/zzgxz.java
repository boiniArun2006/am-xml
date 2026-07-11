package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgxz extends zzgya {
    public static int zza(long j2) {
        int i2 = (int) j2;
        zzgrc.zze(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static int zzb(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static int zzc(int i2, int i3, int i5) {
        zzgrc.zzg(true, "min (%s) must be less than or equal to max (%s)", i3, 1073741823);
        return Math.min(Math.max(i2, i3), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzgrc.zzg(length >= 4, "array too small: %s < %s", length, 4);
        return zze(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int zze(byte b2, byte b4, byte b5, byte b6) {
        return (b2 << 24) | ((b4 & UByte.MAX_VALUE) << 16) | ((b5 & UByte.MAX_VALUE) << 8) | (b6 & UByte.MAX_VALUE);
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new zzgxy(iArr, 0, length);
    }

    public static int[] zzf(Collection collection) {
        if (collection instanceof zzgxy) {
            zzgxy zzgxyVar = (zzgxy) collection;
            return Arrays.copyOfRange(zzgxyVar.zza, zzgxyVar.zzb, zzgxyVar.zzc);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    static /* synthetic */ int zzi(int[] iArr, int i2, int i3, int i5) {
        while (i3 < i5) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer zzh(String str, int i2) {
        Long lValueOf;
        str.getClass();
        if (str.isEmpty()) {
            lValueOf = null;
        } else {
            int i3 = 0;
            char cCharAt = str.charAt(0);
            if (cCharAt == '-') {
                i3 = 1;
            }
            if (i3 != str.length()) {
                int i5 = i3 + 1;
                int iZza = zzgyb.zza(str.charAt(i3));
                if (iZza >= 0 && iZza < 10) {
                    long j2 = -iZza;
                    while (true) {
                        if (i5 < str.length()) {
                            int i7 = i5 + 1;
                            int iZza2 = zzgyb.zza(str.charAt(i5));
                            if (iZza2 < 0 || iZza2 >= 10 || j2 < -922337203685477580L) {
                                break;
                            }
                            long j3 = j2 * 10;
                            long j4 = iZza2;
                            if (j3 < Long.MIN_VALUE + j4) {
                                break;
                            }
                            j2 = j3 - j4;
                            i5 = i7;
                        } else if (cCharAt == '-') {
                            lValueOf = Long.valueOf(j2);
                        } else {
                            if (j2 == Long.MIN_VALUE) {
                                break;
                            }
                            lValueOf = Long.valueOf(-j2);
                        }
                    }
                    lValueOf = null;
                }
            }
        }
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }
}
