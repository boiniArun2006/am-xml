package NDY;

import com.google.zxing.FormatException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class aC extends z {
    @Override // NDY.Pl, com.google.zxing.I28
    public x4x.n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (jVar == com.google.zxing.j.EAN_13) {
            return super.n(str, jVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(jVar)));
    }

    @Override // NDY.Pl
    public boolean[] t(String str) {
        int length = str.length();
        if (length != 12) {
            if (length == 13) {
                try {
                    if (!eO.n(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = str + eO.rl(str);
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        int i2 = Dsr.J2[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iRl = Pl.rl(zArr, 0, eO.f6989n, true);
        for (int i3 = 1; i3 <= 6; i3++) {
            int iDigit = Character.digit(str.charAt(i3), 10);
            if (((i2 >> (6 - i3)) & 1) == 1) {
                iDigit += 10;
            }
            iRl += Pl.rl(zArr, iRl, eO.f6988O[iDigit], false);
        }
        int iRl2 = iRl + Pl.rl(zArr, iRl, eO.rl, false);
        for (int i5 = 7; i5 <= 12; i5++) {
            iRl2 += Pl.rl(zArr, iRl2, eO.nr[Character.digit(str.charAt(i5), 10)], true);
        }
        Pl.rl(zArr, iRl2, eO.f6989n, true);
        return zArr;
    }
}
