package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class DependencyGraph {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ConstraintWidgetContainer f35558n;
    private ConstraintWidgetContainer nr;
    private boolean rl = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35559t = true;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ArrayList f35557O = new ArrayList();
    private ArrayList J2 = new ArrayList();
    private BasicMeasure.Measurer Uo = null;
    private BasicMeasure.Measure KN = new BasicMeasure.Measure();
    ArrayList xMQ = new ArrayList();

    public void gh() {
        this.f35559t = true;
    }

    public void mUb() {
        this.rl = true;
    }

    private int O(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
        int size = this.xMQ.size();
        long jMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jMax = Math.max(jMax, ((RunGroup) this.xMQ.get(i3)).rl(constraintWidgetContainer, i2));
        }
        return (int) jMax;
    }

    private void n(DependencyNode dependencyNode, int i2, int i3, DependencyNode dependencyNode2, ArrayList arrayList, RunGroup runGroup) {
        int i5;
        DependencyNode dependencyNode3;
        ArrayList arrayList2;
        WidgetRun widgetRun = dependencyNode.nr;
        if (widgetRun.f35586t == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f35558n;
            if (widgetRun == constraintWidgetContainer.f35514O || widgetRun == constraintWidgetContainer.J2) {
                return;
            }
            if (runGroup == null) {
                runGroup = new RunGroup(widgetRun, i3);
                arrayList.add(runGroup);
            }
            RunGroup runGroup2 = runGroup;
            widgetRun.f35586t = runGroup2;
            runGroup2.n(widgetRun);
            for (Dependency dependency : widgetRun.KN.gh) {
                if (dependency instanceof DependencyNode) {
                    i5 = i2;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                    n((DependencyNode) dependency, i5, 0, dependencyNode3, arrayList2, runGroup2);
                } else {
                    i5 = i2;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                }
                i2 = i5;
                dependencyNode2 = dependencyNode3;
                arrayList = arrayList2;
            }
            int i7 = i2;
            DependencyNode dependencyNode4 = dependencyNode2;
            ArrayList arrayList3 = arrayList;
            for (Dependency dependency2 : widgetRun.xMQ.gh) {
                if (dependency2 instanceof DependencyNode) {
                    n((DependencyNode) dependency2, i7, 1, dependencyNode4, arrayList3, runGroup2);
                }
            }
            if (i7 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).gh.gh) {
                    if (dependency3 instanceof DependencyNode) {
                        n((DependencyNode) dependency3, i7, 2, dependencyNode4, arrayList3, runGroup2);
                    }
                }
            }
            for (DependencyNode dependencyNode5 : widgetRun.KN.qie) {
                if (dependencyNode5 == dependencyNode4) {
                    runGroup2.rl = true;
                }
                n(dependencyNode5, i7, 0, dependencyNode4, arrayList3, runGroup2);
            }
            for (DependencyNode dependencyNode6 : widgetRun.xMQ.qie) {
                if (dependencyNode6 == dependencyNode4) {
                    runGroup2.rl = true;
                }
                n(dependencyNode6, i7, 1, dependencyNode4, arrayList3, runGroup2);
            }
            if (i7 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator it = ((VerticalWidgetRun) widgetRun).gh.qie.iterator();
                while (it.hasNext()) {
                    n((DependencyNode) it.next(), i7, 2, dependencyNode4, arrayList3, runGroup2);
                }
            }
        }
    }

    private void qie(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        BasicMeasure.Measure measure = this.KN;
        measure.f35555n = dimensionBehaviour;
        measure.rl = dimensionBehaviour2;
        measure.f35556t = i2;
        measure.nr = i3;
        this.Uo.rl(constraintWidget, measure);
        constraintWidget.vl(this.KN.f35554O);
        constraintWidget.a63(this.KN.J2);
        constraintWidget.RQ(this.KN.KN);
        constraintWidget.hRu(this.KN.Uo);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean rl(ConstraintWidgetContainer constraintWidgetContainer) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i2;
        char c2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        float f3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        for (ConstraintWidget constraintWidget : constraintWidgetContainer.tFV) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f35503D;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
            if (constraintWidget.B() == 8) {
                constraintWidget.f35528n = true;
            } else {
                if (constraintWidget.te < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.WPU = 2;
                }
                if (constraintWidget.E2 < 1.0f && dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.aYN = 2;
                }
                if (constraintWidget.aYN() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour6 == dimensionBehaviour8 && (dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.WPU = 3;
                    } else if (dimensionBehaviour7 == dimensionBehaviour8 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.aYN = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour8 && dimensionBehaviour7 == dimensionBehaviour8) {
                        if (constraintWidget.WPU == 0) {
                            constraintWidget.WPU = 3;
                        }
                        if (constraintWidget.aYN == 0) {
                            constraintWidget.aYN = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour6 == dimensionBehaviour9 && constraintWidget.WPU == 1 && (constraintWidget.jB.J2 == null || constraintWidget.P5.J2 == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour7 == dimensionBehaviour9 && constraintWidget.aYN == 1 && (constraintWidget.f35517U.J2 == null || constraintWidget.M7.J2 == null)) {
                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget.f35514O;
                horizontalWidgetRun.nr = dimensionBehaviour6;
                int i3 = constraintWidget.WPU;
                horizontalWidgetRun.f35585n = i3;
                VerticalWidgetRun verticalWidgetRun = constraintWidget.J2;
                verticalWidgetRun.nr = dimensionBehaviour7;
                int i5 = constraintWidget.aYN;
                verticalWidgetRun.f35585n = i5;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour6 == dimensionBehaviour10 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour7 == dimensionBehaviour10 || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviour7;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviour6;
                    int iJ = constraintWidget.J();
                    if (dimensionBehaviour12 == dimensionBehaviour10) {
                        iJ = (constraintWidgetContainer.J() - constraintWidget.jB.Uo) - constraintWidget.P5.Uo;
                        dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int i7 = iJ;
                    int iNY = constraintWidget.nY();
                    if (dimensionBehaviour11 == dimensionBehaviour10) {
                        iNY = (constraintWidgetContainer.nY() - constraintWidget.f35517U.Uo) - constraintWidget.M7.Uo;
                        dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    qie(constraintWidget, dimensionBehaviour12, i7, dimensionBehaviour11, iNY);
                    constraintWidget.f35514O.f35584O.nr(constraintWidget.J());
                    constraintWidget.J2.f35584O.nr(constraintWidget.nY());
                    constraintWidget.f35528n = true;
                } else {
                    if (dimensionBehaviour6 == dimensionBehaviour9) {
                        dimensionBehaviour2 = dimensionBehaviour9;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        c2 = 0;
                        if (dimensionBehaviour7 != dimensionBehaviour13 && dimensionBehaviour7 != ConstraintWidget.DimensionBehaviour.FIXED) {
                            dimensionBehaviour = dimensionBehaviour7;
                            i2 = 3;
                        } else if (i3 == 3) {
                            if (dimensionBehaviour7 == dimensionBehaviour13) {
                                qie(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour13, 0);
                            }
                            int iNY2 = constraintWidget.nY();
                            int i8 = (int) ((iNY2 * constraintWidget.Nxk) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            qie(constraintWidget, dimensionBehaviour14, i8, dimensionBehaviour14, iNY2);
                            constraintWidget.f35514O.f35584O.nr(constraintWidget.J());
                            constraintWidget.J2.f35584O.nr(constraintWidget.nY());
                            constraintWidget.f35528n = true;
                        } else if (i3 == 1) {
                            qie(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour7, 0);
                            constraintWidget.f35514O.f35584O.az = constraintWidget.J();
                        } else {
                            dimensionBehaviour = dimensionBehaviour7;
                            i2 = 3;
                            if (i3 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = constraintWidgetContainer.f35503D[0];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour15 == dimensionBehaviour16 || dimensionBehaviour15 == dimensionBehaviour10) {
                                    qie(constraintWidget, dimensionBehaviour16, (int) ((constraintWidget.te * constraintWidgetContainer.J()) + 0.5f), dimensionBehaviour, constraintWidget.nY());
                                    constraintWidget.f35514O.f35584O.nr(constraintWidget.J());
                                    constraintWidget.J2.f35584O.nr(constraintWidget.nY());
                                    constraintWidget.f35528n = true;
                                }
                            } else {
                                ConstraintAnchor[] constraintAnchorArr = constraintWidget.f35506FX;
                                f3 = 1.0f;
                                if (constraintAnchorArr[0].J2 == null || constraintAnchorArr[1].J2 == null) {
                                    qie(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour, 0);
                                    constraintWidget.f35514O.f35584O.nr(constraintWidget.J());
                                    constraintWidget.J2.f35584O.nr(constraintWidget.nY());
                                    constraintWidget.f35528n = true;
                                } else if (dimensionBehaviour == dimensionBehaviour2 || !(dimensionBehaviour6 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                                    dimensionBehaviour3 = dimensionBehaviour6;
                                    if (dimensionBehaviour3 == dimensionBehaviour2 && dimensionBehaviour == dimensionBehaviour2) {
                                        if (i3 == 1 || i5 == 1) {
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                            qie(constraintWidget, dimensionBehaviour17, 0, dimensionBehaviour17, 0);
                                            constraintWidget.f35514O.f35584O.az = constraintWidget.J();
                                            constraintWidget.J2.f35584O.az = constraintWidget.nY();
                                        } else if (i5 == 2 && i3 == 2) {
                                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer.f35503D;
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr2[c2];
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = ConstraintWidget.DimensionBehaviour.FIXED;
                                            if (dimensionBehaviour18 == dimensionBehaviour19 && dimensionBehaviourArr2[1] == dimensionBehaviour19) {
                                                qie(constraintWidget, dimensionBehaviour19, (int) ((constraintWidget.te * constraintWidgetContainer.J()) + 0.5f), dimensionBehaviour19, (int) ((constraintWidget.E2 * constraintWidgetContainer.nY()) + 0.5f));
                                                constraintWidget.f35514O.f35584O.nr(constraintWidget.J());
                                                constraintWidget.J2.f35584O.nr(constraintWidget.nY());
                                                constraintWidget.f35528n = true;
                                            }
                                        }
                                    }
                                } else if (i5 == i2) {
                                    if (dimensionBehaviour6 == dimensionBehaviour4) {
                                        qie(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                                    }
                                    int iJ2 = constraintWidget.J();
                                    float f4 = constraintWidget.Nxk;
                                    if (constraintWidget.ViF() == -1) {
                                        f4 = f3 / f4;
                                    }
                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.FIXED;
                                    qie(constraintWidget, dimensionBehaviour20, iJ2, dimensionBehaviour20, (int) ((iJ2 * f4) + 0.5f));
                                    constraintWidget.f35514O.f35584O.nr(constraintWidget.J());
                                    constraintWidget.J2.f35584O.nr(constraintWidget.nY());
                                    constraintWidget.f35528n = true;
                                } else if (i5 == 1) {
                                    qie(constraintWidget, dimensionBehaviour6, 0, dimensionBehaviour4, 0);
                                    constraintWidget.J2.f35584O.az = constraintWidget.nY();
                                } else {
                                    dimensionBehaviour3 = dimensionBehaviour6;
                                    if (i5 == 2) {
                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = constraintWidgetContainer.f35503D[1];
                                        dimensionBehaviour5 = dimensionBehaviour;
                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = ConstraintWidget.DimensionBehaviour.FIXED;
                                        if (dimensionBehaviour21 == dimensionBehaviour22 || dimensionBehaviour21 == dimensionBehaviour10) {
                                            qie(constraintWidget, dimensionBehaviour3, constraintWidget.J(), dimensionBehaviour22, (int) ((constraintWidget.E2 * constraintWidgetContainer.nY()) + 0.5f));
                                            constraintWidget.f35514O.f35584O.nr(constraintWidget.J());
                                            constraintWidget.J2.f35584O.nr(constraintWidget.nY());
                                            constraintWidget.f35528n = true;
                                        } else {
                                            dimensionBehaviour = dimensionBehaviour5;
                                        }
                                    } else {
                                        dimensionBehaviour5 = dimensionBehaviour;
                                        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.f35506FX;
                                        if (constraintAnchorArr2[2].J2 == null || constraintAnchorArr2[i2].J2 == null) {
                                            qie(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour5, 0);
                                            constraintWidget.f35514O.f35584O.nr(constraintWidget.J());
                                            constraintWidget.J2.f35584O.nr(constraintWidget.nY());
                                            constraintWidget.f35528n = true;
                                        } else {
                                            dimensionBehaviour = dimensionBehaviour5;
                                        }
                                    }
                                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                                    }
                                }
                            }
                        }
                    } else {
                        dimensionBehaviour = dimensionBehaviour7;
                        i2 = 3;
                        c2 = 0;
                        dimensionBehaviour2 = dimensionBehaviour9;
                    }
                    f3 = 1.0f;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                    }
                    dimensionBehaviour3 = dimensionBehaviour6;
                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                    }
                }
            }
        }
        return false;
    }

    private void xMQ(WidgetRun widgetRun, int i2, ArrayList arrayList) {
        for (Dependency dependency : widgetRun.KN.gh) {
            if (dependency instanceof DependencyNode) {
                n((DependencyNode) dependency, i2, 0, widgetRun.xMQ, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                n(((WidgetRun) dependency).KN, i2, 0, widgetRun.xMQ, arrayList, null);
            }
        }
        for (Dependency dependency2 : widgetRun.xMQ.gh) {
            if (dependency2 instanceof DependencyNode) {
                n((DependencyNode) dependency2, i2, 1, widgetRun.KN, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                n(((WidgetRun) dependency2).xMQ, i2, 1, widgetRun.KN, arrayList, null);
            }
        }
        int i3 = i2;
        if (i3 == 1) {
            for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).gh.gh) {
                if (dependency3 instanceof DependencyNode) {
                    n((DependencyNode) dependency3, i3, 2, null, arrayList, null);
                }
                i3 = i2;
            }
        }
    }

    public boolean J2(boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (this.rl || this.f35559t) {
            for (ConstraintWidget constraintWidget : this.f35558n.tFV) {
                constraintWidget.ck();
                constraintWidget.f35528n = false;
                constraintWidget.f35514O.r();
                constraintWidget.J2.Ik();
            }
            this.f35558n.ck();
            ConstraintWidgetContainer constraintWidgetContainer = this.f35558n;
            constraintWidgetContainer.f35528n = false;
            constraintWidgetContainer.f35514O.r();
            this.f35558n.J2.Ik();
            this.f35559t = false;
        }
        if (rl(this.nr)) {
            return false;
        }
        this.f35558n.o9(0);
        this.f35558n.n7b(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU = this.f35558n.WPU(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU2 = this.f35558n.WPU(1);
        if (this.rl) {
            t();
        }
        int iD = this.f35558n.D();
        int iA = this.f35558n.a();
        this.f35558n.f35514O.KN.nr(iD);
        this.f35558n.J2.KN.nr(iA);
        az();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviourWPU == dimensionBehaviour || dimensionBehaviourWPU2 == dimensionBehaviour) {
            if (z2) {
                Iterator it = this.f35557O.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((WidgetRun) it.next()).az()) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2 && dimensionBehaviourWPU == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f35558n.VwL(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.f35558n;
                constraintWidgetContainer2.vl(O(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f35558n;
                constraintWidgetContainer3.f35514O.f35584O.nr(constraintWidgetContainer3.J());
            }
            if (z2 && dimensionBehaviourWPU2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f35558n.Vvq(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f35558n;
                constraintWidgetContainer4.a63(O(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.f35558n;
                constraintWidgetContainer5.J2.f35584O.nr(constraintWidgetContainer5.nY());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.f35558n;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidgetContainer6.f35503D[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int iJ = constraintWidgetContainer6.J() + iD;
            this.f35558n.f35514O.xMQ.nr(iJ);
            this.f35558n.f35514O.f35584O.nr(iJ - iD);
            az();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.f35558n;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer7.f35503D[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iNY = constraintWidgetContainer7.nY() + iA;
                this.f35558n.J2.xMQ.nr(iNY);
                this.f35558n.J2.f35584O.nr(iNY - iA);
            }
            az();
            z3 = true;
        } else {
            z3 = false;
        }
        for (WidgetRun widgetRun : this.f35557O) {
            if (widgetRun.rl != this.f35558n || widgetRun.Uo) {
                widgetRun.O();
            }
        }
        Iterator it2 = this.f35557O.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z4 = true;
                break;
            }
            WidgetRun widgetRun2 = (WidgetRun) it2.next();
            if (z3 || widgetRun2.rl != this.f35558n) {
                if (!widgetRun2.KN.mUb || ((!widgetRun2.xMQ.mUb && !(widgetRun2 instanceof GuidelineReference)) || (!widgetRun2.f35584O.mUb && !(widgetRun2 instanceof ChainRun) && !(widgetRun2 instanceof GuidelineReference)))) {
                    break;
                }
            }
        }
        this.f35558n.VwL(dimensionBehaviourWPU);
        this.f35558n.Vvq(dimensionBehaviourWPU2);
        return z4;
    }

    public boolean KN(boolean z2, int i2) {
        boolean z3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z4 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU = this.f35558n.WPU(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU2 = this.f35558n.WPU(1);
        int iD = this.f35558n.D();
        int iA = this.f35558n.a();
        if (z2 && (dimensionBehaviourWPU == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviourWPU2 == dimensionBehaviour)) {
            Iterator it = this.f35557O.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun widgetRun = (WidgetRun) it.next();
                if (widgetRun.J2 == i2 && !widgetRun.az()) {
                    z2 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z2 && dimensionBehaviourWPU == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.f35558n.VwL(ConstraintWidget.DimensionBehaviour.FIXED);
                    ConstraintWidgetContainer constraintWidgetContainer = this.f35558n;
                    constraintWidgetContainer.vl(O(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f35558n;
                    constraintWidgetContainer2.f35514O.f35584O.nr(constraintWidgetContainer2.J());
                }
            } else if (z2 && dimensionBehaviourWPU2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f35558n.Vvq(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f35558n;
                constraintWidgetContainer3.a63(O(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f35558n;
                constraintWidgetContainer4.J2.f35584O.nr(constraintWidgetContainer4.nY());
            }
        }
        if (i2 == 0) {
            ConstraintWidgetContainer constraintWidgetContainer5 = this.f35558n;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidgetContainer5.f35503D[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iJ = constraintWidgetContainer5.J() + iD;
                this.f35558n.f35514O.xMQ.nr(iJ);
                this.f35558n.f35514O.f35584O.nr(iJ - iD);
                z3 = true;
            }
            z3 = false;
        } else {
            ConstraintWidgetContainer constraintWidgetContainer6 = this.f35558n;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidgetContainer6.f35503D[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iNY = constraintWidgetContainer6.nY() + iA;
                this.f35558n.J2.xMQ.nr(iNY);
                this.f35558n.J2.f35584O.nr(iNY - iA);
                z3 = true;
            }
            z3 = false;
        }
        az();
        for (WidgetRun widgetRun2 : this.f35557O) {
            if (widgetRun2.J2 == i2 && (widgetRun2.rl != this.f35558n || widgetRun2.Uo)) {
                widgetRun2.O();
            }
        }
        Iterator it2 = this.f35557O.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z4 = true;
                break;
            }
            WidgetRun widgetRun3 = (WidgetRun) it2.next();
            if (widgetRun3.J2 == i2 && (z3 || widgetRun3.rl != this.f35558n)) {
                if (!widgetRun3.KN.mUb || !widgetRun3.xMQ.mUb || (!(widgetRun3 instanceof ChainRun) && !widgetRun3.f35584O.mUb)) {
                    break;
                }
            }
        }
        this.f35558n.VwL(dimensionBehaviourWPU);
        this.f35558n.Vvq(dimensionBehaviourWPU2);
        return z4;
    }

    public boolean Uo(boolean z2) {
        if (this.rl) {
            for (ConstraintWidget constraintWidget : this.f35558n.tFV) {
                constraintWidget.ck();
                constraintWidget.f35528n = false;
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget.f35514O;
                horizontalWidgetRun.f35584O.mUb = false;
                horizontalWidgetRun.Uo = false;
                horizontalWidgetRun.r();
                VerticalWidgetRun verticalWidgetRun = constraintWidget.J2;
                verticalWidgetRun.f35584O.mUb = false;
                verticalWidgetRun.Uo = false;
                verticalWidgetRun.Ik();
            }
            this.f35558n.ck();
            ConstraintWidgetContainer constraintWidgetContainer = this.f35558n;
            constraintWidgetContainer.f35528n = false;
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer.f35514O;
            horizontalWidgetRun2.f35584O.mUb = false;
            horizontalWidgetRun2.Uo = false;
            horizontalWidgetRun2.r();
            VerticalWidgetRun verticalWidgetRun2 = this.f35558n.J2;
            verticalWidgetRun2.f35584O.mUb = false;
            verticalWidgetRun2.Uo = false;
            verticalWidgetRun2.Ik();
            t();
        }
        if (rl(this.nr)) {
            return false;
        }
        this.f35558n.o9(0);
        this.f35558n.n7b(0);
        this.f35558n.f35514O.KN.nr(0);
        this.f35558n.J2.KN.nr(0);
        return true;
    }

    public void az() {
        DimensionDependency dimensionDependency;
        for (ConstraintWidget constraintWidget : this.f35558n.tFV) {
            if (!constraintWidget.f35528n) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f35503D;
                boolean z2 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i2 = constraintWidget.WPU;
                int i3 = constraintWidget.aYN;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z3 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i3 == 1)) {
                    z2 = true;
                }
                DimensionDependency dimensionDependency2 = constraintWidget.f35514O.f35584O;
                boolean z4 = dimensionDependency2.mUb;
                DimensionDependency dimensionDependency3 = constraintWidget.J2.f35584O;
                boolean z5 = dimensionDependency3.mUb;
                if (z4 && z5) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    qie(constraintWidget, dimensionBehaviour4, dimensionDependency2.Uo, dimensionBehaviour4, dimensionDependency3.Uo);
                    constraintWidget.f35528n = true;
                } else if (z4 && z2) {
                    qie(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency2.Uo, dimensionBehaviour3, dimensionDependency3.Uo);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.J2.f35584O.az = constraintWidget.nY();
                    } else {
                        constraintWidget.J2.f35584O.nr(constraintWidget.nY());
                        constraintWidget.f35528n = true;
                    }
                } else if (z5 && z3) {
                    qie(constraintWidget, dimensionBehaviour3, dimensionDependency2.Uo, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency3.Uo);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f35514O.f35584O.az = constraintWidget.J();
                    } else {
                        constraintWidget.f35514O.f35584O.nr(constraintWidget.J());
                        constraintWidget.f35528n = true;
                    }
                }
                if (constraintWidget.f35528n && (dimensionDependency = constraintWidget.J2.qie) != null) {
                    dimensionDependency.nr(constraintWidget.r());
                }
            }
        }
    }

    public void t() {
        nr(this.f35557O);
        this.xMQ.clear();
        RunGroup.KN = 0;
        xMQ(this.f35558n.f35514O, 0, this.xMQ);
        xMQ(this.f35558n.J2, 1, this.xMQ);
        this.rl = false;
    }

    public void ty(BasicMeasure.Measurer measurer) {
        this.Uo = measurer;
    }

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f35558n = constraintWidgetContainer;
        this.nr = constraintWidgetContainer;
    }

    public void nr(ArrayList arrayList) {
        arrayList.clear();
        this.nr.f35514O.J2();
        this.nr.J2.J2();
        arrayList.add(this.nr.f35514O);
        arrayList.add(this.nr.J2);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : this.nr.tFV) {
            if (constraintWidget instanceof Guideline) {
                arrayList.add(new GuidelineReference(constraintWidget));
            } else {
                if (constraintWidget.m()) {
                    if (constraintWidget.f35531t == null) {
                        constraintWidget.f35531t = new ChainRun(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f35531t);
                } else {
                    arrayList.add(constraintWidget.f35514O);
                }
                if (constraintWidget.xg()) {
                    if (constraintWidget.nr == null) {
                        constraintWidget.nr = new ChainRun(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.nr);
                } else {
                    arrayList.add(constraintWidget.J2);
                }
                if (constraintWidget instanceof HelperWidget) {
                    arrayList.add(new HelperReferences(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).J2();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it2.next();
            if (widgetRun.rl != this.nr) {
                widgetRun.nr();
            }
        }
    }
}
