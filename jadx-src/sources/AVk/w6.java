package AVk;

import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f83n;

    private static boolean rl(StackTraceElement[] stackTraceElementArr, int i2, int i3) {
        int i5 = i3 - i2;
        if (i3 + i5 > stackTraceElementArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            if (!stackTraceElementArr[i2 + i7].equals(stackTraceElementArr[i3 + i7])) {
                return false;
            }
        }
        return true;
    }

    private static StackTraceElement[] t(StackTraceElement[] stackTraceElementArr, int i2) {
        int i3;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i5 = 0;
        int i7 = 0;
        int i8 = 1;
        while (i5 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i5];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null || !rl(stackTraceElementArr, num.intValue(), i5)) {
                stackTraceElementArr2[i7] = stackTraceElementArr[i5];
                i7++;
                i8 = 1;
                i3 = i5;
            } else {
                int iIntValue = i5 - num.intValue();
                if (i8 < i2) {
                    System.arraycopy(stackTraceElementArr, i5, stackTraceElementArr2, i7, iIntValue);
                    i7 += iIntValue;
                    i8++;
                }
                i3 = (iIntValue - 1) + i5;
            }
            map.put(stackTraceElement, Integer.valueOf(i5));
            i5 = i3 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i7];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i7);
        return stackTraceElementArr3;
    }

    @Override // AVk.Ml
    public StackTraceElement[] n(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTraceElementArrT = t(stackTraceElementArr, this.f83n);
        return stackTraceElementArrT.length < stackTraceElementArr.length ? stackTraceElementArrT : stackTraceElementArr;
    }

    public w6(int i2) {
        this.f83n = i2;
    }
}
