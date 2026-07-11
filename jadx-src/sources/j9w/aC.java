package j9w;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class aC {
    private static int nr(byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 += bArr[i3];
        }
        return i2;
    }

    private static boolean qie(char c2) {
        return false;
    }

    private static int t(float[] fArr, int[] iArr, int i2, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i3 = 0; i3 < 6; i3++) {
            int iCeil = (int) Math.ceil(fArr[i3]);
            iArr[i3] = iCeil;
            if (i2 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i2 = iCeil;
            }
            if (i2 == iCeil) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    private static char HI(char c2, int i2) {
        int i3 = c2 + ((i2 * 149) % 253) + 1;
        if (i3 > 254) {
            i3 -= 254;
        }
        return (char) i3;
    }

    static boolean J2(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean KN(char c2) {
        if (c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    static boolean Uo(char c2) {
        return c2 >= 128 && c2 <= 255;
    }

    private static boolean az(char c2) {
        return c2 == '\r' || c2 == '*' || c2 == '>';
    }

    private static boolean mUb(char c2) {
        if (c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    public static String rl(String str, o oVar, com.google.zxing.n nVar, com.google.zxing.n nVar2) {
        int iO = 0;
        CN3[] cn3Arr = {new j(), new w6(), new qz(), new Pl(), new Wre(), new n()};
        fuX fux = new fuX(str);
        fux.ty(oVar);
        fux.qie(nVar, nVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            fux.r((char) 236);
            fux.az(2);
            fux.nr += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            fux.r((char) 237);
            fux.az(2);
            fux.nr += 7;
        }
        while (fux.xMQ()) {
            cn3Arr[iO].n(fux);
            if (fux.O() >= 0) {
                iO = fux.O();
                fux.mUb();
            }
        }
        int iN = fux.n();
        fux.ck();
        int iN2 = fux.Uo().n();
        if (iN < iN2 && iO != 0 && iO != 5 && iO != 4) {
            fux.r((char) 254);
        }
        StringBuilder sbRl = fux.rl();
        if (sbRl.length() < iN2) {
            sbRl.append((char) 129);
        }
        while (sbRl.length() < iN2) {
            sbRl.append(HI((char) 129, sbRl.length() + 1));
        }
        return fux.rl().toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d8, code lost:
    
        return r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int ty(CharSequence charSequence, int i2, int i3) {
        float[] fArr;
        float f3;
        int i5;
        if (i2 >= charSequence.length()) {
            return i3;
        }
        float f4 = 2.0f;
        float f5 = 1.0f;
        int i7 = 5;
        if (i3 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i3] = 0.0f;
        }
        int i8 = 0;
        while (true) {
            int i9 = i2 + i8;
            if (i9 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iT = t(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iNr = nr(bArr);
                if (iArr[0] == iT) {
                    return 0;
                }
                if (iNr == 1 && bArr[i7] > 0) {
                    return i7;
                }
                if (iNr == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (iNr != 1 || bArr[2] <= 0) {
                    return (iNr != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i9);
            i8++;
            if (J2(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
                f3 = f5;
                i5 = i7;
            } else if (Uo(cCharAt)) {
                f3 = f5;
                i5 = i7;
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f4;
            } else {
                f3 = f5;
                i5 = i7;
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + f3;
            }
            if (KN(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (Uo(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (mUb(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (Uo(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (gh(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (Uo(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (xMQ(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (Uo(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (qie(cCharAt)) {
                fArr[i5] = fArr[i5] + 4.0f;
            } else {
                fArr[i5] = fArr[i5] + f3;
            }
            if (i8 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                t(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int iNr2 = nr(bArr2);
                int i10 = iArr2[0];
                int i11 = iArr2[i5];
                if (i10 < i11 && i10 < iArr2[1] && i10 < iArr2[2] && i10 < iArr2[3] && i10 < iArr2[4]) {
                    return 0;
                }
                if (i11 < i10) {
                    break;
                }
                byte b2 = bArr2[1];
                byte b4 = bArr2[2];
                byte b5 = bArr2[3];
                byte b6 = bArr2[4];
                if (b2 + b4 + b5 + b6 == 0) {
                    break;
                }
                if (iNr2 == 1 && b6 > 0) {
                    return 4;
                }
                if (iNr2 == 1 && b4 > 0) {
                    return 2;
                }
                if (iNr2 == 1 && b5 > 0) {
                    return 3;
                }
                int i12 = iArr2[1];
                if (i12 + 1 < i10 && i12 + 1 < i11 && i12 + 1 < iArr2[4] && i12 + 1 < iArr2[2]) {
                    int i13 = iArr2[3];
                    if (i12 < i13) {
                        return 1;
                    }
                    if (i12 == i13) {
                        for (int i14 = i2 + i8 + 1; i14 < charSequence.length(); i14++) {
                            char cCharAt2 = charSequence.charAt(i14);
                            if (az(cCharAt2)) {
                                return 3;
                            }
                            if (!gh(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
            f5 = f3;
            i7 = i5;
            f4 = 2.0f;
        }
    }

    private static boolean xMQ(char c2) {
        return c2 >= ' ' && c2 <= '^';
    }

    static void O(char c2) {
        String hexString = Integer.toHexString(c2);
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    private static boolean gh(char c2) {
        if (!az(c2) && c2 != ' ') {
            if (c2 < '0' || c2 > '9') {
                if (c2 < 'A' || c2 > 'Z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static int n(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            while (J2(cCharAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    cCharAt = charSequence.charAt(i2);
                }
            }
        }
        return i3;
    }
}
