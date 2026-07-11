package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class HelperReferences extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void J2() {
        this.f35586t = null;
        this.KN.t();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean az() {
        return false;
    }

    private void Ik(DependencyNode dependencyNode) {
        this.KN.gh.add(dependencyNode);
        dependencyNode.qie.add(this.KN);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void O() {
        ConstraintWidget constraintWidget = this.rl;
        if (constraintWidget instanceof Barrier) {
            int iWKp = ((Barrier) constraintWidget).wKp();
            if (iWKp == 0 || iWKp == 1) {
                this.rl.o9(this.KN.Uo);
            } else {
                this.rl.n7b(this.KN.Uo);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void n(Dependency dependency) {
        Barrier barrier = (Barrier) this.rl;
        int iWKp = barrier.wKp();
        Iterator it = this.KN.qie.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i5 = ((DependencyNode) it.next()).Uo;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (iWKp == 0 || iWKp == 2) {
            this.KN.nr(i3 + barrier.Th());
        } else {
            this.KN.nr(i2 + barrier.Th());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void nr() {
        ConstraintWidget constraintWidget = this.rl;
        if (constraintWidget instanceof Barrier) {
            this.KN.rl = true;
            Barrier barrier = (Barrier) constraintWidget;
            int iWKp = barrier.wKp();
            boolean zToy = barrier.Toy();
            int i2 = 0;
            if (iWKp == 0) {
                this.KN.f35560O = DependencyNode.Type.LEFT;
                while (i2 < barrier.VwL) {
                    ConstraintWidget constraintWidget2 = barrier.tFV[i2];
                    if (zToy || constraintWidget2.B() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.f35514O.KN;
                        dependencyNode.gh.add(this.KN);
                        this.KN.qie.add(dependencyNode);
                    }
                    i2++;
                }
                Ik(this.rl.f35514O.KN);
                Ik(this.rl.f35514O.xMQ);
                return;
            }
            if (iWKp == 1) {
                this.KN.f35560O = DependencyNode.Type.RIGHT;
                while (i2 < barrier.VwL) {
                    ConstraintWidget constraintWidget3 = barrier.tFV[i2];
                    if (zToy || constraintWidget3.B() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.f35514O.xMQ;
                        dependencyNode2.gh.add(this.KN);
                        this.KN.qie.add(dependencyNode2);
                    }
                    i2++;
                }
                Ik(this.rl.f35514O.KN);
                Ik(this.rl.f35514O.xMQ);
                return;
            }
            if (iWKp == 2) {
                this.KN.f35560O = DependencyNode.Type.TOP;
                while (i2 < barrier.VwL) {
                    ConstraintWidget constraintWidget4 = barrier.tFV[i2];
                    if (zToy || constraintWidget4.B() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.J2.KN;
                        dependencyNode3.gh.add(this.KN);
                        this.KN.qie.add(dependencyNode3);
                    }
                    i2++;
                }
                Ik(this.rl.J2.KN);
                Ik(this.rl.J2.xMQ);
                return;
            }
            if (iWKp != 3) {
                return;
            }
            this.KN.f35560O = DependencyNode.Type.BOTTOM;
            while (i2 < barrier.VwL) {
                ConstraintWidget constraintWidget5 = barrier.tFV[i2];
                if (zToy || constraintWidget5.B() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.J2.xMQ;
                    dependencyNode4.gh.add(this.KN);
                    this.KN.qie.add(dependencyNode4);
                }
                i2++;
            }
            Ik(this.rl.J2.KN);
            Ik(this.rl.J2.xMQ);
        }
    }

    HelperReferences(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }
}
