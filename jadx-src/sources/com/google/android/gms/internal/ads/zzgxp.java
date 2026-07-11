package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgxp {
    public static final /* synthetic */ int zza = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean zzb(double d2) {
        if (d2 > 0.0d && zzgxq.zzb(d2)) {
            long jZza = zzgxq.zza(d2);
            if ((jZza & ((-1) + jZza)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(double d2, RoundingMode roundingMode) {
        boolean zZzb;
        zzgrc.zzb(d2 > 0.0d && zzgxq.zzb(d2), "x must be positive and finite");
        int exponent = Math.getExponent(d2);
        if (Math.getExponent(d2) < -1022) {
            return zzc(d2 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (zzgxo.zza[roundingMode.ordinal()]) {
            case 1:
                zzgxv.zzb(zzb(d2));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z = !zzb(d2);
                return !z ? exponent + 1 : exponent;
            case 4:
                z = exponent < 0;
                zZzb = zzb(d2);
                z &= !zZzb;
                if (!z) {
                }
                break;
            case 5:
                z = exponent >= 0;
                zZzb = zzb(d2);
                z &= !zZzb;
                if (!z) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d2) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (!z) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long zza(double d2, RoundingMode roundingMode) {
        double dRint;
        long j2;
        long j3;
        int i2;
        boolean z2;
        if (zzgxq.zzb(d2)) {
            boolean z3 = true;
            switch (zzgxo.zza[roundingMode.ordinal()]) {
                case 1:
                    zzgxv.zzb(zzd(d2));
                    dRint = d2;
                    if ((-9.223372036854776E18d) - dRint >= 1.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dRint >= 9.223372036854776E18d) {
                        z3 = false;
                    }
                    if (!(z2 & z3)) {
                        return (long) dRint;
                    }
                    String strValueOf = String.valueOf(roundingMode);
                    StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 59 + strValueOf.length());
                    sb.append("rounded value is out of range for input ");
                    sb.append(d2);
                    sb.append(" and rounding mode ");
                    sb.append(strValueOf);
                    throw new ArithmeticException(sb.toString());
                case 2:
                    if (d2 < 0.0d && !zzd(d2)) {
                        j2 = (long) d2;
                        j3 = -1;
                        dRint = j2 + j3;
                        if ((-9.223372036854776E18d) - dRint >= 1.0d) {
                        }
                        if (dRint >= 9.223372036854776E18d) {
                        }
                        if (!(z2 & z3)) {
                        }
                    }
                    dRint = d2;
                    if ((-9.223372036854776E18d) - dRint >= 1.0d) {
                    }
                    if (dRint >= 9.223372036854776E18d) {
                    }
                    if (!(z2 & z3)) {
                    }
                    break;
                case 3:
                    if (d2 > 0.0d && !zzd(d2)) {
                        j2 = (long) d2;
                        j3 = 1;
                        dRint = j2 + j3;
                        if ((-9.223372036854776E18d) - dRint >= 1.0d) {
                        }
                        if (dRint >= 9.223372036854776E18d) {
                        }
                        if (!(z2 & z3)) {
                        }
                    }
                    dRint = d2;
                    if ((-9.223372036854776E18d) - dRint >= 1.0d) {
                    }
                    if (dRint >= 9.223372036854776E18d) {
                    }
                    if (!(z2 & z3)) {
                    }
                    break;
                case 4:
                    dRint = d2;
                    if ((-9.223372036854776E18d) - dRint >= 1.0d) {
                    }
                    if (dRint >= 9.223372036854776E18d) {
                    }
                    if (!(z2 & z3)) {
                    }
                    break;
                case 5:
                    if (!zzd(d2)) {
                        long j4 = (long) d2;
                        if (d2 > 0.0d) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        dRint = j4 + ((long) i2);
                    }
                    if ((-9.223372036854776E18d) - dRint >= 1.0d) {
                    }
                    if (dRint >= 9.223372036854776E18d) {
                    }
                    if (!(z2 & z3)) {
                    }
                    break;
                case 6:
                    dRint = Math.rint(d2);
                    if ((-9.223372036854776E18d) - dRint >= 1.0d) {
                    }
                    if (dRint >= 9.223372036854776E18d) {
                    }
                    if (!(z2 & z3)) {
                    }
                    break;
                case 7:
                    dRint = Math.rint(d2);
                    if (Math.abs(d2 - dRint) == 0.5d) {
                        dRint = Math.copySign(0.5d, d2) + d2;
                    }
                    if ((-9.223372036854776E18d) - dRint >= 1.0d) {
                    }
                    if (dRint >= 9.223372036854776E18d) {
                    }
                    if (!(z2 & z3)) {
                    }
                    break;
                case 8:
                    dRint = Math.rint(d2);
                    if (Math.abs(d2 - dRint) == 0.5d) {
                    }
                    if ((-9.223372036854776E18d) - dRint >= 1.0d) {
                    }
                    if (dRint >= 9.223372036854776E18d) {
                    }
                    if (!(z2 & z3)) {
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
            throw new ArithmeticException("input is infinite or NaN");
        }
    }

    public static boolean zzd(double d2) {
        if (!zzgxq.zzb(d2)) {
            return false;
        }
        if (d2 != 0.0d && 52 - Long.numberOfTrailingZeros(zzgxq.zza(d2)) > Math.getExponent(d2)) {
            return false;
        }
        return true;
    }
}
