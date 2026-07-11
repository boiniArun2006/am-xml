package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class SolverVariable implements Comparable<SolverVariable> {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static int f35001U = 1;
    Type E2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f35011o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f35013t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f35003O = -1;
    int J2 = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35012r = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f35007Z = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    float[] f35004S = new float[9];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f35009g = new float[9];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayRow[] f35008e = new ArrayRow[16];

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f35006X = 0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f35005T = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f35002N = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f35014v = -1;
    float Xw = 0.0f;
    HashSet jB = null;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public void J2() {
        this.f35013t = null;
        this.E2 = Type.UNKNOWN;
        this.f35012r = 0;
        this.f35003O = -1;
        this.J2 = -1;
        this.f35011o = 0.0f;
        this.f35007Z = false;
        this.f35002N = false;
        this.f35014v = -1;
        this.Xw = 0.0f;
        int i2 = this.f35006X;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f35008e[i3] = null;
        }
        this.f35006X = 0;
        this.f35005T = 0;
        this.f35010n = false;
        Arrays.fill(this.f35009g, 0.0f);
    }

    public final void n(ArrayRow arrayRow) {
        int i2 = 0;
        while (true) {
            int i3 = this.f35006X;
            if (i2 >= i3) {
                ArrayRow[] arrayRowArr = this.f35008e;
                if (i3 >= arrayRowArr.length) {
                    this.f35008e = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.f35008e;
                int i5 = this.f35006X;
                arrayRowArr2[i5] = arrayRow;
                this.f35006X = i5 + 1;
                return;
            }
            if (this.f35008e[i2] == arrayRow) {
                return;
            } else {
                i2++;
            }
        }
    }

    static void t() {
        f35001U++;
    }

    public void KN(Type type, String str) {
        this.E2 = type;
    }

    public void Uo(LinearSystem linearSystem, float f3) {
        this.f35011o = f3;
        this.f35007Z = true;
        this.f35002N = false;
        this.f35014v = -1;
        this.Xw = 0.0f;
        int i2 = this.f35006X;
        this.J2 = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f35008e[i3].g(linearSystem, this, false);
        }
        this.f35006X = 0;
    }

    public final void nr(ArrayRow arrayRow) {
        int i2 = this.f35006X;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f35008e[i3] == arrayRow) {
                while (i3 < i2 - 1) {
                    ArrayRow[] arrayRowArr = this.f35008e;
                    int i5 = i3 + 1;
                    arrayRowArr[i3] = arrayRowArr[i5];
                    i3 = i5;
                }
                this.f35006X--;
                return;
            }
            i3++;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public int compareTo(SolverVariable solverVariable) {
        return this.f35003O - solverVariable.f35003O;
    }

    public String toString() {
        if (this.f35013t != null) {
            return "" + this.f35013t;
        }
        return "" + this.f35003O;
    }

    public final void xMQ(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i2 = this.f35006X;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f35008e[i3].te(linearSystem, arrayRow, false);
        }
        this.f35006X = 0;
    }

    public SolverVariable(Type type, String str) {
        this.E2 = type;
    }
}
