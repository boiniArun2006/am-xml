package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Optimizer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static boolean[] f35550n = new boolean[3];

    static void n(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        constraintWidget.f35521Z = -1;
        constraintWidget.XQ = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidgetContainer.f35503D[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f35503D[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i2 = constraintWidget.jB.Uo;
            int iJ = constraintWidgetContainer.J() - constraintWidget.P5.Uo;
            ConstraintAnchor constraintAnchor = constraintWidget.jB;
            constraintAnchor.xMQ = linearSystem.Ik(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.P5;
            constraintAnchor2.xMQ = linearSystem.Ik(constraintAnchor2);
            linearSystem.J2(constraintWidget.jB.xMQ, i2);
            linearSystem.J2(constraintWidget.P5.xMQ, iJ);
            constraintWidget.f35521Z = 2;
            constraintWidget.tFV(i2, iJ);
        }
        if (constraintWidgetContainer.f35503D[1] == dimensionBehaviour2 || constraintWidget.f35503D[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i3 = constraintWidget.f35517U.Uo;
        int iNY = constraintWidgetContainer.nY() - constraintWidget.M7.Uo;
        ConstraintAnchor constraintAnchor3 = constraintWidget.f35517U;
        constraintAnchor3.xMQ = linearSystem.Ik(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.M7;
        constraintAnchor4.xMQ = linearSystem.Ik(constraintAnchor4);
        linearSystem.J2(constraintWidget.f35517U.xMQ, i3);
        linearSystem.J2(constraintWidget.M7.xMQ, iNY);
        if (constraintWidget.eTf > 0 || constraintWidget.B() == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.p5;
            constraintAnchor5.xMQ = linearSystem.Ik(constraintAnchor5);
            linearSystem.J2(constraintWidget.p5.xMQ, constraintWidget.eTf + i3);
        }
        constraintWidget.XQ = 2;
        constraintWidget.uG(i3, iNY);
    }

    public static final boolean rl(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
