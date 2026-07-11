package NDY;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class fuX extends Pl {
    private static int J2(boolean[] zArr, int i2, int[] iArr) {
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i5 = i2 + 1;
            zArr[i2] = iArr[i3] != 0;
            i3++;
            i2 = i5;
        }
        return 9;
    }

    private static void KN(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i5 = 1;
            if (((1 << (8 - i3)) & i2) == 0) {
                i5 = 0;
            }
            iArr[i3] = i5;
        }
    }

    @Override // NDY.Pl, com.google.zxing.I28
    public x4x.n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (jVar == com.google.zxing.j.CODE_93) {
            return super.n(str, jVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(jVar)));
    }

    private static int Uo(String str, int i2) {
        int iIndexOf = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        return iIndexOf % 47;
    }

    @Override // NDY.Pl
    public boolean[] t(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int length2 = ((str.length() + 4) * 9) + 1;
            KN(CN3.rl[47], iArr);
            boolean[] zArr = new boolean[length2];
            int iJ2 = J2(zArr, 0, iArr);
            for (int i2 = 0; i2 < length; i2++) {
                KN(CN3.rl["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i2))], iArr);
                iJ2 += J2(zArr, iJ2, iArr);
            }
            int iUo = Uo(str, 20);
            int[] iArr2 = CN3.rl;
            KN(iArr2[iUo], iArr);
            int iJ22 = iJ2 + J2(zArr, iJ2, iArr);
            KN(iArr2[Uo(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iUo), 15)], iArr);
            int iJ23 = iJ22 + J2(zArr, iJ22, iArr);
            KN(iArr2[47], iArr);
            zArr[iJ23 + J2(zArr, iJ23, iArr)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
