package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class PriorityGoalRow extends ArrayRow {
    private SolverVariable[] KN;
    private int Uo;
    GoalVariableAccessor gh;
    private int mUb;
    Cache qie;
    private SolverVariable[] xMQ;

    class GoalVariableAccessor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        SolverVariable f34999n;
        PriorityGoalRow rl;

        GoalVariableAccessor(PriorityGoalRow priorityGoalRow) {
            this.rl = priorityGoalRow;
        }

        public void O() {
            Arrays.fill(this.f34999n.f35009g, 0.0f);
        }

        public boolean n(SolverVariable solverVariable, float f3) {
            boolean z2 = true;
            if (!this.f34999n.f35010n) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float f4 = solverVariable.f35009g[i2];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f3;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        this.f34999n.f35009g[i2] = f5;
                    } else {
                        this.f34999n.f35009g[i2] = 0.0f;
                    }
                }
                return true;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float[] fArr = this.f34999n.f35009g;
                float f6 = fArr[i3] + (solverVariable.f35009g[i3] * f3);
                fArr[i3] = f6;
                if (Math.abs(f6) < 1.0E-4f) {
                    this.f34999n.f35009g[i3] = 0.0f;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                PriorityGoalRow.this.X(this.f34999n);
            }
            return false;
        }

        public final boolean nr(SolverVariable solverVariable) {
            int i2 = 8;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                float f3 = solverVariable.f35009g[i2];
                float f4 = this.f34999n.f35009g[i2];
                if (f4 == f3) {
                    i2--;
                } else if (f4 < f3) {
                    return true;
                }
            }
            return false;
        }

        public void rl(SolverVariable solverVariable) {
            this.f34999n = solverVariable;
        }

        public final boolean t() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f3 = this.f34999n.f35009g[i2];
                if (f3 > 0.0f) {
                    return false;
                }
                if (f3 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            String str = "[ ";
            if (this.f34999n != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    str = str + this.f34999n.f35009g[i2] + " ";
                }
            }
            return str + "] " + this.f34999n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(SolverVariable solverVariable) {
        int i2 = 0;
        while (i2 < this.mUb) {
            if (this.KN[i2] == solverVariable) {
                while (true) {
                    int i3 = this.mUb;
                    if (i2 >= i3 - 1) {
                        this.mUb = i3 - 1;
                        solverVariable.f35010n = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.KN;
                        int i5 = i2 + 1;
                        solverVariableArr[i2] = solverVariableArr[i5];
                        i2 = i5;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.mUb = 0;
        this.rl = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SolverVariable rl(LinearSystem linearSystem, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.mUb; i3++) {
            SolverVariable solverVariable = this.KN[i3];
            if (!zArr[solverVariable.f35003O]) {
                this.gh.rl(solverVariable);
                if (i2 == -1) {
                    if (this.gh.t()) {
                        i2 = i3;
                    }
                } else if (this.gh.nr(this.KN[i2])) {
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.KN[i2];
    }

    private void e(SolverVariable solverVariable) {
        int i2;
        int i3 = this.mUb + 1;
        SolverVariable[] solverVariableArr = this.KN;
        if (i3 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.KN = solverVariableArr2;
            this.xMQ = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.KN;
        int i5 = this.mUb;
        solverVariableArr3[i5] = solverVariable;
        int i7 = i5 + 1;
        this.mUb = i7;
        if (i7 > 1 && solverVariableArr3[i5].f35003O > solverVariable.f35003O) {
            int i8 = 0;
            while (true) {
                i2 = this.mUb;
                if (i8 >= i2) {
                    break;
                }
                this.xMQ[i8] = this.KN[i8];
                i8++;
            }
            Arrays.sort(this.xMQ, 0, i2, new Comparator<SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public int compare(SolverVariable solverVariable2, SolverVariable solverVariable3) {
                    return solverVariable2.f35003O - solverVariable3.f35003O;
                }
            });
            for (int i9 = 0; i9 < this.mUb; i9++) {
                this.KN[i9] = this.xMQ[i9];
            }
        }
        solverVariable.f35010n = true;
        solverVariable.n(this);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.mUb == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void t(SolverVariable solverVariable) {
        this.gh.rl(solverVariable);
        this.gh.O();
        solverVariable.f35009g[solverVariable.f35012r] = 1.0f;
        e(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public void te(LinearSystem linearSystem, ArrayRow arrayRow, boolean z2) {
        SolverVariable solverVariable = arrayRow.f34972n;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.f34971O;
        int iJ2 = arrayRowVariables.J2();
        for (int i2 = 0; i2 < iJ2; i2++) {
            SolverVariable solverVariableRl = arrayRowVariables.rl(i2);
            float fXMQ = arrayRowVariables.xMQ(i2);
            this.gh.rl(solverVariableRl);
            if (this.gh.n(solverVariable, fXMQ)) {
                e(solverVariableRl);
            }
            this.rl += arrayRow.rl * fXMQ;
        }
        X(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        String str = " goal -> (" + this.rl + ") : ";
        for (int i2 = 0; i2 < this.mUb; i2++) {
            this.gh.rl(this.KN[i2]);
            str = str + this.gh + " ";
        }
        return str;
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.Uo = 128;
        this.KN = new SolverVariable[128];
        this.xMQ = new SolverVariable[128];
        this.mUb = 0;
        this.gh = new GoalVariableAccessor(this);
        this.qie = cache;
    }
}
