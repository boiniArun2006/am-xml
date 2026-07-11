package NDY;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Pl implements com.google.zxing.I28 {
    private static x4x.n O(boolean[] zArr, int i2, int i3, int i5) {
        int length = zArr.length;
        int i7 = i5 + length;
        int iMax = Math.max(i2, i7);
        int iMax2 = Math.max(1, i3);
        int i8 = iMax / i7;
        int i9 = (iMax - (length * i8)) / 2;
        x4x.n nVar = new x4x.n(iMax, iMax2);
        int i10 = 0;
        while (i10 < length) {
            if (zArr[i10]) {
                nVar.xMQ(i9, 0, i8, iMax2);
            }
            i10++;
            i9 += i8;
        }
        return nVar;
    }

    protected static int rl(boolean[] zArr, int i2, int[] iArr, boolean z2) {
        int i3 = 0;
        for (int i5 : iArr) {
            int i7 = 0;
            while (i7 < i5) {
                zArr[i2] = z2;
                i7++;
                i2++;
            }
            i3 += i5;
            z2 = !z2;
        }
        return i3;
    }

    public abstract boolean[] t(String str);

    public int nr() {
        return 10;
    }

    @Override // com.google.zxing.I28
    public x4x.n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (!str.isEmpty()) {
            if (i2 >= 0 && i3 >= 0) {
                int iNr = nr();
                if (map != null) {
                    com.google.zxing.w6 w6Var = com.google.zxing.w6.MARGIN;
                    if (map.containsKey(w6Var)) {
                        iNr = Integer.parseInt(map.get(w6Var).toString());
                    }
                }
                return O(t(str), i2, i3, iNr);
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i2 + 'x' + i3);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
