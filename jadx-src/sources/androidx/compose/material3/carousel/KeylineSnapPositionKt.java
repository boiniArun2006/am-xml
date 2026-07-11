package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.snapping.SnapPosition;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material3/carousel/Strategy;", "strategy", "", "itemIndex", "itemCount", "rl", "(Landroidx/compose/material3/carousel/Strategy;II)I", "Landroidx/compose/material3/carousel/CarouselPageSize;", "pageSize", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", c.f62177j, "(Landroidx/compose/material3/carousel/CarouselPageSize;)Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KeylineSnapPositionKt {
    public static final SnapPosition n(final CarouselPageSize carouselPageSize) {
        return new SnapPosition() { // from class: androidx.compose.material3.carousel.KeylineSnapPositionKt$KeylineSnapPosition$1
            @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
            public int n(int layoutSize, int itemSize, int beforeContentPadding, int afterContentPadding, int itemIndex, int itemCount) {
                return KeylineSnapPositionKt.rl(carouselPageSize.rl(), itemIndex, itemCount);
            }
        };
    }

    public static final int rl(Strategy strategy, int i2, int i3) {
        if (!strategy.getIsValid()) {
            return 0;
        }
        int lastFocalIndex = strategy.getDefaultKeylines().getLastFocalIndex() - strategy.getDefaultKeylines().getFirstFocalIndex();
        int size = strategy.getStartKeylineSteps().size() + lastFocalIndex;
        int size2 = strategy.getEndKeylineSteps().size() + lastFocalIndex;
        int iRoundToInt = MathKt.roundToInt(strategy.getDefaultKeylines().KN().getUnadjustedOffset() - (strategy.O() / 2.0f));
        if (i2 < size) {
            iRoundToInt = MathKt.roundToInt(((KeylineList) strategy.getStartKeylineSteps().get(Math.min(strategy.getStartKeylineSteps().size() - 1, Math.max(0, (size - 1) - i2)))).KN().getUnadjustedOffset() - (strategy.O() / 2.0f));
        }
        if (i3 > lastFocalIndex + 1 && i2 >= i3 - size2) {
            return MathKt.roundToInt(((KeylineList) strategy.getEndKeylineSteps().get(Math.min(strategy.getEndKeylineSteps().size() - 1, Math.max(0, (i2 - i3) + size2)))).KN().getUnadjustedOffset() - (strategy.O() / 2.0f));
        }
        return iRoundToInt;
    }
}
