package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static float ty = 0.001f;
    protected final Cache az;
    private final ArrayRow qie;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f35021n = -1;
    private int rl = 16;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35022t = 16;
    int[] nr = new int[16];

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int[] f35020O = new int[16];
    int[] J2 = new int[16];
    float[] Uo = new float[16];
    int[] KN = new int[16];
    int[] xMQ = new int[16];
    int mUb = 0;
    int gh = -1;

    private int ty() {
        for (int i2 = 0; i2 < this.rl; i2++) {
            if (this.J2[i2] == -1) {
                return i2;
            }
        }
        return -1;
    }

    private void HI() {
        int i2 = this.rl * 2;
        this.J2 = Arrays.copyOf(this.J2, i2);
        this.Uo = Arrays.copyOf(this.Uo, i2);
        this.KN = Arrays.copyOf(this.KN, i2);
        this.xMQ = Arrays.copyOf(this.xMQ, i2);
        this.f35020O = Arrays.copyOf(this.f35020O, i2);
        for (int i3 = this.rl; i3 < i2; i3++) {
            this.J2[i3] = -1;
            this.f35020O[i3] = -1;
        }
        this.rl = i2;
    }

    private void az(int i2, SolverVariable solverVariable, float f3) {
        this.J2[i2] = solverVariable.f35003O;
        this.Uo[i2] = f3;
        this.KN[i2] = -1;
        this.xMQ[i2] = -1;
        solverVariable.n(this.qie);
        solverVariable.f35005T++;
        this.mUb++;
    }

    private void qie(SolverVariable solverVariable, int i2) {
        int[] iArr;
        int i3 = solverVariable.f35003O % this.f35022t;
        int[] iArr2 = this.nr;
        int i5 = iArr2[i3];
        if (i5 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f35020O;
                int i7 = iArr[i5];
                if (i7 == -1) {
                    break;
                } else {
                    i5 = i7;
                }
            }
            iArr[i5] = i2;
        }
        this.f35020O[i2] = -1;
    }

    private void r(SolverVariable solverVariable) {
        int[] iArr;
        int i2;
        int i3 = solverVariable.f35003O;
        int i5 = i3 % this.f35022t;
        int[] iArr2 = this.nr;
        int i7 = iArr2[i5];
        if (i7 == -1) {
            return;
        }
        if (this.J2[i7] == i3) {
            int[] iArr3 = this.f35020O;
            iArr2[i5] = iArr3[i7];
            iArr3[i7] = -1;
            return;
        }
        while (true) {
            iArr = this.f35020O;
            i2 = iArr[i7];
            if (i2 == -1 || this.J2[i2] == i3) {
                break;
            } else {
                i7 = i2;
            }
        }
        if (i2 == -1 || this.J2[i2] != i3) {
            return;
        }
        iArr[i7] = iArr[i2];
        iArr[i2] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int J2() {
        return this.mUb;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void KN(SolverVariable solverVariable, float f3) {
        float f4 = ty;
        if (f3 > (-f4) && f3 < f4) {
            O(solverVariable, true);
            return;
        }
        if (this.mUb == 0) {
            az(0, solverVariable, f3);
            qie(solverVariable, 0);
            this.gh = 0;
            return;
        }
        int iCk = ck(solverVariable);
        if (iCk != -1) {
            this.Uo[iCk] = f3;
            return;
        }
        if (this.mUb + 1 >= this.rl) {
            HI();
        }
        int i2 = this.mUb;
        int i3 = this.gh;
        int i5 = -1;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = this.J2[i3];
            int i9 = solverVariable.f35003O;
            if (i8 == i9) {
                this.Uo[i3] = f3;
                return;
            }
            if (i8 < i9) {
                i5 = i3;
            }
            i3 = this.xMQ[i3];
            if (i3 == -1) {
                break;
            }
        }
        Ik(i5, solverVariable, f3);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float Uo(ArrayRow arrayRow, boolean z2) {
        float fMUb = mUb(arrayRow.f34972n);
        O(arrayRow.f34972n, z2);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.f34971O;
        int iJ2 = solverVariableValues.J2();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iJ2) {
            int i5 = solverVariableValues.J2[i3];
            if (i5 != -1) {
                t(this.az.nr[i5], solverVariableValues.Uo[i3] * fMUb, z2);
                i2++;
            }
            i3++;
        }
        return fMUb;
    }

    public int ck(SolverVariable solverVariable) {
        if (this.mUb != 0 && solverVariable != null) {
            int i2 = solverVariable.f35003O;
            int i3 = this.nr[i2 % this.f35022t];
            if (i3 == -1) {
                return -1;
            }
            if (this.J2[i3] == i2) {
                return i3;
            }
            do {
                i3 = this.f35020O[i3];
                if (i3 == -1) {
                    break;
                }
            } while (this.J2[i3] != i2);
            if (i3 != -1 && this.J2[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i2 = this.mUb;
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable solverVariableRl = rl(i3);
            if (solverVariableRl != null) {
                solverVariableRl.nr(this.qie);
            }
        }
        for (int i5 = 0; i5 < this.rl; i5++) {
            this.J2[i5] = -1;
            this.f35020O[i5] = -1;
        }
        for (int i7 = 0; i7 < this.f35022t; i7++) {
            this.nr[i7] = -1;
        }
        this.mUb = 0;
        this.gh = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void gh(float f3) {
        int i2 = this.mUb;
        int i3 = this.gh;
        for (int i5 = 0; i5 < i2; i5++) {
            float[] fArr = this.Uo;
            fArr[i3] = fArr[i3] / f3;
            i3 = this.xMQ[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void nr() {
        int i2 = this.mUb;
        int i3 = this.gh;
        for (int i5 = 0; i5 < i2; i5++) {
            float[] fArr = this.Uo;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.xMQ[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable rl(int i2) {
        int i3 = this.mUb;
        if (i3 == 0) {
            return null;
        }
        int i5 = this.gh;
        for (int i7 = 0; i7 < i3; i7++) {
            if (i7 == i2 && i5 != -1) {
                return this.az.nr[this.J2[i5]];
            }
            i5 = this.xMQ[i5];
            if (i5 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void t(SolverVariable solverVariable, float f3, boolean z2) {
        float f4 = ty;
        if (f3 <= (-f4) || f3 >= f4) {
            int iCk = ck(solverVariable);
            if (iCk == -1) {
                KN(solverVariable, f3);
                return;
            }
            float[] fArr = this.Uo;
            float f5 = fArr[iCk] + f3;
            fArr[iCk] = f5;
            float f6 = ty;
            if (f5 <= (-f6) || f5 >= f6) {
                return;
            }
            fArr[iCk] = 0.0f;
            O(solverVariable, z2);
        }
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i2 = this.mUb;
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable solverVariableRl = rl(i3);
            if (solverVariableRl != null) {
                String str2 = str + solverVariableRl + " = " + xMQ(i3) + " ";
                int iCk = ck(solverVariableRl);
                String str3 = str2 + "[p: ";
                String str4 = (this.KN[iCk] != -1 ? str3 + this.az.nr[this.J2[this.KN[iCk]]] : str3 + "none") + ", n: ";
                str = (this.xMQ[iCk] != -1 ? str4 + this.az.nr[this.J2[this.xMQ[iCk]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float xMQ(int i2) {
        int i3 = this.mUb;
        int i5 = this.gh;
        for (int i7 = 0; i7 < i3; i7++) {
            if (i7 == i2) {
                return this.Uo[i5];
            }
            i5 = this.xMQ[i5];
            if (i5 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.qie = arrayRow;
        this.az = cache;
        clear();
    }

    private void Ik(int i2, SolverVariable solverVariable, float f3) {
        int iTy = ty();
        az(iTy, solverVariable, f3);
        if (i2 != -1) {
            this.KN[iTy] = i2;
            int[] iArr = this.xMQ;
            iArr[iTy] = iArr[i2];
            iArr[i2] = iTy;
        } else {
            this.KN[iTy] = -1;
            if (this.mUb > 0) {
                this.xMQ[iTy] = this.gh;
                this.gh = iTy;
            } else {
                this.xMQ[iTy] = -1;
            }
        }
        int i3 = this.xMQ[iTy];
        if (i3 != -1) {
            this.KN[i3] = iTy;
        }
        qie(solverVariable, iTy);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float O(SolverVariable solverVariable, boolean z2) {
        int iCk = ck(solverVariable);
        if (iCk == -1) {
            return 0.0f;
        }
        r(solverVariable);
        float f3 = this.Uo[iCk];
        if (this.gh == iCk) {
            this.gh = this.xMQ[iCk];
        }
        this.J2[iCk] = -1;
        int[] iArr = this.KN;
        int i2 = iArr[iCk];
        if (i2 != -1) {
            int[] iArr2 = this.xMQ;
            iArr2[i2] = iArr2[iCk];
        }
        int i3 = this.xMQ[iCk];
        if (i3 != -1) {
            iArr[i3] = iArr[iCk];
        }
        this.mUb--;
        solverVariable.f35005T--;
        if (z2) {
            solverVariable.nr(this.qie);
        }
        return f3;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float mUb(SolverVariable solverVariable) {
        int iCk = ck(solverVariable);
        if (iCk != -1) {
            return this.Uo[iCk];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean n(SolverVariable solverVariable) {
        if (ck(solverVariable) != -1) {
            return true;
        }
        return false;
    }
}
