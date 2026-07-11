package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u0000 \u00132\u00020\u0001:\u0001\u0015J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJU\u0010\u0013\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "", "", "firstVisibleItemIndex", "lastVisibleItemIndex", "Landroidx/collection/IntList;", "stickyItems", "rl", "(IILandroidx/collection/IntList;)Landroidx/collection/IntList;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "visibleStickyItems", "itemIndex", "itemSize", "itemOffset", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", c.f62177j, "(Ljava/util/List;IIIIIII)I", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StickyItemsPlacement {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f18599n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "rl", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", c.f62177j, "()Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "StickToTopPlacement", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f18599n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final StickyItemsPlacement StickToTopPlacement = new StickyItemsPlacement() { // from class: androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion$StickToTopPlacement$1
            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public IntList rl(int firstVisibleItemIndex, int lastVisibleItemIndex, IntList stickyItems) {
                int i2;
                if (lastVisibleItemIndex - firstVisibleItemIndex < 0 || (i2 = stickyItems._size) == 0) {
                    return IntListKt.n();
                }
                IntRange intRangeUntil = RangesKt.until(0, i2);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                int iO = -1;
                if (first <= last) {
                    while (stickyItems.O(first) <= firstVisibleItemIndex) {
                        iO = stickyItems.O(first);
                        if (first == last) {
                            break;
                        }
                        first++;
                    }
                }
                return iO == -1 ? IntListKt.n() : IntListKt.rl(iO);
            }

            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public int n(List visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight) {
                Object obj;
                int iT;
                int iMax;
                int size = visibleStickyItems.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = visibleStickyItems.get(i2);
                        if (((LazyLayoutMeasuredItem) obj).getIndex() != itemIndex) {
                            break;
                        }
                        i2++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) obj;
                if (lazyLayoutMeasuredItem != null) {
                    iT = LazyLayoutStickyItemsKt.t(lazyLayoutMeasuredItem);
                } else {
                    iT = Integer.MIN_VALUE;
                }
                if (itemOffset == Integer.MIN_VALUE) {
                    iMax = -beforeContentPadding;
                } else {
                    iMax = Math.max(-beforeContentPadding, itemOffset);
                }
                if (iT != Integer.MIN_VALUE) {
                    return Math.min(iMax, iT - itemSize);
                }
                return iMax;
            }
        };

        public final StickyItemsPlacement n() {
            return StickToTopPlacement;
        }

        private Companion() {
        }
    }

    int n(List visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight);

    IntList rl(int firstVisibleItemIndex, int lastVisibleItemIndex, IntList stickyItems);
}
