package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\t¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "", "beyondBoundsItemCount", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;I)V", "rl", "()I", c.f62177j, "Landroidx/compose/foundation/lazy/LazyListState;", "getState", "()Landroidx/compose/foundation/lazy/LazyListState;", "I", "getBeyondBoundsItemCount", "itemCount", "", "t", "()Z", "hasVisibleItems", "nr", "firstPlacedIndex", "O", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyListBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyListState state;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int beyondBoundsItemCount;

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int n() {
        return this.state.aYN().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int nr() {
        return Math.max(0, this.state.o() - this.beyondBoundsItemCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int rl() {
        if (this.state.aYN().getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int iNr = LazyListSnapLayoutInfoProviderKt.nr(this.state.aYN());
        int iN = LazyListLayoutInfoKt.n(this.state.aYN());
        if (iN == 0) {
            return 1;
        }
        return RangesKt.coerceAtLeast(iNr / iN, 1);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean t() {
        return !this.state.aYN().getVisibleItemsInfo().isEmpty();
    }

    public LazyListBeyondBoundsState(LazyListState lazyListState, int i2) {
        this.state = lazyListState;
        this.beyondBoundsItemCount = i2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int O() {
        return Math.min(n() - 1, ((LazyListItemInfo) CollectionsKt.last(this.state.aYN().getVisibleItemsInfo())).getIndex() + this.beyondBoundsItemCount);
    }
}
