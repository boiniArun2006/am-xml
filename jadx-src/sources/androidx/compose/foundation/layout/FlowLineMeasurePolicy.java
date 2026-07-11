package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJi\u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010#\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "Landroidx/compose/ui/layout/Placeable;", "", "KN", "(Landroidx/compose/ui/layout/Placeable;)I", "gh", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "Landroidx/compose/ui/unit/Constraints;", c.f62177j, "(IIIIZ)J", "", "placeables", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "beforeCrossAxisAlignmentLine", "", "mainAxisPositions", "mainAxisLayoutSize", "crossAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Landroidx/compose/ui/layout/MeasureResult;", "J2", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "placeable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "ck", "(Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/unit/LayoutDirection;I)I", "childrenMainAxisSize", "", "nr", "(I[I[ILandroidx/compose/ui/layout/MeasureScope;)V", "t", "()Z", "isHorizontal", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "ty", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "HI", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "qie", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {
    /* JADX INFO: renamed from: HI */
    Arrangement.Vertical getVerticalArrangement();

    /* JADX INFO: renamed from: qie */
    CrossAxisAlignment getCrossAxisAlignment();

    /* JADX INFO: renamed from: t */
    boolean getIsHorizontal();

    /* JADX INFO: renamed from: ty */
    Arrangement.Horizontal getHorizontalArrangement();

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default MeasureResult J2(final Placeable[] placeables, MeasureScope measureScope, final int beforeCrossAxisAlignmentLine, final int[] mainAxisPositions, int mainAxisLayoutSize, final int crossAxisLayoutSize, final int[] crossAxisOffset, final int currentLineIndex, final int startIndex, final int endIndex) {
        int i2;
        int i3;
        LayoutDirection layoutDirection;
        if (getIsHorizontal()) {
            i3 = mainAxisLayoutSize;
            i2 = crossAxisLayoutSize;
        } else {
            i2 = mainAxisLayoutSize;
            i3 = crossAxisLayoutSize;
        }
        if (getIsHorizontal()) {
            layoutDirection = LayoutDirection.f34160n;
        } else {
            layoutDirection = measureScope.getLayoutDirection();
        }
        final LayoutDirection layoutDirection2 = layoutDirection;
        return MeasureScope.ER(measureScope, i3, i2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLineMeasurePolicy$placeHelper$1$1
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
                Placeable.PlacementScope placementScope2;
                int[] iArr = crossAxisOffset;
                int i5 = iArr != null ? iArr[currentLineIndex] : 0;
                int i7 = startIndex;
                while (i7 < endIndex) {
                    Placeable placeable = placeables[i7];
                    Intrinsics.checkNotNull(placeable);
                    int iCk = this.ck(placeable, crossAxisLayoutSize, layoutDirection2, beforeCrossAxisAlignmentLine) + i5;
                    if (this.getIsHorizontal()) {
                        placementScope2 = placementScope;
                        Placeable.PlacementScope.xMQ(placementScope2, placeable, mainAxisPositions[i7 - startIndex], iCk, 0.0f, 4, null);
                    } else {
                        placementScope2 = placementScope;
                        Placeable.PlacementScope.xMQ(placementScope2, placeable, iCk, mainAxisPositions[i7 - startIndex], 0.0f, 4, null);
                    }
                    i7++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int KN(Placeable placeable) {
        if (getIsHorizontal()) {
            return placeable.mYa();
        }
        return placeable.n1();
    }

    default int ck(Placeable placeable, int crossAxisLayoutSize, LayoutDirection layoutDirection, int beforeCrossAxisAlignmentLine) {
        CrossAxisAlignment crossAxisAlignmentQie;
        RowColumnParentData rowColumnParentDataNr = RowColumnImplKt.nr(placeable);
        if (rowColumnParentDataNr == null || (crossAxisAlignmentQie = rowColumnParentDataNr.getCrossAxisAlignment()) == null) {
            crossAxisAlignmentQie = getCrossAxisAlignment();
        }
        return crossAxisAlignmentQie.n(crossAxisLayoutSize - gh(placeable), layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int gh(Placeable placeable) {
        if (getIsHorizontal()) {
            return placeable.n1();
        }
        return placeable.mYa();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default long n(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        if (getIsHorizontal()) {
            return RowKt.n(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
        }
        return ColumnKt.rl(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default void nr(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, MeasureScope measureScope) {
        if (getIsHorizontal()) {
            getHorizontalArrangement().t(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
        } else {
            getVerticalArrangement().rl(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
        }
    }
}
