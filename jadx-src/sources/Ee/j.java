package Ee;

import com.google.zxing.I28;
import com.google.zxing.w6;
import j9w.C;
import j9w.Dsr;
import j9w.aC;
import j9w.o;
import java.util.Map;
import x4x.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements I28 {
    private static n rl(AYM.n nVar, int i2, int i3) {
        n nVar2;
        int iO = nVar.O();
        int iNr = nVar.nr();
        int iMax = Math.max(i2, iO);
        int iMax2 = Math.max(i3, iNr);
        int iMin = Math.min(iMax / iO, iMax2 / iNr);
        int i5 = (iMax - (iO * iMin)) / 2;
        int i7 = (iMax2 - (iNr * iMin)) / 2;
        if (i3 >= iNr && i2 >= iO) {
            nVar2 = new n(i2, i3);
        } else {
            nVar2 = new n(iO, iNr);
            i5 = 0;
            i7 = 0;
        }
        nVar2.rl();
        int i8 = 0;
        while (i8 < iNr) {
            int i9 = i5;
            int i10 = 0;
            while (i10 < iO) {
                if (nVar.rl(i10, i8) == 1) {
                    nVar2.xMQ(i9, i7, iMin, iMin);
                }
                i10++;
                i9 += iMin;
            }
            i8++;
            i7 += iMin;
        }
        return nVar2;
    }

    private static n t(j9w.I28 i28, C c2, int i2, int i3) {
        boolean z2;
        boolean z3;
        int iKN = c2.KN();
        int iUo = c2.Uo();
        AYM.n nVar = new AYM.n(c2.mUb(), c2.xMQ());
        int i5 = 0;
        for (int i7 = 0; i7 < iUo; i7++) {
            if (i7 % c2.f69324O == 0) {
                int i8 = 0;
                for (int i9 = 0; i9 < c2.mUb(); i9++) {
                    if (i9 % 2 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    nVar.Uo(i8, i5, z3);
                    i8++;
                }
                i5++;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < iKN; i11++) {
                if (i11 % c2.nr == 0) {
                    nVar.Uo(i10, i5, true);
                    i10++;
                }
                nVar.Uo(i10, i5, i28.O(i11, i7));
                int i12 = i10 + 1;
                int i13 = c2.nr;
                if (i11 % i13 == i13 - 1) {
                    if (i7 % 2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    nVar.Uo(i12, i5, z2);
                    i10 += 2;
                } else {
                    i10 = i12;
                }
            }
            int i14 = i5 + 1;
            int i15 = c2.f69324O;
            if (i7 % i15 == i15 - 1) {
                int i16 = 0;
                for (int i17 = 0; i17 < c2.mUb(); i17++) {
                    nVar.Uo(i16, i14, true);
                    i16++;
                }
                i5 += 2;
            } else {
                i5 = i14;
            }
        }
        return rl(nVar, i2, i3);
    }

    @Override // com.google.zxing.I28
    public n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (!str.isEmpty()) {
            if (jVar == com.google.zxing.j.DATA_MATRIX) {
                if (i2 >= 0 && i3 >= 0) {
                    o oVar = o.FORCE_NONE;
                    if (map != null) {
                        o oVar2 = (o) map.get(w6.DATA_MATRIX_SHAPE);
                        if (oVar2 != null) {
                            oVar = oVar2;
                        }
                        android.support.v4.media.j.n(map.get(w6.MIN_SIZE));
                        android.support.v4.media.j.n(map.get(w6.MAX_SIZE));
                    }
                    String strRl = aC.rl(str, oVar, null, null);
                    C cQie = C.qie(strRl.length(), oVar, null, null, true);
                    j9w.I28 i28 = new j9w.I28(Dsr.t(strRl, cQie), cQie.KN(), cQie.Uo());
                    i28.KN();
                    return t(i28, cQie, i2, i3);
                }
                throw new IllegalArgumentException("Requested dimensions can't be negative: " + i2 + 'x' + i3);
            }
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(jVar)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
