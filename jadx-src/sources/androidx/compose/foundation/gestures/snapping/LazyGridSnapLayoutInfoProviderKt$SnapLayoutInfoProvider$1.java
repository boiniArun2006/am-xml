package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "", "velocity", "decayOffset", "rl", "(FF)F", c.f62177j, "(F)F", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "nr", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfo", "", "t", "()I", "averageItemSize", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n34#2,6:145\n1#3:151\n*S KotlinDebug\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n*L\n69#1:145,6\n*E\n"})
public final class LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 implements SnapLayoutInfoProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ LazyGridState f17293n;
    final /* synthetic */ SnapPosition rl;

    private final LazyGridLayoutInfo nr() {
        return this.f17293n.WPU();
    }

    private final int t() {
        LazyGridLayoutInfo lazyGridLayoutInfoNr = nr();
        int iT = 0;
        if (lazyGridLayoutInfoNr.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int size = lazyGridLayoutInfoNr.getVisibleItemsInfo().size();
        Iterator it = lazyGridLayoutInfoNr.getVisibleItemsInfo().iterator();
        while (it.hasNext()) {
            iT += LazyGridSnapLayoutInfoProviderKt.t((LazyGridItemInfo) it.next(), lazyGridLayoutInfoNr.getOrientation());
        }
        return iT / size;
    }

    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
    public float n(float velocity) {
        List visibleItemsInfo = nr().getVisibleItemsInfo();
        SnapPosition snapPosition = this.rl;
        int size = visibleItemsInfo.size();
        float f3 = Float.NEGATIVE_INFINITY;
        float f4 = Float.POSITIVE_INFINITY;
        for (int i2 = 0; i2 < size; i2++) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) visibleItemsInfo.get(i2);
            float fN = SnapPositionKt.n(LazyGridSnapLayoutInfoProviderKt.n(nr()), nr().nr(), nr().getAfterContentPadding(), LazyGridSnapLayoutInfoProviderKt.t(lazyGridItemInfo, nr().getOrientation()), LazyGridSnapLayoutInfoProviderKt.rl(lazyGridItemInfo, nr().getOrientation()), lazyGridItemInfo.getIndex(), snapPosition, nr().getTotalItemsCount());
            if (fN <= 0.0f && fN > f3) {
                f3 = fN;
            }
            if (fN >= 0.0f && fN < f4) {
                f4 = fN;
            }
        }
        return SnapFlingBehaviorKt.mUb(LazyListSnapLayoutInfoProviderKt.t(this.f17293n.Ik(), velocity), f3, f4);
    }

    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
    public float rl(float velocity, float decayOffset) {
        return RangesKt.coerceAtLeast(Math.abs(decayOffset) - t(), 0.0f) * Math.signum(decayOffset);
    }
}
