package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Guideline extends ConstraintWidget {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35548f;
    protected float tFV = -1.0f;
    protected int VwL = -1;
    protected int mI = -1;
    protected boolean T3L = true;
    private ConstraintAnchor Bu = this.f35517U;
    private int p0N = 0;
    private int Uf = 0;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean KN() {
        return true;
    }

    public void XNZ(int i2) {
        if (i2 > -1) {
            this.tFV = -1.0f;
            this.VwL = -1;
            this.mI = i2;
        }
    }

    public void xzo(int i2) {
        if (i2 > -1) {
            this.tFV = -1.0f;
            this.VwL = i2;
            this.mI = -1;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.Guideline$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f35549n;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f35549n = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35549n[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35549n[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35549n[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35549n[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35549n[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35549n[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35549n[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35549n[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean C() {
        return this.f35548f;
    }

    public void I9f(int i2) {
        if (this.p0N == i2) {
            return;
        }
        this.p0N = i2;
        this.f35501B.clear();
        if (this.p0N == 1) {
            this.Bu = this.jB;
        } else {
            this.Bu = this.f35517U;
        }
        this.f35501B.add(this.Bu);
        int length = this.f35506FX.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f35506FX[i3] = this.Bu;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor Ik(ConstraintAnchor.Type type) {
        int i2 = AnonymousClass1.f35549n[type.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (this.p0N == 1) {
                return this.Bu;
            }
            return null;
        }
        if ((i2 == 3 || i2 == 4) && this.p0N == 0) {
            return this.Bu;
        }
        return null;
    }

    public int Mh() {
        return this.p0N;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean Mx() {
        return this.f35548f;
    }

    public void Th(int i2) {
        this.Bu.Z(i2);
        this.f35548f = true;
    }

    public int Toy() {
        return this.mI;
    }

    public ConstraintAnchor g6() {
        return this.Bu;
    }

    public int jO() {
        return this.VwL;
    }

    public void lNy(float f3) {
        if (f3 > -1.0f) {
            this.tFV = f3;
            this.VwL = -1;
            this.mI = -1;
        }
    }

    public float wKp() {
        return this.tFV;
    }

    public Guideline() {
        this.f35501B.clear();
        this.f35501B.add(this.Bu);
        int length = this.f35506FX.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f35506FX[i2] = this.Bu;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Lp6(LinearSystem linearSystem, boolean z2) {
        if (rV9() == null) {
            return;
        }
        int iG = linearSystem.g(this.Bu);
        if (this.p0N == 1) {
            o9(iG);
            n7b(0);
            a63(rV9().nY());
            vl(0);
            return;
        }
        o9(0);
        n7b(iG);
        vl(rV9().J());
        a63(0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Uo(LinearSystem linearSystem, boolean z2) {
        boolean z3;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) rV9();
        if (constraintWidgetContainer != null) {
            ConstraintAnchor constraintAnchorIk = constraintWidgetContainer.Ik(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor constraintAnchorIk2 = constraintWidgetContainer.Ik(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.f35522a;
            boolean z4 = true;
            if (constraintWidget != null && constraintWidget.f35503D[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.p0N == 0) {
                constraintAnchorIk = constraintWidgetContainer.Ik(ConstraintAnchor.Type.TOP);
                constraintAnchorIk2 = constraintWidgetContainer.Ik(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.f35522a;
                if (constraintWidget2 == null || constraintWidget2.f35503D[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z4 = false;
                }
                z3 = z4;
            }
            if (this.f35548f && this.Bu.ty()) {
                SolverVariable solverVariableIk = linearSystem.Ik(this.Bu);
                linearSystem.J2(solverVariableIk, this.Bu.O());
                if (this.VwL != -1) {
                    if (z3) {
                        linearSystem.KN(linearSystem.Ik(constraintAnchorIk2), solverVariableIk, 0, 5);
                    }
                } else if (this.mI != -1 && z3) {
                    SolverVariable solverVariableIk2 = linearSystem.Ik(constraintAnchorIk2);
                    linearSystem.KN(solverVariableIk, linearSystem.Ik(constraintAnchorIk), 0, 5);
                    linearSystem.KN(solverVariableIk2, solverVariableIk, 0, 5);
                }
                this.f35548f = false;
                return;
            }
            if (this.VwL != -1) {
                SolverVariable solverVariableIk3 = linearSystem.Ik(this.Bu);
                linearSystem.O(solverVariableIk3, linearSystem.Ik(constraintAnchorIk), this.VwL, 8);
                if (z3) {
                    linearSystem.KN(linearSystem.Ik(constraintAnchorIk2), solverVariableIk3, 0, 5);
                    return;
                }
                return;
            }
            if (this.mI != -1) {
                SolverVariable solverVariableIk4 = linearSystem.Ik(this.Bu);
                SolverVariable solverVariableIk5 = linearSystem.Ik(constraintAnchorIk2);
                linearSystem.O(solverVariableIk4, solverVariableIk5, -this.mI, 8);
                if (z3) {
                    linearSystem.KN(solverVariableIk4, linearSystem.Ik(constraintAnchorIk), 0, 5);
                    linearSystem.KN(solverVariableIk5, solverVariableIk4, 0, 5);
                    return;
                }
                return;
            }
            if (this.tFV != -1.0f) {
                linearSystem.nr(LinearSystem.o(linearSystem, linearSystem.Ik(this.Bu), linearSystem.Ik(constraintAnchorIk2), this.tFV));
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void ty(ConstraintWidget constraintWidget, HashMap map) {
        super.ty(constraintWidget, map);
        Guideline guideline = (Guideline) constraintWidget;
        this.tFV = guideline.tFV;
        this.VwL = guideline.VwL;
        this.mI = guideline.mI;
        this.T3L = guideline.T3L;
        I9f(guideline.p0N);
    }
}
