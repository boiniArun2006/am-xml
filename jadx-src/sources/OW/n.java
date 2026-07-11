package OW;

import java.math.RoundingMode;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final double f7480n = Math.log(2.0d);
    static final double[] rl = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f7481n;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f7481n = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7481n[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7481n[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7481n[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7481n[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7481n[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7481n[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7481n[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean n(double d2, double d4, double d5) {
        Wre.nr("tolerance", d5);
        if (Math.copySign(d2 - d4, 1.0d) <= d5 || d2 == d4) {
            return true;
        }
        return Double.isNaN(d2) && Double.isNaN(d4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int nr(double d2, RoundingMode roundingMode) {
        boolean zT2;
        Xo.O(d2 > 0.0d && w6.rl(d2), "x must be positive and finite");
        int exponent = Math.getExponent(d2);
        if (!w6.t(d2)) {
            return nr(d2 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (j.f7481n[roundingMode.ordinal()]) {
            case 1:
                Wre.Uo(t(d2));
                return !z ? exponent + 1 : exponent;
            case 2:
                if (!z) {
                }
                break;
            case 3:
                z = !t(d2);
                if (!z) {
                }
                break;
            case 4:
                z = exponent < 0;
                zT2 = t(d2);
                z &= !zT2;
                if (!z) {
                }
                break;
            case 5:
                z = exponent >= 0;
                zT2 = t(d2);
                z &= !zT2;
                if (!z) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double dNr = w6.nr(d2);
                if (dNr * dNr > 2.0d) {
                    z = true;
                }
                if (!z) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean t(double d2) {
        if (d2 > 0.0d && w6.rl(d2)) {
            long jN = w6.n(d2);
            if ((jN & (jN - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static long J2(double d2, RoundingMode roundingMode) {
        boolean z2;
        double dO = O(d2, roundingMode);
        boolean z3 = false;
        if ((-9.223372036854776E18d) - dO < 1.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dO < 9.223372036854776E18d) {
            z3 = true;
        }
        Wre.n(z2 & z3, d2, roundingMode);
        return (long) dO;
    }

    static double O(double d2, RoundingMode roundingMode) {
        int i2;
        if (w6.rl(d2)) {
            switch (j.f7481n[roundingMode.ordinal()]) {
                case 1:
                    Wre.Uo(rl(d2));
                    return d2;
                case 2:
                    if (d2 < 0.0d && !rl(d2)) {
                        return ((long) d2) - 1;
                    }
                    return d2;
                case 3:
                    if (d2 > 0.0d && !rl(d2)) {
                        return ((long) d2) + 1;
                    }
                    return d2;
                case 4:
                    return d2;
                case 5:
                    if (!rl(d2)) {
                        long j2 = (long) d2;
                        if (d2 > 0.0d) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        return j2 + ((long) i2);
                    }
                    return d2;
                case 6:
                    return Math.rint(d2);
                case 7:
                    double dRint = Math.rint(d2);
                    if (Math.abs(d2 - dRint) == 0.5d) {
                        return d2 + Math.copySign(0.5d, d2);
                    }
                    return dRint;
                case 8:
                    double dRint2 = Math.rint(d2);
                    if (Math.abs(d2 - dRint2) != 0.5d) {
                        return dRint2;
                    }
                    return d2;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    public static boolean rl(double d2) {
        if (w6.rl(d2)) {
            if (d2 == 0.0d || 52 - Long.numberOfTrailingZeros(w6.n(d2)) <= Math.getExponent(d2)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
