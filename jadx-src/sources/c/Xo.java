package c;

import Rc.w6;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Xo implements vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f43420n;

    protected static float[] O(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            float f3 = i3 < fArr.length ? fArr[i3] : Float.NaN;
            float f4 = i5 < fArr2.length ? fArr2[i5] : Float.NaN;
            if (Float.isNaN(f4) || f3 < f4) {
                fArr3[i7] = f3;
                i3++;
            } else if (Float.isNaN(f3) || f4 < f3) {
                fArr3[i7] = f4;
                i5++;
            } else {
                fArr3[i7] = f3;
                i3++;
                i5++;
                i2++;
            }
        }
        return i2 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i2);
    }

    private int nr(float f3, int i2, float[] fArr, float[] fArr2) {
        float fXMQ;
        if (fArr2.length < 2 || f3 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
        }
        for (int i3 = 1; i3 < fArr.length; i3++) {
            float f4 = fArr[i3];
            if (f4 >= f3 || i3 == fArr.length - 1) {
                if (f4 <= f3) {
                    fXMQ = fArr2[i3];
                } else {
                    int i5 = i3 - 1;
                    float f5 = fArr[i5];
                    fXMQ = x0.o.xMQ(fArr2[i5], fArr2[i3], (f3 - f5) / (f4 - f5));
                }
                return Color.argb((int) (fXMQ * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    int t(float f3, float f4, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f3 == fArr[0]) {
            return iArr[0];
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f5 = fArr[i2];
            if (f5 >= f3 || i2 == fArr.length - 1) {
                if (i2 == fArr.length - 1 && f3 >= f5) {
                    return Color.argb((int) (f4 * 255.0f), Color.red(iArr[i2]), Color.green(iArr[i2]), Color.blue(iArr[i2]));
                }
                int i3 = i2 - 1;
                float f6 = fArr[i3];
                int iT = x0.I28.t((f3 - f6) / (f5 - f6), iArr[i3], iArr[i2]);
                return Color.argb((int) (f4 * 255.0f), Color.red(iT), Color.green(iT), Color.blue(iT));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private QJ.Ml rl(QJ.Ml ml, List list) {
        int i2 = this.f43420n * 4;
        if (list.size() <= i2) {
            return ml;
        }
        float[] fArrO = ml.O();
        int[] iArrNr = ml.nr();
        int size = (list.size() - i2) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i3 = 0;
        while (i2 < list.size()) {
            if (i2 % 2 == 0) {
                fArr[i3] = ((Float) list.get(i2)).floatValue();
            } else {
                fArr2[i3] = ((Float) list.get(i2)).floatValue();
                i3++;
            }
            i2++;
        }
        float[] fArrO2 = O(ml.O(), fArr);
        int length = fArrO2.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            float f3 = fArrO2[i5];
            int iBinarySearch = Arrays.binarySearch(fArrO, f3);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f3);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i5] = t(f3, fArr2[iBinarySearch2], fArrO, iArrNr);
            } else {
                iArr[i5] = nr(f3, iArrNr[iBinarySearch], fArr, fArr2);
            }
        }
        return new QJ.Ml(fArrO2, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    @Override // c.vd
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QJ.Ml n(Rc.w6 w6Var, float f3) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = w6Var.a() == w6.n.BEGIN_ARRAY;
        if (z2) {
            w6Var.rl();
        }
        while (w6Var.jB()) {
            arrayList.add(Float.valueOf((float) w6Var.M7()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f43420n = 2;
        }
        if (z2) {
            w6Var.Z();
        }
        if (this.f43420n == -1) {
            this.f43420n = arrayList.size() / 4;
        }
        int i2 = this.f43420n;
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        int i5 = 0;
        for (int i7 = 0; i7 < this.f43420n * 4; i7++) {
            int i8 = i7 / 4;
            double dFloatValue = ((Float) arrayList.get(i7)).floatValue();
            int i9 = i7 % 4;
            if (i9 != 0) {
                if (i9 == 1) {
                    i3 = (int) (dFloatValue * 255.0d);
                } else if (i9 == 2) {
                    i5 = (int) (dFloatValue * 255.0d);
                } else if (i9 == 3) {
                    iArr[i8] = Color.argb(255, i3, i5, (int) (dFloatValue * 255.0d));
                }
            } else if (i8 > 0) {
                float f4 = (float) dFloatValue;
                if (fArr[i8 - 1] >= f4) {
                    fArr[i8] = f4 + 0.01f;
                } else {
                    fArr[i8] = (float) dFloatValue;
                }
            }
        }
        return rl(new QJ.Ml(fArr, iArr), arrayList);
    }

    public Xo(int i2) {
        this.f43420n = i2;
    }
}
