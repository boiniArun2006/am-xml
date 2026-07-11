package NDY;

import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre extends Pl {
    private static void J2(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i5 = 1;
            if (((1 << (8 - i3)) & i2) != 0) {
                i5 = 2;
            }
            iArr[i3] = i5;
        }
    }

    @Override // NDY.Pl, com.google.zxing.I28
    public x4x.n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (jVar == com.google.zxing.j.CODE_39) {
            return super.n(str, jVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(jVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String Uo(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0) {
                if (cCharAt != ' ') {
                    if (cCharAt != '@') {
                        if (cCharAt != '`') {
                            if (cCharAt != '-' && cCharAt != '.') {
                                if (cCharAt <= 26) {
                                    sb.append(Typography.dollar);
                                    sb.append((char) (cCharAt + '@'));
                                } else if (cCharAt < ' ') {
                                    sb.append('%');
                                    sb.append((char) (cCharAt + Typography.amp));
                                } else if (cCharAt > ',' && cCharAt != '/' && cCharAt != ':') {
                                    if (cCharAt <= '9') {
                                        sb.append(cCharAt);
                                    } else if (cCharAt <= '?') {
                                        sb.append('%');
                                        sb.append((char) (cCharAt + 11));
                                    } else if (cCharAt <= 'Z') {
                                        sb.append(cCharAt);
                                    } else if (cCharAt <= '_') {
                                        sb.append('%');
                                        sb.append((char) (cCharAt - 16));
                                    } else if (cCharAt <= 'z') {
                                        sb.append('+');
                                        sb.append((char) (cCharAt - ' '));
                                    } else if (cCharAt <= 127) {
                                        sb.append('%');
                                        sb.append((char) (cCharAt - '+'));
                                    } else {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i2) + "'");
                                    }
                                } else {
                                    sb.append('/');
                                    sb.append((char) (cCharAt + ' '));
                                }
                            }
                        } else {
                            sb.append("%W");
                        }
                    } else {
                        sb.append("%V");
                    }
                } else {
                    sb.append(cCharAt);
                }
            } else {
                sb.append("%U");
            }
        }
        return sb.toString();
    }

    @Override // NDY.Pl
    public boolean[] t(String str) {
        int length = str.length();
        if (length <= 80) {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2)) < 0) {
                    str = Uo(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i2++;
                }
            }
            int[] iArr = new int[9];
            int i3 = length + 25;
            for (int i5 = 0; i5 < length; i5++) {
                J2(I28.f6982n["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i5))], iArr);
                for (int i7 = 0; i7 < 9; i7++) {
                    i3 += iArr[i7];
                }
            }
            boolean[] zArr = new boolean[i3];
            J2(148, iArr);
            int iRl = Pl.rl(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int iRl2 = iRl + Pl.rl(zArr, iRl, iArr2, false);
            for (int i8 = 0; i8 < length; i8++) {
                J2(I28.f6982n["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i8))], iArr);
                int iRl3 = iRl2 + Pl.rl(zArr, iRl2, iArr, true);
                iRl2 = iRl3 + Pl.rl(zArr, iRl3, iArr2, false);
            }
            J2(148, iArr);
            Pl.rl(zArr, iRl2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
