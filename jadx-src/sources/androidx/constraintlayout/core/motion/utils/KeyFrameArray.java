package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class KeyFrameArray {

    public static class CustomArray {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int[] f35278n;
        CustomAttribute[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35279t;

        public int n(int i2) {
            return this.f35278n[i2];
        }

        public int rl() {
            return this.f35279t;
        }

        public CustomAttribute t(int i2) {
            return this.rl[this.f35278n[i2]];
        }
    }

    public static class CustomVar {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int[] f35280n = new int[101];
        CustomVariable[] rl = new CustomVariable[101];

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35281t;

        public CustomVariable J2(int i2) {
            return this.rl[this.f35280n[i2]];
        }

        public int O() {
            return this.f35281t;
        }

        public void n(int i2, CustomVariable customVariable) {
            if (this.rl[i2] != null) {
                nr(i2);
            }
            this.rl[i2] = customVariable;
            int[] iArr = this.f35280n;
            int i3 = this.f35281t;
            this.f35281t = i3 + 1;
            iArr[i3] = i2;
            Arrays.sort(iArr);
        }

        public void nr(int i2) {
            this.rl[i2] = null;
            int i3 = 0;
            int i5 = 0;
            while (true) {
                int i7 = this.f35281t;
                if (i3 >= i7) {
                    this.f35281t = i7 - 1;
                    return;
                }
                int[] iArr = this.f35280n;
                if (i2 == iArr[i3]) {
                    iArr[i3] = 999;
                    i5++;
                }
                if (i3 != i5) {
                    iArr[i3] = iArr[i5];
                }
                i5++;
                i3++;
            }
        }

        public void rl() {
            Arrays.fill(this.f35280n, 999);
            Arrays.fill(this.rl, (Object) null);
            this.f35281t = 0;
        }

        public int t(int i2) {
            return this.f35280n[i2];
        }

        public CustomVar() {
            rl();
        }
    }

    static class FloatArray {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int[] f35282n;
        float[][] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35283t;

        public void n(int i2, float[] fArr) {
            if (this.rl[i2] != null) {
                rl(i2);
            }
            this.rl[i2] = fArr;
            int[] iArr = this.f35282n;
            int i3 = this.f35283t;
            this.f35283t = i3 + 1;
            iArr[i3] = i2;
            Arrays.sort(iArr);
        }

        public void rl(int i2) {
            this.rl[i2] = null;
            int i3 = 0;
            int i5 = 0;
            while (true) {
                int i7 = this.f35283t;
                if (i3 >= i7) {
                    this.f35283t = i7 - 1;
                    return;
                }
                int[] iArr = this.f35282n;
                if (i2 == iArr[i3]) {
                    iArr[i3] = 999;
                    i5++;
                }
                if (i3 != i5) {
                    iArr[i3] = iArr[i5];
                }
                i5++;
                i3++;
            }
        }

        public float[] t(int i2) {
            return this.rl[this.f35282n[i2]];
        }
    }
}
