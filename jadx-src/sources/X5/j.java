package X5;

import P6.Wre;
import P6.w6;
import WS.Ml;
import b1b.n;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements Ml {
    private static n rl(Wre wre, int i2, int i3, int i5) {
        P6.n nVarN = wre.n();
        if (nVarN != null) {
            int iO = nVarN.O();
            int iNr = nVarN.nr();
            int i7 = i5 * 2;
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
                        nVar.J2(i14, i11, iMin, iMin);
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

    @Override // WS.Ml
    public n n(String str, WS.j jVar, int i2, int i3, Map map) {
        if (!str.isEmpty()) {
            if (jVar == WS.j.QR_CODE) {
                if (i2 >= 0 && i3 >= 0) {
                    bq4.j jVarValueOf = bq4.j.L;
                    int i5 = 4;
                    if (map != null) {
                        WS.n nVar = WS.n.ERROR_CORRECTION;
                        if (map.containsKey(nVar)) {
                            jVarValueOf = bq4.j.valueOf(map.get(nVar).toString());
                        }
                        WS.n nVar2 = WS.n.MARGIN;
                        if (map.containsKey(nVar2)) {
                            i5 = Integer.parseInt(map.get(nVar2).toString());
                        }
                    }
                    return rl(w6.ty(str, jVarValueOf, map), i2, i3, i5);
                }
                throw new IllegalArgumentException("Requested dimensions are too small: " + i2 + 'x' + i3);
            }
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + jVar);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
