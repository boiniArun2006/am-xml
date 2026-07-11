package androidx.transition;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class VelocityTracker1D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f42266n;
    private float[] rl = new float[20];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42267t = 0;

    public void n(long j2, float f3) {
        int i2 = (this.f42267t + 1) % 20;
        this.f42267t = i2;
        this.f42266n[i2] = j2;
        this.rl[i2] = f3;
    }

    float rl() {
        float fT;
        int i2 = this.f42267t;
        if (i2 == 0 && this.f42266n[i2] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j2 = this.f42266n[i2];
        int i3 = 0;
        long j3 = j2;
        while (true) {
            long j4 = this.f42266n[i2];
            if (j4 == Long.MIN_VALUE) {
                break;
            }
            float f3 = j2 - j4;
            float fAbs = Math.abs(j4 - j3);
            if (f3 > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i2 == 0) {
                i2 = 20;
            }
            i2--;
            i3++;
            if (i3 >= 20) {
                break;
            }
            j3 = j4;
        }
        if (i3 < 2) {
            return 0.0f;
        }
        if (i3 == 2) {
            int i5 = this.f42267t;
            int i7 = i5 == 0 ? 19 : i5 - 1;
            long[] jArr = this.f42266n;
            float f4 = jArr[i5] - jArr[i7];
            if (f4 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.rl;
            fT = (fArr[i5] - fArr[i7]) / f4;
        } else {
            int i8 = this.f42267t;
            int i9 = ((i8 - i3) + 21) % 20;
            int i10 = (i8 + 21) % 20;
            long j5 = this.f42266n[i9];
            float f5 = this.rl[i9];
            int i11 = i9 + 1;
            float fT2 = 0.0f;
            for (int i12 = i11 % 20; i12 != i10; i12 = (i12 + 1) % 20) {
                long j6 = this.f42266n[i12];
                float f6 = j6 - j5;
                if (f6 != 0.0f) {
                    float f7 = this.rl[i12];
                    float f8 = (f7 - f5) / f6;
                    fT2 += (f8 - t(fT2)) * Math.abs(f8);
                    if (i12 == i11) {
                        fT2 *= 0.5f;
                    }
                    f5 = f7;
                    j5 = j6;
                }
            }
            fT = t(fT2);
        }
        return fT * 1000.0f;
    }

    VelocityTracker1D() {
        long[] jArr = new long[20];
        this.f42266n = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float t(float f3) {
        return (float) (((double) Math.signum(f3)) * Math.sqrt(Math.abs(f3) * 2.0f));
    }
}
