package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Direct {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static BasicMeasure.Measure f35571n = new BasicMeasure.Measure();
    private static int rl = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f35572t = 0;

    private static void rl(int i2, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, boolean z2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        boolean z3;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.piY()) {
            return;
        }
        boolean z4 = true;
        rl++;
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.ofS()) {
            int i3 = i2 + 1;
            if (n(i3, constraintWidget)) {
                ConstraintWidgetContainer.wKY(i3, constraintWidget, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.gh);
            }
        }
        ConstraintAnchor constraintAnchorIk = constraintWidget.Ik(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorIk2 = constraintWidget.Ik(ConstraintAnchor.Type.RIGHT);
        int iO = constraintAnchorIk.O();
        int iO2 = constraintAnchorIk2.O();
        if (constraintAnchorIk.nr() != null && constraintAnchorIk.ty()) {
            for (ConstraintAnchor constraintAnchor5 : constraintAnchorIk.nr()) {
                ConstraintWidget constraintWidget2 = constraintAnchor5.nr;
                int i5 = i2 + 1;
                boolean zN = n(i5, constraintWidget2);
                if (constraintWidget2.ofS() && zN) {
                    z3 = z4;
                    ConstraintWidgetContainer.wKY(i5, constraintWidget2, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.gh);
                } else {
                    z3 = z4;
                }
                boolean z5 = ((constraintAnchor5 == constraintWidget2.jB && (constraintAnchor4 = constraintWidget2.P5.J2) != null && constraintAnchor4.ty()) || (constraintAnchor5 == constraintWidget2.P5 && (constraintAnchor3 = constraintWidget2.jB.J2) != null && constraintAnchor3.ty())) ? z3 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourIF = constraintWidget2.iF();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourIF != dimensionBehaviour || zN) {
                    if (!constraintWidget2.ofS()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.jB;
                        if (constraintAnchor5 == constraintAnchor6 && constraintWidget2.P5.J2 == null) {
                            int iJ2 = constraintAnchor6.J2() + iO;
                            constraintWidget2.tUK(iJ2, constraintWidget2.J() + iJ2);
                            rl(i5, constraintWidget2, measurer, z2);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.P5;
                            if (constraintAnchor5 == constraintAnchor7 && constraintAnchor6.J2 == null) {
                                int iJ22 = iO - constraintAnchor7.J2();
                                constraintWidget2.tUK(iJ22 - constraintWidget2.J(), iJ22);
                                rl(i5, constraintWidget2, measurer, z2);
                            } else if (z5 && !constraintWidget2.m()) {
                                nr(i5, measurer, constraintWidget2, z2);
                            }
                        }
                    }
                } else if (constraintWidget2.iF() == dimensionBehaviour && constraintWidget2.f35524g >= 0 && constraintWidget2.nY >= 0 && ((constraintWidget2.B() == 8 || (constraintWidget2.WPU == 0 && constraintWidget2.aYN() == 0.0f)) && !constraintWidget2.m() && !constraintWidget2.pJg() && z5 && !constraintWidget2.m())) {
                    O(i5, constraintWidget, measurer, constraintWidget2, z2);
                }
                z4 = z3;
            }
        }
        boolean z6 = z4;
        if (constraintWidget instanceof Guideline) {
            return;
        }
        if (constraintAnchorIk2.nr() != null && constraintAnchorIk2.ty()) {
            for (ConstraintAnchor constraintAnchor8 : constraintAnchorIk2.nr()) {
                ConstraintWidget constraintWidget3 = constraintAnchor8.nr;
                int i7 = i2 + 1;
                boolean zN2 = n(i7, constraintWidget3);
                if (constraintWidget3.ofS() && zN2) {
                    ConstraintWidgetContainer.wKY(i7, constraintWidget3, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.gh);
                }
                boolean z7 = ((constraintAnchor8 == constraintWidget3.jB && (constraintAnchor2 = constraintWidget3.P5.J2) != null && constraintAnchor2.ty()) || (constraintAnchor8 == constraintWidget3.P5 && (constraintAnchor = constraintWidget3.jB.J2) != null && constraintAnchor.ty())) ? z6 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourIF2 = constraintWidget3.iF();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourIF2 != dimensionBehaviour2 || zN2) {
                    if (!constraintWidget3.ofS()) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget3.jB;
                        if (constraintAnchor8 == constraintAnchor9 && constraintWidget3.P5.J2 == null) {
                            int iJ23 = constraintAnchor9.J2() + iO2;
                            constraintWidget3.tUK(iJ23, constraintWidget3.J() + iJ23);
                            rl(i7, constraintWidget3, measurer, z2);
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget3.P5;
                            if (constraintAnchor8 == constraintAnchor10 && constraintAnchor9.J2 == null) {
                                int iJ24 = iO2 - constraintAnchor10.J2();
                                constraintWidget3.tUK(iJ24 - constraintWidget3.J(), iJ24);
                                rl(i7, constraintWidget3, measurer, z2);
                            } else if (z7 && !constraintWidget3.m()) {
                                nr(i7, measurer, constraintWidget3, z2);
                            }
                        }
                    }
                } else if (constraintWidget3.iF() == dimensionBehaviour2 && constraintWidget3.f35524g >= 0 && constraintWidget3.nY >= 0 && (constraintWidget3.B() == 8 || (constraintWidget3.WPU == 0 && constraintWidget3.aYN() == 0.0f))) {
                    if (!constraintWidget3.m() && !constraintWidget3.pJg() && z7 && !constraintWidget3.m()) {
                        O(i7, constraintWidget, measurer, constraintWidget3, z2);
                    }
                }
            }
        }
        constraintWidget.fcU();
    }

    private static void xMQ(int i2, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.G7()) {
            return;
        }
        boolean z2 = true;
        f35572t++;
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.ofS()) {
            int i3 = i2 + 1;
            if (n(i3, constraintWidget)) {
                ConstraintWidgetContainer.wKY(i3, constraintWidget, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.gh);
            }
        }
        ConstraintAnchor constraintAnchorIk = constraintWidget.Ik(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorIk2 = constraintWidget.Ik(ConstraintAnchor.Type.BOTTOM);
        int iO = constraintAnchorIk.O();
        int iO2 = constraintAnchorIk2.O();
        if (constraintAnchorIk.nr() != null && constraintAnchorIk.ty()) {
            for (ConstraintAnchor constraintAnchor5 : constraintAnchorIk.nr()) {
                ConstraintWidget constraintWidget2 = constraintAnchor5.nr;
                int i5 = i2 + 1;
                boolean zN = n(i5, constraintWidget2);
                if (constraintWidget2.ofS() && zN) {
                    ConstraintWidgetContainer.wKY(i5, constraintWidget2, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.gh);
                }
                boolean z3 = ((constraintAnchor5 == constraintWidget2.f35517U && (constraintAnchor4 = constraintWidget2.M7.J2) != null && constraintAnchor4.ty()) || (constraintAnchor5 == constraintWidget2.M7 && (constraintAnchor3 = constraintWidget2.f35517U.J2) != null && constraintAnchor3.ty())) ? z2 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourM = constraintWidget2.M();
                boolean z4 = z2;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourM != dimensionBehaviour || zN) {
                    if (!constraintWidget2.ofS()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.f35517U;
                        if (constraintAnchor5 == constraintAnchor6 && constraintWidget2.M7.J2 == null) {
                            int iJ2 = constraintAnchor6.J2() + iO;
                            constraintWidget2.kSg(iJ2, constraintWidget2.nY() + iJ2);
                            xMQ(i5, constraintWidget2, measurer);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.M7;
                            if (constraintAnchor5 == constraintAnchor7 && constraintAnchor6.J2 == null) {
                                int iJ22 = iO - constraintAnchor7.J2();
                                constraintWidget2.kSg(iJ22 - constraintWidget2.nY(), iJ22);
                                xMQ(i5, constraintWidget2, measurer);
                            } else if (z3 && !constraintWidget2.xg()) {
                                J2(i5, measurer, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.M() == dimensionBehaviour && constraintWidget2.fD >= 0 && constraintWidget2.iF >= 0 && ((constraintWidget2.B() == 8 || (constraintWidget2.aYN == 0 && constraintWidget2.aYN() == 0.0f)) && !constraintWidget2.xg() && !constraintWidget2.pJg() && z3 && !constraintWidget2.xg())) {
                    Uo(i5, constraintWidget, measurer, constraintWidget2);
                }
                z2 = z4;
            }
        }
        boolean z5 = z2;
        if (constraintWidget instanceof Guideline) {
            return;
        }
        if (constraintAnchorIk2.nr() != null && constraintAnchorIk2.ty()) {
            for (ConstraintAnchor constraintAnchor8 : constraintAnchorIk2.nr()) {
                ConstraintWidget constraintWidget3 = constraintAnchor8.nr;
                int i7 = i2 + 1;
                boolean zN2 = n(i7, constraintWidget3);
                if (constraintWidget3.ofS() && zN2) {
                    ConstraintWidgetContainer.wKY(i7, constraintWidget3, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.gh);
                }
                boolean z6 = ((constraintAnchor8 == constraintWidget3.f35517U && (constraintAnchor2 = constraintWidget3.M7.J2) != null && constraintAnchor2.ty()) || (constraintAnchor8 == constraintWidget3.M7 && (constraintAnchor = constraintWidget3.f35517U.J2) != null && constraintAnchor.ty())) ? z5 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourM2 = constraintWidget3.M();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourM2 != dimensionBehaviour2 || zN2) {
                    if (!constraintWidget3.ofS()) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget3.f35517U;
                        if (constraintAnchor8 == constraintAnchor9 && constraintWidget3.M7.J2 == null) {
                            int iJ23 = constraintAnchor9.J2() + iO2;
                            constraintWidget3.kSg(iJ23, constraintWidget3.nY() + iJ23);
                            xMQ(i7, constraintWidget3, measurer);
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget3.M7;
                            if (constraintAnchor8 == constraintAnchor10 && constraintAnchor9.J2 == null) {
                                int iJ24 = iO2 - constraintAnchor10.J2();
                                constraintWidget3.kSg(iJ24 - constraintWidget3.nY(), iJ24);
                                xMQ(i7, constraintWidget3, measurer);
                            } else if (z6 && !constraintWidget3.xg()) {
                                J2(i7, measurer, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.M() == dimensionBehaviour2 && constraintWidget3.fD >= 0 && constraintWidget3.iF >= 0 && (constraintWidget3.B() == 8 || (constraintWidget3.aYN == 0 && constraintWidget3.aYN() == 0.0f))) {
                    if (!constraintWidget3.xg() && !constraintWidget3.pJg() && z6 && !constraintWidget3.xg()) {
                        Uo(i7, constraintWidget, measurer, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorIk3 = constraintWidget.Ik(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorIk3.nr() != null && constraintAnchorIk3.ty()) {
            int iO3 = constraintAnchorIk3.O();
            for (ConstraintAnchor constraintAnchor11 : constraintAnchorIk3.nr()) {
                ConstraintWidget constraintWidget4 = constraintAnchor11.nr;
                int i8 = i2 + 1;
                boolean zN3 = n(i8, constraintWidget4);
                if (constraintWidget4.ofS() && zN3) {
                    ConstraintWidgetContainer.wKY(i8, constraintWidget4, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.gh);
                }
                if (constraintWidget4.M() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || zN3) {
                    if (!constraintWidget4.ofS() && constraintAnchor11 == constraintWidget4.p5) {
                        constraintWidget4.How(constraintAnchor11.J2() + iO3);
                        xMQ(i8, constraintWidget4, measurer);
                    }
                }
            }
        }
        constraintWidget.eWT();
    }

    private static void J2(int i2, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget) {
        float f3;
        float fEF = constraintWidget.eF();
        int iO = constraintWidget.f35517U.J2.O();
        int iO2 = constraintWidget.M7.J2.O();
        int iJ2 = constraintWidget.f35517U.J2() + iO;
        int iJ22 = iO2 - constraintWidget.M7.J2();
        if (iO == iO2) {
            fEF = 0.5f;
        } else {
            iO = iJ2;
            iO2 = iJ22;
        }
        int iNY = constraintWidget.nY();
        int i3 = (iO2 - iO) - iNY;
        if (iO > iO2) {
            i3 = (iO - iO2) - iNY;
        }
        if (i3 > 0) {
            f3 = (fEF * i3) + 0.5f;
        } else {
            f3 = fEF * i3;
        }
        int i5 = (int) f3;
        int i7 = iO + i5;
        int i8 = i7 + iNY;
        if (iO > iO2) {
            i7 = iO - i5;
            i8 = i7 - iNY;
        }
        constraintWidget.kSg(i7, i8);
        xMQ(i2 + 1, constraintWidget, measurer);
    }

    public static void KN(ConstraintWidgetContainer constraintWidgetContainer, BasicMeasure.Measurer measurer) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviourIF = constraintWidgetContainer.iF();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM = constraintWidgetContainer.M();
        rl = 0;
        f35572t = 0;
        constraintWidgetContainer.qm();
        ArrayList arrayListMh = constraintWidgetContainer.Mh();
        int size = arrayListMh.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) arrayListMh.get(i2)).qm();
        }
        boolean zL2 = constraintWidgetContainer.l();
        if (dimensionBehaviourIF == ConstraintWidget.DimensionBehaviour.FIXED) {
            constraintWidgetContainer.tUK(0, constraintWidgetContainer.J());
        } else {
            constraintWidgetContainer.ER(0);
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayListMh.get(i3);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.Mh() == 1) {
                    if (guideline.jO() != -1) {
                        guideline.Th(guideline.jO());
                    } else if (guideline.Toy() != -1 && constraintWidgetContainer.C()) {
                        guideline.Th(constraintWidgetContainer.J() - guideline.Toy());
                    } else if (constraintWidgetContainer.C()) {
                        guideline.Th((int) ((guideline.wKp() * constraintWidgetContainer.J()) + 0.5f));
                    }
                    z2 = true;
                }
            } else if ((constraintWidget instanceof Barrier) && ((Barrier) constraintWidget).xzo() == 0) {
                z3 = true;
            }
        }
        if (z2) {
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) arrayListMh.get(i5);
                if (constraintWidget2 instanceof Guideline) {
                    Guideline guideline2 = (Guideline) constraintWidget2;
                    if (guideline2.Mh() == 1) {
                        rl(0, guideline2, measurer, zL2);
                    }
                }
            }
        }
        rl(0, constraintWidgetContainer, measurer, zL2);
        if (z3) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget3 = (ConstraintWidget) arrayListMh.get(i7);
                if (constraintWidget3 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget3;
                    if (barrier.xzo() == 0) {
                        t(0, barrier, measurer, 0, zL2);
                    }
                }
            }
        }
        if (dimensionBehaviourM == ConstraintWidget.DimensionBehaviour.FIXED) {
            constraintWidgetContainer.kSg(0, constraintWidgetContainer.nY());
        } else {
            constraintWidgetContainer.lLA(0);
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) arrayListMh.get(i8);
            if (constraintWidget4 instanceof Guideline) {
                Guideline guideline3 = (Guideline) constraintWidget4;
                if (guideline3.Mh() == 0) {
                    if (guideline3.jO() != -1) {
                        guideline3.Th(guideline3.jO());
                    } else if (guideline3.Toy() != -1 && constraintWidgetContainer.Mx()) {
                        guideline3.Th(constraintWidgetContainer.nY() - guideline3.Toy());
                    } else if (constraintWidgetContainer.Mx()) {
                        guideline3.Th((int) ((guideline3.wKp() * constraintWidgetContainer.nY()) + 0.5f));
                    }
                    z4 = true;
                }
            } else if ((constraintWidget4 instanceof Barrier) && ((Barrier) constraintWidget4).xzo() == 1) {
                z5 = true;
            }
        }
        if (z4) {
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) arrayListMh.get(i9);
                if (constraintWidget5 instanceof Guideline) {
                    Guideline guideline4 = (Guideline) constraintWidget5;
                    if (guideline4.Mh() == 0) {
                        xMQ(1, guideline4, measurer);
                    }
                }
            }
        }
        xMQ(0, constraintWidgetContainer, measurer);
        if (z5) {
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) arrayListMh.get(i10);
                if (constraintWidget6 instanceof Barrier) {
                    Barrier barrier2 = (Barrier) constraintWidget6;
                    if (barrier2.xzo() == 1) {
                        t(0, barrier2, measurer, 1, zL2);
                    }
                }
            }
        }
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget7 = (ConstraintWidget) arrayListMh.get(i11);
            if (constraintWidget7.ofS() && n(0, constraintWidget7)) {
                ConstraintWidgetContainer.wKY(0, constraintWidget7, measurer, f35571n, BasicMeasure.Measure.gh);
                if (constraintWidget7 instanceof Guideline) {
                    if (((Guideline) constraintWidget7).Mh() == 0) {
                        xMQ(0, constraintWidget7, measurer);
                    } else {
                        rl(0, constraintWidget7, measurer, zL2);
                    }
                } else {
                    rl(0, constraintWidget7, measurer, zL2);
                    xMQ(0, constraintWidget7, measurer);
                }
            }
        }
    }

    private static void O(int i2, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2, boolean z2) {
        int iJ;
        float fG = constraintWidget2.g();
        int iO = constraintWidget2.jB.J2.O() + constraintWidget2.jB.J2();
        int iO2 = constraintWidget2.P5.J2.O() - constraintWidget2.P5.J2();
        if (iO2 >= iO) {
            int iJ2 = constraintWidget2.J();
            if (constraintWidget2.B() != 8) {
                int i3 = constraintWidget2.WPU;
                if (i3 == 2) {
                    if (constraintWidget instanceof ConstraintWidgetContainer) {
                        iJ = constraintWidget.J();
                    } else {
                        iJ = constraintWidget.rV9().J();
                    }
                    iJ2 = (int) (constraintWidget2.g() * 0.5f * iJ);
                } else if (i3 == 0) {
                    iJ2 = iO2 - iO;
                }
                iJ2 = Math.max(constraintWidget2.nY, iJ2);
                int i5 = constraintWidget2.f35524g;
                if (i5 > 0) {
                    iJ2 = Math.min(i5, iJ2);
                }
            }
            int i7 = iO + ((int) ((fG * ((iO2 - iO) - iJ2)) + 0.5f));
            constraintWidget2.tUK(i7, iJ2 + i7);
            rl(i2 + 1, constraintWidget2, measurer, z2);
        }
    }

    private static void Uo(int i2, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2) {
        int iNY;
        float fEF = constraintWidget2.eF();
        int iO = constraintWidget2.f35517U.J2.O() + constraintWidget2.f35517U.J2();
        int iO2 = constraintWidget2.M7.J2.O() - constraintWidget2.M7.J2();
        if (iO2 >= iO) {
            int iNY2 = constraintWidget2.nY();
            if (constraintWidget2.B() != 8) {
                int i3 = constraintWidget2.aYN;
                if (i3 == 2) {
                    if (constraintWidget instanceof ConstraintWidgetContainer) {
                        iNY = constraintWidget.nY();
                    } else {
                        iNY = constraintWidget.rV9().nY();
                    }
                    iNY2 = (int) (fEF * 0.5f * iNY);
                } else if (i3 == 0) {
                    iNY2 = iO2 - iO;
                }
                iNY2 = Math.max(constraintWidget2.iF, iNY2);
                int i5 = constraintWidget2.fD;
                if (i5 > 0) {
                    iNY2 = Math.min(i5, iNY2);
                }
            }
            int i7 = iO + ((int) ((fEF * ((iO2 - iO) - iNY2)) + 0.5f));
            constraintWidget2.kSg(i7, iNY2 + i7);
            xMQ(i2 + 1, constraintWidget2, measurer);
        }
    }

    private static boolean n(int i2, ConstraintWidget constraintWidget) {
        ConstraintWidgetContainer constraintWidgetContainer;
        boolean z2;
        boolean z3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourIF = constraintWidget.iF();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM = constraintWidget.M();
        if (constraintWidget.rV9() != null) {
            constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.rV9();
        } else {
            constraintWidgetContainer = null;
        }
        if (constraintWidgetContainer != null) {
            constraintWidgetContainer.iF();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (constraintWidgetContainer != null) {
            constraintWidgetContainer.M();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviourIF != dimensionBehaviour5 && !constraintWidget.C() && dimensionBehaviourIF != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && ((dimensionBehaviourIF != (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || constraintWidget.WPU != 0 || constraintWidget.Nxk != 0.0f || !constraintWidget.GR(0)) && (dimensionBehaviourIF != dimensionBehaviour2 || constraintWidget.WPU != 1 || !constraintWidget.k(0, constraintWidget.J())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (dimensionBehaviourM != dimensionBehaviour5 && !constraintWidget.Mx() && dimensionBehaviourM != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && ((dimensionBehaviourM != (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || constraintWidget.aYN != 0 || constraintWidget.Nxk != 0.0f || !constraintWidget.GR(1)) && (dimensionBehaviourM != dimensionBehaviour || constraintWidget.aYN != 1 || !constraintWidget.k(1, constraintWidget.nY())))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (constraintWidget.Nxk > 0.0f && (z2 || z3)) {
            return true;
        }
        if (!z2 || !z3) {
            return false;
        }
        return true;
    }

    private static void nr(int i2, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget, boolean z2) {
        float f3;
        float fG = constraintWidget.g();
        int iO = constraintWidget.jB.J2.O();
        int iO2 = constraintWidget.P5.J2.O();
        int iJ2 = constraintWidget.jB.J2() + iO;
        int iJ22 = iO2 - constraintWidget.P5.J2();
        if (iO == iO2) {
            fG = 0.5f;
        } else {
            iO = iJ2;
            iO2 = iJ22;
        }
        int iJ = constraintWidget.J();
        int i3 = (iO2 - iO) - iJ;
        if (iO > iO2) {
            i3 = (iO - iO2) - iJ;
        }
        if (i3 > 0) {
            f3 = (fG * i3) + 0.5f;
        } else {
            f3 = fG * i3;
        }
        int i5 = ((int) f3) + iO;
        int i7 = i5 + iJ;
        if (iO > iO2) {
            i7 = i5 - iJ;
        }
        constraintWidget.tUK(i5, i7);
        rl(i2 + 1, constraintWidget, measurer, z2);
    }

    private static void t(int i2, Barrier barrier, BasicMeasure.Measurer measurer, int i3, boolean z2) {
        if (barrier.jO()) {
            if (i3 == 0) {
                rl(i2 + 1, barrier, measurer, z2);
            } else {
                xMQ(i2 + 1, barrier, measurer);
            }
        }
    }
}
