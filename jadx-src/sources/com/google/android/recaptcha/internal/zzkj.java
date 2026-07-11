package com.google.android.recaptcha.internal;

import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzkj {
    public static int zzb(int i2, RoundingMode roundingMode) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzki.zza[roundingMode.ordinal()]) {
            case 1:
                zzkl.zzb(((i2 + (-1)) & i2) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i2) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static int zza(int i2, int i3, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i3 != 0) {
            int i5 = i2 / i3;
            int i7 = i2 - (i3 * i5);
            if (i7 != 0) {
                int i8 = 1;
                int i9 = ((i2 ^ i3) >> 31) | 1;
                switch (zzki.zza[roundingMode.ordinal()]) {
                    case 1:
                        zzkl.zzb(false);
                        return i5;
                    case 2:
                        return i5;
                    case 3:
                        if (i9 >= 0) {
                            return i5;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i9 <= 0) {
                            return i5;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int iAbs = Math.abs(i7);
                        int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                        if (iAbs2 == 0) {
                            if (roundingMode != RoundingMode.HALF_UP) {
                                if (roundingMode != RoundingMode.HALF_EVEN) {
                                    i8 = 0;
                                }
                                if ((i5 & 1 & i8) == 0) {
                                    return i5;
                                }
                            }
                        } else if (iAbs2 <= 0) {
                            return i5;
                        }
                    default:
                        throw new AssertionError();
                }
                return i5 + i9;
            }
            return i5;
        }
        throw new ArithmeticException("/ by zero");
    }
}
