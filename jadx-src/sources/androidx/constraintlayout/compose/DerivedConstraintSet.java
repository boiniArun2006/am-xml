package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\ba\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", c.f62177j, "(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V", "qie", "(Landroidx/constraintlayout/compose/State;)V", "J2", "()Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DerivedConstraintSet extends ConstraintSet {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    ConstraintSet J2();

    void qie(State state);

    @Override // androidx.constraintlayout.compose.ConstraintSet
    default void n(State state, List measurables) {
        ConstraintSet constraintSetJ2 = J2();
        if (constraintSetJ2 != null) {
            constraintSetJ2.n(state, measurables);
        }
        qie(state);
    }
}
