package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class VerticalWidgetRun extends WidgetRun {
    public DependencyNode gh;
    DimensionDependency qie;

    void Ik() {
        this.Uo = false;
        this.KN.t();
        this.KN.mUb = false;
        this.xMQ.t();
        this.xMQ.mUb = false;
        this.gh.t();
        this.gh.mUb = false;
        this.f35584O.mUb = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void J2() {
        this.f35586t = null;
        this.KN.t();
        this.xMQ.t();
        this.gh.t();
        this.f35584O.t();
        this.Uo = false;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f35577n;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f35577n = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35577n[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35577n[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void O() {
        DependencyNode dependencyNode = this.KN;
        if (dependencyNode.mUb) {
            this.rl.n7b(dependencyNode.Uo);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean az() {
        return this.nr != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.rl.aYN == 0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void n(Dependency dependency) {
        float f3;
        float fAYN;
        float fAYN2;
        int i2;
        int i3 = AnonymousClass1.f35577n[this.mUb.ordinal()];
        if (i3 == 1) {
            ck(dependency);
        } else if (i3 == 2) {
            HI(dependency);
        } else if (i3 == 3) {
            ConstraintWidget constraintWidget = this.rl;
            ty(dependency, constraintWidget.f35517U, constraintWidget.M7, 1);
            return;
        }
        DimensionDependency dimensionDependency = this.f35584O;
        if (dimensionDependency.f35562t && !dimensionDependency.mUb && this.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.rl;
            int i5 = constraintWidget2.aYN;
            if (i5 == 2) {
                ConstraintWidget constraintWidgetRV9 = constraintWidget2.rV9();
                if (constraintWidgetRV9 != null) {
                    if (constraintWidgetRV9.J2.f35584O.mUb) {
                        this.f35584O.nr((int) ((r7.Uo * this.rl.E2) + 0.5f));
                    }
                }
            } else if (i5 == 3 && constraintWidget2.f35514O.f35584O.mUb) {
                int iViF = constraintWidget2.ViF();
                if (iViF == -1) {
                    ConstraintWidget constraintWidget3 = this.rl;
                    f3 = constraintWidget3.f35514O.f35584O.Uo;
                    fAYN = constraintWidget3.aYN();
                } else if (iViF == 0) {
                    fAYN2 = r7.f35514O.f35584O.Uo * this.rl.aYN();
                    i2 = (int) (fAYN2 + 0.5f);
                    this.f35584O.nr(i2);
                } else if (iViF != 1) {
                    i2 = 0;
                    this.f35584O.nr(i2);
                } else {
                    ConstraintWidget constraintWidget4 = this.rl;
                    f3 = constraintWidget4.f35514O.f35584O.Uo;
                    fAYN = constraintWidget4.aYN();
                }
                fAYN2 = f3 / fAYN;
                i2 = (int) (fAYN2 + 0.5f);
                this.f35584O.nr(i2);
            }
        }
        DependencyNode dependencyNode = this.KN;
        if (dependencyNode.f35562t) {
            DependencyNode dependencyNode2 = this.xMQ;
            if (dependencyNode2.f35562t) {
                if (dependencyNode.mUb && dependencyNode2.mUb && this.f35584O.mUb) {
                    return;
                }
                if (!this.f35584O.mUb && this.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget5 = this.rl;
                    if (constraintWidget5.WPU == 0 && !constraintWidget5.xg()) {
                        DependencyNode dependencyNode3 = (DependencyNode) this.KN.qie.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) this.xMQ.qie.get(0);
                        int i7 = dependencyNode3.Uo;
                        DependencyNode dependencyNode5 = this.KN;
                        int i8 = i7 + dependencyNode5.J2;
                        int i9 = dependencyNode4.Uo + this.xMQ.J2;
                        dependencyNode5.nr(i8);
                        this.xMQ.nr(i9);
                        this.f35584O.nr(i9 - i8);
                        return;
                    }
                }
                if (!this.f35584O.mUb && this.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f35585n == 1 && this.KN.qie.size() > 0 && this.xMQ.qie.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) this.KN.qie.get(0);
                    int i10 = (((DependencyNode) this.xMQ.qie.get(0)).Uo + this.xMQ.J2) - (dependencyNode6.Uo + this.KN.J2);
                    DimensionDependency dimensionDependency2 = this.f35584O;
                    int i11 = dimensionDependency2.az;
                    if (i10 < i11) {
                        dimensionDependency2.nr(i10);
                    } else {
                        dimensionDependency2.nr(i11);
                    }
                }
                if (this.f35584O.mUb && this.KN.qie.size() > 0 && this.xMQ.qie.size() > 0) {
                    DependencyNode dependencyNode7 = (DependencyNode) this.KN.qie.get(0);
                    DependencyNode dependencyNode8 = (DependencyNode) this.xMQ.qie.get(0);
                    int i12 = dependencyNode7.Uo + this.KN.J2;
                    int i13 = dependencyNode8.Uo + this.xMQ.J2;
                    float fEF = this.rl.eF();
                    if (dependencyNode7 == dependencyNode8) {
                        i12 = dependencyNode7.Uo;
                        i13 = dependencyNode8.Uo;
                        fEF = 0.5f;
                    }
                    this.KN.nr((int) (i12 + 0.5f + (((i13 - i12) - this.f35584O.Uo) * fEF)));
                    this.xMQ.nr(this.KN.Uo + this.f35584O.Uo);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void nr() {
        ConstraintWidget constraintWidgetRV9;
        ConstraintWidget constraintWidgetRV92;
        ConstraintWidget constraintWidget = this.rl;
        if (constraintWidget.f35528n) {
            this.f35584O.nr(constraintWidget.nY());
        }
        if (!this.f35584O.mUb) {
            this.nr = this.rl.M();
            if (this.rl.I()) {
                this.qie = new BaselineDimensionDependency(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.nr;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetRV92 = this.rl.rV9()) != null && constraintWidgetRV92.M() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int iNY = (constraintWidgetRV92.nY() - this.rl.f35517U.J2()) - this.rl.M7.J2();
                    rl(this.KN, constraintWidgetRV92.J2.KN, this.rl.f35517U.J2());
                    rl(this.xMQ, constraintWidgetRV92.J2.xMQ, -this.rl.M7.J2());
                    this.f35584O.nr(iNY);
                    return;
                }
                if (this.nr == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f35584O.nr(this.rl.nY());
                }
            }
        } else if (this.nr == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetRV9 = this.rl.rV9()) != null && constraintWidgetRV9.M() == ConstraintWidget.DimensionBehaviour.FIXED) {
            rl(this.KN, constraintWidgetRV9.J2.KN, this.rl.f35517U.J2());
            rl(this.xMQ, constraintWidgetRV9.J2.xMQ, -this.rl.M7.J2());
            return;
        }
        DimensionDependency dimensionDependency = this.f35584O;
        boolean z2 = dimensionDependency.mUb;
        if (z2) {
            ConstraintWidget constraintWidget2 = this.rl;
            if (constraintWidget2.f35528n) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f35506FX;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.J2;
                if (constraintAnchor2 != null && constraintAnchorArr[3].J2 != null) {
                    if (constraintWidget2.xg()) {
                        this.KN.J2 = this.rl.f35506FX[2].J2();
                        this.xMQ.J2 = -this.rl.f35506FX[3].J2();
                    } else {
                        DependencyNode dependencyNodeKN = KN(this.rl.f35506FX[2]);
                        if (dependencyNodeKN != null) {
                            rl(this.KN, dependencyNodeKN, this.rl.f35506FX[2].J2());
                        }
                        DependencyNode dependencyNodeKN2 = KN(this.rl.f35506FX[3]);
                        if (dependencyNodeKN2 != null) {
                            rl(this.xMQ, dependencyNodeKN2, -this.rl.f35506FX[3].J2());
                        }
                        this.KN.rl = true;
                        this.xMQ.rl = true;
                    }
                    if (this.rl.I()) {
                        rl(this.gh, this.KN, this.rl.r());
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeKN3 = KN(constraintAnchor);
                    if (dependencyNodeKN3 != null) {
                        rl(this.KN, dependencyNodeKN3, this.rl.f35506FX[2].J2());
                        rl(this.xMQ, this.KN, this.f35584O.Uo);
                        if (this.rl.I()) {
                            rl(this.gh, this.KN, this.rl.r());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.J2 != null) {
                    DependencyNode dependencyNodeKN4 = KN(constraintAnchor3);
                    if (dependencyNodeKN4 != null) {
                        rl(this.xMQ, dependencyNodeKN4, -this.rl.f35506FX[3].J2());
                        rl(this.KN, this.xMQ, -this.f35584O.Uo);
                    }
                    if (this.rl.I()) {
                        rl(this.gh, this.KN, this.rl.r());
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.J2 != null) {
                    DependencyNode dependencyNodeKN5 = KN(constraintAnchor4);
                    if (dependencyNodeKN5 != null) {
                        rl(this.gh, dependencyNodeKN5, 0);
                        rl(this.KN, this.gh, -this.rl.r());
                        rl(this.xMQ, this.KN, this.f35584O.Uo);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof Helper) || constraintWidget2.rV9() == null || this.rl.Ik(ConstraintAnchor.Type.CENTER).J2 != null) {
                    return;
                }
                rl(this.KN, this.rl.rV9().J2.KN, this.rl.a());
                rl(this.xMQ, this.KN, this.f35584O.Uo);
                if (this.rl.I()) {
                    rl(this.gh, this.KN, this.rl.r());
                    return;
                }
                return;
            }
        }
        if (z2 || this.nr != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            dimensionDependency.rl(this);
        } else {
            ConstraintWidget constraintWidget3 = this.rl;
            int i2 = constraintWidget3.aYN;
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
            } else if (i2 == 3 && !constraintWidget3.xg()) {
                ConstraintWidget constraintWidget4 = this.rl;
                if (constraintWidget4.WPU != 3) {
                    DimensionDependency dimensionDependency4 = constraintWidget4.f35514O.f35584O;
                    this.f35584O.qie.add(dimensionDependency4);
                    dimensionDependency4.gh.add(this.f35584O);
                    DimensionDependency dimensionDependency5 = this.f35584O;
                    dimensionDependency5.rl = true;
                    dimensionDependency5.gh.add(this.KN);
                    this.f35584O.gh.add(this.xMQ);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.rl;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.f35506FX;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.J2;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].J2 != null) {
            if (constraintWidget5.xg()) {
                this.KN.J2 = this.rl.f35506FX[2].J2();
                this.xMQ.J2 = -this.rl.f35506FX[3].J2();
            } else {
                DependencyNode dependencyNodeKN6 = KN(this.rl.f35506FX[2]);
                DependencyNode dependencyNodeKN7 = KN(this.rl.f35506FX[3]);
                if (dependencyNodeKN6 != null) {
                    dependencyNodeKN6.rl(this);
                }
                if (dependencyNodeKN7 != null) {
                    dependencyNodeKN7.rl(this);
                }
                this.mUb = WidgetRun.RunType.CENTER;
            }
            if (this.rl.I()) {
                t(this.gh, this.KN, 1, this.qie);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode dependencyNodeKN8 = KN(constraintAnchor5);
            if (dependencyNodeKN8 != null) {
                rl(this.KN, dependencyNodeKN8, this.rl.f35506FX[2].J2());
                t(this.xMQ, this.KN, 1, this.f35584O);
                if (this.rl.I()) {
                    t(this.gh, this.KN, 1, this.qie);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.nr;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.rl.aYN() > 0.0f) {
                    HorizontalWidgetRun horizontalWidgetRun = this.rl.f35514O;
                    if (horizontalWidgetRun.nr == dimensionBehaviour3) {
                        horizontalWidgetRun.f35584O.gh.add(this.f35584O);
                        this.f35584O.qie.add(this.rl.f35514O.f35584O);
                        this.f35584O.f35561n = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.J2 != null) {
                DependencyNode dependencyNodeKN9 = KN(constraintAnchor7);
                if (dependencyNodeKN9 != null) {
                    rl(this.xMQ, dependencyNodeKN9, -this.rl.f35506FX[3].J2());
                    t(this.KN, this.xMQ, -1, this.f35584O);
                    if (this.rl.I()) {
                        t(this.gh, this.KN, 1, this.qie);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.J2 != null) {
                    DependencyNode dependencyNodeKN10 = KN(constraintAnchor8);
                    if (dependencyNodeKN10 != null) {
                        rl(this.gh, dependencyNodeKN10, 0);
                        t(this.KN, this.gh, -1, this.qie);
                        t(this.xMQ, this.KN, 1, this.f35584O);
                    }
                } else if (!(constraintWidget5 instanceof Helper) && constraintWidget5.rV9() != null) {
                    rl(this.KN, this.rl.rV9().J2.KN, this.rl.a());
                    t(this.xMQ, this.KN, 1, this.f35584O);
                    if (this.rl.I()) {
                        t(this.gh, this.KN, 1, this.qie);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.nr;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.rl.aYN() > 0.0f) {
                        HorizontalWidgetRun horizontalWidgetRun2 = this.rl.f35514O;
                        if (horizontalWidgetRun2.nr == dimensionBehaviour5) {
                            horizontalWidgetRun2.f35584O.gh.add(this.f35584O);
                            this.f35584O.qie.add(this.rl.f35514O.f35584O);
                            this.f35584O.f35561n = this;
                        }
                    }
                }
            }
        }
        if (this.f35584O.qie.size() == 0) {
            this.f35584O.f35562t = true;
        }
    }

    public String toString() {
        return "VerticalRun " + this.rl.S();
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.gh = dependencyNode;
        this.qie = null;
        this.KN.f35560O = DependencyNode.Type.TOP;
        this.xMQ.f35560O = DependencyNode.Type.BOTTOM;
        dependencyNode.f35560O = DependencyNode.Type.BASELINE;
        this.J2 = 1;
    }
}
