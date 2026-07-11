package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class GuidelineReference implements Facade, Reference {
    private Object Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final State f35477n;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Guideline f35478t;
    private int nr = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f35476O = -1;
    private float J2 = 0.0f;

    public GuidelineReference J2(float f3) {
        this.nr = -1;
        this.f35476O = -1;
        this.J2 = f3;
        return this;
    }

    public GuidelineReference O(Object obj) {
        this.nr = -1;
        this.f35476O = this.f35477n.O(obj);
        this.J2 = 0.0f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade nr() {
        return null;
    }

    public GuidelineReference KN(Object obj) {
        this.nr = this.f35477n.O(obj);
        this.f35476O = -1;
        this.J2 = 0.0f;
        return this;
    }

    public void Uo(int i2) {
        this.rl = i2;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.f35478t.I9f(this.rl);
        int i2 = this.nr;
        if (i2 != -1) {
            this.f35478t.xzo(i2);
            return;
        }
        int i3 = this.f35476O;
        if (i3 != -1) {
            this.f35478t.XNZ(i3);
        } else {
            this.f35478t.lNy(this.J2);
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.Uo;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget n() {
        if (this.f35478t == null) {
            this.f35478t = new Guideline();
        }
        return this.f35478t;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void rl(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof Guideline) {
            this.f35478t = (Guideline) constraintWidget;
        } else {
            this.f35478t = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void t(Object obj) {
        this.Uo = obj;
    }

    public GuidelineReference(State state) {
        this.f35477n = state;
    }
}
