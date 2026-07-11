package ak;

import com.google.zxing.I28;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import x4x.n;
import z3E.w6;

/* JADX INFO: renamed from: ak.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C1510j implements I28 {
    private static n rl(String str, com.google.zxing.j jVar, int i2, int i3, Charset charset, int i5, int i7) {
        if (jVar == com.google.zxing.j.AZTEC) {
            return t(w6.nr(str.getBytes(charset), i5, i7), i2, i3);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(jVar)));
    }

    @Override // com.google.zxing.I28
    public n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i5 = 0;
        if (map != null) {
            com.google.zxing.w6 w6Var = com.google.zxing.w6.CHARACTER_SET;
            if (map.containsKey(w6Var)) {
                charsetForName = Charset.forName(map.get(w6Var).toString());
            }
            com.google.zxing.w6 w6Var2 = com.google.zxing.w6.ERROR_CORRECTION;
            i = map.containsKey(w6Var2) ? Integer.parseInt(map.get(w6Var2).toString()) : 33;
            com.google.zxing.w6 w6Var3 = com.google.zxing.w6.AZTEC_LAYERS;
            if (map.containsKey(w6Var3)) {
                i5 = Integer.parseInt(map.get(w6Var3).toString());
            }
        }
        return rl(str, jVar, i2, i3, charsetForName, i, i5);
    }

    private static n t(z3E.j jVar, int i2, int i3) {
        n nVarN = jVar.n();
        if (nVarN != null) {
            int iJ2 = nVarN.J2();
            int iO = nVarN.O();
            int iMax = Math.max(i2, iJ2);
            int iMax2 = Math.max(i3, iO);
            int iMin = Math.min(iMax / iJ2, iMax2 / iO);
            int i5 = (iMax - (iJ2 * iMin)) / 2;
            int i7 = (iMax2 - (iO * iMin)) / 2;
            n nVar = new n(iMax, iMax2);
            int i8 = 0;
            while (i8 < iO) {
                int i9 = 0;
                int i10 = i5;
                while (i9 < iJ2) {
                    if (nVarN.nr(i9, i8)) {
                        nVar.xMQ(i10, i7, iMin, iMin);
                    }
                    i9++;
                    i10 += iMin;
                }
                i8++;
                i7 += iMin;
            }
            return nVar;
        }
        throw new IllegalStateException();
    }
}
