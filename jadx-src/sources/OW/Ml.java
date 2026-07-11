package OW;

import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final byte[] f7475n = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    static final int[] rl = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int[] f7476t = {3, 31, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] nr = {1, 1, 2, 6, 24, b.f61769v, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static int[] f7474O = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int J2(int i2, int i3) {
        return com.google.common.primitives.Wre.qie(((long) i2) * ((long) i3));
    }

    public static int n(int i2, int i3) {
        long j2 = ((long) i2) + ((long) i3);
        int i5 = (int) j2;
        Wre.rl(j2 == ((long) i5), "checkedAdd", i2, i3);
        return i5;
    }

    static int nr(int i2, int i3) {
        return (~(~(i2 - i3))) >>> 31;
    }

    public static boolean t(int i2) {
        return (i2 > 0) & ((i2 & (i2 + (-1))) == 0);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f7477n;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f7477n = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7477n[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7477n[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7477n[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7477n[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7477n[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7477n[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7477n[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int O(int i2, RoundingMode roundingMode) {
        Wre.J2("x", i2);
        switch (j.f7477n[roundingMode.ordinal()]) {
            case 1:
                Wre.Uo(t(i2));
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
                return (31 - iNumberOfLeadingZeros) + nr((-1257966797) >>> iNumberOfLeadingZeros, i2);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int rl(int i2, int i3, RoundingMode roundingMode) {
        boolean z2;
        Xo.HI(roundingMode);
        if (i3 != 0) {
            int i5 = i2 / i3;
            int i7 = i2 - (i3 * i5);
            if (i7 == 0) {
                return i5;
            }
            boolean z3 = true;
            int i8 = ((i2 ^ i3) >> 31) | 1;
            switch (j.f7477n[roundingMode.ordinal()]) {
                case 1:
                    if (i7 != 0) {
                        z3 = false;
                    }
                    Wre.Uo(z3);
                    return i5;
                case 2:
                    return i5;
                case 3:
                    if (i8 >= 0) {
                        return i5;
                    }
                    return i5 + i8;
                case 4:
                    return i5 + i8;
                case 5:
                    if (i8 <= 0) {
                        return i5;
                    }
                    return i5 + i8;
                case 6:
                case 7:
                case 8:
                    int iAbs = Math.abs(i7);
                    int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                    if (iAbs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((i5 & 1) == 0) {
                                z3 = false;
                            }
                            if (!(z2 & z3)) {
                                return i5;
                            }
                        }
                    } else if (iAbs2 <= 0) {
                        return i5;
                    }
                    return i5 + i8;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("/ by zero");
    }
}
