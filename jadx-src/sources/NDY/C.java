package NDY;

import com.google.zxing.FormatException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C extends z {
    @Override // NDY.Pl, com.google.zxing.I28
    public x4x.n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (jVar == com.google.zxing.j.EAN_8) {
            return super.n(str, jVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(jVar)));
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
                str = str + eO.rl(str);
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        boolean[] zArr = new boolean[67];
        int iRl = Pl.rl(zArr, 0, eO.f6989n, true);
        for (int i2 = 0; i2 <= 3; i2++) {
            iRl += Pl.rl(zArr, iRl, eO.nr[Character.digit(str.charAt(i2), 10)], false);
        }
        int iRl2 = iRl + Pl.rl(zArr, iRl, eO.rl, false);
        for (int i3 = 4; i3 <= 7; i3++) {
            iRl2 += Pl.rl(zArr, iRl2, eO.nr[Character.digit(str.charAt(i3), 10)], true);
        }
        Pl.rl(zArr, iRl2, eO.f6989n, true);
        return zArr;
    }
}
