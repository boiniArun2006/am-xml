package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.FinalSnappingItem;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "pagerState", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "pagerSnapDistance", "Lkotlin/Function3;", "", "calculateFinalSnappingBound", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", c.f62177j, "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "velocity", "", "O", "(Landroidx/compose/foundation/pager/PagerState;F)Z", "nr", "(Landroidx/compose/foundation/pager/PagerState;)F", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", "t", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/unit/LayoutDirection;FFFF)F", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n222#1,4:313\n222#1,4:318\n222#1,4:322\n222#1,4:326\n222#1,4:330\n65#2:307\n69#2:310\n60#3:308\n70#3:311\n22#4:309\n22#4:312\n1#5:317\n*S KotlinDebug\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n*L\n250#1:313,4\n272#1:318,4\n282#1:322,4\n288#1:326,4\n292#1:330,4\n216#1:307\n218#1:310\n216#1:308\n218#1:311\n216#1:309\n218#1:312\n*E\n"})
public final class PagerSnapLayoutInfoProviderKt {
    public static final SnapLayoutInfoProvider n(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final Function3 function3) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            public final boolean nr(float f3) {
                return (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) ? false : true;
            }

            private final Pair O(SnapPosition snapPosition, float velocity) {
                float f3;
                List visiblePagesInfo = t().getVisiblePagesInfo();
                PagerState pagerState2 = pagerState;
                int size = visiblePagesInfo.size();
                int i2 = 0;
                float f4 = Float.NEGATIVE_INFINITY;
                float f5 = Float.POSITIVE_INFINITY;
                while (true) {
                    f3 = 0.0f;
                    if (i2 >= size) {
                        break;
                    }
                    PageInfo pageInfo = (PageInfo) visiblePagesInfo.get(i2);
                    float fN = SnapPositionKt.n(PagerLayoutInfoKt.n(t()), t().nr(), t().getAfterContentPadding(), t().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), snapPosition, pagerState2.T());
                    if (fN <= 0.0f && fN > f4) {
                        f4 = fN;
                    }
                    if (fN >= 0.0f && fN < f5) {
                        f5 = fN;
                    }
                    i2++;
                }
                if (f4 == Float.NEGATIVE_INFINITY) {
                    f4 = f5;
                }
                if (f5 == Float.POSITIVE_INFINITY) {
                    f5 = f4;
                }
                if (!pagerState.J2()) {
                    if (PagerSnapLayoutInfoProviderKt.O(pagerState, velocity)) {
                        f4 = 0.0f;
                        f5 = 0.0f;
                    } else {
                        f5 = 0.0f;
                    }
                }
                if (pagerState.nr()) {
                    f3 = f4;
                } else if (!PagerSnapLayoutInfoProviderKt.O(pagerState, velocity)) {
                    f5 = 0.0f;
                }
                return TuplesKt.to(Float.valueOf(f3), Float.valueOf(f5));
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float n(float velocity) {
                Pair pairO = O(pagerState.iF().getSnapPosition(), velocity);
                float fFloatValue = ((Number) pairO.component1()).floatValue();
                float fFloatValue2 = ((Number) pairO.component2()).floatValue();
                float fFloatValue3 = ((Number) function3.invoke(Float.valueOf(velocity), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
                if (!(fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f)) {
                    InlineClassHelperKt.t("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
                }
                if (nr(fFloatValue3)) {
                    return fFloatValue3;
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float rl(float velocity, float decayOffset) {
                int iN = pagerState.N() + pagerState.s7N();
                if (iN == 0) {
                    return 0.0f;
                }
                int firstVisiblePage = velocity < 0.0f ? pagerState.getFirstVisiblePage() + 1 : pagerState.getFirstVisiblePage();
                int iCoerceAtLeast = RangesKt.coerceAtLeast(Math.abs((RangesKt.coerceIn(pagerSnapDistance.n(firstVisiblePage, RangesKt.coerceIn(((int) (decayOffset / iN)) + firstVisiblePage, 0, pagerState.T()), velocity, pagerState.N(), pagerState.s7N()), 0, pagerState.T()) - firstVisiblePage) * iN) - iN, 0);
                return iCoerceAtLeast == 0 ? iCoerceAtLeast : iCoerceAtLeast * Math.signum(velocity);
            }

            public final PagerLayoutInfo t() {
                return pagerState.iF();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(PagerState pagerState, float f3) {
        float fNr;
        boolean z2;
        boolean reverseLayout = pagerState.iF().getReverseLayout();
        if (pagerState.E()) {
            fNr = -f3;
        } else {
            fNr = nr(pagerState);
        }
        if (fNr > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z2 || !reverseLayout) && (z2 || reverseLayout)) {
            return false;
        }
        return true;
    }

    private static final float nr(PagerState pagerState) {
        if (pagerState.iF().getOrientation() == Orientation.f16970t) {
            return Float.intBitsToFloat((int) (pagerState.p5() >> 32));
        }
        return Float.intBitsToFloat((int) (pagerState.p5() & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float t(PagerState pagerState, LayoutDirection layoutDirection, float f3, float f4, float f5, float f6) {
        float fNr;
        boolean zO = O(pagerState, f4);
        if (pagerState.iF().getOrientation() != Orientation.f16969n && layoutDirection != LayoutDirection.f34160n) {
            zO = !zO;
        }
        int pageSize = pagerState.iF().getPageSize();
        if (pageSize == 0) {
            fNr = 0.0f;
        } else {
            fNr = nr(pagerState) / pageSize;
        }
        float f7 = fNr - ((int) fNr);
        int iT = LazyListSnapLayoutInfoProviderKt.t(pagerState.getDensity(), f4);
        FinalSnappingItem.Companion companion = FinalSnappingItem.INSTANCE;
        if (FinalSnappingItem.J2(iT, companion.n())) {
            if (Math.abs(f7) <= f3 ? Math.abs(fNr) < Math.abs(pagerState.rV9()) ? Math.abs(f5) >= Math.abs(f6) : !zO : zO) {
                return f6;
            }
            return f5;
        }
        if (!FinalSnappingItem.J2(iT, companion.rl())) {
            if (!FinalSnappingItem.J2(iT, companion.t())) {
                return 0.0f;
            }
        }
        return f6;
    }
}
