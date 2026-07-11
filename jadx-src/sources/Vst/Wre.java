package Vst;

import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre {

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f11347n;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f11347n = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11347n[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11347n[RoundingMode.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11347n[RoundingMode.CEILING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11347n[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11347n[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11347n[RoundingMode.HALF_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11347n[RoundingMode.HALF_UP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int n(int i2, int i3, RoundingMode roundingMode) {
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i5 = i2 / i3;
        int i7 = i2 - (i3 * i5);
        if (i7 == 0) {
            return i5;
        }
        int i8 = ((i2 ^ i3) >> 31) | 1;
        switch (j.f11347n[roundingMode.ordinal()]) {
            case 1:
            case 2:
                return i5;
            case 3:
                break;
            case 4:
                if (i8 <= 0) {
                    return i5;
                }
                break;
            case 5:
                if (i8 >= 0) {
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
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i5 & 1) != 0))) {
                            return i5;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i5;
                }
            default:
                throw new AssertionError();
        }
        return i5 + i8;
    }
}
