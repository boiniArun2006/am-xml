package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class WidgetRun implements Dependency {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35585n;
    protected ConstraintWidget.DimensionBehaviour nr;
    ConstraintWidget rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    RunGroup f35586t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    DimensionDependency f35584O = new DimensionDependency(this);
    public int J2 = 0;
    boolean Uo = false;
    public DependencyNode KN = new DependencyNode(this);
    public DependencyNode xMQ = new DependencyNode(this);
    protected RunType mUb = RunType.NONE;

    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    protected void HI(Dependency dependency) {
    }

    abstract void J2();

    abstract void O();

    abstract boolean az();

    protected void ck(Dependency dependency) {
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void n(Dependency dependency) {
    }

    abstract void nr();

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f35587n;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f35587n = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35587n[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35587n[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35587n[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35587n[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void qie(int i2, int i3) {
        int i5 = this.f35585n;
        if (i5 == 0) {
            this.f35584O.nr(Uo(i3, i2));
            return;
        }
        if (i5 == 1) {
            this.f35584O.nr(Math.min(Uo(this.f35584O.az, i2), i3));
            return;
        }
        if (i5 == 2) {
            ConstraintWidget constraintWidgetRV9 = this.rl.rV9();
            if (constraintWidgetRV9 != null) {
                if ((i2 == 0 ? constraintWidgetRV9.f35514O : constraintWidgetRV9.J2).f35584O.mUb) {
                    this.f35584O.nr(Uo((int) ((r9.Uo * (i2 == 0 ? this.rl.te : this.rl.E2)) + 0.5f), i2));
                    return;
                }
                return;
            }
            return;
        }
        if (i5 != 3) {
            return;
        }
        ConstraintWidget constraintWidget = this.rl;
        WidgetRun widgetRun = constraintWidget.f35514O;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.nr;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.f35585n == 3) {
            VerticalWidgetRun verticalWidgetRun = constraintWidget.J2;
            if (verticalWidgetRun.nr == dimensionBehaviour2 && verticalWidgetRun.f35585n == 3) {
                return;
            }
        }
        if (i2 == 0) {
            widgetRun = constraintWidget.J2;
        }
        if (widgetRun.f35584O.mUb) {
            float fAYN = constraintWidget.aYN();
            this.f35584O.nr(i2 == 1 ? (int) ((widgetRun.f35584O.Uo / fAYN) + 0.5f) : (int) ((fAYN * widgetRun.f35584O.Uo) + 0.5f));
        }
    }

    protected final DependencyNode KN(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.J2;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.nr;
        int i2 = AnonymousClass1.f35587n[constraintAnchor2.f35490O.ordinal()];
        if (i2 == 1) {
            return constraintWidget.f35514O.KN;
        }
        if (i2 == 2) {
            return constraintWidget.f35514O.xMQ;
        }
        if (i2 == 3) {
            return constraintWidget.J2.KN;
        }
        if (i2 == 4) {
            return constraintWidget.J2.gh;
        }
        if (i2 != 5) {
            return null;
        }
        return constraintWidget.J2.xMQ;
    }

    protected final int Uo(int i2, int i3) {
        if (i3 == 0) {
            ConstraintWidget constraintWidget = this.rl;
            int i5 = constraintWidget.f35524g;
            int iMax = Math.max(constraintWidget.nY, i2);
            if (i5 > 0) {
                iMax = Math.min(i5, i2);
            }
            if (iMax != i2) {
                return iMax;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.rl;
            int i7 = constraintWidget2.fD;
            int iMax2 = Math.max(constraintWidget2.iF, i2);
            if (i7 > 0) {
                iMax2 = Math.min(i7, i2);
            }
            if (iMax2 != i2) {
                return iMax2;
            }
        }
        return i2;
    }

    public boolean gh() {
        return this.Uo;
    }

    public long mUb() {
        if (this.f35584O.mUb) {
            return r0.Uo;
        }
        return 0L;
    }

    protected final void rl(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2) {
        dependencyNode.qie.add(dependencyNode2);
        dependencyNode.J2 = i2;
        dependencyNode2.gh.add(dependencyNode);
    }

    protected final void t(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2, DimensionDependency dimensionDependency) {
        dependencyNode.qie.add(dependencyNode2);
        dependencyNode.qie.add(this.f35584O);
        dependencyNode.KN = i2;
        dependencyNode.xMQ = dimensionDependency;
        dependencyNode2.gh.add(dependencyNode);
        dimensionDependency.gh.add(dependencyNode);
    }

    protected final DependencyNode xMQ(ConstraintAnchor constraintAnchor, int i2) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.J2;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.nr;
        WidgetRun widgetRun = i2 == 0 ? constraintWidget.f35514O : constraintWidget.J2;
        int i3 = AnonymousClass1.f35587n[constraintAnchor2.f35490O.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.xMQ;
        }
        return widgetRun.KN;
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.rl = constraintWidget;
    }

    protected void ty(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
        float fEF;
        DependencyNode dependencyNodeKN = KN(constraintAnchor);
        DependencyNode dependencyNodeKN2 = KN(constraintAnchor2);
        if (dependencyNodeKN.mUb && dependencyNodeKN2.mUb) {
            int iJ2 = dependencyNodeKN.Uo + constraintAnchor.J2();
            int iJ22 = dependencyNodeKN2.Uo - constraintAnchor2.J2();
            int i3 = iJ22 - iJ2;
            if (!this.f35584O.mUb && this.nr == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                qie(i2, i3);
            }
            DimensionDependency dimensionDependency = this.f35584O;
            if (dimensionDependency.mUb) {
                if (dimensionDependency.Uo == i3) {
                    this.KN.nr(iJ2);
                    this.xMQ.nr(iJ22);
                    return;
                }
                if (i2 == 0) {
                    fEF = this.rl.g();
                } else {
                    fEF = this.rl.eF();
                }
                if (dependencyNodeKN == dependencyNodeKN2) {
                    iJ2 = dependencyNodeKN.Uo;
                    iJ22 = dependencyNodeKN2.Uo;
                    fEF = 0.5f;
                }
                this.KN.nr((int) (iJ2 + 0.5f + (((iJ22 - iJ2) - this.f35584O.Uo) * fEF)));
                this.xMQ.nr(this.KN.Uo + this.f35584O.Uo);
            }
        }
    }
}
