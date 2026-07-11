package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class ArrayRow implements LinearSystem.Row {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayRowVariables f34971O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    SolverVariable f34972n = null;
    float rl = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f34973t = false;
    ArrayList nr = new ArrayList();
    boolean J2 = false;

    public interface ArrayRowVariables {
        int J2();

        void KN(SolverVariable solverVariable, float f3);

        float O(SolverVariable solverVariable, boolean z2);

        float Uo(ArrayRow arrayRow, boolean z2);

        void clear();

        void gh(float f3);

        float mUb(SolverVariable solverVariable);

        boolean n(SolverVariable solverVariable);

        void nr();

        SolverVariable rl(int i2);

        void t(SolverVariable solverVariable, float f3, boolean z2);

        float xMQ(int i2);
    }

    public ArrayRow() {
    }

    public ArrayRow HI(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.rl = i2;
        }
        if (z2) {
            this.f34971O.KN(solverVariable, 1.0f);
            this.f34971O.KN(solverVariable2, -1.0f);
            this.f34971O.KN(solverVariable3, -1.0f);
            return this;
        }
        this.f34971O.KN(solverVariable, -1.0f);
        this.f34971O.KN(solverVariable2, 1.0f);
        this.f34971O.KN(solverVariable3, 1.0f);
        return this;
    }

    public SolverVariable S(SolverVariable solverVariable) {
        return WPU(null, solverVariable);
    }

    public void ViF() {
        this.f34972n = null;
        this.f34971O.clear();
        this.rl = 0.0f;
        this.J2 = false;
    }

    public ArrayRow ck(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.rl = i2;
        }
        if (z2) {
            this.f34971O.KN(solverVariable, 1.0f);
            this.f34971O.KN(solverVariable2, -1.0f);
            this.f34971O.KN(solverVariable3, 1.0f);
            return this;
        }
        this.f34971O.KN(solverVariable, -1.0f);
        this.f34971O.KN(solverVariable2, 1.0f);
        this.f34971O.KN(solverVariable3, -1.0f);
        return this;
    }

    public ArrayRow qie(float f3, float f4, float f5, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.rl = 0.0f;
        if (f4 == 0.0f || f3 == f5) {
            this.f34971O.KN(solverVariable, 1.0f);
            this.f34971O.KN(solverVariable2, -1.0f);
            this.f34971O.KN(solverVariable4, 1.0f);
            this.f34971O.KN(solverVariable3, -1.0f);
            return this;
        }
        if (f3 == 0.0f) {
            this.f34971O.KN(solverVariable, 1.0f);
            this.f34971O.KN(solverVariable2, -1.0f);
            return this;
        }
        if (f5 == 0.0f) {
            this.f34971O.KN(solverVariable3, 1.0f);
            this.f34971O.KN(solverVariable4, -1.0f);
            return this;
        }
        float f6 = (f3 / f4) / (f5 / f4);
        this.f34971O.KN(solverVariable, 1.0f);
        this.f34971O.KN(solverVariable2, -1.0f);
        this.f34971O.KN(solverVariable4, f6);
        this.f34971O.KN(solverVariable3, -f6);
        return this;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable rl(LinearSystem linearSystem, boolean[] zArr) {
        return WPU(zArr, null);
    }

    public ArrayRow ty(SolverVariable solverVariable, SolverVariable solverVariable2, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.rl = i2;
        }
        if (z2) {
            this.f34971O.KN(solverVariable, 1.0f);
            this.f34971O.KN(solverVariable2, -1.0f);
            return this;
        }
        this.f34971O.KN(solverVariable, -1.0f);
        this.f34971O.KN(solverVariable2, 1.0f);
        return this;
    }

    private SolverVariable WPU(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iJ2 = this.f34971O.J2();
        SolverVariable solverVariable2 = null;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < iJ2; i2++) {
            float fXMQ = this.f34971O.xMQ(i2);
            if (fXMQ < 0.0f) {
                SolverVariable solverVariableRl = this.f34971O.rl(i2);
                if ((zArr == null || !zArr[solverVariableRl.f35003O]) && solverVariableRl != solverVariable && (((type = solverVariableRl.E2) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && fXMQ < f3)) {
                    f3 = fXMQ;
                    solverVariable2 = solverVariableRl;
                }
            }
        }
        return solverVariable2;
    }

    private boolean XQ(SolverVariable solverVariable, LinearSystem linearSystem) {
        return solverVariable.f35005T <= 1;
    }

    public ArrayRow Ik(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f3) {
        this.f34971O.KN(solverVariable3, 0.5f);
        this.f34971O.KN(solverVariable4, 0.5f);
        this.f34971O.KN(solverVariable, -0.5f);
        this.f34971O.KN(solverVariable2, -0.5f);
        this.rl = -f3;
        return this;
    }

    ArrayRow KN(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f3, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3) {
        if (solverVariable2 == solverVariable3) {
            this.f34971O.KN(solverVariable, 1.0f);
            this.f34971O.KN(solverVariable4, 1.0f);
            this.f34971O.KN(solverVariable2, -2.0f);
            return this;
        }
        if (f3 == 0.5f) {
            this.f34971O.KN(solverVariable, 1.0f);
            this.f34971O.KN(solverVariable2, -1.0f);
            this.f34971O.KN(solverVariable3, -1.0f);
            this.f34971O.KN(solverVariable4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                this.rl = (-i2) + i3;
                return this;
            }
        } else {
            if (f3 <= 0.0f) {
                this.f34971O.KN(solverVariable, -1.0f);
                this.f34971O.KN(solverVariable2, 1.0f);
                this.rl = i2;
                return this;
            }
            if (f3 >= 1.0f) {
                this.f34971O.KN(solverVariable4, -1.0f);
                this.f34971O.KN(solverVariable3, 1.0f);
                this.rl = -i3;
                return this;
            }
            float f4 = 1.0f - f3;
            this.f34971O.KN(solverVariable, f4 * 1.0f);
            this.f34971O.KN(solverVariable2, f4 * (-1.0f));
            this.f34971O.KN(solverVariable3, (-1.0f) * f3);
            this.f34971O.KN(solverVariable4, 1.0f * f3);
            if (i2 > 0 || i3 > 0) {
                this.rl = ((-i2) * f4) + (i3 * f3);
                return this;
            }
        }
        return this;
    }

    ArrayRow O(SolverVariable solverVariable, int i2) {
        this.f34971O.KN(solverVariable, i2);
        return this;
    }

    SolverVariable Uo(LinearSystem linearSystem) {
        int iJ2 = this.f34971O.J2();
        SolverVariable solverVariable = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        SolverVariable solverVariable2 = null;
        for (int i2 = 0; i2 < iJ2; i2++) {
            float fXMQ = this.f34971O.xMQ(i2);
            SolverVariable solverVariableRl = this.f34971O.rl(i2);
            if (solverVariableRl.E2 == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null || f3 > fXMQ) {
                    boolean zXQ = XQ(solverVariableRl, linearSystem);
                    z2 = zXQ;
                    f3 = fXMQ;
                    solverVariable = solverVariableRl;
                } else if (!z2 && XQ(solverVariableRl, linearSystem)) {
                    f3 = fXMQ;
                    solverVariable = solverVariableRl;
                    z2 = true;
                }
            } else if (solverVariable == null && fXMQ < 0.0f) {
                if (solverVariable2 == null || f4 > fXMQ) {
                    boolean zXQ2 = XQ(solverVariableRl, linearSystem);
                    z3 = zXQ2;
                    f4 = fXMQ;
                    solverVariable2 = solverVariableRl;
                } else if (!z3 && XQ(solverVariableRl, linearSystem)) {
                    f4 = fXMQ;
                    solverVariable2 = solverVariableRl;
                    z3 = true;
                }
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    boolean Z(SolverVariable solverVariable) {
        return this.f34971O.n(solverVariable);
    }

    void aYN(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f34972n;
        if (solverVariable2 != null) {
            this.f34971O.KN(solverVariable2, -1.0f);
            this.f34972n.J2 = -1;
            this.f34972n = null;
        }
        float fO = this.f34971O.O(solverVariable, true) * (-1.0f);
        this.f34972n = solverVariable;
        if (fO == 1.0f) {
            return;
        }
        this.rl /= fO;
        this.f34971O.gh(fO);
    }

    public ArrayRow az(SolverVariable solverVariable, int i2) {
        if (i2 < 0) {
            this.rl = i2 * (-1);
            this.f34971O.KN(solverVariable, 1.0f);
            return this;
        }
        this.rl = i2;
        this.f34971O.KN(solverVariable, -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.f34971O.clear();
        this.f34972n = null;
        this.rl = 0.0f;
    }

    public void fD(LinearSystem linearSystem) {
        if (linearSystem.KN.length == 0) {
            return;
        }
        boolean z2 = false;
        while (!z2) {
            int iJ2 = this.f34971O.J2();
            for (int i2 = 0; i2 < iJ2; i2++) {
                SolverVariable solverVariableRl = this.f34971O.rl(i2);
                if (solverVariableRl.J2 != -1 || solverVariableRl.f35007Z || solverVariableRl.f35002N) {
                    this.nr.add(solverVariableRl);
                }
            }
            int size = this.nr.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    SolverVariable solverVariable = (SolverVariable) this.nr.get(i3);
                    if (solverVariable.f35007Z) {
                        g(linearSystem, solverVariable, true);
                    } else if (solverVariable.f35002N) {
                        iF(linearSystem, solverVariable, true);
                    } else {
                        te(linearSystem, linearSystem.KN[solverVariable.J2], true);
                    }
                }
                this.nr.clear();
            } else {
                z2 = true;
            }
        }
        if (LinearSystem.XQ && this.f34972n != null && this.f34971O.J2() == 0) {
            this.J2 = true;
            linearSystem.rl = true;
        }
    }

    public void g(LinearSystem linearSystem, SolverVariable solverVariable, boolean z2) {
        if (solverVariable == null || !solverVariable.f35007Z) {
            return;
        }
        this.rl += solverVariable.f35011o * this.f34971O.mUb(solverVariable);
        this.f34971O.O(solverVariable, z2);
        if (z2) {
            solverVariable.nr(this);
        }
        if (LinearSystem.XQ && this.f34971O.J2() == 0) {
            this.J2 = true;
            linearSystem.rl = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getKey() {
        return this.f34972n;
    }

    public ArrayRow gh(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f3) {
        this.f34971O.KN(solverVariable, -1.0f);
        this.f34971O.KN(solverVariable2, 1.0f);
        this.f34971O.KN(solverVariable3, f3);
        this.f34971O.KN(solverVariable4, -f3);
        return this;
    }

    public void iF(LinearSystem linearSystem, SolverVariable solverVariable, boolean z2) {
        if (solverVariable == null || !solverVariable.f35002N) {
            return;
        }
        float fMUb = this.f34971O.mUb(solverVariable);
        this.rl += solverVariable.Xw * fMUb;
        this.f34971O.O(solverVariable, z2);
        if (z2) {
            solverVariable.nr(this);
        }
        this.f34971O.t(linearSystem.HI.nr[solverVariable.f35014v], fMUb, z2);
        if (LinearSystem.XQ && this.f34971O.J2() == 0) {
            this.J2 = true;
            linearSystem.rl = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.f34972n == null && this.rl == 0.0f && this.f34971O.J2() == 0;
    }

    ArrayRow mUb(SolverVariable solverVariable, SolverVariable solverVariable2, float f3) {
        this.f34971O.KN(solverVariable, -1.0f);
        this.f34971O.KN(solverVariable2, f3);
        return this;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void n(LinearSystem.Row row) {
        if (row instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) row;
            this.f34972n = null;
            this.f34971O.clear();
            for (int i2 = 0; i2 < arrayRow.f34971O.J2(); i2++) {
                this.f34971O.t(arrayRow.f34971O.rl(i2), arrayRow.f34971O.xMQ(i2), true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String nY() {
        boolean z2;
        String str = (this.f34972n == null ? "0" : "" + this.f34972n) + " = ";
        if (this.rl != 0.0f) {
            str = str + this.rl;
            z2 = true;
        } else {
            z2 = false;
        }
        int iJ2 = this.f34971O.J2();
        for (int i2 = 0; i2 < iJ2; i2++) {
            SolverVariable solverVariableRl = this.f34971O.rl(i2);
            if (solverVariableRl != null) {
                float fXMQ = this.f34971O.xMQ(i2);
                if (fXMQ != 0.0f) {
                    String string = solverVariableRl.toString();
                    if (!z2) {
                        if (fXMQ < 0.0f) {
                            str = str + "- ";
                            fXMQ *= -1.0f;
                        }
                        str = fXMQ == 1.0f ? str + string : str + fXMQ + " " + string;
                        z2 = true;
                    } else if (fXMQ > 0.0f) {
                        str = str + " + ";
                        if (fXMQ == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        str = str + " - ";
                        fXMQ *= -1.0f;
                        if (fXMQ == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        if (z2) {
            return str;
        }
        return str + "0.0";
    }

    public ArrayRow nr(LinearSystem linearSystem, int i2) {
        this.f34971O.KN(linearSystem.HI(i2, "ep"), 1.0f);
        this.f34971O.KN(linearSystem.HI(i2, "em"), -1.0f);
        return this;
    }

    boolean o() {
        SolverVariable solverVariable = this.f34972n;
        if (solverVariable != null) {
            return solverVariable.E2 == SolverVariable.Type.UNRESTRICTED || this.rl >= 0.0f;
        }
        return false;
    }

    void r() {
        float f3 = this.rl;
        if (f3 < 0.0f) {
            this.rl = f3 * (-1.0f);
            this.f34971O.nr();
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void t(SolverVariable solverVariable) {
        int i2 = solverVariable.f35012r;
        float f3 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f3 = 1000.0f;
            } else if (i2 == 3) {
                f3 = 1000000.0f;
            } else if (i2 == 4) {
                f3 = 1.0E9f;
            } else if (i2 == 5) {
                f3 = 1.0E12f;
            }
        }
        this.f34971O.KN(solverVariable, f3);
    }

    public void te(LinearSystem linearSystem, ArrayRow arrayRow, boolean z2) {
        this.rl += arrayRow.rl * this.f34971O.Uo(arrayRow, z2);
        if (z2) {
            arrayRow.f34972n.nr(this);
        }
        if (LinearSystem.XQ && this.f34972n != null && this.f34971O.J2() == 0) {
            this.J2 = true;
            linearSystem.rl = true;
        }
    }

    ArrayRow xMQ(SolverVariable solverVariable, int i2) {
        this.f34972n = solverVariable;
        float f3 = i2;
        solverVariable.f35011o = f3;
        this.rl = f3;
        this.J2 = true;
        return this;
    }

    boolean J2(LinearSystem linearSystem) {
        boolean z2;
        SolverVariable solverVariableUo = Uo(linearSystem);
        if (solverVariableUo == null) {
            z2 = true;
        } else {
            aYN(solverVariableUo);
            z2 = false;
        }
        if (this.f34971O.J2() == 0) {
            this.J2 = true;
        }
        return z2;
    }

    public String toString() {
        return nY();
    }

    public ArrayRow(Cache cache) {
        this.f34971O = new ArrayLinkedVariables(this, cache);
    }
}
