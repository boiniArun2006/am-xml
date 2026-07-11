package nI;

import com.google.zxing.WriterException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class Wre {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f71013t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f71012n = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, Base64.padSymbol, 94, 0, 32, 0, 0, 0};
    private static final byte[] rl = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] nr = new byte[128];

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Charset f71011O = StandardCharsets.ISO_8859_1;

    static {
        int i2 = 0;
        byte[] bArr = new byte[128];
        f71013t = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f71012n;
            if (i3 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i3];
            if (b2 > 0) {
                f71013t[b2] = (byte) i3;
            }
            i3++;
        }
        Arrays.fill(nr, (byte) -1);
        while (true) {
            byte[] bArr3 = rl;
            if (i2 >= bArr3.length) {
                return;
            }
            byte b4 = bArr3[i2];
            if (b4 > 0) {
                nr[b4] = (byte) i2;
            }
            i2++;
        }
    }

    private static void nr(byte[] bArr, int i2, int i3, int i5, StringBuilder sb) {
        int i7;
        if (i3 == 1 && i5 == 0) {
            sb.append((char) 913);
        } else if (i3 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i3 >= 6) {
            char[] cArr = new char[5];
            i7 = i2;
            while ((i2 + i3) - i7 >= 6) {
                long j2 = 0;
                for (int i8 = 0; i8 < 6; i8++) {
                    j2 = (j2 << 8) + ((long) (bArr[i7 + i8] & UByte.MAX_VALUE));
                }
                for (int i9 = 0; i9 < 5; i9++) {
                    cArr[i9] = (char) (j2 % 900);
                    j2 /= 900;
                }
                for (int i10 = 4; i10 >= 0; i10--) {
                    sb.append(cArr[i10]);
                }
                i7 += 6;
            }
        } else {
            i7 = i2;
        }
        while (i7 < i2 + i3) {
            sb.append((char) (bArr[i7] & UByte.MAX_VALUE));
            i7++;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71014n;

        static {
            int[] iArr = new int[w6.values().length];
            f71014n = iArr;
            try {
                iArr[w6.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71014n[w6.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71014n[w6.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static void J2(String str, int i2, int i3, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i3 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i5 = 0;
        while (i5 < i3) {
            sb2.setLength(0);
            int iMin = Math.min(44, i3 - i5);
            StringBuilder sb3 = new StringBuilder("1");
            int i7 = i2 + i5;
            sb3.append(str.substring(i7, i7 + iMin));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i5 += iMin;
        }
    }

    private static void KN(int i2, StringBuilder sb) throws WriterException {
        if (i2 >= 0 && i2 < 900) {
            sb.append((char) 927);
            sb.append((char) i2);
        } else if (i2 < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i2 / 900) - 1));
            sb.append((char) (i2 % 900));
        } else {
            if (i2 >= 811800) {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i2)));
            }
            sb.append((char) 925);
            sb.append((char) (810900 - i2));
        }
    }

    static String O(String str, w6 w6Var, Charset charset) throws WriterException {
        x4x.w6 w6VarN;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f71011O;
        } else if (!f71011O.equals(charset) && (w6VarN = x4x.w6.n(charset.name())) != null) {
            KN(w6VarN.rl(), sb);
        }
        int length = str.length();
        int i2 = j.f71014n[w6Var.ordinal()];
        if (i2 == 1) {
            Uo(str, 0, length, sb, 0);
        } else if (i2 == 2) {
            byte[] bytes = str.getBytes(charset);
            nr(bytes, 0, bytes.length, 1, sb);
        } else if (i2 != 3) {
            int i3 = 0;
            int iUo = 0;
            int i5 = 0;
            while (i3 < length) {
                int iRl = rl(str, i3);
                if (iRl >= 13) {
                    sb.append((char) 902);
                    J2(str, i3, iRl, sb);
                    i3 += iRl;
                    iUo = 0;
                    i5 = 2;
                } else {
                    int iT = t(str, i3);
                    if (iT >= 5 || iRl == length) {
                        if (i5 != 0) {
                            sb.append((char) 900);
                            iUo = 0;
                            i5 = 0;
                        }
                        iUo = Uo(str, i3, iT, sb, iUo);
                        i3 += iT;
                    } else {
                        int iN = n(str, i3, charset);
                        if (iN == 0) {
                            iN = 1;
                        }
                        int i7 = iN + i3;
                        byte[] bytes2 = str.substring(i3, i7).getBytes(charset);
                        if (bytes2.length == 1 && i5 == 0) {
                            nr(bytes2, 0, 1, 0, sb);
                        } else {
                            nr(bytes2, 0, bytes2.length, i5, sb);
                            i5 = 1;
                            iUo = 0;
                        }
                        i3 = i7;
                    }
                }
            }
        } else {
            sb.append((char) 902);
            J2(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4 A[EDGE_INSN: B:73:0x00f4->B:55:0x00f4 BREAK  A[LOOP:0: B:3:0x000f->B:90:0x000f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int Uo(CharSequence charSequence, int i2, int i3, StringBuilder sb, int i5) {
        StringBuilder sb2 = new StringBuilder(i3);
        int i7 = i5;
        int i8 = 0;
        while (true) {
            int i9 = i2 + i8;
            char cCharAt = charSequence.charAt(i9);
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (az(cCharAt)) {
                            sb2.append((char) nr[cCharAt]);
                        } else {
                            sb2.append((char) 29);
                            i7 = 0;
                        }
                    } else if (qie(cCharAt)) {
                        sb2.append((char) f71013t[cCharAt]);
                    } else if (mUb(cCharAt)) {
                        sb2.append((char) 28);
                        i7 = 0;
                    } else if (xMQ(cCharAt)) {
                        sb2.append((char) 27);
                        i7 = 1;
                    } else {
                        int i10 = i9 + 1;
                        if (i10 >= i3 || !az(charSequence.charAt(i10))) {
                            sb2.append((char) 29);
                            sb2.append((char) nr[cCharAt]);
                        } else {
                            sb2.append((char) 25);
                            i7 = 3;
                        }
                    }
                } else if (xMQ(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt - 'a'));
                    }
                } else if (mUb(cCharAt)) {
                    sb2.append((char) 27);
                    sb2.append((char) (cCharAt - 'A'));
                } else if (qie(cCharAt)) {
                    sb2.append((char) 28);
                    i7 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) nr[cCharAt]);
                }
                i8++;
                if (i8 < i3) {
                    break;
                }
            } else {
                if (mUb(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt - 'A'));
                    }
                } else if (xMQ(cCharAt)) {
                    sb2.append((char) 27);
                    i7 = 1;
                } else if (qie(cCharAt)) {
                    sb2.append((char) 28);
                    i7 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) nr[cCharAt]);
                }
                i8++;
                if (i8 < i3) {
                }
            }
        }
        int length = sb2.length();
        char cCharAt2 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 % 2 != 0) {
                cCharAt2 = (char) ((cCharAt2 * 30) + sb2.charAt(i11));
                sb.append(cCharAt2);
            } else {
                cCharAt2 = sb2.charAt(i11);
            }
        }
        if (length % 2 != 0) {
            sb.append((char) ((cCharAt2 * 30) + 29));
        }
        return i7;
    }

    private static boolean az(char c2) {
        return nr[c2] != -1;
    }

    private static boolean gh(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean mUb(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    private static boolean qie(char c2) {
        return f71013t[c2] != -1;
    }

    private static boolean ty(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\r') {
            return true;
        }
        return c2 >= ' ' && c2 <= '~';
    }

    private static boolean xMQ(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    private static int n(String str, int i2, Charset charset) throws WriterException {
        int i3;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        int length = str.length();
        int i5 = i2;
        while (i5 < length) {
            char cCharAt = str.charAt(i5);
            int i7 = 0;
            while (i7 < 13 && gh(cCharAt) && (i3 = i5 + (i7 = i7 + 1)) < length) {
                cCharAt = str.charAt(i3);
            }
            if (i7 >= 13) {
                return i5 - i2;
            }
            char cCharAt2 = str.charAt(i5);
            if (charsetEncoderNewEncoder.canEncode(cCharAt2)) {
                i5++;
            } else {
                throw new WriterException("Non-encodable character detected: " + cCharAt2 + " (Unicode: " + ((int) cCharAt2) + ')');
            }
        }
        return i5 - i2;
    }

    private static int rl(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            while (gh(cCharAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    cCharAt = charSequence.charAt(i2);
                }
            }
        }
        return i3;
    }

    private static int t(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = i2;
        while (i3 < length) {
            char cCharAt = charSequence.charAt(i3);
            int i5 = 0;
            while (i5 < 13 && gh(cCharAt) && i3 < length) {
                i5++;
                i3++;
                if (i3 < length) {
                    cCharAt = charSequence.charAt(i3);
                }
            }
            if (i5 >= 13) {
                return (i3 - i2) - i5;
            }
            if (i5 <= 0) {
                if (!ty(charSequence.charAt(i3))) {
                    break;
                }
                i3++;
            }
        }
        return i3 - i2;
    }
}
