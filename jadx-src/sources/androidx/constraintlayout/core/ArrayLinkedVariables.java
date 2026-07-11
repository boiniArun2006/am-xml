package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    private static float qie = 0.001f;
    private final ArrayRow rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final Cache f34970t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f34969n = 0;
    private int nr = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private SolverVariable f34968O = null;
    private int[] J2 = new int[8];
    private int[] Uo = new int[8];
    private float[] KN = new float[8];
    private int xMQ = -1;
    private int mUb = -1;
    private boolean gh = false;

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void KN(SolverVariable solverVariable, float f3) {
        if (f3 == 0.0f) {
            O(solverVariable, true);
            return;
        }
        int i2 = this.xMQ;
        if (i2 == -1) {
            this.xMQ = 0;
            this.KN[0] = f3;
            this.J2[0] = solverVariable.f35003O;
            this.Uo[0] = -1;
            solverVariable.f35005T++;
            solverVariable.n(this.rl);
            this.f34969n++;
            if (this.gh) {
                return;
            }
            int i3 = this.mUb + 1;
            this.mUb = i3;
            int[] iArr = this.J2;
            if (i3 >= iArr.length) {
                this.gh = true;
                this.mUb = iArr.length - 1;
                return;
            }
            return;
        }
        int i5 = -1;
        for (int i7 = 0; i2 != -1 && i7 < this.f34969n; i7++) {
            int i8 = this.J2[i2];
            int i9 = solverVariable.f35003O;
            if (i8 == i9) {
                this.KN[i2] = f3;
                return;
            }
            if (i8 < i9) {
                i5 = i2;
            }
            i2 = this.Uo[i2];
        }
        int length = this.mUb;
        int i10 = length + 1;
        if (this.gh) {
            int[] iArr2 = this.J2;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i10;
        }
        int[] iArr3 = this.J2;
        if (length >= iArr3.length && this.f34969n < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.J2;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    length = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.J2;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i12 = this.nr * 2;
            this.nr = i12;
            this.gh = false;
            this.mUb = length - 1;
            this.KN = Arrays.copyOf(this.KN, i12);
            this.J2 = Arrays.copyOf(this.J2, this.nr);
            this.Uo = Arrays.copyOf(this.Uo, this.nr);
        }
        this.J2[length] = solverVariable.f35003O;
        this.KN[length] = f3;
        if (i5 != -1) {
            int[] iArr6 = this.Uo;
            iArr6[length] = iArr6[i5];
            iArr6[i5] = length;
        } else {
            this.Uo[length] = this.xMQ;
            this.xMQ = length;
        }
        solverVariable.f35005T++;
        solverVariable.n(this.rl);
        int i13 = this.f34969n + 1;
        this.f34969n = i13;
        if (!this.gh) {
            this.mUb++;
        }
        int[] iArr7 = this.J2;
        if (i13 >= iArr7.length) {
            this.gh = true;
        }
        if (this.mUb >= iArr7.length) {
            this.gh = true;
            this.mUb = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int J2() {
        return this.f34969n;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float O(SolverVariable solverVariable, boolean z2) {
        if (this.f34968O == solverVariable) {
            this.f34968O = null;
        }
        int i2 = this.xMQ;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i5 = -1;
        while (i2 != -1 && i3 < this.f34969n) {
            if (this.J2[i2] == solverVariable.f35003O) {
                if (i2 == this.xMQ) {
                    this.xMQ = this.Uo[i2];
                } else {
                    int[] iArr = this.Uo;
                    iArr[i5] = iArr[i2];
                }
                if (z2) {
                    solverVariable.nr(this.rl);
                }
                solverVariable.f35005T--;
                this.f34969n--;
                this.J2[i2] = -1;
                if (this.gh) {
                    this.mUb = i2;
                }
                return this.KN[i2];
            }
            i3++;
            i5 = i2;
            i2 = this.Uo[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float Uo(ArrayRow arrayRow, boolean z2) {
        float fMUb = mUb(arrayRow.f34972n);
        O(arrayRow.f34972n, z2);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.f34971O;
        int iJ2 = arrayRowVariables.J2();
        for (int i2 = 0; i2 < iJ2; i2++) {
            SolverVariable solverVariableRl = arrayRowVariables.rl(i2);
            t(solverVariableRl, arrayRowVariables.mUb(solverVariableRl) * fMUb, z2);
        }
        return fMUb;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i2 = this.xMQ;
        for (int i3 = 0; i2 != -1 && i3 < this.f34969n; i3++) {
            SolverVariable solverVariable = this.f34970t.nr[this.J2[i2]];
            if (solverVariable != null) {
                solverVariable.nr(this.rl);
            }
            i2 = this.Uo[i2];
        }
        this.xMQ = -1;
        this.mUb = -1;
        this.gh = false;
        this.f34969n = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void gh(float f3) {
        int i2 = this.xMQ;
        for (int i3 = 0; i2 != -1 && i3 < this.f34969n; i3++) {
            float[] fArr = this.KN;
            fArr[i2] = fArr[i2] / f3;
            i2 = this.Uo[i2];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float mUb(SolverVariable solverVariable) {
        int i2 = this.xMQ;
        for (int i3 = 0; i2 != -1 && i3 < this.f34969n; i3++) {
            if (this.J2[i2] == solverVariable.f35003O) {
                return this.KN[i2];
            }
            i2 = this.Uo[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean n(SolverVariable solverVariable) {
        int i2 = this.xMQ;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f34969n; i3++) {
            if (this.J2[i2] == solverVariable.f35003O) {
                return true;
            }
            i2 = this.Uo[i2];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void nr() {
        int i2 = this.xMQ;
        for (int i3 = 0; i2 != -1 && i3 < this.f34969n; i3++) {
            float[] fArr = this.KN;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.Uo[i2];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable rl(int i2) {
        int i3 = this.xMQ;
        for (int i5 = 0; i3 != -1 && i5 < this.f34969n; i5++) {
            if (i5 == i2) {
                return this.f34970t.nr[this.J2[i3]];
            }
            i3 = this.Uo[i3];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void t(SolverVariable solverVariable, float f3, boolean z2) {
        float f4 = qie;
        if (f3 <= (-f4) || f3 >= f4) {
            int i2 = this.xMQ;
            if (i2 == -1) {
                this.xMQ = 0;
                this.KN[0] = f3;
                this.J2[0] = solverVariable.f35003O;
                this.Uo[0] = -1;
                solverVariable.f35005T++;
                solverVariable.n(this.rl);
                this.f34969n++;
                if (this.gh) {
                    return;
                }
                int i3 = this.mUb + 1;
                this.mUb = i3;
                int[] iArr = this.J2;
                if (i3 >= iArr.length) {
                    this.gh = true;
                    this.mUb = iArr.length - 1;
                    return;
                }
                return;
            }
            int i5 = -1;
            for (int i7 = 0; i2 != -1 && i7 < this.f34969n; i7++) {
                int i8 = this.J2[i2];
                int i9 = solverVariable.f35003O;
                if (i8 == i9) {
                    float[] fArr = this.KN;
                    float f5 = fArr[i2] + f3;
                    float f6 = qie;
                    if (f5 > (-f6) && f5 < f6) {
                        f5 = 0.0f;
                    }
                    fArr[i2] = f5;
                    if (f5 == 0.0f) {
                        if (i2 == this.xMQ) {
                            this.xMQ = this.Uo[i2];
                        } else {
                            int[] iArr2 = this.Uo;
                            iArr2[i5] = iArr2[i2];
                        }
                        if (z2) {
                            solverVariable.nr(this.rl);
                        }
                        if (this.gh) {
                            this.mUb = i2;
                        }
                        solverVariable.f35005T--;
                        this.f34969n--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i5 = i2;
                }
                i2 = this.Uo[i2];
            }
            int length = this.mUb;
            int i10 = length + 1;
            if (this.gh) {
                int[] iArr3 = this.J2;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i10;
            }
            int[] iArr4 = this.J2;
            if (length >= iArr4.length && this.f34969n < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.J2;
                    if (i11 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i11] == -1) {
                        length = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr6 = this.J2;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i12 = this.nr * 2;
                this.nr = i12;
                this.gh = false;
                this.mUb = length - 1;
                this.KN = Arrays.copyOf(this.KN, i12);
                this.J2 = Arrays.copyOf(this.J2, this.nr);
                this.Uo = Arrays.copyOf(this.Uo, this.nr);
            }
            this.J2[length] = solverVariable.f35003O;
            this.KN[length] = f3;
            if (i5 != -1) {
                int[] iArr7 = this.Uo;
                iArr7[length] = iArr7[i5];
                iArr7[i5] = length;
            } else {
                this.Uo[length] = this.xMQ;
                this.xMQ = length;
            }
            solverVariable.f35005T++;
            solverVariable.n(this.rl);
            this.f34969n++;
            if (!this.gh) {
                this.mUb++;
            }
            int i13 = this.mUb;
            int[] iArr8 = this.J2;
            if (i13 >= iArr8.length) {
                this.gh = true;
                this.mUb = iArr8.length - 1;
            }
        }
    }

    public String toString() {
        int i2 = this.xMQ;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f34969n; i3++) {
            str = ((str + " -> ") + this.KN[i2] + " : ") + this.f34970t.nr[this.J2[i2]];
            i2 = this.Uo[i2];
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float xMQ(int i2) {
        int i3 = this.xMQ;
        for (int i5 = 0; i3 != -1 && i5 < this.f34969n; i5++) {
            if (i5 == i2) {
                return this.KN[i3];
            }
            i3 = this.Uo[i3];
        }
        return 0.0f;
    }

    ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.rl = arrayRow;
        this.f34970t = cache;
    }
}
