package com.caoccao.javet.utils;

import com.caoccao.javet.values.primitive.V8ValueDouble;
import kotlin.UShort;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Float16 {
    public static final short EPSILON = 5120;
    public static final int EXPONENT_BIAS = 15;
    public static final int EXPONENT_SHIFT = 10;
    public static final int EXPONENT_SIGNIFICAND_MASK = 32767;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SHIFTED_EXPONENT_MASK = 255;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;
    public static final short LOWEST_VALUE = -1025;
    public static final int MAX_EXPONENT = 15;
    public static final short MAX_VALUE = 31743;
    public static final int MIN_EXPONENT = -14;
    public static final short MIN_NORMAL = 1024;
    public static final short MIN_VALUE = 1;
    public static final short NEGATIVE_INFINITY = -1024;
    public static final short NEGATIVE_ZERO = Short.MIN_VALUE;
    public static final short NaN = 32256;
    public static final short POSITIVE_INFINITY = 31744;
    public static final short POSITIVE_ZERO = 0;
    public static final int SHIFTED_EXPONENT_MASK = 31;
    public static final int SIGNIFICAND_MASK = 1023;
    public static final int SIGN_MASK = 32768;
    public static final int SIGN_SHIFT = 15;
    public static final int SIZE = 16;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final float FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);

    public static boolean isInfinite(short s2) {
        return (s2 & ShortCompanionObject.MAX_VALUE) == 31744;
    }

    public static boolean isNaN(short s2) {
        return (s2 & ShortCompanionObject.MAX_VALUE) > 31744;
    }

    public static boolean isNormalized(short s2) {
        int i2 = s2 & POSITIVE_INFINITY;
        return (i2 == 0 || i2 == 31744) ? false : true;
    }

    public static short trunc(short s2) {
        int i2 = 65535 & s2;
        int i3 = s2 & ShortCompanionObject.MAX_VALUE;
        if (i3 < 15360) {
            i2 = Short.MIN_VALUE & s2;
        } else if (i3 < 25600) {
            i2 &= ~((1 << (25 - (i3 >> 10))) - 1);
        }
        return (short) i2;
    }

    public static String toHexString(short s2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 65535 & s2;
        int i3 = i2 >>> 15;
        int i5 = (i2 >>> 10) & 31;
        int i7 = s2 & 1023;
        if (i5 != 31) {
            if (i3 == 1) {
                sb.append('-');
            }
            if (i5 != 0) {
                sb.append("0x1.");
                sb.append(Integer.toHexString(i7).replaceFirst("0{2,}$", ""));
                sb.append('p');
                sb.append(Integer.toString(i5 - 15));
            } else if (i7 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                sb.append(Integer.toHexString(i7).replaceFirst("0{2,}$", ""));
                sb.append("p-14");
            }
        } else if (i7 == 0) {
            if (i3 != 0) {
                sb.append('-');
            }
            sb.append(V8ValueDouble.INFINITY);
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    private Float16() {
    }

    public static short ceil(short s2) {
        int i2 = 65535 & s2;
        int i3 = s2 & ShortCompanionObject.MAX_VALUE;
        int i5 = 1;
        if (i3 < 15360) {
            int i7 = s2 & Short.MIN_VALUE;
            int i8 = ~(i2 >> 15);
            if (i3 == 0) {
                i5 = 0;
            }
            i2 = ((-(i8 & i5)) & 15360) | i7;
        } else if (i3 < 25600) {
            int i9 = (1 << (25 - (i3 >> 10))) - 1;
            i2 = (i2 + (((i2 >> 15) - 1) & i9)) & (~i9);
        }
        if (isNaN((short) i2)) {
            i2 |= 32256;
        }
        return (short) i2;
    }

    public static int compare(short s2, short s3) {
        if (less(s2, s3)) {
            return -1;
        }
        if (greater(s2, s3)) {
            return 1;
        }
        if (isNaN(s2)) {
            s2 = 32256;
        }
        if (isNaN(s3)) {
            s3 = 32256;
        }
        if (s2 == s3) {
            return 0;
        }
        if (s2 < s3) {
            return -1;
        }
        return 1;
    }

    public static boolean equals(short s2, short s3) {
        if (isNaN(s2) || isNaN(s3)) {
            return false;
        }
        if (s2 != s3 && ((s2 | s3) & EXPONENT_SIGNIFICAND_MASK) != 0) {
            return false;
        }
        return true;
    }

    public static short floor(short s2) {
        int i2 = 65535;
        int i3 = s2 & UShort.MAX_VALUE;
        int i5 = s2 & ShortCompanionObject.MAX_VALUE;
        if (i5 < 15360) {
            int i7 = s2 & Short.MIN_VALUE;
            if (i3 <= 32768) {
                i2 = 0;
            }
            i3 = i7 | (i2 & 15360);
        } else if (i5 < 25600) {
            int i8 = (1 << (25 - (i5 >> 10))) - 1;
            i3 = (i3 + ((-(i3 >> 15)) & i8)) & (~i8);
        }
        if (isNaN((short) i3)) {
            i3 |= 32256;
        }
        return (short) i3;
    }

    public static boolean greater(short s2, short s3) {
        int i2;
        if (isNaN(s2) || isNaN(s3)) {
            return false;
        }
        int i3 = s2 & Short.MIN_VALUE;
        int i5 = s2 & UShort.MAX_VALUE;
        if (i3 != 0) {
            i5 = 32768 - i5;
        }
        if ((s3 & Short.MIN_VALUE) != 0) {
            i2 = 32768 - (s3 & UShort.MAX_VALUE);
        } else {
            i2 = s3 & UShort.MAX_VALUE;
        }
        if (i5 <= i2) {
            return false;
        }
        return true;
    }

    public static boolean greaterEquals(short s2, short s3) {
        int i2;
        if (isNaN(s2) || isNaN(s3)) {
            return false;
        }
        int i3 = s2 & Short.MIN_VALUE;
        int i5 = s2 & UShort.MAX_VALUE;
        if (i3 != 0) {
            i5 = 32768 - i5;
        }
        if ((s3 & Short.MIN_VALUE) != 0) {
            i2 = 32768 - (s3 & UShort.MAX_VALUE);
        } else {
            i2 = s3 & UShort.MAX_VALUE;
        }
        if (i5 < i2) {
            return false;
        }
        return true;
    }

    public static boolean less(short s2, short s3) {
        int i2;
        if (isNaN(s2) || isNaN(s3)) {
            return false;
        }
        int i3 = s2 & Short.MIN_VALUE;
        int i5 = s2 & UShort.MAX_VALUE;
        if (i3 != 0) {
            i5 = 32768 - i5;
        }
        if ((s3 & Short.MIN_VALUE) != 0) {
            i2 = 32768 - (s3 & UShort.MAX_VALUE);
        } else {
            i2 = s3 & UShort.MAX_VALUE;
        }
        if (i5 >= i2) {
            return false;
        }
        return true;
    }

    public static boolean lessEquals(short s2, short s3) {
        int i2;
        if (isNaN(s2) || isNaN(s3)) {
            return false;
        }
        int i3 = s2 & Short.MIN_VALUE;
        int i5 = s2 & UShort.MAX_VALUE;
        if (i3 != 0) {
            i5 = 32768 - i5;
        }
        if ((s3 & Short.MIN_VALUE) != 0) {
            i2 = 32768 - (s3 & UShort.MAX_VALUE);
        } else {
            i2 = s3 & UShort.MAX_VALUE;
        }
        if (i5 > i2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static short max(short s2, short s3) {
        int i2;
        int i3;
        if (isNaN(s2) || isNaN(s3)) {
            return NaN;
        }
        if ((s2 & ShortCompanionObject.MAX_VALUE) == 0 && (s3 & ShortCompanionObject.MAX_VALUE) == 0) {
            if ((s2 & Short.MIN_VALUE) != 0) {
            }
        } else {
            if ((s2 & Short.MIN_VALUE) != 0) {
                i2 = 32768 - (s2 & UShort.MAX_VALUE);
            } else {
                i2 = s2 & UShort.MAX_VALUE;
            }
            if ((s3 & Short.MIN_VALUE) != 0) {
                i3 = 32768 - (65535 & s3);
            } else {
                i3 = s3 & UShort.MAX_VALUE;
            }
            if (i2 > i3) {
                return s2;
            }
            return s3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static short min(short s2, short s3) {
        int i2;
        int i3;
        if (isNaN(s2) || isNaN(s3)) {
            return NaN;
        }
        if ((s2 & ShortCompanionObject.MAX_VALUE) == 0 && (s3 & ShortCompanionObject.MAX_VALUE) == 0) {
            if ((s2 & Short.MIN_VALUE) != 0) {
            }
        } else {
            if ((s2 & Short.MIN_VALUE) != 0) {
                i2 = 32768 - (s2 & UShort.MAX_VALUE);
            } else {
                i2 = s2 & UShort.MAX_VALUE;
            }
            if ((s3 & Short.MIN_VALUE) != 0) {
                i3 = 32768 - (65535 & s3);
            } else {
                i3 = s3 & UShort.MAX_VALUE;
            }
            if (i2 < i3) {
                return s2;
            }
            return s3;
        }
    }

    public static short rint(short s2) {
        int i2 = 65535 & s2;
        int i3 = s2 & ShortCompanionObject.MAX_VALUE;
        if (i3 < 15360) {
            i2 = Short.MIN_VALUE & s2;
            if (i3 > 14336) {
                i2 |= 15360;
            }
        } else if (i3 < 25600) {
            int i5 = i3 >> 10;
            int i7 = 25 - i5;
            i2 = (i2 + ((1 << (24 - i5)) - ((~(i3 >> i7)) & 1))) & (~((1 << i7) - 1));
        }
        if (isNaN((short) i2)) {
            i2 |= 32256;
        }
        return (short) i2;
    }

    public static float toFloat(short s2) {
        int i2;
        int i3;
        int i5;
        int i7 = Short.MIN_VALUE & s2;
        int i8 = ((65535 & s2) >>> 10) & 31;
        int i9 = s2 & 1023;
        if (i8 == 0) {
            if (i9 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i9 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
                if (i7 == 0) {
                    return fIntBitsToFloat;
                }
                return -fIntBitsToFloat;
            }
            i5 = 0;
            i3 = 0;
        } else {
            int i10 = i9 << 13;
            if (i8 == 31) {
                i2 = 255;
                if (i10 != 0) {
                    i10 |= FP32_QNAN_MASK;
                }
            } else {
                i2 = i8 + 112;
            }
            int i11 = i2;
            i3 = i10;
            i5 = i11;
        }
        return Float.intBitsToFloat((i5 << 23) | (i7 << 16) | i3);
    }

    public static short toHalf(float f3) {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        int i2 = iFloatToRawIntBits >>> 31;
        int i3 = (iFloatToRawIntBits >>> 23) & 255;
        int i5 = FP32_SIGNIFICAND_MASK & iFloatToRawIntBits;
        int i7 = 31;
        int i8 = 0;
        if (i3 == 255) {
            if (i5 != 0) {
                i8 = 512;
            }
        } else {
            int i9 = i3 - 112;
            if (i9 < 31) {
                if (i9 <= 0) {
                    if (i9 < -10) {
                        i7 = 0;
                    } else {
                        int i10 = 8388608 | i5;
                        int i11 = 14 - i9;
                        int i12 = i10 >> i11;
                        if ((i10 & ((1 << i11) - 1)) + (i12 & 1) > (1 << (13 - i9))) {
                            i12++;
                        }
                        i7 = 0;
                        i8 = i12;
                    }
                } else {
                    i8 = i5 >> 13;
                    if ((iFloatToRawIntBits & 8191) + (i8 & 1) > 4096) {
                        i8++;
                    }
                    i7 = i9;
                }
            }
        }
        return (short) ((i2 << 15) | ((i7 << 10) + i8));
    }
}
