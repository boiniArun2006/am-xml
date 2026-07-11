package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/pager/PagerBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "Landroidx/compose/foundation/pager/PagerState;", "state", "", "beyondViewportPageCount", "<init>", "(Landroidx/compose/foundation/pager/PagerState;I)V", "rl", "()I", c.f62177j, "Landroidx/compose/foundation/pager/PagerState;", "I", "itemCount", "", "t", "()Z", "hasVisibleItems", "nr", "firstPlacedIndex", "O", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PagerBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final PagerState state;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int beyondViewportPageCount;

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int n() {
        return this.state.T();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int nr() {
        return Math.max(0, this.state.getFirstVisiblePage() - this.beyondViewportPageCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int rl() {
        if (this.state.iF().getVisiblePagesInfo().size() == 0) {
            return 0;
        }
        int iN = PagerLayoutInfoKt.n(this.state.iF());
        int pageSize = this.state.iF().getPageSize() + this.state.iF().getPageSpacing();
        if (pageSize == 0) {
            return 1;
        }
        return RangesKt.coerceAtLeast(iN / pageSize, 1);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean t() {
        return !this.state.iF().getVisiblePagesInfo().isEmpty();
    }

    public PagerBeyondBoundsState(PagerState pagerState, int i2) {
        this.state = pagerState;
        this.beyondViewportPageCount = i2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int O() {
        return Math.min(n() - 1, ((PageInfo) CollectionsKt.last(this.state.iF().getVisiblePagesInfo())).getIndex() + this.beyondViewportPageCount);
    }
}
