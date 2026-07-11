package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class HelperReference extends ConstraintReference implements Facade {
    final State.Helper eTf;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final State f35396m;
    private HelperWidget pJg;
    protected ArrayList xg;

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
    }

    public HelperReference Mx(Object... objArr) {
        Collections.addAll(this.xg, objArr);
        return this;
    }

    public State.Helper eWT() {
        return this.eTf;
    }

    public HelperWidget fcU() {
        return this.pJg;
    }

    public HelperReference(State state, State.Helper helper) {
        super(state);
        this.xg = new ArrayList();
        this.f35396m = state;
        this.eTf = helper;
    }

    public void G7() {
        super.apply();
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget n() {
        return fcU();
    }
}
