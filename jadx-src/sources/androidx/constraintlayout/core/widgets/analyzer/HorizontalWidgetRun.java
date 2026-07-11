package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class HorizontalWidgetRun extends WidgetRun {
    private static int[] gh = new int[2];

    private void Ik(int[] iArr, int i2, int i3, int i5, int i7, float f3, int i8) {
        int i9 = i3 - i2;
        int i10 = i7 - i5;
        if (i8 != -1) {
            if (i8 == 0) {
                iArr[0] = (int) ((i10 * f3) + 0.5f);
                iArr[1] = i10;
                return;
            } else {
                if (i8 != 1) {
                    return;
                }
                iArr[0] = i9;
                iArr[1] = (int) ((i9 * f3) + 0.5f);
                return;
            }
        }
        int i11 = (int) ((i10 * f3) + 0.5f);
        int i12 = (int) ((i9 / f3) + 0.5f);
        if (i11 <= i9) {
            iArr[0] = i11;
            iArr[1] = i10;
        } else if (i12 <= i10) {
            iArr[0] = i9;
            iArr[1] = i12;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void J2() {
        this.f35586t = null;
        this.KN.t();
        this.xMQ.t();
        this.f35584O.t();
        this.Uo = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ca  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(Dependency dependency) {
        float f3;
        float fAYN;
        float fAYN2;
        int i2;
        int i3 = AnonymousClass1.f35573n[this.mUb.ordinal()];
        if (i3 == 1) {
            ck(dependency);
        } else if (i3 == 2) {
            HI(dependency);
        } else if (i3 == 3) {
            ConstraintWidget constraintWidget = this.rl;
            ty(dependency, constraintWidget.jB, constraintWidget.P5, 0);
            return;
        }
        if (!this.f35584O.mUb && this.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.rl;
            int i5 = constraintWidget2.WPU;
            if (i5 == 2) {
                ConstraintWidget constraintWidgetRV9 = constraintWidget2.rV9();
                if (constraintWidgetRV9 != null) {
                    if (constraintWidgetRV9.f35514O.f35584O.mUb) {
                        this.f35584O.nr((int) ((r1.Uo * this.rl.te) + 0.5f));
                    }
                }
            } else if (i5 == 3) {
                int i7 = constraintWidget2.aYN;
                if (i7 == 0 || i7 == 3) {
                    VerticalWidgetRun verticalWidgetRun = constraintWidget2.J2;
                    DependencyNode dependencyNode = verticalWidgetRun.KN;
                    DependencyNode dependencyNode2 = verticalWidgetRun.xMQ;
                    boolean z2 = constraintWidget2.jB.J2 != null;
                    boolean z3 = constraintWidget2.f35517U.J2 != null;
                    boolean z4 = constraintWidget2.P5.J2 != null;
                    boolean z5 = constraintWidget2.M7.J2 != null;
                    int iViF = constraintWidget2.ViF();
                    if (z2 && z3 && z4 && z5) {
                        float fAYN3 = this.rl.aYN();
                        if (dependencyNode.mUb && dependencyNode2.mUb) {
                            DependencyNode dependencyNode3 = this.KN;
                            if (dependencyNode3.f35562t && this.xMQ.f35562t) {
                                Ik(gh, this.KN.J2 + ((DependencyNode) dependencyNode3.qie.get(0)).Uo, ((DependencyNode) this.xMQ.qie.get(0)).Uo - this.xMQ.J2, dependencyNode.J2 + dependencyNode.Uo, dependencyNode2.Uo - dependencyNode2.J2, fAYN3, iViF);
                                this.f35584O.nr(gh[0]);
                                this.rl.J2.f35584O.nr(gh[1]);
                                return;
                            }
                            return;
                        }
                        DependencyNode dependencyNode4 = this.KN;
                        if (dependencyNode4.mUb) {
                            DependencyNode dependencyNode5 = this.xMQ;
                            if (dependencyNode5.mUb) {
                                if (!dependencyNode.f35562t || !dependencyNode2.f35562t) {
                                    return;
                                }
                                Ik(gh, dependencyNode4.Uo + dependencyNode4.J2, dependencyNode5.Uo - dependencyNode5.J2, dependencyNode.J2 + ((DependencyNode) dependencyNode.qie.get(0)).Uo, ((DependencyNode) dependencyNode2.qie.get(0)).Uo - dependencyNode2.J2, fAYN3, iViF);
                                this.f35584O.nr(gh[0]);
                                this.rl.J2.f35584O.nr(gh[1]);
                            }
                        }
                        DependencyNode dependencyNode6 = this.KN;
                        if (!dependencyNode6.f35562t || !this.xMQ.f35562t || !dependencyNode.f35562t || !dependencyNode2.f35562t) {
                            return;
                        }
                        Ik(gh, this.KN.J2 + ((DependencyNode) dependencyNode6.qie.get(0)).Uo, ((DependencyNode) this.xMQ.qie.get(0)).Uo - this.xMQ.J2, dependencyNode.J2 + ((DependencyNode) dependencyNode.qie.get(0)).Uo, ((DependencyNode) dependencyNode2.qie.get(0)).Uo - dependencyNode2.J2, fAYN3, iViF);
                        this.f35584O.nr(gh[0]);
                        this.rl.J2.f35584O.nr(gh[1]);
                    } else if (z2 && z4) {
                        if (!this.KN.f35562t || !this.xMQ.f35562t) {
                            return;
                        }
                        float fAYN4 = this.rl.aYN();
                        int i8 = ((DependencyNode) this.KN.qie.get(0)).Uo + this.KN.J2;
                        int i9 = ((DependencyNode) this.xMQ.qie.get(0)).Uo - this.xMQ.J2;
                        if (iViF == -1 || iViF == 0) {
                            int iUo = Uo(i9 - i8, 0);
                            int i10 = (int) ((iUo * fAYN4) + 0.5f);
                            int iUo2 = Uo(i10, 1);
                            if (i10 != iUo2) {
                                iUo = (int) ((iUo2 / fAYN4) + 0.5f);
                            }
                            this.f35584O.nr(iUo);
                            this.rl.J2.f35584O.nr(iUo2);
                        } else if (iViF == 1) {
                            int iUo3 = Uo(i9 - i8, 0);
                            int i11 = (int) ((iUo3 / fAYN4) + 0.5f);
                            int iUo4 = Uo(i11, 1);
                            if (i11 != iUo4) {
                                iUo3 = (int) ((iUo4 * fAYN4) + 0.5f);
                            }
                            this.f35584O.nr(iUo3);
                            this.rl.J2.f35584O.nr(iUo4);
                        }
                    } else if (z3 && z5) {
                        if (!dependencyNode.f35562t || !dependencyNode2.f35562t) {
                            return;
                        }
                        float fAYN5 = this.rl.aYN();
                        int i12 = ((DependencyNode) dependencyNode.qie.get(0)).Uo + dependencyNode.J2;
                        int i13 = ((DependencyNode) dependencyNode2.qie.get(0)).Uo - dependencyNode2.J2;
                        if (iViF == -1) {
                            int iUo5 = Uo(i13 - i12, 1);
                            int i14 = (int) ((iUo5 / fAYN5) + 0.5f);
                            int iUo6 = Uo(i14, 0);
                            if (i14 != iUo6) {
                                iUo5 = (int) ((iUo6 * fAYN5) + 0.5f);
                            }
                            this.f35584O.nr(iUo6);
                            this.rl.J2.f35584O.nr(iUo5);
                        } else if (iViF == 0) {
                            int iUo7 = Uo(i13 - i12, 1);
                            int i15 = (int) ((iUo7 * fAYN5) + 0.5f);
                            int iUo8 = Uo(i15, 0);
                            if (i15 != iUo8) {
                                iUo7 = (int) ((iUo8 / fAYN5) + 0.5f);
                            }
                            this.f35584O.nr(iUo8);
                            this.rl.J2.f35584O.nr(iUo7);
                        } else if (iViF == 1) {
                        }
                    }
                } else {
                    int iViF2 = constraintWidget2.ViF();
                    if (iViF2 == -1) {
                        ConstraintWidget constraintWidget3 = this.rl;
                        f3 = constraintWidget3.J2.f35584O.Uo;
                        fAYN = constraintWidget3.aYN();
                    } else if (iViF2 == 0) {
                        fAYN2 = r1.J2.f35584O.Uo / this.rl.aYN();
                        i2 = (int) (fAYN2 + 0.5f);
                        this.f35584O.nr(i2);
                    } else if (iViF2 != 1) {
                        i2 = 0;
                        this.f35584O.nr(i2);
                    } else {
                        ConstraintWidget constraintWidget4 = this.rl;
                        f3 = constraintWidget4.J2.f35584O.Uo;
                        fAYN = constraintWidget4.aYN();
                    }
                    fAYN2 = f3 * fAYN;
                    i2 = (int) (fAYN2 + 0.5f);
                    this.f35584O.nr(i2);
                }
            }
        }
        DependencyNode dependencyNode7 = this.KN;
        if (dependencyNode7.f35562t) {
            DependencyNode dependencyNode8 = this.xMQ;
            if (dependencyNode8.f35562t) {
                if (dependencyNode7.mUb && dependencyNode8.mUb && this.f35584O.mUb) {
                    return;
                }
                if (!this.f35584O.mUb && this.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget5 = this.rl;
                    if (constraintWidget5.WPU == 0 && !constraintWidget5.m()) {
                        DependencyNode dependencyNode9 = (DependencyNode) this.KN.qie.get(0);
                        DependencyNode dependencyNode10 = (DependencyNode) this.xMQ.qie.get(0);
                        int i16 = dependencyNode9.Uo;
                        DependencyNode dependencyNode11 = this.KN;
                        int i17 = i16 + dependencyNode11.J2;
                        int i18 = dependencyNode10.Uo + this.xMQ.J2;
                        dependencyNode11.nr(i17);
                        this.xMQ.nr(i18);
                        this.f35584O.nr(i18 - i17);
                        return;
                    }
                }
                if (!this.f35584O.mUb && this.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f35585n == 1 && this.KN.qie.size() > 0 && this.xMQ.qie.size() > 0) {
                    int iMin = Math.min((((DependencyNode) this.xMQ.qie.get(0)).Uo + this.xMQ.J2) - (((DependencyNode) this.KN.qie.get(0)).Uo + this.KN.J2), this.f35584O.az);
                    ConstraintWidget constraintWidget6 = this.rl;
                    int i19 = constraintWidget6.f35524g;
                    int iMax = Math.max(constraintWidget6.nY, iMin);
                    if (i19 > 0) {
                        iMax = Math.min(i19, iMax);
                    }
                    this.f35584O.nr(iMax);
                }
                if (this.f35584O.mUb) {
                    DependencyNode dependencyNode12 = (DependencyNode) this.KN.qie.get(0);
                    DependencyNode dependencyNode13 = (DependencyNode) this.xMQ.qie.get(0);
                    int i20 = dependencyNode12.Uo + this.KN.J2;
                    int i21 = dependencyNode13.Uo + this.xMQ.J2;
                    float fG = this.rl.g();
                    if (dependencyNode12 == dependencyNode13) {
                        i20 = dependencyNode12.Uo;
                        i21 = dependencyNode13.Uo;
                        fG = 0.5f;
                    }
                    this.KN.nr((int) (i20 + 0.5f + (((i21 - i20) - this.f35584O.Uo) * fG)));
                    this.xMQ.nr(this.KN.Uo + this.f35584O.Uo);
                }
            }
        }
    }

    void r() {
        this.Uo = false;
        this.KN.t();
        this.KN.mUb = false;
        this.xMQ.t();
        this.xMQ.mUb = false;
        this.f35584O.mUb = false;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f35573n;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f35573n = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35573n[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35573n[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void O() {
        DependencyNode dependencyNode = this.KN;
        if (dependencyNode.mUb) {
            this.rl.o9(dependencyNode.Uo);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean az() {
        return this.nr != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.rl.WPU == 0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void nr() {
        ConstraintWidget constraintWidgetRV9;
        ConstraintWidget constraintWidgetRV92;
        ConstraintWidget constraintWidget = this.rl;
        if (constraintWidget.f35528n) {
            this.f35584O.nr(constraintWidget.J());
        }
        if (this.f35584O.mUb) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.nr;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (constraintWidgetRV9 = this.rl.rV9()) != null && (constraintWidgetRV9.iF() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetRV9.iF() == dimensionBehaviour2)) {
                rl(this.KN, constraintWidgetRV9.f35514O.KN, this.rl.jB.J2());
                rl(this.xMQ, constraintWidgetRV9.f35514O.xMQ, -this.rl.P5.J2());
                return;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourIF = this.rl.iF();
            this.nr = dimensionBehaviourIF;
            if (dimensionBehaviourIF != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviourIF == dimensionBehaviour3 && (constraintWidgetRV92 = this.rl.rV9()) != null && (constraintWidgetRV92.iF() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetRV92.iF() == dimensionBehaviour3)) {
                    int iJ = (constraintWidgetRV92.J() - this.rl.jB.J2()) - this.rl.P5.J2();
                    rl(this.KN, constraintWidgetRV92.f35514O.KN, this.rl.jB.J2());
                    rl(this.xMQ, constraintWidgetRV92.f35514O.xMQ, -this.rl.P5.J2());
                    this.f35584O.nr(iJ);
                    return;
                }
                if (this.nr == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f35584O.nr(this.rl.J());
                }
            }
        }
        DimensionDependency dimensionDependency = this.f35584O;
        if (dimensionDependency.mUb) {
            ConstraintWidget constraintWidget2 = this.rl;
            if (constraintWidget2.f35528n) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f35506FX;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.J2;
                if (constraintAnchor2 != null && constraintAnchorArr[1].J2 != null) {
                    if (constraintWidget2.m()) {
                        this.KN.J2 = this.rl.f35506FX[0].J2();
                        this.xMQ.J2 = -this.rl.f35506FX[1].J2();
                        return;
                    }
                    DependencyNode dependencyNodeKN = KN(this.rl.f35506FX[0]);
                    if (dependencyNodeKN != null) {
                        rl(this.KN, dependencyNodeKN, this.rl.f35506FX[0].J2());
                    }
                    DependencyNode dependencyNodeKN2 = KN(this.rl.f35506FX[1]);
                    if (dependencyNodeKN2 != null) {
                        rl(this.xMQ, dependencyNodeKN2, -this.rl.f35506FX[1].J2());
                    }
                    this.KN.rl = true;
                    this.xMQ.rl = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeKN3 = KN(constraintAnchor);
                    if (dependencyNodeKN3 != null) {
                        rl(this.KN, dependencyNodeKN3, this.rl.f35506FX[0].J2());
                        rl(this.xMQ, this.KN, this.f35584O.Uo);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.J2 != null) {
                    DependencyNode dependencyNodeKN4 = KN(constraintAnchor3);
                    if (dependencyNodeKN4 != null) {
                        rl(this.xMQ, dependencyNodeKN4, -this.rl.f35506FX[1].J2());
                        rl(this.KN, this.xMQ, -this.f35584O.Uo);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof Helper) || constraintWidget2.rV9() == null || this.rl.Ik(ConstraintAnchor.Type.CENTER).J2 != null) {
                    return;
                }
                rl(this.KN, this.rl.rV9().f35514O.KN, this.rl.D());
                rl(this.xMQ, this.KN, this.f35584O.Uo);
                return;
            }
        }
        if (this.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.rl;
            int i2 = constraintWidget3.WPU;
            if (i2 == 2) {
                ConstraintWidget constraintWidgetRV93 = constraintWidget3.rV9();
                if (constraintWidgetRV93 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidgetRV93.J2.f35584O;
                    this.f35584O.qie.add(dimensionDependency2);
                    dimensionDependency2.gh.add(this.f35584O);
                    DimensionDependency dimensionDependency3 = this.f35584O;
                    dimensionDependency3.rl = true;
                    dimensionDependency3.gh.add(this.KN);
                    this.f35584O.gh.add(this.xMQ);
                }
            } else if (i2 == 3) {
                if (constraintWidget3.aYN == 3) {
                    this.KN.f35561n = this;
                    this.xMQ.f35561n = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget3.J2;
                    verticalWidgetRun.KN.f35561n = this;
                    verticalWidgetRun.xMQ.f35561n = this;
                    dimensionDependency.f35561n = this;
                    if (constraintWidget3.xg()) {
                        this.f35584O.qie.add(this.rl.J2.f35584O);
                        this.rl.J2.f35584O.gh.add(this.f35584O);
                        VerticalWidgetRun verticalWidgetRun2 = this.rl.J2;
                        verticalWidgetRun2.f35584O.f35561n = this;
                        this.f35584O.qie.add(verticalWidgetRun2.KN);
                        this.f35584O.qie.add(this.rl.J2.xMQ);
                        this.rl.J2.KN.gh.add(this.f35584O);
                        this.rl.J2.xMQ.gh.add(this.f35584O);
                    } else if (this.rl.m()) {
                        this.rl.J2.f35584O.qie.add(this.f35584O);
                        this.f35584O.gh.add(this.rl.J2.f35584O);
                    } else {
                        this.rl.J2.f35584O.qie.add(this.f35584O);
                    }
                } else {
                    DimensionDependency dimensionDependency4 = constraintWidget3.J2.f35584O;
                    dimensionDependency.qie.add(dimensionDependency4);
                    dimensionDependency4.gh.add(this.f35584O);
                    this.rl.J2.KN.gh.add(this.f35584O);
                    this.rl.J2.xMQ.gh.add(this.f35584O);
                    DimensionDependency dimensionDependency5 = this.f35584O;
                    dimensionDependency5.rl = true;
                    dimensionDependency5.gh.add(this.KN);
                    this.f35584O.gh.add(this.xMQ);
                    this.KN.qie.add(this.f35584O);
                    this.xMQ.qie.add(this.f35584O);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.rl;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.f35506FX;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.J2;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].J2 != null) {
            if (constraintWidget4.m()) {
                this.KN.J2 = this.rl.f35506FX[0].J2();
                this.xMQ.J2 = -this.rl.f35506FX[1].J2();
                return;
            }
            DependencyNode dependencyNodeKN5 = KN(this.rl.f35506FX[0]);
            DependencyNode dependencyNodeKN6 = KN(this.rl.f35506FX[1]);
            if (dependencyNodeKN5 != null) {
                dependencyNodeKN5.rl(this);
            }
            if (dependencyNodeKN6 != null) {
                dependencyNodeKN6.rl(this);
            }
            this.mUb = WidgetRun.RunType.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode dependencyNodeKN7 = KN(constraintAnchor4);
            if (dependencyNodeKN7 != null) {
                rl(this.KN, dependencyNodeKN7, this.rl.f35506FX[0].J2());
                t(this.xMQ, this.KN, 1, this.f35584O);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.J2 != null) {
            DependencyNode dependencyNodeKN8 = KN(constraintAnchor6);
            if (dependencyNodeKN8 != null) {
                rl(this.xMQ, dependencyNodeKN8, -this.rl.f35506FX[1].J2());
                t(this.KN, this.xMQ, -1, this.f35584O);
                return;
            }
            return;
        }
        if ((constraintWidget4 instanceof Helper) || constraintWidget4.rV9() == null) {
            return;
        }
        rl(this.KN, this.rl.rV9().f35514O.KN, this.rl.D());
        t(this.xMQ, this.KN, 1, this.f35584O);
    }

    public String toString() {
        return "HorizontalRun " + this.rl.S();
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.KN.f35560O = DependencyNode.Type.LEFT;
        this.xMQ.f35560O = DependencyNode.Type.RIGHT;
        this.J2 = 0;
    }
}
