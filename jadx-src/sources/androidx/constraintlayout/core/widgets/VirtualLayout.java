package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class VirtualLayout extends HelperWidget {
    private int mI = 0;
    private int T3L = 0;
    private int Bu = 0;
    private int p0N = 0;
    private int Uf = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35551f = 0;
    private int ub = 0;
    private int Qu = 0;
    private boolean HBN = false;
    private int UF = 0;
    private int X4T = 0;
    protected BasicMeasure.Measure Zmq = new BasicMeasure.Measure();
    BasicMeasure.Measurer JVN = null;

    public void NP(int i2, int i3, int i5, int i7) {
    }

    public void Toy() {
        for (int i2 = 0; i2 < this.VwL; i2++) {
            ConstraintWidget constraintWidget = this.tFV[i2];
            if (constraintWidget != null) {
                constraintWidget.Uf(true);
            }
        }
    }

    public boolean wKp(HashSet hashSet) {
        for (int i2 = 0; i2 < this.VwL; i2++) {
            if (hashSet.contains(this.tFV[i2])) {
                return true;
            }
        }
        return false;
    }

    public int D76() {
        return this.mI;
    }

    public void EN(int i2) {
        this.p0N = i2;
        this.Qu = i2;
    }

    public void Fp(int i2) {
        this.T3L = i2;
    }

    public boolean H() {
        return this.HBN;
    }

    public int I9f() {
        return this.Qu;
    }

    public void LPV(int i2, int i3) {
        this.UF = i2;
        this.X4T = i3;
    }

    protected void QgZ(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        while (this.JVN == null && rV9() != null) {
            this.JVN = ((ConstraintWidgetContainer) rV9()).Ro();
        }
        BasicMeasure.Measure measure = this.Zmq;
        measure.f35555n = dimensionBehaviour;
        measure.rl = dimensionBehaviour2;
        measure.f35556t = i2;
        measure.nr = i3;
        this.JVN.rl(constraintWidget, measure);
        constraintWidget.vl(this.Zmq.f35554O);
        constraintWidget.a63(this.Zmq.J2);
        constraintWidget.RQ(this.Zmq.KN);
        constraintWidget.hRu(this.Zmq.Uo);
    }

    public void Ro(int i2) {
        this.f35551f = i2;
    }

    public void SR(int i2) {
        this.Bu = i2;
        this.ub = i2;
    }

    public int Th() {
        return this.X4T;
    }

    public int XNZ() {
        return this.T3L;
    }

    protected boolean j() {
        ConstraintWidget constraintWidget = this.f35522a;
        BasicMeasure.Measurer measurerRo = constraintWidget != null ? ((ConstraintWidgetContainer) constraintWidget).Ro() : null;
        if (measurerRo == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.VwL; i2++) {
            ConstraintWidget constraintWidget2 = this.tFV[i2];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof Guideline)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU = constraintWidget2.WPU(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU2 = constraintWidget2.WPU(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourWPU != dimensionBehaviour || constraintWidget2.WPU == 1 || dimensionBehaviourWPU2 != dimensionBehaviour || constraintWidget2.aYN == 1) {
                    if (dimensionBehaviourWPU == dimensionBehaviour) {
                        dimensionBehaviourWPU = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviourWPU2 == dimensionBehaviour) {
                        dimensionBehaviourWPU2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    BasicMeasure.Measure measure = this.Zmq;
                    measure.f35555n = dimensionBehaviourWPU;
                    measure.rl = dimensionBehaviourWPU2;
                    measure.f35556t = constraintWidget2.J();
                    this.Zmq.nr = constraintWidget2.nY();
                    measurerRo.rl(constraintWidget2, this.Zmq);
                    constraintWidget2.vl(this.Zmq.f35554O);
                    constraintWidget2.a63(this.Zmq.J2);
                    constraintWidget2.hRu(this.Zmq.Uo);
                }
            }
        }
        return true;
    }

    public void jO(boolean z2) {
        int i2 = this.Uf;
        if (i2 > 0 || this.f35551f > 0) {
            if (z2) {
                this.ub = this.f35551f;
                this.Qu = i2;
            } else {
                this.ub = i2;
                this.Qu = this.f35551f;
            }
        }
    }

    public int lNy() {
        return this.ub;
    }

    public void pS(int i2) {
        this.Uf = i2;
        this.ub = i2;
        this.Qu = i2;
    }

    public void rxp(int i2) {
        this.Bu = i2;
        this.mI = i2;
        this.p0N = i2;
        this.T3L = i2;
        this.Uf = i2;
        this.f35551f = i2;
    }

    public void tEO(int i2) {
        this.mI = i2;
    }

    protected void waP(boolean z2) {
        this.HBN = z2;
    }

    public int xzo() {
        return this.UF;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    public void t(ConstraintWidgetContainer constraintWidgetContainer) {
        Toy();
    }
}
