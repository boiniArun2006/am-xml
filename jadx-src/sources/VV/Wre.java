package VV;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Wre extends Modifier.Node implements LayoutModifierNode {
    private int Xw;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f10930v;

    static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Placeable f10931n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Placeable placeable) {
            super(1);
            this.f10931n = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Placeable.PlacementScope) obj);
            return Unit.INSTANCE;
        }

        public final void n(Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.az(layout, this.f10931n, 0, 0, 0.0f, 4, null);
        }
    }

    public final void UR(int i2) {
        this.Xw = i2;
    }

    public final void W5k(int i2) {
        this.f10930v = i2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measure, Measurable measurable, long j2) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jNr = ConstraintsKt.nr(j2, IntSizeKt.n(this.f10930v, this.Xw));
        Placeable placeableDR0 = measurable.dR0((Constraints.gh(j2) != Integer.MAX_VALUE || Constraints.qie(j2) == Integer.MAX_VALUE) ? (Constraints.qie(j2) != Integer.MAX_VALUE || Constraints.gh(j2) == Integer.MAX_VALUE) ? ConstraintsKt.n(IntSize.Uo(jNr), IntSize.Uo(jNr), IntSize.J2(jNr), IntSize.J2(jNr)) : ConstraintsKt.n((IntSize.J2(jNr) * this.f10930v) / this.Xw, (IntSize.J2(jNr) * this.f10930v) / this.Xw, IntSize.J2(jNr), IntSize.J2(jNr)) : ConstraintsKt.n(IntSize.Uo(jNr), IntSize.Uo(jNr), (IntSize.Uo(jNr) * this.Xw) / this.f10930v, (IntSize.Uo(jNr) * this.Xw) / this.f10930v));
        return MeasureScope.ER(measure, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new j(placeableDR0), 4, null);
    }

    public Wre(int i2, int i3) {
        this.f10930v = i2;
        this.Xw = i3;
    }
}
