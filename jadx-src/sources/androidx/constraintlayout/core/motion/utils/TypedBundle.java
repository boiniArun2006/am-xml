package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class TypedBundle {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int[] f35310n = new int[10];
    int[] rl = new int[10];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f35311t = 0;
    int[] nr = new int[10];

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float[] f35309O = new float[10];
    int J2 = 0;
    int[] Uo = new int[5];
    String[] KN = new String[5];
    int xMQ = 0;
    int[] mUb = new int[4];
    boolean[] gh = new boolean[4];
    int qie = 0;

    public void J2(TypedBundle typedBundle) {
        for (int i2 = 0; i2 < this.f35311t; i2++) {
            typedBundle.rl(this.f35310n[i2], this.rl[i2]);
        }
        for (int i3 = 0; i3 < this.J2; i3++) {
            typedBundle.n(this.nr[i3], this.f35309O[i3]);
        }
        for (int i5 = 0; i5 < this.xMQ; i5++) {
            typedBundle.t(this.Uo[i5], this.KN[i5]);
        }
        for (int i7 = 0; i7 < this.qie; i7++) {
            typedBundle.nr(this.mUb[i7], this.gh[i7]);
        }
    }

    public void KN() {
        this.qie = 0;
        this.xMQ = 0;
        this.J2 = 0;
        this.f35311t = 0;
    }

    public void Uo(TypedValues typedValues) {
        for (int i2 = 0; i2 < this.f35311t; i2++) {
            typedValues.rl(this.f35310n[i2], this.rl[i2]);
        }
        for (int i3 = 0; i3 < this.J2; i3++) {
            typedValues.t(this.nr[i3], this.f35309O[i3]);
        }
        for (int i5 = 0; i5 < this.xMQ; i5++) {
            typedValues.O(this.Uo[i5], this.KN[i5]);
        }
        for (int i7 = 0; i7 < this.qie; i7++) {
            typedValues.nr(this.mUb[i7], this.gh[i7]);
        }
    }

    public void O(int i2, String str) {
        if (str != null) {
            t(i2, str);
        }
    }

    public void n(int i2, float f3) {
        int i3 = this.J2;
        int[] iArr = this.nr;
        if (i3 >= iArr.length) {
            this.nr = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f35309O;
            this.f35309O = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.nr;
        int i5 = this.J2;
        iArr2[i5] = i2;
        float[] fArr2 = this.f35309O;
        this.J2 = i5 + 1;
        fArr2[i5] = f3;
    }

    public void nr(int i2, boolean z2) {
        int i3 = this.qie;
        int[] iArr = this.mUb;
        if (i3 >= iArr.length) {
            this.mUb = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.gh;
            this.gh = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.mUb;
        int i5 = this.qie;
        iArr2[i5] = i2;
        boolean[] zArr2 = this.gh;
        this.qie = i5 + 1;
        zArr2[i5] = z2;
    }

    public void rl(int i2, int i3) {
        int i5 = this.f35311t;
        int[] iArr = this.f35310n;
        if (i5 >= iArr.length) {
            this.f35310n = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.rl;
            this.rl = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f35310n;
        int i7 = this.f35311t;
        iArr3[i7] = i2;
        int[] iArr4 = this.rl;
        this.f35311t = i7 + 1;
        iArr4[i7] = i3;
    }

    public void t(int i2, String str) {
        int i3 = this.xMQ;
        int[] iArr = this.Uo;
        if (i3 >= iArr.length) {
            this.Uo = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.KN;
            this.KN = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.Uo;
        int i5 = this.xMQ;
        iArr2[i5] = i2;
        String[] strArr2 = this.KN;
        this.xMQ = i5 + 1;
        strArr2[i5] = str;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.f35311t + ", mCountFloat=" + this.J2 + ", mCountString=" + this.xMQ + ", mCountBoolean=" + this.qie + '}';
    }
}
