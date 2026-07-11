package androidx.core.content.res;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class GrowingArrayUtils {
    public static int t(int i2) {
        if (i2 <= 4) {
            return 8;
        }
        return i2 * 2;
    }

    public static int[] n(int[] iArr, int i2, int i3) {
        if (i2 + 1 > iArr.length) {
            int[] iArr2 = new int[t(i2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            iArr = iArr2;
        }
        iArr[i2] = i3;
        return iArr;
    }

    public static Object[] rl(Object[] objArr, int i2, Object obj) {
        if (i2 + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), t(i2));
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            objArr = objArr2;
        }
        objArr[i2] = obj;
        return objArr;
    }
}
