package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Barrier extends HelperWidget {
    private int mI = 0;
    private boolean T3L = true;
    private int Bu = 0;
    boolean p0N = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean KN() {
        return true;
    }

    protected void XNZ() {
        for (int i2 = 0; i2 < this.VwL; i2++) {
            ConstraintWidget constraintWidget = this.tFV[i2];
            if (this.T3L || constraintWidget.KN()) {
                int i3 = this.mI;
                if (i3 == 0 || i3 == 1) {
                    constraintWidget.Bu(0, true);
                } else if (i3 == 2 || i3 == 3) {
                    constraintWidget.Bu(1, true);
                }
            }
        }
    }

    public boolean jO() {
        int i2;
        int i3;
        int i5;
        boolean z2 = true;
        int i7 = 0;
        while (true) {
            i2 = this.VwL;
            if (i7 >= i2) {
                break;
            }
            ConstraintWidget constraintWidget = this.tFV[i7];
            if ((this.T3L || constraintWidget.KN()) && ((((i3 = this.mI) == 0 || i3 == 1) && !constraintWidget.C()) || (((i5 = this.mI) == 2 || i5 == 3) && !constraintWidget.Mx()))) {
                z2 = false;
            }
            i7++;
        }
        if (!z2 || i2 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z3 = false;
        for (int i8 = 0; i8 < this.VwL; i8++) {
            ConstraintWidget constraintWidget2 = this.tFV[i8];
            if (this.T3L || constraintWidget2.KN()) {
                if (!z3) {
                    int i9 = this.mI;
                    if (i9 == 0) {
                        iMax = constraintWidget2.Ik(ConstraintAnchor.Type.LEFT).O();
                    } else if (i9 == 1) {
                        iMax = constraintWidget2.Ik(ConstraintAnchor.Type.RIGHT).O();
                    } else if (i9 == 2) {
                        iMax = constraintWidget2.Ik(ConstraintAnchor.Type.TOP).O();
                    } else if (i9 == 3) {
                        iMax = constraintWidget2.Ik(ConstraintAnchor.Type.BOTTOM).O();
                    }
                    z3 = true;
                }
                int i10 = this.mI;
                if (i10 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.Ik(ConstraintAnchor.Type.LEFT).O());
                } else if (i10 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.Ik(ConstraintAnchor.Type.RIGHT).O());
                } else if (i10 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.Ik(ConstraintAnchor.Type.TOP).O());
                } else if (i10 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.Ik(ConstraintAnchor.Type.BOTTOM).O());
                }
            }
        }
        int i11 = iMax + this.Bu;
        int i12 = this.mI;
        if (i12 == 0 || i12 == 1) {
            tUK(i11, i11);
        } else {
            kSg(i11, i11);
        }
        this.p0N = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean C() {
        return this.p0N;
    }

    public void D76(int i2) {
        this.Bu = i2;
    }

    public void I9f(int i2) {
        this.mI = i2;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean Mx() {
        return this.p0N;
    }

    public int Th() {
        return this.Bu;
    }

    public boolean Toy() {
        return this.T3L;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Uo(LinearSystem linearSystem, boolean z2) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z3;
        int i2;
        int i3;
        int i5;
        ConstraintAnchor[] constraintAnchorArr2 = this.f35506FX;
        constraintAnchorArr2[0] = this.jB;
        constraintAnchorArr2[2] = this.f35517U;
        constraintAnchorArr2[1] = this.P5;
        constraintAnchorArr2[3] = this.M7;
        int i7 = 0;
        while (true) {
            constraintAnchorArr = this.f35506FX;
            if (i7 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i7];
            constraintAnchor.xMQ = linearSystem.Ik(constraintAnchor);
            i7++;
        }
        int i8 = this.mI;
        if (i8 < 0 || i8 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i8];
        if (!this.p0N) {
            jO();
        }
        if (this.p0N) {
            this.p0N = false;
            int i9 = this.mI;
            if (i9 == 0 || i9 == 1) {
                linearSystem.J2(this.jB.xMQ, this.f35526k);
                linearSystem.J2(this.P5.xMQ, this.f35526k);
                return;
            } else {
                if (i9 == 2 || i9 == 3) {
                    linearSystem.J2(this.f35517U.xMQ, this.dR0);
                    linearSystem.J2(this.M7.xMQ, this.dR0);
                    return;
                }
                return;
            }
        }
        for (int i10 = 0; i10 < this.VwL; i10++) {
            ConstraintWidget constraintWidget = this.tFV[i10];
            if ((this.T3L || constraintWidget.KN()) && ((((i3 = this.mI) == 0 || i3 == 1) && constraintWidget.iF() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.jB.J2 != null && constraintWidget.P5.J2 != null) || (((i5 = this.mI) == 2 || i5 == 3) && constraintWidget.M() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f35517U.J2 != null && constraintWidget.M7.J2 != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = this.jB.qie() || this.P5.qie();
        boolean z5 = this.f35517U.qie() || this.M7.qie();
        int i11 = !(!z3 && (((i2 = this.mI) == 0 && z4) || ((i2 == 2 && z5) || ((i2 == 1 && z4) || (i2 == 3 && z5))))) ? 4 : 5;
        for (int i12 = 0; i12 < this.VwL; i12++) {
            ConstraintWidget constraintWidget2 = this.tFV[i12];
            if (this.T3L || constraintWidget2.KN()) {
                SolverVariable solverVariableIk = linearSystem.Ik(constraintWidget2.f35506FX[this.mI]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f35506FX;
                int i13 = this.mI;
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i13];
                constraintAnchor3.xMQ = solverVariableIk;
                ConstraintAnchor constraintAnchor4 = constraintAnchor3.J2;
                int i14 = (constraintAnchor4 == null || constraintAnchor4.nr != this) ? 0 : constraintAnchor3.Uo;
                if (i13 == 0 || i13 == 2) {
                    linearSystem.xMQ(constraintAnchor2.xMQ, solverVariableIk, this.Bu - i14, z3);
                } else {
                    linearSystem.Uo(constraintAnchor2.xMQ, solverVariableIk, this.Bu + i14, z3);
                }
                linearSystem.O(constraintAnchor2.xMQ, solverVariableIk, this.Bu + i14, i11);
            }
        }
        int i15 = this.mI;
        if (i15 == 0) {
            linearSystem.O(this.P5.xMQ, this.jB.xMQ, 0, 8);
            linearSystem.O(this.jB.xMQ, this.f35522a.P5.xMQ, 0, 4);
            linearSystem.O(this.jB.xMQ, this.f35522a.jB.xMQ, 0, 0);
            return;
        }
        if (i15 == 1) {
            linearSystem.O(this.jB.xMQ, this.P5.xMQ, 0, 8);
            linearSystem.O(this.jB.xMQ, this.f35522a.jB.xMQ, 0, 4);
            linearSystem.O(this.jB.xMQ, this.f35522a.P5.xMQ, 0, 0);
        } else if (i15 == 2) {
            linearSystem.O(this.M7.xMQ, this.f35517U.xMQ, 0, 8);
            linearSystem.O(this.f35517U.xMQ, this.f35522a.M7.xMQ, 0, 4);
            linearSystem.O(this.f35517U.xMQ, this.f35522a.f35517U.xMQ, 0, 0);
        } else if (i15 == 3) {
            linearSystem.O(this.f35517U.xMQ, this.M7.xMQ, 0, 8);
            linearSystem.O(this.f35517U.xMQ, this.f35522a.f35517U.xMQ, 0, 4);
            linearSystem.O(this.f35517U.xMQ, this.f35522a.M7.xMQ, 0, 0);
        }
    }

    public void lNy(boolean z2) {
        this.T3L = z2;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + S() + " {";
        for (int i2 = 0; i2 < this.VwL; i2++) {
            ConstraintWidget constraintWidget = this.tFV[i2];
            if (i2 > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.S();
        }
        return str + "}";
    }

    public int wKp() {
        return this.mI;
    }

    public int xzo() {
        int i2 = this.mI;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void ty(ConstraintWidget constraintWidget, HashMap map) {
        super.ty(constraintWidget, map);
        Barrier barrier = (Barrier) constraintWidget;
        this.mI = barrier.mI;
        this.T3L = barrier.T3L;
        this.Bu = barrier.Bu;
    }
}
