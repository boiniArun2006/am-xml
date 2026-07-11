package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0})
public final class ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1 implements MeasurePolicy {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ MutableState f34486O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ MutableState f34487n;
    final /* synthetic */ int nr;
    final /* synthetic */ Measurer2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ ConstraintSetForInlineDsl f34488t;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult rl(MeasureScope measureScope, final List list, long j2) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f34487n.getValue();
        long jR = this.rl.r(j2, measureScope.getLayoutDirection(), this.f34488t, list, linkedHashMap, this.nr);
        this.f34486O.getValue();
        int iUo = IntSize.Uo(jR);
        int iJ2 = IntSize.J2(jR);
        final Measurer2 measurer2 = this.rl;
        return MeasureScope.ER(measureScope, iUo, iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                measurer2.Ik(placementScope, list, linkedHashMap);
            }
        }, 4, null);
    }
}
