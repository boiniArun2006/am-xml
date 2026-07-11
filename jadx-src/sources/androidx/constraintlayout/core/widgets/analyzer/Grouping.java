package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Grouping {
    public static WidgetGroup n(ConstraintWidget constraintWidget, int i2, ArrayList arrayList, WidgetGroup widgetGroup) {
        int iMh;
        int i3 = i2 == 0 ? constraintWidget.a63 : constraintWidget.f35505F;
        if (i3 != -1 && (widgetGroup == null || i3 != widgetGroup.t())) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                WidgetGroup widgetGroup2 = (WidgetGroup) arrayList.get(i5);
                if (widgetGroup2.t() == i3) {
                    if (widgetGroup != null) {
                        widgetGroup.Uo(i2, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i5++;
                }
            }
        } else if (i3 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if ((constraintWidget instanceof HelperWidget) && (iMh = ((HelperWidget) constraintWidget).Mh(i2)) != -1) {
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    WidgetGroup widgetGroup3 = (WidgetGroup) arrayList.get(i7);
                    if (widgetGroup3.t() == iMh) {
                        widgetGroup = widgetGroup3;
                        break;
                    }
                    i7++;
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup(i2);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.n(constraintWidget)) {
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                guideline.g6().t(guideline.Mh() == 0 ? 1 : 0, arrayList, widgetGroup);
            }
            if (i2 == 0) {
                constraintWidget.a63 = widgetGroup.t();
                constraintWidget.jB.t(i2, arrayList, widgetGroup);
                constraintWidget.P5.t(i2, arrayList, widgetGroup);
            } else {
                constraintWidget.f35505F = widgetGroup.t();
                constraintWidget.f35517U.t(i2, arrayList, widgetGroup);
                constraintWidget.p5.t(i2, arrayList, widgetGroup);
                constraintWidget.M7.t(i2, arrayList, widgetGroup);
            }
            constraintWidget.f35512M.t(i2, arrayList, widgetGroup);
        }
        return widgetGroup;
    }

    public static boolean nr(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean t(ConstraintWidgetContainer constraintWidgetContainer, BasicMeasure.Measurer measurer) {
        WidgetGroup widgetGroup;
        boolean z2;
        WidgetGroup widgetGroup2;
        ArrayList arrayListMh = constraintWidgetContainer.Mh();
        int size = arrayListMh.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayListMh.get(i3);
            if (!nr(constraintWidgetContainer.iF(), constraintWidgetContainer.M(), constraintWidget.iF(), constraintWidget.M()) || (constraintWidget instanceof Flow)) {
                return false;
            }
        }
        Metrics metrics = constraintWidgetContainer.Uf;
        if (metrics != null) {
            metrics.wTp++;
        }
        int i5 = 0;
        ArrayList arrayList = null;
        ArrayList<HelperWidget> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<HelperWidget> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i5 < size) {
            ConstraintWidget constraintWidget2 = (ConstraintWidget) arrayListMh.get(i5);
            if (!nr(constraintWidgetContainer.iF(), constraintWidgetContainer.M(), constraintWidget2.iF(), constraintWidget2.M())) {
                ConstraintWidgetContainer.wKY(i2, constraintWidget2, measurer, constraintWidgetContainer.jO, BasicMeasure.Measure.gh);
            }
            boolean z3 = constraintWidget2 instanceof Guideline;
            if (z3) {
                Guideline guideline = (Guideline) constraintWidget2;
                if (guideline.Mh() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(guideline);
                }
                if (guideline.Mh() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(guideline);
                }
            }
            if (constraintWidget2 instanceof HelperWidget) {
                if (constraintWidget2 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget2;
                    if (barrier.xzo() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(barrier);
                    }
                    if (barrier.xzo() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(barrier);
                    }
                } else {
                    HelperWidget helperWidget = (HelperWidget) constraintWidget2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(helperWidget);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(helperWidget);
                }
            }
            if (constraintWidget2.jB.J2 == null && constraintWidget2.P5.J2 == null && !z3 && !(constraintWidget2 instanceof Barrier)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(constraintWidget2);
            }
            if (constraintWidget2.f35517U.J2 == null && constraintWidget2.M7.J2 == null && constraintWidget2.p5.J2 == null && !z3 && !(constraintWidget2 instanceof Barrier)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(constraintWidget2);
            }
            i5++;
            i2 = 0;
        }
        ArrayList<WidgetGroup> arrayList7 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n((Guideline) it.next(), 0, arrayList7, null);
            }
        }
        int i7 = 0;
        WidgetGroup widgetGroup3 = null;
        if (arrayList2 != null) {
            for (HelperWidget helperWidget2 : arrayList2) {
                WidgetGroup widgetGroupN = n(helperWidget2, i7, arrayList7, widgetGroup3);
                helperWidget2.g6(arrayList7, i7, widgetGroupN);
                widgetGroupN.rl(arrayList7);
                i7 = 0;
                widgetGroup3 = null;
            }
        }
        ConstraintAnchor constraintAnchorIk = constraintWidgetContainer.Ik(ConstraintAnchor.Type.LEFT);
        if (constraintAnchorIk.nr() != null) {
            Iterator it2 = constraintAnchorIk.nr().iterator();
            while (it2.hasNext()) {
                n(((ConstraintAnchor) it2.next()).nr, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorIk2 = constraintWidgetContainer.Ik(ConstraintAnchor.Type.RIGHT);
        if (constraintAnchorIk2.nr() != null) {
            Iterator it3 = constraintAnchorIk2.nr().iterator();
            while (it3.hasNext()) {
                n(((ConstraintAnchor) it3.next()).nr, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorIk3 = constraintWidgetContainer.Ik(ConstraintAnchor.Type.CENTER);
        if (constraintAnchorIk3.nr() != null) {
            Iterator it4 = constraintAnchorIk3.nr().iterator();
            while (it4.hasNext()) {
                n(((ConstraintAnchor) it4.next()).nr, 0, arrayList7, null);
            }
        }
        WidgetGroup widgetGroup4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                n((ConstraintWidget) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                n((Guideline) it6.next(), 1, arrayList7, null);
            }
        }
        int i8 = 1;
        if (arrayList4 != null) {
            for (HelperWidget helperWidget3 : arrayList4) {
                WidgetGroup widgetGroupN2 = n(helperWidget3, i8, arrayList7, widgetGroup4);
                helperWidget3.g6(arrayList7, i8, widgetGroupN2);
                widgetGroupN2.rl(arrayList7);
                widgetGroup4 = null;
                i8 = 1;
            }
        }
        ConstraintAnchor constraintAnchorIk4 = constraintWidgetContainer.Ik(ConstraintAnchor.Type.TOP);
        if (constraintAnchorIk4.nr() != null) {
            Iterator it7 = constraintAnchorIk4.nr().iterator();
            while (it7.hasNext()) {
                n(((ConstraintAnchor) it7.next()).nr, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorIk5 = constraintWidgetContainer.Ik(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorIk5.nr() != null) {
            Iterator it8 = constraintAnchorIk5.nr().iterator();
            while (it8.hasNext()) {
                n(((ConstraintAnchor) it8.next()).nr, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorIk6 = constraintWidgetContainer.Ik(ConstraintAnchor.Type.BOTTOM);
        if (constraintAnchorIk6.nr() != null) {
            Iterator it9 = constraintAnchorIk6.nr().iterator();
            while (it9.hasNext()) {
                n(((ConstraintAnchor) it9.next()).nr, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorIk7 = constraintWidgetContainer.Ik(ConstraintAnchor.Type.CENTER);
        if (constraintAnchorIk7.nr() != null) {
            Iterator it10 = constraintAnchorIk7.nr().iterator();
            while (it10.hasNext()) {
                n(((ConstraintAnchor) it10.next()).nr, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                n((ConstraintWidget) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget) arrayListMh.get(i9);
            if (constraintWidget3.ul()) {
                WidgetGroup widgetGroupRl = rl(arrayList7, constraintWidget3.a63);
                WidgetGroup widgetGroupRl2 = rl(arrayList7, constraintWidget3.f35505F);
                if (widgetGroupRl != null && widgetGroupRl2 != null) {
                    widgetGroupRl.Uo(0, widgetGroupRl2);
                    widgetGroupRl2.xMQ(2);
                    arrayList7.remove(widgetGroupRl);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (constraintWidgetContainer.iF() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            widgetGroup = null;
            int i10 = 0;
            for (WidgetGroup widgetGroup5 : arrayList7) {
                if (widgetGroup5.nr() != 1) {
                    widgetGroup5.KN(false);
                    int iJ2 = widgetGroup5.J2(constraintWidgetContainer.EN(), 0);
                    if (iJ2 > i10) {
                        widgetGroup = widgetGroup5;
                        i10 = iJ2;
                    }
                }
            }
            if (widgetGroup != null) {
                constraintWidgetContainer.VwL(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidgetContainer.vl(i10);
                widgetGroup.KN(true);
            } else {
                widgetGroup = null;
            }
        }
        if (constraintWidgetContainer.M() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            WidgetGroup widgetGroup6 = null;
            int i11 = 0;
            for (WidgetGroup widgetGroup7 : arrayList7) {
                if (widgetGroup7.nr() != 0) {
                    widgetGroup7.KN(false);
                    int iJ22 = widgetGroup7.J2(constraintWidgetContainer.EN(), 1);
                    if (iJ22 > i11) {
                        widgetGroup6 = widgetGroup7;
                        i11 = iJ22;
                    }
                }
            }
            z2 = true;
            if (widgetGroup6 != null) {
                constraintWidgetContainer.Vvq(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidgetContainer.a63(i11);
                widgetGroup6.KN(true);
                widgetGroup2 = widgetGroup6;
            }
            if (widgetGroup == null || widgetGroup2 != null) {
                return z2;
            }
            return false;
        }
        z2 = true;
        widgetGroup2 = null;
        if (widgetGroup == null) {
        }
        return z2;
    }

    private static WidgetGroup rl(ArrayList arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            WidgetGroup widgetGroup = (WidgetGroup) arrayList.get(i3);
            if (i2 == widgetGroup.t()) {
                return widgetGroup;
            }
        }
        return null;
    }
}
