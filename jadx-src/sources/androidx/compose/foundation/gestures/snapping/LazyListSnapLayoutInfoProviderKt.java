package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", c.f62177j, "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "O", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/ui/unit/Density;", "", "velocity", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "t", "(Landroidx/compose/ui/unit/Density;F)I", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "", "nr", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "singleAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,145:1\n1247#2,6:146\n59#3:152\n54#3:154\n90#4:153\n85#4:155\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n118#1:146,6\n123#1:152\n123#1:154\n123#1:153\n123#1:155\n*E\n"})
public final class LazyListSnapLayoutInfoProviderKt {
    public static final FlingBehavior O(LazyListState lazyListState, SnapPosition snapPosition, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            snapPosition = SnapPosition.Center.f17333n;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-338621290, i2, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.p5(lazyListState)) || (i2 & 6) == 4;
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = n(lazyListState, snapPosition);
            composer.o(objIF);
        }
        TargetedFlingBehavior targetedFlingBehaviorTy = SnapFlingBehaviorKt.ty((SnapLayoutInfoProvider) objIF, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return targetedFlingBehaviorTy;
    }

    public static final SnapLayoutInfoProvider n(final LazyListState lazyListState, final SnapPosition snapPosition) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final LazyListLayoutInfo nr() {
                return lazyListState.aYN();
            }

            private final int t() {
                LazyListLayoutInfo lazyListLayoutInfoNr = nr();
                int size = 0;
                if (lazyListLayoutInfoNr.getVisibleItemsInfo().isEmpty()) {
                    return 0;
                }
                int size2 = lazyListLayoutInfoNr.getVisibleItemsInfo().size();
                Iterator it = lazyListLayoutInfoNr.getVisibleItemsInfo().iterator();
                while (it.hasNext()) {
                    size += ((LazyListItemInfo) it.next()).getSize();
                }
                return size / size2;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float n(float velocity) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem;
                List visibleItemsInfo = nr().getVisibleItemsInfo();
                SnapPosition snapPosition2 = snapPosition;
                int size = visibleItemsInfo.size();
                float f3 = Float.NEGATIVE_INFINITY;
                float f4 = Float.POSITIVE_INFINITY;
                for (int i2 = 0; i2 < size; i2++) {
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) visibleItemsInfo.get(i2);
                    if (lazyListItemInfo instanceof LazyLayoutMeasuredItem) {
                        lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) lazyListItemInfo;
                    } else {
                        lazyLayoutMeasuredItem = null;
                    }
                    if (lazyLayoutMeasuredItem == null || !lazyLayoutMeasuredItem.getNonScrollableItem()) {
                        float fN = SnapPositionKt.n(LazyListSnapLayoutInfoProviderKt.nr(nr()), nr().nr(), nr().getAfterContentPadding(), lazyListItemInfo.getSize(), lazyListItemInfo.getOffset(), lazyListItemInfo.getIndex(), snapPosition2, nr().getTotalItemsCount());
                        if (fN <= 0.0f && fN > f3) {
                            f3 = fN;
                        }
                        if (fN >= 0.0f && fN < f4) {
                            f4 = fN;
                        }
                    }
                }
                return SnapFlingBehaviorKt.mUb(LazyListSnapLayoutInfoProviderKt.t(lazyListState.r(), velocity), f3, f4);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float rl(float velocity, float decayOffset) {
                return RangesKt.coerceAtLeast(Math.abs(decayOffset) - t(), 0.0f) * Math.signum(decayOffset);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider rl(LazyListState lazyListState, SnapPosition snapPosition, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            snapPosition = SnapPosition.Center.f17333n;
        }
        return n(lazyListState, snapPosition);
    }

    public static final int nr(LazyListLayoutInfo lazyListLayoutInfo) {
        long jRl;
        if (lazyListLayoutInfo.getOrientation() == Orientation.f16969n) {
            jRl = lazyListLayoutInfo.rl() & 4294967295L;
        } else {
            jRl = lazyListLayoutInfo.rl() >> 32;
        }
        return (int) jRl;
    }

    public static final int t(Density density, float f3) {
        if (Math.abs(f3) < density.l(SnapFlingBehaviorKt.az())) {
            return FinalSnappingItem.INSTANCE.n();
        }
        if (f3 > 0.0f) {
            return FinalSnappingItem.INSTANCE.rl();
        }
        return FinalSnappingItem.INSTANCE.t();
    }
}
