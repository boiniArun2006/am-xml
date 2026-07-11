package ZP;

import AYM.Wre;
import com.google.zxing.I28;
import com.google.zxing.w6;
import java.util.Map;
import x4x.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements I28 {
    private static n rl(Wre wre, int i2, int i3, int i5) {
        AYM.n nVarN = wre.n();
        if (nVarN != null) {
            int iO = nVarN.O();
            int iNr = nVarN.nr();
            int i7 = i5 << 1;
            int i8 = iO + i7;
            int i9 = i7 + iNr;
            int iMax = Math.max(i2, i8);
            int iMax2 = Math.max(i3, i9);
            int iMin = Math.min(iMax / i8, iMax2 / i9);
            int i10 = (iMax - (iO * iMin)) / 2;
            int i11 = (iMax2 - (iNr * iMin)) / 2;
            n nVar = new n(iMax, iMax2);
            int i12 = 0;
            while (i12 < iNr) {
                int i13 = 0;
                int i14 = i10;
                while (i13 < iO) {
                    if (nVarN.rl(i13, i12) == 1) {
                        nVar.xMQ(i14, i11, iMin, iMin);
                    }
                    i13++;
                    i14 += iMin;
                }
                i12++;
                i11 += iMin;
            }
            return nVar;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.zxing.I28
    public n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (!str.isEmpty()) {
            if (jVar == com.google.zxing.j.QR_CODE) {
                if (i2 >= 0 && i3 >= 0) {
                    Cwp.j jVarValueOf = Cwp.j.L;
                    int i5 = 4;
                    if (map != null) {
                        w6 w6Var = w6.ERROR_CORRECTION;
                        if (map.containsKey(w6Var)) {
                            jVarValueOf = Cwp.j.valueOf(map.get(w6Var).toString());
                        }
                        w6 w6Var2 = w6.MARGIN;
                        if (map.containsKey(w6Var2)) {
                            i5 = Integer.parseInt(map.get(w6Var2).toString());
                        }
                    }
                    return rl(AYM.w6.ty(str, jVarValueOf, map), i2, i3, i5);
                }
                throw new IllegalArgumentException("Requested dimensions are too small: " + i2 + 'x' + i3);
            }
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(jVar)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
