package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ChainRun extends WidgetRun {
    ArrayList gh;
    private int qie;

    private ConstraintWidget r() {
        for (int i2 = 0; i2 < this.gh.size(); i2++) {
            WidgetRun widgetRun = (WidgetRun) this.gh.get(i2);
            if (widgetRun.rl.B() != 8) {
                return widgetRun.rl;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void J2() {
        this.f35586t = null;
        Iterator it = this.gh.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).J2();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void O() {
        for (int i2 = 0; i2 < this.gh.size(); i2++) {
            ((WidgetRun) this.gh.get(i2)).O();
        }
    }

    private void Ik() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.rl;
        ConstraintWidget constraintWidgetBzg = constraintWidget2.bzg(this.J2);
        while (true) {
            ConstraintWidget constraintWidget3 = constraintWidgetBzg;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                constraintWidgetBzg = constraintWidget2.bzg(this.J2);
            }
        }
        this.rl = constraintWidget;
        this.gh.add(constraintWidget.jB(this.J2));
        ConstraintWidget constraintWidgetV = constraintWidget.v(this.J2);
        while (constraintWidgetV != null) {
            this.gh.add(constraintWidgetV.jB(this.J2));
            constraintWidgetV = constraintWidgetV.v(this.J2);
        }
        for (WidgetRun widgetRun : this.gh) {
            int i2 = this.J2;
            if (i2 == 0) {
                widgetRun.rl.f35531t = this;
            } else if (i2 == 1) {
                widgetRun.rl.nr = this;
            }
        }
        if (this.J2 == 0 && ((ConstraintWidgetContainer) this.rl.rV9()).l() && this.gh.size() > 1) {
            ArrayList arrayList = this.gh;
            this.rl = ((WidgetRun) arrayList.get(arrayList.size() - 1)).rl;
        }
        this.qie = this.J2 == 0 ? this.rl.te() : this.rl.E();
    }

    private ConstraintWidget o() {
        for (int size = this.gh.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = (WidgetRun) this.gh.get(size);
            if (widgetRun.rl.B() != 8) {
                return widgetRun.rl;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean az() {
        int size = this.gh.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((WidgetRun) this.gh.get(i2)).az()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long mUb() {
        int size = this.gh.size();
        long jMUb = 0;
        for (int i2 = 0; i2 < size; i2++) {
            WidgetRun widgetRun = (WidgetRun) this.gh.get(i2);
            jMUb = jMUb + ((long) widgetRun.KN.J2) + widgetRun.mUb() + ((long) widgetRun.xMQ.J2);
        }
        return jMUb;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(Dependency dependency) {
        int i2;
        int i3;
        boolean z2;
        float f3;
        float f4;
        int i5;
        int i7;
        int i8;
        int i9;
        float f5;
        int i10;
        int i11;
        float f6;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        if (this.KN.mUb && this.xMQ.mUb) {
            ConstraintWidget constraintWidgetRV9 = this.rl.rV9();
            boolean zL2 = constraintWidgetRV9 instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer) constraintWidgetRV9).l() : false;
            int i16 = this.xMQ.Uo - this.KN.Uo;
            int size = this.gh.size();
            int i17 = 0;
            while (true) {
                i2 = -1;
                i3 = 8;
                if (i17 >= size) {
                    i17 = -1;
                    break;
                } else if (((WidgetRun) this.gh.get(i17)).rl.B() != 8) {
                    break;
                } else {
                    i17++;
                }
            }
            int i18 = size - 1;
            int i19 = i18;
            while (true) {
                if (i19 < 0) {
                    break;
                }
                if (((WidgetRun) this.gh.get(i19)).rl.B() != 8) {
                    i2 = i19;
                    break;
                }
                i19--;
            }
            int i20 = 0;
            while (i20 < 2) {
                int i21 = 0;
                i7 = 0;
                i8 = 0;
                int i22 = 0;
                f4 = 0.0f;
                while (i21 < size) {
                    WidgetRun widgetRun = (WidgetRun) this.gh.get(i21);
                    if (widgetRun.rl.B() == i3) {
                        z3 = zL2;
                    } else {
                        i22++;
                        if (i21 > 0 && i21 >= i17) {
                            i7 += widgetRun.KN.J2;
                        }
                        DimensionDependency dimensionDependency = widgetRun.f35584O;
                        int i23 = dimensionDependency.Uo;
                        boolean z4 = widgetRun.nr != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z4) {
                            int i24 = this.J2;
                            if (i24 == 0 && !widgetRun.rl.f35514O.f35584O.mUb) {
                                return;
                            }
                            if (i24 == 1 && !widgetRun.rl.J2.f35584O.mUb) {
                                return;
                            } else {
                                z3 = zL2;
                            }
                        } else {
                            z3 = zL2;
                            if (widgetRun.f35585n == 1 && i20 == 0) {
                                i23 = dimensionDependency.az;
                                i8++;
                            } else if (dimensionDependency.mUb) {
                            }
                            z4 = true;
                        }
                        if (z4) {
                            i7 += i23;
                        } else {
                            i8++;
                            float f7 = widgetRun.rl.ER[this.J2];
                            if (f7 >= 0.0f) {
                                f4 += f7;
                            }
                        }
                        if (i21 < i18 && i21 < i2) {
                            i7 += -widgetRun.xMQ.J2;
                        }
                    }
                    i21++;
                    zL2 = z3;
                    i3 = 8;
                }
                z2 = zL2;
                f3 = 0.0f;
                if (i7 < i16 || i8 == 0) {
                    i5 = i22;
                    break;
                } else {
                    i20++;
                    zL2 = z2;
                    i3 = 8;
                }
            }
            z2 = zL2;
            f3 = 0.0f;
            f4 = 0.0f;
            i5 = 0;
            i7 = 0;
            i8 = 0;
            int i25 = this.KN.Uo;
            if (z2) {
                i25 = this.xMQ.Uo;
            }
            float f8 = 0.5f;
            if (i7 > i16) {
                i25 = z2 ? i25 + ((int) (((i7 - i16) / 2.0f) + 0.5f)) : i25 - ((int) (((i7 - i16) / 2.0f) + 0.5f));
            }
            if (i8 > 0) {
                float f9 = i16 - i7;
                int i26 = (int) ((f9 / i8) + 0.5f);
                int i27 = 0;
                int i28 = 0;
                while (i27 < size) {
                    WidgetRun widgetRun2 = (WidgetRun) this.gh.get(i27);
                    float f10 = f8;
                    int i29 = i25;
                    if (widgetRun2.rl.B() != 8 && widgetRun2.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        DimensionDependency dimensionDependency2 = widgetRun2.f35584O;
                        if (dimensionDependency2.mUb) {
                            f6 = f9;
                            i12 = i26;
                            i15 = i27;
                            i28 = i28;
                        } else {
                            int i30 = f4 > f3 ? (int) (((widgetRun2.rl.ER[this.J2] * f9) / f4) + f10) : i26;
                            f6 = f9;
                            if (this.J2 == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.rl;
                                i12 = i26;
                                i13 = constraintWidget.f35524g;
                                i14 = constraintWidget.nY;
                            } else {
                                i12 = i26;
                                ConstraintWidget constraintWidget2 = widgetRun2.rl;
                                i13 = constraintWidget2.fD;
                                i14 = constraintWidget2.iF;
                            }
                            i15 = i27;
                            int i31 = i28;
                            int iMax = Math.max(i14, widgetRun2.f35585n == 1 ? Math.min(i30, dimensionDependency2.az) : i30);
                            if (i13 > 0) {
                                iMax = Math.min(i13, iMax);
                            }
                            if (iMax != i30) {
                                i28 = i31 + 1;
                                i30 = iMax;
                            } else {
                                i28 = i31;
                            }
                            widgetRun2.f35584O.nr(i30);
                        }
                    }
                    i27 = i15 + 1;
                    f8 = f10;
                    i25 = i29;
                    f9 = f6;
                    i26 = i12;
                }
                i9 = i25;
                f5 = f8;
                int i32 = i28;
                if (i32 > 0) {
                    i8 -= i32;
                    i7 = 0;
                    for (int i33 = 0; i33 < size; i33++) {
                        WidgetRun widgetRun3 = (WidgetRun) this.gh.get(i33);
                        if (widgetRun3.rl.B() != 8) {
                            if (i33 > 0 && i33 >= i17) {
                                i7 += widgetRun3.KN.J2;
                            }
                            i7 += widgetRun3.f35584O.Uo;
                            if (i33 < i18 && i33 < i2) {
                                i7 += -widgetRun3.xMQ.J2;
                            }
                        }
                    }
                }
                i11 = 2;
                if (this.qie == 2 && i32 == 0) {
                    i10 = 0;
                    this.qie = 0;
                } else {
                    i10 = 0;
                }
            } else {
                i9 = i25;
                f5 = 0.5f;
                i10 = 0;
                i11 = 2;
            }
            if (i7 > i16) {
                this.qie = i11;
            }
            if (i5 > 0 && i8 == 0 && i17 == i2) {
                this.qie = i11;
            }
            int i34 = this.qie;
            if (i34 == 1) {
                int i35 = i5 > 1 ? (i16 - i7) / (i5 - 1) : i5 == 1 ? (i16 - i7) / 2 : i10;
                if (i8 > 0) {
                    i35 = i10;
                }
                int i36 = i9;
                while (i10 < size) {
                    WidgetRun widgetRun4 = (WidgetRun) this.gh.get(z2 ? size - (i10 + 1) : i10);
                    if (widgetRun4.rl.B() == 8) {
                        widgetRun4.KN.nr(i36);
                        widgetRun4.xMQ.nr(i36);
                    } else {
                        if (i10 > 0) {
                            i36 = z2 ? i36 - i35 : i36 + i35;
                        }
                        if (i10 > 0 && i10 >= i17) {
                            i36 = z2 ? i36 - widgetRun4.KN.J2 : i36 + widgetRun4.KN.J2;
                        }
                        if (z2) {
                            widgetRun4.xMQ.nr(i36);
                        } else {
                            widgetRun4.KN.nr(i36);
                        }
                        DimensionDependency dimensionDependency3 = widgetRun4.f35584O;
                        int i37 = dimensionDependency3.Uo;
                        if (widgetRun4.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.f35585n == 1) {
                            i37 = dimensionDependency3.az;
                        }
                        i36 = z2 ? i36 - i37 : i36 + i37;
                        if (z2) {
                            widgetRun4.KN.nr(i36);
                        } else {
                            widgetRun4.xMQ.nr(i36);
                        }
                        widgetRun4.Uo = true;
                        if (i10 < i18 && i10 < i2) {
                            i36 = z2 ? i36 - (-widgetRun4.xMQ.J2) : i36 + (-widgetRun4.xMQ.J2);
                        }
                    }
                    i10++;
                }
                return;
            }
            if (i34 == 0) {
                int i38 = (i16 - i7) / (i5 + 1);
                if (i8 > 0) {
                    i38 = i10;
                }
                int i39 = i9;
                while (i10 < size) {
                    WidgetRun widgetRun5 = (WidgetRun) this.gh.get(z2 ? size - (i10 + 1) : i10);
                    if (widgetRun5.rl.B() == 8) {
                        widgetRun5.KN.nr(i39);
                        widgetRun5.xMQ.nr(i39);
                    } else {
                        int i40 = z2 ? i39 - i38 : i39 + i38;
                        if (i10 > 0 && i10 >= i17) {
                            i40 = z2 ? i40 - widgetRun5.KN.J2 : i40 + widgetRun5.KN.J2;
                        }
                        if (z2) {
                            widgetRun5.xMQ.nr(i40);
                        } else {
                            widgetRun5.KN.nr(i40);
                        }
                        DimensionDependency dimensionDependency4 = widgetRun5.f35584O;
                        int iMin = dimensionDependency4.Uo;
                        if (widgetRun5.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.f35585n == 1) {
                            iMin = Math.min(iMin, dimensionDependency4.az);
                        }
                        i39 = z2 ? i40 - iMin : i40 + iMin;
                        if (z2) {
                            widgetRun5.KN.nr(i39);
                        } else {
                            widgetRun5.xMQ.nr(i39);
                        }
                        if (i10 < i18 && i10 < i2) {
                            i39 = z2 ? i39 - (-widgetRun5.xMQ.J2) : i39 + (-widgetRun5.xMQ.J2);
                        }
                    }
                    i10++;
                }
                return;
            }
            if (i34 == 2) {
                float fG = this.J2 == 0 ? this.rl.g() : this.rl.eF();
                if (z2) {
                    fG = 1.0f - fG;
                }
                int i41 = (int) (((i16 - i7) * fG) + f5);
                if (i41 < 0 || i8 > 0) {
                    i41 = i10;
                }
                int i42 = z2 ? i9 - i41 : i9 + i41;
                while (i10 < size) {
                    WidgetRun widgetRun6 = (WidgetRun) this.gh.get(z2 ? size - (i10 + 1) : i10);
                    if (widgetRun6.rl.B() == 8) {
                        widgetRun6.KN.nr(i42);
                        widgetRun6.xMQ.nr(i42);
                    } else {
                        if (i10 > 0 && i10 >= i17) {
                            i42 = z2 ? i42 - widgetRun6.KN.J2 : i42 + widgetRun6.KN.J2;
                        }
                        if (z2) {
                            widgetRun6.xMQ.nr(i42);
                        } else {
                            widgetRun6.KN.nr(i42);
                        }
                        DimensionDependency dimensionDependency5 = widgetRun6.f35584O;
                        int i43 = dimensionDependency5.Uo;
                        if (widgetRun6.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.f35585n == 1) {
                            i43 = dimensionDependency5.az;
                        }
                        i42 = z2 ? i42 - i43 : i42 + i43;
                        if (z2) {
                            widgetRun6.KN.nr(i42);
                        } else {
                            widgetRun6.xMQ.nr(i42);
                        }
                        if (i10 < i18 && i10 < i2) {
                            i42 = z2 ? i42 - (-widgetRun6.xMQ.J2) : i42 + (-widgetRun6.xMQ.J2);
                        }
                    }
                    i10++;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void nr() {
        Iterator it = this.gh.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).nr();
        }
        int size = this.gh.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = ((WidgetRun) this.gh.get(0)).rl;
        ConstraintWidget constraintWidget2 = ((WidgetRun) this.gh.get(size - 1)).rl;
        if (this.J2 == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.jB;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.P5;
            DependencyNode dependencyNodeXMQ = xMQ(constraintAnchor, 0);
            int iJ2 = constraintAnchor.J2();
            ConstraintWidget constraintWidgetR = r();
            if (constraintWidgetR != null) {
                iJ2 = constraintWidgetR.jB.J2();
            }
            if (dependencyNodeXMQ != null) {
                rl(this.KN, dependencyNodeXMQ, iJ2);
            }
            DependencyNode dependencyNodeXMQ2 = xMQ(constraintAnchor2, 0);
            int iJ22 = constraintAnchor2.J2();
            ConstraintWidget constraintWidgetO = o();
            if (constraintWidgetO != null) {
                iJ22 = constraintWidgetO.P5.J2();
            }
            if (dependencyNodeXMQ2 != null) {
                rl(this.xMQ, dependencyNodeXMQ2, -iJ22);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f35517U;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.M7;
            DependencyNode dependencyNodeXMQ3 = xMQ(constraintAnchor3, 1);
            int iJ23 = constraintAnchor3.J2();
            ConstraintWidget constraintWidgetR2 = r();
            if (constraintWidgetR2 != null) {
                iJ23 = constraintWidgetR2.f35517U.J2();
            }
            if (dependencyNodeXMQ3 != null) {
                rl(this.KN, dependencyNodeXMQ3, iJ23);
            }
            DependencyNode dependencyNodeXMQ4 = xMQ(constraintAnchor4, 1);
            int iJ24 = constraintAnchor4.J2();
            ConstraintWidget constraintWidgetO2 = o();
            if (constraintWidgetO2 != null) {
                iJ24 = constraintWidgetO2.M7.J2();
            }
            if (dependencyNodeXMQ4 != null) {
                rl(this.xMQ, dependencyNodeXMQ4, -iJ24);
            }
        }
        this.KN.f35561n = this;
        this.xMQ.f35561n = this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.J2 == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.gh) {
            sb.append("<");
            sb.append(widgetRun);
            sb.append("> ");
        }
        return sb.toString();
    }

    public ChainRun(ConstraintWidget constraintWidget, int i2) {
        super(constraintWidget);
        this.gh = new ArrayList();
        this.J2 = i2;
        Ik();
    }
}
