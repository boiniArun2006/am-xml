package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material3/CenteredContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "<init>", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExpressiveNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,459:1\n151#2,3:460\n33#2,4:463\n154#2,2:467\n38#2:469\n156#2:470\n33#2,6:471\n151#2,3:477\n33#2,4:480\n154#2,2:484\n38#2:486\n156#2:487\n*S KotlinDebug\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n*L\n364#1:460,3\n364#1:463,4\n364#1:467,2\n364#1:469\n364#1:470\n373#1:471,6\n380#1:477,3\n380#1:480,4\n380#1:484,2\n380#1:486\n380#1:487\n*E\n"})
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
        final ArrayList arrayList;
        int iCoerceAtMost;
        int iQie = Constraints.qie(j2);
        int iAz = Constraints.az(j2);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.ER(measureScope, iQie, iAz, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$1
                public final void n(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    n(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        int i2 = 0;
        if (Constraints.KN(j2)) {
            int i3 = iQie / size;
            int iMUb = ExpressiveNavigationBarKt.mUb(size, iQie);
            intRef.element = iMUb;
            int i5 = (iQie - (iMUb * 2)) / size;
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                int iG = ((Measurable) list.get(i7)).g(i5);
                if (iAz < iG) {
                    iAz = RangesKt.coerceAtMost(iG, Constraints.gh(j2));
                }
            }
            arrayList = new ArrayList(list.size());
            int size3 = list.size();
            while (i2 < size3) {
                Measurable measurable = (Measurable) list.get(i2);
                int iNxk = measurable.Nxk(Constraints.az(j2));
                if (i5 < iNxk) {
                    iCoerceAtMost = RangesKt.coerceAtMost(iNxk, i3);
                    intRef.element -= (iCoerceAtMost - i5) / 2;
                } else {
                    iCoerceAtMost = i5;
                }
                arrayList.add(measurable.dR0(ConstraintsKt.O(j2, Constraints.INSTANCE.t(iCoerceAtMost, iAz))));
                i2++;
            }
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i2 < size4) {
                arrayList.add(((Measurable) list.get(i2)).dR0(ConstraintsKt.O(j2, Constraints.INSTANCE.nr(iAz))));
                i2++;
            }
        }
        return MeasureScope.ER(measureScope, iQie, iAz, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$5
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
                int i8 = intRef.element;
                List list2 = arrayList;
                int size5 = list2.size();
                int i9 = 0;
                int width = i8;
                while (i9 < size5) {
                    Placeable placeable = (Placeable) list2.get(i9);
                    Placeable.PlacementScope placementScope2 = placementScope;
                    Placeable.PlacementScope.az(placementScope2, placeable, width, 0, 0.0f, 4, null);
                    width += placeable.getWidth();
                    i9++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }
}
