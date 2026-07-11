package NDY;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class o extends Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f6995n = {1, 1, 1, 1};
    private static final int[] rl = {3, 1, 1};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[][] f6996t = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // NDY.Pl, com.google.zxing.I28
    public x4x.n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (jVar == com.google.zxing.j.ITF) {
            return super.n(str, jVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(jVar)));
    }

    @Override // NDY.Pl
    public boolean[] t(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                boolean[] zArr = new boolean[(length * 9) + 9];
                int iRl = Pl.rl(zArr, 0, f6995n, true);
                for (int i2 = 0; i2 < length; i2 += 2) {
                    int iDigit = Character.digit(str.charAt(i2), 10);
                    int iDigit2 = Character.digit(str.charAt(i2 + 1), 10);
                    int[] iArr = new int[10];
                    for (int i3 = 0; i3 < 5; i3++) {
                        int i5 = i3 * 2;
                        int[][] iArr2 = f6996t;
                        iArr[i5] = iArr2[iDigit][i3];
                        iArr[i5 + 1] = iArr2[iDigit2][i3];
                    }
                    iRl += Pl.rl(zArr, iRl, iArr, true);
                }
                Pl.rl(zArr, iRl, rl, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
