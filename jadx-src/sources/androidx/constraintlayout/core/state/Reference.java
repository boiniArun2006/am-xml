package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface Reference {
    void apply();

    Object getKey();

    ConstraintWidget n();

    Facade nr();

    void rl(ConstraintWidget constraintWidget);

    void t(Object obj);
}
