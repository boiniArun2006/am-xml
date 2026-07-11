package XO;

import com.google.zxing.I28;
import com.google.zxing.WriterException;
import com.google.zxing.w6;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import nI.Ml;
import x4x.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements I28 {
    private static byte[][] nr(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length = (bArr.length - i2) - 1;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][length] = bArr[i2][i3];
            }
        }
        return bArr2;
    }

    private static n rl(byte[][] bArr, int i2) {
        int i3 = i2 * 2;
        n nVar = new n(bArr[0].length + i3, bArr.length + i3);
        nVar.rl();
        int iO = (nVar.O() - i2) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i7 = 0; i7 < bArr[0].length; i7++) {
                if (bArr2[i7] == 1) {
                    nVar.KN(i7 + i2, iO);
                }
            }
            i5++;
            iO--;
        }
        return nVar;
    }

    @Override // com.google.zxing.I28
    public n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (jVar != com.google.zxing.j.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(jVar)));
        }
        Ml ml = new Ml();
        if (map != null) {
            w6 w6Var = w6.PDF417_COMPACT;
            if (map.containsKey(w6Var)) {
                ml.KN(Boolean.valueOf(map.get(w6Var).toString()).booleanValue());
            }
            w6 w6Var2 = w6.PDF417_COMPACTION;
            if (map.containsKey(w6Var2)) {
                ml.xMQ(nI.w6.valueOf(map.get(w6Var2).toString()));
            }
            w6 w6Var3 = w6.PDF417_DIMENSIONS;
            if (map.containsKey(w6Var3)) {
                android.support.v4.media.j.n(map.get(w6Var3));
                throw null;
            }
            w6 w6Var4 = w6.MARGIN;
            i = map.containsKey(w6Var4) ? Integer.parseInt(map.get(w6Var4).toString()) : 30;
            w6 w6Var5 = w6.ERROR_CORRECTION;
            i = map.containsKey(w6Var5) ? Integer.parseInt(map.get(w6Var5).toString()) : 2;
            w6 w6Var6 = w6.CHARACTER_SET;
            if (map.containsKey(w6Var6)) {
                ml.mUb(Charset.forName(map.get(w6Var6).toString()));
            }
        }
        return t(ml, str, i, i2, i3, i);
    }

    private static n t(Ml ml, String str, int i2, int i3, int i5, int i7) throws WriterException {
        boolean z2;
        boolean z3;
        boolean z4;
        ml.O(str, i2);
        byte[][] bArrRl = ml.J2().rl(1, 4);
        if (i5 > i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bArrRl[0].length < bArrRl.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            bArrRl = nr(bArrRl);
            z4 = true;
        } else {
            z4 = false;
        }
        int length = i3 / bArrRl[0].length;
        int length2 = i5 / bArrRl.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            byte[][] bArrRl2 = ml.J2().rl(length, length << 2);
            if (z4) {
                bArrRl2 = nr(bArrRl2);
            }
            return rl(bArrRl2, i7);
        }
        return rl(bArrRl, i7);
    }
}
