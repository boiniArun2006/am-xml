package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class GuidelineReference extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean az() {
        return false;
    }

    private void Ik(DependencyNode dependencyNode) {
        this.KN.gh.add(dependencyNode);
        dependencyNode.qie.add(this.KN);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void J2() {
        this.KN.t();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void O() {
        if (((Guideline) this.rl).Mh() == 1) {
            this.rl.o9(this.KN.Uo);
        } else {
            this.rl.n7b(this.KN.Uo);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void n(Dependency dependency) {
        DependencyNode dependencyNode = this.KN;
        if (dependencyNode.f35562t && !dependencyNode.mUb) {
            this.KN.nr((int) ((((DependencyNode) dependencyNode.qie.get(0)).Uo * ((Guideline) this.rl).wKp()) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void nr() {
        Guideline guideline = (Guideline) this.rl;
        int iJO = guideline.jO();
        int iToy = guideline.Toy();
        guideline.wKp();
        if (guideline.Mh() == 1) {
            if (iJO != -1) {
                this.KN.qie.add(this.rl.f35522a.f35514O.KN);
                this.rl.f35522a.f35514O.KN.gh.add(this.KN);
                this.KN.J2 = iJO;
            } else if (iToy != -1) {
                this.KN.qie.add(this.rl.f35522a.f35514O.xMQ);
                this.rl.f35522a.f35514O.xMQ.gh.add(this.KN);
                this.KN.J2 = -iToy;
            } else {
                DependencyNode dependencyNode = this.KN;
                dependencyNode.rl = true;
                dependencyNode.qie.add(this.rl.f35522a.f35514O.xMQ);
                this.rl.f35522a.f35514O.xMQ.gh.add(this.KN);
            }
            Ik(this.rl.f35514O.KN);
            Ik(this.rl.f35514O.xMQ);
            return;
        }
        if (iJO != -1) {
            this.KN.qie.add(this.rl.f35522a.J2.KN);
            this.rl.f35522a.J2.KN.gh.add(this.KN);
            this.KN.J2 = iJO;
        } else if (iToy != -1) {
            this.KN.qie.add(this.rl.f35522a.J2.xMQ);
            this.rl.f35522a.J2.xMQ.gh.add(this.KN);
            this.KN.J2 = -iToy;
        } else {
            DependencyNode dependencyNode2 = this.KN;
            dependencyNode2.rl = true;
            dependencyNode2.qie.add(this.rl.f35522a.J2.xMQ);
            this.rl.f35522a.J2.xMQ.gh.add(this.KN);
        }
        Ik(this.rl.J2.KN);
        Ik(this.rl.J2.xMQ);
    }

    GuidelineReference(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f35514O.J2();
        constraintWidget.J2.J2();
        this.J2 = ((Guideline) constraintWidget).Mh();
    }
}
