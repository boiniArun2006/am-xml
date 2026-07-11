package NDY;

import com.google.zxing.FormatException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l3D extends z {
    @Override // NDY.Pl, com.google.zxing.I28
    public x4x.n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (jVar == com.google.zxing.j.UPC_E) {
            return super.n(str, jVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(jVar)));
    }

    @Override // NDY.Pl
    public boolean[] t(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!eO.n(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = str + eO.rl(QJ.t(str));
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i2 = QJ.Uo[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iRl = Pl.rl(zArr, 0, eO.f6989n, true);
        for (int i3 = 1; i3 <= 6; i3++) {
            int iDigit2 = Character.digit(str.charAt(i3), 10);
            if (((i2 >> (6 - i3)) & 1) == 1) {
                iDigit2 += 10;
            }
            iRl += Pl.rl(zArr, iRl, eO.f6988O[iDigit2], false);
        }
        Pl.rl(zArr, iRl, eO.f6990t, false);
        return zArr;
    }
}
