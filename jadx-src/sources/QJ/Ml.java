package QJ;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f7981n;
    private final int[] rl;

    private void n(Ml ml) {
        int i2 = 0;
        while (true) {
            int[] iArr = ml.rl;
            if (i2 >= iArr.length) {
                return;
            }
            this.f7981n[i2] = ml.f7981n[i2];
            this.rl[i2] = iArr[i2];
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Ml ml = (Ml) obj;
            if (Arrays.equals(this.f7981n, ml.f7981n) && Arrays.equals(this.rl, ml.rl)) {
                return true;
            }
        }
        return false;
    }

    public Ml rl(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            iArr[i2] = t(fArr[i2]);
        }
        return new Ml(fArr, iArr);
    }

    private int t(float f3) {
        int iBinarySearch = Arrays.binarySearch(this.f7981n, f3);
        if (iBinarySearch >= 0) {
            return this.rl[iBinarySearch];
        }
        int i2 = -(iBinarySearch + 1);
        if (i2 == 0) {
            return this.rl[0];
        }
        int[] iArr = this.rl;
        if (i2 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f7981n;
        int i3 = i2 - 1;
        float f4 = fArr[i3];
        return x0.I28.t((f3 - f4) / (fArr[i2] - f4), iArr[i3], iArr[i2]);
    }

    public int J2() {
        return this.rl.length;
    }

    public float[] O() {
        return this.f7981n;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f7981n) * 31) + Arrays.hashCode(this.rl);
    }

    public int[] nr() {
        return this.rl;
    }

    public Ml(float[] fArr, int[] iArr) {
        this.f7981n = fArr;
        this.rl = iArr;
    }

    public void Uo(Ml ml, Ml ml2, float f3) {
        int[] iArr;
        if (ml.equals(ml2)) {
            n(ml);
            return;
        }
        if (f3 <= 0.0f) {
            n(ml);
            return;
        }
        if (f3 >= 1.0f) {
            n(ml2);
            return;
        }
        if (ml.rl.length == ml2.rl.length) {
            int i2 = 0;
            while (true) {
                iArr = ml.rl;
                if (i2 >= iArr.length) {
                    break;
                }
                this.f7981n[i2] = x0.o.xMQ(ml.f7981n[i2], ml2.f7981n[i2], f3);
                this.rl[i2] = x0.I28.t(f3, ml.rl[i2], ml2.rl[i2]);
                i2++;
            }
            int length = iArr.length;
            while (true) {
                float[] fArr = this.f7981n;
                if (length < fArr.length) {
                    int[] iArr2 = ml.rl;
                    fArr[length] = fArr[iArr2.length - 1];
                    int[] iArr3 = this.rl;
                    iArr3[length] = iArr3[iArr2.length - 1];
                    length++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + ml.rl.length + " vs " + ml2.rl.length + ")");
        }
    }
}
