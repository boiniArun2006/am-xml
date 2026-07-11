package B8M;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Charset f363n = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);

    static class n extends j {
        private static final int[] J2 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] Uo = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int[] f365O;
        private int nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f366t;

        public boolean n(byte[] bArr, int i2, int i3, boolean z2) {
            int i5 = this.f366t;
            if (i5 == 6) {
                return false;
            }
            int i7 = i3 + i2;
            int i8 = this.nr;
            byte[] bArr2 = this.f364n;
            int[] iArr = this.f365O;
            int i9 = 0;
            int i10 = i8;
            int i11 = i5;
            int i12 = i2;
            while (i12 < i7) {
                if (i11 == 0) {
                    while (true) {
                        int i13 = i12 + 4;
                        if (i13 > i7 || (i10 = (iArr[bArr[i12] & UByte.MAX_VALUE] << 18) | (iArr[bArr[i12 + 1] & UByte.MAX_VALUE] << 12) | (iArr[bArr[i12 + 2] & UByte.MAX_VALUE] << 6) | iArr[bArr[i12 + 3] & UByte.MAX_VALUE]) < 0) {
                            break;
                        }
                        bArr2[i9 + 2] = (byte) i10;
                        bArr2[i9 + 1] = (byte) (i10 >> 8);
                        bArr2[i9] = (byte) (i10 >> 16);
                        i9 += 3;
                        i12 = i13;
                    }
                    if (i12 >= i7) {
                        break;
                    }
                }
                int i14 = i12 + 1;
                int i15 = iArr[bArr[i12] & UByte.MAX_VALUE];
                if (i11 != 0) {
                    if (i11 == 1) {
                        if (i15 < 0) {
                            if (i15 != -1) {
                                this.f366t = 6;
                                return false;
                            }
                        }
                        i15 |= i10 << 6;
                    } else if (i11 == 2) {
                        if (i15 < 0) {
                            if (i15 == -2) {
                                bArr2[i9] = (byte) (i10 >> 4);
                                i9++;
                                i11 = 4;
                            } else if (i15 != -1) {
                                this.f366t = 6;
                                return false;
                            }
                        }
                        i15 |= i10 << 6;
                    } else if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5 && i15 != -1) {
                                this.f366t = 6;
                                return false;
                            }
                        } else if (i15 == -2) {
                            i11++;
                        } else if (i15 != -1) {
                            this.f366t = 6;
                            return false;
                        }
                    } else if (i15 >= 0) {
                        int i16 = i15 | (i10 << 6);
                        bArr2[i9 + 2] = (byte) i16;
                        bArr2[i9 + 1] = (byte) (i16 >> 8);
                        bArr2[i9] = (byte) (i16 >> 16);
                        i9 += 3;
                        i10 = i16;
                        i11 = 0;
                    } else if (i15 == -2) {
                        bArr2[i9 + 1] = (byte) (i10 >> 2);
                        bArr2[i9] = (byte) (i10 >> 10);
                        i9 += 2;
                        i11 = 5;
                    } else if (i15 != -1) {
                        this.f366t = 6;
                        return false;
                    }
                    i11++;
                    i10 = i15;
                } else if (i15 >= 0) {
                    i11++;
                    i10 = i15;
                } else if (i15 != -1) {
                    this.f366t = 6;
                    return false;
                }
                i12 = i14;
            }
            if (!z2) {
                this.f366t = i11;
                this.nr = i10;
                this.rl = i9;
                return true;
            }
            if (i11 == 1) {
                this.f366t = 6;
                return false;
            }
            if (i11 == 2) {
                bArr2[i9] = (byte) (i10 >> 4);
                i9++;
            } else if (i11 == 3) {
                int i17 = i9 + 1;
                bArr2[i9] = (byte) (i10 >> 10);
                i9 += 2;
                bArr2[i17] = (byte) (i10 >> 2);
            } else if (i11 == 4) {
                this.f366t = 6;
                return false;
            }
            this.f366t = i11;
            this.rl = i9;
            return true;
        }

        public n(int i2, byte[] bArr) {
            int[] iArr;
            this.f364n = bArr;
            if ((i2 & 8) == 0) {
                iArr = J2;
            } else {
                iArr = Uo;
            }
            this.f365O = iArr;
            this.f366t = 0;
            this.nr = 0;
        }
    }

    static class w6 extends j {
        public final boolean J2;
        public final boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f367O;
        public final boolean Uo;
        int nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final byte[] f368t;
        private final byte[] xMQ;
        private static final byte[] mUb = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] gh = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean n(byte[] bArr, int i2, int i3, boolean z2) {
            int i5;
            int i7;
            int i8;
            int i9;
            byte b2;
            byte b4;
            byte b5;
            int i10;
            int i11;
            byte[] bArr2 = this.xMQ;
            byte[] bArr3 = this.f364n;
            int i12 = this.f367O;
            int i13 = i3 + i2;
            int i14 = this.nr;
            char c2 = 2;
            int i15 = 0;
            if (i14 != 1) {
                if (i14 == 2 && (i11 = i2 + 1) <= i13) {
                    byte[] bArr4 = this.f368t;
                    i7 = ((bArr4[1] & UByte.MAX_VALUE) << 8) | ((bArr4[0] & UByte.MAX_VALUE) << 16) | (bArr[i2] & UByte.MAX_VALUE);
                    this.nr = 0;
                    i5 = i11;
                } else {
                    i5 = i2;
                    i7 = -1;
                }
            } else if (i2 + 2 <= i13) {
                i5 = i2 + 2;
                i7 = (bArr[i2 + 1] & UByte.MAX_VALUE) | ((this.f368t[0] & UByte.MAX_VALUE) << 16) | ((bArr[i2] & UByte.MAX_VALUE) << 8);
                this.nr = 0;
            }
            if (i7 != -1) {
                bArr3[0] = bArr2[(i7 >> 18) & 63];
                bArr3[1] = bArr2[(i7 >> 12) & 63];
                bArr3[2] = bArr2[(i7 >> 6) & 63];
                bArr3[3] = bArr2[i7 & 63];
                i12--;
                if (i12 == 0) {
                    if (this.KN) {
                        bArr3[4] = 13;
                        i10 = 5;
                    } else {
                        i10 = 4;
                    }
                    i8 = i10 + 1;
                    bArr3[i10] = 10;
                    i12 = 19;
                } else {
                    i8 = 4;
                }
            } else {
                i8 = 0;
            }
            while (true) {
                int i16 = i5 + 3;
                if (i16 > i13) {
                    break;
                }
                char c4 = c2;
                int i17 = ((bArr[i5 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i5] & UByte.MAX_VALUE) << 16) | (bArr[i5 + 2] & UByte.MAX_VALUE);
                bArr3[i8] = bArr2[(i17 >> 18) & 63];
                bArr3[i8 + 1] = bArr2[(i17 >> 12) & 63];
                bArr3[i8 + 2] = bArr2[(i17 >> 6) & 63];
                bArr3[i8 + 3] = bArr2[i17 & 63];
                int i18 = i8 + 4;
                i12--;
                if (i12 == 0) {
                    if (this.KN) {
                        bArr3[i18] = 13;
                        i18 = i8 + 5;
                    }
                    i8 = i18 + 1;
                    bArr3[i18] = 10;
                    c2 = c4;
                    i12 = 19;
                    i5 = i16;
                } else {
                    i8 = i18;
                    i5 = i16;
                    c2 = c4;
                }
            }
            if (z2) {
                int i19 = this.nr;
                if (i5 - i19 == i13 - 1) {
                    if (i19 > 0) {
                        b5 = this.f368t[0];
                        i15 = 1;
                    } else {
                        b5 = bArr[i5];
                    }
                    int i20 = (b5 & UByte.MAX_VALUE) << 4;
                    this.nr = i19 - i15;
                    bArr3[i8] = bArr2[(i20 >> 6) & 63];
                    int i21 = i8 + 2;
                    bArr3[i8 + 1] = bArr2[i20 & 63];
                    if (this.J2) {
                        bArr3[i21] = Base64.padSymbol;
                        i21 = i8 + 4;
                        bArr3[i8 + 3] = Base64.padSymbol;
                    }
                    if (this.Uo) {
                        if (this.KN) {
                            bArr3[i21] = 13;
                            i21++;
                        }
                        i9 = i21 + 1;
                        bArr3[i21] = 10;
                        i8 = i9;
                    } else {
                        i8 = i21;
                    }
                } else if (i5 - i19 == i13 - 2) {
                    if (i19 > 1) {
                        b2 = this.f368t[0];
                        i15 = 1;
                    } else {
                        byte b6 = bArr[i5];
                        i5++;
                        b2 = b6;
                    }
                    int i22 = (b2 & UByte.MAX_VALUE) << 10;
                    if (i19 > 0) {
                        b4 = this.f368t[i15];
                        i15++;
                    } else {
                        b4 = bArr[i5];
                    }
                    int i23 = i22 | ((b4 & UByte.MAX_VALUE) << 2);
                    this.nr = i19 - i15;
                    bArr3[i8] = bArr2[(i23 >> 12) & 63];
                    bArr3[i8 + 1] = bArr2[(i23 >> 6) & 63];
                    int i24 = i8 + 3;
                    bArr3[i8 + 2] = bArr2[i23 & 63];
                    if (this.J2) {
                        bArr3[i24] = Base64.padSymbol;
                        i24 = i8 + 4;
                    }
                    if (this.Uo) {
                        if (this.KN) {
                            bArr3[i24] = 13;
                            i24++;
                        }
                        i9 = i24 + 1;
                        bArr3[i24] = 10;
                        i8 = i9;
                    } else {
                        i8 = i24;
                    }
                } else if (this.Uo && i8 > 0 && i12 != 19) {
                    if (this.KN) {
                        bArr3[i8] = 13;
                        i8++;
                    }
                    i9 = i8 + 1;
                    bArr3[i8] = 10;
                    i8 = i9;
                }
            } else if (i5 == i13 - 1) {
                byte[] bArr5 = this.f368t;
                int i25 = this.nr;
                this.nr = i25 + 1;
                bArr5[i25] = bArr[i5];
            } else if (i5 == i13 - 2) {
                byte[] bArr6 = this.f368t;
                int i26 = this.nr;
                int i27 = i26 + 1;
                this.nr = i27;
                bArr6[i26] = bArr[i5];
                this.nr = i26 + 2;
                bArr6[i27] = bArr[i5 + 1];
            }
            this.rl = i8;
            this.f367O = i12;
            return true;
        }

        public w6(int i2, byte[] bArr) {
            boolean z2;
            boolean z3;
            byte[] bArr2;
            int i3;
            this.f364n = bArr;
            if ((i2 & 1) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.J2 = z2;
            if ((i2 & 2) == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.Uo = z3;
            this.KN = (i2 & 4) != 0;
            if ((i2 & 8) == 0) {
                bArr2 = mUb;
            } else {
                bArr2 = gh;
            }
            this.xMQ = bArr2;
            this.f368t = new byte[2];
            this.nr = 0;
            if (z3) {
                i3 = 19;
            } else {
                i3 = -1;
            }
            this.f367O = i3;
        }
    }

    public static byte[] O(byte[] bArr, int i2) {
        return J2(bArr, 0, bArr.length, i2);
    }

    public static String nr(byte[] bArr) {
        return Uo(bArr, 2);
    }

    public static byte[] rl(byte[] bArr, int i2) {
        return t(bArr, 0, bArr.length, i2);
    }

    static abstract class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public byte[] f364n;
        public int rl;

        j() {
        }
    }

    public static byte[] J2(byte[] bArr, int i2, int i3, int i5) {
        w6 w6Var = new w6(i5, null);
        int i7 = (i3 / 3) * 4;
        if (!w6Var.J2) {
            int i8 = i3 % 3;
            if (i8 == 1) {
                i7 += 2;
            } else if (i8 == 2) {
                i7 += 3;
            }
        } else if (i3 % 3 > 0) {
            i7 += 4;
        }
        if (w6Var.Uo && i3 > 0) {
            i7 += (((i3 - 1) / 57) + 1) * (w6Var.KN ? 2 : 1);
        }
        w6Var.f364n = new byte[i7];
        w6Var.n(bArr, i2, i3, true);
        return w6Var.f364n;
    }

    public static String Uo(byte[] bArr, int i2) {
        try {
            return new String(O(bArr, i2), com.google.android.exoplayer2.C.ASCII_NAME);
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public static byte[] n(String str, int i2) {
        return rl(str.getBytes(f363n), i2);
    }

    public static byte[] t(byte[] bArr, int i2, int i3, int i5) {
        n nVar = new n(i5, new byte[(i3 * 3) / 4]);
        if (!nVar.n(bArr, i2, i3, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i7 = nVar.rl;
        byte[] bArr2 = nVar.f364n;
        if (i7 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i7];
        System.arraycopy(bArr2, 0, bArr3, 0, i7);
        return bArr3;
    }
}
