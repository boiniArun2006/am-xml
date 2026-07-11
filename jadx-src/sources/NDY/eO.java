package NDY;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class eO extends qz {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final int[][] f6988O;
    static final int[][] nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int[] f6989n = {1, 1, 1};
    static final int[] rl = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int[] f6990t = {1, 1, 1, 1, 1, 1};

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        nr = iArr;
        int[][] iArr2 = new int[20][];
        f6988O = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i2 = 10; i2 < 20; i2++) {
            int[] iArr3 = nr[i2 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                iArr4[i3] = iArr3[(iArr3.length - i3) - 1];
            }
            f6988O[i2] = iArr4;
        }
    }

    static boolean n(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i2 = length - 1;
        if (rl(charSequence.subSequence(0, i2)) != Character.digit(charSequence.charAt(i2), 10)) {
            return false;
        }
        return true;
    }

    static int rl(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3 -= 2) {
            int iCharAt = charSequence.charAt(i3) - '0';
            if (iCharAt >= 0 && iCharAt <= 9) {
                i2 += iCharAt;
            } else {
                throw FormatException.n();
            }
        }
        int i5 = i2 * 3;
        for (int i7 = length - 2; i7 >= 0; i7 -= 2) {
            int iCharAt2 = charSequence.charAt(i7) - '0';
            if (iCharAt2 >= 0 && iCharAt2 <= 9) {
                i5 += iCharAt2;
            } else {
                throw FormatException.n();
            }
        }
        return (1000 - i5) % 10;
    }
}
